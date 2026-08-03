package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes5.dex */
public final class l {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f7482a;
    public final boolean b;
    public final double c;
    public final int d;

    public l(int i, boolean z, double d, int i2) {
        this.f7482a = i;
        this.b = z;
        this.c = d;
        this.d = i2;
    }

    public final int a() {
        return this.f7482a;
    }

    public final boolean b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.f7482a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l) obj;
        return this.f7482a == lVar.f7482a && this.b == lVar.b && java.lang.Double.compare(this.c, lVar.c) == 0 && this.d == lVar.d;
    }

    public final int f() {
        return this.d;
    }

    public final double g() {
        return this.c;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.f7482a * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.c)) * 31) + this.d;
    }

    public java.lang.String toString() {
        return "MediaConfig(chunkSize=" + this.f7482a + ", isStreamingEnabled=" + this.b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.c + ", mediaCacheDiskCleanUpLimit=" + this.d + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l a(int i, boolean z, double d, int i2) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l(i, z, d, i2);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l lVar, int i, boolean z, double d, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = lVar.f7482a;
        }
        if ((i3 & 2) != 0) {
            z = lVar.b;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            d = lVar.c;
        }
        double d2 = d;
        if ((i3 & 8) != 0) {
            i2 = lVar.d;
        }
        return lVar.a(i, z2, d2, i2);
    }
}
