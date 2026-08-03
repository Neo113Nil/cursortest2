package com.ironsource;

/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3069h0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f6278a;
    private final java.util.UUID b;
    private final java.lang.String c;
    private com.ironsource.C3064gd d;
    private final com.ironsource.Qf e;
    private final java.lang.Double f;

    /* renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6279a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f6279a = iArr;
        }
    }

    public C3069h0(com.ironsource.mediationsdk.IronSource.a adFormat, java.util.UUID adId, java.lang.String adUnitId, com.ironsource.C3064gd c3064gd, com.ironsource.Qf qf, java.lang.Double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f6278a = adFormat;
        this.b = adId;
        this.c = adUnitId;
        this.d = c3064gd;
        this.e = qf;
        this.f = d;
    }

    public final com.ironsource.mediationsdk.IronSource.a a() {
        return this.f6278a;
    }

    public final java.util.UUID b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.Double d() {
        return this.f;
    }

    public final com.unity3d.mediation.LevelPlay.AdFormat e() {
        int i = com.ironsource.C3069h0.a.f6279a[this.f6278a.ordinal()];
        if (i == 1) {
            return com.unity3d.mediation.LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return com.unity3d.mediation.LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.ironsource.C3064gd f() {
        return this.d;
    }

    public final com.ironsource.Qf g() {
        return this.e;
    }

    public final boolean h() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.ironsource.mediationsdk.IronSource.a[]{com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO, com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL}).contains(this.f6278a);
    }

    public final void a(com.ironsource.C3064gd c3064gd) {
        this.d = c3064gd;
    }

    public /* synthetic */ C3069h0(com.ironsource.mediationsdk.IronSource.a aVar, java.util.UUID uuid, java.lang.String str, com.ironsource.C3064gd c3064gd, com.ironsource.Qf qf, java.lang.Double d, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c3064gd, (i & 16) != 0 ? null : qf, (i & 32) != 0 ? null : d);
    }
}
