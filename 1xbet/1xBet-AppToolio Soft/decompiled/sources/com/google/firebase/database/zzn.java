package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.firebase.database.DatabaseReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzn implements Runnable {
    private final /* synthetic */ OnDisconnect zzaq;
    private final /* synthetic */ Map zzar;
    private final /* synthetic */ Map zzas;
    private final /* synthetic */ zzkn zzx;

    zzn(OnDisconnect onDisconnect, Map map, zzkn zzknVar, Map map2) {
        this.zzaq = onDisconnect;
        this.zzar = map;
        this.zzx = zzknVar;
        this.zzas = map2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzch zzchVar;
        zzckVar = this.zzaq.zzai;
        zzchVar = this.zzaq.zzap;
        zzckVar.zza(zzchVar, this.zzar, (DatabaseReference.CompletionListener) this.zzx.zzgv(), this.zzas);
    }
}
