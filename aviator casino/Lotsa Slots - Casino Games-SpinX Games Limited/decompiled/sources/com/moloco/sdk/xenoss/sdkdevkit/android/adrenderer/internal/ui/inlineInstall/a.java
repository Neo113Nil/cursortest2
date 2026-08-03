package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class a {
    public static final int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7623a;
    public final boolean b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;

    public a(boolean z, boolean z2, java.lang.String str, java.lang.String str2, boolean z3) {
        this.f7623a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
    }

    public final boolean a() {
        return this.f7623a;
    }

    public final boolean b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a) obj;
        return this.f7623a == aVar.f7623a && this.b == aVar.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d) && this.e == aVar.e;
    }

    public final java.lang.String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f7623a;
    }

    public final java.lang.String h() {
        return this.c;
    }

    public int hashCode() {
        int m = ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7623a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31;
        java.lang.String str = this.c;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.d;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.e);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.b;
    }

    public java.lang.String toString() {
        return "AndroidAutoInlineControllerData(enabled=" + this.f7623a + ", onSkip=" + this.b + ", eventLink=" + this.c + ", clickthroughUrl=" + this.d + ", forceFullscreen=" + this.e + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a a(boolean z, boolean z2, java.lang.String str, java.lang.String str2, boolean z3) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(z, z2, str, str2, z3);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar, boolean z, boolean z2, java.lang.String str, java.lang.String str2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f7623a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            str = aVar.c;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = aVar.d;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            z3 = aVar.e;
        }
        return aVar.a(z, z4, str3, str4, z3);
    }
}
