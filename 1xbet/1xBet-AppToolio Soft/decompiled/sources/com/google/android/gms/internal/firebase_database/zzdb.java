package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Transaction;

/* loaded from: classes.dex */
final class zzdb implements Runnable {
    private final /* synthetic */ zzdl zziv;
    private final /* synthetic */ DatabaseError zziy;

    zzdb(zzck zzckVar, zzdl zzdlVar, DatabaseError databaseError) {
        this.zziv = zzdlVar;
        this.zziy = databaseError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Transaction.Handler handler;
        handler = this.zziv.zzjj;
        handler.onComplete(this.zziy, false, null);
    }
}
