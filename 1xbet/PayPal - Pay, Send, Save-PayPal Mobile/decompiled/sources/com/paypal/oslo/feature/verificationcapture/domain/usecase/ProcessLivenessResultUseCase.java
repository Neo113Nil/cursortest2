package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "result", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "invoke", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;)Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "LivenessAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProcessLivenessResultUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ProcessLivenessResultUseCase() {
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction invoke(com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success) {
            return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success) result);
        }
        if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure) {
            com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure) result;
            if (failure.getError().isRecoverable()) {
                return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry(failure.getError());
            }
            return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail(failure.getError());
        }
        if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Cancelled) {
            return com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Cancel.INSTANCE;
        }
        if (!(result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("TIMEOUT", "Timeout", false, null, 12, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "", "<init>", "()V", "Continue", "Retry", "Fail", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Cancel;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Continue;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Fail;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Retry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class LivenessAction {
        public static final int $stable = 0;

        private LivenessAction() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Continue;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;", "result", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;)Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Continue;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Continue extends com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Continue(com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success success) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
                this.result = success;
            }

            public final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success success = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Continue(result=");
                sb.append(success);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue) other).result);
            }

            public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue copy(com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue copy$default(com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Continue r0, com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success success, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    success = r0.result;
                }
                return r0.copy(success);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Retry;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;)Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Retry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Retry extends com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Retry(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationError, "");
                this.error = verificationError;
            }

            public final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Retry(error=");
                sb.append(verificationError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry) other).error);
            }

            public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry copy(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry copy$default(com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Retry retry, com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    verificationError = retry.error;
                }
                return retry.copy(verificationError);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Fail;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;)Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Fail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Fail extends com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fail(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationError, "");
                this.error = verificationError;
            }

            public final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Fail(error=");
                sb.append(verificationError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail) other).error);
            }

            public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail copy(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail copy$default(com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Fail fail, com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    verificationError = fail.error;
                }
                return fail.copy(verificationError);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction$Cancel;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessLivenessResultUseCase$LivenessAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Cancel extends com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Cancel INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Cancel();

            public final int hashCode() {
                return -1255780938;
            }

            private Cancel() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase.LivenessAction.Cancel)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ LivenessAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
