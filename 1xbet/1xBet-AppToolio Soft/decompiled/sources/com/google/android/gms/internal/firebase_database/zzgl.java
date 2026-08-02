package com.google.android.gms.internal.firebase_database;

import java.util.AbstractMap;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class zzgl<T> implements zzgm<T, Void> {
    private final /* synthetic */ List val$list;

    zzgl(zzgj zzgjVar, List list) {
        this.val$list = list;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Void zza(zzch zzchVar, Object obj, Void r4) {
        this.val$list.add(new AbstractMap.SimpleImmutableEntry(zzchVar, obj));
        return null;
    }
}
