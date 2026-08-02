package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnLoad", "OnLoadSuccess", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, "OnActivateOffer", "OnActivateOfferSuccess", "OnActivateOfferError", "OnTermsClick", "OnClose", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOfferError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOfferSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnClose;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnTermsClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class OfferDetailsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OfferDetailsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "", "offerId", "touchpointId", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoad;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId", "getTouchpointId", "getPlatform"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoad extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String offerId;
        private final java.lang.String platform;
        private final java.lang.String touchpointId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoad(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("OnLoad", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.offerId = str;
            this.touchpointId = str2;
            this.platform = str3;
        }

        public /* synthetic */ OnLoad(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final java.lang.String getTouchpointId() {
            return this.touchpointId;
        }

        public final java.lang.String getPlatform() {
            return this.platform;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.offerId;
            java.lang.String str2 = this.touchpointId;
            java.lang.String str3 = this.platform;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoad(offerId=");
            sb.append(str);
            sb.append(", touchpointId=");
            sb.append(str2);
            sb.append(", platform=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.offerId.hashCode();
            java.lang.String str = this.touchpointId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.platform;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad onLoad = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, onLoad.offerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.touchpointId, onLoad.touchpointId) && kotlin.jvm.internal.Intrinsics.areEqual(this.platform, onLoad.platform);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad copy(java.lang.String offerId, java.lang.String touchpointId, java.lang.String platform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad(offerId, touchpointId, platform);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTouchpointId() {
            return this.touchpointId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad onLoad, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoad.offerId;
            }
            if ((i & 2) != 0) {
                str2 = onLoad.touchpointId;
            }
            if ((i & 4) != 0) {
                str3 = onLoad.platform;
            }
            return onLoad.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadSuccess(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
            super("OnLoadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
            this.data = offerDetailsUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadSuccess(data=");
            sb.append(offerDetailsUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess) other).data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess copy(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess onLoadSuccess, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offerDetailsUiData = onLoadSuccess.data;
            }
            return onLoadSuccess.copy(offerDetailsUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "message", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnLoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "getFlow", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadError extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadError(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.flow = flow;
            this.message = str;
            this.errorType = errorStateType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow getFlow() {
            return this.flow;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow = this.flow;
            java.lang.String str = this.message;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadError(flow=");
            sb.append(flow);
            sb.append(", message=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.flow.hashCode() * 31) + this.message.hashCode()) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flow, onLoadError.flow) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, onLoadError.message) && this.errorType == onLoadError.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError copy(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow, java.lang.String message, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError(flow, message, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow getFlow() {
            return this.flow;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError onLoadError, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                flow = onLoadError.flow;
            }
            if ((i & 2) != 0) {
                str = onLoadError.message;
            }
            if ((i & 4) != 0) {
                errorStateType = onLoadError.errorType;
            }
            return onLoadError.copy(flow, str, errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivateOffer extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer();

        public final int hashCode() {
            return 1482847203;
        }

        private OnActivateOffer() {
            super("OnActivateOffer", null);
        }

        public final java.lang.String toString() {
            return "OnActivateOffer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOfferSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOfferSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivateOfferSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnActivateOfferSuccess(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
            super("OnActivateOfferSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
            this.data = offerDetailsUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnActivateOfferSuccess(data=");
            sb.append(offerDetailsUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess) other).data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess copy(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess onActivateOfferSuccess, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offerDetailsUiData = onActivateOfferSuccess.data;
            }
            return onActivateOfferSuccess.copy(offerDetailsUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOfferError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "message", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnActivateOfferError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "getFlow", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivateOfferError extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnActivateOfferError(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super("OnActivateOfferError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.flow = flow;
            this.message = str;
            this.errorType = errorStateType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow getFlow() {
            return this.flow;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow = this.flow;
            java.lang.String str = this.message;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnActivateOfferError(flow=");
            sb.append(flow);
            sb.append(", message=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.flow.hashCode() * 31) + this.message.hashCode()) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError onActivateOfferError = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flow, onActivateOfferError.flow) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, onActivateOfferError.message) && this.errorType == onActivateOfferError.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError copy(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow, java.lang.String message, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError(flow, message, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow getFlow() {
            return this.flow;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError onActivateOfferError, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                flow = onActivateOfferError.flow;
            }
            if ((i & 2) != 0) {
                str = onActivateOfferError.message;
            }
            if ((i & 4) != 0) {
                errorStateType = onActivateOfferError.errorType;
            }
            return onActivateOfferError.copy(flow, str, errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnTermsClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "", "text", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnTermsClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "getTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTermsClick extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String tag;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTermsClick(java.lang.String str, java.lang.String str2) {
            super("OnTermsClick", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.text = str;
            this.tag = str2;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String getTag() {
            return this.tag;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.String str2 = this.tag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTermsClick(text=");
            sb.append(str);
            sb.append(", tag=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + this.tag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick onTermsClick = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, onTermsClick.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, onTermsClick.tag);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick copy(java.lang.String text, java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick(text, tag);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTag() {
            return this.tag;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick onTermsClick, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTermsClick.text;
            }
            if ((i & 2) != 0) {
                str2 = onTermsClick.tag;
            }
            return onTermsClick.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent$OnClose;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnClose extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose();

        public final int hashCode() {
            return 1945908914;
        }

        private OnClose() {
            super("OnClose", null);
        }

        public final java.lang.String toString() {
            return "OnClose";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OfferDetailsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
