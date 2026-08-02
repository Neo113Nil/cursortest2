package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzdz extends zzii {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzdy zzkl;

    zzdz(zzdy zzdyVar, zzch zzchVar) {
        this.zzkl = zzdyVar;
        this.zzgy = zzchVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzii
    /* renamed from: zzb */
    public final void visitEntry(zzid zzidVar, zzja zzjaVar) {
        this.zzkl.zzh(this.zzgy.zza(zzidVar), zzjaVar);
    }
}
