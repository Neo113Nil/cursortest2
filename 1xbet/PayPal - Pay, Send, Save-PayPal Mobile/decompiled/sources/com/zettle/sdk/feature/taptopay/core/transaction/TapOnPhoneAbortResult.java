package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResult;", "<init>", "()V", "Aborted", "UnknownCode", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult$Aborted;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult$UnknownCode;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapOnPhoneAbortResult implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionResult {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult$Aborted;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Aborted extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult {
        public static final com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult.Aborted INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult.Aborted();

        private Aborted() {
            super(null);
        }
    }

    private TapOnPhoneAbortResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult$UnknownCode;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownCode extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult {
        public static final com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult.UnknownCode INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult.UnknownCode();

        private UnknownCode() {
            super(null);
        }
    }

    public /* synthetic */ TapOnPhoneAbortResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
