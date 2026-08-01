package com.ironsource;

import android.app.Activity;
import com.ironsource.C4565o6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4672u6 implements InterfaceC4654t6, C4565o6.b, C4565o6.a {
    public static final a f = new a(null);
    public static final String g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f8698a;
    private final InterfaceC4583p6 b;
    private final InterfaceC4618r6 c;
    private final InterfaceC4636s6 d;
    private InterfaceC4762z6 e;

    /* renamed from: com.ironsource.u6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4672u6(C4577p0 adTools, InterfaceC4583p6 factory, InterfaceC4618r6 fullscreenAdUnitListener, InterfaceC4636s6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8698a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new C4690v6(this);
    }

    public final C4577p0 a() {
        return this.f8698a;
    }

    public final InterfaceC4583p6 b() {
        return this.b;
    }

    public final InterfaceC4618r6 c() {
        return this.c;
    }

    public final InterfaceC4636s6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4654t6
    public void loadAd() {
        this.e.loadAd();
    }

    public final void a(InterfaceC4762z6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C4565o6.b
    public void b(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adUnit, adInfo);
    }

    @Override // com.ironsource.C4565o6.b
    public void c(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC4654t6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C4565o6.b
    public void b(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C4565o6.b
    public void a(C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(adUnit);
    }

    @Override // com.ironsource.C4565o6.a
    public void a(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adUnit, adInfo);
    }

    @Override // com.ironsource.C4565o6.a
    public void a(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(adUnit, ironSourceError);
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f8698a.f().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + message);
    }
}
