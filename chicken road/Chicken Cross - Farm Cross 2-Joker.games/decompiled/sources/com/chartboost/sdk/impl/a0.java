package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.m2;
import com.chartboost.sdk.impl.oa;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a0 {
    public static final a o = new a(null);
    public static final gb p = gb.e;

    /* renamed from: a, reason: collision with root package name */
    public final String f4670a;
    public final oa b;
    public final m2 c;
    public final m2 d;
    public final int e;
    public final Integer f;
    public final int g;
    public final boolean h;
    public final List i;
    public final boolean j;
    public final int k;
    public final gb l;
    public final boolean m;
    public final boolean n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a(JSONObject jsonObject, String auctionId) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            List a2 = k7.a(jsonObject.optJSONArray("event_trackers"));
            oa.a aVar = oa.c;
            JSONObject jSONObject = jsonObject.getJSONObject("info_icon");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            oa a3 = aVar.a(jSONObject);
            m2.a aVar2 = m2.d;
            return new a0(auctionId, a3, aVar2.a(jsonObject.optJSONObject("top_left_button_group")), aVar2.a(jsonObject.optJSONObject("top_right_button_group")), jsonObject.optInt("expiration", 3600), Integer.valueOf(jsonObject.optInt("reward_duration", -1)), jsonObject.optInt("click_browser", 0), jsonObject.optBoolean("resolve_redirections", true), a2, jsonObject.optBoolean("default_muted", false), jsonObject.optInt("load_timeout", 30), gb.c.a(jsonObject.optInt("load_mode", a0.p.c())), jsonObject.optBoolean("allow_early_reward", false), jsonObject.optBoolean("fire_click_url_in_background", true));
        }

        public a() {
        }
    }

    public a0(String auctionId, oa infoIcon, m2 m2Var, m2 m2Var2, int i, Integer num, int i2, boolean z, List eventTrackers, boolean z2, int i3, gb loadMode, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        Intrinsics.checkNotNullParameter(loadMode, "loadMode");
        this.f4670a = auctionId;
        this.b = infoIcon;
        this.c = m2Var;
        this.d = m2Var2;
        this.e = i;
        this.f = num;
        this.g = i2;
        this.h = z;
        this.i = eventTrackers;
        this.j = z2;
        this.k = i3;
        this.l = loadMode;
        this.m = z3;
        this.n = z4;
    }

    public final boolean b() {
        return this.m;
    }

    public final String c() {
        return this.f4670a;
    }

    public final boolean d() {
        return this.j;
    }

    public final List e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f4670a, a0Var.f4670a) && Intrinsics.areEqual(this.b, a0Var.b) && Intrinsics.areEqual(this.c, a0Var.c) && Intrinsics.areEqual(this.d, a0Var.d) && this.e == a0Var.e && Intrinsics.areEqual(this.f, a0Var.f) && this.g == a0Var.g && this.h == a0Var.h && Intrinsics.areEqual(this.i, a0Var.i) && this.j == a0Var.j && this.k == a0Var.k && this.l == a0Var.l && this.m == a0Var.m && this.n == a0Var.n;
    }

    public final int f() {
        return this.e;
    }

    public final boolean g() {
        return this.n;
    }

    public final oa h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.f4670a.hashCode() * 31) + this.b.hashCode()) * 31;
        m2 m2Var = this.c;
        int hashCode2 = (hashCode + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        m2 m2Var2 = this.d;
        int hashCode3 = (((hashCode2 + (m2Var2 == null ? 0 : m2Var2.hashCode())) * 31) + Integer.hashCode(this.e)) * 31;
        Integer num = this.f;
        return ((((((((((((((((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.j)) * 31) + Integer.hashCode(this.k)) * 31) + this.l.hashCode()) * 31) + Boolean.hashCode(this.m)) * 31) + Boolean.hashCode(this.n);
    }

    public final gb i() {
        return this.l;
    }

    public final Integer j() {
        return this.f;
    }

    public final m2 k() {
        return this.c;
    }

    public final m2 l() {
        return this.d;
    }

    public String toString() {
        return "AdMarkupConfig(auctionId=" + this.f4670a + ", infoIcon=" + this.b + ", topLeftButtonGroup=" + this.c + ", topRightButtonGroup=" + this.d + ", expiration=" + this.e + ", rewardDuration=" + this.f + ", clickBrowser=" + this.g + ", resolveRedirections=" + this.h + ", eventTrackers=" + this.i + ", defaultMuted=" + this.j + ", loadTimeoutSeconds=" + this.k + ", loadMode=" + this.l + ", allowEarlyReward=" + this.m + ", fireClickUrlInBackground=" + this.n + ")";
    }
}
