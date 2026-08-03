package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhm extends com.google.android.gms.internal.ads.zzhh {
    private final android.content.ContentResolver zza;
    private android.net.Uri zzb;
    private android.content.res.AssetFileDescriptor zzc;
    private java.io.FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhm(android.content.Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzhl {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzhl(e, 2000);
            }
        }
        java.io.FileInputStream fileInputStream = this.zzd;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.io.FileInputStream fileInputStream2 = fileInputStream;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzhl {
        int i;
        android.content.res.AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                android.net.Uri normalizeScheme = zzhtVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzf(zzhtVar);
                if (java.util.Objects.equals(normalizeScheme.getScheme(), "content")) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    java.lang.String valueOf = java.lang.String.valueOf(normalizeScheme);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    i = 2000;
                    try {
                        throw new com.google.android.gms.internal.ads.zzhl(new java.io.IOException(sb.toString()), 2000);
                    } catch (java.io.IOException e) {
                        e = e;
                        if (true == (e instanceof java.io.FileNotFoundException)) {
                            i = 2005;
                        }
                        throw new com.google.android.gms.internal.ads.zzhl(e, i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzhtVar.zze > length) {
                    throw new com.google.android.gms.internal.ads.zzhl(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long j2 = zzhtVar.zze;
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new com.google.android.gms.internal.ads.zzhl(null, 2008);
                }
                if (length == -1) {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.zze = j;
                        if (j < 0) {
                            throw new com.google.android.gms.internal.ads.zzhl(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.zze = j;
                    if (j < 0) {
                        throw new com.google.android.gms.internal.ads.zzhl(null, 2008);
                    }
                }
                long j3 = zzhtVar.zzf;
                if (j3 != -1) {
                    this.zze = j == -1 ? j3 : java.lang.Math.min(j, j3);
                }
                this.zzf = true;
                zzg(zzhtVar);
                return j3 != -1 ? j3 : this.zze;
            } catch (java.io.IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (com.google.android.gms.internal.ads.zzhl e3) {
            throw e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzhl {
        this.zzb = null;
        try {
            try {
                try {
                    java.io.FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (java.io.IOException e) {
                        throw new com.google.android.gms.internal.ads.zzhl(e, 2000);
                    }
                } catch (java.io.IOException e2) {
                    throw new com.google.android.gms.internal.ads.zzhl(e2, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.zzd = null;
            try {
                android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th2;
            } catch (java.io.IOException e3) {
                throw new com.google.android.gms.internal.ads.zzhl(e3, 2000);
            }
        }
    }
}
