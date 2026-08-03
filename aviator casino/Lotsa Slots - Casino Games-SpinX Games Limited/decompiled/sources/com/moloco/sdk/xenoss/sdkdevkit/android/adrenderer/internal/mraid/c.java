package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class c {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i f7497a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i a() {
        return this.f7497a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i b() {
        return this.f7497a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f7497a, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) obj).f7497a);
    }

    public int hashCode() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = this.f7497a;
        if (c3453i == null) {
            return 0;
        }
        return c3453i.hashCode();
    }

    public java.lang.String toString() {
        return "MraidAdData(dec=" + this.f7497a + ')';
    }

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i) {
        this.f7497a = c3453i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c(c3453i);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3453i = cVar.f7497a;
        }
        return cVar.a(c3453i);
    }

    public /* synthetic */ c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c3453i);
    }
}
