package com.paypal.oslo.feature.moneymovement.ui.success.component;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class SuccessScreenComponentsImpl$Content$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.time.Instant, java.lang.String> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.String invoke(kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl.access$formatDaysRemaining((com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl) this.receiver, instant);
    }

    SuccessScreenComponentsImpl$Content$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl.class, "formatDaysRemaining", "formatDaysRemaining(Lkotlin/time/Instant;)Ljava/lang/String;", 0);
    }
}
