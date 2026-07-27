package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ce extends AbstractC3819jc {
    public final C4227y f;
    public final AbstractC4120u1 g;
    public final Hd h;
    public final Ad i;
    public final Fd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ce(C4227y adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC4120u1 adUnitTimeout, Hd nativeCallback, Ad stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adComponent;
        this.g = adUnitTimeout;
        this.h = nativeCallback;
        this.i = stateMachine;
        this.j = new Fd(new Ed(adComponent, inMobiJsonResponse, stateMachine));
    }

    public final void a(C3626cf pubData) {
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + pubData);
        }
        this.i.a(new C3993pe(pubData, this.f, this.j, this.g, this.h, this.i), this);
    }
}
