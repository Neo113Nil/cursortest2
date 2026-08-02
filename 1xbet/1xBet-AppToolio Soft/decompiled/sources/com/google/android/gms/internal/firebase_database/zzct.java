package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.Transaction;

/* loaded from: classes.dex */
final class zzct implements Runnable {
    private final /* synthetic */ DataSnapshot zzir;
    private final /* synthetic */ zzdl zziu;

    zzct(zzcs zzcsVar, zzdl zzdlVar, DataSnapshot dataSnapshot) {
        this.zziu = zzdlVar;
        this.zzir = dataSnapshot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Transaction.Handler handler;
        handler = this.zziu.zzjj;
        handler.onComplete(null, true, this.zzir);
    }
}
