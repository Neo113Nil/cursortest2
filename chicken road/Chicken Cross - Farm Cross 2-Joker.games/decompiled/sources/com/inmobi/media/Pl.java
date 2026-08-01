package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.CCPA;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Pl {
    public static final Map a(Fa mConfigIncludeIdMaskMap) {
        C4229y1 c4229y1;
        String str;
        Intrinsics.checkNotNullParameter(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        HashMap hashMap = new HashMap();
        try {
            if (mConfigIncludeIdMaskMap.a() && (c4229y1 = Mm.f6724a) != null && (str = c4229y1.b) != null) {
                Intrinsics.checkNotNull(str);
                hashMap.put("GPID", str);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Nm", "getSimpleName(...)");
        }
        return hashMap;
    }

    public static final JSONObject c() {
        return AbstractC4263z7.b();
    }

    public static final Map d() {
        return Y5.f6965a.a(AbstractC3914mk.g);
    }

    public static final String e() {
        return AbstractC3914mk.c;
    }

    public static final String f() {
        Y5.f6965a.getClass();
        return Y5.i;
    }

    public static final String g() {
        return AbstractC3942nk.a();
    }

    public static final Map h() {
        AppSetIdInfo appSetIdInfo = V1.f6903a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        V1.a(linkedHashMap);
        return linkedHashMap;
    }

    public static JSONObject i() {
        final Fa fa = (Fa) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.j();
            }
        });
        if (fa == null) {
            fa = new Fa(false, 1, null);
        }
        return new JSONObject(a(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.a(Fa.this);
            }
        }));
    }

    public static final Fa j() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        return ((RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class)).getIncludeIds();
    }

    public static final JSONObject k() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getExt();
    }

    public static final String b() {
        SharedPreferences a2;
        return (AbstractC3914mk.f7252a == null || (a2 = Dk.a()) == null || !a2.contains("IABGPP_HDR_GppString")) ? "" : String.valueOf(a2.getString("IABGPP_HDR_GppString", ""));
    }

    public static Object b(Function0 function0) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            return null;
        }
        return m8079constructorimpl;
    }

    public static JSONObject a(String str) {
        Map a2 = a(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.d();
            }
        });
        JSONObject put = new JSONObject().put("compliance", a()).put("u-id-map", i()).put("u-appbid", str);
        String str2 = (String) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.e();
            }
        });
        if (str2 == null) {
            str2 = "";
        }
        JSONObject put2 = put.put("im-accid", str2);
        String str3 = (String) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.f();
            }
        });
        if (str3 == null) {
            str3 = "";
        }
        JSONObject put3 = put2.put("os-version", str3);
        String str4 = (String) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.g();
            }
        });
        if (str4 == null) {
            str4 = "";
        }
        JSONObject putOpt = put3.put("mk-version", str4).putOpt("d-devicemachinehw", a2.get("d-devicemachinehw")).putOpt("d-t1", a2.get("d-t1"));
        String str5 = (String) a(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.h();
            }
        }).get("d-app-set-id");
        JSONObject put4 = putOpt.put("app_set_id", str5 != null ? str5 : "");
        Intrinsics.checkNotNullExpressionValue(put4, "put(...)");
        return put4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject a() {
        boolean z;
        JSONObject jSONObject = (JSONObject) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.c();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.putAll(AbstractC4232y4.f7492a);
        JSONObject jSONObject2 = new JSONObject();
        int i = 0;
        if (jSONObject != null && jSONObject.has("gdpr")) {
            Object opt = jSONObject.opt("gdpr");
            if ((opt instanceof String) && ((CharSequence) opt).length() == 0) {
                opt = null;
            }
            if (opt != null) {
                if (opt instanceof Boolean) {
                    z = ((Boolean) opt).booleanValue();
                } else {
                    z = !(opt instanceof Number) ? !((opt instanceof String) && (StringsKt.equals((String) opt, "true", true) || Intrinsics.areEqual(opt, "1"))) : ((Number) opt).intValue() == 0;
                }
                jSONObject2.put("gdpr_applies", z);
            }
        }
        if (jSONObject != null && jSONObject.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            String optString = jSONObject.optString(InMobiSdk.IM_GDPR_CONSENT_IAB, "");
            Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                optString = null;
            }
            if (optString != null) {
                jSONObject2.put("consent_string", optString);
            }
        }
        String str = (String) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.b();
            }
        });
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            if (str != null) {
                jSONObject2.put("gpp", str);
            }
        }
        String str2 = (String) hashMap.get(CCPA.CCPA_STANDARD);
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                jSONObject2.put(CCPA.CCPA_STANDARD, str2);
            }
        }
        String str3 = (String) hashMap.get(com.ironsource.mediationsdk.metadata.a.f8424a);
        if (str3 != null) {
            if (str3.length() == 0) {
                str3 = null;
            }
            if (str3 != null) {
                jSONObject2.put(com.ironsource.mediationsdk.metadata.a.f8424a, Intrinsics.areEqual(str3, "1") ? 1 : 0);
            }
        }
        Boolean bool = AbstractC3940ni.b;
        if (bool != null) {
            i = bool.booleanValue();
        } else {
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC3940ni.b = Boolean.valueOf(a2.f6510a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3940ni.b;
            if (bool2 != null) {
                i = bool2.booleanValue();
            }
        }
        jSONObject2.put("age_restricted", i);
        if (jSONObject != null) {
            if (jSONObject.length() <= 0) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2.put("consentObject", jSONObject);
            }
        }
        a(jSONObject2);
        return jSONObject2;
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = (JSONObject) b(new Function0() { // from class: com.inmobi.media.Pl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.k();
            }
        });
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        jSONObject.put("im-ext", jSONObject2);
    }

    public static Map a(Function0 function0) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
            m8079constructorimpl = MapsKt.emptyMap();
        }
        return (Map) m8079constructorimpl;
    }
}
