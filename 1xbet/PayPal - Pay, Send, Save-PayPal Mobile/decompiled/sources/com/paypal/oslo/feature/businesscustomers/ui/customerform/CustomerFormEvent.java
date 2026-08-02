package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "", "BillingCountrySelected", "ShippingCountrySelected", "FormSubmitted", "ClearErrors", "RetryLoadCountryList", "RetryAddressLayout", "ExitForm", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$BillingCountrySelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ClearErrors;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ExitForm;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$FormSubmitted;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$RetryAddressLayout;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$RetryLoadCountryList;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ShippingCountrySelected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomerFormEvent {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$BillingCountrySelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "", "countryCode", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "addressFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$BillingCountrySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "getAddressFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingCountrySelected implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields;
        private final java.lang.String countryCode;

        public BillingCountrySelected(java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            this.countryCode = str;
            this.addressFields = addressFields;
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddressFields() {
            return this.addressFields;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields = this.addressFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingCountrySelected(countryCode=");
            sb.append(str);
            sb.append(", addressFields=");
            sb.append(addressFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.countryCode.hashCode() * 31) + this.addressFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected billingCountrySelected = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, billingCountrySelected.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressFields, billingCountrySelected.addressFields);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected copy(java.lang.String countryCode, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected(countryCode, addressFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddressFields() {
            return this.addressFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected billingCountrySelected, java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = billingCountrySelected.countryCode;
            }
            if ((i & 2) != 0) {
                addressFields = billingCountrySelected.addressFields;
            }
            return billingCountrySelected.copy(str, addressFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ShippingCountrySelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "", "countryCode", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "addressFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ShippingCountrySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "getAddressFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShippingCountrySelected implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields;
        private final java.lang.String countryCode;

        public ShippingCountrySelected(java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            this.countryCode = str;
            this.addressFields = addressFields;
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddressFields() {
            return this.addressFields;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields = this.addressFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingCountrySelected(countryCode=");
            sb.append(str);
            sb.append(", addressFields=");
            sb.append(addressFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.countryCode.hashCode() * 31) + this.addressFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected shippingCountrySelected = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, shippingCountrySelected.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressFields, shippingCountrySelected.addressFields);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected copy(java.lang.String countryCode, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected(countryCode, addressFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddressFields() {
            return this.addressFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected shippingCountrySelected, java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shippingCountrySelected.countryCode;
            }
            if ((i & 2) != 0) {
                addressFields = shippingCountrySelected.addressFields;
            }
            return shippingCountrySelected.copy(str, addressFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$FormSubmitted;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "formData", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$FormSubmitted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "getFormData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FormSubmitted implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState formData;

        public FormSubmitted(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerFormInputState, "");
            this.formData = customerFormInputState;
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState getFormData() {
            return this.formData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState = this.formData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FormSubmitted(formData=");
            sb.append(customerFormInputState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted) && kotlin.jvm.internal.Intrinsics.areEqual(this.formData, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted) other).formData);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted copy(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState formData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted(formData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState getFormData() {
            return this.formData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted formSubmitted, com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customerFormInputState = formSubmitted.formData;
            }
            return formSubmitted.copy(customerFormInputState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ClearErrors;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ClearErrors;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearErrors implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> errors;

        /* JADX WARN: Multi-variable type inference failed */
        public ClearErrors(java.util.List<? extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errors = list;
        }

        public final java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClearErrors(errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors) other).errors);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors copy(java.util.List<? extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors(errors);
        }

        public final java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors clearErrors, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = clearErrors.errors;
            }
            return clearErrors.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$RetryLoadCountryList;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoadCountryList implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryLoadCountryList INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryLoadCountryList();

        public final int hashCode() {
            return 1088295256;
        }

        private RetryLoadCountryList() {
        }

        public final java.lang.String toString() {
            return "RetryLoadCountryList";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryLoadCountryList)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$RetryAddressLayout;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "", "countryCode", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "addressType", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "addressFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "component3", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$RetryAddressLayout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "getAddressType", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "getAddressFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryAddressLayout implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType;
        private final java.lang.String countryCode;

        public RetryAddressLayout(java.lang.String str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            this.countryCode = str;
            this.addressType = addressType;
            this.addressFields = addressFields;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType getAddressType() {
            return this.addressType;
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddressFields() {
            return this.addressFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType = this.addressType;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields = this.addressFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryAddressLayout(countryCode=");
            sb.append(str);
            sb.append(", addressType=");
            sb.append(addressType);
            sb.append(", addressFields=");
            sb.append(addressFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.countryCode.hashCode() * 31) + this.addressType.hashCode()) * 31) + this.addressFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout retryAddressLayout = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, retryAddressLayout.countryCode) && this.addressType == retryAddressLayout.addressType && kotlin.jvm.internal.Intrinsics.areEqual(this.addressFields, retryAddressLayout.addressFields);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout copy(java.lang.String countryCode, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout(countryCode, addressType, addressFields);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddressFields() {
            return this.addressFields;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType getAddressType() {
            return this.addressType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout retryAddressLayout, java.lang.String str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retryAddressLayout.countryCode;
            }
            if ((i & 2) != 0) {
                addressType = retryAddressLayout.addressType;
            }
            if ((i & 4) != 0) {
                addressFields = retryAddressLayout.addressFields;
            }
            return retryAddressLayout.copy(str, addressType, addressFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent$ExitForm;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitForm implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ExitForm INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ExitForm();

        public final int hashCode() {
            return -711610732;
        }

        private ExitForm() {
        }

        public final java.lang.String toString() {
            return "ExitForm";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ExitForm)) {
                return false;
            }
            return true;
        }
    }
}
