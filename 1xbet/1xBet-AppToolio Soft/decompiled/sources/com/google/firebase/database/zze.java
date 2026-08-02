package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzbv;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.firebase.database.DatabaseReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zze implements Runnable {
    private final /* synthetic */ zzbv zzaa;
    private final /* synthetic */ Map zzab;
    private final /* synthetic */ zzkn zzx;
    private final /* synthetic */ DatabaseReference zzy;

    zze(DatabaseReference databaseReference, zzbv zzbvVar, zzkn zzknVar, Map map) {
        this.zzy = databaseReference;
        this.zzaa = zzbvVar;
        this.zzx = zzknVar;
        this.zzab = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzy.zzai.zza(this.zzy.zzap, this.zzaa, (DatabaseReference.CompletionListener) this.zzx.zzgv(), this.zzab);
    }
}
