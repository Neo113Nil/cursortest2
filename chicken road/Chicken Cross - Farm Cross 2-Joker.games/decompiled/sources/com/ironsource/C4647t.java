package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4647t {

    /* renamed from: a, reason: collision with root package name */
    private final String f8668a;
    private final EnumC4586p9 b;
    private final boolean c;
    private final String d;
    private final long e;

    public C4647t(String adSourceNameForEvents, EnumC4586p9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f8668a = adSourceNameForEvents;
        this.b = instanceType;
        this.c = z;
        this.d = providerName;
        this.e = j;
    }

    public final String a() {
        return this.f8668a;
    }

    public final EnumC4586p9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4647t)) {
            return false;
        }
        C4647t c4647t = (C4647t) obj;
        return Intrinsics.areEqual(this.f8668a, c4647t.f8668a) && this.b == c4647t.b && this.c == c4647t.c && Intrinsics.areEqual(this.d, c4647t.d) && this.e == c4647t.e;
    }

    public final String f() {
        return this.f8668a;
    }

    public final EnumC4586p9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f8668a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e);
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    public String toString() {
        return "AdFormatConfig(adSourceNameForEvents=" + this.f8668a + ", instanceType=" + this.b + ", isOneFlow=" + this.c + ", providerName=" + this.d + ", loadTimeoutInMillis=" + this.e + ")";
    }

    public final C4647t a(String adSourceNameForEvents, EnumC4586p9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return new C4647t(adSourceNameForEvents, instanceType, z, providerName, j);
    }

    public static /* synthetic */ C4647t a(C4647t c4647t, String str, EnumC4586p9 enumC4586p9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4647t.f8668a;
        }
        if ((i & 2) != 0) {
            enumC4586p9 = c4647t.b;
        }
        EnumC4586p9 enumC4586p92 = enumC4586p9;
        if ((i & 4) != 0) {
            z = c4647t.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = c4647t.d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            j = c4647t.e;
        }
        return c4647t.a(str, enumC4586p92, z2, str3, j);
    }
}
