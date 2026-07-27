package com.inmobi.media;

import android.os.SystemClock;
import androidx.webkit.ProxyConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.util.UrlConst;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class Pb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String telemetryEventName, Yb yb, String reason, Long l) {
        Integer num;
        int i;
        Intrinsics.checkNotNullParameter(telemetryEventName, "telemetryEventName");
        if (yb != null) {
            if (reason != null) {
                Intrinsics.checkNotNullParameter(reason, "reason");
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
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            LinkedHashMap a2 = a(yb, num);
            if (l != null) {
                a2.put("latency", Long.valueOf(l.longValue()));
            }
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Ob(a2, telemetryEventName, null), 3, null);
        }
    }

    public static void a(Mb funnelState, Yb yb, Integer num, Function2 function2) {
        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        if (yb == null || funnelState.c <= yb.e) {
            return;
        }
        LinkedHashMap a2 = a(yb, num);
        long j = yb.d;
        if (j != 0) {
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        }
        yb.e = funnelState.c;
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Nb(a2, funnelState, null), 3, null);
        int i = yb.c;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (i > ((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || function2 == null) {
            return;
        }
        String str = funnelState.b;
        String str2 = yb.f;
        if (str2 == null) {
            str2 = yb.f6970a.i;
        }
        function2.invoke(str, MapsKt.mapOf(TuplesKt.to("$OPENMODE", str2), TuplesKt.to("$URLTYPE", yb.b)));
    }

    public static String a(String str) {
        if (str == null || str.length() == 0 || !StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) {
            return "invalid";
        }
        if (StringsKt.startsWith(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (StringsKt.startsWith(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (StringsKt.startsWith(str, UrlConst.HTTPS, true)) {
            return "https";
        }
        if (StringsKt.startsWith(str, "http://", true)) {
            return ProxyConfig.MATCH_HTTP;
        }
        return StringsKt.startsWith(str, "market://", true) ? "market" : "deeplink";
    }

    public static LinkedHashMap a(Yb yb, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", yb.f6970a.c);
        linkedHashMap.put("impressionId", yb.f6970a.b);
        linkedHashMap.put("plId", Long.valueOf(yb.f6970a.f6990a));
        linkedHashMap.put("adType", yb.f6970a.d);
        linkedHashMap.put("markupType", yb.f6970a.e);
        linkedHashMap.put("creativeType", yb.f6970a.f);
        linkedHashMap.put("metadataBlob", yb.f6970a.g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(yb.f6970a.h));
        String str = yb.f;
        if (str == null) {
            str = yb.f6970a.i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", yb.b);
        if (num != null) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, num);
        }
        return linkedHashMap;
    }
}
