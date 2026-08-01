package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4826l {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10988a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final C4825k e;
    public final String f;
    public final String g;

    public C4826l(Integer num, String str, Integer num2, Integer num3, C4825k c4825k, String str2, String str3) {
        this.f10988a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = c4825k;
        this.f = str2;
        this.g = str3;
    }

    public final Integer a() {
        return this.f10988a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Integer d() {
        return this.d;
    }

    public final C4825k e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4826l)) {
            return false;
        }
        C4826l c4826l = (C4826l) obj;
        return Intrinsics.areEqual(this.f10988a, c4826l.f10988a) && Intrinsics.areEqual(this.b, c4826l.b) && Intrinsics.areEqual(this.c, c4826l.c) && Intrinsics.areEqual(this.d, c4826l.d) && Intrinsics.areEqual(this.e, c4826l.e) && Intrinsics.areEqual(this.f, c4826l.f) && Intrinsics.areEqual(this.g, c4826l.g);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.f10988a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C4825k c4825k = this.e;
        int hashCode5 = (hashCode4 + (c4825k == null ? 0 : c4825k.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final C4825k i() {
        return this.e;
    }

    public final Integer j() {
        return this.c;
    }

    public final String k() {
        return this.b;
    }

    public final Integer l() {
        return this.d;
    }

    public final String m() {
        return this.f;
    }

    public final Integer n() {
        return this.f10988a;
    }

    public String toString() {
        return "DECCta(verticalSpacing=" + this.f10988a + ", ctaText=" + this.b + ", buttonWidth=" + this.c + ", fontSize=" + this.d + ", border=" + this.e + ", foregroundColor=" + this.f + ", backgroundColor=" + this.g + ')';
    }

    public final C4826l a(Integer num, String str, Integer num2, Integer num3, C4825k c4825k, String str2, String str3) {
        return new C4826l(num, str, num2, num3, c4825k, str2, str3);
    }

    public static /* synthetic */ C4826l a(C4826l c4826l, Integer num, String str, Integer num2, Integer num3, C4825k c4825k, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c4826l.f10988a;
        }
        if ((i & 2) != 0) {
            str = c4826l.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            num2 = c4826l.c;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            num3 = c4826l.d;
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            c4825k = c4826l.e;
        }
        C4825k c4825k2 = c4825k;
        if ((i & 32) != 0) {
            str2 = c4826l.f;
        }
        String str5 = str2;
        if ((i & 64) != 0) {
            str3 = c4826l.g;
        }
        return c4826l.a(num, str4, num4, num5, c4825k2, str5, str3);
    }
}
