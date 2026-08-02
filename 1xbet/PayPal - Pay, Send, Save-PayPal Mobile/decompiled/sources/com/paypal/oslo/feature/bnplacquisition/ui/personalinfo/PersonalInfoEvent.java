package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:(\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001(23456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXY"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadDomainModel", "DomainModelLoaded", "UpdateApplicationSuccess", "UpdateReviewDetailsSuccess", "UpdateApplicationError", "ApplicationDeclined", "ErrorBackPressed", "DeclineClosePressed", "ApiFieldValidationFailed", "AddressValidationErrorReceived", "DisclaimerLinkPressed", "Continue", "EditBillingAddressPressed", "EditPersonalDetailsPressed", "BackPressed", "ClosePressed", "FieldValueChanged", "ValidateField", "FieldValidated", "FieldClicked", "DismissAddressBottomSheet", "UpdateAddress", "AddressLayoutFailed", "UpdateAddressSuccess", "UpdateAddressError", "AddressFormatted", "PasteValue", "AddressValidationModalEditAddressClicked", "AddressValidationModalChooseDifferentClicked", "AddressValidationModalDismissed", "FundingInstrumentsLoaded", "FundingInstrumentsLoadError", "LegalDisclosureCheckChanged", "SwitchToSuccess", "OpenRepaymentHalfSheet", "DismissRepaymentBottomSheet", "RepaymentMethodSelected", "LinkFundingPressed", "LinkFundingCancelled", "WalletFILinked", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressFormatted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressLayoutFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationErrorReceived;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationModalChooseDifferentClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationModalDismissed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationModalEditAddressClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ApiFieldValidationFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DisclaimerLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DismissAddressBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DismissRepaymentBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DomainModelLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$EditBillingAddressPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$EditPersonalDetailsPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldValidated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FundingInstrumentsLoadError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FundingInstrumentsLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LegalDisclosureCheckChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LinkFundingCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LinkFundingPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LoadDomainModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$OpenRepaymentHalfSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$PasteValue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$RepaymentMethodSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddressError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddressSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateApplicationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateReviewDetailsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ValidateField;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$WalletFILinked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PersonalInfoEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PersonalInfoEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LoadDomainModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LoadDomainModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadDomainModel extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadDomainModel(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess) {
            super("LoadDomainModel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationSuccess, "");
            this.data = createCreditApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadDomainModel(data=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel loadDomainModel, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createCreditApplicationSuccess = loadDomainModel.data;
            }
            return loadDomainModel.copy(createCreditApplicationSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DomainModelLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DomainModelLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DomainModelLoaded extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DomainModelLoaded(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("DomainModelLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.uiModel = personalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DomainModelLoaded(uiModel=");
            sb.append(personalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded domainModelLoaded, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = domainModelLoaded.uiModel;
            }
            return domainModelLoaded.copy(personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "creditApplication", "", "correlationId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateApplicationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "getCreditApplication", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateApplicationSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication creditApplication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, java.lang.String str) {
            super("UpdateApplicationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOfferDetailsSuccessCreditApplication, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditApplication = availableOfferDetailsSuccessCreditApplication;
            this.correlationId = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getCreditApplication() {
            return this.creditApplication;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication = this.creditApplication;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateApplicationSuccess(creditApplication=");
            sb.append(availableOfferDetailsSuccessCreditApplication);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.creditApplication.hashCode() * 31) + this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess updateApplicationSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditApplication, updateApplicationSuccess.creditApplication) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, updateApplicationSuccess.correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication creditApplication, java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditApplication, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess(creditApplication, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getCreditApplication() {
            return this.creditApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess updateApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableOfferDetailsSuccessCreditApplication = updateApplicationSuccess.creditApplication;
            }
            if ((i & 2) != 0) {
                str = updateApplicationSuccess.correlationId;
            }
            return updateApplicationSuccess.copy(availableOfferDetailsSuccessCreditApplication, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateReviewDetailsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "reviewDetails", "", "correlationId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateReviewDetailsSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "getReviewDetails", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateReviewDetailsSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateReviewDetailsSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess, java.lang.String str) {
            super("UpdateReviewDetailsSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanDetailsSuccess, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reviewDetails = reviewPlanDetailsSuccess;
            this.correlationId = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess getReviewDetails() {
            return this.reviewDetails;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess = this.reviewDetails;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateReviewDetailsSuccess(reviewDetails=");
            sb.append(reviewPlanDetailsSuccess);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.reviewDetails.hashCode() * 31) + this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess updateReviewDetailsSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reviewDetails, updateReviewDetailsSuccess.reviewDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, updateReviewDetailsSuccess.correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewDetails, java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewDetails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess(reviewDetails, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess getReviewDetails() {
            return this.reviewDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess updateReviewDetailsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPlanDetailsSuccess = updateReviewDetailsSuccess.reviewDetails;
            }
            if ((i & 2) != 0) {
                str = updateReviewDetailsSuccess.correlationId;
            }
            return updateReviewDetailsSuccess.copy(reviewPlanDetailsSuccess, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateApplicationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateApplicationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateApplicationError extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateApplicationError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("UpdateApplicationError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
            this.uiModel = personalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateApplicationError(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", uiModel=");
            sb.append(personalInfoUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorContent.hashCode() * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError updateApplicationError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, updateApplicationError.errorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, updateApplicationError.uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError(errorContent, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError updateApplicationError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = updateApplicationError.errorContent;
            }
            if ((i & 2) != 0) {
                personalInfoUiModel = updateApplicationError.uiModel;
            }
            return updateApplicationError.copy(fullscreenErrorUiModel, personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ApplicationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplicationDeclined extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined applicationDeclined, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = applicationDeclined.declineContent;
            }
            return applicationDeclined.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ErrorBackPressed();

        public final int hashCode() {
            return 804515509;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeclineClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DeclineClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DeclineClosePressed();

        public final int hashCode() {
            return 437905726;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DeclineClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ApiFieldValidationFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ApiFieldValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiFieldValidationFailed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError> errors;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ApiFieldValidationFailed(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError> list) {
            super("ApiFieldValidationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.uiModel = personalInfoUiModel;
            this.errors = list;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiFieldValidationFailed(uiModel=");
            sb.append(personalInfoUiModel);
            sb.append(", errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed apiFieldValidationFailed = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, apiFieldValidationFailed.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, apiFieldValidationFailed.errors);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed(uiModel, errors);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError> component2() {
            return this.errors;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed apiFieldValidationFailed, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = apiFieldValidationFailed.uiModel;
            }
            if ((i & 2) != 0) {
                list = apiFieldValidationFailed.errors;
            }
            return apiFieldValidationFailed.copy(personalInfoUiModel, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationErrorReceived;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "", "failedAddressText", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "failedAddress", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationErrorReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel", "Ljava/lang/String;", "getFailedAddressText", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getFailedAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressValidationErrorReceived extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address failedAddress;
        private final java.lang.String failedAddressText;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressValidationErrorReceived(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Address address) {
            super("AddressValidationErrorReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.uiModel = personalInfoUiModel;
            this.failedAddressText = str;
            this.failedAddress = address;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String getFailedAddressText() {
            return this.failedAddressText;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getFailedAddress() {
            return this.failedAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            java.lang.String str = this.failedAddressText;
            com.paypal.oslo.core.i18n.domain.model.Address address = this.failedAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressValidationErrorReceived(uiModel=");
            sb.append(personalInfoUiModel);
            sb.append(", failedAddressText=");
            sb.append(str);
            sb.append(", failedAddress=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.uiModel.hashCode() * 31) + this.failedAddressText.hashCode()) * 31) + this.failedAddress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived addressValidationErrorReceived = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, addressValidationErrorReceived.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedAddressText, addressValidationErrorReceived.failedAddressText) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedAddress, addressValidationErrorReceived.failedAddress);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel, java.lang.String failedAddressText, com.paypal.oslo.core.i18n.domain.model.Address failedAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAddressText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAddress, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived(uiModel, failedAddressText, failedAddress);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getFailedAddress() {
            return this.failedAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFailedAddressText() {
            return this.failedAddressText;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived addressValidationErrorReceived, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = addressValidationErrorReceived.uiModel;
            }
            if ((i & 2) != 0) {
                str = addressValidationErrorReceived.failedAddressText;
            }
            if ((i & 4) != 0) {
                address = addressValidationErrorReceived.failedAddress;
            }
            return addressValidationErrorReceived.copy(personalInfoUiModel, str, address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DisclaimerLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DisclaimerLinkPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisclaimerLinkPressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisclaimerLinkPressed(java.lang.String str) {
            super("DisclaimerLinkPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisclaimerLinkPressed(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed) other).url);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed disclaimerLinkPressed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = disclaimerLinkPressed.url;
            }
            return disclaimerLinkPressed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Continue extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Pressed();

            public final int hashCode() {
                return 1342429789;
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Continue(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Valid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Valid(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
                super("ContinueValid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
                this.uiModel = personalInfoUiModel;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
                return this.uiModel;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid(uiModel=");
                sb.append(personalInfoUiModel);
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid) other).uiModel);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid(uiModel);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
                return this.uiModel;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid valid, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    personalInfoUiModel = valid.uiModel;
                }
                return valid.copy(personalInfoUiModel);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldRow;", "billingAddress", "dob", "annualIncome", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$Continue$Invalid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getBillingAddress", "getDob", "getAnnualIncome"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> annualIncome;
            private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> billingAddress;
            private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> dob;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Invalid(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> list, java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> list2, java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> list3) {
                super("ContinueInvalid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
                this.billingAddress = list;
                this.dob = list2;
                this.annualIncome = list3;
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> getBillingAddress() {
                return this.billingAddress;
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> getDob() {
                return this.dob;
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> getAnnualIncome() {
                return this.annualIncome;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> list = this.billingAddress;
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> list2 = this.dob;
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> list3 = this.annualIncome;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(billingAddress=");
                sb.append(list);
                sb.append(", dob=");
                sb.append(list2);
                sb.append(", annualIncome=");
                sb.append(list3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.billingAddress.hashCode() * 31) + this.dob.hashCode()) * 31) + this.annualIncome.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid invalid = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, invalid.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.dob, invalid.dob) && kotlin.jvm.internal.Intrinsics.areEqual(this.annualIncome, invalid.annualIncome);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> billingAddress, java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> dob, java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> annualIncome) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dob, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annualIncome, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid(billingAddress, dob, annualIncome);
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> component3() {
                return this.annualIncome;
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> component2() {
                return this.dob;
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> component1() {
                return this.billingAddress;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid invalid, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = invalid.billingAddress;
                }
                if ((i & 2) != 0) {
                    list2 = invalid.dob;
                }
                if ((i & 4) != 0) {
                    list3 = invalid.annualIncome;
                }
                return invalid.copy(list, list2, list3);
            }
        }

        public /* synthetic */ Continue(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$EditBillingAddressPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditBillingAddressPressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditBillingAddressPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditBillingAddressPressed();

        public final int hashCode() {
            return -740943203;
        }

        private EditBillingAddressPressed() {
            super("EditBillingAddressPressed", null);
        }

        public final java.lang.String toString() {
            return "EditBillingAddressPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditBillingAddressPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$EditPersonalDetailsPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditPersonalDetailsPressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditPersonalDetailsPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditPersonalDetailsPressed();

        public final int hashCode() {
            return 1604602540;
        }

        private EditPersonalDetailsPressed() {
            super("EditPersonalDetailsPressed", null);
        }

        public final java.lang.String toString() {
            return "EditPersonalDetailsPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditPersonalDetailsPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed();

        public final int hashCode() {
            return -1977487527;
        }

        private BackPressed() {
            super("BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed();

        public final int hashCode() {
            return -779824980;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldValueChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValueChanged extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldValueChanged(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str) {
            super("FieldValueChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fieldId = formFieldId;
            this.value = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = this.fieldId;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldValueChanged(fieldId=");
            sb.append(formFieldId);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fieldId.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged) other;
            return this.fieldId == fieldValueChanged.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fieldValueChanged.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged fieldValueChanged, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldValueChanged.fieldId;
            }
            if ((i & 2) != 0) {
                str = fieldValueChanged.value;
            }
            return fieldValueChanged.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ValidateField;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$ValidateField;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidateField extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidateField(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str) {
            super("ValidateField", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fieldId = formFieldId;
            this.value = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = this.fieldId;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateField(fieldId=");
            sb.append(formFieldId);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fieldId.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField validateField = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField) other;
            return this.fieldId == validateField.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.value, validateField.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField validateField, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = validateField.fieldId;
            }
            if ((i & 2) != 0) {
                str = validateField.value;
            }
            return validateField.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldValidated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "validatedModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldValidated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "getValidatedModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValidated extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel validatedModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldValidated(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel) {
            super("FieldValidated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldModel, "");
            this.fieldId = formFieldId;
            this.validatedModel = formFieldModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel getValidatedModel() {
            return this.validatedModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = this.fieldId;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel = this.validatedModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldValidated(fieldId=");
            sb.append(formFieldId);
            sb.append(", validatedModel=");
            sb.append(formFieldModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fieldId.hashCode() * 31) + this.validatedModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated fieldValidated = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated) other;
            return this.fieldId == fieldValidated.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.validatedModel, fieldValidated.validatedModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel validatedModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validatedModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated(fieldId, validatedModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel getValidatedModel() {
            return this.validatedModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated fieldValidated, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldValidated.fieldId;
            }
            if ((i & 2) != 0) {
                formFieldModel = fieldValidated.validatedModel;
            }
            return fieldValidated.copy(formFieldId, formFieldModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FieldClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldClicked extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldClicked(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId) {
            super("FieldClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
            this.fieldId = formFieldId;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = this.fieldId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldClicked(fieldId=");
            sb.append(formFieldId);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fieldId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked) && this.fieldId == ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked) other).fieldId;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked(fieldId);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked fieldClicked, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldClicked.fieldId;
            }
            return fieldClicked.copy(formFieldId);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DismissAddressBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissAddressBottomSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissAddressBottomSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissAddressBottomSheet();

        public final int hashCode() {
            return -1427798232;
        }

        private DismissAddressBottomSheet() {
            super("DismissAddressBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissAddressBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissAddressBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAddress extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address address;

        public UpdateAddress(com.paypal.oslo.core.i18n.domain.model.Address address) {
            super("UpdateAddress", null);
            this.address = address;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAddress(address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
            if (address == null) {
                return 0;
            }
            return address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress) other).address);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress copy(com.paypal.oslo.core.i18n.domain.model.Address address) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress(address);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress updateAddress, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = updateAddress.address;
            }
            return updateAddress.copy(address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressLayoutFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressLayoutFailed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressLayoutFailed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressLayoutFailed();

        public final int hashCode() {
            return 1342720569;
        }

        private AddressLayoutFailed() {
            super("AddressLayoutFailed", null);
        }

        public final java.lang.String toString() {
            return "AddressLayoutFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressLayoutFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddressSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", "saveAddress", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddressSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", "getSaveAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAddressSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAddressSuccess(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress) {
            super("UpdateAddressSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveAddress, "");
            this.uiModel = personalInfoUiModel;
            this.saveAddress = saveAddress;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress getSaveAddress() {
            return this.saveAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress = this.saveAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAddressSuccess(uiModel=");
            sb.append(personalInfoUiModel);
            sb.append(", saveAddress=");
            sb.append(saveAddress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.saveAddress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess updateAddressSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, updateAddressSuccess.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.saveAddress, updateAddressSuccess.saveAddress);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel, com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveAddress, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess(uiModel, saveAddress);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress getSaveAddress() {
            return this.saveAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess updateAddressSuccess, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = updateAddressSuccess.uiModel;
            }
            if ((i & 2) != 0) {
                saveAddress = updateAddressSuccess.saveAddress;
            }
            return updateAddressSuccess.copy(personalInfoUiModel, saveAddress);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddressError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$UpdateAddressError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAddressError extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAddressError(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("UpdateAddressError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.uiModel = personalInfoUiModel;
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAddressError(uiModel=");
            sb.append(personalInfoUiModel);
            sb.append(", errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.errorContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError updateAddressError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, updateAddressError.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, updateAddressError.errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError(uiModel, errorContent);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError updateAddressError, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = updateAddressError.uiModel;
            }
            if ((i & 2) != 0) {
                fullscreenErrorUiModel = updateAddressError.errorContent;
            }
            return updateAddressError.copy(personalInfoUiModel, fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressFormatted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressFormatted extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressFormatted(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("AddressFormatted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.uiModel = personalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressFormatted(uiModel=");
            sb.append(personalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted addressFormatted, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = addressFormatted.uiModel;
            }
            return addressFormatted.copy(personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$PasteValue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", "rawValue", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$PasteValue;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getRawValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasteValue extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String rawValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasteValue(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str) {
            super("PasteValue", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fieldId = formFieldId;
            this.rawValue = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String getRawValue() {
            return this.rawValue;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = this.fieldId;
            java.lang.String str = this.rawValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasteValue(fieldId=");
            sb.append(formFieldId);
            sb.append(", rawValue=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fieldId.hashCode() * 31) + this.rawValue.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue pasteValue = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue) other;
            return this.fieldId == pasteValue.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.rawValue, pasteValue.rawValue);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String rawValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue(fieldId, rawValue);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRawValue() {
            return this.rawValue;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue pasteValue, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = pasteValue.fieldId;
            }
            if ((i & 2) != 0) {
                str = pasteValue.rawValue;
            }
            return pasteValue.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationModalEditAddressClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressValidationModalEditAddressClicked extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalEditAddressClicked INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalEditAddressClicked();

        public final int hashCode() {
            return -687600609;
        }

        private AddressValidationModalEditAddressClicked() {
            super("AddressValidationModalEditAddressClicked", null);
        }

        public final java.lang.String toString() {
            return "AddressValidationModalEditAddressClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalEditAddressClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationModalChooseDifferentClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressValidationModalChooseDifferentClicked extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalChooseDifferentClicked INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalChooseDifferentClicked();

        public final int hashCode() {
            return -569771321;
        }

        private AddressValidationModalChooseDifferentClicked() {
            super("AddressValidationModalChooseDifferentClicked", null);
        }

        public final java.lang.String toString() {
            return "AddressValidationModalChooseDifferentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalChooseDifferentClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$AddressValidationModalDismissed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressValidationModalDismissed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalDismissed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalDismissed();

        public final int hashCode() {
            return 1960445063;
        }

        private AddressValidationModalDismissed() {
            super("AddressValidationModalDismissed", null);
        }

        public final java.lang.String toString() {
            return "AddressValidationModalDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FundingInstrumentsLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "instruments", "preferred", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FiLinkError;", "fiLinkError", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FiLinkError;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FiLinkError;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FiLinkError;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FundingInstrumentsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getInstruments", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "getPreferred", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FiLinkError;", "getFiLinkError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrumentsLoaded extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> instruments;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument preferred;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FundingInstrumentsLoaded(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> list, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError) {
            super("FundingInstrumentsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.instruments = list;
            this.preferred = fundingInstrument;
            this.fiLinkError = fiLinkError;
        }

        public /* synthetic */ FundingInstrumentsLoaded(java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, fundingInstrument, (i & 4) != 0 ? null : fiLinkError);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> getInstruments() {
            return this.instruments;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument getPreferred() {
            return this.preferred;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError getFiLinkError() {
            return this.fiLinkError;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> list = this.instruments;
            com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument = this.preferred;
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError = this.fiLinkError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentsLoaded(instruments=");
            sb.append(list);
            sb.append(", preferred=");
            sb.append(fundingInstrument);
            sb.append(", fiLinkError=");
            sb.append(fiLinkError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.instruments.hashCode();
            com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument = this.preferred;
            int hashCode2 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError = this.fiLinkError;
            return (((hashCode * 31) + hashCode2) * 31) + (fiLinkError != null ? fiLinkError.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded fundingInstrumentsLoaded = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instruments, fundingInstrumentsLoaded.instruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferred, fundingInstrumentsLoaded.preferred) && this.fiLinkError == fundingInstrumentsLoaded.fiLinkError;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded copy(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> instruments, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument preferred, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruments, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded(instruments, preferred, fiLinkError);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError getFiLinkError() {
            return this.fiLinkError;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument getPreferred() {
            return this.preferred;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> component1() {
            return this.instruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded fundingInstrumentsLoaded, java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = fundingInstrumentsLoaded.instruments;
            }
            if ((i & 2) != 0) {
                fundingInstrument = fundingInstrumentsLoaded.preferred;
            }
            if ((i & 4) != 0) {
                fiLinkError = fundingInstrumentsLoaded.fiLinkError;
            }
            return fundingInstrumentsLoaded.copy(list, fundingInstrument, fiLinkError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FundingInstrumentsLoadError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$FundingInstrumentsLoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrumentsLoadError extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingInstrumentsLoadError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("FundingInstrumentsLoadError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentsLoadError(errorContent=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError fundingInstrumentsLoadError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = fundingInstrumentsLoadError.errorContent;
            }
            return fundingInstrumentsLoadError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LegalDisclosureCheckChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "", "accepted", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LegalDisclosureCheckChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAccepted"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LegalDisclosureCheckChanged extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final boolean accepted;

        public LegalDisclosureCheckChanged(boolean z) {
            super("LegalDisclosureCheckChanged", null);
            this.accepted = z;
        }

        public final boolean getAccepted() {
            return this.accepted;
        }

        public final java.lang.String toString() {
            boolean z = this.accepted;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalDisclosureCheckChanged(accepted=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.accepted);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged) && this.accepted == ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged) other).accepted;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged copy(boolean accepted) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged(accepted);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAccepted() {
            return this.accepted;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged legalDisclosureCheckChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = legalDisclosureCheckChanged.accepted;
            }
            return legalDisclosureCheckChanged.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$SwitchToSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SwitchToSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchToSuccess(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("SwitchToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.data = personalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchToSuccess(data=");
            sb.append(personalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess switchToSuccess, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = switchToSuccess.data;
            }
            return switchToSuccess.copy(personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$OpenRepaymentHalfSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenRepaymentHalfSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.OpenRepaymentHalfSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.OpenRepaymentHalfSheet();

        public final int hashCode() {
            return 768541893;
        }

        private OpenRepaymentHalfSheet() {
            super("OpenRepaymentHalfSheet", null);
        }

        public final java.lang.String toString() {
            return "OpenRepaymentHalfSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.OpenRepaymentHalfSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$DismissRepaymentBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissRepaymentBottomSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissRepaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissRepaymentBottomSheet();

        public final int hashCode() {
            return -1798011063;
        }

        private DismissRepaymentBottomSheet() {
            super("DismissRepaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissRepaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissRepaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$RepaymentMethodSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "", "fundingInstrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$RepaymentMethodSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RepaymentMethodSelected extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingInstrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RepaymentMethodSelected(java.lang.String str) {
            super("RepaymentMethodSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstrumentId = str;
        }

        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentMethodSelected(fundingInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected) other).fundingInstrumentId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected copy(java.lang.String fundingInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected(fundingInstrumentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected repaymentMethodSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = repaymentMethodSelected.fundingInstrumentId;
            }
            return repaymentMethodSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LinkFundingPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "type", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LinkFundingPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkFundingPressed extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkFundingPressed(com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType) {
            super("LinkFundingPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.type = fundingInstrumentType;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkFundingPressed(type=");
            sb.append(fundingInstrumentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed) && this.type == ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed) other).type;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed copy(com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed linkFundingPressed, com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentType = linkFundingPressed.type;
            }
            return linkFundingPressed.copy(fundingInstrumentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$LinkFundingCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkFundingCancelled extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingCancelled INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingCancelled();

        public final int hashCode() {
            return 1239163536;
        }

        private LinkFundingCancelled() {
            super("LinkFundingCancelled", null);
        }

        public final java.lang.String toString() {
            return "LinkFundingCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$WalletFILinked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "", "", "ids", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent$WalletFILinked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletFILinked extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletFILinked(java.util.List<java.lang.String> list) {
            super("WalletFILinked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.ids = list;
        }

        public final java.util.List<java.lang.String> getIds() {
            return this.ids;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.ids;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletFILinked(ids=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.ids.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked) && kotlin.jvm.internal.Intrinsics.areEqual(this.ids, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked) other).ids);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked copy(java.util.List<java.lang.String> ids) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ids, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked(ids);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.ids;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked walletFILinked, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = walletFILinked.ids;
            }
            return walletFILinked.copy(list);
        }
    }

    public /* synthetic */ PersonalInfoEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
