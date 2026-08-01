package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class R2 {

    /* renamed from: a, reason: collision with root package name */
    private final b f7866a;
    private final Map<String, b> b;

    static final class a extends Lambda implements Function1<JSONObject, b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7867a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f7868a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;
        private final List<String> f;

        public b(JSONObject features) {
            Intrinsics.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has(T2.f7902a) ? features : null;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(T2.f7902a) : null;
            this.f7868a = optJSONObject;
            int optInt = optJSONObject != null ? optJSONObject.optInt(T2.b, 25000) : 25000;
            this.b = optInt;
            this.c = optJSONObject != null ? optJSONObject.optBoolean("enabled", true) : true;
            this.d = (optJSONObject == null || !optJSONObject.has(T2.d) || optJSONObject.isNull(T2.d)) ? optInt : optJSONObject.optLong(T2.d);
            this.e = features.has(T2.e) ? features.optInt(T2.e) / 100.0f : 0.15f;
            List<String> b = features.has(T2.f) ? C4444ha.b(features.getJSONArray(T2.f)) : CollectionsKt.listOf((Object[]) new String[]{com.ironsource.mediationsdk.j.f8411a, com.ironsource.mediationsdk.j.d});
            Intrinsics.checkNotNullExpressionValue(b, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f = b;
        }

        public final List<String> a() {
            return this.f;
        }

        public final float b() {
            return this.e;
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }
    }

    public R2(JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f7866a = new b(bannerConfigurations);
        this.b = new Y0(bannerConfigurations).a(a.f7867a);
    }

    public final Map<String, b> a() {
        return this.b;
    }

    public final b b() {
        return this.f7866a;
    }
}
