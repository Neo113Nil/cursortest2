package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4708w6 implements InterfaceC4762z6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4672u6 f8745a;
    private final C4565o6 b;
    private C4565o6 c;
    private boolean d;

    public C4708w6(C4672u6 strategy, C4565o6 currentAdUnit, C4565o6 c4565o6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f8745a = strategy;
        this.b = currentAdUnit;
        this.c = c4565o6;
        this.d = z;
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f8745a.a(new C4744y6(this.f8745a, this.b, this.c));
        this.b.a(activity, this.f8745a);
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(this.b, adUnit)) {
            this.f8745a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void c(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.f8745a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void loadAd() {
        Unit unit;
        if (this.d) {
            this.f8745a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo e = this.b.e();
        if (e != null) {
            this.f8745a.d().b(e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f8745a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C4565o6 a2 = this.f8745a.b().a(false, this.f8745a.c());
            this.c = a2;
            a2.a(this.f8745a);
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else {
            this.f8745a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.f8745a.a("show success when loaded");
        } else {
            this.f8745a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C4708w6(C4672u6 c4672u6, C4565o6 c4565o6, C4565o6 c4565o62, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4672u6, c4565o6, c4565o62, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.f8745a.a("show failed when loaded");
        } else {
            this.f8745a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else if (Intrinsics.areEqual(adUnit, this.b)) {
            a();
        }
    }

    private final void a() {
        InterfaceC4762z6 c4726x6;
        C4565o6 c4565o6 = this.c;
        if (c4565o6 == null) {
            C4672u6 c4672u6 = this.f8745a;
            c4672u6.a(new C4690v6(c4672u6));
        } else {
            if ((c4565o6 != null ? c4565o6.e() : null) != null) {
                C4672u6 c4672u62 = this.f8745a;
                C4565o6 c4565o62 = this.c;
                Intrinsics.checkNotNull(c4565o62);
                c4726x6 = new C4708w6(c4672u62, c4565o62, null, false, 8, null);
            } else {
                C4672u6 c4672u63 = this.f8745a;
                C4565o6 c4565o63 = this.c;
                Intrinsics.checkNotNull(c4565o63);
                c4726x6 = new C4726x6(c4672u63, c4565o63, false);
            }
            this.f8745a.a(c4726x6);
        }
        this.f8745a.d().a();
    }
}
