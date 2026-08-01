package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.sdk.SdkInitializationListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.Interceptor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ta {

    /* renamed from: a, reason: collision with root package name */
    public static final Ta f6869a = new Ta();
    public static final Function1 b = new Function1() { // from class: com.inmobi.media.Ta$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Ta.a((Qa) obj);
        }
    };
    public static volatile Qa c;

    public static final C3733ga a(Qa config) {
        Intrinsics.checkNotNullParameter(config, "config");
        long j = config.e;
        return C3676ea.a(new Interceptor[0], null, new Interceptor[0], new Cm(j, j, j), 2);
    }

    public static LinkedHashMap a(long j, short s) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(elapsedRealtime));
        String str = "Start Latency " + linkedHashMap.get("latency");
        linkedHashMap.put("integrationType", "InMobi");
        linkedHashMap.put("trigger", Short.valueOf(s));
        return linkedHashMap;
    }

    public static short a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        switch (message.hashCode()) {
            case -1999141320:
                return !message.equals(SdkInitializationListener.INIT_IN_PROGRESS) ? (short) 2415 : (short) 2417;
            case 369358835:
                return !message.equals("SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.") ? (short) 2415 : (short) 2412;
            case 1262255152:
                return !message.equals(SdkInitializationListener.MISSING_CONTEXT) ? (short) 2415 : (short) 2410;
            case 1340926338:
                return !message.equals(SdkInitializationListener.ACCOUNT_ID_DIFFERENT) ? (short) 2415 : (short) 2416;
            case 1355769922:
                return !message.equals(SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY) ? (short) 2415 : (short) 2414;
            case 1364970517:
                return !message.equals("Account id cannot be empty. Please provide a valid account id.") ? (short) 2415 : (short) 2411;
            case 2003546830:
                return !message.equals(SdkInitializationListener.ACCOUNT_ID_MISMATCH) ? (short) 2415 : (short) 2413;
            default:
                return (short) 2415;
        }
    }

    public static void a(Context context, String str, Long l, Short sh) {
        Context context2;
        if (context == null || (context2 = context.getApplicationContext()) == null) {
            context2 = AbstractC3914mk.f7252a;
        }
        Context context3 = context2;
        if (context3 != null) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Ra(context3, str, l, sh, null), 3, null);
        } else {
            String str2 = "Init telemetry skipped for " + str + "; reason=missing_context hasInputContext=" + (context != null) + " hasSdkContext=" + (AbstractC3914mk.f7252a != null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:10|(3:11|12|13)|14|15|(2:17|18)(5:21|22|(7:24|(2:26|(1:28))|31|32|33|34|35)|41|42)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:24|(2:26|(1:28))|31|32|33|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x027e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r11 * 1000, r3) == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x029d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x029b, code lost:
    
        if (r0 != r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ce, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025f, code lost:
    
        if (r6 >= 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x029b -> B:14:0x029e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x02cf -> B:40:0x02d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, String eventType, Long l, Short sh, ContinuationImpl continuationImpl) {
        Sa sa;
        int i;
        Qa qa;
        int i2;
        Mf mf;
        C3733ga c3733ga;
        int coerceAtLeast;
        RootConfig.InitTelemetry initTelemetry;
        Qa qa2;
        Mf mf2;
        C3733ga c3733ga2;
        int i3;
        Object a2;
        if (continuationImpl instanceof Sa) {
            sa = (Sa) continuationImpl;
            int i4 = sa.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sa.h = i4 - Integer.MIN_VALUE;
                Object obj = sa.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sa.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    qa = c;
                    i2 = 0;
                    if (qa == null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Context applicationContext = context.getApplicationContext();
                        ConcurrentHashMap concurrentHashMap = Db.b;
                        RootConfig.PreInit preInit = null;
                        String string = applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getString("pre_init_config", null);
                        if (string != null) {
                            try {
                                JSONObject jsonObject = new JSONObject(string);
                                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                                Intrinsics.checkNotNullParameter(RootConfig.PreInit.class, "type");
                                preInit = (RootConfig.PreInit) RootConfig.PreInit.class.cast(AbstractC3875lb.a(jsonObject, RootConfig.PreInit.class, null, null));
                            } catch (Exception unused) {
                            }
                        }
                        if (preInit == null || (initTelemetry = preInit.getInitTelemetry()) == null) {
                            initTelemetry = new RootConfig.InitTelemetry();
                        }
                        Qa qa3 = new Qa(initTelemetry.getEnabled(), initTelemetry.getTelemetryUrl(), initTelemetry.getMaxRetries(), initTelemetry.getRetryInterval(), initTelemetry.getTimeout());
                        c = qa3;
                        qa = qa3;
                    }
                    if (!qa.f6799a) {
                        String str = "Init telemetry skipped for " + eventType + "; reason=config_disabled urlBlank=" + StringsKt.isBlank(qa.b) + " maxRetries=" + qa.c + " retryInterval=" + qa.d + " timeout=" + qa.e;
                        return Unit.INSTANCE;
                    }
                    if (StringsKt.isBlank(qa.b)) {
                        String str2 = "Init telemetry skipped for " + eventType + "; reason=blank_telemetry_url enabled=" + qa.f6799a + " maxRetries=" + qa.c + " retryInterval=" + qa.d + " timeout=" + qa.e;
                        return Unit.INSTANCE;
                    }
                    String url = qa.b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(eventType, "eventType");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("eventType", eventType);
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    jSONObject.put("eventId", uuid);
                    jSONObject.put("dts", System.currentTimeMillis());
                    jSONObject.put("samplingRate", 100);
                    jSONObject.put("isTemplateEvent", false);
                    if (l != null) {
                        jSONObject.put("latency", l.longValue());
                    }
                    if (sh != null) {
                        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sh.shortValue()));
                    }
                    String str3 = AbstractC3914mk.c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("im-accid", str3), TuplesKt.to("version", "4.0.0"), TuplesKt.to("mk-version", AbstractC3942nk.a()), TuplesKt.to("u-appbid", context.getPackageName()), TuplesKt.to("tp", AbstractC3942nk.b));
                    String str4 = AbstractC3942nk.f7270a;
                    if (str4 != null) {
                        mutableMapOf.put("tp-v", str4);
                    }
                    Intrinsics.checkNotNull(mutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    JSONObject jSONObject2 = new JSONObject(mutableMapOf);
                    jSONObject2.put("payload", new JSONArray().put(jSONObject));
                    String payload = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("payload", payload));
                    JSONObject b2 = AbstractC4263z7.b();
                    if (b2 != null) {
                        hashMapOf.put("consentObject", b2.toString());
                    }
                    mf = new Mf(url, null, null, new B7(hashMapOf, 0), null, 52);
                    c3733ga = (C3733ga) b.invoke(qa);
                    coerceAtLeast = RangesKt.coerceAtLeast(qa.c, 0);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = sa.e;
                        coerceAtLeast = sa.d;
                        c3733ga2 = sa.c;
                        mf2 = sa.b;
                        qa2 = sa.f6847a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            a2 = obj;
                        } catch (Exception e) {
                            Exception e2 = e;
                            String str5 = "Init telemetry request failed: " + e2.getMessage();
                            mf = mf2;
                            if (i3 != coerceAtLeast) {
                            }
                            return Unit.INSTANCE;
                        }
                        Of of = (Of) a2;
                        if (AbstractC4086sn.a(of)) {
                            return Unit.INSTANCE;
                        }
                        String str6 = "Init telemetry request failed: " + of.c() + ServerSentEventKt.SPACE + of.e();
                        mf = mf2;
                        if (i3 != coerceAtLeast) {
                            qa = qa2;
                            C3733ga c3733ga3 = c3733ga2;
                            i2 = i3 + 1;
                            c3733ga = c3733ga3;
                            if (i2 > 0) {
                                long j = qa.d;
                                if (j > 0) {
                                    sa.f6847a = qa;
                                    sa.b = mf;
                                    sa.c = c3733ga;
                                    sa.d = coerceAtLeast;
                                    sa.e = i2;
                                    sa.h = 1;
                                }
                            }
                            mf2 = mf;
                            qa2 = qa;
                            int i5 = i2;
                            c3733ga2 = c3733ga;
                            i3 = i5;
                            sa.f6847a = qa2;
                            sa.b = mf2;
                            sa.c = c3733ga2;
                            sa.d = coerceAtLeast;
                            sa.e = i3;
                            sa.h = 2;
                            a2 = c3733ga2.f7119a.a(mf2, sa);
                        }
                        return Unit.INSTANCE;
                    }
                    int i6 = sa.e;
                    int i7 = sa.d;
                    C3733ga c3733ga4 = sa.c;
                    Mf mf3 = sa.b;
                    Qa qa4 = sa.f6847a;
                    ResultKt.throwOnFailure(obj);
                    qa2 = qa4;
                    mf2 = mf3;
                    c3733ga2 = c3733ga4;
                    coerceAtLeast = i7;
                    i3 = i6;
                    sa.f6847a = qa2;
                    sa.b = mf2;
                    sa.c = c3733ga2;
                    sa.d = coerceAtLeast;
                    sa.e = i3;
                    sa.h = 2;
                    a2 = c3733ga2.f7119a.a(mf2, sa);
                }
            }
        }
        sa = new Sa(this, continuationImpl);
        Object obj2 = sa.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sa.h;
        if (i != 0) {
        }
    }
}
