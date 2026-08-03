package com.ironsource;

/* renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2973bc extends com.ironsource.C3069h0 {
    public /* synthetic */ C2973bc(java.util.UUID uuid, java.lang.String str, com.ironsource.C3064gd c3064gd, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c3064gd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2973bc(java.util.UUID adId, java.lang.String adUnitId, com.ironsource.C3064gd c3064gd) {
        super(com.ironsource.mediationsdk.IronSource.a.NATIVE_AD, adId, adUnitId, c3064gd, null, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public C2973bc() {
        this(com.ironsource.C3326v7.f6774a.a(), "", null, 4, null);
    }
}
