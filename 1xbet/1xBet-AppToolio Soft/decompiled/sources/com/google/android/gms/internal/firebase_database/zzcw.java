package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Transaction;

/* loaded from: classes.dex */
final class zzcw implements Runnable {
    private final /* synthetic */ zzdl zziv;
    private final /* synthetic */ DatabaseError zziw;
    private final /* synthetic */ DataSnapshot zzix;

    zzcw(zzck zzckVar, zzdl zzdlVar, DatabaseError databaseError, DataSnapshot dataSnapshot) {
        this.zziv = zzdlVar;
        this.zziw = databaseError;
        this.zzix = dataSnapshot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Transaction.Handler handler;
        handler = this.zziv.zzjj;
        handler.onComplete(this.zziw, false, this.zzix);
    }
}
