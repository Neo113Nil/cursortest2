package com.ironsource;

import com.ironsource.E0;
import com.ironsource.Gf;
import com.ironsource.InterfaceC4654t6;
import com.ironsource.Ra;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4577p0 extends C4659tb {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f8474a;
    private final Gf.b b;
    private final C4725x5 c;
    private final F8 d;
    private final long e;

    /* renamed from: com.ironsource.p0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8475a = new a();

        private a() {
        }

        @JvmStatic
        public static final C4577p0 a(IronSource.a adFormat, E0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C4577p0(adFormat, level);
        }
    }

    public C4577p0(IronSource.a adFormat, E0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.d = Ib.v.d().f();
        this.e = TimeUnit.HOURS.toMillis(1L);
        this.f8474a = adFormat;
        this.c = new C4725x5(adFormat, level, null, null, 12, null);
        Gf.b b = Gf.b(adFormat);
        Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(adFormat)");
        this.b = b;
    }

    public static /* synthetic */ String a(C4577p0 c4577p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4577p0.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final com.ironsource.lifecycle.b c() {
        com.ironsource.lifecycle.b d = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(d, "getInstance()");
        return d;
    }

    public final String d() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    protected final IronSource.a e() {
        return this.f8474a;
    }

    public final C4725x5 f() {
        return this.c;
    }

    public final int g() {
        return Ib.v.d().s().a(this.f8474a);
    }

    public final String a(String str, String str2) {
        String a2 = this.b.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a2, "logFactory.createLogMessage(message, suffix)");
        return a2;
    }

    public final InterfaceC4654t6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Sa a2 = this.d.a();
        if (a2 != null) {
            return a2.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C4411fd c(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Sa a2 = this.d.a();
        if (a2 == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C4411fd c = a2.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Ra.a d(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Sa a2 = this.d.a();
        if (a2 != null) {
            return a2.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C4411fd a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Sa a2 = this.d.a();
        if (a2 != null) {
            C4411fd c = a2.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c != null) {
                return c;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Sa a2 = this.d.a();
        return a2 != null ? a2.b(adFormat) : this.e;
    }

    public final C4411fd a(LevelPlay.AdFormat adFormat, String str) {
        Sa a2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (a2 = this.d.a()) == null) {
            return null;
        }
        return a2.c(adFormat, str);
    }

    public C4577p0(C4577p0 adTools, E0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.d = Ib.v.d().f();
        this.e = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.f8474a;
        this.f8474a = aVar;
        this.b = adTools.b;
        this.c = new C4725x5(aVar, level, adTools.c.c(), null, 8, null);
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.j.a(data, size);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C4523m0().b(adSize);
    }
}
