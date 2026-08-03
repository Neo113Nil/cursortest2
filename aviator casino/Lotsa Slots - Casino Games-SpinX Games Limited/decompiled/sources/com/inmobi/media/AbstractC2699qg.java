package com.inmobi.media;

/* renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2699qg {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2884xg f5411a;
    public final java.util.concurrent.ConcurrentHashMap b;
    public final com.inmobi.media.C2698qf c;

    public AbstractC2699qg(com.inmobi.media.C2884xg dao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        this.f5411a = dao;
        this.b = new java.util.concurrent.ConcurrentHashMap();
        this.c = new com.inmobi.media.C2698qf(a());
    }

    public static void a(com.inmobi.media.Zf zf, short s) {
        com.inmobi.media.C2781ti c2781ti = zf.k;
        if (c2781ti == null) {
            com.inmobi.media.Ui ui = com.inmobi.media.AbstractC2724rg.f5429a;
            com.inmobi.media.AbstractC2724rg.a("PingFailed", kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("trigger", zf.e), kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(s)), kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(zf.g))));
            return;
        }
        com.inmobi.media.C2936zi c2936zi = new com.inmobi.media.C2936zi(c2781ti);
        java.lang.String priority = zf.e;
        int i = zf.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
        java.util.Map a2 = c2936zi.a();
        a2.put("errorCode", java.lang.Short.valueOf(s));
        a2.put("trigger", priority);
        a2.put("retryCount", java.lang.String.valueOf(i));
        com.inmobi.media.AbstractC2724rg.a("PingFailed", a2);
    }

    public static com.inmobi.media.core.config.models.AdConfig.PingsV2Config a() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2673pg c2673pg;
        java.lang.Object obj;
        int i;
        com.inmobi.media.Zf zf;
        if (continuationImpl instanceof com.inmobi.media.C2673pg) {
            c2673pg = (com.inmobi.media.C2673pg) continuationImpl;
            int i2 = c2673pg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2673pg.d = i2 - Integer.MIN_VALUE;
                obj = c2673pg.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2673pg.d;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2884xg c2884xg = this.f5411a;
                    c2673pg.f5393a = str;
                    c2673pg.d = 1;
                    com.inmobi.media.C2613n9 c2613n9 = c2884xg.f5552a;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2375e9(c2613n9, "SELECT COUNT(*) FROM pings", null), c2673pg);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = c2673pg.f5393a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            zf = (com.inmobi.media.Zf) obj;
                            if (zf == null) {
                                com.inmobi.media.C2884xg c2884xg2 = this.f5411a;
                                c2673pg.f5393a = str;
                                c2673pg.d = 3;
                                obj = c2884xg2.a(com.adjust.sdk.Constants.HIGH, c2673pg);
                            }
                            if (zf != null) {
                            }
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                        }
                        if (i == 3) {
                            str = c2673pg.f5393a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            zf = (com.inmobi.media.Zf) obj;
                            if (zf != null) {
                            }
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                        }
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = c2673pg.f5393a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        zf = (com.inmobi.media.Zf) obj;
                        if (zf != null) {
                            a(zf, (short) (kotlin.jvm.internal.Intrinsics.areEqual(str, com.adjust.sdk.Constants.HIGH) ? 2259 : 2260));
                        } else {
                            z = false;
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                    }
                    str = c2673pg.f5393a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Number) obj).intValue() >= a().getMaxEntries()) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                com.inmobi.media.Ui ui = com.inmobi.media.AbstractC2724rg.f5429a;
                com.inmobi.media.AbstractC2724rg.a("PingDBMaxLimitReached", new java.util.LinkedHashMap());
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.adjust.sdk.Constants.HIGH)) {
                    com.inmobi.media.C2884xg c2884xg3 = this.f5411a;
                    c2673pg.f5393a = str;
                    c2673pg.d = 2;
                    obj = c2884xg3.a(com.adjust.sdk.Constants.NORMAL, c2673pg);
                } else {
                    com.inmobi.media.C2884xg c2884xg4 = this.f5411a;
                    c2673pg.f5393a = str;
                    c2673pg.d = 4;
                    obj = c2884xg4.a(com.adjust.sdk.Constants.NORMAL, c2673pg);
                }
                return coroutine_suspended;
            }
        }
        c2673pg = new com.inmobi.media.C2673pg(this, continuationImpl);
        obj = c2673pg.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2673pg.d;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((java.lang.Number) obj).intValue() >= a().getMaxEntries()) {
        }
    }

    public static void a(int i, java.lang.String str, short s, com.inmobi.media.Zf ping, long j, com.inmobi.media.InterfaceC2620ng interfaceC2620ng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ping, "ping");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qg", "getSimpleName(...)");
        java.lang.String str2 = ping.f5085a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qg", "getSimpleName(...)");
        int i2 = ping.g;
        java.util.Objects.toString(interfaceC2620ng);
        if (interfaceC2620ng != null) {
            ((com.inmobi.media.C2592mg) interfaceC2620ng).a(ping, i, str, ping.g, j);
        } else {
            a(ping, s);
        }
    }

    public static void a(com.inmobi.media.C2409fg c2409fg, com.inmobi.media.InterfaceC2620ng interfaceC2620ng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qg", "getSimpleName(...)");
        java.lang.String str = c2409fg.f5201a.f5085a;
        int i = c2409fg.b;
        long j = c2409fg.d;
        java.util.Objects.toString(interfaceC2620ng);
        if (interfaceC2620ng != null) {
            ((com.inmobi.media.C2592mg) interfaceC2620ng).a(c2409fg.f5201a, c2409fg.b, c2409fg.d);
            return;
        }
        com.inmobi.media.Zf zf = c2409fg.f5201a;
        com.inmobi.media.C2781ti c2781ti = zf.k;
        if (c2781ti != null) {
            com.inmobi.media.C2936zi c2936zi = new com.inmobi.media.C2936zi(c2781ti);
            java.lang.String priority = zf.e;
            long j2 = zf.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
            java.util.Map a2 = c2936zi.a();
            a2.put("trigger", priority);
            a2.put("latency", java.lang.Long.valueOf(j2));
            com.inmobi.media.AbstractC2724rg.a("PingSuccess", a2);
            return;
        }
        com.inmobi.media.Ui ui = com.inmobi.media.AbstractC2724rg.f5429a;
        com.inmobi.media.AbstractC2724rg.a("PingSuccess", kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("trigger", zf.e), kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(zf.g))));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.C2409fg c2409fg, com.inmobi.media.InterfaceC2620ng interfaceC2620ng, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2646og c2646og;
        int i;
        int maxRetries;
        kotlin.Pair pair;
        com.inmobi.media.C2409fg c2409fg2;
        com.inmobi.media.Zf zf;
        com.inmobi.media.InterfaceC2620ng interfaceC2620ng2;
        com.inmobi.media.InterfaceC2620ng interfaceC2620ng3;
        com.inmobi.media.Zf zf2;
        com.inmobi.media.InterfaceC2620ng interfaceC2620ng4;
        com.inmobi.media.C2409fg c2409fg3 = c2409fg;
        if (continuation instanceof com.inmobi.media.C2646og) {
            c2646og = (com.inmobi.media.C2646og) continuation;
            int i2 = c2646og.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2646og.f = i2 - Integer.MIN_VALUE;
                com.inmobi.media.C2646og c2646og2 = c2646og;
                java.lang.Object obj = c2646og2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2646og2.f;
                if (i == 0) {
                    if (i == 1) {
                        com.inmobi.media.InterfaceC2620ng interfaceC2620ng5 = c2646og2.b;
                        com.inmobi.media.C2409fg c2409fg4 = c2646og2.f5375a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        interfaceC2620ng4 = interfaceC2620ng5;
                        c2409fg3 = c2409fg4;
                        a(c2409fg3.b, "Redirect URL is malformed", (short) 2258, c2409fg3.f5201a, c2409fg3.d, interfaceC2620ng4);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i == 2) {
                        com.inmobi.media.Zf zf3 = c2646og2.c;
                        com.inmobi.media.InterfaceC2620ng interfaceC2620ng6 = c2646og2.b;
                        com.inmobi.media.C2409fg c2409fg5 = c2646og2.f5375a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        zf2 = zf3;
                        interfaceC2620ng3 = interfaceC2620ng6;
                        c2409fg3 = c2409fg5;
                        a(c2409fg3.b, c2409fg3.c, (short) 2249, zf2, c2409fg3.d, interfaceC2620ng3);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.inmobi.media.Zf zf4 = c2646og2.c;
                    com.inmobi.media.InterfaceC2620ng interfaceC2620ng7 = c2646og2.b;
                    com.inmobi.media.C2409fg c2409fg6 = c2646og2.f5375a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    interfaceC2620ng2 = interfaceC2620ng7;
                    c2409fg2 = c2409fg6;
                    zf = zf4;
                    a(c2409fg2.b, c2409fg2.c, (short) 2247, zf, c2409fg2.d, interfaceC2620ng2);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = c2409fg3.f5201a.f5085a;
                int i3 = c2409fg3.b;
                java.lang.String str2 = c2409fg3.c;
                int i4 = c2409fg3.b;
                com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
                if (i4 == 178) {
                    java.lang.String str3 = c2409fg3.f5201a.f5085a;
                    com.inmobi.media.C2884xg c2884xg = this.f5411a;
                    com.inmobi.media.Zf zf5 = c2409fg3.f5201a;
                    c2646og2.f5375a = c2409fg3;
                    c2646og2.b = interfaceC2620ng;
                    c2646og2.f = 1;
                    java.lang.Object a2 = c2884xg.f5552a.a("pings", "id=?", new java.lang.String[]{zf5.b}, c2646og2);
                    if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = kotlin.Unit.INSTANCE;
                    }
                    if (a2 != coroutine_suspended) {
                        interfaceC2620ng4 = interfaceC2620ng;
                        a(c2409fg3.b, "Redirect URL is malformed", (short) 2258, c2409fg3.f5201a, c2409fg3.d, interfaceC2620ng4);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    com.inmobi.media.Zf zf6 = c2409fg3.f5201a;
                    int i5 = zf6.g + 1;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(zf6.e, com.adjust.sdk.Constants.HIGH)) {
                        maxRetries = a().getRetryConfig().getHigh().getMaxRetries();
                    } else {
                        maxRetries = a().getRetryConfig().getNormal().getMaxRetries();
                    }
                    if (i5 > maxRetries) {
                        com.inmobi.media.C2884xg c2884xg2 = this.f5411a;
                        c2646og2.f5375a = c2409fg3;
                        c2646og2.b = interfaceC2620ng;
                        c2646og2.c = zf6;
                        c2646og2.f = 2;
                        java.lang.Object a3 = c2884xg2.f5552a.a("pings", "id=?", new java.lang.String[]{zf6.b}, c2646og2);
                        if (a3 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a3 = kotlin.Unit.INSTANCE;
                        }
                        if (a3 != coroutine_suspended) {
                            interfaceC2620ng3 = interfaceC2620ng;
                            zf2 = zf6;
                            a(c2409fg3.b, c2409fg3.c, (short) 2249, zf2, c2409fg3.d, interfaceC2620ng3);
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(zf6.e, com.adjust.sdk.Constants.HIGH)) {
                            pair = new kotlin.Pair(kotlin.coroutines.jvm.internal.Boxing.boxLong(a().getRetryConfig().getHigh().getRetryInterval()), kotlin.coroutines.jvm.internal.Boxing.boxDouble(a().getRetryConfig().getHigh().getFactor()));
                        } else {
                            pair = new kotlin.Pair(kotlin.coroutines.jvm.internal.Boxing.boxLong(a().getRetryConfig().getNormal().getRetryInterval()), kotlin.coroutines.jvm.internal.Boxing.boxDouble(a().getRetryConfig().getNormal().getFactor()));
                        }
                        java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis() + ((long) (java.lang.Math.pow(((java.lang.Number) pair.component2()).doubleValue(), i5) * ((java.lang.Number) pair.component1()).longValue() * 1000)));
                        java.lang.String url = zf6.f5085a;
                        java.lang.String id = zf6.b;
                        java.util.Map headers = zf6.c;
                        boolean z = zf6.d;
                        java.lang.String priority = zf6.e;
                        boolean z2 = zf6.f;
                        java.lang.String ownerId = zf6.h;
                        long j = zf6.i;
                        com.inmobi.media.C2781ti c2781ti = zf6.k;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        com.inmobi.media.Zf zf7 = new com.inmobi.media.Zf(url, id, headers, z, priority, z2, i5, ownerId, j, boxLong, c2781ti);
                        com.inmobi.media.C2884xg c2884xg3 = this.f5411a;
                        c2409fg2 = c2409fg;
                        c2646og2.f5375a = c2409fg2;
                        c2646og2.b = interfaceC2620ng;
                        c2646og2.c = zf6;
                        c2646og2.f = 3;
                        java.lang.Object a4 = com.inmobi.media.C2613n9.a(c2884xg3.f5552a, "pings", com.inmobi.media.AbstractC2909yg.a(zf7), "id=?", new java.lang.String[]{id}, c2646og2, 16);
                        if (a4 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a4 = kotlin.Unit.INSTANCE;
                        }
                        if (a4 != coroutine_suspended) {
                            zf = zf6;
                            interfaceC2620ng2 = interfaceC2620ng;
                            a(c2409fg2.b, c2409fg2.c, (short) 2247, zf, c2409fg2.d, interfaceC2620ng2);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        c2646og = new com.inmobi.media.C2646og(this, continuation);
        com.inmobi.media.C2646og c2646og22 = c2646og;
        java.lang.Object obj2 = c2646og22.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2646og22.f;
        if (i == 0) {
        }
    }
}
