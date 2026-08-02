package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzeo implements zzbg {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final String zzc;
    private final zzch zzd;
    private final zzbg zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    private zzeo(zzvu zzvuVar, zzbg zzbgVar) {
        if (!zzb.contains(zzvuVar.zzf())) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Unsupported DEK key type: ", zzvuVar.zzf(), ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzvuVar.zzf();
        this.zzd = zzcp.zza(((zzvu) ((zzajy) zzvu.zza(zzvuVar).zza(zzws.RAW).zze())).zzk());
        this.zze = zzbgVar;
    }

    public static zzbg zza(zzcw zzcwVar, zzbg zzbgVar) {
        try {
            return new zzeo(zzvu.zza(zzcp.zza(zzcwVar), zzajk.zza()), zzbgVar);
        } catch (zzakf e7) {
            throw new GeneralSecurityException(e7);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        zzbp zza2 = zznv.zza().zza(this.zzd, (Integer) null);
        byte[] zzb2 = this.zze.zzb(((zzpc) zzof.zza().zza(zza2, zzpc.class, zzbq.zza())).zzd().zzd(), zza);
        if (zzb2.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] zzb3 = ((zzbg) zzoc.zza().zza((zzoc) zza2, zzbg.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(zzb2.length + 4 + zzb3.length).putInt(zzb2.length).put(zzb2).put(zzb3).array();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 > 0 && i7 <= 4096 && i7 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i7];
                wrap.get(bArr3, 0, i7);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((zzbg) zzoc.zza().zza((zzoc) zzof.zza().zza((zzof) zzpc.zza(this.zzc, zzaip.zza(this.zze.zza(bArr3, zza)), zzvq.zzb.SYMMETRIC, zzws.RAW, null), zzbq.zza()), zzbg.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
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
