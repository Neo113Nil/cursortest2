package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CLIManageScreenKt$CLIManageScreen$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent cLIManageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIManageEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel) this.receiver).processEvent(cLIManageEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent cLIManageEvent) {
        Camera2StreamConfigurationMap(cLIManageEvent);
        return kotlin.Unit.INSTANCE;
    }

    CLIManageScreenKt$CLIManageScreen$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageEvent;)V", 0);
    }
}
