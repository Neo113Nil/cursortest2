package com.google.android.gms.internal.measurement;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class zzgl<V> extends FutureTask<V> implements Comparable<zzgl> {
    private final String zzanw;
    private final /* synthetic */ zzgi zzanx;
    private final long zzany;
    final boolean zzanz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgl(zzgi zzgiVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzanx = zzgiVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgi.zzanv;
        this.zzany = atomicLong.getAndIncrement();
        this.zzanw = str;
        this.zzanz = false;
        if (this.zzany == Long.MAX_VALUE) {
            zzgiVar.zzgi().zziv().log("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgl(zzgi zzgiVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzanx = zzgiVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgi.zzanv;
        this.zzany = atomicLong.getAndIncrement();
        this.zzanw = str;
        this.zzanz = z;
        if (this.zzany == Long.MAX_VALUE) {
            zzgiVar.zzgi().zziv().log("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull zzgl zzglVar) {
        zzgl zzglVar2 = zzglVar;
        boolean z = this.zzanz;
        if (z != zzglVar2.zzanz) {
            return z ? -1 : 1;
        }
        long j = this.zzany;
        long j2 = zzglVar2.zzany;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzanx.zzgi().zziw().zzg("Two tasks share the same index. index", Long.valueOf(this.zzany));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.zzanx.zzgi().zziv().zzg(this.zzanw, th);
        if (th instanceof zzgj) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
