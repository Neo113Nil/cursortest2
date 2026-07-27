package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3568ae extends FunctionReferenceImpl implements Function1 {
    public C3568ae(C3596be c3596be) {
        super(1, c3596be, C3596be.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        C3596be c3596be = (C3596be) this.receiver;
        c3596be.getClass();
        c3596be.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), shortValue);
        return Unit.INSTANCE;
    }
}
