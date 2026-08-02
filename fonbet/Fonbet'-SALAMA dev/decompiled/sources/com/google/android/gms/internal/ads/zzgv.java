package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import e1.k;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
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

    private static int zzk(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgu("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgc zzgcVar) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzgcVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzgu(k.d(pathSegments.size(), "rawresource:// URI must have exactly one path element, found "));
            }
            identifier = zzk(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new zzgu(AbstractC0486a1.h("Unsupported URI scheme (", normalizeScheme.getScheme(), "). Only android.resource is supported."), null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
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
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzgu("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e8) {
            throw new zzgu(null, e8, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
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
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgu("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j3 = this.zze;
        if (j3 != -1) {
            this.zze = j3 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        long j;
        this.zzb = zzgcVar;
        zzi(zzgcVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzgcVar);
        this.zzc = zzl;
        long length = zzl.getLength();
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
        long skip = fileInputStream.skip(zzgcVar.zze + startOffset) - startOffset;
        if (skip != zzgcVar.zze) {
            throw new zzgu(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.zze = j;
                if (j < 0) {
                    throw new zzgu(null, null, 2008);
                }
            }
        } else {
            j = length - skip;
            this.zze = j;
            if (j < 0) {
                throw new zzfy(2008);
            }
        }
        long j3 = zzgcVar.zzf;
        if (j3 != -1) {
            if (j != -1) {
                j3 = Math.min(j, j3);
            }
            this.zze = j3;
        }
        this.zzf = true;
        zzj(zzgcVar);
        long j7 = zzgcVar.zzf;
        return j7 != -1 ? j7 : this.zze;
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
