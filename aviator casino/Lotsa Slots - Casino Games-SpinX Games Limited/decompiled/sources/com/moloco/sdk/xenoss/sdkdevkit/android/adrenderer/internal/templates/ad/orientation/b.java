package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

/* loaded from: classes5.dex */
public final class b {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a f7557a;
    public final boolean b;

    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a orientation, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f7557a = orientation;
        this.b = z;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a a() {
        return this.f7557a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a d() {
        return this.f7557a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b) obj;
        return this.f7557a == bVar.f7557a && this.b == bVar.b;
    }

    public int hashCode() {
        return (this.f7557a.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b);
    }

    public java.lang.String toString() {
        return "OrientationSettings(orientation=" + this.f7557a + ", allowOrientationChange=" + this.b + ')';
    }

    public /* synthetic */ b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? true : z);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a orientation, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(orientation, z);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aVar = bVar.f7557a;
        }
        if ((i & 2) != 0) {
            z = bVar.b;
        }
        return bVar.a(aVar, z);
    }
}
