package com.ironsource;

import com.ironsource.C4612r0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private C4612r0.a f7708a;

    public J(C4612r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f7708a = performance;
    }

    public final C4612r0.a a() {
        return this.f7708a;
    }

    public final C4612r0.a b() {
        return this.f7708a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f7708a == ((J) obj).f7708a;
    }

    public int hashCode() {
        return this.f7708a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f7708a + ")";
    }

    public final J a(C4612r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new J(performance);
    }

    public final void b(C4612r0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f7708a = aVar;
    }

    public static /* synthetic */ J a(J j, C4612r0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = j.f7708a;
        }
        return j.a(aVar);
    }
}
