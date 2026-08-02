package com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u0000 \n2 \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\n\u000bJ,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H¦\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result;", "", "organizationId", "result", "invoke", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Companion", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CvmLimitsUsecase extends kotlin.jvm.functions.Function2<java.lang.String, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, ? extends kotlin.Unit>, kotlin.Unit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void invoke(java.lang.String organizationId, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit> result);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/BaseResult;", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result implements com.zettle.sdk.feature.taptopay.core.BaseResult {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result {
            private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                this.reason = failureReason;
            }

            /* renamed from: getReason$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                return this.reason;
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "cvmLimits", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;)V", "Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "getCvmLimits", "()Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result {
            private final com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmLimits, "");
                this.cvmLimits = cvmLimits;
            }

            public final com.zettle.sdk.feature.taptopay.core.models.CvmLimits getCvmLimits() {
                return this.cvmLimits;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Companion();

        private Companion() {
        }
    }
}
