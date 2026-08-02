package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "TransactionCardError", com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDeclined, "TransactionEndApplicationError", "TransactionFailed", "TransactionFailedAllowFallback", "TransactionNoAppError", "TransactionRequireCDCVM", "TransactionSelectNextInterface", "TransactionTryAgain", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionCardError;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionDeclined;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionEndApplicationError;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionFailedAllowFallback;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionNoAppError;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionRequireCDCVM;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionSelectNextInterface;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionTryAgain;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SDKTransactionResults extends com.zettle.sdk.feature.taptopay.core.FailureReason {
    private final java.lang.String getHighSpeedVideoSizes;

    private SDKTransactionResults(java.lang.String str) {
        super("", null);
        this.getHighSpeedVideoSizes = str;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.FailureReason
    /* renamed from: toString, reason: from getter */
    public java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionSelectNextInterface;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionSelectNextInterface extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionSelectNextInterface INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionSelectNextInterface();

        private TransactionSelectNextInterface() {
            super("TransactionSelectNextInterface", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionCardError;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionCardError extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionCardError INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionCardError();

        private TransactionCardError() {
            super("TransactionCardError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionTryAgain;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionTryAgain extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionTryAgain INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionTryAgain();

        private TransactionTryAgain() {
            super("TransactionTryAgain", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionDeclined;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionDeclined extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionDeclined INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionDeclined();

        private TransactionDeclined() {
            super(com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDeclined, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionFailed extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailed INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailed();

        private TransactionFailed() {
            super("TransactionFailed", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionEndApplicationError;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionEndApplicationError extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionEndApplicationError INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionEndApplicationError();

        private TransactionEndApplicationError() {
            super("TransactionEndApplicationError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionFailedAllowFallback;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionFailedAllowFallback extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailedAllowFallback INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailedAllowFallback();

        private TransactionFailedAllowFallback() {
            super("TransactionFailedAllowFallback", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionRequireCDCVM;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionRequireCDCVM extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionRequireCDCVM INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionRequireCDCVM();

        private TransactionRequireCDCVM() {
            super("TransactionRequireCDCVM", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults$TransactionNoAppError;", "Lcom/zettle/sdk/feature/taptopay/core/SDKTransactionResults;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionNoAppError extends com.zettle.sdk.feature.taptopay.core.SDKTransactionResults {
        public static final com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionNoAppError INSTANCE = new com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionNoAppError();

        private TransactionNoAppError() {
            super("TransactionNoAppError", null);
        }
    }

    public /* synthetic */ SDKTransactionResults(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
