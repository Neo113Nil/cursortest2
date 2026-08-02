package com.google.android.gms.internal.firebase_database;

import java.lang.Thread;

/* loaded from: classes.dex */
final class zzkk implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzkj zzuk;

    zzkk(zzkj zzkjVar) {
        this.zzuk = zzkjVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.zzuk.zzuj.zza(th);
    }
}
