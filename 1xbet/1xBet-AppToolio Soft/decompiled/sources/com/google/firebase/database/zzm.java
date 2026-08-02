package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzja;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzm implements Runnable {
    private final /* synthetic */ OnDisconnect zzaq;
    private final /* synthetic */ zzja zzw;
    private final /* synthetic */ zzkn zzx;

    zzm(OnDisconnect onDisconnect, zzja zzjaVar, zzkn zzknVar) {
        this.zzaq = onDisconnect;
        this.zzw = zzjaVar;
        this.zzx = zzknVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzch zzchVar;
        zzckVar = this.zzaq.zzai;
        zzchVar = this.zzaq.zzap;
        zzckVar.zzb(zzchVar, this.zzw, (DatabaseReference.CompletionListener) this.zzx.zzgv());
    }
}
