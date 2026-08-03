package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhxt implements com.google.android.gms.internal.ads.zzhek {
    static final com.google.android.gms.internal.ads.zzhli zza;
    static final com.google.android.gms.internal.ads.zzhli zzb;
    static final com.google.android.gms.internal.ads.zzhli zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final java.security.interfaces.ECPublicKey zzg;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzhzs zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @javax.annotation.Nullable
    private final java.security.Provider zzl;

    static {
        com.google.android.gms.internal.ads.zzhlh zza2 = com.google.android.gms.internal.ads.zzhli.zza();
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA256, com.google.android.gms.internal.ads.zzhur.zza);
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA384, com.google.android.gms.internal.ads.zzhur.zzb);
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA512, com.google.android.gms.internal.ads.zzhur.zzc);
        zza = zza2.zzb();
        com.google.android.gms.internal.ads.zzhlh zza3 = com.google.android.gms.internal.ads.zzhli.zza();
        zza3.zza(com.google.android.gms.internal.ads.zzhzs.IEEE_P1363, com.google.android.gms.internal.ads.zzhus.zza);
        zza3.zza(com.google.android.gms.internal.ads.zzhzs.DER, com.google.android.gms.internal.ads.zzhus.zzb);
        zzb = zza3.zzb();
        com.google.android.gms.internal.ads.zzhlh zza4 = com.google.android.gms.internal.ads.zzhli.zza();
        zza4.zza(com.google.android.gms.internal.ads.zzhzr.NIST_P256, com.google.android.gms.internal.ads.zzhuq.zza);
        zza4.zza(com.google.android.gms.internal.ads.zzhzr.NIST_P384, com.google.android.gms.internal.ads.zzhuq.zzb);
        zza4.zza(com.google.android.gms.internal.ads.zzhzr.NIST_P521, com.google.android.gms.internal.ads.zzhuq.zzc);
        zzc = zza4.zzb();
    }

    private zzhxt(java.security.interfaces.ECPublicKey eCPublicKey, com.google.android.gms.internal.ads.zziai zziaiVar, com.google.android.gms.internal.ads.zzhzs zzhzsVar, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = com.google.android.gms.internal.ads.zziaw.zza(zziaiVar);
        this.zzg = eCPublicKey;
        this.zzi = zzhzsVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static com.google.android.gms.internal.ads.zzhek zzb(com.google.android.gms.internal.ads.zzhuy zzhuyVar, @javax.annotation.Nullable java.security.Provider provider) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhxt((java.security.interfaces.ECPublicKey) (provider != null ? java.security.KeyFactory.getInstance("EC", provider) : (java.security.KeyFactory) com.google.android.gms.internal.ads.zzhzz.zzf.zzb("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(zzhuyVar.zzd(), com.google.android.gms.internal.ads.zzhzt.zzb((com.google.android.gms.internal.ads.zzhzr) zzc.zzb(zzhuyVar.zzf().zzd())))), (com.google.android.gms.internal.ads.zziai) zza.zzb(zzhuyVar.zzf().zze()), (com.google.android.gms.internal.ads.zzhzs) zzb.zzb(zzhuyVar.zzf().zzc()), zzhuyVar.zze().zzc(), zzhuyVar.zzf().zzf().equals(com.google.android.gms.internal.ads.zzhut.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        java.security.Signature signature;
        byte[] bArr3;
        if (this.zzi == com.google.android.gms.internal.ads.zzhzs.IEEE_P1363) {
            java.security.spec.EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int bitLength = (com.google.android.gms.internal.ads.zzhlg.zzc(curve).subtract(java.math.BigInteger.ONE).bitLength() + 7) / 8;
            if (length != bitLength + bitLength) {
                throw new java.security.GeneralSecurityException("Invalid signature");
            }
            bArr = com.google.android.gms.internal.ads.zzhzt.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i7 = bArr[1] & 255;
            if (i7 == 129) {
                i7 = bArr[2] & 255;
                if (i7 >= 128) {
                    i = 2;
                    if (i7 == (length2 - 1) - i && bArr[i + 1] == 2 && (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) < length2 && i2 != 0) {
                        b = bArr[i3];
                        if ((b & 255) < 128 && ((i2 <= 1 || b != 0 || (bArr[i + 4] & 255) >= 128) && bArr[i4] == 2)) {
                            i6 = bArr[i5] & 255;
                            if (i4 + 2 + i6 == length2 && i6 != 0) {
                                b2 = bArr[i + 5 + i2];
                                if ((b2 & 255) < 128 && (i6 <= 1 || b2 != 0 || (bArr[i + 6 + i2] & 255) >= 128)) {
                                    java.lang.String str = this.zzh;
                                    java.security.Provider provider = this.zzl;
                                    signature = provider == null ? java.security.Signature.getInstance(str, provider) : (java.security.Signature) com.google.android.gms.internal.ads.zzhzz.zzc.zzb(str);
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (java.lang.RuntimeException unused) {
                                    }
                                    throw new java.security.GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i7 != 128 && i7 <= 129) {
                i = 1;
                if (i7 == (length2 - 1) - i) {
                    b = bArr[i3];
                    if ((b & 255) < 128) {
                        i6 = bArr[i5] & 255;
                        if (i4 + 2 + i6 == length2) {
                            b2 = bArr[i + 5 + i2];
                            if ((b2 & 255) < 128) {
                                java.lang.String str2 = this.zzh;
                                java.security.Provider provider2 = this.zzl;
                                if (provider2 == null) {
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                }
                                if (signature.verify(bArr)) {
                                }
                                throw new java.security.GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new java.security.GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
                throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(java.util.Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
