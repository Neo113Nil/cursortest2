package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class qf {
    public static final a r = new a(null);
    public static final b s = b.e;

    /* renamed from: a, reason: collision with root package name */
    public final String f4984a;
    public final String b;
    public final Map c;
    public final long d;
    public final k5 e;
    public final List f;
    public final cj g;
    public final s8 h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final b m;
    public final Integer n;
    public final Integer o;
    public final String p;
    public final String q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qf a(JSONObject jsonObject) {
            Iterator<String> keys;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject jSONObject = jsonObject.getJSONObject("config");
            List a2 = k7.a(jSONObject.optJSONArray("event_trackers"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject optJSONObject = jsonObject.optJSONObject("ext");
            if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, optJSONObject.get(next));
                }
            }
            String string = jsonObject.getString("adm");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("markup_type");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            long optLong = jSONObject.optLong("auto_advance_time", -1L);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("countdown");
            k5 a3 = optJSONObject2 != null ? k5.c.a(optJSONObject2) : null;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("vast");
            cj a4 = optJSONObject3 != null ? cj.j.a(optJSONObject3) : null;
            JSONObject optJSONObject4 = jSONObject.optJSONObject("html");
            s8 a5 = optJSONObject4 != null ? s8.g.a(optJSONObject4) : null;
            int optInt = jSONObject.optInt("ignore_safe_area", 0);
            boolean optBoolean = jSONObject.optBoolean("dedupe_clicks", true);
            boolean optBoolean2 = jSONObject.optBoolean("reset_user_click_detector_after_click", false);
            boolean optBoolean3 = jSONObject.optBoolean("optional", false);
            b a6 = jSONObject.has("fit_type") ? b.c.a(jSONObject.getString("fit_type")) : qf.s;
            Integer valueOf = (!jSONObject.has("height") || jSONObject.isNull("height")) ? null : Integer.valueOf(jSONObject.getInt("height"));
            Integer valueOf2 = (!jSONObject.has("width") || jSONObject.isNull("width")) ? null : Integer.valueOf(jSONObject.getInt("width"));
            String optString = jSONObject.optString("deeplink_url");
            Intrinsics.checkNotNull(optString);
            String str = optString.length() > 0 ? optString : null;
            String optString2 = jSONObject.optString("deeplink_fallback_url");
            Intrinsics.checkNotNull(optString2);
            if (optString2.length() <= 0) {
                optString2 = null;
            }
            boolean z = false;
            qf qfVar = new qf(string, string2, linkedHashMap, optLong, a3, a2, a4, a5, optInt, optBoolean, optBoolean2, optBoolean3, a6, valueOf, valueOf2, str, optString2);
            boolean z2 = qfVar.g() == null;
            if (qfVar.f() == null) {
                z = true;
            }
            if (z2 != z) {
                mb.e("Deeplink config is incomplete: only one of deeplink_url / deeplink_fallback_url was provided.", null, 2, null);
            }
            return qfVar;
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final a c;
        public static final b d = new b("ASPECT", 0, "aspect");
        public static final b e = new b("FILL", 1, "fill");
        public static final b f = new b("FIXED", 2, "fixed");
        public static final /* synthetic */ b[] g;
        public static final /* synthetic */ EnumEntries h;
        public final String b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                Object obj;
                Iterator<E> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((b) obj).c(), str)) {
                        break;
                    }
                }
                b bVar = (b) obj;
                return bVar == null ? b.e : bVar;
            }

            public a() {
            }
        }

        static {
            b[] a2 = a();
            g = a2;
            h = EnumEntriesKt.enumEntries(a2);
            c = new a(null);
        }

        public b(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{d, e, f};
        }

        public static EnumEntries b() {
            return h;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }

        public final String c() {
            return this.b;
        }
    }

    public qf(String adm, String markupType, Map ext, long j, k5 k5Var, List eventTrackers, cj cjVar, s8 s8Var, int i, boolean z, boolean z2, boolean z3, b fitType, Integer num, Integer num2, String str, String str2) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(ext, "ext");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        Intrinsics.checkNotNullParameter(fitType, "fitType");
        this.f4984a = adm;
        this.b = markupType;
        this.c = ext;
        this.d = j;
        this.e = k5Var;
        this.f = eventTrackers;
        this.g = cjVar;
        this.h = s8Var;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = fitType;
        this.n = num;
        this.o = num2;
        this.p = str;
        this.q = str2;
    }

    public final String b() {
        return this.f4984a;
    }

    public final long c() {
        return this.d;
    }

    public final k5 d() {
        return this.e;
    }

    public final boolean e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return Intrinsics.areEqual(this.f4984a, qfVar.f4984a) && Intrinsics.areEqual(this.b, qfVar.b) && Intrinsics.areEqual(this.c, qfVar.c) && this.d == qfVar.d && Intrinsics.areEqual(this.e, qfVar.e) && Intrinsics.areEqual(this.f, qfVar.f) && Intrinsics.areEqual(this.g, qfVar.g) && Intrinsics.areEqual(this.h, qfVar.h) && this.i == qfVar.i && this.j == qfVar.j && this.k == qfVar.k && this.l == qfVar.l && this.m == qfVar.m && Intrinsics.areEqual(this.n, qfVar.n) && Intrinsics.areEqual(this.o, qfVar.o) && Intrinsics.areEqual(this.p, qfVar.p) && Intrinsics.areEqual(this.q, qfVar.q);
    }

    public final String f() {
        return this.q;
    }

    public final String g() {
        return this.p;
    }

    public final List h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f4984a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Long.hashCode(this.d)) * 31;
        k5 k5Var = this.e;
        int hashCode2 = (((hashCode + (k5Var == null ? 0 : k5Var.hashCode())) * 31) + this.f.hashCode()) * 31;
        cj cjVar = this.g;
        int hashCode3 = (hashCode2 + (cjVar == null ? 0 : cjVar.hashCode())) * 31;
        s8 s8Var = this.h;
        int hashCode4 = (((((((((((hashCode3 + (s8Var == null ? 0 : s8Var.hashCode())) * 31) + Integer.hashCode(this.i)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.k)) * 31) + Boolean.hashCode(this.l)) * 31) + this.m.hashCode()) * 31;
        Integer num = this.n;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.p;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.q;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Map i() {
        return this.c;
    }

    public final b j() {
        return this.m;
    }

    public final Integer k() {
        return this.n;
    }

    public final s8 l() {
        return this.h;
    }

    public final int m() {
        return this.i;
    }

    public final String n() {
        return this.b;
    }

    public final boolean o() {
        return this.l;
    }

    public final boolean p() {
        return this.k;
    }

    public final cj q() {
        return this.g;
    }

    public final Integer r() {
        return this.o;
    }

    public String toString() {
        return "RenderableConfig(adm=" + this.f4984a + ", markupType=" + this.b + ", ext=" + this.c + ", autoAdvanceTime=" + this.d + ", countdown=" + this.e + ", eventTrackers=" + this.f + ", vast=" + this.g + ", html=" + this.h + ", ignoreSafeAreaFlags=" + this.i + ", dedupeClicks=" + this.j + ", resetUserClickDetectorAfterClick=" + this.k + ", optional=" + this.l + ", fitType=" + this.m + ", height=" + this.n + ", width=" + this.o + ", deeplinkUrl=" + this.p + ", deeplinkFallbackUrl=" + this.q + ")";
    }

    public /* synthetic */ qf(String str, String str2, Map map, long j, k5 k5Var, List list, cj cjVar, s8 s8Var, int i, boolean z, boolean z2, boolean z3, b bVar, Integer num, Integer num2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? null : k5Var, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : cjVar, (i2 & 128) != 0 ? null : s8Var, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? b.e : bVar, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : num2, (32768 & i2) != 0 ? null : str3, (i2 & 65536) != 0 ? null : str4);
    }
}
