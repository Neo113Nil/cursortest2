package com.google.android.gms.internal.ads;

import J2.j;
import java.lang.Thread;

/* loaded from: classes.dex */
final class zzbtk implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbtl zzb;

    public zzbtk(zzbtl zzbtlVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        this.zzb = zzbtlVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzb.zzg(thread, th);
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            j.d("AdMob exception reporter failed reporting the exception.");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zza;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
