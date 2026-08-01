package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4687v3 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8727a;
    private final String b;
    private final Integer c;

    public C4687v3() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.f8727a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Boolean d() {
        return this.f8727a;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4687v3)) {
            return false;
        }
        C4687v3 c4687v3 = (C4687v3) obj;
        return Intrinsics.areEqual(this.f8727a, c4687v3.f8727a) && Intrinsics.areEqual(this.b, c4687v3.b) && Intrinsics.areEqual(this.c, c4687v3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        Boolean bool = this.f8727a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CappingConfig2(enabled=" + this.f8727a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
    }

    public C4687v3(Boolean bool, String str, Integer num) {
        this.f8727a = bool;
        this.b = str;
        this.c = num;
    }

    public final C4687v3 a(Boolean bool, String str, Integer num) {
        return new C4687v3(bool, str, num);
    }

    public static /* synthetic */ C4687v3 a(C4687v3 c4687v3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4687v3.f8727a;
        }
        if ((i & 2) != 0) {
            str = c4687v3.b;
        }
        if ((i & 4) != 0) {
            num = c4687v3.c;
        }
        return c4687v3.a(bool, str, num);
    }

    public /* synthetic */ C4687v3(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
