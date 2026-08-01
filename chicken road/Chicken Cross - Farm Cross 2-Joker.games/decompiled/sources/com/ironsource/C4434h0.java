package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4434h0 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f8217a;
    private final UUID b;
    private final String c;
    private C4411fd d;
    private final Rf e;
    private final Double f;

    /* renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8218a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8218a = iArr;
        }
    }

    public C4434h0(IronSource.a adFormat, UUID adId, String adUnitId, C4411fd c4411fd, Rf rf, Double d) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f8217a = adFormat;
        this.b = adId;
        this.c = adUnitId;
        this.d = c4411fd;
        this.e = rf;
        this.f = d;
    }

    public final IronSource.a a() {
        return this.f8217a;
    }

    public final UUID b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Double d() {
        return this.f;
    }

    public final LevelPlay.AdFormat e() {
        int i = a.f8218a[this.f8217a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C4411fd f() {
        return this.d;
    }

    public final Rf g() {
        return this.e;
    }

    public final boolean h() {
        return CollectionsKt.listOf((Object[]) new IronSource.a[]{IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL}).contains(this.f8217a);
    }

    public final void a(C4411fd c4411fd) {
        this.d = c4411fd;
    }

    public /* synthetic */ C4434h0(IronSource.a aVar, UUID uuid, String str, C4411fd c4411fd, Rf rf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c4411fd, (i & 16) != 0 ? null : rf, (i & 32) != 0 ? null : d);
    }
}
