package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlg {
    private static final byte[] zza = new byte[0];
    private final zzlh zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    private zzlg(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzlh zzlhVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzlhVar;
    }

    public static zzlg zza(byte[] bArr, zzln zzlnVar, zzlk zzlkVar, zzll zzllVar, zzlh zzlhVar, byte[] bArr2) {
        byte[] zza2 = zzlkVar.zza(bArr, zzlnVar);
        byte[] bArr3 = zzlq.zza;
        byte[] zza3 = zzlq.zza(zzlkVar.zza(), zzllVar.zzb(), zzlhVar.zzc());
        byte[] bArr4 = zzlq.zzl;
        byte[] bArr5 = zza;
        byte[] zza4 = zzxv.zza(bArr3, zzllVar.zza(bArr4, bArr5, "psk_id_hash", zza3), zzllVar.zza(bArr4, bArr2, "info_hash", zza3));
        byte[] zza5 = zzllVar.zza(zza2, bArr5, "secret", zza3);
        byte[] zza6 = zzllVar.zza(zza5, zza4, "key", zza3, zzlhVar.zza());
        byte[] zza7 = zzllVar.zza(zza5, zza4, "base_nonce", zza3, zzlhVar.zzb());
        zzlhVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzlg(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzlhVar);
    }

    private final synchronized byte[] zza() {
        byte[] zza2;
        zza2 = zzxv.zza(this.zze, zzmj.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) < 0) {
            this.zzf = this.zzf.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zza2;
    }

    public final byte[] zza(byte[] bArr, int i7, byte[] bArr2) {
        return this.zzb.zza(this.zzd, zza(), bArr, i7, bArr2);
    }
}
