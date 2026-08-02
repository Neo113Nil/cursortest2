package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "toolbarTitle", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getToolbarTitle", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "StartingCancelPayment", "CancelingPayment", "RetryCancelingPayment", "CancelPaymentError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$CancelPaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$CancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$RetryCancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$StartingCancelPayment;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ActivityDetailState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toolbarTitle;

    private ActivityDetailState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
        this.name = str;
        this.toolbarTitle = uiString;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getToolbarTitle() {
        return this.toolbarTitle;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Initial();

        public final int hashCode() {
            return -1653093355;
        }

        private Initial() {
            super("Initial", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "toastMessage", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "getArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toastMessage;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel;

        public /* synthetic */ Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityDetailUiModel, activityDetailDestinationArgs, (i & 4) != 0 ? null : uiString);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getToastMessage() {
            return this.toastMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, activityDetailUiModel.getToolbarTitle(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestinationArgs, "");
            this.uiModel = activityDetailUiModel;
            this.args = activityDetailDestinationArgs;
            this.toastMessage = uiString;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs = this.args;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(uiModel=");
            sb.append(activityDetailUiModel);
            sb.append(", args=");
            sb.append(activityDetailDestinationArgs);
            sb.append(", toastMessage=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.uiModel.hashCode();
            int hashCode2 = this.args.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.toastMessage;
            return (((hashCode * 31) + hashCode2) * 31) + (uiString == null ? 0 : uiString.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ready.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ready.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, ready.toastMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready(uiModel, args, toastMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getToastMessage() {
            return this.toastMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailUiModel = ready.uiModel;
            }
            if ((i & 2) != 0) {
                activityDetailDestinationArgs = ready.args;
            }
            if ((i & 4) != 0) {
                uiString = ready.toastMessage;
            }
            return ready.copy(activityDetailUiModel, activityDetailDestinationArgs, uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$StartingCancelPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$StartingCancelPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartingCancelPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel;

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartingCancelPayment(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
            super("StartingCancelPayment", activityDetailUiModel.getToolbarTitle(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestinationArgs, "");
            this.uiModel = activityDetailUiModel;
            this.args = activityDetailDestinationArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartingCancelPayment(uiModel=");
            sb.append(activityDetailUiModel);
            sb.append(", args=");
            sb.append(activityDetailDestinationArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment startingCancelPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, startingCancelPayment.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, startingCancelPayment.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment(uiModel, args);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment startingCancelPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailUiModel = startingCancelPayment.uiModel;
            }
            if ((i & 2) != 0) {
                activityDetailDestinationArgs = startingCancelPayment.args;
            }
            return startingCancelPayment.copy(activityDetailUiModel, activityDetailDestinationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$CancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$CancelingPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelingPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel;

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelingPayment(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
            super("CancelingPayment", activityDetailUiModel.getToolbarTitle(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestinationArgs, "");
            this.uiModel = activityDetailUiModel;
            this.args = activityDetailDestinationArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelingPayment(uiModel=");
            sb.append(activityDetailUiModel);
            sb.append(", args=");
            sb.append(activityDetailDestinationArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, cancelingPayment.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, cancelingPayment.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment(uiModel, args);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment cancelingPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailUiModel = cancelingPayment.uiModel;
            }
            if ((i & 2) != 0) {
                activityDetailDestinationArgs = cancelingPayment.args;
            }
            return cancelingPayment.copy(activityDetailUiModel, activityDetailDestinationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$RetryCancelingPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$RetryCancelingPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryCancelingPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel;

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryCancelingPayment(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
            super("RetryCancelingPayment", activityDetailUiModel.getToolbarTitle(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestinationArgs, "");
            this.uiModel = activityDetailUiModel;
            this.args = activityDetailDestinationArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryCancelingPayment(uiModel=");
            sb.append(activityDetailUiModel);
            sb.append(", args=");
            sb.append(activityDetailDestinationArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, retryCancelingPayment.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, retryCancelingPayment.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment(uiModel, args);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment retryCancelingPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailUiModel = retryCancelingPayment.uiModel;
            }
            if ((i & 2) != 0) {
                activityDetailDestinationArgs = retryCancelingPayment.args;
            }
            return retryCancelingPayment.copy(activityDetailUiModel, activityDetailDestinationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$CancelPaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState$CancelPaymentError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelPaymentError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel;

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelPaymentError(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
            super("CancelPaymentError", activityDetailUiModel.getToolbarTitle(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestinationArgs, "");
            this.uiModel = activityDetailUiModel;
            this.args = activityDetailDestinationArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelPaymentError(uiModel=");
            sb.append(activityDetailUiModel);
            sb.append(", args=");
            sb.append(activityDetailDestinationArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError cancelPaymentError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, cancelPaymentError.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, cancelPaymentError.args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError(uiModel, args);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError cancelPaymentError, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel activityDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailUiModel = cancelPaymentError.uiModel;
            }
            if ((i & 2) != 0) {
                activityDetailDestinationArgs = cancelPaymentError.args;
            }
            return cancelPaymentError.copy(activityDetailUiModel, activityDetailDestinationArgs);
        }
    }

    public /* synthetic */ ActivityDetailState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiString);
    }
}
