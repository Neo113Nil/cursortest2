package com.ironsource;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4665u {
    public static final c d = new c(null);
    public static final String e = "capping";
    public static final String f = "pacing";
    public static final String g = "delivery";
    public static final String h = "progressiveLoadingConfig";
    public static final String i = "expiredDurationInMinutes";
    public static final String j = "reward";
    public static final String k = "name";
    public static final String l = "amount";
    public static final String m = "virtualItemName";
    public static final String n = "virtualItemCount";
    public static final long o = 60;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, d> f8681a;
    private final d b;
    private final Map<String, d> c;

    /* renamed from: com.ironsource.u$a */
    static final class a extends Lambda implements Function1<JSONObject, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8682a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.u$b */
    static final class b extends Lambda implements Function1<JSONObject, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8683a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: com.ironsource.u$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final C4759z3 f8684a;
        private final C4296ad b;
        private final J4 c;
        private final Long d;
        private final Pd e;
        private final Pd f;
        private final C4769zd g;

        public d(JSONObject features) {
            C4759z3 c4759z3;
            C4296ad c4296ad;
            Intrinsics.checkNotNullParameter(features, "features");
            C4769zd c4769zd = null;
            if (features.has(C4665u.e)) {
                JSONObject jSONObject = features.getJSONObject(C4665u.e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c4759z3 = new C4759z3(jSONObject);
            } else {
                c4759z3 = null;
            }
            this.f8684a = c4759z3;
            if (features.has(C4665u.f)) {
                JSONObject jSONObject2 = features.getJSONObject(C4665u.f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c4296ad = new C4296ad(jSONObject2);
            } else {
                c4296ad = null;
            }
            this.b = c4296ad;
            this.c = features.has(C4665u.g) ? new J4(features.getBoolean(C4665u.g)) : null;
            this.d = features.has(C4665u.i) ? Long.valueOf(features.getLong(C4665u.i)) : null;
            JSONObject optJSONObject = features.optJSONObject(C4665u.j);
            this.e = optJSONObject != null ? new Pd(optJSONObject, "name", "amount") : null;
            Pd pd = new Pd(features, C4665u.m, C4665u.n);
            String b = pd.b();
            this.f = (b == null || b.length() == 0 || pd.a() == null) ? null : pd;
            if (features.has(C4665u.h)) {
                JSONObject jSONObject3 = features.getJSONObject(C4665u.h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                c4769zd = new C4769zd(jSONObject3);
            }
            this.g = c4769zd;
        }

        public final Pd a() {
            return this.e;
        }

        public final C4759z3 b() {
            return this.f8684a;
        }

        public final J4 c() {
            return this.c;
        }

        public final Long d() {
            return this.d;
        }

        public final C4296ad e() {
            return this.b;
        }

        public final Pd f() {
            return this.f;
        }

        public final C4769zd g() {
            return this.g;
        }
    }

    public C4665u(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f8681a = new C4572od(configurations).a(b.f8683a);
        this.b = new d(configurations);
        this.c = new Y0(configurations).a(a.f8682a);
    }

    public final Map<String, d> a() {
        return this.c;
    }

    public final d b() {
        return this.b;
    }

    public final Map<String, d> c() {
        return this.f8681a;
    }
}
