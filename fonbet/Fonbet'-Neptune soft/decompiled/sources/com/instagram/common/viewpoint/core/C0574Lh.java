package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0574Lh {
    public static final C0574Lh A02 = new C0574Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0574Lh)) {
            return false;
        }
        C0574Lh c0574Lh = (C0574Lh) obj;
        return this.A00 == c0574Lh.A00 && this.A01 == c0574Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
