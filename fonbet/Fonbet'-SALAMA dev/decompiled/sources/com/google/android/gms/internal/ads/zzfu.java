package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class zzfu extends zzfq {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfu(Context context) {
        super(false);
        this.zza = context.getContentResolver();
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
                throw new zzft(e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i9 = zzen.zza;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
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
        int i7;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri normalizeScheme = zzgcVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzgcVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i7 = 2000;
                    try {
                        throw new zzft(new IOException("Could not open file descriptor for: ".concat(String.valueOf(normalizeScheme))), 2000);
                    } catch (IOException e7) {
                        e = e7;
                        if (true == (e instanceof FileNotFoundException)) {
                            i7 = 2005;
                        }
                        throw new zzft(e, i7);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgcVar.zze > length) {
                    throw new zzft(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(zzgcVar.zze + startOffset) - startOffset;
                if (skip != zzgcVar.zze) {
                    throw new zzft(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.zze = j;
                        if (j < 0) {
                            throw new zzft(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.zze = j;
                    if (j < 0) {
                        throw new zzft(null, 2008);
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
            } catch (zzft e8) {
                throw e8;
            }
        } catch (IOException e9) {
            e = e9;
            i7 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
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
                        throw new zzft(e7, 2000);
                    }
                } catch (IOException e8) {
                    throw new zzft(e8, 2000);
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
                    throw new zzft(e9, 2000);
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
