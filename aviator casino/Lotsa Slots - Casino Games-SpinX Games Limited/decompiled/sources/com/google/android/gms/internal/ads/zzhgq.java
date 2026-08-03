package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgq implements com.google.android.gms.internal.ads.zzhdi {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final java.util.Set zze;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzhdi zzd;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = java.util.Collections.unmodifiableSet(hashSet);
    }

    @java.lang.Deprecated
    zzhgq(com.google.android.gms.internal.ads.zzhst zzhstVar, com.google.android.gms.internal.ads.zzhdi zzhdiVar) throws java.security.GeneralSecurityException {
        if (zze.contains(zzhstVar.zza())) {
            this.zzc = zzhstVar.zza();
            com.google.android.gms.internal.ads.zzhss zzg = com.google.android.gms.internal.ads.zzhst.zzg(zzhstVar);
            zzg.zzc(com.google.android.gms.internal.ads.zzhtm.RAW);
            com.google.android.gms.internal.ads.zzhen.zzb(((com.google.android.gms.internal.ads.zzhst) zzg.zzbu()).zzaN());
            this.zzd = zzhdiVar;
            return;
        }
        java.lang.String zza2 = zzhstVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 67);
        sb.append("Unsupported DEK key type: ");
        sb.append(zza2);
        sb.append(". Only Tink AEAD key types are supported.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new java.security.GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zzd.zza(bArr3, zzb);
            java.lang.String str = this.zzc;
            com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
            return ((com.google.android.gms.internal.ads.zzhdi) com.google.android.gms.internal.ads.zzhmo.zza().zzd(com.google.android.gms.internal.ads.zzhmr.zza().zzg(com.google.android.gms.internal.ads.zzhnm.zza(str, com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length), com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhtm.RAW, null), com.google.android.gms.internal.ads.zzhdo.zza()), com.google.android.gms.internal.ads.zzhdi.class)).zza(bArr4, bArr2);
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NegativeArraySizeException | java.nio.BufferUnderflowException e) {
            throw new java.security.GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
