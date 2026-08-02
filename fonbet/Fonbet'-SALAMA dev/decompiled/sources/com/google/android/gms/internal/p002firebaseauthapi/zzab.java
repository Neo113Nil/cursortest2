package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzab extends zzae {
    private final /* synthetic */ zzo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzac zzacVar, zzx zzxVar, CharSequence charSequence, zzo zzoVar) {
        super(zzxVar, charSequence);
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zza(int i7) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zzb(int i7) {
        if (this.zzb.zza(i7)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
