package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Xa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(java.lang.String telemetryEventName, com.inmobi.media.C2431gb c2431gb, java.lang.String reason, java.lang.Long l) {
        java.lang.Integer num;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEventName, "telemetryEventName");
        if (c2431gb != null) {
            if (reason != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
                switch (reason.hashCode()) {
                    case -1519854342:
                        if (reason.equals("PAGE_COMMIT_VISIBLE")) {
                            i = 2404;
                            break;
                        }
                        i = 0;
                        break;
                    case -404561643:
                        if (reason.equals("LOADER_TIMEOUT")) {
                            i = 2405;
                            break;
                        }
                        i = 0;
                        break;
                    case -229348854:
                        if (reason.equals("RECEIVED_ERROR")) {
                            i = 2403;
                            break;
                        }
                        i = 0;
                        break;
                    case 433141802:
                        if (reason.equals("UNKNOWN")) {
                            i = 2407;
                            break;
                        }
                        i = 0;
                        break;
                    case 1893734552:
                        if (reason.equals("RENDER_PROCESS_GONE")) {
                            i = 2401;
                            break;
                        }
                        i = 0;
                        break;
                    case 2032004239:
                        if (reason.equals("RECEIVED_HTTP_ERROR")) {
                            i = 2402;
                            break;
                        }
                        i = 0;
                        break;
                    case 2109630258:
                        if (reason.equals("ACTIVITY_STOP")) {
                            i = 2406;
                            break;
                        }
                        i = 0;
                        break;
                    default:
                        i = 0;
                        break;
                }
                num = java.lang.Integer.valueOf(i);
            } else {
                num = null;
            }
            java.util.LinkedHashMap a2 = a(c2431gb, num);
            if (l != null) {
                a2.put("latency", java.lang.Long.valueOf(l.longValue()));
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.Wa(a2, telemetryEventName, null), 3, null);
        }
    }

    public static void a(com.inmobi.media.Ua funnelState, com.inmobi.media.C2431gb c2431gb, java.lang.Integer num, kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        if (c2431gb == null || funnelState.c <= c2431gb.e) {
            return;
        }
        java.util.LinkedHashMap a2 = a(c2431gb, num);
        long j = c2431gb.d;
        if (j != 0) {
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        }
        c2431gb.e = funnelState.c;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.Va(a2, funnelState, null), 3, null);
        int i = c2431gb.c;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        if (i > ((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || function2 == null) {
            return;
        }
        java.lang.String str = funnelState.b;
        java.lang.String str2 = c2431gb.f;
        if (str2 == null) {
            str2 = c2431gb.f5216a.i;
        }
        function2.invoke(str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("$OPENMODE", str2), kotlin.TuplesKt.to("$URLTYPE", c2431gb.b)));
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.length() == 0 || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "://", false, 2, (java.lang.Object) null)) {
            return "invalid";
        }
        if (kotlin.text.StringsKt.startsWith(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (kotlin.text.StringsKt.startsWith(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (kotlin.text.StringsKt.startsWith(str, "https://", true)) {
            return "https";
        }
        if (kotlin.text.StringsKt.startsWith(str, "http://", true)) {
            return androidx.webkit.ProxyConfig.MATCH_HTTP;
        }
        return kotlin.text.StringsKt.startsWith(str, "market://", true) ? "market" : com.adjust.sdk.Constants.DEEPLINK;
    }

    public static java.util.LinkedHashMap a(com.inmobi.media.C2431gb c2431gb, java.lang.Integer num) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("plType", c2431gb.f5216a.c);
        linkedHashMap.put("impressionId", c2431gb.f5216a.b);
        linkedHashMap.put("plId", java.lang.Long.valueOf(c2431gb.f5216a.f5239a));
        linkedHashMap.put("adType", c2431gb.f5216a.d);
        linkedHashMap.put("markupType", c2431gb.f5216a.e);
        linkedHashMap.put("creativeType", c2431gb.f5216a.f);
        linkedHashMap.put("metadataBlob", c2431gb.f5216a.g);
        linkedHashMap.put("isRewarded", java.lang.Boolean.valueOf(c2431gb.f5216a.h));
        java.lang.String str = c2431gb.f;
        if (str == null) {
            str = c2431gb.f5216a.i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", c2431gb.b);
        if (num != null) {
            linkedHashMap.put("errorCode", num);
        }
        return linkedHashMap;
    }
}
