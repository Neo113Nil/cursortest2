package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzguz implements zzgpn {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzguz(String str, Key key) {
        char c3;
        int i7;
        zzguy zzguyVar = new zzguy(this);
        this.zza = zzguyVar;
        if (!zzgjy.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        if (c3 == 0) {
            i7 = 20;
        } else if (c3 == 1) {
            i7 = 28;
        } else if (c3 == 2) {
            i7 = 32;
        } else if (c3 == 3) {
            i7 = 48;
        } else {
            if (c3 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i7 = 64;
        }
        this.zzd = i7;
        zzguyVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgpn
    public final byte[] zza(byte[] bArr, int i7) {
        if (i7 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.zza.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i7);
    }
}
