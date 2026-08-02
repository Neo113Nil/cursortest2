package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzce;

/* loaded from: classes.dex */
final class zzr implements Runnable {
    private final /* synthetic */ Query zzaw;
    private final /* synthetic */ zzce zzay;

    zzr(Query query, zzce zzceVar) {
        this.zzaw = query;
        this.zzay = zzceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaw.zzai.zzf(this.zzay);
    }
}
