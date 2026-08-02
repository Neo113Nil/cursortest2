package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzo implements Runnable {
    private final /* synthetic */ OnDisconnect zzaq;
    private final /* synthetic */ zzkn zzx;

    zzo(OnDisconnect onDisconnect, zzkn zzknVar) {
        this.zzaq = onDisconnect;
        this.zzx = zzknVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzch zzchVar;
        zzckVar = this.zzaq.zzai;
        zzchVar = this.zzaq.zzap;
        zzckVar.zza(zzchVar, (DatabaseReference.CompletionListener) this.zzx.zzgv());
    }
}
