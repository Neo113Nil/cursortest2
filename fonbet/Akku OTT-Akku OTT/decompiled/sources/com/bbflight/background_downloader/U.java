package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.bbflight.background_downloader.BDPlugin;
import com.bbflight.background_downloader.TaskWorker;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U implements Comparable<U> {
    public final Context a;
    public final M0 b;
    public final String c;
    public final E0 d;
    public final BDPlugin e;
    public final Date f;

    public U(Context context, M0 task, String str, E0 e0, BDPlugin bDPlugin, int i) {
        e0 = (i & 8) != 0 ? null : e0;
        bDPlugin = (i & 16) != 0 ? null : bDPlugin;
        Date created = new Date();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(created, "created");
        this.a = context;
        this.b = task;
        this.c = str;
        this.d = e0;
        this.e = bDPlugin;
        this.f = created;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x011f, code lost:
    
        if (kotlinx.coroutines.W.b(20, r10) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        if (com.bbflight.background_downloader.TaskWorker.Companion.g(r4, r5, r6, r7, r8, r18.a, r10, 496) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r4 == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        T t;
        int i2;
        long j;
        long j2;
        int i3;
        Object e;
        M0 m0;
        long j3;
        int i4 = i;
        if (continuationImpl instanceof T) {
            t = (T) continuationImpl;
            int i5 = t.e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                t.e = i5 - Integer.MIN_VALUE;
                T t2 = t;
                Object obj = t2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = t2.e;
                M0 m02 = this.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long time = new Date().getTime() - this.f.getTime();
                    long j4 = i4;
                    if (time < j4) {
                        t2.a = i4;
                        t2.b = time;
                        t2.e = 1;
                        if (kotlinx.coroutines.W.b(j4 - time, t2) != coroutine_suspended) {
                            j2 = time;
                        }
                        return coroutine_suspended;
                    }
                    j = time;
                    BDPlugin.Companion companion = BDPlugin.INSTANCE;
                    t2.a = i4;
                    t2.b = j;
                    t2.e = 2;
                    i3 = 2;
                    e = BDPlugin.Companion.e(companion, this.a, this.b, this.c, this.d, this.e, t2, 16);
                } else if (i2 == 1) {
                    j2 = t2.b;
                    i4 = t2.a;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    long j5 = t2.b;
                    i4 = t2.a;
                    ResultKt.throwOnFailure(obj);
                    e = obj;
                    i3 = 2;
                    j = j5;
                    if (!((Boolean) e).booleanValue()) {
                        String str = m02.a;
                        TaskWorker.Companion companion2 = TaskWorker.INSTANCE;
                        W0 w0 = W0.f;
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
                        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                        P0 p0 = new P0(W.b, "Delayed or retried enqueue failed", i3);
                        t2.a = i4;
                        t2.b = j;
                        t2.e = 3;
                        m0 = m02;
                    }
                    t2.a = i4;
                    t2.b = j;
                    t2.e = 5;
                } else if (i2 == 3) {
                    long j6 = t2.b;
                    i4 = t2.a;
                    ResultKt.throwOnFailure(obj);
                    j = j6;
                    m0 = m02;
                    BDPlugin.INSTANCE.getClass();
                    C0638c0 c0638c0 = BDPlugin.y;
                    if (c0638c0 != null) {
                        t2.a = i4;
                        t2.b = j;
                        t2.e = 4;
                        if (c0638c0.g(m0, t2) != coroutine_suspended) {
                            j3 = j;
                            j = j3;
                        }
                        return coroutine_suspended;
                    }
                    C0657m0 c0657m0 = C0657m0.a;
                    C0657m0.f(this, false);
                    t2.a = i4;
                    t2.b = j;
                    t2.e = 5;
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    j3 = t2.b;
                    i4 = t2.a;
                    ResultKt.throwOnFailure(obj);
                    j = j3;
                    C0657m0 c0657m02 = C0657m0.a;
                    C0657m0.f(this, false);
                    t2.a = i4;
                    t2.b = j;
                    t2.e = 5;
                }
                j = j2;
                BDPlugin.Companion companion3 = BDPlugin.INSTANCE;
                t2.a = i4;
                t2.b = j;
                t2.e = 2;
                i3 = 2;
                e = BDPlugin.Companion.e(companion3, this.a, this.b, this.c, this.d, this.e, t2, 16);
            }
        }
        t = new T(this, continuationImpl);
        T t22 = t;
        Object obj2 = t22.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = t22.e;
        M0 m022 = this.b;
        if (i2 != 0) {
        }
        j = j2;
        BDPlugin.Companion companion32 = BDPlugin.INSTANCE;
        t22.a = i4;
        t22.b = j;
        t22.e = 2;
        i3 = 2;
        e = BDPlugin.Companion.e(companion32, this.a, this.b, this.c, this.d, this.e, t22, 16);
    }

    @Override // java.lang.Comparable
    public final int compareTo(U u) {
        int compareValuesBy;
        U other = u;
        Intrinsics.checkNotNullParameter(other, "other");
        compareValuesBy = ComparisonsKt__ComparisonsKt.compareValuesBy(this, other, (Function1<? super U, ? extends Comparable<?>>[]) ((Function1<? super Comparable, ? extends Comparable<?>>[]) new Function1[]{new Q(0), new S()}));
        return compareValuesBy;
    }
}
