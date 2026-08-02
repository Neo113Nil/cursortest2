package com.google.android.gms.internal.firebase_database;

import java.util.List;

/* loaded from: classes.dex */
final class zzfe implements zzgn<zzfa> {
    private final /* synthetic */ boolean zzmd;
    private final /* synthetic */ List zzme;
    private final /* synthetic */ zzch zzmf;

    zzfe(zzfd zzfdVar, boolean z, List list, zzch zzchVar) {
        this.zzmd = z;
        this.zzme = list;
        this.zzmf = zzchVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgn
    public final /* synthetic */ boolean zzd(zzfa zzfaVar) {
        zzfa zzfaVar2 = zzfaVar;
        if ((zzfaVar2.isVisible() || this.zzmd) && !this.zzme.contains(Long.valueOf(zzfaVar2.zzcn()))) {
            return zzfaVar2.zzg().zzi(this.zzmf) || this.zzmf.zzi(zzfaVar2.zzg());
        }
        return false;
    }
}
