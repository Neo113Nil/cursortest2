package com.ironsource;

import android.app.Activity;
import com.ironsource.C4565o6;
import com.ironsource.InterfaceC4654t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class H6 implements InterfaceC4654t6, C4565o6.b, C4565o6.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f7658a;
    private final InterfaceC4654t6.a b;
    private final InterfaceC4583p6 c;
    private final InterfaceC4618r6 d;
    private final InterfaceC4636s6 e;
    private C4565o6 f;

    public H6(C4577p0 adTools, InterfaceC4654t6.a config, InterfaceC4583p6 fullscreenAdUnitFactory, InterfaceC4618r6 fullscreenAdUnitListener, InterfaceC4636s6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7658a = adTools;
        this.b = config;
        this.c = fullscreenAdUnitFactory;
        this.d = fullscreenAdUnitListener;
        this.e = listener;
    }

    public final C4577p0 a() {
        return this.f7658a;
    }

    public final InterfaceC4654t6.a b() {
        return this.b;
    }

    @Override // com.ironsource.C4565o6.b
    public void c(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4654t6
    public void loadAd() {
        C4565o6 a2 = this.c.a(true, this.d);
        a2.a(this);
        this.f = a2;
    }

    @Override // com.ironsource.InterfaceC4654t6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4565o6 c4565o6 = this.f;
        if (c4565o6 != null) {
            c4565o6.a(activity, this);
        }
    }

    @Override // com.ironsource.C4565o6.b
    public void b(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    @Override // com.ironsource.C4565o6.b
    public void a(C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C4565o6.b
    public void b(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.b(ironSourceError);
    }

    @Override // com.ironsource.C4565o6.a
    public void a(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adInfo);
    }

    @Override // com.ironsource.C4565o6.a
    public void a(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.c(ironSourceError);
    }
}
