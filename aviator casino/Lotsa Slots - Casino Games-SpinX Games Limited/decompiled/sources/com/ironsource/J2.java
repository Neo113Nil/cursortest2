package com.ironsource;

/* loaded from: classes5.dex */
public final class J2 extends com.ironsource.C3069h0 {
    private final com.unity3d.mediation.LevelPlayAdSize g;
    private final java.lang.Boolean h;
    private final java.lang.Long i;

    public /* synthetic */ J2(java.util.UUID uuid, java.lang.String str, com.ironsource.C3064gd c3064gd, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.Boolean bool, java.lang.Long l, com.ironsource.Qf qf, java.lang.Double d, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c3064gd, (i & 8) != 0 ? com.unity3d.mediation.LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : qf, (i & 128) != 0 ? null : d);
    }

    public final com.unity3d.mediation.LevelPlayAdSize i() {
        return this.g;
    }

    public final java.lang.Boolean j() {
        return this.h;
    }

    public final java.lang.Long k() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(java.util.UUID adId, java.lang.String adUnitId, com.ironsource.C3064gd c3064gd, com.unity3d.mediation.LevelPlayAdSize adSize, java.lang.Boolean bool, java.lang.Long l, com.ironsource.Qf qf, java.lang.Double d) {
        super(com.ironsource.mediationsdk.IronSource.a.BANNER, adId, adUnitId, c3064gd, qf, d);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.g = adSize;
        this.h = bool;
        this.i = l;
    }

    public J2() {
        this(com.ironsource.C3326v7.f6774a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
