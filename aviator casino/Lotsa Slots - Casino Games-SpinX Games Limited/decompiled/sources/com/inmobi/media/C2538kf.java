package com.inmobi.media;

/* renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2538kf extends com.inmobi.media.AbstractC2462hg {
    public final kotlinx.coroutines.sync.Mutex f;
    public kotlinx.coroutines.Job g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2538kf(com.inmobi.media.C2884xg dao, com.inmobi.media.C2713r5 listener, com.inmobi.media.C2698qf networkHandler) {
        super(dao, listener, networkHandler);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC2462hg
    public final kotlin.Unit b() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2435gf(this, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r12.isCancelled() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0052, B:17:0x005d, B:21:0x0063, B:23:0x0076, B:26:0x007c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0052, B:17:0x005d, B:21:0x0063, B:23:0x0076, B:26:0x007c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[Catch: all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:11:0x0045, B:13:0x0049, B:15:0x0052, B:17:0x005d, B:21:0x0063, B:23:0x0076, B:26:0x007c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2461hf c2461hf;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.Job job;
        long normal;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2461hf) {
                c2461hf = (com.inmobi.media.C2461hf) continuationImpl;
                int i2 = c2461hf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2461hf.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2461hf.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2461hf.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f;
                        c2461hf.f5241a = mutex2;
                        c2461hf.d = 1;
                        if (mutex2.lock(null, c2461hf) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2461hf.f5241a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(job);
                        if (job.isCompleted()) {
                            kotlinx.coroutines.Job job2 = this.g;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(job2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    normal = com.inmobi.media.AbstractC2462hg.a().getInterval().getNormal();
                    if (normal > 0) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.g = com.inmobi.media.J3.a(com.inmobi.media.H9.c, 0L, normal * 1000, new com.inmobi.media.Cif(this, null));
                    return kotlin.Unit.INSTANCE;
                }
            }
            job = this.g;
            if (job != null) {
            }
            normal = com.inmobi.media.AbstractC2462hg.a().getInterval().getNormal();
            if (normal > 0) {
            }
        } finally {
            mutex.unlock(null);
        }
        c2461hf = new com.inmobi.media.C2461hf(this, continuationImpl);
        java.lang.Object obj2 = c2461hf.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2461hf.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2512jf c2512jf;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.Job job;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2512jf) {
                c2512jf = (com.inmobi.media.C2512jf) continuationImpl;
                int i2 = c2512jf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2512jf.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2512jf.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2512jf.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f;
                        c2512jf.f5278a = mutex2;
                        c2512jf.d = 1;
                        if (mutex2.lock(null, c2512jf) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2512jf.f5278a;
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
        c2512jf = new com.inmobi.media.C2512jf(this, continuationImpl);
        java.lang.Object obj2 = c2512jf.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2512jf.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r14.a(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc A[LOOP:0: B:30:0x00d6->B:32:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2356df c2356df;
        int i;
        int normal;
        java.util.List list;
        java.util.Iterator it;
        java.lang.Object obj;
        if (continuationImpl instanceof com.inmobi.media.C2356df) {
            c2356df = (com.inmobi.media.C2356df) continuationImpl;
            int i2 = c2356df.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2356df.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = c2356df.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2356df.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (this.d == com.inmobi.media.EnumC2382eg.b) {
                        normal = com.inmobi.media.AbstractC2462hg.a().getMaxBatchSize().getNormal();
                        com.inmobi.media.C2884xg c2884xg = this.f5242a;
                        long normal2 = com.inmobi.media.AbstractC2462hg.a().getExpiry().getNormal() * 1000;
                        c2356df.f5161a = normal;
                        c2356df.e = 1;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            list = (java.util.List) obj2;
                            if (list.isEmpty()) {
                                com.inmobi.media.C2884xg c2884xg2 = this.f5242a;
                                c2356df.b = list;
                                c2356df.e = 3;
                                obj2 = c2884xg2.b(com.adjust.sdk.Constants.NORMAL, c2356df);
                            }
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        }
                        list = c2356df.b;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (((java.lang.Number) obj2).intValue() == 0) {
                            c2356df.b = null;
                            c2356df.e = 4;
                            com.inmobi.media.EnumC2382eg enumC2382eg = com.inmobi.media.EnumC2382eg.f5180a;
                            if (this.d == com.inmobi.media.EnumC2382eg.b) {
                                this.d = enumC2382eg;
                                obj = d(c2356df);
                                if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj = kotlin.Unit.INSTANCE;
                                }
                            } else {
                                obj = kotlin.Unit.INSTANCE;
                            }
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2408ff(this, (com.inmobi.media.Zf) it.next(), null), 3, null);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    normal = c2356df.f5161a;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                com.inmobi.media.C2884xg c2884xg3 = this.f5242a;
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(normal);
                c2356df.e = 2;
                obj2 = c2884xg3.a(com.adjust.sdk.Constants.NORMAL, boxInt, c2356df);
            }
        }
        c2356df = new com.inmobi.media.C2356df(this, continuationImpl);
        java.lang.Object obj22 = c2356df.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2356df.e;
        if (i != 0) {
        }
        com.inmobi.media.C2884xg c2884xg32 = this.f5242a;
        java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(normal);
        c2356df.e = 2;
        obj22 = c2884xg32.a(com.adjust.sdk.Constants.NORMAL, boxInt2, c2356df);
    }
}
