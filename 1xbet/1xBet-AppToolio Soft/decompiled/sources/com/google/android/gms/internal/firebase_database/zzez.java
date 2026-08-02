package com.google.android.gms.internal.firebase_database;

import java.lang.Thread;

/* loaded from: classes.dex */
final class zzez implements zzey {
    zzez() {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzey
    public final void zza(Thread thread, String str) {
        thread.setName(str);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzey
    public final void zza(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzey
    public final void zza(Thread thread, boolean z) {
        thread.setDaemon(true);
    }
}
