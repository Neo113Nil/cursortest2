package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor;", "", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "validate", "()Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "Companion", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface PreRequisiteInteractor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Companion.getHighSpeedVideoSizes;
    public static final java.lang.String TAP_TO_PAY_READER_IDENTIFIER = "com.softspace.1";

    com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result validate();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "Lcom/zettle/sdk/feature/taptopay/core/BaseResult;", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result implements com.zettle.sdk.feature.taptopay.core.BaseResult {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result {
            private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                this.reason = failureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                return this.reason;
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result {
            public static final com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Success INSTANCE = new com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Success();

            private Success() {
                super(null);
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Companion;", "", "<init>", "()V", "", "TAP_TO_PAY_READER_IDENTIFIER", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String TAP_TO_PAY_READER_IDENTIFIER = "com.softspace.1";
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Companion getHighSpeedVideoSizes = new com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Companion();

        private Companion() {
        }
    }
}
