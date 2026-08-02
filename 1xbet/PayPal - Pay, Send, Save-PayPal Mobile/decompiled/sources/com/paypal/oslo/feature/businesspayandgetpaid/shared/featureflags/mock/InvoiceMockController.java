package com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/featureflags/mock/InvoiceMockController;", "", "<init>", "()V", "", "DEMO_INVOICE_ID", "Ljava/lang/String;", "", "useMockEnabled", "Z", "getUseMockEnabled", "()Z", "setUseMockEnabled", "(Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceMockController {
    public static final java.lang.String DEMO_INVOICE_ID = "DEMO-INV-001";
    private static boolean useMockEnabled;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController();
    public static final int $stable = 8;

    private InvoiceMockController() {
    }

    public final boolean getUseMockEnabled() {
        return useMockEnabled;
    }

    public final void setUseMockEnabled(boolean z) {
        useMockEnabled = z;
    }
}
