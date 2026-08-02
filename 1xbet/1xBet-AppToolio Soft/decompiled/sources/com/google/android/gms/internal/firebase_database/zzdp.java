package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzdp implements Runnable {
    private final /* synthetic */ zzck zzit;

    zzdp(zzck zzckVar) {
        this.zzit = zzckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzit.interrupt();
    }
}
