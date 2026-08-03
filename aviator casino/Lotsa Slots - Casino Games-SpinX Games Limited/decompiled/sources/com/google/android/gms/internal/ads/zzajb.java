package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajb {
    private final java.io.ByteArrayOutputStream zza;
    private final java.io.DataOutputStream zzb;

    public zzajb() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new java.io.DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(com.google.android.gms.internal.ads.zzaja zzajaVar) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.zza;
        byteArrayOutputStream.reset();
        try {
            java.io.DataOutputStream dataOutputStream = this.zzb;
            zzb(dataOutputStream, zzajaVar.zza);
            zzb(dataOutputStream, zzajaVar.zzb);
            dataOutputStream.writeLong(zzajaVar.zzc);
            dataOutputStream.writeLong(zzajaVar.zzd);
            dataOutputStream.write(zzajaVar.zze);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
