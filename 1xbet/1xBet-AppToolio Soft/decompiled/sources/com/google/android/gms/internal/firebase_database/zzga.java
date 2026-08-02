package com.google.android.gms.internal.firebase_database;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class zzga<T> implements zzgm<Boolean, T> {
    private final /* synthetic */ zzgm zzno;

    zzga(zzfx zzfxVar, zzgm zzgmVar) {
        this.zzno = zzgmVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Object zza(zzch zzchVar, Boolean bool, Object obj) {
        return !bool.booleanValue() ? this.zzno.zza(zzchVar, null, obj) : obj;
    }
}
