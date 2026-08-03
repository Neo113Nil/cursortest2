package com.inmobi.media;

/* renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC2526k3 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5285a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2526k3(android.os.Looper looper) {
        super(looper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
    }

    public final void a(com.inmobi.media.V2 v2) {
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
        java.lang.String str = v2.b;
        b(v2);
        com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
        com.inmobi.media.A3.a(v2, "RETRY_EXHAUSTED");
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2475i3(v2, null), 1, null);
        com.inmobi.media.A3.f.remove(v2);
        if (com.inmobi.media.A3.f.isEmpty()) {
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2500j3(this, null), 1, null);
        }
    }

    public final void b(com.inmobi.media.V2 v2) {
        int indexOf = kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends com.inmobi.media.V2>) com.inmobi.media.A3.f, v2);
        if (-1 != indexOf) {
            com.inmobi.media.V2 v22 = (com.inmobi.media.V2) com.inmobi.media.A3.f.get(indexOf == com.inmobi.media.A3.f.size() + (-1) ? 0 : indexOf + 1);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = v22.e ? 3 : 2;
            obtain.obj = v22;
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            long pingInterval = com.inmobi.media.A3.c().getPingInterval() * 1000;
            if (java.lang.System.currentTimeMillis() - v22.g < pingInterval) {
                sendMessageDelayed(obtain, pingInterval);
            } else {
                sendMessage(obtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message msg) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (com.inmobi.media.A3.h.get()) {
            try {
                int i = msg.what;
                int i2 = 3;
                if (i == 1) {
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    if (com.inmobi.media.A3.e()) {
                        com.inmobi.media.core.config.models.AdConfig.ImaiConfig c = com.inmobi.media.A3.c();
                        com.inmobi.media.Z2 z2 = (com.inmobi.media.Z2) com.inmobi.media.A3.b.getValue();
                        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2344d3(z2, c, null), 1, null);
                        java.util.List list = (java.util.List) runBlocking$default;
                        com.inmobi.media.A3.f = list;
                        if (list.isEmpty()) {
                            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2369e3(z2, this, c, null), 1, null);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                        for (com.inmobi.media.V2 v2 : com.inmobi.media.A3.f) {
                            com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                            java.lang.String str = v2.b;
                        }
                        com.inmobi.media.V2 v22 = (com.inmobi.media.V2) com.inmobi.media.A3.f.get(0);
                        android.os.Message obtain = android.os.Message.obtain();
                        if (!v22.e) {
                            i2 = 2;
                        }
                        obtain.what = i2;
                        obtain.obj = v22;
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - v22.g;
                        if (currentTimeMillis < c.getPingInterval() * 1000) {
                            sendMessageDelayed(obtain, (c.getPingInterval() * 1000) - currentTimeMillis);
                            return;
                        } else {
                            sendMessage(obtain);
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (com.inmobi.media.Ze.a() != null) {
                        com.inmobi.media.A3.g.set(false);
                        com.inmobi.media.A3 a33 = com.inmobi.media.A3.f4593a;
                        com.inmobi.media.A3.g();
                        return;
                    }
                    java.lang.Object obj = msg.obj;
                    com.inmobi.media.A3 a34 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.core.config.models.AdConfig.ImaiConfig c2 = com.inmobi.media.A3.c();
                    if (!(obj instanceof com.inmobi.media.V2)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((com.inmobi.media.V2) obj).f != 0) {
                        com.inmobi.media.V2 v23 = (com.inmobi.media.V2) obj;
                        long pingCacheExpiry = c2.getPingCacheExpiry();
                        v23.getClass();
                        if (java.lang.System.currentTimeMillis() - v23.h <= pingCacheExpiry * 1000) {
                            if ((c2.getMaxRetries() - ((com.inmobi.media.V2) obj).f) + 1 == 0) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                                java.lang.String str2 = ((com.inmobi.media.V2) obj).b;
                            } else {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                                java.lang.String str3 = ((com.inmobi.media.V2) obj).b;
                            }
                            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2396f3((com.inmobi.media.V2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((com.inmobi.media.V2) obj);
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                        int i3 = msg.what;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        return;
                    }
                    java.lang.Object obj2 = msg.obj;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    com.inmobi.media.V2 click = (com.inmobi.media.V2) obj2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                    java.lang.String str4 = click.b;
                    java.util.LinkedHashMap linkedHashMap = com.inmobi.media.A3.j;
                    com.inmobi.media.C2260a0 c2260a0 = (com.inmobi.media.C2260a0) linkedHashMap.get(java.lang.Integer.valueOf(click.f5007a));
                    if (c2260a0 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
                        c2260a0.f5091a.a(c2260a0.b);
                    }
                    linkedHashMap.remove(java.lang.Integer.valueOf(click.f5007a));
                    kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2449h3(click, this, null), 1, null);
                    return;
                }
                if (com.inmobi.media.Ze.a() != null) {
                    com.inmobi.media.A3.g.set(false);
                    com.inmobi.media.A3 a35 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.A3.g();
                    return;
                }
                java.lang.Object obj3 = msg.obj;
                com.inmobi.media.A3 a36 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.core.config.models.AdConfig.ImaiConfig c3 = com.inmobi.media.A3.c();
                if (!(obj3 instanceof com.inmobi.media.V2)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                    return;
                }
                if (((com.inmobi.media.V2) obj3).f != 0) {
                    com.inmobi.media.V2 v24 = (com.inmobi.media.V2) obj3;
                    long pingCacheExpiry2 = c3.getPingCacheExpiry();
                    v24.getClass();
                    if (java.lang.System.currentTimeMillis() - v24.h <= pingCacheExpiry2 * 1000) {
                        if ((c3.getMaxRetries() - ((com.inmobi.media.V2) obj3).f) + 1 == 0) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                            java.lang.String str5 = ((com.inmobi.media.V2) obj3).b;
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                            java.lang.String str6 = ((com.inmobi.media.V2) obj3).b;
                        }
                        new com.inmobi.media.C2579m3(new com.inmobi.media.C2423g3(this)).a((com.inmobi.media.V2) obj3);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        return;
                    }
                }
                a((com.inmobi.media.V2) obj3);
            } catch (java.lang.Exception e) {
                com.inmobi.media.A3 a37 = com.inmobi.media.A3.f4593a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                e.getMessage();
            }
        }
    }
}
