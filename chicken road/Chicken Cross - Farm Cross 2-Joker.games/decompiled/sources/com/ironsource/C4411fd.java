package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4411fd extends AbstractC4490k3 {
    private String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4411fd(int i, String placementName, boolean z, String rewardName, int i2, C4429gd c4429gd) {
        super(i, placementName, z, c4429gd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f = i2;
        this.e = rewardName;
    }

    public final int e() {
        return this.f;
    }

    public final String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC4490k3
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4411fd(AbstractC4490k3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.e = "";
    }
}
