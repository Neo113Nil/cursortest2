package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xc {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8012a;
    private final Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public Xc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.f8012a;
    }

    public final Integer b() {
        return this.b;
    }

    public final Boolean c() {
        return this.f8012a;
    }

    public final Integer d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xc)) {
            return false;
        }
        Xc xc = (Xc) obj;
        return Intrinsics.areEqual(this.f8012a, xc.f8012a) && Intrinsics.areEqual(this.b, xc.b);
    }

    public int hashCode() {
        Boolean bool = this.f8012a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PacingConfig2(enabled=" + this.f8012a + ", minTimeBetweenShowsSeconds=" + this.b + ")";
    }

    public Xc(Boolean bool, Integer num) {
        this.f8012a = bool;
        this.b = num;
    }

    public final Xc a(Boolean bool, Integer num) {
        return new Xc(bool, num);
    }

    public /* synthetic */ Xc(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ Xc a(Xc xc, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = xc.f8012a;
        }
        if ((i & 2) != 0) {
            num = xc.b;
        }
        return xc.a(bool, num);
    }
}
