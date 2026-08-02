package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContent;", "exitConfirmationContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContent;", "getExitConfirmationContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExitConfirmationContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent exitConfirmationContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_exit_confirm_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_yes_cancel, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_no_continue_application, new java.lang.Object[0]));

    @javax.inject.Inject
    public ExitConfirmationContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent getExitConfirmationContent() {
        return this.exitConfirmationContent;
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
