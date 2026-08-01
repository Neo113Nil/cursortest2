package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11964a;
    public final boolean b;
    public final boolean c;

    public d3(String description, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f11964a = description;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Intrinsics.areEqual(this.f11964a, d3Var.f11964a) && this.b == d3Var.b && this.c == d3Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f11964a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("ErrorInfo(description=").append(this.f11964a).append(", errorIsTerminal=").append(this.b).append(", isRetryCode=").append(this.c).append(')').toString();
    }

    public /* synthetic */ d3(String str, boolean z, boolean z2, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
