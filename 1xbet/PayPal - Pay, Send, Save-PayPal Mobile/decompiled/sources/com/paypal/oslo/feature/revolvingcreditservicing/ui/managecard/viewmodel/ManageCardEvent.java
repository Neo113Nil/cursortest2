package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u001a\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u001a$%&'()*+,-./0123456789:;<="}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ActionItemClicked", "LockCardToggled", "OnStatementDeliveryViewDetailsLinkClicked", "OnStartPaperStatementsClicked", "OnStopPaperStatementsClicked", "OnUpdateStatementDeliverySuccess", "OnUpdateStatementDeliveryError", "OnRetryUpdateStatementDelivery", "OnCancelStatementDeliveryUpdate", "OnViewCreated", "OnUiModelInitialized", "ShowUserInfoBottomSheet", "CallCreditCardSupport", "CloseUserInfoBottomSheet", "NavigateBack", "OnToggleCardLockStatusSuccess", "OnToggleCardLockStatusFailure", "OnDeepLinkEntry", "OnDataLoaded", "OnDataLoadFailed", "OnRetryClicked", "OnViewCardDetailsClicked", "OnCardDetailsReceived", "OnErrorFetchingCardDetails", "OnCopyCardNumberClicked", "OnPushToWalletFinishSetupClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$ActionItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$CallCreditCardSupport;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$CloseUserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$LockCardToggled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCancelStatementDeliveryUpdate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCardDetailsReceived;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCopyCardNumberClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDeepLinkEntry;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnErrorFetchingCardDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnPushToWalletFinishSetupClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnRetryClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnRetryUpdateStatementDelivery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnStartPaperStatementsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnStatementDeliveryViewDetailsLinkClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnStopPaperStatementsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnToggleCardLockStatusFailure;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnToggleCardLockStatusSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUpdateStatementDeliveryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUpdateStatementDeliverySuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnViewCardDetailsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$ShowUserInfoBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ManageCardEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageCardEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$ActionItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "action", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$ActionItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "getAction", "", "getLogParams", "()Ljava/util/Map;", "logParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActionItemClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionItemClicked(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel) {
            super("ActionItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardActionUiModel, "");
            this.action = manageCardActionUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel getAction() {
            return this.action;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel = this.action;
            if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Benefits) {
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_tier", ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Benefits) manageCardActionUiModel).isWorldUser() ? "mastercard_world" : "mastercard_standard"));
            }
            return null;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionItemClicked(action=");
            sb.append(manageCardActionUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked) other).action);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked(action);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked actionItemClicked, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                manageCardActionUiModel = actionItemClicked.action;
            }
            return actionItemClicked.copy(manageCardActionUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$LockCardToggled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "targetLockState", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$LockCardToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "getTargetLockState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockCardToggled extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockCardToggled(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState) {
            super("LockCardToggled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLockState, "");
            this.targetLockState = cardLockState;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getTargetLockState() {
            return this.targetLockState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState = this.targetLockState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LockCardToggled(targetLockState=");
            sb.append(cardLockState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.targetLockState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled) && this.targetLockState == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled) other).targetLockState;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetLockState, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled(targetLockState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getTargetLockState() {
            return this.targetLockState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled lockCardToggled, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardLockState = lockCardToggled.targetLockState;
            }
            return lockCardToggled.copy(cardLockState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnStatementDeliveryViewDetailsLinkClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnStatementDeliveryViewDetailsLinkClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStatementDeliveryViewDetailsLinkClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStatementDeliveryViewDetailsLinkClicked();

        public final int hashCode() {
            return 204100562;
        }

        private OnStatementDeliveryViewDetailsLinkClicked() {
            super("OnStatementDeliveryViewDetailsLinkClicked", null);
        }

        public final java.lang.String toString() {
            return "OnStatementDeliveryViewDetailsLinkClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStatementDeliveryViewDetailsLinkClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnStartPaperStatementsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnStartPaperStatementsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStartPaperStatementsClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStartPaperStatementsClicked();

        public final int hashCode() {
            return 168397496;
        }

        private OnStartPaperStatementsClicked() {
            super("OnStartPaperStatementsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnStartPaperStatementsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStartPaperStatementsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnStopPaperStatementsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnStopPaperStatementsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStopPaperStatementsClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStopPaperStatementsClicked();

        public final int hashCode() {
            return 1507883002;
        }

        private OnStopPaperStatementsClicked() {
            super("OnStopPaperStatementsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnStopPaperStatementsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStopPaperStatementsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUpdateStatementDeliverySuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "", "enrolledInPaper", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUpdateStatementDeliverySuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnrolledInPaper"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateStatementDeliverySuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        private final boolean enrolledInPaper;

        public OnUpdateStatementDeliverySuccess(boolean z) {
            super("OnUpdateStatementDeliverySuccess", null);
            this.enrolledInPaper = z;
        }

        public final boolean getEnrolledInPaper() {
            return this.enrolledInPaper;
        }

        public final java.lang.String toString() {
            boolean z = this.enrolledInPaper;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateStatementDeliverySuccess(enrolledInPaper=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enrolledInPaper);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess) && this.enrolledInPaper == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess) other).enrolledInPaper;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess copy(boolean enrolledInPaper) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess(enrolledInPaper);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnrolledInPaper() {
            return this.enrolledInPaper;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess onUpdateStatementDeliverySuccess, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onUpdateStatementDeliverySuccess.enrolledInPaper;
            }
            return onUpdateStatementDeliverySuccess.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUpdateStatementDeliveryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "error", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUpdateStatementDeliveryError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateStatementDeliveryError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateStatementDeliveryError(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError) {
            super("OnUpdateStatementDeliveryError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDeliveryError, "");
            this.error = statementDeliveryError;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateStatementDeliveryError(error=");
            sb.append(statementDeliveryError);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError) other).error);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError onUpdateStatementDeliveryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDeliveryError = onUpdateStatementDeliveryError.error;
            }
            return onUpdateStatementDeliveryError.copy(statementDeliveryError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnRetryUpdateStatementDelivery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetryUpdateStatementDelivery extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryUpdateStatementDelivery INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryUpdateStatementDelivery();

        public final int hashCode() {
            return -770089069;
        }

        private OnRetryUpdateStatementDelivery() {
            super("OnRetryUpdateStatementDelivery", null);
        }

        public final java.lang.String toString() {
            return "OnRetryUpdateStatementDelivery";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryUpdateStatementDelivery)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCancelStatementDeliveryUpdate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelStatementDeliveryUpdate extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCancelStatementDeliveryUpdate INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCancelStatementDeliveryUpdate();

        public final int hashCode() {
            return 1705134801;
        }

        private OnCancelStatementDeliveryUpdate() {
            super("OnCancelStatementDeliveryUpdate", null);
        }

        public final java.lang.String toString() {
            return "OnCancelStatementDeliveryUpdate";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCancelStatementDeliveryUpdate)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "manageCardDetails", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "getManageCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            this.cpi = creditProductIdentifier;
            this.manageCardDetails = manageCardDetails;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetails() {
            return this.manageCardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails = this.manageCardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", manageCardDetails=");
            sb.append(manageCardDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cpi.hashCode() * 31) + this.manageCardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated) other;
            return this.cpi == onViewCreated.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.manageCardDetails, onViewCreated.manageCardDetails);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated(cpi, manageCardDetails);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetails() {
            return this.manageCardDetails;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onViewCreated.cpi;
            }
            if ((i & 2) != 0) {
                manageCardDetails = onViewCreated.manageCardDetails;
            }
            return onViewCreated.copy(creditProductIdentifier, manageCardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017Jb\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b.\u0010\u0017R\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b/\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;", "manageCardDetailUiModel", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "managementSections", "", "creditAccountId", "creditInstrumentId", "eSignConsentUrl", "pdfUrl", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnUiModelInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;", "getManageCardDetailUiModel", "Ljava/util/List;", "getManagementSections", "Ljava/lang/String;", "getCreditAccountId", "getCreditInstrumentId", "getESignConsentUrl", "getPdfUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUiModelInitialized extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final java.lang.String creditAccountId;
        private final java.lang.String creditInstrumentId;
        private final java.lang.String eSignConsentUrl;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> managementSections;
        private final java.lang.String pdfUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnUiModelInitialized(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("OnUiModelInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.cpi = creditProductIdentifier;
            this.manageCardDetailUiModel = manageCardDetailUiModel;
            this.managementSections = list;
            this.creditAccountId = str;
            this.creditInstrumentId = str2;
            this.eSignConsentUrl = str3;
            this.pdfUrl = str4;
        }

        public /* synthetic */ OnUiModelInitialized(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, manageCardDetailUiModel, list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, str3, str4);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel getManageCardDetailUiModel() {
            return this.manageCardDetailUiModel;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> getManagementSections() {
            return this.managementSections;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getCreditInstrumentId() {
            return this.creditInstrumentId;
        }

        public final java.lang.String getESignConsentUrl() {
            return this.eSignConsentUrl;
        }

        public final java.lang.String getPdfUrl() {
            return this.pdfUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel = this.manageCardDetailUiModel;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> list = this.managementSections;
            java.lang.String str = this.creditAccountId;
            java.lang.String str2 = this.creditInstrumentId;
            java.lang.String str3 = this.eSignConsentUrl;
            java.lang.String str4 = this.pdfUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUiModelInitialized(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", manageCardDetailUiModel=");
            sb.append(manageCardDetailUiModel);
            sb.append(", managementSections=");
            sb.append(list);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", creditInstrumentId=");
            sb.append(str2);
            sb.append(", eSignConsentUrl=");
            sb.append(str3);
            sb.append(", pdfUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cpi.hashCode();
            int hashCode2 = this.manageCardDetailUiModel.hashCode();
            int hashCode3 = this.managementSections.hashCode();
            java.lang.String str = this.creditAccountId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.creditInstrumentId;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            int hashCode6 = this.eSignConsentUrl.hashCode();
            java.lang.String str3 = this.pdfUrl;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized onUiModelInitialized = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized) other;
            return this.cpi == onUiModelInitialized.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.manageCardDetailUiModel, onUiModelInitialized.manageCardDetailUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.managementSections, onUiModelInitialized.managementSections) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onUiModelInitialized.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditInstrumentId, onUiModelInitialized.creditInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.eSignConsentUrl, onUiModelInitialized.eSignConsentUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.pdfUrl, onUiModelInitialized.pdfUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> managementSections, java.lang.String creditAccountId, java.lang.String creditInstrumentId, java.lang.String eSignConsentUrl, java.lang.String pdfUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managementSections, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eSignConsentUrl, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized(cpi, manageCardDetailUiModel, managementSections, creditAccountId, creditInstrumentId, eSignConsentUrl, pdfUrl);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getPdfUrl() {
            return this.pdfUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getESignConsentUrl() {
            return this.eSignConsentUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCreditInstrumentId() {
            return this.creditInstrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> component3() {
            return this.managementSections;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel getManageCardDetailUiModel() {
            return this.manageCardDetailUiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized onUiModelInitialized, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onUiModelInitialized.cpi;
            }
            if ((i & 2) != 0) {
                manageCardDetailUiModel = onUiModelInitialized.manageCardDetailUiModel;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel2 = manageCardDetailUiModel;
            if ((i & 4) != 0) {
                list = onUiModelInitialized.managementSections;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                str = onUiModelInitialized.creditAccountId;
            }
            java.lang.String str5 = str;
            if ((i & 16) != 0) {
                str2 = onUiModelInitialized.creditInstrumentId;
            }
            java.lang.String str6 = str2;
            if ((i & 32) != 0) {
                str3 = onUiModelInitialized.eSignConsentUrl;
            }
            java.lang.String str7 = str3;
            if ((i & 64) != 0) {
                str4 = onUiModelInitialized.pdfUrl;
            }
            return onUiModelInitialized.copy(creditProductIdentifier, manageCardDetailUiModel2, list2, str5, str6, str7, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$ShowUserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowUserInfoBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ShowUserInfoBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ShowUserInfoBottomSheet();

        public final int hashCode() {
            return -1429795844;
        }

        private ShowUserInfoBottomSheet() {
            super("ShowUserInfoBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowUserInfoBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ShowUserInfoBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$CallCreditCardSupport;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$CallCreditCardSupport;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallCreditCardSupport extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallCreditCardSupport(java.lang.String str) {
            super("CallCreditCardSupport", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CallCreditCardSupport(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport callCreditCardSupport, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = callCreditCardSupport.phoneNumber;
            }
            return callCreditCardSupport.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$CloseUserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseUserInfoBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CloseUserInfoBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CloseUserInfoBottomSheet();

        public final int hashCode() {
            return -1059155291;
        }

        private CloseUserInfoBottomSheet() {
            super("CloseUserInfoBottomSheet", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "CloseUserInfoBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CloseUserInfoBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.NavigateBack();

        public final int hashCode() {
            return -698523750;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnToggleCardLockStatusSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "newLockState", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnToggleCardLockStatusSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "getNewLockState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToggleCardLockStatusSuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState newLockState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnToggleCardLockStatusSuccess(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState) {
            super("OnToggleCardLockStatusSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLockState, "");
            this.newLockState = cardLockState;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getNewLockState() {
            return this.newLockState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState = this.newLockState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnToggleCardLockStatusSuccess(newLockState=");
            sb.append(cardLockState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newLockState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess) && this.newLockState == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess) other).newLockState;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState newLockState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLockState, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess(newLockState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getNewLockState() {
            return this.newLockState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess onToggleCardLockStatusSuccess, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardLockState = onToggleCardLockStatusSuccess.newLockState;
            }
            return onToggleCardLockStatusSuccess.copy(cardLockState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnToggleCardLockStatusFailure;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "targetLockState", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnToggleCardLockStatusFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "getTargetLockState", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToggleCardLockStatusFailure extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnToggleCardLockStatusFailure(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState, java.lang.String str) {
            super("OnToggleCardLockStatusFailure", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLockState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.targetLockState = cardLockState;
            this.errorMessage = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getTargetLockState() {
            return this.targetLockState;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState = this.targetLockState;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnToggleCardLockStatusFailure(targetLockState=");
            sb.append(cardLockState);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.targetLockState.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure onToggleCardLockStatusFailure = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure) other;
            return this.targetLockState == onToggleCardLockStatusFailure.targetLockState && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, onToggleCardLockStatusFailure.errorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetLockState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure(targetLockState, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getTargetLockState() {
            return this.targetLockState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure onToggleCardLockStatusFailure, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardLockState = onToggleCardLockStatusFailure.targetLockState;
            }
            if ((i & 2) != 0) {
                str = onToggleCardLockStatusFailure.errorMessage;
            }
            return onToggleCardLockStatusFailure.copy(cardLockState, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDeepLinkEntry;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDeepLinkEntry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDeepLinkEntry extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDeepLinkEntry(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("OnDeepLinkEntry", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.cpi = creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDeepLinkEntry(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry) && this.cpi == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry) other).cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry(cpi);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry onDeepLinkEntry, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onDeepLinkEntry.cpi;
            }
            return onDeepLinkEntry.copy(creditProductIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "manageCardDetails", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "getManageCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            this.cpi = creditProductIdentifier;
            this.manageCardDetails = manageCardDetails;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetails() {
            return this.manageCardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails = this.manageCardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", manageCardDetails=");
            sb.append(manageCardDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cpi.hashCode() * 31) + this.manageCardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded) other;
            return this.cpi == onDataLoaded.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.manageCardDetails, onDataLoaded.manageCardDetails);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded(cpi, manageCardDetails);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetails() {
            return this.manageCardDetails;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded onDataLoaded, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onDataLoaded.cpi;
            }
            if ((i & 2) != 0) {
                manageCardDetails = onDataLoaded.manageCardDetails;
            }
            return onDataLoaded.copy(creditProductIdentifier, manageCardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoadFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoadFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoadFailed();

        public final int hashCode() {
            return -2018260882;
        }

        private OnDataLoadFailed() {
            super("OnDataLoadFailed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnDataLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnRetryClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnRetryClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetryClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRetryClicked(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("OnRetryClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.cpi = creditProductIdentifier;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRetryClicked(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked) && this.cpi == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked) other).cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked(cpi);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked onRetryClicked, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onRetryClicked.cpi;
            }
            return onRetryClicked.copy(creditProductIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnViewCardDetailsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCardDetailsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCardDetailsClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCardDetailsClicked();

        public final int hashCode() {
            return -2038283877;
        }

        private OnViewCardDetailsClicked() {
            super("OnViewCardDetailsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnViewCardDetailsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCardDetailsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCardDetailsReceived;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "cardDetails", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCardDetailsReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "getCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCardDetailsReceived extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCardDetailsReceived(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel) {
            super("OnCardDetailsReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailsUiModel, "");
            this.cardDetails = cardDetailsUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel getCardDetails() {
            return this.cardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel = this.cardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCardDetailsReceived(cardDetails=");
            sb.append(cardDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived) other).cardDetails);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived(cardDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel getCardDetails() {
            return this.cardDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived onCardDetailsReceived, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardDetailsUiModel = onCardDetailsReceived.cardDetails;
            }
            return onCardDetailsReceived.copy(cardDetailsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnErrorFetchingCardDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnErrorFetchingCardDetails extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnErrorFetchingCardDetails INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnErrorFetchingCardDetails();

        public final int hashCode() {
            return 753373443;
        }

        private OnErrorFetchingCardDetails() {
            super("OnErrorFetchingCardDetails", null);
        }

        public final java.lang.String toString() {
            return "OnErrorFetchingCardDetails";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnErrorFetchingCardDetails)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCopyCardNumberClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnCopyCardNumberClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCopyCardNumberClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        private final java.lang.String cardNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCopyCardNumberClicked(java.lang.String str) {
            super("OnCopyCardNumberClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardNumber = str;
        }

        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCopyCardNumberClicked(cardNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked) other).cardNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked copy(java.lang.String cardNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked(cardNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked onCopyCardNumberClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCopyCardNumberClicked.cardNumber;
            }
            return onCopyCardNumberClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent$OnPushToWalletFinishSetupClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPushToWalletFinishSetupClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnPushToWalletFinishSetupClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnPushToWalletFinishSetupClicked();

        public final int hashCode() {
            return 1339207084;
        }

        private OnPushToWalletFinishSetupClicked() {
            super("OnPushToWalletFinishSetupClicked", null);
        }

        public final java.lang.String toString() {
            return "OnPushToWalletFinishSetupClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnPushToWalletFinishSetupClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ManageCardEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
