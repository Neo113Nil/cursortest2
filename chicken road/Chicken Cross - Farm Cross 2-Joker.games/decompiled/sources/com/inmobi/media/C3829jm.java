package com.inmobi.media;

import android.content.ContentValues;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3829jm implements Ng {

    /* renamed from: a, reason: collision with root package name */
    public static final C3829jm f7187a = new C3829jm();
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);
    public static final String c;
    public static final List d;
    public static final Lazy e;
    public static final AtomicBoolean f;
    public static M6 g;
    public static volatile C4196wm h;
    public static final Function1 i;
    public static C4085sm j;

    static {
        Intrinsics.checkNotNullExpressionValue("jm", "getSimpleName(...)");
        c = "jm";
        List mutableListOf = CollectionsKt.mutableListOf("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "BannerDetachReleased", "BannerDetachObserved", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed", "HtmlUrlPrefetchStarted", "HtmlUrlPrefetchCompleted", "InAppBrowserLoaderShown", "InAppBrowserLoaderHidden", "SynapseInit", "SynapsePushSuccess", "SynapsePushFailure", "SynapsePushAborted", "SynapseCollectorTriggered", "SynapseCollectorCompleted", "AppActivityAnalyticsFailure", "RewardReceived", "RewardDelivered", "RewardFailed");
        d = mutableListOf;
        e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.jm$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3829jm.c();
            }
        });
        f = new AtomicBoolean(false);
        C3801im c3801im = new C3801im();
        i = new Function1() { // from class: com.inmobi.media.jm$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3829jm.a((C3698f3) obj);
            }
        };
        TelemetryConfig b2 = b();
        h = new C4196wm(new C3888lm(b2.getEnabled(), b2.getAssetReporting().isImageEnabled(), b2.getAssetReporting().isGifEnabled(), b2.getAssetReporting().isVideoEnabled(), b2.getDisableAllGeneralEvents(), b2.getPriorityEventsList(), b2.getSamplingFactor()), CollectionsKt.toList(mutableListOf));
        AbstractC4260z4.a("telemetry", c3801im);
    }

    public static final Unit a(C3698f3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.f7098a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                    C4085sm c4085sm = j;
                    if (c4085sm != null) {
                        Map map = it.c;
                        Object obj = map != null ? map.get("data") : null;
                        c4085sm.a("CrashEventOccurred", obj instanceof C4124u5 ? (C4124u5) obj : null);
                        break;
                    }
                    break;
                case 151:
                    C4085sm c4085sm2 = j;
                    if (c4085sm2 != null) {
                        Map map2 = it.c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        C3892lq c3892lq = obj2 instanceof C3892lq ? (C3892lq) obj2 : null;
                        if (c3892lq != null && AbstractC4143un.a(c3892lq)) {
                            Y5.f6965a.getClass();
                            if (!Y5.t()) {
                                c4085sm2.a("MainThreadBlockedEvent", c3892lq);
                                break;
                            }
                        }
                    }
                    break;
                case 152:
                    C4085sm c4085sm3 = j;
                    if (c4085sm3 != null) {
                        Map map3 = it.c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        c4085sm3.a(obj3 instanceof T1 ? (T1) obj3 : null);
                        break;
                    }
                    break;
                default:
                    String str = "unwanted event received - " + i2;
                    break;
            }
        } else {
            f.set(false);
            M6 m6 = g;
            if (m6 != null) {
                m6.f.set(false);
                m6.g.set(true);
                Job job = m6.j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                m6.j = null;
                m6.i = null;
            }
            g = null;
            j = null;
            ((C4214xd) AbstractC3914mk.f.getValue()).a(i);
        }
        return Unit.INSTANCE;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC3944nm telemetryEventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3774hm(eventType, keyValueMap, telemetryEventType, null), 3, null);
    }

    public static final C4029qm c() {
        return new C4029qm(T9.b());
    }

    public static TelemetryConfig b() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class);
    }

    public static boolean a(String eventType, Map keyValueMap, EnumC3944nm telemetryEventType) {
        boolean a2;
        C4196wm c4196wm = h;
        if (c4196wm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
            c4196wm = null;
        }
        c4196wm.getClass();
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (c4196wm.f7464a.f7231a) {
            int ordinal = telemetryEventType.ordinal();
            if (ordinal == 0) {
                a2 = c4196wm.b.a(eventType, keyValueMap);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = true;
            }
        } else {
            a2 = false;
        }
        return !a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0120, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4057rm c4057rm, ContinuationImpl continuationImpl) {
        C3717fm c3717fm;
        int i2;
        C4057rm c4057rm2;
        int i3;
        int i4;
        int i5;
        String str;
        Object a2;
        int a3;
        if (continuationImpl instanceof C3717fm) {
            c3717fm = (C3717fm) continuationImpl;
            int i6 = c3717fm.e;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c3717fm.e = i6 - Integer.MIN_VALUE;
                Object obj = c3717fm.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3717fm.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int maxEventsToPersist = b().getMaxEventsToPersist();
                    C4029qm c4029qm = (C4029qm) e.getValue();
                    c3717fm.f7111a = c4057rm;
                    c3717fm.b = maxEventsToPersist;
                    c3717fm.e = 1;
                    Object a4 = c4029qm.a(c3717fm);
                    if (a4 != coroutine_suspended) {
                        c4057rm2 = c4057rm;
                        i3 = maxEventsToPersist;
                        obj = a4;
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    i3 = c3717fm.b;
                    c4057rm2 = c3717fm.f7111a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    i5 = c3717fm.b;
                    c4057rm2 = c3717fm.f7111a;
                    ResultKt.throwOnFailure(obj);
                    String str2 = "deletedEvents: " + i5;
                    a3 = AbstractC3973om.a() + i5;
                    if (a3 != -1) {
                        AbstractC3973om.b = a3;
                        Db db = AbstractC3973om.f7292a;
                        if (db != null) {
                            ConcurrentHashMap concurrentHashMap = Db.b;
                            db.a("count", a3, false);
                        }
                    }
                    C4029qm c4029qm2 = (C4029qm) e.getValue();
                    c3717fm.f7111a = null;
                    c3717fm.e = 3;
                    S9 s9 = c4029qm2.b;
                    String str3 = c4029qm2.f6529a;
                    c4057rm2.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("eventType", c4057rm2.f6546a);
                    str = c4057rm2.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues.put("payload", str);
                    contentValues.put("eventSource", c4057rm2.e);
                    contentValues.put("ts", String.valueOf(c4057rm2.c));
                    a2 = s9.a(str3, contentValues, 4, c3717fm);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                }
                int intValue = ((Number) obj).intValue();
                i4 = (intValue + 1) - i3;
                String str4 = "Current event count: " + intValue + ", Max events allowed: " + i3 + ", Overflow count: " + i4;
                if (i4 > 0) {
                    C4029qm c4029qm3 = (C4029qm) e.getValue();
                    c3717fm.f7111a = c4057rm2;
                    c3717fm.b = i4;
                    c3717fm.e = 2;
                    if (c4029qm3.a(i4, (ContinuationImpl) c3717fm) != coroutine_suspended) {
                        i5 = i4;
                        String str22 = "deletedEvents: " + i5;
                        a3 = AbstractC3973om.a() + i5;
                        if (a3 != -1) {
                        }
                    }
                    return coroutine_suspended;
                }
                C4029qm c4029qm22 = (C4029qm) e.getValue();
                c3717fm.f7111a = null;
                c3717fm.e = 3;
                S9 s92 = c4029qm22.b;
                String str32 = c4029qm22.f6529a;
                c4057rm2.getClass();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("eventType", c4057rm2.f6546a);
                str = c4057rm2.b;
                if (str == null) {
                }
                contentValues2.put("payload", str);
                contentValues2.put("eventSource", c4057rm2.e);
                contentValues2.put("ts", String.valueOf(c4057rm2.c));
                a2 = s92.a(str32, contentValues2, 4, c3717fm);
                if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
            }
        }
        c3717fm = new C3717fm(this, continuationImpl);
        Object obj2 = c3717fm.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3717fm.e;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        i4 = (intValue2 + 1) - i3;
        String str42 = "Current event count: " + intValue2 + ", Max events allowed: " + i3 + ", Overflow count: " + i4;
        if (i4 > 0) {
        }
        C4029qm c4029qm222 = (C4029qm) e.getValue();
        c3717fm.f7111a = null;
        c3717fm.e = 3;
        S9 s922 = c4029qm222.b;
        String str322 = c4029qm222.f6529a;
        c4057rm2.getClass();
        ContentValues contentValues22 = new ContentValues();
        contentValues22.put("eventType", c4057rm2.f6546a);
        str = c4057rm2.b;
        if (str == null) {
        }
        contentValues22.put("payload", str);
        contentValues22.put("eventSource", c4057rm2.e);
        contentValues22.put("ts", String.valueOf(c4057rm2.c));
        a2 = s922.a(str322, contentValues22, 4, c3717fm);
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    public final void a() {
        if (f.get()) {
            D6 eventConfig = b().getEventConfig();
            eventConfig.k = b().getTelemetryUrl();
            M6 m6 = g;
            if (m6 == null) {
                g = new M6("telemetry", (C4029qm) e.getValue(), this, eventConfig, this);
            } else {
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                m6.i = eventConfig;
            }
            M6 m62 = g;
            if (m62 != null) {
                m62.a(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3661dm c3661dm;
        Object obj;
        int i2;
        if (continuationImpl instanceof C3661dm) {
            c3661dm = (C3661dm) continuationImpl;
            int i3 = c3661dm.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3661dm.c = i3 - Integer.MIN_VALUE;
                obj = c3661dm.f7074a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3661dm.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4029qm c4029qm = (C4029qm) e.getValue();
                    c3661dm.c = 1;
                    obj = c4029qm.a(c3661dm);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).intValue() > 0) {
                    a();
                }
                return Unit.INSTANCE;
            }
        }
        c3661dm = new C3661dm(this, continuationImpl);
        obj = c3661dm.f7074a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3661dm.c;
        if (i2 != 0) {
        }
        if (((Number) obj).intValue() > 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.inmobi.media.Ng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C3689em c3689em;
        int i2;
        int a2;
        List<C4057rm> mutableList;
        String str;
        if (continuation instanceof C3689em) {
            c3689em = (C3689em) continuation;
            int i3 = c3689em.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3689em.c = i3 - Integer.MIN_VALUE;
                Object obj = c3689em.f7091a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3689em.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Y5.f6965a.getClass();
                    if (Y5.n() == 1) {
                        a2 = b().getWifiConfig().a();
                    } else {
                        a2 = b().getMobileConfig().a();
                    }
                    C4029qm c4029qm = (C4029qm) e.getValue();
                    c3689em.c = 1;
                    obj = c4029qm.b(a2, c3689em);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                mutableList = CollectionsKt.toMutableList((Collection) obj);
                if (!a("DatabaseMaxLimitReachedV2", MapsKt.emptyMap(), EnumC3944nm.f7271a) && AbstractC3973om.a() > 0) {
                    String str2 = "Adding DB max limit reached event with missed events count: " + AbstractC3973om.a();
                    int a3 = AbstractC3973om.a();
                    C4057rm c4057rm = new C4057rm("DatabaseMaxLimitReachedV2", null, "sdk");
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("eventId", uuid), TuplesKt.to("eventType", "DatabaseMaxLimitReachedV2"), TuplesKt.to("samplingRate", 100), TuplesKt.to("isTemplateEvent", Boolean.FALSE), TuplesKt.to("eventLostCount", Integer.valueOf(a3)));
                    Intrinsics.checkNotNull(hashMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    String payload = new JSONObject(hashMapOf).toString();
                    Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    c4057rm.b = payload;
                    AbstractC3973om.c = Boxing.boxInt(c4057rm.d);
                    mutableList.add(c4057rm);
                }
                if (!mutableList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = mutableList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxInt(((C4057rm) it.next()).d));
                    }
                    try {
                        String str3 = AbstractC3914mk.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("im-accid", str3), TuplesKt.to("version", "4.0.0"), TuplesKt.to("mk-version", AbstractC3942nk.a()), TuplesKt.to("u-appbid", U1.f6882a), TuplesKt.to("tp", AbstractC3942nk.b));
                        String str4 = AbstractC3942nk.f7270a;
                        if (str4 != null) {
                            mutableMapOf.put("tp-v", str4);
                        }
                        Intrinsics.checkNotNull(mutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        JSONObject jSONObject = new JSONObject(mutableMapOf);
                        JSONArray jSONArray = new JSONArray();
                        for (C4057rm c4057rm2 : mutableList) {
                            String str5 = c4057rm2.b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (StringsKt.trim((CharSequence) str5).toString().length() > 0) {
                                String str6 = c4057rm2.b;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                JSONObject jSONObject2 = new JSONObject(str6);
                                jSONObject2.put("dts", c4057rm2.c);
                                jSONArray.put(jSONObject2);
                            }
                        }
                        jSONObject.put("payload", jSONArray);
                        str = jSONObject.toString();
                    } catch (JSONException unused) {
                        str = null;
                    }
                    if (str != null) {
                        return new F6(str, arrayList);
                    }
                }
                return null;
            }
        }
        c3689em = new C3689em(this, (ContinuationImpl) continuation);
        Object obj2 = c3689em.f7091a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3689em.c;
        if (i2 != 0) {
        }
        mutableList = CollectionsKt.toMutableList((Collection) obj2);
        if (!a("DatabaseMaxLimitReachedV2", MapsKt.emptyMap(), EnumC3944nm.f7271a)) {
            String str22 = "Adding DB max limit reached event with missed events count: " + AbstractC3973om.a();
            int a32 = AbstractC3973om.a();
            C4057rm c4057rm3 = new C4057rm("DatabaseMaxLimitReachedV2", null, "sdk");
            String uuid2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
            HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to("eventId", uuid2), TuplesKt.to("eventType", "DatabaseMaxLimitReachedV2"), TuplesKt.to("samplingRate", 100), TuplesKt.to("isTemplateEvent", Boolean.FALSE), TuplesKt.to("eventLostCount", Integer.valueOf(a32)));
            Intrinsics.checkNotNull(hashMapOf2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload2 = new JSONObject(hashMapOf2).toString();
            Intrinsics.checkNotNullExpressionValue(payload2, "toString(...)");
            Intrinsics.checkNotNullParameter(payload2, "payload");
            c4057rm3.b = payload2;
            AbstractC3973om.c = Boxing.boxInt(c4057rm3.d);
            mutableList.add(c4057rm3);
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
    public static final Object b(ContinuationImpl continuationImpl) {
        C3745gm c3745gm;
        int i2;
        if (continuationImpl instanceof C3745gm) {
            c3745gm = (C3745gm) continuationImpl;
            int i3 = c3745gm.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3745gm.b = i3 - Integer.MIN_VALUE;
                Object obj = c3745gm.f7128a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3745gm.b;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!f.getAndSet(true)) {
                        C3829jm c3829jm = f7187a;
                        c3745gm.b = 1;
                        if (c3829jm.a((ContinuationImpl) c3745gm) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{2, 1, TextFieldImplKt.AnimationDuration, 152, 151}, i);
                j = new C4085sm(b());
                return Unit.INSTANCE;
            }
        }
        c3745gm = new C3745gm(continuationImpl);
        Object obj2 = c3745gm.f7128a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3745gm.b;
        if (i2 != 0) {
        }
        ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{2, 1, TextFieldImplKt.AnimationDuration, 152, 151}, i);
        j = new C4085sm(b());
        return Unit.INSTANCE;
    }
}
