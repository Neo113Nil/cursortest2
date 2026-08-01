package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u9 implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f5029a;
    public final c0 b;
    public final a5 c;
    public final r0 d;

    public static final class a implements b5 {
        @Override // com.chartboost.sdk.impl.b5
        public void a(JSONObject jSONObject) {
            mb.b("onCompleteRequestSuccess " + jSONObject, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.b5
        public void a(String str) {
            mb.b("onCompleteRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }
    }

    public u9(d0 adUnit, c0 adType, a5 completeRequest, r0 adUnitRendererImpressionCallback) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        this.f5029a = adUnit;
        this.b = adType;
        this.c = completeRequest;
        this.d = adUnitRendererImpressionCallback;
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a() {
        c0 c0Var = this.b;
        if (c0Var == c0.b.g) {
            mb.b("didCompleteInterstitial delegate used to be sent here", (Throwable) null, 2, (Object) null);
        } else if (c0Var == c0.c.g) {
            this.d.a(this.f5029a.m(), this.f5029a.v());
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.c.a(new a(), new z4(location, this.f5029a.a(), this.f5029a.g(), this.f5029a.v(), this.f5029a.w(), f, f2));
    }
}
