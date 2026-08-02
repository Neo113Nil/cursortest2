package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaie;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class zzaif<MessageType extends zzaif<MessageType, BuilderType>, BuilderType extends zzaie<MessageType, BuilderType>> implements zzalc {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final zzaip a_() {
        try {
            zzaiu zzc = zzaip.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e7) {
            throw new RuntimeException(AbstractC0486a1.h("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e7);
        }
    }

    public int zza(zzalv zzalvVar) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza = zzalvVar.zza(this);
        zzb(zza);
        return zza;
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
            zzajg zzb = zzajg.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(AbstractC0486a1.h("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzajg zza = zzajg.zza(outputStream, zzajg.zzf(zzl()));
        zza(zza);
        zza.zzc();
    }
}
