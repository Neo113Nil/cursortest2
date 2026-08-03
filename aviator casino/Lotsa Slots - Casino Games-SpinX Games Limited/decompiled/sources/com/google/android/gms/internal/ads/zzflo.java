package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflo {
    public zzflo() {
        try {
            com.google.android.gms.internal.ads.zzhep.zza();
        } catch (java.security.GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.registerAead");
        }
    }

    public static final java.lang.String zza() {
        byte[] bArr;
        try {
            com.google.android.gms.internal.ads.zzheb zzg = com.google.android.gms.internal.ads.zzheb.zzg(com.google.android.gms.internal.ads.zzhdt.zzb(com.google.android.gms.internal.ads.zzhmn.zza().zzc("AES128_GCM")));
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                com.google.android.gms.internal.ads.zzhdm.zzb(zzg, com.google.android.gms.internal.ads.zzhdl.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Serialize keyset failed");
            }
        } catch (java.security.GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return android.util.Base64.encodeToString(bArr, 11);
    }

    @javax.annotation.Nullable
    public static final java.lang.String zzb(byte[] bArr, byte[] bArr2, @javax.annotation.Nullable java.lang.String str, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        com.google.android.gms.internal.ads.zzheb zzc;
        if (str != null && (zzc = zzc(str)) != null) {
            try {
                byte[] zza = ((com.google.android.gms.internal.ads.zzhdi) zzc.zzh(com.google.android.gms.internal.ads.zzhkt.zza(), com.google.android.gms.internal.ads.zzhdi.class)).zza(bArr, bArr2);
                zzdzgVar.zzc().put("ds", "1");
                return new java.lang.String(zza, java.nio.charset.StandardCharsets.UTF_8);
            } catch (java.lang.UnsupportedOperationException | java.security.GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.decrypt");
                zzdzgVar.zzc().put("dsf", e.toString());
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    private static final com.google.android.gms.internal.ads.zzheb zzc(java.lang.String str) {
        try {
            try {
                return com.google.android.gms.internal.ads.zzhdm.zza(com.google.android.gms.internal.ads.zzhdk.zza(android.util.Base64.decode(str, 11)));
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Parse keyset failed");
            }
        } catch (java.security.GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
