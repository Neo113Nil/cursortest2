package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzck;

/* loaded from: classes.dex */
final class zzg implements Runnable {
    private final /* synthetic */ FirebaseDatabase zzaj;

    zzg(FirebaseDatabase firebaseDatabase) {
        this.zzaj = firebaseDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zzaj.zzai;
        zzckVar.purgeOutstandingWrites();
    }
}
