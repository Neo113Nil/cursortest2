package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4726a;
    public final String b;
    public final List c;

    public d8(String str, String str2, List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f4726a = str;
        this.b = str2;
        this.c = children;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return Intrinsics.areEqual(this.f4726a, d8Var.f4726a) && Intrinsics.areEqual(this.b, d8Var.b) && Intrinsics.areEqual(this.c, d8Var.c);
    }

    public int hashCode() {
        String str = this.f4726a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Extension(type=" + this.f4726a + ", content=" + this.b + ", children=" + this.c + ")";
    }
}
