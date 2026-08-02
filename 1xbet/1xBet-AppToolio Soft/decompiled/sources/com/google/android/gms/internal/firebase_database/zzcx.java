package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzcx implements zzbs {
    private final /* synthetic */ zzck zzil;

    zzcx(zzck zzckVar) {
        this.zzil = zzckVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbs
    public final void zzo(String str) {
        zzhz zzhzVar;
        zzaj zzajVar;
        zzhzVar = this.zzil.zzib;
        zzhzVar.zza("Auth token changed, triggering auth token refresh", null, new Object[0]);
        zzajVar = this.zzil.zzfs;
        zzajVar.zzh(str);
    }
}
