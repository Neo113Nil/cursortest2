package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.inmobi.media.me, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3908me extends FunctionReferenceImpl implements Function1 {
    public C3908me(C3936ne c3936ne) {
        super(1, c3936ne, C3936ne.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        C3936ne c3936ne = (C3936ne) this.receiver;
        c3936ne.getClass();
        c3936ne.a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(shortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return Unit.INSTANCE;
    }
}
