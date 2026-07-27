package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.internal.Model.openrtb26.App;
import com.chartboost.sdk.internal.Model.openrtb26.Banner;
import com.chartboost.sdk.internal.Model.openrtb26.BannerExt;
import com.chartboost.sdk.internal.Model.openrtb26.BidRequest;
import com.chartboost.sdk.internal.Model.openrtb26.CompanionAd;
import com.chartboost.sdk.internal.Model.openrtb26.Device;
import com.chartboost.sdk.internal.Model.openrtb26.DeviceExt;
import com.chartboost.sdk.internal.Model.openrtb26.Imp;
import com.chartboost.sdk.internal.Model.openrtb26.Regs;
import com.chartboost.sdk.internal.Model.openrtb26.User;
import com.chartboost.sdk.internal.Model.openrtb26.UserExt;
import com.chartboost.sdk.internal.Model.openrtb26.Video;
import com.chartboost.sdk.internal.Model.openrtb26.VideoExt;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.ironsource.U3;
import com.ironsource.Y1;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes4.dex */
public final class he {
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final cg f4794a;
    public final b0 b;
    public final ae c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public he(cg requestBodyFields, b0 b0Var, ae aeVar) {
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        this.f4794a = requestBodyFields;
        this.b = b0Var;
        this.c = aeVar;
    }

    public final BidRequest a() {
        return new BidRequest(e(), b(), d(), g(), 0, f());
    }

    public final App b() {
        cg cgVar = this.f4794a;
        return new App(cgVar.h, cgVar.f);
    }

    public final Banner c() {
        c0 a2;
        b0 b0Var = this.b;
        if (b0Var == null || (a2 = b0Var.a()) == null || !Intrinsics.areEqual(a2, c0.a.g)) {
            return null;
        }
        Integer e = this.b.e();
        Integer b = this.b.b();
        String b2 = a2.b();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = b2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Banner(e, b, new BannerExt(lowerCase));
    }

    public final Device d() {
        i9 c = this.f4794a.c();
        Integer valueOf = Integer.valueOf(c.f().b());
        String a2 = aj.b.a();
        Integer e = this.f4794a.e();
        cg cgVar = this.f4794a;
        String str = cgVar.k;
        String str2 = cgVar.f4714a;
        String str3 = Build.VERSION.RELEASE;
        Integer valueOf2 = Integer.valueOf(cgVar.b().a());
        Integer valueOf3 = Integer.valueOf(this.f4794a.b().c());
        cg cgVar2 = this.f4794a;
        String str4 = cgVar2.d;
        String str5 = cgVar2.n;
        Integer valueOf4 = Integer.valueOf(cgVar2.g().d().c());
        String a3 = c.a();
        Intrinsics.checkNotNull(c);
        return new Device(valueOf, a2, e, str, str2, U3.d, str3, valueOf2, valueOf3, (Float) null, str4, str5, valueOf4, a3, a(c), 512, (DefaultConstructorMarker) null);
    }

    public final List e() {
        c0 a2;
        b0 b0Var = this.b;
        if (b0Var == null || (a2 = b0Var.a()) == null) {
            return CollectionsKt.emptyList();
        }
        return CollectionsKt.listOf(new Imp(Intrinsics.areEqual(a2, c0.a.g) ? c() : null, (Intrinsics.areEqual(a2, c0.b.g) || Intrinsics.areEqual(a2, c0.c.g)) ? h() : null, "Chartboost-Android-SDK", this.f4794a.g, Integer.valueOf(a2.e() ? 1 : 0), this.b.d(), 1));
    }

    public final Regs f() {
        we weVar = this.f4794a.r;
        Integer d2 = weVar.d();
        Integer e = weVar.e();
        String f = weVar.f();
        if (f == null || StringsKt.isBlank(f) || Intrinsics.areEqual(f, Y1.f)) {
            f = null;
        }
        String str = f;
        String b = weVar.b();
        List a2 = a(weVar.a());
        Intrinsics.checkNotNull(weVar);
        return new Regs(d2, e, str, b, a2, a(weVar));
    }

    public final User g() {
        we weVar = this.f4794a.r;
        String h = weVar.h();
        Integer c = weVar.c();
        Integer valueOf = Integer.valueOf(c != null ? c.intValue() : 0);
        b0 b0Var = this.b;
        return new User(h, new UserExt(valueOf, Integer.valueOf(b0Var != null ? b0Var.c() : 0), Long.valueOf(this.f4794a.h().b())));
    }

    public final Video h() {
        c0 a2;
        b0 b0Var = this.b;
        if (b0Var == null || (a2 = b0Var.a()) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(a2, c0.b.g) && !Intrinsics.areEqual(a2, c0.c.g)) {
            return null;
        }
        int c = this.f4794a.b().c();
        int a3 = this.f4794a.b().a();
        Integer valueOf = Integer.valueOf(c);
        Integer valueOf2 = Integer.valueOf(a3);
        List a4 = a(c, a3);
        String b = a2.b();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = b.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Video(valueOf, valueOf2, 5, a4, new VideoExt(lowerCase));
    }

    public final List a(int i, int i2) {
        return CollectionsKt.listOf(new CompanionAd(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final DeviceExt a(i9 i9Var) {
        return new DeviceExt(i9Var.d(), i9Var.e());
    }

    public final List a(String str) {
        if (str != null && !StringsKt.isBlank(str)) {
            List list = SequencesKt.toList(SequencesKt.mapNotNull(Regex.findAll$default(new Regex("(?<!\\d)-?\\d+"), str, 0, 2, null), new Function1() { // from class: com.chartboost.sdk.impl.he$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return he.a((MatchResult) obj);
                }
            }));
            if (!list.isEmpty()) {
                return list;
            }
        }
        return null;
    }

    public static final Integer a(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.toIntOrNull(it.getValue());
    }

    public final JsonObject a(we weVar) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        List<DataUseConsent> i = weVar.i();
        if (i != null) {
            for (DataUseConsent dataUseConsent : i) {
                if (!Intrinsics.areEqual(dataUseConsent.getPrivacyStandardName(), COPPA.COPPA_STANDARD)) {
                    JsonElementBuildersKt.put(jsonObjectBuilder, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent().toString());
                }
            }
        }
        return jsonObjectBuilder.build();
    }
}
