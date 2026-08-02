package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class zzgk<T> implements zzgm<T, Void> {
    private final /* synthetic */ ArrayList zzoe;

    zzgk(zzgj zzgjVar, ArrayList arrayList) {
        this.zzoe = arrayList;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Void zza(zzch zzchVar, Object obj, Void r3) {
        this.zzoe.add(obj);
        return null;
    }
}
