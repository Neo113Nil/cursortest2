package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzan<E> extends zzaf<E> {
    private final zzal<E> zza;

    public zzan(zzal<E> zzalVar, int i7) {
        super(zzalVar.size(), i7);
        this.zza = zzalVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaf
    public final E zza(int i7) {
        return this.zza.get(i7);
    }
}
