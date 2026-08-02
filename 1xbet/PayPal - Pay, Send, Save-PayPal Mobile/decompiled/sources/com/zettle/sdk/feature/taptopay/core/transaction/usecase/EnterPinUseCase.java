package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bà\u0080\u0001\u0018\u000022\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0001:\u0001\u000fJB\u0010\r\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase;", "Lkotlin/Function4;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result;", "", "weakReferenceActivity", "info", "onlineHostRequestMessage", "block", "invoke", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface EnterPinUseCase extends kotlin.jvm.functions.Function4<java.lang.ref.WeakReference<android.app.Activity>, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, kotlin.Unit> block);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result;", "", "<init>", "()V", "Canceled", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "NoActivityFound", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result$Canceled;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result$Completed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result$NoActivityFound;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result$NoActivityFound;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NoActivityFound extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.NoActivityFound INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.NoActivityFound();

            private NoActivityFound() {
                super(null);
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result$Canceled;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Canceled extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Canceled INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Canceled();

            private Canceled() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result$Completed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result;", "", "ksn", "pinBlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKsn", "()Ljava/lang/String;", "getPinBlock"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Completed extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result {
            private final java.lang.String ksn;
            private final java.lang.String pinBlock;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Completed(java.lang.String str, java.lang.String str2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.ksn = str;
                this.pinBlock = str2;
            }

            public final java.lang.String getKsn() {
                return this.ksn;
            }

            public final java.lang.String getPinBlock() {
                return this.pinBlock;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
