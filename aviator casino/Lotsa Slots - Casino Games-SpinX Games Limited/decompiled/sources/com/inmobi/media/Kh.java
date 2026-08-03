package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Kh {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.B9 f4800a;
    public final java.lang.String b;
    public final com.inmobi.media.C2738s4 c;

    public Kh(com.inmobi.media.B9 configClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configClient, "configClient");
        this.f4800a = configClient;
        this.b = "Kh";
        this.c = new com.inmobi.media.C2738s4();
    }

    public static final boolean a(java.util.Set set, com.inmobi.media.C2687q4 it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.inmobi.media.AbstractC2767t4 a(com.inmobi.media.C2712r4 c2712r4, com.inmobi.media.C2687q4 c2687q4) {
        com.inmobi.media.C2448h2 c2448h2;
        java.lang.String configType = c2687q4.b.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2712r4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    c2448h2 = c2712r4.b();
                    break;
                }
                c2448h2 = null;
                break;
            case 96432:
                if (configType.equals("ads")) {
                    c2448h2 = c2712r4.a();
                    break;
                }
                c2448h2 = null;
                break;
            case 3506402:
                if (configType.equals("root")) {
                    c2448h2 = c2712r4.c();
                    break;
                }
                c2448h2 = null;
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    c2448h2 = c2712r4.e();
                    break;
                }
                c2448h2 = null;
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    c2448h2 = c2712r4.d();
                    break;
                }
                c2448h2 = null;
                break;
            default:
                c2448h2 = null;
                break;
        }
        if (c2448h2 == null) {
            return new com.inmobi.media.C2397f4(5, c2687q4.b.getLastUpdateTimeStamp(), c2687q4.b.getType());
        }
        com.inmobi.media.Al a2 = this.c.a(c2448h2, c2687q4);
        int i = a2.f4607a;
        if (i == 200) {
            com.inmobi.media.core.config.models.Config config = a2.b;
            config.setLastUpdateTimeStamp(java.lang.System.currentTimeMillis());
            java.lang.String tag = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c2687q4.b.getType();
            return new com.inmobi.media.C2794u4(200, config);
        }
        if (i != 304) {
            return new com.inmobi.media.C2397f4(a2.f4607a, c2687q4.b.getLastUpdateTimeStamp(), c2687q4.b.getType());
        }
        com.inmobi.media.core.config.models.Config config2 = a2.b;
        config2.setLastUpdateTimeStamp(java.lang.System.currentTimeMillis());
        java.lang.String tag2 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
        c2687q4.b.getType();
        return new com.inmobi.media.C2794u4(304, config2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:110:0x04a8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03e8 A[LOOP:4: B:91:0x03e2->B:93:0x03e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036b  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0495 -> B:13:0x0497). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String r26, java.lang.String r27, com.inmobi.media.core.config.models.RootConfig r28, java.util.List r29, kotlinx.coroutines.channels.ProducerScope r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Kh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, kotlinx.coroutines.channels.ProducerScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:11:0x002a, B:12:0x004e, B:14:0x0052, B:15:0x0056, B:17:0x005c, B:21:0x006b, B:22:0x0072), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:11:0x002a, B:12:0x004e, B:14:0x0052, B:15:0x0056, B:17:0x005c, B:21:0x006b, B:22:0x0072), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Ve ve, java.util.List list, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Jh jh;
        int i;
        java.util.ArrayList arrayList;
        com.inmobi.media.C2712r4 c2712r4;
        if (continuationImpl instanceof com.inmobi.media.Jh) {
            jh = (com.inmobi.media.Jh) continuationImpl;
            int i2 = jh.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jh.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = jh.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jh.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    try {
                        jh.f4783a = list;
                        jh.b = arrayList2;
                        jh.e = 1;
                        java.lang.Object a2 = ve.a();
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = a2;
                        arrayList = arrayList2;
                    } catch (java.lang.ClassCastException unused) {
                        arrayList = arrayList2;
                        a(list, 2);
                        return arrayList;
                    } catch (org.json.JSONException unused2) {
                        arrayList = arrayList2;
                        a(list, 2);
                        return arrayList;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = jh.b;
                    list = jh.f4783a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.ClassCastException unused3) {
                        a(list, 2);
                        return arrayList;
                    } catch (org.json.JSONException unused4) {
                        a(list, 2);
                        return arrayList;
                    }
                }
                c2712r4 = (com.inmobi.media.C2712r4) obj;
                if (c2712r4 == null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(c2712r4, (com.inmobi.media.C2687q4) it.next()));
                    }
                    return arrayList;
                }
                throw new org.json.JSONException("Error parsing config response");
            }
        }
        jh = new com.inmobi.media.Jh(this, continuationImpl);
        java.lang.Object obj2 = jh.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jh.e;
        if (i != 0) {
        }
        c2712r4 = (com.inmobi.media.C2712r4) obj2;
        if (c2712r4 == null) {
        }
    }

    public static void a(int i, java.util.List list, java.util.List list2) {
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(i)), kotlin.TuplesKt.to("name", list), kotlin.TuplesKt.to("lts", list2), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.o()));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("InvalidConfig", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public static void a(java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.inmobi.media.C2687q4) it.next()).b.getType());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((com.inmobi.media.C2687q4) it2.next()).b.getLastUpdateTimeStamp()));
        }
        a(i, arrayList, arrayList2);
    }
}
