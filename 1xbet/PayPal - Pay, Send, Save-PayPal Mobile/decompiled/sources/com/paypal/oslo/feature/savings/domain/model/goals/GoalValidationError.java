package com.paypal.oslo.feature.savings.domain.model.goals;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "", "<init>", "()V", "EmptyGoalName", "DuplicateGoalName", "TargetAmountBelowMinimum", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError$DuplicateGoalName;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError$EmptyGoalName;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError$TargetAmountBelowMinimum;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class GoalValidationError {
    public static final int $stable = 0;

    private GoalValidationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError$EmptyGoalName;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyGoalName extends com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.EmptyGoalName INSTANCE = new com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.EmptyGoalName();

        public final int hashCode() {
            return -1659034590;
        }

        private EmptyGoalName() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyGoalName";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.EmptyGoalName)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError$DuplicateGoalName;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DuplicateGoalName extends com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.DuplicateGoalName INSTANCE = new com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.DuplicateGoalName();

        public final int hashCode() {
            return 1217247840;
        }

        private DuplicateGoalName() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DuplicateGoalName";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.DuplicateGoalName)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError$TargetAmountBelowMinimum;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmountBelowMinimum extends com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.TargetAmountBelowMinimum INSTANCE = new com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.TargetAmountBelowMinimum();

        public final int hashCode() {
            return 2141303471;
        }

        private TargetAmountBelowMinimum() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TargetAmountBelowMinimum";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.TargetAmountBelowMinimum)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ GoalValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
