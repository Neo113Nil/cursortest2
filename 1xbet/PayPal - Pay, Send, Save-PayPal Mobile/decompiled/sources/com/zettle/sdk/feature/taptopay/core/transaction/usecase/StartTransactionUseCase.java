package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bà\u0080\u0001\u0018\u000022\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0001:\u0001\u000fJB\u0010\r\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase;", "Lkotlin/Function4;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result;", "", "weakReferenceActivity", "info", "transactionEvents", "result", "invoke", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface StartTransactionUseCase extends kotlin.jvm.functions.Function4<java.lang.ref.WeakReference<android.app.Activity>, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents transactionEvents, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit> result);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result;", "", "<init>", "()V", "NoActivityFound", "NoCvmLimits", "NotSupportedCountry", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result$NoActivityFound;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result$NoCvmLimits;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result$NotSupportedCountry;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result$NoCvmLimits;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NoCvmLimits extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoCvmLimits INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoCvmLimits();

            private NoCvmLimits() {
                super(null);
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result$NotSupportedCountry;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NotSupportedCountry extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NotSupportedCountry INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NotSupportedCountry();

            private NotSupportedCountry() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result$NoActivityFound;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NoActivityFound extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoActivityFound INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoActivityFound();

            private NoActivityFound() {
                super(null);
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
