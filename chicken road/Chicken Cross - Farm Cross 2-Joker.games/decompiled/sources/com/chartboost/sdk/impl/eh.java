package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class eh implements qj {

    /* renamed from: a, reason: collision with root package name */
    public final String f4758a;
    public final String b;

    public eh(String str, String str2) {
        this.f4758a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f4758a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return Intrinsics.areEqual(this.f4758a, ehVar.f4758a) && Intrinsics.areEqual(this.b, ehVar.b);
    }

    public int hashCode() {
        String str = this.f4758a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StaticResource(creativeType=" + this.f4758a + ", url=" + this.b + ")";
    }
}
