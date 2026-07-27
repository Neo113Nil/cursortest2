package com.chartboost.sdk.impl;

import bolts.MeasurementEvent;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.tracking.TrackAd;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ei {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f4759a;

    public ei(Function0 jsonFactory) {
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.f4759a = jsonFactory;
    }

    public static final JSONObject a() {
        return new JSONObject();
    }

    public final int b(d7 d7Var, String str) {
        if (Intrinsics.areEqual(str, c0.b.g.b())) {
            return d7Var.D();
        }
        if (Intrinsics.areEqual(str, c0.c.g.b())) {
            return d7Var.E();
        }
        if (Intrinsics.areEqual(str, c0.a.g.b())) {
            return d7Var.C();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject c(JSONObject jSONObject, d7 d7Var) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, d7Var.B());
            JSONObject put = jSONObject.put("session_count", d7Var.z());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    public final String a(com.chartboost.sdk.tracking.f event, d7 environment) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environment, "environment");
        String jSONObject = a(a(a(c(c(b(b((JSONObject) this.f4759a.invoke(), environment), event), environment), event), event), environment), environment, event.a()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public /* synthetic */ ei(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.ei$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ei.a();
            }
        } : function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject b(JSONObject jSONObject, d7 d7Var) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("app_id", d7Var.a());
            JSONObject put = jSONObject.put("chartboost_sdk_version", d7Var.g());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(d7 d7Var, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) this.f4759a.invoke();
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject2.put("device_battery_level", d7Var.i());
            jSONObject2.put("device_charging_status", d7Var.j());
            jSONObject2.put("device_language", d7Var.n());
            jSONObject2.put("device_timezone", d7Var.w());
            jSONObject2.put("device_volume", d7Var.y());
            jSONObject2.put("device_mute", d7Var.r());
            jSONObject2.put("device_audio_output", d7Var.h());
            jSONObject2.put("device_storage", d7Var.v());
            jSONObject2.put("device_low_memory_warning", d7Var.o());
            jSONObject2.put("device_up_time", d7Var.x());
            jSONObject2.put("chartboost_sdk_autocache_enabled", d7Var.b());
            jSONObject2.put("chartboost_sdk_gdpr", d7Var.e());
            jSONObject2.put("chartboost_sdk_ccpa", d7Var.c());
            jSONObject2.put("chartboost_sdk_coppa", d7Var.d());
            jSONObject2.put("chartboost_sdk_lgpd", d7Var.f());
            jSONObject2.put("session_duration", d7Var.A());
            JSONObject put = jSONObject2.put("session_impression_count", b(d7Var, str));
            if (put == null) {
                put = jSONObject2;
            }
            jSONObject = Result.m8079constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject) == null) {
            jSONObject2 = jSONObject;
        }
        return jSONObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject c(JSONObject jSONObject, com.chartboost.sdk.tracking.f fVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            Result.Companion companion = Result.INSTANCE;
            Mediation d = fVar.d();
            if (d != null) {
                jSONObject.put("mediation_sdk", d.mediationType);
                jSONObject.put("mediation_sdk_version", d.libraryVersion);
                jSONObject3 = jSONObject.put("mediation_sdk_adapter_version", d.adapterVersion);
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                jSONObject3 = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(jSONObject3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject b(JSONObject jSONObject, com.chartboost.sdk.tracking.f fVar) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, fVar.f().getValue());
            jSONObject.put("event_message", fVar.e());
            jSONObject.put("event_type", fVar.l().name());
            jSONObject.put("event_timestamp", fVar.j());
            JSONObject put = jSONObject.put("event_latency", fVar.b());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(JSONObject jSONObject, com.chartboost.sdk.tracking.f fVar) {
        JSONObject jSONObject2;
        String str;
        String str2;
        String str3;
        JSONObject jSONObject3;
        TrackAd.AdSize c;
        try {
            Result.Companion companion = Result.INSTANCE;
            String lowerCase = fVar.a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.put("ad_type", lowerCase);
            TrackAd k = fVar.k();
            if (k == null || (str = k.b()) == null) {
                str = "missing impression id";
            }
            jSONObject.put("ad_impression_id", str);
            TrackAd k2 = fVar.k();
            if (k2 == null || (str2 = k2.a()) == null) {
                str2 = "missing creative id";
            }
            jSONObject.put("ad_creative_id", str2);
            jSONObject.put("ad_location_id", fVar.c());
            TrackAd k3 = fVar.k();
            if (k3 == null || (str3 = k3.g()) == null) {
                str3 = "";
            }
            jSONObject.put("template_url", str3);
            TrackAd k4 = fVar.k();
            if (k4 == null || (c = k4.c()) == null) {
                jSONObject3 = null;
            } else {
                jSONObject.put("ad_height", c.getHeight());
                jSONObject3 = jSONObject.put("ad_width", c.getWidth());
            }
            if (jSONObject3 == null) {
                jSONObject3 = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(jSONObject3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(JSONObject jSONObject, d7 d7Var) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("device_id", d7Var.m());
            jSONObject.put("device_make", d7Var.p());
            jSONObject.put("device_model", d7Var.q());
            jSONObject.put("device_os_version", d7Var.t());
            jSONObject.put("device_platform", d7Var.u());
            jSONObject.put("device_country", d7Var.l());
            jSONObject.put("device_connection_type", d7Var.k());
            JSONObject put = jSONObject.put("device_orientation", d7Var.s());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(JSONObject jSONObject, d7 d7Var, String str) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject put = jSONObject.put("payload", a(d7Var, str));
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8079constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(jSONObject2);
        if (m8082exceptionOrNullimpl != null) {
            mb.b("Cannot generate tracking body data: ", m8082exceptionOrNullimpl);
        }
        if (Result.m8082exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }
}
