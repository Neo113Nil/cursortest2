package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "InitializeUiModel", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Processing", "Error", "ReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$InitializeUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Processing;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CLIApprovalState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial();

        public final int hashCode() {
            return 220063660;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private CLIApprovalState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$InitializeUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$InitializeUiModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializeUiModel extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializeUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo) {
            super("InitializeUiModel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeUiModel(readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel initializeUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = initializeUiModel.readyInfo;
            }
            return initializeUiModel.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.uiModel = cLIApprovalUiModel;
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(uiModel=");
            sb.append(cLIApprovalUiModel);
            sb.append(", readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ready.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ready.readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready(uiModel, readyInfo);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cLIApprovalUiModel = ready.uiModel;
            }
            if ((i & 2) != 0) {
                readyInfo = ready.readyInfo;
            }
            return ready.copy(cLIApprovalUiModel, readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Processing;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Processing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", "getOperation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "getReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation operation;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel) {
            super("Processing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIOperation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalUiModel, "");
            this.operation = cLIOperation;
            this.readyInfo = readyInfo;
            this.uiModel = cLIApprovalUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation getOperation() {
            return this.operation;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation = this.operation;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo = this.readyInfo;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(operation=");
            sb.append(cLIOperation);
            sb.append(", readyInfo=");
            sb.append(readyInfo);
            sb.append(", uiModel=");
            sb.append(cLIApprovalUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.operation.hashCode() * 31) + this.readyInfo.hashCode()) * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing processing = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing) other;
            return this.operation == processing.operation && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, processing.readyInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, processing.uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation operation, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing(operation, readyInfo, uiModel);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation getOperation() {
            return this.operation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Processing processing, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cLIOperation = processing.operation;
            }
            if ((i & 2) != 0) {
                readyInfo = processing.readyInfo;
            }
            if ((i & 4) != 0) {
                cLIApprovalUiModel = processing.uiModel;
            }
            return processing.copy(cLIOperation, readyInfo, cLIApprovalUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", "getOperation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation operation;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.operation = cLIOperation;
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation getOperation() {
            return this.operation;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation = this.operation;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(operation=");
            sb.append(cLIOperation);
            sb.append(", readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation = this.operation;
            return ((cLIOperation == null ? 0 : cLIOperation.hashCode()) * 31) + this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error) other;
            return this.operation == error.operation && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, error.readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation operation, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error(operation, readyInfo);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation getOperation() {
            return this.operation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cLIOperation = error.operation;
            }
            if ((i & 2) != 0) {
                readyInfo = error.readyInfo;
            }
            return error.copy(cLIOperation, readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "expirationDate", "newCreditLimit", "monthlyPaymentAmount", "offerId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$ReadyInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCurrentCreditLimit", "getExpirationDate", "getNewCreditLimit", "getMonthlyPaymentAmount", "getOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyInfo {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit;
        private final java.lang.String expirationDate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit;
        private final java.lang.String offerId;

        public ReadyInfo(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.creditAccountId = str;
            this.currentCreditLimit = currencyAmount;
            this.expirationDate = str2;
            this.newCreditLimit = currencyAmount2;
            this.monthlyPaymentAmount = currencyAmount3;
            this.offerId = str3;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewCreditLimit() {
            return this.newCreditLimit;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.currentCreditLimit;
            java.lang.String str2 = this.expirationDate;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.newCreditLimit;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.monthlyPaymentAmount;
            java.lang.String str3 = this.offerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyInfo(creditAccountId=");
            sb.append(str);
            sb.append(", currentCreditLimit=");
            sb.append(currencyAmount);
            sb.append(", expirationDate=");
            sb.append(str2);
            sb.append(", newCreditLimit=");
            sb.append(currencyAmount2);
            sb.append(", monthlyPaymentAmount=");
            sb.append(currencyAmount3);
            sb.append(", offerId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.creditAccountId.hashCode() * 31) + this.currentCreditLimit.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.newCreditLimit.hashCode()) * 31) + this.monthlyPaymentAmount.hashCode()) * 31) + this.offerId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, readyInfo.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimit, readyInfo.currentCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, readyInfo.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.newCreditLimit, readyInfo.newCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.monthlyPaymentAmount, readyInfo.monthlyPaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, readyInfo.offerId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo copy(java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit, java.lang.String expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount, java.lang.String offerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthlyPaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo(creditAccountId, currentCreditLimit, expirationDate, newCreditLimit, monthlyPaymentAmount, offerId);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewCreditLimit() {
            return this.newCreditLimit;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.ReadyInfo readyInfo, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = readyInfo.creditAccountId;
            }
            if ((i & 2) != 0) {
                currencyAmount = readyInfo.currentCreditLimit;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = currencyAmount;
            if ((i & 4) != 0) {
                str2 = readyInfo.expirationDate;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                currencyAmount2 = readyInfo.newCreditLimit;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = currencyAmount2;
            if ((i & 16) != 0) {
                currencyAmount3 = readyInfo.monthlyPaymentAmount;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6 = currencyAmount3;
            if ((i & 32) != 0) {
                str3 = readyInfo.offerId;
            }
            return readyInfo.copy(str, currencyAmount4, str4, currencyAmount5, currencyAmount6, str3);
        }
    }

    public /* synthetic */ CLIApprovalState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
