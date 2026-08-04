package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaie;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaif<MessageType extends zzaif<MessageType, BuilderType>, BuilderType extends zzaie<MessageType, BuilderType>> implements zzalc {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final zzaip a_() {
        try {
            zzaiu zzaiuVarZzc = zzaip.zzc(zzl());
            zza(zzaiuVarZzc.zzb());
            return zzaiuVarZzc.zza();
        } catch (IOException e7) {
            throw new RuntimeException(AbstractC0486a1.h("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e7);
        }
    }

    public int zza(zzalv zzalvVar) {
        int iZzi = zzi();
        if (iZzi != -1) {
            return iZzi;
        }
        int iZza = zzalvVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    public void zzb(int i7) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzajg zzajgVarZzb = zzajg.zzb(bArr);
            zza(zzajgVarZzb);
            zzajgVarZzb.zzb();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(AbstractC0486a1.h("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzajg zzajgVarZza = zzajg.zza(outputStream, zzajg.zzf(zzl()));
        zza(zzajgVarZza);
        zzajgVarZza.zzc();
    }
}
