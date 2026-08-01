package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f7568a;
    private final C4565o6 b;
    private final boolean c;

    public B6(A6 strategy, C4565o6 c4565o6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f7568a = strategy;
        this.b = c4565o6;
        this.c = z;
    }

    @Override // com.ironsource.G6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7568a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.G6
    public void b(IronSourceError ironSourceError) {
        this.f7568a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.G6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7568a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        C4565o6 a2 = this.f7568a.b().a(true, this.f7568a.c());
        A6 a6 = this.f7568a;
        a6.a(new F6(a6, a2));
        a2.a(this.f7568a);
    }

    @Override // com.ironsource.G6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7568a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.G6
    public void c(IronSourceError ironSourceError) {
        this.f7568a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.ironsource.G6
    public void a() {
        this.f7568a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    public /* synthetic */ B6(A6 a6, C4565o6 c4565o6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(a6, c4565o6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.G6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7568a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
