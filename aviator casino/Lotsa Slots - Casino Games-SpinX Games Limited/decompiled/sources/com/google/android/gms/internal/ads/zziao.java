package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziao implements com.google.android.gms.internal.ads.zzhqd {
    private final java.lang.ThreadLocal zza;
    private final java.lang.String zzb;
    private final java.security.Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zziao(java.lang.String str, java.security.Key key) throws java.security.GeneralSecurityException {
        char c;
        int i;
        com.google.android.gms.internal.ads.zzian zzianVar = new com.google.android.gms.internal.ads.zzian(this);
        this.zza = zzianVar;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 20;
        } else if (c == 1) {
            i = 28;
        } else if (c == 2) {
            i = 32;
        } else if (c == 3) {
            i = 48;
        } else {
            if (c != 4) {
                throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i = 64;
        }
        this.zzd = i;
        zzianVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (i > this.zzd) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        java.lang.ThreadLocal threadLocal = this.zza;
        ((javax.crypto.Mac) threadLocal.get()).update(bArr);
        return java.util.Arrays.copyOf(((javax.crypto.Mac) threadLocal.get()).doFinal(), i);
    }

    final /* synthetic */ java.lang.String zzb() {
        return this.zzb;
    }

    final /* synthetic */ java.security.Key zzc() {
        return this.zzc;
    }
}
