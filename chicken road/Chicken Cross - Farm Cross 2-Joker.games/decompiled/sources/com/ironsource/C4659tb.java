package com.ironsource;

import android.content.Context;
import com.ironsource.C4604q9;
import com.ironsource.Te;
import com.ironsource.U3;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.ironsource.tb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4659tb {

    /* renamed from: com.ironsource.tb$a */
    static final class a extends Lambda implements Function1<Map.Entry<? extends String, ? extends Boolean>, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8679a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, Boolean> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + U3.j.b + entry.getValue().booleanValue();
        }
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().a(runnable);
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final void c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Gf.a(EnumC4707w5.GDPR_CONSENT, jSONObject);
    }

    public static /* synthetic */ void a(C4659tb c4659tb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c4659tb.a(runnable, j);
    }

    public final C4555ne b(C4555ne error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C4555ne(error.c(), "serverResponseIsNotValid") : error;
    }

    public final void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(com.ironsource.environment.thread.a.f8176a.a(runnable), j);
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4604q9.a aVar = C4604q9.f8489a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final void b(String adUnitId, int i, String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        Gf.a(EnumC4707w5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Gf.a(EnumC4707w5.SET_COPPA, jSONObject);
    }

    public final void b() {
        Gf.a(EnumC4707w5.TROUBLESHOOTING_SET_COPPA_AFTER_INIT, new JSONObject());
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.a adFormat, String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return Gf.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(C4659tb c4659tb, long j, Te.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c4659tb.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, Te.a responseOrigin, long j2, JSONObject data) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j);
            String b = responseOrigin.b();
            Intrinsics.checkNotNullExpressionValue(b, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, a(b, j2));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gf.a(EnumC4707w5.SDK_INIT_SUCCESS, data);
    }

    public final C4555ne a(C4555ne error) {
        C4555ne c4555ne;
        Intrinsics.checkNotNullParameter(error, "error");
        int c = error.c();
        if (c == 2070) {
            c4555ne = new C4555ne(error.c(), "noServerResponse");
        } else {
            if (c != 2110) {
                return error;
            }
            c4555ne = new C4555ne(error.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return c4555ne;
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C4659tb c4659tb, C4555ne c4555ne, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c4659tb.a(c4555ne, j, jSONObject);
    }

    public final void a(C4555ne error, long j, JSONObject data) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gf.a(EnumC4707w5.SDK_INIT_FAILED, data);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int i, String str) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(Ta.f, adFormat.getValue());
        jSONObject.put("adf", Gf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        Gf.a(EnumC4707w5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String adUnitId, int i, String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        Gf.a(EnumC4707w5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, CollectionsKt.joinToString$default(networkConsents.entrySet(), ";", null, null, 0, null, a.f8679a, 30, null));
        Gf.a(EnumC4707w5.GDPR_CONSENTS, jSONObject);
    }

    public final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Gf.a(EnumC4707w5.SET_CCPA, jSONObject);
    }

    public final boolean a() {
        return Ib.v.d().f().c();
    }
}
