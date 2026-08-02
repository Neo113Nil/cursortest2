package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhc {
    static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("US-ASCII");
    static final java.nio.charset.Charset zzb = java.nio.charset.Charset.forName("UTF-8");
    static final java.nio.charset.Charset zzc = java.nio.charset.Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final java.nio.ByteBuffer zze;
    public static final com.google.android.gms.internal.fido.zzhb zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.fido.zzhb.zza;
        com.google.android.gms.internal.fido.zzgz zzgzVar = new com.google.android.gms.internal.fido.zzgz(bArr, 0, 0, false, null);
        try {
            zzgzVar.zza(0);
            zzf = zzgzVar;
        } catch (com.google.android.gms.internal.fido.zzhd e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
