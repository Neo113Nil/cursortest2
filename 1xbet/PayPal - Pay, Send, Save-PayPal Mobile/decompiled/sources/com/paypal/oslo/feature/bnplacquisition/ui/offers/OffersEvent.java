package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadDomainData", "Success", "Continue", "UpdateReviewTermsSuccess", "ClosePressed", "ConfirmExitPressed", "OfferSelected", "EmoneyInfoPressed", "ApiError", "ApplicationDeclined", "ErrorBackPressed", "DeclineClosePressed", "CreateCreditSuccess", "SwitchToSuccess", "FetchRepaymentsSuccess", "NavigateToAdditionalInfo", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ApiError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$CreateCreditSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$EmoneyInfoPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$FetchRepaymentsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$LoadDomainData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$NavigateToAdditionalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$OfferSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$UpdateReviewTermsSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class OffersEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OffersEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$LoadDomainData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "availableOffersSuccessCreditApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$LoadDomainData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "getAvailableOffersSuccessCreditApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadDomainData extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOffersSuccessCreditApplication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadDomainData(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication) {
            super("LoadDomainData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOfferDetailsSuccessCreditApplication, "");
            this.availableOffersSuccessCreditApplication = availableOfferDetailsSuccessCreditApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getAvailableOffersSuccessCreditApplication() {
            return this.availableOffersSuccessCreditApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication = this.availableOffersSuccessCreditApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadDomainData(availableOffersSuccessCreditApplication=");
            sb.append(availableOfferDetailsSuccessCreditApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.availableOffersSuccessCreditApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableOffersSuccessCreditApplication, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData) other).availableOffersSuccessCreditApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData copy(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOffersSuccessCreditApplication) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOffersSuccessCreditApplication, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData(availableOffersSuccessCreditApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getAvailableOffersSuccessCreditApplication() {
            return this.availableOffersSuccessCreditApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData loadDomainData, com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableOfferDetailsSuccessCreditApplication = loadDomainData.availableOffersSuccessCreditApplication;
            }
            return loadDomainData.copy(availableOfferDetailsSuccessCreditApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersUiModel, "");
            this.uiModel = offersUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(offersUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success success, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offersUiModel = success.uiModel;
            }
            return success.copy(offersUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Continue extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed();

            public final int hashCode() {
                return 564502045;
            }

            private Pressed() {
                super("ContinuePressed", null);
            }

            public final java.lang.String toString() {
                return "Pressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Continue(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItem;", "selectedOffer", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItem;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItem;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItem;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Valid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OfferItem;", "getSelectedOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem selectedOffer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Valid(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem) {
                super("ContinueValid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerItem, "");
                this.selectedOffer = offerItem;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem getSelectedOffer() {
                return this.selectedOffer;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem = this.selectedOffer;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid(selectedOffer=");
                sb.append(offerItem);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.selectedOffer.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOffer, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid) other).selectedOffer);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid copy(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem selectedOffer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOffer, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid(selectedOffer);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem getSelectedOffer() {
                return this.selectedOffer;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid valid, com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    offerItem = valid.selectedOffer;
                }
                return valid.copy(offerItem);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Invalid INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Invalid();

            public final int hashCode() {
                return -1452416014;
            }

            private Invalid() {
                super("ContinueInvalid", null);
            }

            public final java.lang.String toString() {
                return "Invalid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Invalid)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Continue(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$UpdateReviewTermsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "reviewTermsSuccess", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$UpdateReviewTermsSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "getReviewTermsSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateReviewTermsSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateReviewTermsSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess) {
            super("UpdateReviewTermsSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsSuccess, "");
            this.reviewTermsSuccess = reviewTermsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getReviewTermsSuccess() {
            return this.reviewTermsSuccess;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess = this.reviewTermsSuccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateReviewTermsSuccess(reviewTermsSuccess=");
            sb.append(reviewTermsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reviewTermsSuccess.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.reviewTermsSuccess, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess) other).reviewTermsSuccess);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsSuccess, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess(reviewTermsSuccess);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getReviewTermsSuccess() {
            return this.reviewTermsSuccess;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess updateReviewTermsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsSuccess = updateReviewTermsSuccess.reviewTermsSuccess;
            }
            return updateReviewTermsSuccess.copy(reviewTermsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed();

        public final int hashCode() {
            return -1809943444;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmExitPressed extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ConfirmExitPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ConfirmExitPressed();

        public final int hashCode() {
            return -755705306;
        }

        private ConfirmExitPressed() {
            super("ConfirmExitPressed", null);
        }

        public final java.lang.String toString() {
            return "ConfirmExitPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ConfirmExitPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$OfferSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "", "offerId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$OfferSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OfferSelected extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        private final java.lang.String offerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferSelected(java.lang.String str) {
            super("OfferSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.offerId = str;
        }

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.offerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferSelected(offerId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.offerId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected) other).offerId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected copy(java.lang.String offerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected(offerId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected offerSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = offerSelected.offerId;
            }
            return offerSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$EmoneyInfoPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmoneyInfoPressed extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.EmoneyInfoPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.EmoneyInfoPressed();

        public final int hashCode() {
            return -1412047625;
        }

        private EmoneyInfoPressed() {
            super("EmoneyInfoPressed", null);
        }

        public final java.lang.String toString() {
            return "EmoneyInfoPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.EmoneyInfoPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ApiError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ApiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiError extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("ApiError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiError(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError apiError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = apiError.errorContent;
            }
            return apiError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ApplicationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplicationDeclined extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationDeclined(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("ApplicationDeclined", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationDeclined(declineContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.declineContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined applicationDeclined, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = applicationDeclined.declineContent;
            }
            return applicationDeclined.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ErrorBackPressed();

        public final int hashCode() {
            return 26587765;
        }

        private ErrorBackPressed() {
            super("ErrorBackPressed", null);
        }

        public final java.lang.String toString() {
            return "ErrorBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeclineClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed();

        public final int hashCode() {
            return 836013438;
        }

        private DeclineClosePressed() {
            super("DeclineClosePressed", null);
        }

        public final java.lang.String toString() {
            return "DeclineClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$CreateCreditSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$CreateCreditSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateCreditSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateCreditSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess) {
            super("CreateCreditSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationSuccess, "");
            this.data = createCreditApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCreditSuccess(data=");
            sb.append(createCreditApplicationSuccess);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess createCreditSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createCreditApplicationSuccess = createCreditSuccess.data;
            }
            return createCreditSuccess.copy(createCreditApplicationSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$SwitchToSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SwitchToSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchToSuccess(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel) {
            super("SwitchToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersUiModel, "");
            this.uiModel = offersUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchToSuccess(uiModel=");
            sb.append(offersUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess copy(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess switchToSuccess, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offersUiModel = switchToSuccess.uiModel;
            }
            return switchToSuccess.copy(offersUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$FetchRepaymentsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$FetchRepaymentsSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchRepaymentsSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchRepaymentsSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess) {
            super("FetchRepaymentsSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsSuccess, "");
            this.data = repaymentsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchRepaymentsSuccess(data=");
            sb.append(repaymentsSuccess);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess fetchRepaymentsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsSuccess = fetchRepaymentsSuccess.data;
            }
            return fetchRepaymentsSuccess.copy(repaymentsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$NavigateToAdditionalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "", "formattedAmount", "selectedOfferId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent$NavigateToAdditionalInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "getSelectedOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAdditionalInfo extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final java.lang.String selectedOfferId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAdditionalInfo(java.lang.String str, java.lang.String str2) {
            super("NavigateToAdditionalInfo", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.formattedAmount = str;
            this.selectedOfferId = str2;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String getSelectedOfferId() {
            return this.selectedOfferId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.String str2 = this.selectedOfferId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAdditionalInfo(formattedAmount=");
            sb.append(str);
            sb.append(", selectedOfferId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formattedAmount.hashCode() * 31) + this.selectedOfferId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo navigateToAdditionalInfo = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, navigateToAdditionalInfo.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOfferId, navigateToAdditionalInfo.selectedOfferId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo copy(java.lang.String formattedAmount, java.lang.String selectedOfferId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOfferId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo(formattedAmount, selectedOfferId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedOfferId() {
            return this.selectedOfferId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo navigateToAdditionalInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAdditionalInfo.formattedAmount;
            }
            if ((i & 2) != 0) {
                str2 = navigateToAdditionalInfo.selectedOfferId;
            }
            return navigateToAdditionalInfo.copy(str, str2);
        }
    }

    public /* synthetic */ OffersEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
