package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class we {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5059a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final JSONObject e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public we(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        this.f5059a = num;
        this.b = list;
        this.c = num2;
        this.d = num3;
        this.e = jSONObject;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.h;
    }

    public final Integer c() {
        return this.f5059a;
    }

    public final Integer d() {
        return this.d;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return Intrinsics.areEqual(this.f5059a, weVar.f5059a) && Intrinsics.areEqual(this.b, weVar.b) && Intrinsics.areEqual(this.c, weVar.c) && Intrinsics.areEqual(this.d, weVar.d) && Intrinsics.areEqual(this.e, weVar.e) && Intrinsics.areEqual(this.f, weVar.f) && Intrinsics.areEqual(this.g, weVar.g) && Intrinsics.areEqual(this.h, weVar.h) && Intrinsics.areEqual(this.i, weVar.i);
    }

    public final String f() {
        return this.f;
    }

    public final JSONObject g() {
        return this.e;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.f5059a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        JSONObject jSONObject = this.e;
        int hashCode5 = (hashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final List i() {
        return this.b;
    }

    public String toString() {
        return "PrivacyBodyFields(openRtbConsent=" + this.f5059a + ", whitelistedPrivacyStandardsList=" + this.b + ", openRtbGdpr=" + this.c + ", openRtbCoppa=" + this.d + ", privacyListAsJson=" + this.e + ", piDataUseConsent=" + this.f + ", tcfString=" + this.g + ", gppString=" + this.h + ", gppSid=" + this.i + ")";
    }
}
