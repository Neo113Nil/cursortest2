package com.inmobi.media;

/* renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2624nk implements com.inmobi.media.Rf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2624nk f5360a = new com.inmobi.media.C2624nk();
    public static final kotlinx.coroutines.sync.Mutex b = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    public static final java.lang.String c;
    public static final java.util.List d;
    public static final kotlin.Lazy e;
    public static final java.util.concurrent.atomic.AtomicBoolean f;
    public static com.inmobi.media.C2662p6 g;
    public static volatile com.inmobi.media.Ak h;
    public static final kotlin.jvm.functions.Function1 i;
    public static com.inmobi.media.C2862wk j;

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("nk", "getSimpleName(...)");
        c = "nk";
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed", "HtmlUrlPrefetchStarted", "HtmlUrlPrefetchCompleted", "InAppBrowserLoaderShown", "InAppBrowserLoaderHidden");
        d = mutableListOf;
        e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.nk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2624nk.c();
            }
        });
        f = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.inmobi.media.C2596mk c2596mk = new com.inmobi.media.C2596mk();
        i = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.nk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2624nk.a((com.inmobi.media.J2) obj);
            }
        };
        com.inmobi.media.core.config.models.TelemetryConfig b2 = b();
        h = new com.inmobi.media.Ak(new com.inmobi.media.C2677pk(b2.getEnabled(), b2.getAssetReporting().isImageEnabled(), b2.getAssetReporting().isGifEnabled(), b2.getAssetReporting().isVideoEnabled(), b2.getDisableAllGeneralEvents(), b2.getPriorityEventsList(), b2.getSamplingFactor()), kotlin.collections.CollectionsKt.toList(mutableListOf));
        com.inmobi.media.AbstractC2318c4.a("telemetry", c2596mk);
    }

    public static final kotlin.Unit a(com.inmobi.media.J2 it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.f4774a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case androidx.compose.material.TextFieldImplKt.AnimationDuration /* 150 */:
                    com.inmobi.media.C2862wk c2862wk = j;
                    if (c2862wk != null) {
                        java.util.Map map = it.c;
                        java.lang.Object obj = map != null ? map.get("data") : null;
                        c2862wk.a("CrashEventOccurred", obj instanceof com.inmobi.media.X4 ? (com.inmobi.media.X4) obj : null);
                        break;
                    }
                    break;
                case 151:
                    com.inmobi.media.C2862wk c2862wk2 = j;
                    if (c2862wk2 != null) {
                        java.util.Map map2 = it.c;
                        java.lang.Object obj2 = map2 != null ? map2.get("data") : null;
                        com.inmobi.media.C2654oo c2654oo = obj2 instanceof com.inmobi.media.C2654oo ? (com.inmobi.media.C2654oo) obj2 : null;
                        if (c2654oo != null && com.inmobi.media.AbstractC2939zl.a(c2654oo)) {
                            com.inmobi.media.B5.f4614a.getClass();
                            if (!com.inmobi.media.B5.t()) {
                                c2862wk2.a("MainThreadBlockedEvent", c2654oo);
                                break;
                            }
                        }
                    }
                    break;
                case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 152 */:
                    com.inmobi.media.C2862wk c2862wk3 = j;
                    if (c2862wk3 != null) {
                        java.util.Map map3 = it.c;
                        java.lang.Object obj3 = map3 != null ? map3.get("data") : null;
                        c2862wk3.a(obj3 instanceof com.inmobi.media.C2919z1 ? (com.inmobi.media.C2919z1) obj3 : null);
                        break;
                    }
                    break;
            }
        } else {
            f.set(false);
            com.inmobi.media.C2662p6 c2662p6 = g;
            if (c2662p6 != null) {
                c2662p6.f.set(false);
                c2662p6.g.set(true);
                kotlinx.coroutines.Job job = c2662p6.j;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                c2662p6.j = null;
                c2662p6.i = null;
            }
            g = null;
            j = null;
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(i);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void b(java.lang.String eventType, java.util.Map keyValueMap, com.inmobi.media.EnumC2728rk telemetryEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2570lk(eventType, keyValueMap, telemetryEventType, null), 3, null);
    }

    public static final com.inmobi.media.C2810uk c() {
        return new com.inmobi.media.C2810uk(com.inmobi.media.AbstractC2639o9.b());
    }

    public static com.inmobi.media.core.config.models.TelemetryConfig b() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        return (com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class);
    }

    public static boolean a(java.lang.String eventType, java.util.Map keyValueMap, com.inmobi.media.EnumC2728rk telemetryEventType) {
        boolean a2;
        com.inmobi.media.Ak ak = h;
        if (ak == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
            ak = null;
        }
        ak.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (ak.f4606a.f5395a) {
            int ordinal = telemetryEventType.ordinal();
            if (ordinal == 0) {
                a2 = ak.b.a(eventType, keyValueMap);
            } else {
                if (ordinal != 1) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                a2 = true;
            }
        } else {
            a2 = false;
        }
        return !a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r9.a(r8, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.C2836vk c2836vk, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2517jk c2517jk;
        int i2;
        com.inmobi.media.C2836vk c2836vk2;
        int i3;
        int intValue;
        java.lang.String str;
        java.lang.Object a2;
        if (continuationImpl instanceof com.inmobi.media.C2517jk) {
            c2517jk = (com.inmobi.media.C2517jk) continuationImpl;
            int i4 = c2517jk.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2517jk.e = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = c2517jk.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2517jk.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int maxEventsToPersist = b().getMaxEventsToPersist();
                    com.inmobi.media.C2810uk c2810uk = (com.inmobi.media.C2810uk) e.getValue();
                    c2517jk.f5280a = c2836vk;
                    c2517jk.b = maxEventsToPersist;
                    c2517jk.e = 1;
                    java.lang.Object a3 = c2810uk.a(c2517jk);
                    if (a3 != coroutine_suspended) {
                        c2836vk2 = c2836vk;
                        i3 = maxEventsToPersist;
                        obj = a3;
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    i3 = c2517jk.b;
                    c2836vk2 = c2517jk.f5280a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    intValue = c2517jk.b;
                    c2836vk2 = c2517jk.f5280a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int a4 = com.inmobi.media.AbstractC2757sk.a() + intValue;
                    if (a4 != -1) {
                        com.inmobi.media.AbstractC2757sk.b = a4;
                        com.inmobi.media.La la = com.inmobi.media.AbstractC2757sk.f5450a;
                        if (la != null) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                            la.a(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, a4, false);
                        }
                    }
                    com.inmobi.media.C2810uk c2810uk2 = (com.inmobi.media.C2810uk) e.getValue();
                    c2517jk.f5280a = null;
                    c2517jk.e = 3;
                    com.inmobi.media.C2613n9 c2613n9 = c2810uk2.b;
                    java.lang.String str2 = c2810uk2.f5234a;
                    c2836vk2.getClass();
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("eventType", c2836vk2.f5268a);
                    str = c2836vk2.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues.put("payload", str);
                    contentValues.put("eventSource", c2836vk2.e);
                    contentValues.put("ts", java.lang.String.valueOf(c2836vk2.c));
                    a2 = c2613n9.a(str2, contentValues, 4, c2517jk);
                    if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = kotlin.Unit.INSTANCE;
                    }
                }
                intValue = (((java.lang.Number) obj).intValue() + 1) - i3;
                if (intValue > 0) {
                    com.inmobi.media.C2810uk c2810uk3 = (com.inmobi.media.C2810uk) e.getValue();
                    c2517jk.f5280a = c2836vk2;
                    c2517jk.b = intValue;
                    c2517jk.e = 2;
                }
                com.inmobi.media.C2810uk c2810uk22 = (com.inmobi.media.C2810uk) e.getValue();
                c2517jk.f5280a = null;
                c2517jk.e = 3;
                com.inmobi.media.C2613n9 c2613n92 = c2810uk22.b;
                java.lang.String str22 = c2810uk22.f5234a;
                c2836vk2.getClass();
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("eventType", c2836vk2.f5268a);
                str = c2836vk2.b;
                if (str == null) {
                }
                contentValues2.put("payload", str);
                contentValues2.put("eventSource", c2836vk2.e);
                contentValues2.put("ts", java.lang.String.valueOf(c2836vk2.c));
                a2 = c2613n92.a(str22, contentValues2, 4, c2517jk);
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
            }
        }
        c2517jk = new com.inmobi.media.C2517jk(this, continuationImpl);
        java.lang.Object obj2 = c2517jk.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2517jk.e;
        if (i2 != 0) {
        }
        intValue = (((java.lang.Number) obj2).intValue() + 1) - i3;
        if (intValue > 0) {
        }
        com.inmobi.media.C2810uk c2810uk222 = (com.inmobi.media.C2810uk) e.getValue();
        c2517jk.f5280a = null;
        c2517jk.e = 3;
        com.inmobi.media.C2613n9 c2613n922 = c2810uk222.b;
        java.lang.String str222 = c2810uk222.f5234a;
        c2836vk2.getClass();
        android.content.ContentValues contentValues22 = new android.content.ContentValues();
        contentValues22.put("eventType", c2836vk2.f5268a);
        str = c2836vk2.b;
        if (str == null) {
        }
        contentValues22.put("payload", str);
        contentValues22.put("eventSource", c2836vk2.e);
        contentValues22.put("ts", java.lang.String.valueOf(c2836vk2.c));
        a2 = c2613n922.a(str222, contentValues22, 4, c2517jk);
        if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    public final void a() {
        if (f.get()) {
            com.inmobi.media.C2426g6 eventConfig = b().getEventConfig();
            eventConfig.k = b().getTelemetryUrl();
            com.inmobi.media.C2662p6 c2662p6 = g;
            if (c2662p6 == null) {
                g = new com.inmobi.media.C2662p6("telemetry", (com.inmobi.media.C2810uk) e.getValue(), this, eventConfig, this);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c2662p6.i = eventConfig;
            }
            com.inmobi.media.C2662p6 c2662p62 = g;
            if (c2662p62 != null) {
                c2662p62.a(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2466hk c2466hk;
        java.lang.Object obj;
        int i2;
        if (continuationImpl instanceof com.inmobi.media.C2466hk) {
            c2466hk = (com.inmobi.media.C2466hk) continuationImpl;
            int i3 = c2466hk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2466hk.c = i3 - Integer.MIN_VALUE;
                obj = c2466hk.f5246a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2466hk.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2810uk c2810uk = (com.inmobi.media.C2810uk) e.getValue();
                    c2466hk.c = 1;
                    obj = c2810uk.a(c2466hk);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Number) obj).intValue() > 0) {
                    a();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2466hk = new com.inmobi.media.C2466hk(this, continuationImpl);
        obj = c2466hk.f5246a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2466hk.c;
        if (i2 != 0) {
        }
        if (((java.lang.Number) obj).intValue() > 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.inmobi.media.Rf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2491ik c2491ik;
        int i2;
        int a2;
        java.util.List<com.inmobi.media.C2836vk> mutableList;
        java.lang.String str;
        if (continuation instanceof com.inmobi.media.C2491ik) {
            c2491ik = (com.inmobi.media.C2491ik) continuation;
            int i3 = c2491ik.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2491ik.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2491ik.f5263a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2491ik.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.B5.f4614a.getClass();
                    if (com.inmobi.media.B5.n() == 1) {
                        a2 = b().getWifiConfig().a();
                    } else {
                        a2 = b().getMobileConfig().a();
                    }
                    com.inmobi.media.C2810uk c2810uk = (com.inmobi.media.C2810uk) e.getValue();
                    c2491ik.c = 1;
                    obj = c2810uk.b(a2, c2491ik);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) obj);
                if (!a("DatabaseMaxLimitReachedV2", kotlin.collections.MapsKt.emptyMap(), com.inmobi.media.EnumC2728rk.f5431a) && com.inmobi.media.AbstractC2757sk.a() > 0) {
                    com.inmobi.media.AbstractC2757sk.a();
                    int a3 = com.inmobi.media.AbstractC2757sk.a();
                    com.inmobi.media.C2836vk c2836vk = new com.inmobi.media.C2836vk("DatabaseMaxLimitReachedV2", null, "sdk");
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    java.util.HashMap hashMapOf = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("eventId", uuid), kotlin.TuplesKt.to("eventType", "DatabaseMaxLimitReachedV2"), kotlin.TuplesKt.to("samplingRate", 100), kotlin.TuplesKt.to("isTemplateEvent", java.lang.Boolean.FALSE), kotlin.TuplesKt.to("eventLostCount", java.lang.Integer.valueOf(a3)));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(hashMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    java.lang.String payload = new org.json.JSONObject(hashMapOf).toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
                    c2836vk.b = payload;
                    com.inmobi.media.AbstractC2757sk.c = kotlin.coroutines.jvm.internal.Boxing.boxInt(c2836vk.d);
                    mutableList.add(c2836vk);
                }
                if (!mutableList.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = mutableList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.inmobi.media.C2836vk) it.next()).d));
                    }
                    try {
                        java.lang.String str2 = com.inmobi.media.Xi.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("im-accid", str2), kotlin.TuplesKt.to("version", "4.0.0"), kotlin.TuplesKt.to("mk-version", com.inmobi.media.Yi.a()), kotlin.TuplesKt.to("u-appbid", com.inmobi.media.A1.f4591a), kotlin.TuplesKt.to("tp", com.inmobi.media.Yi.b));
                        java.lang.String str3 = com.inmobi.media.Yi.f5069a;
                        if (str3 != null) {
                            mutableMapOf.put("tp-v", str3);
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        org.json.JSONObject jSONObject = new org.json.JSONObject(mutableMapOf);
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (com.inmobi.media.C2836vk c2836vk2 : mutableList) {
                            java.lang.String str4 = c2836vk2.b;
                            if (str4 == null) {
                                str4 = "";
                            }
                            if (kotlin.text.StringsKt.trim((java.lang.CharSequence) str4).toString().length() > 0) {
                                java.lang.String str5 = c2836vk2.b;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str5);
                                jSONObject2.put("dts", c2836vk2.c);
                                jSONArray.put(jSONObject2);
                            }
                        }
                        jSONObject.put("payload", jSONArray);
                        str = jSONObject.toString();
                    } catch (org.json.JSONException unused) {
                        str = null;
                    }
                    if (str != null) {
                        return new com.inmobi.media.C2478i6(str, arrayList);
                    }
                }
                return null;
            }
        }
        c2491ik = new com.inmobi.media.C2491ik(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = c2491ik.f5263a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2491ik.c;
        if (i2 != 0) {
        }
        mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) obj2);
        if (!a("DatabaseMaxLimitReachedV2", kotlin.collections.MapsKt.emptyMap(), com.inmobi.media.EnumC2728rk.f5431a)) {
            com.inmobi.media.AbstractC2757sk.a();
            int a32 = com.inmobi.media.AbstractC2757sk.a();
            com.inmobi.media.C2836vk c2836vk3 = new com.inmobi.media.C2836vk("DatabaseMaxLimitReachedV2", null, "sdk");
            java.lang.String uuid2 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
            java.util.HashMap hashMapOf2 = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("eventId", uuid2), kotlin.TuplesKt.to("eventType", "DatabaseMaxLimitReachedV2"), kotlin.TuplesKt.to("samplingRate", 100), kotlin.TuplesKt.to("isTemplateEvent", java.lang.Boolean.FALSE), kotlin.TuplesKt.to("eventLostCount", java.lang.Integer.valueOf(a32)));
            kotlin.jvm.internal.Intrinsics.checkNotNull(hashMapOf2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            java.lang.String payload2 = new org.json.JSONObject(hashMapOf2).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payload2, "toString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload2, "payload");
            c2836vk3.b = payload2;
            com.inmobi.media.AbstractC2757sk.c = kotlin.coroutines.jvm.internal.Boxing.boxInt(c2836vk3.d);
            mutableList.add(c2836vk3);
        }
        if (!mutableList.isEmpty()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2543kk c2543kk;
        int i2;
        if (continuationImpl instanceof com.inmobi.media.C2543kk) {
            c2543kk = (com.inmobi.media.C2543kk) continuationImpl;
            int i3 = c2543kk.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2543kk.b = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2543kk.f5298a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2543kk.b;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!f.getAndSet(true)) {
                        com.inmobi.media.C2624nk c2624nk = f5360a;
                        c2543kk.b = 1;
                        if (c2624nk.a((kotlin.coroutines.jvm.internal.ContinuationImpl) c2543kk) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{2, 1, androidx.compose.material.TextFieldImplKt.AnimationDuration, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 151}, i);
                j = new com.inmobi.media.C2862wk(b());
                return kotlin.Unit.INSTANCE;
            }
        }
        c2543kk = new com.inmobi.media.C2543kk(continuationImpl);
        java.lang.Object obj2 = c2543kk.f5298a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2543kk.b;
        if (i2 != 0) {
        }
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{2, 1, androidx.compose.material.TextFieldImplKt.AnimationDuration, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 151}, i);
        j = new com.inmobi.media.C2862wk(b());
        return kotlin.Unit.INSTANCE;
    }
}
