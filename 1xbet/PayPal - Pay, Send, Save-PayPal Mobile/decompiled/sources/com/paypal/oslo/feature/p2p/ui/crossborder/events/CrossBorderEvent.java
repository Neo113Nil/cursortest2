package com.paypal.oslo.feature.p2p.ui.crossborder.events;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "SendAmountChanged", "ReceiveAmountChanged", "SendAmountFormatted", "ReceiveAmountFormatted", "FxQuoteLoaded", "FxQuoteFailed", "UpdateAmountAndIntent", "UpdateAmountAndIntentCompleted", "UpdateAmountAndIntentFailed", "ErrorDismissed", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ErrorDismissed;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$FxQuoteFailed;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$FxQuoteLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ReceiveAmountChanged;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ReceiveAmountFormatted;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$SendAmountChanged;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$SendAmountFormatted;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntent;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntentCompleted;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntentFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CrossBorderEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CrossBorderEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jp\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b\u000b\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b/\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b0\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "initialAmount", "sendCurrencyCode", "receiveCurrencyCode", "receiveCurrencyId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "", "isEditMode", "editModeIntent", "initialReceiveAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$Initialize;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId", "getInitialAmount", "getSendCurrencyCode", "getReceiveCurrencyCode", "getReceiveCurrencyId", "Ljava/util/List;", "getSupportedIntents", "Z", "getEditModeIntent", "getInitialReceiveAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 8;
        private final java.lang.String editModeIntent;
        private final java.lang.String initialAmount;
        private final java.lang.String initialReceiveAmount;
        private final boolean isEditMode;
        private final java.lang.String receiveCurrencyCode;
        private final java.lang.String receiveCurrencyId;
        private final java.lang.String sendCurrencyCode;
        private final java.util.List<java.lang.String> supportedIntents;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, boolean z, java.lang.String str6, java.lang.String str7) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            this.transferAttemptId = str;
            this.initialAmount = str2;
            this.sendCurrencyCode = str3;
            this.receiveCurrencyCode = str4;
            this.receiveCurrencyId = str5;
            this.supportedIntents = list;
            this.isEditMode = z;
            this.editModeIntent = str6;
            this.initialReceiveAmount = str7;
        }

        public /* synthetic */ Initialize(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, boolean z, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, list, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7);
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String getInitialAmount() {
            return this.initialAmount;
        }

        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        public final java.lang.String getReceiveCurrencyId() {
            return this.receiveCurrencyId;
        }

        public final java.util.List<java.lang.String> getSupportedIntents() {
            return this.supportedIntents;
        }

        public final boolean isEditMode() {
            return this.isEditMode;
        }

        public final java.lang.String getEditModeIntent() {
            return this.editModeIntent;
        }

        public final java.lang.String getInitialReceiveAmount() {
            return this.initialReceiveAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.String str2 = this.initialAmount;
            java.lang.String str3 = this.sendCurrencyCode;
            java.lang.String str4 = this.receiveCurrencyCode;
            java.lang.String str5 = this.receiveCurrencyId;
            java.util.List<java.lang.String> list = this.supportedIntents;
            boolean z = this.isEditMode;
            java.lang.String str6 = this.editModeIntent;
            java.lang.String str7 = this.initialReceiveAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(transferAttemptId=");
            sb.append(str);
            sb.append(", initialAmount=");
            sb.append(str2);
            sb.append(", sendCurrencyCode=");
            sb.append(str3);
            sb.append(", receiveCurrencyCode=");
            sb.append(str4);
            sb.append(", receiveCurrencyId=");
            sb.append(str5);
            sb.append(", supportedIntents=");
            sb.append(list);
            sb.append(", isEditMode=");
            sb.append(z);
            sb.append(", editModeIntent=");
            sb.append(str6);
            sb.append(", initialReceiveAmount=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((this.transferAttemptId.hashCode() * 31) + this.initialAmount.hashCode()) * 31) + this.sendCurrencyCode.hashCode()) * 31) + this.receiveCurrencyCode.hashCode()) * 31) + this.receiveCurrencyId.hashCode()) * 31) + this.supportedIntents.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isEditMode)) * 31) + this.editModeIntent.hashCode()) * 31) + this.initialReceiveAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize initialize = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, initialize.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialAmount, initialize.initialAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendCurrencyCode, initialize.sendCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCode, initialize.receiveCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyId, initialize.receiveCurrencyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, initialize.supportedIntents) && this.isEditMode == initialize.isEditMode && kotlin.jvm.internal.Intrinsics.areEqual(this.editModeIntent, initialize.editModeIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialReceiveAmount, initialize.initialReceiveAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize copy(java.lang.String transferAttemptId, java.lang.String initialAmount, java.lang.String sendCurrencyCode, java.lang.String receiveCurrencyCode, java.lang.String receiveCurrencyId, java.util.List<java.lang.String> supportedIntents, boolean isEditMode, java.lang.String editModeIntent, java.lang.String initialReceiveAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editModeIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialReceiveAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize(transferAttemptId, initialAmount, sendCurrencyCode, receiveCurrencyCode, receiveCurrencyId, supportedIntents, isEditMode, editModeIntent, initialReceiveAmount);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getInitialReceiveAmount() {
            return this.initialReceiveAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getEditModeIntent() {
            return this.editModeIntent;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsEditMode() {
            return this.isEditMode;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.supportedIntents;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getReceiveCurrencyId() {
            return this.receiveCurrencyId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getInitialAmount() {
            return this.initialAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$SendAmountChanged;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "", "rawAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$SendAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRawAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendAmountChanged extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        private final java.lang.String rawAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendAmountChanged(java.lang.String str) {
            super("SendAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawAmount = str;
        }

        public final java.lang.String getRawAmount() {
            return this.rawAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.rawAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SendAmountChanged(rawAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawAmount, ((com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged) other).rawAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged copy(java.lang.String rawAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged(rawAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRawAmount() {
            return this.rawAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged sendAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sendAmountChanged.rawAmount;
            }
            return sendAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ReceiveAmountChanged;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "", "rawAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ReceiveAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRawAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiveAmountChanged extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        private final java.lang.String rawAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveAmountChanged(java.lang.String str) {
            super("ReceiveAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawAmount = str;
        }

        public final java.lang.String getRawAmount() {
            return this.rawAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.rawAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiveAmountChanged(rawAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawAmount, ((com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged) other).rawAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged copy(java.lang.String rawAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged(rawAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRawAmount() {
            return this.rawAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged receiveAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = receiveAmountChanged.rawAmount;
            }
            return receiveAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$SendAmountFormatted;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "", "formattedAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "money", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$SendAmountFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendAmountFormatted extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendAmountFormatted(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
            super("SendAmountFormatted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
            this.formattedAmount = str;
            this.money = moneyAmount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.money;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SendAmountFormatted(formattedAmount=");
            sb.append(str);
            sb.append(", money=");
            sb.append(moneyAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formattedAmount.hashCode() * 31) + this.money.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted sendAmountFormatted = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, sendAmountFormatted.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.money, sendAmountFormatted.money);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted copy(java.lang.String formattedAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted(formattedAmount, money);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted sendAmountFormatted, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sendAmountFormatted.formattedAmount;
            }
            if ((i & 2) != 0) {
                moneyAmount = sendAmountFormatted.money;
            }
            return sendAmountFormatted.copy(str, moneyAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ReceiveAmountFormatted;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "", "formattedAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "money", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ReceiveAmountFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiveAmountFormatted extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveAmountFormatted(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
            super("ReceiveAmountFormatted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
            this.formattedAmount = str;
            this.money = moneyAmount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.money;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiveAmountFormatted(formattedAmount=");
            sb.append(str);
            sb.append(", money=");
            sb.append(moneyAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formattedAmount.hashCode() * 31) + this.money.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted receiveAmountFormatted = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, receiveAmountFormatted.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.money, receiveAmountFormatted.money);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted copy(java.lang.String formattedAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted(formattedAmount, money);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted receiveAmountFormatted, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = receiveAmountFormatted.formattedAmount;
            }
            if ((i & 2) != 0) {
                moneyAmount = receiveAmountFormatted.money;
            }
            return receiveAmountFormatted.copy(str, moneyAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$FxQuoteLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "fxQuote", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "sendMoney", "receiveMoney", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component3", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$FxQuoteLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getFxQuote", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getSendMoney", "getReceiveMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FxQuoteLoaded extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FxQuoteLoaded(com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2) {
            super("FxQuoteLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuote, "");
            this.fxQuote = fxQuote;
            this.sendMoney = moneyAmount;
            this.receiveMoney = moneyAmount2;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
            return this.sendMoney;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
            return this.receiveMoney;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FxQuoteLoaded(fxQuote=");
            sb.append(fxQuote);
            sb.append(", sendMoney=");
            sb.append(moneyAmount);
            sb.append(", receiveMoney=");
            sb.append(moneyAmount2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fxQuote.hashCode();
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
            int hashCode2 = moneyAmount == null ? 0 : moneyAmount.hashCode();
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
            return (((hashCode * 31) + hashCode2) * 31) + (moneyAmount2 != null ? moneyAmount2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded fxQuoteLoaded = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, fxQuoteLoaded.fxQuote) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendMoney, fxQuoteLoaded.sendMoney) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveMoney, fxQuoteLoaded.receiveMoney);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded copy(com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuote, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded(fxQuote, sendMoney, receiveMoney);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
            return this.receiveMoney;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
            return this.sendMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded fxQuoteLoaded, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fxQuote = fxQuoteLoaded.fxQuote;
            }
            if ((i & 2) != 0) {
                moneyAmount = fxQuoteLoaded.sendMoney;
            }
            if ((i & 4) != 0) {
                moneyAmount2 = fxQuoteLoaded.receiveMoney;
            }
            return fxQuoteLoaded.copy(fxQuote, moneyAmount, moneyAmount2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$FxQuoteFailed;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FxQuoteFailed extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed();

        public final int hashCode() {
            return 98006513;
        }

        private FxQuoteFailed() {
            super("FxQuoteFailed", null);
        }

        public final java.lang.String toString() {
            return "FxQuoteFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntent;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "", "intent", "", "useSendCurrency", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntent;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent", "Z", "getUseSendCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntent extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        private final java.lang.String intent;
        private final boolean useSendCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAmountAndIntent(java.lang.String str, boolean z) {
            super("UpdateAmountAndIntent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.intent = str;
            this.useSendCurrency = z;
        }

        public /* synthetic */ UpdateAmountAndIntent(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final boolean getUseSendCurrency() {
            return this.useSendCurrency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.intent;
            boolean z = this.useSendCurrency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAmountAndIntent(intent=");
            sb.append(str);
            sb.append(", useSendCurrency=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.intent.hashCode() * 31) + java.lang.Boolean.hashCode(this.useSendCurrency);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent updateAmountAndIntent = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intent, updateAmountAndIntent.intent) && this.useSendCurrency == updateAmountAndIntent.useSendCurrency;
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent copy(java.lang.String intent, boolean useSendCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent(intent, useSendCurrency);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseSendCurrency() {
            return this.useSendCurrency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent updateAmountAndIntent, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateAmountAndIntent.intent;
            }
            if ((i & 2) != 0) {
                z = updateAmountAndIntent.useSendCurrency;
            }
            return updateAmountAndIntent.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntentCompleted;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntentCompleted extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentCompleted INSTANCE = new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentCompleted();

        public final int hashCode() {
            return -692577905;
        }

        private UpdateAmountAndIntentCompleted() {
            super("UpdateAmountAndIntentCompleted", null);
        }

        public final java.lang.String toString() {
            return "UpdateAmountAndIntentCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$UpdateAmountAndIntentFailed;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntentFailed extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentFailed();

        public final int hashCode() {
            return -1792026759;
        }

        private UpdateAmountAndIntentFailed() {
            super("UpdateAmountAndIntentFailed", null);
        }

        public final java.lang.String toString() {
            return "UpdateAmountAndIntentFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent$ErrorDismissed;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorDismissed extends com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ErrorDismissed INSTANCE = new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ErrorDismissed();

        public final int hashCode() {
            return -852253577;
        }

        private ErrorDismissed() {
            super("ErrorDismissed", null);
        }

        public final java.lang.String toString() {
            return "ErrorDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ErrorDismissed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CrossBorderEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
