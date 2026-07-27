package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4518ld {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8315a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final Integer e;
    private final Boolean f;
    private final C4687v3 g;
    private final Xc h;

    public C4518ld() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer a() {
        return this.f8315a;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4518ld)) {
            return false;
        }
        C4518ld c4518ld = (C4518ld) obj;
        return Intrinsics.areEqual(this.f8315a, c4518ld.f8315a) && Intrinsics.areEqual(this.b, c4518ld.b) && Intrinsics.areEqual(this.c, c4518ld.c) && Intrinsics.areEqual(this.d, c4518ld.d) && Intrinsics.areEqual(this.e, c4518ld.e) && Intrinsics.areEqual(this.f, c4518ld.f) && Intrinsics.areEqual(this.g, c4518ld.g) && Intrinsics.areEqual(this.h, c4518ld.h);
    }

    public final Boolean f() {
        return this.f;
    }

    public final C4687v3 g() {
        return this.g;
    }

    public final Xc h() {
        return this.h;
    }

    public int hashCode() {
        Integer num = this.f8315a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C4687v3 c4687v3 = this.g;
        int hashCode7 = (hashCode6 + (c4687v3 == null ? 0 : c4687v3.hashCode())) * 31;
        Xc xc = this.h;
        return hashCode7 + (xc != null ? xc.hashCode() : 0);
    }

    public final C4687v3 i() {
        return this.g;
    }

    public final Boolean j() {
        return this.f;
    }

    public final Xc k() {
        return this.h;
    }

    public final Integer l() {
        return this.f8315a;
    }

    public final String m() {
        return this.b;
    }

    public final Integer n() {
        return this.e;
    }

    public final String o() {
        return this.d;
    }

    public final Boolean p() {
        return this.c;
    }

    public String toString() {
        return "PlacementConfig2(placementId=" + this.f8315a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
    }

    public C4518ld(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4687v3 c4687v3, Xc xc) {
        this.f8315a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c4687v3;
        this.h = xc;
    }

    public final C4518ld a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4687v3 c4687v3, Xc xc) {
        return new C4518ld(num, str, bool, str2, num2, bool2, c4687v3, xc);
    }

    public /* synthetic */ C4518ld(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4687v3 c4687v3, Xc xc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c4687v3, (i & 128) == 0 ? xc : null);
    }
}
