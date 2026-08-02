package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzj implements com.google.android.play.core.splitcompat.zzl {
    final /* synthetic */ java.util.Set zza;
    final /* synthetic */ com.google.android.play.core.splitcompat.zzt zzb;
    final /* synthetic */ java.util.zip.ZipFile zzc;

    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(com.google.android.play.core.splitcompat.zzm zzmVar, java.io.File file, boolean z) throws java.io.IOException {
        this.zza.add(file);
        if (z) {
            return;
        }
        new java.lang.Object[]{this.zzb.zzb(), zzmVar.zza, this.zzb.zza().getAbsolutePath(), zzmVar.zzb.getName(), file.getAbsolutePath()};
        java.util.zip.ZipFile zipFile = this.zzc;
        java.util.zip.ZipEntry zipEntry = zzmVar.zzb;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        java.io.InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                com.google.android.play.core.splitcompat.zze.zzm(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    zzj(com.google.android.play.core.splitcompat.zzn zznVar, java.util.Set set, com.google.android.play.core.splitcompat.zzt zztVar, java.util.zip.ZipFile zipFile) {
        this.zza = set;
        this.zzb = zztVar;
        this.zzc = zipFile;
    }
}
