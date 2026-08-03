package com.inmobi.media;

/* renamed from: com.inmobi.media.zi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2936zi {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2781ti f5594a;
    public long b;
    public long c;
    public int d;
    public int e;
    public final java.util.concurrent.atomic.AtomicInteger f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public long h;

    public C2936zi(com.inmobi.media.C2781ti renderViewMetaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderViewMetaData, "renderViewMetaData");
        this.f5594a = renderViewMetaData;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        com.inmobi.media.core.config.models.TelemetryConfig telemetryConfig = (com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class);
        com.inmobi.media.C2911yi c2911yi = renderViewMetaData.k;
        this.f = new java.util.concurrent.atomic.AtomicInteger(c2911yi != null ? c2911yi.f5573a : telemetryConfig.getMaxTemplateEvents());
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(int i) {
        short s;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "im_telemetry_prefs");
            java.lang.String str = com.inmobi.media.A1.c;
            if (str == null) {
                str = "unknown";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("last_app_version", com.ironsource.X3.i.W);
            if (kotlin.jvm.internal.Intrinsics.areEqual(a2.f4815a.getString("last_app_version", null), str)) {
                return;
            }
            java.util.Map a3 = a();
            switch (i) {
                case 8800:
                    s = 2365;
                    break;
                case 8801:
                default:
                    s = (short) i;
                    break;
                case 8802:
                    s = 2366;
                    break;
                case 8803:
                    s = 2367;
                    break;
                case 8804:
                    s = 2368;
                    break;
            }
            a3.put("errorCode", java.lang.Short.valueOf(s));
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VideoPlayerNotSupported", a3, com.inmobi.media.EnumC2728rk.f5431a);
            a2.a("last_app_version", str, false);
        }
    }

    public final void b() {
        java.lang.String a2 = a("WebViewLoadCalled");
        this.c = android.os.SystemClock.elapsedRealtime();
        java.util.Map a3 = a();
        if (kotlin.jvm.internal.Intrinsics.areEqual(a2, "CompanionWebViewLoadCalled")) {
            long j = this.b;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            a3.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        } else {
            com.inmobi.media.C2684q1 c2684q1 = this.f5594a.j;
            if (c2684q1 != null) {
                long j2 = c2684q1.f5402a.c;
                kotlinx.coroutines.CoroutineScope coroutineScope2 = com.inmobi.media.AbstractC2939zl.f5596a;
                a3.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j2));
            }
        }
        a3.put("creativeId", this.f5594a.g);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b(a2, a3, com.inmobi.media.EnumC2728rk.f5431a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (new org.json.JSONObject(r10).length() == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.String eventType, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.g.get()) {
            return;
        }
        if (this.f.decrementAndGet() <= 0) {
            this.g.set(true);
            java.util.Map a2 = a();
            long j = this.c;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("TemplateEventDropped", a2, com.inmobi.media.EnumC2728rk.f5431a);
            return;
        }
        if (str != null) {
            try {
            } catch (org.json.JSONException e) {
                android.util.Log.e(com.inmobi.media.C2624nk.c, "Error parsing JSON: " + e);
            }
        }
        str2 = this.f5594a.l;
        if (str2 == null) {
            str2 = "";
        }
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("trigger", str2), kotlin.TuplesKt.to("plType", java.lang.String.valueOf(this.f5594a.f5469a.f)), kotlin.TuplesKt.to("impressionId", this.f5594a.c), kotlin.TuplesKt.to("markupType", this.f5594a.b), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.g()));
        if (str != null) {
            mutableMapOf.put("payload", str);
        }
        if (this.f5594a.d.length() > 0) {
            mutableMapOf.put("metadataBlob", this.f5594a.d);
        }
        com.inmobi.media.C2624nk.b(eventType, mutableMapOf, com.inmobi.media.EnumC2728rk.b);
        str = null;
        str2 = this.f5594a.l;
        if (str2 == null) {
        }
        java.util.Map mutableMapOf2 = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("trigger", str2), kotlin.TuplesKt.to("plType", java.lang.String.valueOf(this.f5594a.f5469a.f)), kotlin.TuplesKt.to("impressionId", this.f5594a.c), kotlin.TuplesKt.to("markupType", this.f5594a.b), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.g()));
        if (str != null) {
        }
        if (this.f5594a.d.length() > 0) {
        }
        com.inmobi.media.C2624nk.b(eventType, mutableMapOf2, com.inmobi.media.EnumC2728rk.b);
    }

    public final void a(boolean z, short s) {
        java.lang.String a2 = a("WebViewRenderProcessGoneEvent");
        java.lang.String str = this.f5594a.l;
        if (str == null) {
            str = "";
        }
        kotlin.Pair pair = kotlin.TuplesKt.to("trigger", str);
        long j = this.c;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(pair, kotlin.TuplesKt.to("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j)), kotlin.TuplesKt.to("source", "render_view_" + this.f5594a.f5469a.e), kotlin.TuplesKt.to("isCrashed", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("creativeId", this.f5594a.g), kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(s)));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b(a2, mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public final void a(long j, java.lang.Short sh) {
        java.util.Map a2 = a();
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        if (sh != null) {
            a2.put("errorCode", java.lang.Short.valueOf(sh.shortValue()));
        }
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("HtmlUrlPrefetchCompleted", a2, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public final java.util.Map a() {
        java.lang.String str = this.f5594a.l;
        if (str == null) {
            str = "";
        }
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("trigger", str), kotlin.TuplesKt.to("plType", java.lang.String.valueOf(this.f5594a.f5469a.f)), kotlin.TuplesKt.to("plId", java.lang.String.valueOf(this.f5594a.f5469a.f5497a)), kotlin.TuplesKt.to("adType", java.lang.String.valueOf(this.f5594a.f5469a.e)), kotlin.TuplesKt.to("markupType", this.f5594a.b), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.g()), kotlin.TuplesKt.to("retryCount", java.lang.String.valueOf(this.f5594a.e)), kotlin.TuplesKt.to("creativeType", this.f5594a.f), kotlin.TuplesKt.to("adPosition", java.lang.String.valueOf(this.f5594a.i)), kotlin.TuplesKt.to("isRewarded", java.lang.String.valueOf(this.f5594a.h)), kotlin.TuplesKt.to("impressionId", this.f5594a.c));
        if (this.f5594a.d.length() > 0) {
            mutableMapOf.put("metadataBlob", this.f5594a.d);
        }
        return mutableMapOf;
    }

    public final java.lang.String a(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.f5594a.l, com.unity3d.ads.BuildConfig.FLAVOR)) {
            return str;
        }
        switch (str.hashCode()) {
            case -1395724590:
                return !str.equals("PageStarted") ? str : "CompanionWebViewPageStarted";
            case -81019210:
                return !str.equals("FireAdFailed") ? str : "CompanionFireAdFailed";
            case 147127306:
                return !str.equals("FireAdReady") ? str : "CompanionFireAdReady";
            case 260281564:
                return !str.equals("WebViewLoadCalled") ? str : "CompanionWebViewLoadCalled";
            case 520950289:
                return !str.equals("WebViewLoadFinished") ? str : "CompanionWebViewLoadFinished";
            case 570988141:
                return !str.equals("RenderProcessResponsive") ? str : "RenderProcessResponsive";
            case 1001819046:
                return !str.equals("RenderProcessUnResponsive") ? str : "CompanionRenderProcessUnResponsive";
            default:
                return str;
        }
    }
}
