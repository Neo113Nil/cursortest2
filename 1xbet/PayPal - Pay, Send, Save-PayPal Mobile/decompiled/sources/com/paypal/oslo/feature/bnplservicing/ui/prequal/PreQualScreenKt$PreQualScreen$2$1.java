package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PreQualScreenKt$PreQualScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent preQualEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preQualEvent, "");
        ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel) this.receiver).processEvent(preQualEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent preQualEvent) {
        getHighSpeedVideoSizes(preQualEvent);
        return kotlin.Unit.INSTANCE;
    }

    PreQualScreenKt$PreQualScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;)V", 0);
    }
}
