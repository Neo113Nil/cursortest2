package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzle implements zzll {
    private final String zza;

    public zzle(String str) {
        this.zza = str;
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzb() {
        String str = this.zza;
        str.getClass();
        switch (str) {
            case "HmacSha256":
                return zzlq.zzf;
            case "HmacSha384":
                return zzlq.zzg;
            case "HmacSha512":
                return zzlq.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        Mac zza = zzyf.zzb.zza(this.zza);
        if (i7 > zza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i7];
        zza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArr4 = new byte[0];
        int i8 = 1;
        int i9 = 0;
        while (true) {
            zza.update(bArr4);
            zza.update(bArr2);
            zza.update((byte) i8);
            bArr4 = zza.doFinal();
            if (bArr4.length + i9 >= i7) {
                System.arraycopy(bArr4, 0, bArr3, i9, i7 - i9);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
            i9 += bArr4.length;
            i8++;
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza = zzyf.zzb.zza(this.zza);
        if (bArr2 != null && bArr2.length != 0) {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        } else {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        }
        return zza.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i7) {
        return zza(zza(zzlq.zza(str, bArr2, bArr4), null), zzlq.zza(str2, bArr3, bArr4, i7), i7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i7) {
        return zza(bArr, zzlq.zza(str, bArr2, bArr3, i7), i7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzlq.zza(str, bArr2, bArr3), bArr);
    }
}
