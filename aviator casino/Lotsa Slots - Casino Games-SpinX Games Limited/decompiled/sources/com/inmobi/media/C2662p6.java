package com.inmobi.media;

/* renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2662p6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5384a;
    public final com.inmobi.media.AbstractC2452h6 b;
    public final com.inmobi.media.Rf c;
    public final com.inmobi.media.C2624nk d;
    public final java.lang.String e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final kotlinx.coroutines.CoroutineScope h;
    public com.inmobi.media.C2426g6 i;
    public kotlinx.coroutines.Job j;

    public C2662p6(java.lang.String tableName, com.inmobi.media.AbstractC2452h6 mEventDao, com.inmobi.media.Rf mPayloadProvider, com.inmobi.media.C2426g6 eventConfig, com.inmobi.media.C2624nk c2624nk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mEventDao, "mEventDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mPayloadProvider, "mPayloadProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
        this.f5384a = tableName;
        this.b = mEventDao;
        this.c = mPayloadProvider;
        this.d = c2624nk;
        this.e = "p6";
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = com.inmobi.media.H9.c;
        this.i = eventConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.C2662p6 listener, boolean z, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2503j6 c2503j6;
        java.lang.Object coroutine_suspended;
        int i;
        boolean z2;
        com.inmobi.media.C2426g6 c2426g6;
        com.inmobi.media.Rk rk;
        java.lang.Object a2;
        com.inmobi.media.C2426g6 c2426g62;
        boolean z3;
        int i2;
        long j;
        java.lang.Object a3;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        long j2;
        com.inmobi.media.Rk rk2;
        long j3;
        boolean z6;
        com.inmobi.media.C2426g6 c2426g63;
        com.inmobi.media.C2478i6 payload;
        listener.getClass();
        if (continuationImpl instanceof com.inmobi.media.C2503j6) {
            c2503j6 = (com.inmobi.media.C2503j6) continuationImpl;
            int i6 = c2503j6.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c2503j6.j = i6 - Integer.MIN_VALUE;
                com.inmobi.media.C2503j6 c2503j62 = c2503j6;
                java.lang.Object obj = c2503j62.h;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2503j62.j;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2426g6 c2426g64 = listener.i;
                    if (listener.g.get() || listener.f.get() || c2426g64 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String TAG = listener.e;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - (c2426g64.b * 1000);
                    com.inmobi.media.AbstractC2452h6 abstractC2452h6 = listener.b;
                    c2503j62.f5272a = null;
                    c2503j62.b = c2426g64;
                    z2 = z;
                    c2503j62.c = z2;
                    c2503j62.j = 1;
                    if (abstractC2452h6.a(currentTimeMillis, c2503j62) != coroutine_suspended) {
                        c2426g6 = c2426g64;
                        rk = null;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = c2503j62.c;
                        com.inmobi.media.C2426g6 c2426g65 = c2503j62.b;
                        rk = c2503j62.f5272a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        c2426g62 = c2426g65;
                        int intValue = ((java.lang.Number) obj).intValue();
                        com.inmobi.media.B5.f4614a.getClass();
                        int n = com.inmobi.media.B5.n();
                        com.inmobi.media.C2426g6 c2426g66 = listener.i;
                        i2 = c2426g66 != null ? 0 : n != 0 ? n != 1 ? c2426g66.g : c2426g66.e : c2426g66.g;
                        j = c2426g66 != null ? 0L : n != 0 ? n != 1 ? c2426g66.j : c2426g66.i : c2426g66.j;
                        long j4 = c2426g62.d;
                        c2503j62.f5272a = rk;
                        c2503j62.b = c2426g62;
                        c2503j62.c = z3;
                        c2503j62.e = intValue;
                        c2503j62.f = i2;
                        c2503j62.g = j;
                        c2503j62.j = 3;
                        a3 = listener.a(j4, c2503j62);
                        if (a3 != coroutine_suspended) {
                            i3 = intValue;
                            z4 = z3;
                            obj = a3;
                            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                            long j5 = c2426g62.c;
                            long j6 = c2426g62.d;
                            c2503j62.f5272a = rk;
                            c2503j62.b = c2426g62;
                            c2503j62.c = z4;
                            c2503j62.e = i3;
                            c2503j62.f = i2;
                            c2503j62.g = j;
                            c2503j62.d = booleanValue;
                            c2503j62.j = 4;
                            com.inmobi.media.Rk rk3 = rk;
                            obj = listener.a(j5, j6, c2503j62);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        long j7 = c2503j62.g;
                        int i7 = c2503j62.f;
                        int i8 = c2503j62.e;
                        z4 = c2503j62.c;
                        c2426g62 = c2503j62.b;
                        com.inmobi.media.Rk rk4 = c2503j62.f5272a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        j = j7;
                        i3 = i8;
                        rk = rk4;
                        i2 = i7;
                        boolean booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        long j52 = c2426g62.c;
                        long j62 = c2426g62.d;
                        c2503j62.f5272a = rk;
                        c2503j62.b = c2426g62;
                        c2503j62.c = z4;
                        c2503j62.e = i3;
                        c2503j62.f = i2;
                        c2503j62.g = j;
                        c2503j62.d = booleanValue2;
                        c2503j62.j = 4;
                        com.inmobi.media.Rk rk32 = rk;
                        obj = listener.a(j52, j62, c2503j62);
                        if (obj != coroutine_suspended) {
                            z5 = booleanValue2;
                            i4 = i3;
                            i5 = i2;
                            j2 = j;
                            rk2 = rk32;
                            boolean booleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                            if (i5 > i4) {
                            }
                            com.inmobi.media.Rf rf = listener.c;
                            c2503j62.f5272a = rk2;
                            c2503j62.b = c2426g62;
                            c2503j62.c = z4;
                            c2503j62.g = j2;
                            c2503j62.j = 5;
                            obj = rf.a(c2503j62);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j8 = c2503j62.g;
                        boolean z7 = c2503j62.c;
                        c2426g63 = c2503j62.b;
                        com.inmobi.media.Rk rk5 = c2503j62.f5272a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        z6 = z7;
                        rk2 = rk5;
                        j3 = j8;
                        payload = (com.inmobi.media.C2478i6) obj;
                        if (payload != null) {
                            listener.f.set(true);
                            kotlin.Lazy lazy = com.inmobi.media.AbstractC2714r6.f5420a;
                            java.lang.String str = c2426g63.k;
                            int i9 = c2426g63.f5213a + 1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
                            com.inmobi.media.AbstractC2714r6.a(payload, str, i9, i9, j3, rk2, listener, z6);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    z5 = c2503j62.d;
                    j2 = c2503j62.g;
                    i5 = c2503j62.f;
                    i4 = c2503j62.e;
                    z4 = c2503j62.c;
                    c2426g62 = c2503j62.b;
                    rk2 = c2503j62.f5272a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean booleanValue32 = ((java.lang.Boolean) obj).booleanValue();
                    if (i5 > i4 || z5 || booleanValue32) {
                        com.inmobi.media.Rf rf2 = listener.c;
                        c2503j62.f5272a = rk2;
                        c2503j62.b = c2426g62;
                        c2503j62.c = z4;
                        c2503j62.g = j2;
                        c2503j62.j = 5;
                        obj = rf2.a(c2503j62);
                        if (obj != coroutine_suspended) {
                            j3 = j2;
                            z6 = z4;
                            c2426g63 = c2426g62;
                            payload = (com.inmobi.media.C2478i6) obj;
                            if (payload != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                boolean z8 = c2503j62.c;
                com.inmobi.media.C2426g6 c2426g67 = c2503j62.b;
                com.inmobi.media.Rk rk6 = c2503j62.f5272a;
                kotlin.ResultKt.throwOnFailure(obj);
                z2 = z8;
                c2426g6 = c2426g67;
                rk = rk6;
                com.inmobi.media.AbstractC2452h6 abstractC2452h62 = listener.b;
                c2503j62.f5272a = rk;
                c2503j62.b = c2426g6;
                c2503j62.c = z2;
                c2503j62.j = 2;
                a2 = abstractC2452h62.a(c2503j62);
                if (a2 != coroutine_suspended) {
                    c2426g62 = c2426g6;
                    obj = a2;
                    z3 = z2;
                    int intValue2 = ((java.lang.Number) obj).intValue();
                    com.inmobi.media.B5.f4614a.getClass();
                    int n2 = com.inmobi.media.B5.n();
                    com.inmobi.media.C2426g6 c2426g662 = listener.i;
                    if (c2426g662 != null) {
                    }
                    if (c2426g662 != null) {
                    }
                    long j42 = c2426g62.d;
                    c2503j62.f5272a = rk;
                    c2503j62.b = c2426g62;
                    c2503j62.c = z3;
                    c2503j62.e = intValue2;
                    c2503j62.f = i2;
                    c2503j62.g = j;
                    c2503j62.j = 3;
                    a3 = listener.a(j42, c2503j62);
                    if (a3 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        c2503j6 = new com.inmobi.media.C2503j6(listener, continuationImpl);
        com.inmobi.media.C2503j6 c2503j622 = c2503j6;
        java.lang.Object obj2 = c2503j622.h;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2503j622.j;
        if (i != 0) {
        }
        com.inmobi.media.AbstractC2452h6 abstractC2452h622 = listener.b;
        c2503j622.f5272a = rk;
        c2503j622.b = c2426g6;
        c2503j622.c = z2;
        c2503j622.j = 2;
        a2 = abstractC2452h622.a(c2503j622);
        if (a2 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final long a() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return -1L;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "batch_processing_info");
        java.lang.String key = this.f5384a + "_last_batch_process";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return a2.f4815a.getLong(key, -1L);
    }

    public final void a(long j) {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            com.inmobi.media.Ka.a(context, "batch_processing_info").a(this.f5384a + "_last_batch_process", j, false);
        }
    }

    public final void a(boolean z) {
        com.inmobi.media.C2426g6 c2426g6 = this.i;
        if (this.g.get() || c2426g6 == null) {
            return;
        }
        long j = c2426g6.c;
        kotlinx.coroutines.Job job = this.j;
        if (job == null || !job.isActive()) {
            java.lang.String TAG = this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            kotlinx.coroutines.CoroutineScope coroutineScope = this.h;
            com.inmobi.media.C2426g6 c2426g62 = this.i;
            long a2 = a();
            if (a2 == -1) {
                a(java.lang.System.currentTimeMillis());
            }
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.j = com.inmobi.media.J3.a(coroutineScope, java.lang.Math.max(0L, (timeUnit.toSeconds(a2) + (c2426g62 != null ? c2426g62.c : 0L)) - timeUnit.toSeconds(java.lang.System.currentTimeMillis())) * 1000, j * 1000, new com.inmobi.media.C2610n6(this, z, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(long j, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2529k6 c2529k6;
        int i;
        if (continuationImpl instanceof com.inmobi.media.C2529k6) {
            c2529k6 = (com.inmobi.media.C2529k6) continuationImpl;
            int i2 = c2529k6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2529k6.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2529k6.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2529k6.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.AbstractC2452h6 abstractC2452h6 = this.b;
                    c2529k6.f5288a = j;
                    c2529k6.d = 1;
                    obj = abstractC2452h6.b(1, c2529k6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c2529k6.f5288a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List list = (java.util.List) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list.isEmpty() && java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis() - ((com.inmobi.media.AbstractC2499j2) list.get(0)).c) > j);
            }
        }
        c2529k6 = new com.inmobi.media.C2529k6(this, continuationImpl);
        java.lang.Object obj2 = c2529k6.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2529k6.d;
        if (i != 0) {
        }
        java.util.List list2 = (java.util.List) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list2.isEmpty() && java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis() - ((com.inmobi.media.AbstractC2499j2) list2.get(0)).c) > j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(long j, long j2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2636o6 c2636o6;
        int i;
        long seconds;
        if (continuationImpl instanceof com.inmobi.media.C2636o6) {
            c2636o6 = (com.inmobi.media.C2636o6) continuationImpl;
            int i2 = c2636o6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2636o6.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2636o6.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2636o6.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    seconds = j + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis());
                    com.inmobi.media.AbstractC2452h6 abstractC2452h6 = this.b;
                    c2636o6.f5368a = j2;
                    c2636o6.b = seconds;
                    c2636o6.e = 1;
                    obj = abstractC2452h6.b(1, c2636o6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    seconds = c2636o6.b;
                    j2 = c2636o6.f5368a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List list = (java.util.List) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list.isEmpty() && seconds - java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(((com.inmobi.media.AbstractC2499j2) list.get(0)).c) >= j2);
            }
        }
        c2636o6 = new com.inmobi.media.C2636o6(this, continuationImpl);
        java.lang.Object obj2 = c2636o6.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2636o6.e;
        if (i != 0) {
        }
        java.util.List list2 = (java.util.List) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list2.isEmpty() && seconds - java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(((com.inmobi.media.AbstractC2499j2) list2.get(0)).c) >= j2);
    }
}
