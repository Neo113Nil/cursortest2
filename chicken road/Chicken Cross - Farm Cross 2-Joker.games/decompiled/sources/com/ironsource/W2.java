package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W2 extends C4536md {
    private final C4577p0 b;
    private final ISBannerSize c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(C4577p0 adTools, ISBannerSize size, String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.b = adTools;
        this.c = size;
    }

    @Override // com.ironsource.C4536md, com.ironsource.D0
    public Map<String, Object> a(B0 b0) {
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.a(b0));
        this.b.a(mutableMap, this.c);
        return mutableMap;
    }
}
