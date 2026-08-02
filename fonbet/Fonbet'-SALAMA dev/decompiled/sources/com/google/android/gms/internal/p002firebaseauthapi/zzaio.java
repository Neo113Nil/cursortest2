package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzaio extends zzaiq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaip zzc;

    public zzaio(zzaip zzaipVar) {
        this.zzc = zzaipVar;
        this.zzb = zzaipVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final byte zza() {
        int i7 = this.zza;
        if (i7 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i7 + 1;
        return this.zzc.zzb(i7);
    }
}
