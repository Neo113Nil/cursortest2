package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

/* loaded from: classes5.dex */
public final class e {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.a d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "CompositeEventHandler";

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> f7592a;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder b;
    public final kotlin.Lazy c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(java.util.Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7592a = eventHandlers;
        this.b = metricsRecorder;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.this);
            }
        });
    }

    public final java.util.Map<java.lang.String, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a>> a() {
        return (java.util.Map) this.c.getValue();
    }

    public static final java.util.Map a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar) {
        java.util.Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set = eVar.f7592a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a());
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (java.lang.Object obj : arrayList) {
            java.lang.String str = (java.lang.String) obj;
            java.util.Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set2 = eVar.f7592a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : set2) {
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(obj, arrayList2);
        }
        return linkedHashMap;
    }

    public final void a(java.lang.String event) {
        com.moloco.sdk.acm.TimerEvent timerEvent;
        java.lang.String str;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar;
        com.moloco.sdk.acm.TimerEvent timerEvent2;
        com.moloco.sdk.acm.TimerEvent timerEvent3;
        com.moloco.sdk.internal.client_metrics_data.d dVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        com.moloco.sdk.acm.TimerEvent startTimerEvent = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.s.c());
        org.json.JSONObject jSONObject = new org.json.JSONObject(event);
        java.lang.String string = jSONObject.getString(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, f, "Event received: " + string, false, 4, null);
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> list = a().get(string);
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                timerEvent = startTimerEvent;
                str = com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE;
                com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, f, "Found multiple event handlers for event: " + string + ", using first one", null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.b;
                com.moloco.sdk.acm.CountEvent withTag = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.L.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                metricsRecorder.recordCountEvent(withTag.withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
            } else {
                timerEvent = startTimerEvent;
                str = com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE;
            }
            com.moloco.sdk.acm.TimerEvent startTimerEvent2 = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.t.c());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) kotlin.collections.CollectionsKt.first((java.util.List) list);
            try {
                aVar2.a(jSONObject);
                aVar = aVar2;
                timerEvent2 = startTimerEvent2;
            } catch (java.lang.Exception e2) {
                e = e2;
                aVar = aVar2;
                timerEvent2 = startTimerEvent2;
            }
            try {
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, f, "Event handled: " + string, null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.b;
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                com.moloco.sdk.acm.TimerEvent withTag2 = timerEvent2.withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string).withTag("handler", aVar.b());
                dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder2.recordTimerEvent(withTag2.withTag(dVar.c(), "success"));
                this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar.c(), "success").withTag("handler", aVar.b()).withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
                timerEvent3 = timerEvent;
            } catch (java.lang.Exception e3) {
                e = e3;
                timerEvent3 = timerEvent;
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "Event handling failed: " + string, e, false, 8, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = this.b;
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                com.moloco.sdk.acm.TimerEvent withTag3 = timerEvent2.withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                java.lang.String c = dVar2.c();
                java.lang.String simpleName = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                com.moloco.sdk.acm.TimerEvent withTag4 = withTag3.withTag(c, simpleName);
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder3.recordTimerEvent(withTag4.withTag(dVar3.c(), str));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4 = this.b;
                com.moloco.sdk.acm.CountEvent withTag5 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar3.c(), str);
                java.lang.String c2 = dVar2.c();
                java.lang.String simpleName2 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                metricsRecorder4.recordCountEvent(withTag5.withTag(c2, simpleName2).withTag("handler", aVar.b()).withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder5 = this.b;
                com.moloco.sdk.acm.TimerEvent withTag6 = timerEvent3.withTag(dVar3.c(), str);
                java.lang.String c3 = dVar2.c();
                java.lang.String simpleName3 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
                metricsRecorder5.recordTimerEvent(withTag6.withTag(c3, simpleName3).withTag("handler", aVar.b()).withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
                return;
            }
            try {
                this.b.recordTimerEvent(timerEvent3.withTag(dVar.c(), "success").withTag("handler", aVar.b()).withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
                return;
            } catch (java.lang.Exception e4) {
                e = e4;
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "Event handling failed: " + string, e, false, 8, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder32 = this.b;
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                com.moloco.sdk.acm.TimerEvent withTag32 = timerEvent2.withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar22 = com.moloco.sdk.internal.client_metrics_data.d.b;
                java.lang.String c4 = dVar22.c();
                java.lang.String simpleName4 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
                com.moloco.sdk.acm.TimerEvent withTag42 = withTag32.withTag(c4, simpleName4);
                com.moloco.sdk.internal.client_metrics_data.d dVar32 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder32.recordTimerEvent(withTag42.withTag(dVar32.c(), str));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder42 = this.b;
                com.moloco.sdk.acm.CountEvent withTag52 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar32.c(), str);
                java.lang.String c22 = dVar22.c();
                java.lang.String simpleName22 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName22, "getSimpleName(...)");
                metricsRecorder42.recordCountEvent(withTag52.withTag(c22, simpleName22).withTag("handler", aVar.b()).withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder52 = this.b;
                com.moloco.sdk.acm.TimerEvent withTag62 = timerEvent3.withTag(dVar32.c(), str);
                java.lang.String c32 = dVar22.c();
                java.lang.String simpleName32 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName32, "getSimpleName(...)");
                metricsRecorder52.recordTimerEvent(withTag62.withTag(c32, simpleName32).withTag("handler", aVar.b()).withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
                return;
            }
        }
        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, f, "Event not handled: " + string, null, false, 12, null);
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder6 = this.b;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.d;
        com.moloco.sdk.acm.CountEvent withTag7 = countEvent.withTag(dVar4.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.b;
        com.moloco.sdk.acm.CountEvent withTag8 = withTag7.withTag(dVar5.c(), "no_handler");
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        metricsRecorder6.recordCountEvent(withTag8.withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
        this.b.recordTimerEvent(startTimerEvent.withTag(dVar4.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar5.c(), "no_handler").withTag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, string));
    }
}
