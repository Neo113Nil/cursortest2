package com.ironsource;

/* loaded from: classes5.dex */
public final class Y2 extends com.ironsource.C3189nd {
    private final com.ironsource.C3212p0 b;
    private final com.ironsource.mediationsdk.ISBannerSize c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(com.ironsource.C3212p0 adTools, com.ironsource.mediationsdk.ISBannerSize size, java.lang.String placement) {
        super(placement);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.b = adTools;
        this.c = size;
    }

    @Override // com.ironsource.C3189nd, com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        java.util.Map<java.lang.String, java.lang.Object> mutableMap = kotlin.collections.MapsKt.toMutableMap(super.a(c0));
        this.b.a(mutableMap, this.c);
        return mutableMap;
    }
}
