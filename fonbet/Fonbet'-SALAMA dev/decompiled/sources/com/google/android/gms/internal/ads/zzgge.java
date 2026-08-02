package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzgge implements zzgci {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgci zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgge(zzgse zzgseVar, zzgci zzgciVar) {
        if (!zzc.contains(zzgseVar.zzi())) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Unsupported DEK key type: ", zzgseVar.zzi(), ". Only Tink AEAD key types are supported."));
        }
        this.zzd = zzgseVar.zzi();
        zzgsc zzb2 = zzgse.zzb(zzgseVar);
        zzb2.zza(zzgte.RAW);
        zzgdl.zza(((zzgse) zzb2.zzbr()).zzaV());
        this.zze = zzgciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 <= 0 || i7 > 4096 || i7 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i7];
            wrap.get(bArr3, 0, i7);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zze.zza(bArr3, zzb);
            String str = this.zzd;
            zzgvy zzgvyVar = zzgvy.zzb;
            return ((zzgci) zzglr.zza().zzb(zzglu.zzc().zza(zzgmw.zza(str, zzgvy.zzv(zza2, 0, zza2.length), zzgry.SYMMETRIC, zzgte.RAW, null), zzgcr.zza()), zzgci.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
