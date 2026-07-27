package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class Yd extends AbstractC3986p7 {
    public final C4227y f;
    public final InMobiJsonResponse g;
    public final AbstractC4120u1 h;
    public final Hd i;
    public final Ad j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yd(C4227y adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC4120u1 adUnitTimeout, Hd nativeCallback, Ad stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adComponent;
        this.g = inMobiJsonResponse;
        this.h = adUnitTimeout;
        this.i = nativeCallback;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        Y9 l2 = l();
        if (l2 != null) {
            ((Z9) l2).a("AUM-FetchedState", "Initialize Called");
        }
        this.c.getClass();
        C4227y c4227y = this.f7514a;
        C3922n0 c3922n0 = c4227y.f7489a.f;
        H adContext = c4227y.b;
        c3922n0.getClass();
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        BuildersKt__Builders_commonKt.launch$default(c3922n0.f7256a, null, null, new C3807j0(adContext, c3922n0, null), 3, null);
        AbstractC4012q5.a(k(), new C3958o7(this, null));
    }
}
