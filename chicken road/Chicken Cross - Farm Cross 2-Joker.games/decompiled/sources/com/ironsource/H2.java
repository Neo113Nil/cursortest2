package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class H2 extends C4434h0 {
    private final LevelPlayAdSize g;
    private final Boolean h;
    private final Long i;

    public /* synthetic */ H2(UUID uuid, String str, C4411fd c4411fd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Rf rf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c4411fd, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : rf, (i & 128) != 0 ? null : d);
    }

    public final LevelPlayAdSize i() {
        return this.g;
    }

    public final Boolean j() {
        return this.h;
    }

    public final Long k() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(UUID adId, String adUnitId, C4411fd c4411fd, LevelPlayAdSize adSize, Boolean bool, Long l, Rf rf, Double d) {
        super(IronSource.a.BANNER, adId, adUnitId, c4411fd, rf, d);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.g = adSize;
        this.h = bool;
        this.i = l;
    }

    public H2() {
        this(C4637s7.f8524a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
