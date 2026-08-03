package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f7585a;

    public a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7585a = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public java.util.Set<java.lang.String> a() {
        return kotlin.collections.SetsKt.setOf("metric");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public java.lang.String b() {
        return "ACMHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(org.json.JSONObject event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.lang.String string = event.getString(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        java.lang.String string2 = event.getString("metricName");
        java.lang.String string3 = event.getString("type");
        org.json.JSONObject optJSONObject = event.optJSONObject("tags");
        java.lang.String string4 = event.getString("value");
        if (kotlin.jvm.internal.Intrinsics.areEqual(string3, "counter")) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, b(), "Count metric recorded: " + string2 + " = " + string4, false, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(string2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string4);
            countEvent.withCount(java.lang.Integer.parseInt(string4));
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                    java.lang.String string5 = optJSONObject.getString(next);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    countEvent = countEvent.withTag(next, string5);
                }
            }
            this.f7585a.recordCountEvent(countEvent);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(string3, "timer")) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, b(), "Unknown event type: " + string, null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, b(), "Timer metric recorded: " + string2 + " = " + string4, false, 4, null);
        com.moloco.sdk.acm.TimerEvent.Companion companion = com.moloco.sdk.acm.TimerEvent.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        com.moloco.sdk.acm.TimerEvent create = companion.create(string2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string4);
        create.withTime(java.lang.Long.parseLong(string4));
        if (optJSONObject != null) {
            java.util.Iterator<java.lang.String> keys2 = optJSONObject.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
            while (keys2.hasNext()) {
                java.lang.String next2 = keys2.next();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next2);
                java.lang.String string6 = optJSONObject.getString(next2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                create = create.withTag(next2, string6);
            }
        }
        this.f7585a.recordTimerEvent(create);
    }
}
