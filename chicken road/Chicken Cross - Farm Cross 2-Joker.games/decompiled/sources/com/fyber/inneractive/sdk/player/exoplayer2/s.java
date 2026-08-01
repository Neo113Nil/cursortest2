package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public final class s {
    public static final s d = new s(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f5700a;
    public final float b;
    public final int c;

    public s(float f, float f2) {
        this.f5700a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5700a == sVar.f5700a && this.b == sVar.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.f5700a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
