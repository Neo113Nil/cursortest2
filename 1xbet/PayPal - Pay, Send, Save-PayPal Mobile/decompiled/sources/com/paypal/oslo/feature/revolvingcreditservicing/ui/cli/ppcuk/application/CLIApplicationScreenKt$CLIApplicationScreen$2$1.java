package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CLIApplicationScreenKt$CLIApplicationScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent cLIApplicationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel) this.receiver).processEvent(cLIApplicationEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent cLIApplicationEvent) {
        Camera2StreamConfigurationMap(cLIApplicationEvent);
        return kotlin.Unit.INSTANCE;
    }

    CLIApplicationScreenKt$CLIApplicationScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;)V", 0);
    }
}
