package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "OpenTransactionDetail", "OpenStatements", "ShowCancelPaymentSuccessToast", "ShowCancelPaymentBottomSheet", "DismissCancelPaymentBottomSheet", "DismissBottomSheetAndShowSuccessToast", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$DismissBottomSheetAndShowSuccessToast;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$DismissCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$OpenStatements;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$OpenTransactionDetail;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$ShowCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$ShowCancelPaymentSuccessToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ActivityUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.NavigateBack();

        public final int hashCode() {
            return -1504974509;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private ActivityUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$OpenTransactionDetail;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "detailArgs", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$OpenTransactionDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "getDetailArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenTransactionDetail extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs detailArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenTransactionDetail(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
            super("OpenTransactionDetail", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestinationArgs, "");
            this.detailArgs = activityDetailDestinationArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getDetailArgs() {
            return this.detailArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs = this.detailArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenTransactionDetail(detailArgs=");
            sb.append(activityDetailDestinationArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.detailArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.detailArgs, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail) other).detailArgs);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs detailArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailArgs, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail(detailArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getDetailArgs() {
            return this.detailArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail openTransactionDetail, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailDestinationArgs = openTransactionDetail.detailArgs;
            }
            return openTransactionDetail.copy(activityDetailDestinationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$OpenStatements;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "arg", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$OpenStatements;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "getArg"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenStatements extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs arg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenStatements(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
            super("OpenStatements", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubArgs, "");
            this.arg = statementHubArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArg() {
            return this.arg;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs = this.arg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenStatements(arg=");
            sb.append(statementHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.arg.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements) && kotlin.jvm.internal.Intrinsics.areEqual(this.arg, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements) other).arg);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs arg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arg, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements(arg);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArg() {
            return this.arg;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements openStatements, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementHubArgs = openStatements.arg;
            }
            return openStatements.copy(statementHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$ShowCancelPaymentSuccessToast;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCancelPaymentSuccessToast extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentSuccessToast INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentSuccessToast();

        public final int hashCode() {
            return -996589128;
        }

        private ShowCancelPaymentSuccessToast() {
            super("ShowCancelPaymentSuccessToast", null);
        }

        public final java.lang.String toString() {
            return "ShowCancelPaymentSuccessToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentSuccessToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$ShowCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCancelPaymentBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentBottomSheet();

        public final int hashCode() {
            return 754293152;
        }

        private ShowCancelPaymentBottomSheet() {
            super("ShowCancelPaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowCancelPaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$DismissCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissCancelPaymentBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissCancelPaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissCancelPaymentBottomSheet();

        public final int hashCode() {
            return 964701591;
        }

        private DismissCancelPaymentBottomSheet() {
            super("DismissCancelPaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissCancelPaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissCancelPaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect$DismissBottomSheetAndShowSuccessToast;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissBottomSheetAndShowSuccessToast extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissBottomSheetAndShowSuccessToast INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissBottomSheetAndShowSuccessToast();

        public final int hashCode() {
            return 2034160403;
        }

        private DismissBottomSheetAndShowSuccessToast() {
            super("DismissBottomSheetAndShowSuccessToast", null);
        }

        public final java.lang.String toString() {
            return "DismissBottomSheetAndShowSuccessToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissBottomSheetAndShowSuccessToast)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ActivityUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
