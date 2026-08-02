package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u001e\u001f !\"B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0011\u0010\u0019\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010\u0082\u0001\u0004#$%&"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "getHighSpeedVideoFpsRanges", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getHeaderText", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "headerText", "", "isEditingEnabled", "()Z", "isSettingPin", "getPin", "pin", "getPinConfirmation", "pinConfirmation", "getPinErrorMessage", "pinErrorMessage", "getConfirmationErrorMessage", "confirmationErrorMessage", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "SettingPin", "ErrorSettingPin", "ReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ErrorSettingPin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$SettingPin;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CreatePinState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CreatePinState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Initial();

        public final int hashCode() {
            return -1396929131;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(readyInfo=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = ready.readyInfo;
            }
            return ready.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$SettingPin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$SettingPin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SettingPin extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingPin(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo) {
            super("SettingPin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingPin(readyInfo=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin settingPin, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = settingPin.readyInfo;
            }
            return settingPin.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ErrorSettingPin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ErrorSettingPin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorSettingPin extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorSettingPin(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo) {
            super("ErrorSettingPin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorSettingPin(readyInfo=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin errorSettingPin, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = errorSettingPin.readyInfo;
            }
            return errorSettingPin.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "", "", "isChangingPin", "", "pin", "confirmation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "pinErrorMessage", "confirmationErrorMessage", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$ReadyInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getPin", "getConfirmation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getPinErrorMessage", "getConfirmationErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyInfo {
        public static final int $stable = 0;
        private final java.lang.String confirmation;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString confirmationErrorMessage;
        private final boolean isChangingPin;
        private final java.lang.String pin;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString pinErrorMessage;

        public ReadyInfo(boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.isChangingPin = z;
            this.pin = str;
            this.confirmation = str2;
            this.pinErrorMessage = uiString;
            this.confirmationErrorMessage = uiString2;
        }

        public /* synthetic */ ReadyInfo(boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : uiString, (i & 16) != 0 ? null : uiString2);
        }

        public final boolean isChangingPin() {
            return this.isChangingPin;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String getConfirmation() {
            return this.confirmation;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPinErrorMessage() {
            return this.pinErrorMessage;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getConfirmationErrorMessage() {
            return this.confirmationErrorMessage;
        }

        public final java.lang.String toString() {
            boolean z = this.isChangingPin;
            java.lang.String str = this.pin;
            java.lang.String str2 = this.confirmation;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.pinErrorMessage;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.confirmationErrorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyInfo(isChangingPin=");
            sb.append(z);
            sb.append(", pin=");
            sb.append(str);
            sb.append(", confirmation=");
            sb.append(str2);
            sb.append(", pinErrorMessage=");
            sb.append(uiString);
            sb.append(", confirmationErrorMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isChangingPin);
            int hashCode2 = this.pin.hashCode();
            int hashCode3 = this.confirmation.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.pinErrorMessage;
            int hashCode4 = uiString == null ? 0 : uiString.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.confirmationErrorMessage;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (uiString2 != null ? uiString2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo) other;
            return this.isChangingPin == readyInfo.isChangingPin && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, readyInfo.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmation, readyInfo.confirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.pinErrorMessage, readyInfo.pinErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationErrorMessage, readyInfo.confirmationErrorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo copy(boolean isChangingPin, java.lang.String pin, java.lang.String confirmation, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString pinErrorMessage, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString confirmationErrorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmation, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo(isChangingPin, pin, confirmation, pinErrorMessage, confirmationErrorMessage);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getConfirmationErrorMessage() {
            return this.confirmationErrorMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPinErrorMessage() {
            return this.pinErrorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConfirmation() {
            return this.confirmation;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChangingPin() {
            return this.isChangingPin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo readyInfo, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = readyInfo.isChangingPin;
            }
            if ((i & 2) != 0) {
                str = readyInfo.pin;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                str2 = readyInfo.confirmation;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                uiString = readyInfo.pinErrorMessage;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = uiString;
            if ((i & 16) != 0) {
                uiString2 = readyInfo.confirmationErrorMessage;
            }
            return readyInfo.copy(z, str3, str4, uiString3, uiString2);
        }
    }

    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo getHighSpeedVideoFpsRanges() {
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Initial) {
            return null;
        }
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) this).getReadyInfo();
        }
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin) this).getReadyInfo();
        }
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ErrorSettingPin) this).getReadyInfo();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getHeaderText() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        java.lang.Boolean valueOf = highSpeedVideoFpsRanges != null ? java.lang.Boolean.valueOf(highSpeedVideoFpsRanges.isChangingPin()) : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.TRUE)) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_header_change_pin, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.FALSE)) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_header_create_pin, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (valueOf != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
    }

    public final boolean isEditingEnabled() {
        return this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready;
    }

    public final boolean isSettingPin() {
        return this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin;
    }

    public final java.lang.String getPin() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        java.lang.String pin = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getPin() : null;
        return pin == null ? "" : pin;
    }

    public final java.lang.String getPinConfirmation() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.ReadyInfo highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        java.lang.String confirmation = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getConfirmation() : null;
        return confirmation == null ? "" : confirmation;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPinErrorMessage() {
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) this).getReadyInfo().getPinErrorMessage();
        }
        return null;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getConfirmationErrorMessage() {
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.Ready) this).getReadyInfo().getConfirmationErrorMessage();
        }
        return null;
    }

    public /* synthetic */ CreatePinState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
