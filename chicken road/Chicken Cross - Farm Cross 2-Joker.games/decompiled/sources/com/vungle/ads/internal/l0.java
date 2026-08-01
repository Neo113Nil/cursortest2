package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public m0 f11932a;
    public m0 b;

    public l0(m0 downCoordinate, m0 upCoordinate) {
        Intrinsics.checkNotNullParameter(downCoordinate, "downCoordinate");
        Intrinsics.checkNotNullParameter(upCoordinate, "upCoordinate");
        this.f11932a = downCoordinate;
        this.b = upCoordinate;
    }

    public final m0 a() {
        return this.f11932a;
    }

    public final m0 b() {
        return this.b;
    }

    public final boolean c() {
        m0 m0Var = this.f11932a;
        if (m0Var.f11947a != Integer.MIN_VALUE && m0Var.b != Integer.MIN_VALUE) {
            m0 m0Var2 = this.b;
            if (m0Var2.f11947a != Integer.MIN_VALUE && m0Var2.b != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.f11932a, l0Var.f11932a) && Intrinsics.areEqual(this.b, l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11932a.hashCode() * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("ClickCoordinate(downCoordinate=").append(this.f11932a).append(", upCoordinate=").append(this.b).append(')').toString();
    }

    public final void a(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.f11932a = m0Var;
    }

    public final void b(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.b = m0Var;
    }
}
