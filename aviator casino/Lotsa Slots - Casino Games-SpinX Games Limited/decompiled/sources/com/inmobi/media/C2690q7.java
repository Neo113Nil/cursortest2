package com.inmobi.media;

/* renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2690q7 extends com.inmobi.media.AbstractC2462hg {
    public static final /* synthetic */ int h = 0;
    public final kotlinx.coroutines.sync.Mutex f;
    public kotlinx.coroutines.Job g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2690q7(com.inmobi.media.C2884xg dao, com.inmobi.media.I8 listener, com.inmobi.media.C2698qf networkHandler) {
        super(dao, listener, networkHandler);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC2462hg
    public final kotlin.Unit b() {
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.H9.d;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.C2557l7(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.C2583m7(this, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r1 == r9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cf -> B:11:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2479i7 c2479i7;
        int i;
        long j;
        int i2;
        java.util.List list;
        com.inmobi.media.C2479i7 c2479i72;
        int i3;
        long j2;
        if (continuationImpl instanceof com.inmobi.media.C2479i7) {
            c2479i7 = (com.inmobi.media.C2479i7) continuationImpl;
            int i4 = c2479i7.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2479i7.e = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = c2479i7.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2479i7.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                    int high = com.inmobi.media.AbstractC2462hg.a().getMaxBatchSize().getHigh();
                    com.inmobi.media.C2884xg c2884xg = this.f5242a;
                    java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(high);
                    c2479i7.f5255a = currentTimeMillis;
                    c2479i7.b = high;
                    c2479i7.e = 1;
                    java.lang.Object a2 = c2884xg.a(boxInt, com.adjust.sdk.Constants.HIGH, currentTimeMillis, c2479i7);
                    if (a2 != coroutine_suspended) {
                        j = currentTimeMillis;
                        i2 = high;
                        obj = a2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    i2 = c2479i7.b;
                    j = c2479i7.f5255a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = c2479i7.b;
                    long j3 = c2479i7.f5255a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    c2479i72 = c2479i7;
                    i3 = i5;
                    j2 = j3;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                        if (!this.e.containsKey(((com.inmobi.media.Zf) obj2).b)) {
                            arrayList.add(obj2);
                        }
                    }
                    list = kotlin.collections.CollectionsKt.take(arrayList, i3);
                    if (!list.isEmpty() || this.d != com.inmobi.media.EnumC2382eg.b) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                    list.size();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2530k7(this, (com.inmobi.media.Zf) it.next(), null), 3, null);
                    }
                    com.inmobi.media.C2884xg c2884xg2 = this.f5242a;
                    c2479i72.f5255a = j2;
                    c2479i72.b = i3;
                    c2479i72.e = 2;
                    obj = c2884xg2.a(null, com.adjust.sdk.Constants.HIGH, j2, c2479i72);
                }
                list = (java.util.List) obj;
                c2479i72 = c2479i7;
                i3 = i2;
                j2 = j;
                if (!list.isEmpty()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2479i7 = new com.inmobi.media.C2479i7(this, continuationImpl);
        java.lang.Object obj3 = c2479i7.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2479i7.e;
        if (i != 0) {
        }
        list = (java.util.List) obj3;
        c2479i72 = c2479i7;
        i3 = i2;
        j2 = j;
        if (!list.isEmpty()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x004f, B:19:0x0055, B:21:0x0068, B:24:0x006e), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x0091, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x004f, B:19:0x0055, B:21:0x0068, B:24:0x006e), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2611n7 c2611n7;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.Job job;
        long high;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2611n7) {
                c2611n7 = (com.inmobi.media.C2611n7) continuationImpl;
                int i2 = c2611n7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2611n7.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2611n7.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2611n7.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f;
                        c2611n7.f5352a = mutex2;
                        c2611n7.d = 1;
                        if (mutex2.lock(null, c2611n7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2611n7.f5352a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job == null && job.isActive()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    high = com.inmobi.media.AbstractC2462hg.a().getInterval().getHigh();
                    if (high > 0) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.H9.d;
                    kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
                    this.g = com.inmobi.media.J3.a(coroutineScope, 0L, high * 1000, new com.inmobi.media.C2637o7(this, null));
                    return kotlin.Unit.INSTANCE;
                }
            }
            job = this.g;
            if (job == null) {
            }
            high = com.inmobi.media.AbstractC2462hg.a().getInterval().getHigh();
            if (high > 0) {
            }
        } finally {
            mutex.unlock(null);
        }
        c2611n7 = new com.inmobi.media.C2611n7(this, continuationImpl);
        java.lang.Object obj2 = c2611n7.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2611n7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2663p7 c2663p7;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.Job job;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2663p7) {
                c2663p7 = (com.inmobi.media.C2663p7) continuationImpl;
                int i2 = c2663p7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2663p7.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2663p7.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2663p7.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f;
                        c2663p7.f5385a = mutex2;
                        c2663p7.d = 1;
                        if (mutex2.lock(null, c2663p7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2663p7.f5385a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    this.g = null;
                    return kotlin.Unit.INSTANCE;
                }
            }
            job = this.g;
            if (job != null) {
            }
            this.g = null;
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c2663p7 = new com.inmobi.media.C2663p7(this, continuationImpl);
        java.lang.Object obj2 = c2663p7.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2663p7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(9:19|20|21|(2:23|(2:25|(1:27)(1:30))(1:31))|32|(2:35|33)|36|37|38))(8:39|40|(4:42|(2:44|29)|21|(0))|32|(1:33)|36|37|38))(2:45|46))(3:50|51|(2:53|(2:55|29))(2:56|57))|47|(2:49|29)|40|(0)|32|(1:33)|36|37|38))|62|6|7|(0)(0)|47|(0)|40|(0)|32|(1:33)|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
    
        if (r0 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf A[Catch: Error -> 0x0050, Exception -> 0x0053, TryCatch #2 {Error -> 0x0050, Exception -> 0x0053, blocks: (B:13:0x0039, B:14:0x00e0, B:20:0x0048, B:21:0x00b7, B:23:0x00bf, B:25:0x00cb, B:30:0x00d8, B:31:0x00db, B:32:0x00e3, B:33:0x00ed, B:35:0x00f3, B:39:0x004c, B:40:0x00a1, B:42:0x00aa, B:46:0x0058, B:47:0x0092, B:51:0x005f, B:53:0x0068, B:56:0x010c), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3 A[Catch: Error -> 0x0050, Exception -> 0x0053, LOOP:0: B:33:0x00ed->B:35:0x00f3, LOOP_END, TryCatch #2 {Error -> 0x0050, Exception -> 0x0053, blocks: (B:13:0x0039, B:14:0x00e0, B:20:0x0048, B:21:0x00b7, B:23:0x00bf, B:25:0x00cb, B:30:0x00d8, B:31:0x00db, B:32:0x00e3, B:33:0x00ed, B:35:0x00f3, B:39:0x004c, B:40:0x00a1, B:42:0x00aa, B:46:0x0058, B:47:0x0092, B:51:0x005f, B:53:0x0068, B:56:0x010c), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: Error -> 0x0050, Exception -> 0x0053, TryCatch #2 {Error -> 0x0050, Exception -> 0x0053, blocks: (B:13:0x0039, B:14:0x00e0, B:20:0x0048, B:21:0x00b7, B:23:0x00bf, B:25:0x00cb, B:30:0x00d8, B:31:0x00db, B:32:0x00e3, B:33:0x00ed, B:35:0x00f3, B:39:0x004c, B:40:0x00a1, B:42:0x00aa, B:46:0x0058, B:47:0x0092, B:51:0x005f, B:53:0x0068, B:56:0x010c), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2400f7 c2400f7;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        int high;
        java.util.List list;
        java.util.Iterator it;
        java.lang.Object obj2;
        if (continuationImpl instanceof com.inmobi.media.C2400f7) {
            c2400f7 = (com.inmobi.media.C2400f7) continuationImpl;
            int i2 = c2400f7.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2400f7.e = i2 - Integer.MIN_VALUE;
                obj = c2400f7.c;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2400f7.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                    if (this.d != com.inmobi.media.EnumC2382eg.b) {
                        return kotlin.Unit.INSTANCE;
                    }
                    high = com.inmobi.media.AbstractC2462hg.a().getMaxBatchSize().getHigh();
                    com.inmobi.media.C2884xg c2884xg = this.f5242a;
                    long high2 = com.inmobi.media.AbstractC2462hg.a().getExpiry().getHigh() * 1000;
                    c2400f7.f5194a = high;
                    c2400f7.e = 1;
                    if (c2884xg.a(high2, c2400f7) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            list = (java.util.List) obj;
                            if (list.isEmpty()) {
                                com.inmobi.media.C2884xg c2884xg2 = this.f5242a;
                                c2400f7.b = list;
                                c2400f7.e = 3;
                                obj = c2884xg2.b(com.adjust.sdk.Constants.HIGH, c2400f7);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((java.lang.Number) obj).intValue() == 0) {
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                            list.size();
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        list = c2400f7.b;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Number) obj).intValue() == 0) {
                            c2400f7.b = null;
                            c2400f7.e = 4;
                            com.inmobi.media.EnumC2382eg enumC2382eg = com.inmobi.media.EnumC2382eg.f5180a;
                            if (this.d == com.inmobi.media.EnumC2382eg.b) {
                                this.d = enumC2382eg;
                                obj2 = e(c2400f7);
                                if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj2 = kotlin.Unit.INSTANCE;
                                }
                            } else {
                                obj2 = kotlin.Unit.INSTANCE;
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                        list.size();
                        it = list.iterator();
                        while (it.hasNext()) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2453h7(this, (com.inmobi.media.Zf) it.next(), null), 3, null);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    high = c2400f7.f5194a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.inmobi.media.C2884xg c2884xg3 = this.f5242a;
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(high);
                c2400f7.e = 2;
                obj = c2884xg3.b(com.adjust.sdk.Constants.HIGH, boxInt, c2400f7);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (java.util.List) obj;
                if (list.isEmpty()) {
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
                list.size();
                it = list.iterator();
                while (it.hasNext()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2400f7 = new com.inmobi.media.C2400f7(this, continuationImpl);
        obj = c2400f7.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2400f7.e;
        if (i != 0) {
        }
        com.inmobi.media.C2884xg c2884xg32 = this.f5242a;
        java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(high);
        c2400f7.e = 2;
        obj = c2884xg32.b(com.adjust.sdk.Constants.HIGH, boxInt2, c2400f7);
        if (obj == coroutine_suspended) {
        }
        list = (java.util.List) obj;
        if (list.isEmpty()) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("q7", "TAG");
        list.size();
        it = list.iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
