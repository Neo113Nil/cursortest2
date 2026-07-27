package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class Zd extends FunctionReferenceImpl implements Function2 {
    public Zd(C3596be c3596be) {
        super(2, c3596be, C3596be.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4227y p0 = (C4227y) obj;
        InMobiJsonResponse p1 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        C3596be c3596be = (C3596be) this.receiver;
        Z9 z9 = c3596be.e;
        if (z9 != null) {
            z9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c3596be.r.a(new Yd(p0, p1, c3596be.p, c3596be.q, c3596be.r), c3596be);
        return Unit.INSTANCE;
    }
}
