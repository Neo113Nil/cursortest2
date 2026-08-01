package com.inmobi.media;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class M6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6709a;
    public final E6 b;
    public final Ng c;
    public final C3829jm d;
    public final String e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final CoroutineScope h;
    public D6 i;
    public Job j;

    public M6(String tableName, E6 mEventDao, Ng mPayloadProvider, D6 eventConfig, C3829jm c3829jm) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(mEventDao, "mEventDao");
        Intrinsics.checkNotNullParameter(mPayloadProvider, "mPayloadProvider");
        Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
        this.f6709a = tableName;
        this.b = mEventDao;
        this.c = mPayloadProvider;
        this.d = c3829jm;
        this.e = "M6";
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = AbstractC3904ma.d;
        this.i = eventConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(M6 listener, boolean z, ContinuationImpl continuationImpl) {
        G6 g6;
        Object coroutine_suspended;
        int i;
        boolean z2;
        D6 d6;
        Nm nm;
        Object a2;
        D6 d62;
        boolean z3;
        int i2;
        long j;
        Object a3;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        long j2;
        Nm nm2;
        long j3;
        boolean z6;
        D6 d63;
        F6 payload;
        listener.getClass();
        if (continuationImpl instanceof G6) {
            g6 = (G6) continuationImpl;
            int i6 = g6.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                g6.j = i6 - Integer.MIN_VALUE;
                G6 g62 = g6;
                Object obj = g62.h;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g62.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    D6 d64 = listener.i;
                    if (listener.g.get() || listener.f.get() || d64 == null) {
                        return Unit.INSTANCE;
                    }
                    String TAG = listener.e;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    long currentTimeMillis = System.currentTimeMillis() - (d64.b * 1000);
                    E6 e6 = listener.b;
                    g62.f6575a = null;
                    g62.b = d64;
                    z2 = z;
                    g62.c = z2;
                    g62.j = 1;
                    if (e6.a(currentTimeMillis, g62) != coroutine_suspended) {
                        d6 = d64;
                        nm = null;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = g62.c;
                        D6 d65 = g62.b;
                        nm = g62.f6575a;
                        ResultKt.throwOnFailure(obj);
                        d62 = d65;
                        int intValue = ((Number) obj).intValue();
                        Y5.f6965a.getClass();
                        int n = Y5.n();
                        D6 d66 = listener.i;
                        i2 = d66 != null ? 0 : n != 0 ? n != 1 ? d66.g : d66.e : d66.g;
                        j = d66 != null ? 0L : n != 0 ? n != 1 ? d66.j : d66.i : d66.j;
                        long j4 = d62.d;
                        g62.f6575a = nm;
                        g62.b = d62;
                        g62.c = z3;
                        g62.e = intValue;
                        g62.f = i2;
                        g62.g = j;
                        g62.j = 3;
                        a3 = listener.a(j4, g62);
                        if (a3 != coroutine_suspended) {
                            i3 = intValue;
                            z4 = z3;
                            obj = a3;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            long j5 = d62.c;
                            long j6 = d62.d;
                            g62.f6575a = nm;
                            g62.b = d62;
                            g62.c = z4;
                            g62.e = i3;
                            g62.f = i2;
                            g62.g = j;
                            g62.d = booleanValue;
                            g62.j = 4;
                            Nm nm3 = nm;
                            obj = listener.a(j5, j6, g62);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        long j7 = g62.g;
                        int i7 = g62.f;
                        int i8 = g62.e;
                        z4 = g62.c;
                        d62 = g62.b;
                        Nm nm4 = g62.f6575a;
                        ResultKt.throwOnFailure(obj);
                        j = j7;
                        i3 = i8;
                        nm = nm4;
                        i2 = i7;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        long j52 = d62.c;
                        long j62 = d62.d;
                        g62.f6575a = nm;
                        g62.b = d62;
                        g62.c = z4;
                        g62.e = i3;
                        g62.f = i2;
                        g62.g = j;
                        g62.d = booleanValue2;
                        g62.j = 4;
                        Nm nm32 = nm;
                        obj = listener.a(j52, j62, g62);
                        if (obj != coroutine_suspended) {
                            z5 = booleanValue2;
                            i4 = i3;
                            i5 = i2;
                            j2 = j;
                            nm2 = nm32;
                            boolean booleanValue3 = ((Boolean) obj).booleanValue();
                            if (i5 > i4) {
                            }
                            Ng ng = listener.c;
                            g62.f6575a = nm2;
                            g62.b = d62;
                            g62.c = z4;
                            g62.g = j2;
                            g62.j = 5;
                            obj = ng.a(g62);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j8 = g62.g;
                        boolean z7 = g62.c;
                        d63 = g62.b;
                        Nm nm5 = g62.f6575a;
                        ResultKt.throwOnFailure(obj);
                        z6 = z7;
                        nm2 = nm5;
                        j3 = j8;
                        payload = (F6) obj;
                        if (payload != null) {
                            listener.f.set(true);
                            Lazy lazy = O6.f6757a;
                            String str = d63.k;
                            int i9 = d63.f6506a + 1;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            O6.a(payload, str, i9, i9, j3, nm2, listener, z6);
                        }
                        return Unit.INSTANCE;
                    }
                    z5 = g62.d;
                    j2 = g62.g;
                    i5 = g62.f;
                    i4 = g62.e;
                    z4 = g62.c;
                    d62 = g62.b;
                    nm2 = g62.f6575a;
                    ResultKt.throwOnFailure(obj);
                    boolean booleanValue32 = ((Boolean) obj).booleanValue();
                    if (i5 > i4 || z5 || booleanValue32) {
                        Ng ng2 = listener.c;
                        g62.f6575a = nm2;
                        g62.b = d62;
                        g62.c = z4;
                        g62.g = j2;
                        g62.j = 5;
                        obj = ng2.a(g62);
                        if (obj != coroutine_suspended) {
                            j3 = j2;
                            z6 = z4;
                            d63 = d62;
                            payload = (F6) obj;
                            if (payload != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                boolean z8 = g62.c;
                D6 d67 = g62.b;
                Nm nm6 = g62.f6575a;
                ResultKt.throwOnFailure(obj);
                z2 = z8;
                d6 = d67;
                nm = nm6;
                E6 e62 = listener.b;
                g62.f6575a = nm;
                g62.b = d6;
                g62.c = z2;
                g62.j = 2;
                a2 = e62.a(g62);
                if (a2 != coroutine_suspended) {
                    d62 = d6;
                    obj = a2;
                    z3 = z2;
                    int intValue2 = ((Number) obj).intValue();
                    Y5.f6965a.getClass();
                    int n2 = Y5.n();
                    D6 d662 = listener.i;
                    if (d662 != null) {
                    }
                    if (d662 != null) {
                    }
                    long j42 = d62.d;
                    g62.f6575a = nm;
                    g62.b = d62;
                    g62.c = z3;
                    g62.e = intValue2;
                    g62.f = i2;
                    g62.g = j;
                    g62.j = 3;
                    a3 = listener.a(j42, g62);
                    if (a3 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        g6 = new G6(listener, continuationImpl);
        G6 g622 = g6;
        Object obj2 = g622.h;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g622.j;
        if (i != 0) {
        }
        E6 e622 = listener.b;
        g622.f6575a = nm;
        g622.b = d6;
        g622.c = z2;
        g622.j = 2;
        a2 = e622.a(g622);
        if (a2 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final long a() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "batch_processing_info");
        String key = this.f6709a + "_last_batch_process";
        Intrinsics.checkNotNullParameter(key, "key");
        return a2.f6510a.getLong(key, -1L);
    }

    public final void a(long j) {
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Cb.a(context, "batch_processing_info").a(this.f6709a + "_last_batch_process", j, false);
        }
    }

    public final void a(boolean z) {
        D6 d6 = this.i;
        if (this.g.get() || d6 == null) {
            return;
        }
        long j = d6.c;
        Job job = this.j;
        if (job == null || !job.isActive()) {
            String TAG = this.e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            CoroutineScope coroutineScope = this.h;
            D6 d62 = this.i;
            long a2 = a();
            if (a2 == -1) {
                a(System.currentTimeMillis());
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.j = AbstractC3727g4.a(coroutineScope, Math.max(0L, (timeUnit.toSeconds(a2) + (d62 != null ? d62.c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, j * 1000, new K6(this, z, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        H6 h6;
        int i;
        if (continuationImpl instanceof H6) {
            h6 = (H6) continuationImpl;
            int i2 = h6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6.d = i2 - Integer.MIN_VALUE;
                Object obj = h6.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h6.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    E6 e6 = this.b;
                    h6.f6597a = j;
                    h6.d = 1;
                    obj = e6.b(1, h6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = h6.f6597a;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return Boxing.boxBoolean(list.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((F2) list.get(0)).c) > j);
            }
        }
        h6 = new H6(this, continuationImpl);
        Object obj2 = h6.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h6.d;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        return Boxing.boxBoolean(list2.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((F2) list2.get(0)).c) > j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        L6 l6;
        int i;
        long seconds;
        if (continuationImpl instanceof L6) {
            l6 = (L6) continuationImpl;
            int i2 = l6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6.e = i2 - Integer.MIN_VALUE;
                Object obj = l6.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = l6.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    seconds = j + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    E6 e6 = this.b;
                    l6.f6689a = j2;
                    l6.b = seconds;
                    l6.e = 1;
                    obj = e6.b(1, l6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    seconds = l6.b;
                    j2 = l6.f6689a;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return Boxing.boxBoolean(list.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((F2) list.get(0)).c) >= j2);
            }
        }
        l6 = new L6(this, continuationImpl);
        Object obj2 = l6.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = l6.e;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        return Boxing.boxBoolean(list2.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((F2) list2.get(0)).c) >= j2);
    }
}
