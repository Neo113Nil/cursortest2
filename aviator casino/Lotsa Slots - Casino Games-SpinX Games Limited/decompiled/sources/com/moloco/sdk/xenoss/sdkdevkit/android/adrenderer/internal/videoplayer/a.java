package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

/* loaded from: classes5.dex */
public final class a {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7940a;
    public final boolean b;
    public final boolean c;

    public a(boolean z, boolean z2, boolean z3) {
        this.f7940a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.f7940a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.f7940a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) obj;
        return this.f7940a == aVar.f7940a && this.b == aVar.b && this.c == aVar.c;
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        return (((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7940a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c);
    }

    public java.lang.String toString() {
        return "PlayingState(isPlaying=" + this.f7940a + ", isVisible=" + this.b + ", hasMore=" + this.c + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a a(boolean z, boolean z2, boolean z3) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(z, z2, z3);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f7940a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.b;
        }
        if ((i & 4) != 0) {
            z3 = aVar.c;
        }
        return aVar.a(z, z2, z3);
    }

    public /* synthetic */ a(boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
