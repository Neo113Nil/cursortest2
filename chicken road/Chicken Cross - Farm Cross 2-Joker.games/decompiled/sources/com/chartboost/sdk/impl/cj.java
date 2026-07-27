package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cj {
    public static final a j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4715a;
    public final k5 b;
    public final boolean c;
    public final p5 d;
    public final int e;
    public final boolean f;
    public final zb g;
    public final int h;
    public final int i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cj a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject optJSONObject = jsonObject.optJSONObject("endcard_countdown");
            return new cj(jsonObject.optBoolean("video_clickthrough_enabled", true), optJSONObject != null ? k5.c.a(optJSONObject) : null, jsonObject.optBoolean("show_endcard", true), p5.e.a(jsonObject.optJSONObject("cta")), jsonObject.optInt("endcard_ignore_safe_area", 0), jsonObject.optBoolean("endcard_optional", true), zb.c.a(jsonObject.optInt("media_selection_mode", 0)), jsonObject.optInt("media_selection_probe_timeout", 30), jsonObject.optInt("progressive_download_duration", -1));
        }

        public a() {
        }
    }

    public cj(boolean z, k5 k5Var, boolean z2, p5 p5Var, int i, boolean z3, zb mediaSelectionMode, int i2, int i3) {
        Intrinsics.checkNotNullParameter(mediaSelectionMode, "mediaSelectionMode");
        this.f4715a = z;
        this.b = k5Var;
        this.c = z2;
        this.d = p5Var;
        this.e = i;
        this.f = z3;
        this.g = mediaSelectionMode;
        this.h = i2;
        this.i = i3;
    }

    public final p5 a() {
        return this.d;
    }

    public final k5 b() {
        return this.b;
    }

    public final int c() {
        return this.e;
    }

    public final boolean d() {
        return this.f;
    }

    public final zb e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return this.f4715a == cjVar.f4715a && Intrinsics.areEqual(this.b, cjVar.b) && this.c == cjVar.c && Intrinsics.areEqual(this.d, cjVar.d) && this.e == cjVar.e && this.f == cjVar.f && this.g == cjVar.g && this.h == cjVar.h && this.i == cjVar.i;
    }

    public final int f() {
        return this.h;
    }

    public final int g() {
        return this.i;
    }

    public final boolean h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f4715a) * 31;
        k5 k5Var = this.b;
        int hashCode2 = (((hashCode + (k5Var == null ? 0 : k5Var.hashCode())) * 31) + Boolean.hashCode(this.c)) * 31;
        p5 p5Var = this.d;
        return ((((((((((hashCode2 + (p5Var != null ? p5Var.hashCode() : 0)) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.i);
    }

    public final boolean i() {
        return this.f4715a;
    }

    public final boolean j() {
        return this.i >= 0;
    }

    public String toString() {
        return "VASTConfig(videoClickthroughEnabled=" + this.f4715a + ", endCardCountdown=" + this.b + ", showEndCard=" + this.c + ", callToAction=" + this.d + ", endCardIgnoreSafeAreaFlags=" + this.e + ", endcardOptional=" + this.f + ", mediaSelectionMode=" + this.g + ", mediaSelectionProbeTimeoutSeconds=" + this.h + ", progressiveDownloadDurationSeconds=" + this.i + ")";
    }
}
