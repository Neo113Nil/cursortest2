package com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "ConfirmTapped", "RetakeTapped", "SubmissionSuccess", "SubmissionError", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$ConfirmTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$RetakeTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$SubmissionError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$SubmissionSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LivenessReviewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private LivenessReviewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "", "faceScanResultBlob", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFaceScanResultBlob"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String faceScanResultBlob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str) {
            super("LivenessReviewEvent.Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.faceScanResultBlob = str;
        }

        public final java.lang.String getFaceScanResultBlob() {
            return this.faceScanResultBlob;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.faceScanResultBlob;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(faceScanResultBlob=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.faceScanResultBlob.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceScanResultBlob, ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize) other).faceScanResultBlob);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize copy(java.lang.String faceScanResultBlob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanResultBlob, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize(faceScanResultBlob);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFaceScanResultBlob() {
            return this.faceScanResultBlob;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize initialize, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.faceScanResultBlob;
            }
            return initialize.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$ConfirmTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.ConfirmTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.ConfirmTapped();

        public final int hashCode() {
            return 140691943;
        }

        private ConfirmTapped() {
            super("LivenessReviewEvent.ConfirmTapped", null);
        }

        public final java.lang.String toString() {
            return "ConfirmTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.ConfirmTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$RetakeTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetakeTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.RetakeTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.RetakeTapped();

        public final int hashCode() {
            return 170843275;
        }

        private RetakeTapped() {
            super("LivenessReviewEvent.RetakeTapped", null);
        }

        public final java.lang.String toString() {
            return "RetakeTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.RetakeTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$SubmissionSuccess;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "", "verificationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$SubmissionSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVerificationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmissionSuccess extends com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String verificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmissionSuccess(java.lang.String str) {
            super("LivenessReviewEvent.SubmissionSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.verificationId = str;
        }

        public final java.lang.String getVerificationId() {
            return this.verificationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.verificationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmissionSuccess(verificationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.verificationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.verificationId, ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess) other).verificationId);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess copy(java.lang.String verificationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationId, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess(verificationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVerificationId() {
            return this.verificationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess submissionSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = submissionSuccess.verificationId;
            }
            return submissionSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$SubmissionError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent$SubmissionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmissionError extends com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmissionError(java.lang.String str) {
            super("LivenessReviewEvent.SubmissionError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmissionError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError) other).error);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError submissionError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = submissionError.error;
            }
            return submissionError.copy(str);
        }
    }

    public /* synthetic */ LivenessReviewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
