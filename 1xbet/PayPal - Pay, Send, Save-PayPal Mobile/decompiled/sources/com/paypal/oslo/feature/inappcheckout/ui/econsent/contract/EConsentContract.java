package com.paypal.oslo.feature.inappcheckout.ui.econsent.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract();

    private EConsentContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isButtonLoading", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;Z)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;Z)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "getData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData data;
        private final boolean isButtonLoading;

        public State(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, boolean z) {
            this.data = eConsentData;
            this.isButtonLoading = z;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eConsentData, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData getData() {
            return this.data;
        }

        public final boolean isButtonLoading() {
            return this.isButtonLoading;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity() {
            com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData = this.data;
            if (eConsentData != null) {
                return eConsentData.getBuyerInfoEntity();
            }
            return null;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData = this.data;
            boolean z = this.isButtonLoading;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(data=");
            sb.append(eConsentData);
            sb.append(", isButtonLoading=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData = this.data;
            return ((eConsentData == null ? 0 : eConsentData.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isButtonLoading);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, state.data) && this.isButtonLoading == state.isButtonLoading;
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State copy(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData data, boolean isButtonLoading) {
            return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State(data, isButtonLoading);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsButtonLoading() {
            return this.isButtonLoading;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State state, com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                eConsentData = state.data;
            }
            if ((i & 2) != 0) {
                z = state.isButtonLoading;
            }
            return state.copy(eConsentData, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "", "<init>", "()V", "Initialize", "OnAgreeAndContinue", "OnProfileClick", "OnLinkClick", "SetLoading", "TrackAnalyticsEvent", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnAgreeAndContinue;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnLinkClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnProfileClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$SetLoading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$TrackAnalyticsEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialize extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData entity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initialize(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentData, "");
                this.entity = eConsentData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData getEntity() {
                return this.entity;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData = this.entity;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(entity=");
                sb.append(eConsentData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.entity.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize copy(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize initialize, com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    eConsentData = initialize.entity;
                }
                return initialize.copy(eConsentData);
            }
        }

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnAgreeAndContinue;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnAgreeAndContinue extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnAgreeAndContinue INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnAgreeAndContinue();

            private OnAgreeAndContinue() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnProfileClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnProfileClick extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnProfileClick INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnProfileClick();

            private OnProfileClick() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnLinkClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "link", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$OnLinkClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "getLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnLinkClick extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLinkClick(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutLink, "");
                this.link = inAppCheckoutLink;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink getLink() {
                return this.link;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink = this.link;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLinkClick(link=");
                sb.append(inAppCheckoutLink);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.link.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick) && this.link == ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick) other).link;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick copy(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink link) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick(link);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink getLink() {
                return this.link;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick onLinkClick, com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    inAppCheckoutLink = onLinkClick.link;
                }
                return onLinkClick.copy(inAppCheckoutLink);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$SetLoading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "", "isButtonLoading", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$SetLoading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SetLoading extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event {
            public static final int $stable = 0;
            private final boolean isButtonLoading;

            public SetLoading(boolean z) {
                super(null);
                this.isButtonLoading = z;
            }

            public final boolean isButtonLoading() {
                return this.isButtonLoading;
            }

            public final java.lang.String toString() {
                boolean z = this.isButtonLoading;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SetLoading(isButtonLoading=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.isButtonLoading);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading) && this.isButtonLoading == ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading) other).isButtonLoading;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading copy(boolean isButtonLoading) {
                return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading(isButtonLoading);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsButtonLoading() {
                return this.isButtonLoading;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading setLoading, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = setLoading.isButtonLoading;
                }
                return setLoading.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$TrackAnalyticsEvent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "event", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event$TrackAnalyticsEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "getEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TrackAnalyticsEvent extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrackAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent eConsentAnalyticsEvent) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentAnalyticsEvent, "");
                this.event = eConsentAnalyticsEvent;
            }

            public final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent getEvent() {
                return this.event;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent eConsentAnalyticsEvent = this.event;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TrackAnalyticsEvent(event=");
                sb.append(eConsentAnalyticsEvent);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.event.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.event, ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent) other).event);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent copy(com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent event) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent(event);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent getEvent() {
                return this.event;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent trackAnalyticsEvent, com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent eConsentAnalyticsEvent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    eConsentAnalyticsEvent = trackAnalyticsEvent.event;
                }
                return trackAnalyticsEvent.copy(eConsentAnalyticsEvent);
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "", "<init>", "()V", "NavigateToProfile", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "NavigateToRyp", "NavigateBackWithResult", "NavigateToNativeInAppWebView", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToProfile;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToRyp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToProfile;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToProfile extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToProfile INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToProfile();

            private NavigateToProfile() {
                super(null);
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToError extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError();

            private NavigateToError() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToRyp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToRyp extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToRyp(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.response = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.response;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRyp(response=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.response.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp) other).response);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp(response);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp navigateToRyp, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToRyp.response;
                }
                return navigateToRyp.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBackWithResult extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateBackWithResult INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateBackWithResult();

            private NavigateBackWithResult() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect$NavigateToNativeInAppWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToNativeInAppWebView extends com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToNativeInAppWebView(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewData, "");
                this.data = nativeInAppWebViewData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNativeInAppWebView(data=");
                sb.append(nativeInAppWebViewData);
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView) other).data);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView copy(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView(data);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView copy$default(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView navigateToNativeInAppWebView, com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeInAppWebViewData = navigateToNativeInAppWebView.data;
                }
                return navigateToNativeInAppWebView.copy(nativeInAppWebViewData);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
