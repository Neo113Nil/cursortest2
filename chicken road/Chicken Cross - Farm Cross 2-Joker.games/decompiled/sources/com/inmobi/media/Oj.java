package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class Oj {

    /* renamed from: a, reason: collision with root package name */
    public final Ij f6766a;
    public long b;
    public long c;
    public int d;
    public int e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public long h;

    public Oj(Ij renderViewMetaData) {
        Intrinsics.checkNotNullParameter(renderViewMetaData, "renderViewMetaData");
        this.f6766a = renderViewMetaData;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class);
        Nj nj = renderViewMetaData.k;
        this.f = new AtomicInteger(nj != null ? nj.f6746a : telemetryConfig.getMaxTemplateEvents());
        this.g = new AtomicBoolean(false);
    }

    public final void a(int i) {
        short s;
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context, "im_telemetry_prefs");
            String str = U1.b;
            if (str == null) {
                str = "unknown";
            }
            Intrinsics.checkNotNullParameter("last_app_version", "key");
            if (Intrinsics.areEqual(a2.f6510a.getString("last_app_version", null), str)) {
                String str2 = "App version unchanged: " + str;
                return;
            }
            Map a3 = a();
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
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("VideoPlayerNotSupported", a3, EnumC3944nm.f7271a);
            a2.a("last_app_version", str, false);
        }
    }

    public final void b() {
        String a2 = a("WebViewLoadCalled");
        this.c = SystemClock.elapsedRealtime();
        Map a3 = a();
        if (Intrinsics.areEqual(a2, "CompanionWebViewLoadCalled")) {
            long j = this.b;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            a3.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        } else {
            C4064s1 c4064s1 = this.f6766a.j;
            if (c4064s1 != null) {
                long j2 = c4064s1.f7364a.c;
                CoroutineScope coroutineScope2 = AbstractC4143un.f7420a;
                a3.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j2));
            }
        }
        a3.put("creativeId", this.f6766a.g);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b(a2, a3, EnumC3944nm.f7271a);
    }

    public final void b(String priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Map a2 = a();
        a2.put("trigger", priority + "_0");
        AbstractC4108th.a("PingStarted", a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (new org.json.JSONObject(r10).length() == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String eventType, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.g.get()) {
            return;
        }
        if (this.f.decrementAndGet() <= 0) {
            this.g.set(true);
            Map a2 = a();
            long j = this.c;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("TemplateEventDropped", a2, EnumC3944nm.f7271a);
            return;
        }
        if (str != null) {
            try {
            } catch (JSONException e) {
                Log.e(C3829jm.c, "Error parsing JSON: " + e);
            }
        }
        str2 = this.f6766a.l;
        if (str2 == null) {
            str2 = "";
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("trigger", str2), TuplesKt.to("plType", String.valueOf(this.f6766a.f6630a.f)), TuplesKt.to("impressionId", this.f6766a.c), TuplesKt.to("markupType", this.f6766a.b), TuplesKt.to("networkType", Y5.g()));
        if (str != null) {
            mutableMapOf.put("payload", str);
        }
        if (this.f6766a.d.length() > 0) {
            mutableMapOf.put("metadataBlob", this.f6766a.d);
        }
        C3829jm.b(eventType, mutableMapOf, EnumC3944nm.b);
        str = null;
        str2 = this.f6766a.l;
        if (str2 == null) {
        }
        Map mutableMapOf2 = MapsKt.mutableMapOf(TuplesKt.to("trigger", str2), TuplesKt.to("plType", String.valueOf(this.f6766a.f6630a.f)), TuplesKt.to("impressionId", this.f6766a.c), TuplesKt.to("markupType", this.f6766a.b), TuplesKt.to("networkType", Y5.g()));
        if (str != null) {
        }
        if (this.f6766a.d.length() > 0) {
        }
        C3829jm.b(eventType, mutableMapOf2, EnumC3944nm.b);
    }

    public final void a(boolean z, short s) {
        String a2 = a("WebViewRenderProcessGoneEvent");
        String str = this.f6766a.l;
        if (str == null) {
            str = "";
        }
        Pair pair = TuplesKt.to("trigger", str);
        long j = this.c;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - j)), TuplesKt.to("source", "render_view_" + this.f6766a.f6630a.e), TuplesKt.to("isCrashed", Boolean.valueOf(z)), TuplesKt.to("creativeId", this.f6766a.g), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b(a2, mutableMapOf, EnumC3944nm.f7271a);
    }

    public final void a(long j, Short sh) {
        Map a2 = a();
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (sh != null) {
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sh.shortValue()));
        }
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("HtmlUrlPrefetchCompleted", a2, EnumC3944nm.f7271a);
    }

    public final void a(int i, String priority, short s) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Map a2 = a();
        a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        a2.put("trigger", priority + "_" + i);
        AbstractC4108th.a("PingFailed", a2);
    }

    public final void a(int i, long j, String priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Map a2 = a();
        a2.put("trigger", priority + "_" + i);
        a2.put("latency", Long.valueOf(j));
        AbstractC4108th.a("PingSuccess", a2);
    }

    public final void a(short s) {
        Map a2 = a();
        a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("RewardFailed", a2, EnumC3944nm.f7271a);
    }

    public final Map a() {
        String str = this.f6766a.l;
        if (str == null) {
            str = "";
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("trigger", str), TuplesKt.to("plType", String.valueOf(this.f6766a.f6630a.f)), TuplesKt.to("plId", String.valueOf(this.f6766a.f6630a.f7470a)), TuplesKt.to("adType", String.valueOf(this.f6766a.f6630a.e)), TuplesKt.to("markupType", this.f6766a.b), TuplesKt.to("networkType", Y5.g()), TuplesKt.to("retryCount", String.valueOf(this.f6766a.e)), TuplesKt.to("creativeType", this.f6766a.f), TuplesKt.to("creativeId", this.f6766a.g), TuplesKt.to("adPosition", String.valueOf(this.f6766a.i)), TuplesKt.to("isRewarded", String.valueOf(this.f6766a.h)), TuplesKt.to("impressionId", this.f6766a.c));
        if (this.f6766a.d.length() > 0) {
            mutableMapOf.put("metadataBlob", this.f6766a.d);
        }
        return mutableMapOf;
    }

    public final String a(String str) {
        if (Intrinsics.areEqual(this.f6766a.l, BuildConfig.FLAVOR)) {
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
