package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xh {

    /* renamed from: a, reason: collision with root package name */
    public final String f5083a;
    public final String b;
    public final String c;
    public final String d;

    public xh(String url, String method, String str, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f5083a = url;
        this.b = method;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.f5083a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        return Intrinsics.areEqual(this.f5083a, xhVar.f5083a) && Intrinsics.areEqual(this.b, xhVar.b) && Intrinsics.areEqual(this.c, xhVar.c) && Intrinsics.areEqual(this.d, xhVar.d);
    }

    public int hashCode() {
        int hashCode = ((this.f5083a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TrackerConfig(url=" + this.f5083a + ", method=" + this.b + ", bodyTemplate=" + this.c + ", contentType=" + this.d + ")";
    }

    public /* synthetic */ xh(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
