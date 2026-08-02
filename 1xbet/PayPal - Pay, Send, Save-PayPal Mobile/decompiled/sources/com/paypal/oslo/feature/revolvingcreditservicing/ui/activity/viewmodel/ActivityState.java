package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\t\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "paginationEnabled", "Z", "getPaginationEnabled", "()Z", "Initial", "Loading", "Reloading", "Error", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "StartingCancelPayment", "CancelingPayment", "RetryCancelingPayment", "CancelPaymentError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$CancelPaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$CancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Reloading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$RetryCancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$StartingCancelPayment;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ActivityState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;
    private final boolean paginationEnabled;

    private ActivityState(java.lang.String str, boolean z) {
        this.name = str;
        this.paginationEnabled = z;
    }

    public /* synthetic */ ActivityState(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public boolean getPaginationEnabled() {
        return this.paginationEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial();

        public final int hashCode() {
            return -478970375;
        }

        private Initial() {
            super("Initial", false, 2, null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
            super("Loading", false, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.args = activityHubArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(args=");
            sb.append(activityHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading loading, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityHubArgs = loading.args;
            }
            return loading.copy(activityHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Reloading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Reloading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reloading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reloading(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel) {
            super("Reloading", false, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
            this.args = activityHubArgs;
            this.uiModel = activityUiModel;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reloading(args=");
            sb.append(activityHubArgs);
            sb.append(", uiModel=");
            sb.append(activityUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.args.hashCode() * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading reloading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.args, reloading.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, reloading.uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading(args, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading reloading, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityHubArgs = reloading.args;
            }
            if ((i & 2) != 0) {
                activityUiModel = reloading.uiModel;
            }
            return reloading.copy(activityHubArgs, activityUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
            super("Error", false, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.args = activityHubArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(args=");
            sb.append(activityHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityHubArgs = error.args;
            }
            return error.copy(activityHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "customerServiceContact", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "getCustomerServiceContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel;

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityUiModel, activityHubArgs, (i & 4) != 0 ? activityHubArgs.getCustomerServiceContact() : customerServiceContact);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact getCustomerServiceContact() {
            return this.customerServiceContact;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, activityUiModel.getPaginationEnabled(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.uiModel = activityUiModel;
            this.args = activityHubArgs;
            this.customerServiceContact = customerServiceContact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = this.customerServiceContact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(uiModel=");
            sb.append(activityUiModel);
            sb.append(", args=");
            sb.append(activityHubArgs);
            sb.append(", customerServiceContact=");
            sb.append(customerServiceContact);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.uiModel.hashCode();
            int hashCode2 = this.args.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = this.customerServiceContact;
            return (((hashCode * 31) + hashCode2) * 31) + (customerServiceContact == null ? 0 : customerServiceContact.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ready.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ready.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerServiceContact, ready.customerServiceContact);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready(uiModel, args, customerServiceContact);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact getCustomerServiceContact() {
            return this.customerServiceContact;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityUiModel = ready.uiModel;
            }
            if ((i & 2) != 0) {
                activityHubArgs = ready.args;
            }
            if ((i & 4) != 0) {
                customerServiceContact = ready.customerServiceContact;
            }
            return ready.copy(activityUiModel, activityHubArgs, customerServiceContact);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$StartingCancelPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "uiModel", "", "repaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$StartingCancelPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "getUiModel", "Ljava/lang/String;", "getRepaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartingCancelPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;
        private final java.lang.String repaymentId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel;

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartingCancelPayment(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
            super("StartingCancelPayment", activityUiModel.getPaginationEnabled(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.uiModel = activityUiModel;
            this.repaymentId = str;
            this.args = activityHubArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = this.uiModel;
            java.lang.String str = this.repaymentId;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartingCancelPayment(uiModel=");
            sb.append(activityUiModel);
            sb.append(", repaymentId=");
            sb.append(str);
            sb.append(", args=");
            sb.append(activityHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.uiModel.hashCode() * 31) + this.repaymentId.hashCode()) * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment startingCancelPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, startingCancelPayment.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentId, startingCancelPayment.repaymentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, startingCancelPayment.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel, java.lang.String repaymentId, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment(uiModel, repaymentId, args);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment startingCancelPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityUiModel = startingCancelPayment.uiModel;
            }
            if ((i & 2) != 0) {
                str = startingCancelPayment.repaymentId;
            }
            if ((i & 4) != 0) {
                activityHubArgs = startingCancelPayment.args;
            }
            return startingCancelPayment.copy(activityUiModel, str, activityHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$CancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "uiModel", "", "repaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$CancelingPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "getUiModel", "Ljava/lang/String;", "getRepaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelingPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;
        private final java.lang.String repaymentId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelingPayment(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
            super("CancelingPayment", false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.uiModel = activityUiModel;
            this.repaymentId = str;
            this.args = activityHubArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = this.uiModel;
            java.lang.String str = this.repaymentId;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelingPayment(uiModel=");
            sb.append(activityUiModel);
            sb.append(", repaymentId=");
            sb.append(str);
            sb.append(", args=");
            sb.append(activityHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.uiModel.hashCode() * 31) + this.repaymentId.hashCode()) * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, cancelingPayment.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentId, cancelingPayment.repaymentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, cancelingPayment.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel, java.lang.String repaymentId, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment(uiModel, repaymentId, args);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment cancelingPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityUiModel = cancelingPayment.uiModel;
            }
            if ((i & 2) != 0) {
                str = cancelingPayment.repaymentId;
            }
            if ((i & 4) != 0) {
                activityHubArgs = cancelingPayment.args;
            }
            return cancelingPayment.copy(activityUiModel, str, activityHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$RetryCancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "uiModel", "", "repaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$RetryCancelingPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "getUiModel", "Ljava/lang/String;", "getRepaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryCancelingPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;
        private final java.lang.String repaymentId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryCancelingPayment(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
            super("RetryCancelingPayment", false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.uiModel = activityUiModel;
            this.repaymentId = str;
            this.args = activityHubArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = this.uiModel;
            java.lang.String str = this.repaymentId;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryCancelingPayment(uiModel=");
            sb.append(activityUiModel);
            sb.append(", repaymentId=");
            sb.append(str);
            sb.append(", args=");
            sb.append(activityHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.uiModel.hashCode() * 31) + this.repaymentId.hashCode()) * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, retryCancelingPayment.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentId, retryCancelingPayment.repaymentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, retryCancelingPayment.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel, java.lang.String repaymentId, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment(uiModel, repaymentId, args);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment retryCancelingPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityUiModel = retryCancelingPayment.uiModel;
            }
            if ((i & 2) != 0) {
                str = retryCancelingPayment.repaymentId;
            }
            if ((i & 4) != 0) {
                activityHubArgs = retryCancelingPayment.args;
            }
            return retryCancelingPayment.copy(activityUiModel, str, activityHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$CancelPaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "uiModel", "", "repaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$CancelPaymentError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "getUiModel", "Ljava/lang/String;", "getRepaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelPaymentError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args;
        private final java.lang.String repaymentId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelPaymentError(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
            super("CancelPaymentError", false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
            this.uiModel = activityUiModel;
            this.repaymentId = str;
            this.args = activityHubArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = this.uiModel;
            java.lang.String str = this.repaymentId;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelPaymentError(uiModel=");
            sb.append(activityUiModel);
            sb.append(", repaymentId=");
            sb.append(str);
            sb.append(", args=");
            sb.append(activityHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.uiModel.hashCode() * 31) + this.repaymentId.hashCode()) * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError cancelPaymentError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, cancelPaymentError.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentId, cancelPaymentError.repaymentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, cancelPaymentError.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel, java.lang.String repaymentId, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError(uiModel, repaymentId, args);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getArgs() {
            return this.args;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError cancelPaymentError, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityUiModel = cancelPaymentError.uiModel;
            }
            if ((i & 2) != 0) {
                str = cancelPaymentError.repaymentId;
            }
            if ((i & 4) != 0) {
                activityHubArgs = cancelPaymentError.args;
            }
            return cancelPaymentError.copy(activityUiModel, str, activityHubArgs);
        }
    }

    public /* synthetic */ ActivityState(java.lang.String str, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }
}
