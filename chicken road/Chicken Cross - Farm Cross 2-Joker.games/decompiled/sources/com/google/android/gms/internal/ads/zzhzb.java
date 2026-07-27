package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhzb implements zzhfo {
    static final zzhmo zza;
    static final zzhmo zzb;
    static final zzhmo zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zziba zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @Nullable
    private final Provider zzl;

    static {
        zzhmn zza2 = zzhmo.zza();
        zza2.zza(zzibq.SHA256, zzhvu.zza);
        zza2.zza(zzibq.SHA384, zzhvu.zzb);
        zza2.zza(zzibq.SHA512, zzhvu.zzc);
        zza = zza2.zzb();
        zzhmn zza3 = zzhmo.zza();
        zza3.zza(zziba.IEEE_P1363, zzhvv.zza);
        zza3.zza(zziba.DER, zzhvv.zzb);
        zzb = zza3.zzb();
        zzhmn zza4 = zzhmo.zza();
        zza4.zza(zziaz.NIST_P256, zzhvt.zza);
        zza4.zza(zziaz.NIST_P384, zzhvt.zzb);
        zza4.zza(zziaz.NIST_P521, zzhvt.zzc);
        zzc = zza4.zzb();
    }

    private zzhzb(ECPublicKey eCPublicKey, zzibq zzibqVar, zziba zzibaVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzice.zza(zzibqVar);
        this.zzg = eCPublicKey;
        this.zzi = zzibaVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhfo zzb(zzhwb zzhwbVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new zzhzb((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzibh.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhwbVar.zzd(), zzibb.zzb((zziaz) zzc.zzb(zzhwbVar.zzf().zzd())))), (zzibq) zza.zzb(zzhwbVar.zzf().zze()), (zziba) zzb.zzb(zzhwbVar.zzf().zzc()), zzhwbVar.zze().zzc(), zzhwbVar.zzf().zzf().equals(zzhvw.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zziba.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int bitLength = (zzhmm.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != bitLength + bitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zzibb.zza(bArr);
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
                                    String str = this.zzh;
                                    Provider provider = this.zzl;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) zzibh.zzc.zzb(str);
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
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
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
                                String str2 = this.zzh;
                                Provider provider2 = this.zzl;
                                if (provider2 == null) {
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                }
                                if (signature.verify(bArr)) {
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhpd.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
