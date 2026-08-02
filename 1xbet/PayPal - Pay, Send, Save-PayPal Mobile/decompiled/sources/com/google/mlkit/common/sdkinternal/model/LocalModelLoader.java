package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class LocalModelLoader {
    private java.nio.MappedByteBuffer zza;
    private final android.content.Context zzb;
    private final com.google.mlkit.common.model.LocalModel zzc;

    public java.nio.MappedByteBuffer load() throws com.google.mlkit.common.MlKitException {
        java.nio.channels.FileChannel channel;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb, "Context can not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc, "Model source can not be null");
        java.nio.MappedByteBuffer mappedByteBuffer = this.zza;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        com.google.mlkit.common.model.LocalModel localModel = this.zzc;
        java.lang.String absoluteFilePath = localModel.getAbsoluteFilePath();
        java.lang.String assetFilePath = localModel.getAssetFilePath();
        android.net.Uri uri = localModel.getUri();
        if (absoluteFilePath != null) {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(absoluteFilePath, "r");
                try {
                    java.nio.channels.FileChannel channel2 = randomAccessFile.getChannel();
                    try {
                        this.zza = channel2.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel2.size());
                        if (channel2 != null) {
                            channel2.close();
                        }
                        randomAccessFile.close();
                    } finally {
                    }
                } finally {
                }
            } catch (java.io.IOException e) {
                throw new com.google.mlkit.common.MlKitException("Can not open the local file: ".concat(java.lang.String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e);
            }
        } else if (assetFilePath != null) {
            try {
                android.content.res.AssetFileDescriptor openFd = this.zzb.getAssets().openFd(assetFilePath);
                try {
                    channel = new java.io.FileInputStream(openFd.getFileDescriptor()).getChannel();
                    try {
                        this.zza = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                        if (channel != null) {
                            channel.close();
                        }
                        if (openFd != null) {
                            openFd.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (java.io.IOException e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not load the file from asset: ");
                sb.append(assetFilePath);
                sb.append(". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression");
                throw new com.google.mlkit.common.MlKitException(sb.toString(), 14, e2);
            }
        } else {
            if (uri == null) {
                throw new com.google.mlkit.common.MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
            }
            try {
                android.content.res.AssetFileDescriptor zza = com.google.android.gms.internal.mlkit_common.zzi.zza(this.zzb, uri, "r");
                try {
                    channel = zza.createInputStream().getChannel();
                    try {
                        this.zza = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, zza.getStartOffset(), zza.getLength());
                        if (channel != null) {
                            channel.close();
                        }
                        if (zza != null) {
                            zza.close();
                        }
                    } finally {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (java.lang.Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    }
                } finally {
                }
            } catch (java.io.IOException e3) {
                throw new com.google.mlkit.common.MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e3);
            }
        }
        return this.zza;
    }

    public com.google.mlkit.common.model.LocalModel getLocalModel() {
        return this.zzc;
    }

    public LocalModelLoader(android.content.Context context, com.google.mlkit.common.model.LocalModel localModel) {
        this.zzb = context;
        this.zzc = localModel;
    }
}
