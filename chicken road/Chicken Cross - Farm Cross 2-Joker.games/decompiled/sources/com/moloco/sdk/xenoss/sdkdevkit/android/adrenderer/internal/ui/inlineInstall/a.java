package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11158a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;

    public a(boolean z, boolean z2, String str, String str2, boolean z3) {
        this.f11158a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
    }

    public final boolean a() {
        return this.f11158a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11158a == aVar.f11158a && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && this.e == aVar.e;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f11158a;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f11158a) * 31) + Boolean.hashCode(this.b)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.e);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.b;
    }

    public String toString() {
        return "AndroidAutoInlineControllerData(enabled=" + this.f11158a + ", onSkip=" + this.b + ", eventLink=" + this.c + ", clickthroughUrl=" + this.d + ", forceFullscreen=" + this.e + ')';
    }

    public final a a(boolean z, boolean z2, String str, String str2, boolean z3) {
        return new a(z, z2, str, str2, z3);
    }

    public static /* synthetic */ a a(a aVar, boolean z, boolean z2, String str, String str2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f11158a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            str = aVar.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = aVar.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z3 = aVar.e;
        }
        return aVar.a(z, z4, str3, str4, z3);
    }
}
