package com.google.android.gms.internal.firebase_database;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class zzgq<T> implements zzgs<T> {
    private final /* synthetic */ zzgs zzoj;
    private final /* synthetic */ boolean zzok;

    zzgq(zzgp zzgpVar, zzgs zzgsVar, boolean z) {
        this.zzoj = zzgsVar;
        this.zzok = z;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgs
    public final void zzd(zzgp<T> zzgpVar) {
        zzgpVar.zza(this.zzoj, true, this.zzok);
    }
}
