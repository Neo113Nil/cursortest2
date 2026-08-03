package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public final class s {
    public static final com.fyber.inneractive.sdk.player.exoplayer2.s d = new com.fyber.inneractive.sdk.player.exoplayer2.s(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f4046a;
    public final float b;
    public final int c;

    public s(float f, float f2) {
        this.f4046a = f;
        this.b = f2;
        this.c = java.lang.Math.round(f * 1000.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.s.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.s) obj;
        return this.f4046a == sVar.f4046a && this.b == sVar.b;
    }

    public final int hashCode() {
        return java.lang.Float.floatToRawIntBits(this.b) + ((java.lang.Float.floatToRawIntBits(this.f4046a) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
