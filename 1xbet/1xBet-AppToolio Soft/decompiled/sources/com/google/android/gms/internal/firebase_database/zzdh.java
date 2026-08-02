package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzdh implements Runnable {
    private final /* synthetic */ DatabaseReference.CompletionListener zzio;
    private final /* synthetic */ DatabaseError zzjf;
    private final /* synthetic */ DatabaseReference zzjg;

    zzdh(zzck zzckVar, DatabaseReference.CompletionListener completionListener, DatabaseError databaseError, DatabaseReference databaseReference) {
        this.zzio = completionListener;
        this.zzjf = databaseError;
        this.zzjg = databaseReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzio.onComplete(this.zzjf, this.zzjg);
    }
}
