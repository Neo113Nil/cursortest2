package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4824j {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10986a;
    public final String b;
    public final C4825k c;

    public C4824j(Integer num, String str, C4825k c4825k) {
        this.f10986a = num;
        this.b = str;
        this.c = c4825k;
    }

    public final Integer a() {
        return this.f10986a;
    }

    public final String b() {
        return this.b;
    }

    public final C4825k c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final C4825k e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4824j)) {
            return false;
        }
        C4824j c4824j = (C4824j) obj;
        return Intrinsics.areEqual(this.f10986a, c4824j.f10986a) && Intrinsics.areEqual(this.b, c4824j.b) && Intrinsics.areEqual(this.c, c4824j.c);
    }

    public final Integer f() {
        return this.f10986a;
    }

    public int hashCode() {
        Integer num = this.f10986a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C4825k c4825k = this.c;
        return hashCode2 + (c4825k != null ? c4825k.hashCode() : 0);
    }

    public String toString() {
        return "DECAppIcon(size=" + this.f10986a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }

    public final C4824j a(Integer num, String str, C4825k c4825k) {
        return new C4824j(num, str, c4825k);
    }

    public static /* synthetic */ C4824j a(C4824j c4824j, Integer num, String str, C4825k c4825k, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c4824j.f10986a;
        }
        if ((i & 2) != 0) {
            str = c4824j.b;
        }
        if ((i & 4) != 0) {
            c4825k = c4824j.c;
        }
        return c4824j.a(num, str, c4825k);
    }
}
