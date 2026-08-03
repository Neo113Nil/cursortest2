package com.ironsource;

/* renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3064gd extends com.ironsource.AbstractC3179n3 {
    private java.lang.String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064gd(int i, java.lang.String placementName, boolean z, java.lang.String rewardName, int i2, com.ironsource.C3082hd c3082hd) {
        super(i, placementName, z, c3082hd);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f = i2;
        this.e = rewardName;
    }

    public final int e() {
        return this.f;
    }

    public final java.lang.String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC3179n3
    public java.lang.String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064gd(com.ironsource.AbstractC3179n3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.e = "";
    }
}
