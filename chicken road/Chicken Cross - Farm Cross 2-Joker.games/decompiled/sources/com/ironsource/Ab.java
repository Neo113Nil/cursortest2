package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ab {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4586p9 f7552a;
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public Ab(EnumC4586p9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f7552a = instanceType;
        this.b = adSourceNameForEvents;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final EnumC4586p9 a() {
        return this.f7552a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab = (Ab) obj;
        return this.f7552a == ab.f7552a && Intrinsics.areEqual(this.b, ab.b) && this.c == ab.c && this.d == ab.d && this.e == ab.e;
    }

    public final String f() {
        return this.b;
    }

    public final EnumC4586p9 g() {
        return this.f7552a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f7552a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f7552a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public final Ab a(EnumC4586p9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new Ab(instanceType, adSourceNameForEvents, j, z, z2);
    }

    public static /* synthetic */ Ab a(Ab ab, EnumC4586p9 enumC4586p9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4586p9 = ab.f7552a;
        }
        if ((i & 2) != 0) {
            str = ab.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j = ab.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = ab.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = ab.e;
        }
        return ab.a(enumC4586p9, str2, j2, z3, z2);
    }

    public /* synthetic */ Ab(EnumC4586p9 enumC4586p9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4586p9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
