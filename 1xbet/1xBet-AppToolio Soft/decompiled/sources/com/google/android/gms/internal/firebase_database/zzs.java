package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzs implements Runnable {
    private final /* synthetic */ String zzbn;
    private final /* synthetic */ Throwable zzbo;

    zzs(zzr zzrVar, String str, Throwable th) {
        this.zzbn = str;
        this.zzbo = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new RuntimeException(this.zzbn, this.zzbo);
    }
}
