package com.google.android.gms.internal.firebase_database;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzhb implements Comparator<zzgw> {
    private final /* synthetic */ zzha zzpe;

    zzhb(zzha zzhaVar) {
        this.zzpe = zzhaVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzgw zzgwVar, zzgw zzgwVar2) {
        zzis zzisVar;
        zzgw zzgwVar3 = zzgwVar;
        zzgw zzgwVar4 = zzgwVar2;
        zziz zzizVar = new zziz(zzgwVar3.zzds(), zzgwVar3.zzdq().zzd());
        zziz zzizVar2 = new zziz(zzgwVar4.zzds(), zzgwVar4.zzdq().zzd());
        zzisVar = this.zzpe.zzpd;
        return zzisVar.compare(zzizVar, zzizVar2);
    }
}
