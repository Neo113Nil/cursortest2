package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
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

    public static zzbg zza(zzcw zzcwVar, zzbg zzbgVar) throws GeneralSecurityException {
        try {
            return new zzeo(zzvu.zza(zzcp.zza(zzcwVar), zzajk.zza()), zzbgVar);
        } catch (zzakf e7) {
            throw new GeneralSecurityException(e7);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbp zzbpVarZza = zznv.zza().zza(this.zzd, (Integer) null);
        byte[] bArrZzb = this.zze.zzb(((zzpc) zzof.zza().zza(zzbpVarZza, zzpc.class, zzbq.zza())).zzd().zzd(), zza);
        if (bArrZzb.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] bArrZzb2 = ((zzbg) zzoc.zza().zza(zzbpVarZza, zzbg.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(bArrZzb.length + 4 + bArrZzb2.length).putInt(bArrZzb.length).put(bArrZzb).put(bArrZzb2).array();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i7 = byteBufferWrap.getInt();
            if (i7 > 0 && i7 <= 4096 && i7 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i7];
                byteBufferWrap.get(bArr3, 0, i7);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                return ((zzbg) zzoc.zza().zza(zzof.zza().zza(zzpc.zza(this.zzc, zzaip.zza(this.zze.zza(bArr3, zza)), zzvq.zzb.SYMMETRIC, zzws.RAW, null), zzbq.zza()), zzbg.class)).zza(bArr4, bArr2);
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
