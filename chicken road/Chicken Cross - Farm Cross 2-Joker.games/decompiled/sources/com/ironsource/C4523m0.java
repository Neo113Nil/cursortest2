package com.ironsource;

import android.content.Context;
import com.ironsource.E0;
import com.ironsource.Gf;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4523m0 extends C4659tb {

    /* renamed from: a, reason: collision with root package name */
    private final C4725x5 f8324a;
    private final Gf.b b;
    private final F8 c;

    public C4523m0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.f8324a = new C4725x5(aVar, E0.b.MEDIATION, null, null, 12, null);
        Gf.b b = Gf.b(aVar);
        Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.b = b;
        this.c = Ib.v.d().f();
    }

    public static /* synthetic */ String a(C4523m0 c4523m0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4523m0.a(str, str2);
    }

    private final Float d() {
        Sa a2 = this.c.a();
        Float valueOf = a2 != null ? Float.valueOf(a2.m()) : null;
        if (valueOf != null) {
            return valueOf;
        }
        this.f8324a.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    public final Integer b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float d = d();
        if (d != null) {
            return Integer.valueOf(MathKt.roundToInt(d.floatValue() * X4.f8004a.a(context)));
        }
        return null;
    }

    public final List<LevelPlayAdSize> c() {
        Sa a2 = this.c.a();
        if (a2 != null) {
            return a2.l();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final String a(String str, String str2) {
        String a2 = this.b.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a2, "logFactory.createLogMessage(message, suffix)");
        return a2;
    }

    public final int a(int i) {
        return com.ironsource.mediationsdk.j.a(i);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize b = b(fallbackAdSize$mediationsdk_release);
        b.setAdaptive(true);
        com.ironsource.mediationsdk.m.f8421a.a(b, new R7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return b;
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.e, 0, 0);
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()))) {
            return new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        return new ISBannerSize(com.ironsource.mediationsdk.j.f8411a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final ISBannerSize b(LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean isAdaptive = size.isAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(size);
    }
}
