package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4749a;
    public final Map b;
    public final String c;

    public e8(String name, Map attributes, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f4749a = name;
        this.b = attributes;
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return Intrinsics.areEqual(this.f4749a, e8Var.f4749a) && Intrinsics.areEqual(this.b, e8Var.b) && Intrinsics.areEqual(this.c, e8Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.f4749a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExtensionChild(name=" + this.f4749a + ", attributes=" + this.b + ", content=" + this.c + ")";
    }
}
