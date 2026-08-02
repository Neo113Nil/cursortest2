package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResult;", "<init>", "()V", "Finalized", "UnknownCode", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult$Finalized;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult$UnknownCode;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapOnPhoneFinalizeResult implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionResult {
    public static int getHighResolutionOutputSizeshNQ4ISI;
    public static int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult$Finalized;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Finalized extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult {
        public static final com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.Finalized INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.Finalized();

        private Finalized() {
            super(null);
        }
    }

    private TapOnPhoneFinalizeResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult$UnknownCode;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownCode extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult {
        public static final com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.UnknownCode INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.UnknownCode();

        private UnknownCode() {
            super(null);
        }
    }

    public static int getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i % 6604524;
        getHighResolutionOutputSizeshNQ4ISI = i + 1;
        if (i2 != 0) {
            return getHighSpeedVideoSizes;
        }
        int startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
        getHighSpeedVideoSizes = startUptimeMillis;
        return startUptimeMillis;
    }

    public /* synthetic */ TapOnPhoneFinalizeResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
