package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgjq implements zzgci {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgjq(byte[] bArr, byte[] bArr2) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zzc()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzgci zzb(zzghr zzghrVar) {
        return new zzgjq(zzghrVar.zze().zzd(zzgcr.zza()), zzghrVar.zzb().zzd());
    }

    public static boolean zzc() {
        return zzgiv.zzc() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        if (bArr.length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.zzb.length, bArr4, 0, 24);
        int[] zzd = zzgjb.zzd(zzgjb.zze(this.zza), zzgjb.zze(bArr4));
        ByteBuffer order = ByteBuffer.allocate(zzd.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzd);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher zzc = zzgiv.zzc();
        zzc.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            zzc.updateAAD(bArr2);
        }
        return zzc.doFinal(bArr, this.zzb.length + 24, (r1 - r10) - 24);
    }
}
