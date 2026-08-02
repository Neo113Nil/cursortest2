package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzv implements zzgm<Void, Integer> {
    private final /* synthetic */ zzgj zzbv;

    zzv(zzu zzuVar, zzgj zzgjVar) {
        this.zzbv = zzgjVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Integer zza(zzch zzchVar, Void r2, Integer num) {
        Integer num2 = num;
        return Integer.valueOf(this.zzbv.zzai(zzchVar) == null ? num2.intValue() + 1 : num2.intValue());
    }
}
