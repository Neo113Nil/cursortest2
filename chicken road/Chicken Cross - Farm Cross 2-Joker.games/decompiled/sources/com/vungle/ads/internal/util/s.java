package com.vungle.ads.internal.util;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public String f12189a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public com.vungle.ads.internal.h i;
    public Boolean j;
    public String k;
    public Long l;
    public String m;

    public final void a(com.vungle.ads.internal.h hVar) {
        this.i = hVar;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.c = str;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(s.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f12189a, sVar.f12189a) && Intrinsics.areEqual(this.b, sVar.b) && Intrinsics.areEqual(this.c, sVar.c) && Intrinsics.areEqual(this.d, sVar.d) && Intrinsics.areEqual(this.e, sVar.e) && Intrinsics.areEqual(this.f, sVar.f) && Intrinsics.areEqual(this.g, sVar.g) && Intrinsics.areEqual(this.h, sVar.h) && this.i == sVar.i && Intrinsics.areEqual(this.j, sVar.j) && Intrinsics.areEqual(this.k, sVar.k) && Intrinsics.areEqual(this.l, sVar.l) && Intrinsics.areEqual(this.m, sVar.m);
    }

    public final void f(String str) {
        this.e = str;
    }

    public final void g(String str) {
        this.f12189a = str;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = (a(this.f) + ((a(this.e) + ((a(this.d) + ((a(this.c) + ((a(this.b) + (a(this.f12189a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.g;
        int hashCode = (a2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.h;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        com.vungle.ads.internal.h hVar = this.i;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Boolean bool3 = this.j;
        int a3 = (a(this.k) + ((hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31)) * 31;
        Long l = this.l;
        return a(this.m) + ((a3 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.k;
    }

    public final String j() {
        return this.e;
    }

    public final Boolean k() {
        return this.g;
    }

    public final String l() {
        return this.f12189a;
    }

    public final String m() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEntry(placementRefId=");
        sb.append(this.f12189a).append(", creativeId=").append(this.b).append(", eventId=").append(this.c).append(", adSource=").append(this.d).append(", mediationName=").append(this.e).append(", vmVersion=").append(this.f).append(", partialDownloadEnabled=").append(this.g).append(", adoEnabled=").append(this.h).append(", adState=").append(this.i).append(" adPoddingEnabled=").append(this.j).append(", experiments=").append(this.k).append(", adLoadType=");
        sb.append(this.l).append(", adapterAdFormat=").append(this.m).append(')');
        return sb.toString();
    }

    public final void a(Boolean bool) {
        this.j = bool;
    }

    public final void b(Boolean bool) {
        this.h = bool;
    }

    public final String c() {
        return this.d;
    }

    public final com.vungle.ads.internal.h d() {
        return this.i;
    }

    public final String e() {
        return this.m;
    }

    public final Boolean f() {
        return this.h;
    }

    public final String g() {
        return this.b;
    }

    public final void h(String str) {
        this.f = str;
    }

    public final Long a() {
        return this.l;
    }

    public final Boolean b() {
        return this.j;
    }

    public final void c(Boolean bool) {
        this.g = bool;
    }

    public final void a(Long l) {
        this.l = l;
    }

    public static int a(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
