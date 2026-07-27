package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public final String f4691a;
    public final Boolean b;
    public final String c;

    public bb(String str, Boolean bool, String str2) {
        this.f4691a = str;
        this.b = bool;
        this.c = str2;
    }

    public final String a() {
        return this.f4691a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return Intrinsics.areEqual(this.f4691a, bbVar.f4691a) && Intrinsics.areEqual(this.b, bbVar.b) && Intrinsics.areEqual(this.c, bbVar.c);
    }

    public int hashCode() {
        String str = this.f4691a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "JavaScriptResource(apiFramework=" + this.f4691a + ", browserOptional=" + this.b + ", uri=" + this.c + ")";
    }
}
