package com.inmobi.media;

/* renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2331cg {
    public static com.inmobi.media.J8 b;
    public static com.inmobi.media.C2768t5 c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2331cg f5141a = new com.inmobi.media.C2331cg();
    public static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        if (r7 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r7 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2277ag c2277ag;
        int i;
        kotlin.Unit unit;
        com.inmobi.media.C2768t5 c2768t5;
        kotlin.Unit unit2;
        if (continuationImpl instanceof com.inmobi.media.C2277ag) {
            c2277ag = (com.inmobi.media.C2277ag) continuationImpl;
            int i2 = c2277ag.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2277ag.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2277ag.f5104a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2277ag.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
                    if (!((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getPingV2().getEnabled()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (d.compareAndSet(false, true)) {
                        com.inmobi.media.C2884xg c2884xg = new com.inmobi.media.C2884xg(com.inmobi.media.AbstractC2639o9.b());
                        b = new com.inmobi.media.J8(c2884xg);
                        c = new com.inmobi.media.C2768t5(c2884xg);
                        com.inmobi.media.J8 j8 = b;
                        if (j8 != null) {
                            c2277ag.c = 1;
                            com.inmobi.media.C2690q7 c2690q7 = j8.d;
                            c2690q7.getClass();
                            com.inmobi.media.EnumC2382eg enumC2382eg = com.inmobi.media.EnumC2382eg.b;
                            if (c2690q7.d == com.inmobi.media.EnumC2382eg.f5180a) {
                                c2690q7.d = enumC2382eg;
                                unit = c2690q7.b();
                                if (unit != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    unit = kotlin.Unit.INSTANCE;
                                }
                            } else {
                                unit = kotlin.Unit.INSTANCE;
                            }
                            if (unit != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                c2768t5 = c;
                if (c2768t5 != null) {
                    c2277ag.c = 2;
                    com.inmobi.media.C2538kf c2538kf = c2768t5.d;
                    c2538kf.getClass();
                    com.inmobi.media.EnumC2382eg enumC2382eg2 = com.inmobi.media.EnumC2382eg.b;
                    if (c2538kf.d == com.inmobi.media.EnumC2382eg.f5180a) {
                        c2538kf.d = enumC2382eg2;
                        unit2 = c2538kf.b();
                        if (unit2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            unit2 = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        unit2 = kotlin.Unit.INSTANCE;
                    }
                    if (unit2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        unit2 = kotlin.Unit.INSTANCE;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2277ag = new com.inmobi.media.C2277ag(this, continuationImpl);
        java.lang.Object obj2 = c2277ag.f5104a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2277ag.c;
        if (i != 0) {
        }
        c2768t5 = c;
        if (c2768t5 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2303bg c2303bg;
        int i;
        java.lang.Object obj;
        com.inmobi.media.C2768t5 c2768t5;
        java.lang.Object obj2;
        if (continuationImpl instanceof com.inmobi.media.C2303bg) {
            c2303bg = (com.inmobi.media.C2303bg) continuationImpl;
            int i2 = c2303bg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2303bg.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj3 = c2303bg.f5124a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2303bg.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    if (d.compareAndSet(true, false)) {
                        com.inmobi.media.J8 j8 = b;
                        if (j8 != null) {
                            c2303bg.c = 1;
                            com.inmobi.media.C2690q7 c2690q7 = j8.d;
                            c2690q7.getClass();
                            com.inmobi.media.EnumC2382eg enumC2382eg = com.inmobi.media.EnumC2382eg.f5180a;
                            if (c2690q7.d == com.inmobi.media.EnumC2382eg.b) {
                                c2690q7.d = enumC2382eg;
                                obj = c2690q7.e(c2303bg);
                                if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj = kotlin.Unit.INSTANCE;
                                }
                            } else {
                                obj = kotlin.Unit.INSTANCE;
                            }
                            if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj3);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj3);
                c2768t5 = c;
                if (c2768t5 != null) {
                    c2303bg.c = 2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("t5", "TAG");
                    com.inmobi.media.C2538kf c2538kf = c2768t5.d;
                    c2538kf.getClass();
                    com.inmobi.media.EnumC2382eg enumC2382eg2 = com.inmobi.media.EnumC2382eg.f5180a;
                    if (c2538kf.d == com.inmobi.media.EnumC2382eg.b) {
                        c2538kf.d = enumC2382eg2;
                        obj2 = c2538kf.d(c2303bg);
                        if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        obj2 = kotlin.Unit.INSTANCE;
                    }
                    if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj2 = kotlin.Unit.INSTANCE;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2303bg = new com.inmobi.media.C2303bg(this, continuationImpl);
        java.lang.Object obj32 = c2303bg.f5124a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2303bg.c;
        if (i != 0) {
        }
        c2768t5 = c;
        if (c2768t5 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
