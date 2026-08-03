package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class b {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7624a;
    public final java.lang.String b;

    public b(boolean z, java.lang.String str) {
        this.f7624a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.f7624a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final boolean c() {
        return this.f7624a;
    }

    public final java.lang.String d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b) obj;
        return this.f7624a == bVar.f7624a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b);
    }

    public int hashCode() {
        int m = kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7624a) * 31;
        java.lang.String str = this.b;
        return m + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "AndroidInlineControllerData(enabled=" + this.f7624a + ", url=" + this.b + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b a(boolean z, java.lang.String str) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(z, str);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f7624a;
        }
        if ((i & 2) != 0) {
            str = bVar.b;
        }
        return bVar.a(z, str);
    }
}
