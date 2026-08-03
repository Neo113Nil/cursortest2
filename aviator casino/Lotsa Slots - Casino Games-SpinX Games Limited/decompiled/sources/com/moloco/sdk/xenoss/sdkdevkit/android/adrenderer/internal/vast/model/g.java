package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public final class g {
    public static final int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7773a;
    public final java.lang.Integer b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h e;

    public g(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        this.f7773a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = child;
    }

    public final java.lang.String a() {
        return this.f7773a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7773a, gVar.f7773a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, gVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, gVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, gVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, gVar.e);
    }

    public final java.lang.String f() {
        return this.c;
    }

    public final java.lang.String g() {
        return this.d;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h h() {
        return this.e;
    }

    public int hashCode() {
        java.lang.String str = this.f7773a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.d;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final java.lang.String i() {
        return this.f7773a;
    }

    public final java.lang.Integer j() {
        return this.b;
    }

    public java.lang.String toString() {
        return "Creative(id=" + this.f7773a + ", sequence=" + this.b + ", adId=" + this.c + ", apiFramework=" + this.d + ", child=" + this.e + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g a(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g(str, num, str2, str3, child);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f7773a;
        }
        if ((i & 2) != 0) {
            num = gVar.b;
        }
        java.lang.Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = gVar.c;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = gVar.d;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            hVar = gVar.e;
        }
        return gVar.a(str, num2, str4, str5, hVar);
    }
}
