package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgv extends zzfq {
    private final Context zza;
    private zzgc zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgv(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    private static int zzk(String str) throws zzgu {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgu("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgc zzgcVar) throws zzgu {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = zzgcVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzgu(k.d(pathSegments.size(), "rawresource:// URI must have exactly one path element, found "));
            }
            identifier = zzk(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new zzgu(AbstractC0486a1.h("Unsupported URI scheme (", uriNormalizeScheme.getScheme(), "). Only android.resource is supported."), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new zzgu("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(k.f(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzgu("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzgu("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e8) {
            throw new zzgu(null, e8, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) throws zzgu {
        if (i8 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new zzgu(null, e7, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i9 = zzen.zza;
        int i10 = inputStream.read(bArr, i7, i8);
        if (i10 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgu("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j3 = this.zze;
        if (j3 != -1) {
            this.zze = j3 - ((long) i10);
        }
        zzg(i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzgu {
        long size;
        this.zzb = zzgcVar;
        zzi(zzgcVar);
        AssetFileDescriptor assetFileDescriptorZzl = zzl(this.zza, zzgcVar);
        this.zzc = assetFileDescriptorZzl;
        long length = assetFileDescriptorZzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzgcVar.zze > length) {
                    throw new zzgu(null, null, 2008);
                }
            } catch (zzgu e7) {
                throw e7;
            } catch (IOException e8) {
                throw new zzgu(null, e8, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long jSkip = fileInputStream.skip(zzgcVar.zze + startOffset) - startOffset;
        if (jSkip != zzgcVar.zze) {
            throw new zzgu(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new zzgu(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.zze = size;
            if (size < 0) {
                throw new zzfy(2008);
            }
        }
        long jMin = zzgcVar.zzf;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.zze = jMin;
        }
        this.zzf = true;
        zzj(zzgcVar);
        long j = zzgcVar.zzf;
        return j != -1 ? j : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        zzgc zzgcVar = this.zzb;
        if (zzgcVar != null) {
            return zzgcVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e7) {
                        throw new zzgu(null, e7, 2000);
                    }
                } catch (IOException e8) {
                    throw new zzgu(null, e8, 2000);
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new zzgu(null, e9, 2000);
                }
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzh();
            }
            throw th2;
        }
    }
}
