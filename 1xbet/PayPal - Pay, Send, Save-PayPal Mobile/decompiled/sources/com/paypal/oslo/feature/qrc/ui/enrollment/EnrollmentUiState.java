package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "getProgress", "()F", "progress", "CheckingEligibility", "Enrolling", "Success", "Error", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$CheckingEligibility;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$Enrolling;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$Error;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class EnrollmentUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EnrollmentUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$CheckingEligibility;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckingEligibility extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility();

        public final int hashCode() {
            return -2028861391;
        }

        private CheckingEligibility() {
            super("EnrollmentUiState.CheckingEligibility", null);
        }

        public final java.lang.String toString() {
            return "CheckingEligibility";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$Enrolling;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Enrolling extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling();

        public final int hashCode() {
            return 878369242;
        }

        private Enrolling() {
            super("EnrollmentUiState.Enrolling", null);
        }

        public final java.lang.String toString() {
            return "Enrolling";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$Success;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Success INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Success();

        public final int hashCode() {
            return 719428577;
        }

        private Success() {
            super("EnrollmentUiState.Success", null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState$Error;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error();

        public final int hashCode() {
            return -1804432026;
        }

        private Error() {
            super("EnrollmentUiState.Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    public final float getProgress() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility.INSTANCE)) {
            return 0.0f;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling.INSTANCE)) {
            return 0.5f;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Success.INSTANCE)) {
            return 1.0f;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error.INSTANCE)) {
            return 0.0f;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ EnrollmentUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
