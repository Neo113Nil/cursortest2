package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3878le extends FunctionReferenceImpl implements Function2 {
    public C3878le(C3936ne c3936ne) {
        super(2, c3936ne, C3936ne.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4227y p0 = (C4227y) obj;
        InMobiJsonResponse p1 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        C3936ne c3936ne = (C3936ne) this.receiver;
        Z9 z9 = c3936ne.e;
        if (z9 != null) {
            z9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c3936ne.r.a(new Yd(p0, p1, c3936ne.p, c3936ne.q, c3936ne.r), c3936ne);
        return Unit.INSTANCE;
    }
}
