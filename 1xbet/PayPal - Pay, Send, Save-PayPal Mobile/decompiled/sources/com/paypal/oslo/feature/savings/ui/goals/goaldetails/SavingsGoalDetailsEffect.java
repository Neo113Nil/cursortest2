package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "ShowToast", "ShowErrorToast", "NavigateBackWithSuccess", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$ShowErrorToast;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsGoalDetailsEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private SavingsGoalDetailsEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$ShowToast;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.name = "SavingsGoalDetailsEffect.ShowToast";
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowToast copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowToast showToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.message;
            }
            return showToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$ShowErrorToast;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$ShowErrorToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "getErrorType", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType errorType;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowErrorToast(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteGoalErrorType, "");
            this.errorType = deleteGoalErrorType;
            this.name = "SavingsGoalDetailsEffect.ShowErrorToast";
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType getErrorType() {
            return this.errorType;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorToast(errorType=");
            sb.append(deleteGoalErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowErrorToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowErrorToast) other).errorType);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowErrorToast copy(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowErrorToast(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowErrorToast copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.ShowErrorToast showErrorToast, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deleteGoalErrorType = showErrorToast.errorType;
            }
            return showErrorToast.copy(deleteGoalErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect;", "", "toastMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsEffect$NavigateBackWithSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToastMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithSuccess extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String toastMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithSuccess(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.toastMessage = str;
            this.name = "SavingsGoalDetailsEffect.NavigateBackWithSuccess";
        }

        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithSuccess(toastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.NavigateBackWithSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.NavigateBackWithSuccess) other).toastMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.NavigateBackWithSuccess copy(java.lang.String toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.NavigateBackWithSuccess(toastMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.NavigateBackWithSuccess copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsEffect.NavigateBackWithSuccess navigateBackWithSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateBackWithSuccess.toastMessage;
            }
            return navigateBackWithSuccess.copy(str);
        }
    }

    public /* synthetic */ SavingsGoalDetailsEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
