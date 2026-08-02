package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FetchAddressLayout", "AddressFieldsBuilt", "FieldValueChanged", "ValidateField", "FieldValidated", "Save", "ClosePressed", "LayoutFailedToLoad", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$AddressFieldsBuilt;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FetchAddressLayout;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FieldValidated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$LayoutFailedToLoad;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$ValidateField;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AddressAddEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AddressAddEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FetchAddressLayout;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "prefilledAddress", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FetchAddressLayout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getPrefilledAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchAddressLayout extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address prefilledAddress;

        public FetchAddressLayout(com.paypal.oslo.core.i18n.domain.model.Address address) {
            super("FetchAddressLayout", null);
            this.prefilledAddress = address;
        }

        public /* synthetic */ FetchAddressLayout(com.paypal.oslo.core.i18n.domain.model.Address address, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address);
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getPrefilledAddress() {
            return this.prefilledAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.prefilledAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchAddressLayout(prefilledAddress=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.prefilledAddress;
            if (address == null) {
                return 0;
            }
            return address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefilledAddress, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout) other).prefilledAddress);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout copy(com.paypal.oslo.core.i18n.domain.model.Address prefilledAddress) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout(prefilledAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getPrefilledAddress() {
            return this.prefilledAddress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout fetchAddressLayout, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = fetchAddressLayout.prefilledAddress;
            }
            return fetchAddressLayout.copy(address);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FetchAddressLayout() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$AddressFieldsBuilt;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$AddressFieldsBuilt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressFieldsBuilt extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressFieldsBuilt(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel) {
            super("AddressFieldsBuilt", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddUiModel, "");
            this.uiModel = addressAddUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressFieldsBuilt(uiModel=");
            sb.append(addressAddUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt copy(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt addressFieldsBuilt, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressAddUiModel = addressFieldsBuilt.uiModel;
            }
            return addressFieldsBuilt.copy(addressAddUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FieldValueChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValueChanged extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged) other;
            return this.fieldId == fieldValueChanged.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fieldValueChanged.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged fieldValueChanged, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldValueChanged.fieldId;
            }
            if ((i & 2) != 0) {
                str = fieldValueChanged.value;
            }
            return fieldValueChanged.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$ValidateField;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$ValidateField;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidateField extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField validateField = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField) other;
            return this.fieldId == validateField.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.value, validateField.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField validateField, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = validateField.fieldId;
            }
            if ((i & 2) != 0) {
                str = validateField.value;
            }
            return validateField.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FieldValidated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "validatedModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$FieldValidated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "getValidatedModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValidated extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated fieldValidated = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated) other;
            return this.fieldId == fieldValidated.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.validatedModel, fieldValidated.validatedModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel validatedModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validatedModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated(fieldId, validatedModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel getValidatedModel() {
            return this.validatedModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated fieldValidated, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldValidated.fieldId;
            }
            if ((i & 2) != 0) {
                formFieldModel = fieldValidated.validatedModel;
            }
            return fieldValidated.copy(formFieldId, formFieldModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Save extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Pressed();

            public final int hashCode() {
                return -691954791;
            }

            private Pressed() {
                super("SavePressed", null);
            }

            public final java.lang.String toString() {
                return "Pressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Save(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Valid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel uiModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Valid(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel) {
                super("SaveValid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddUiModel, "");
                this.uiModel = addressAddUiModel;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel getUiModel() {
                return this.uiModel;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel = this.uiModel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid(uiModel=");
                sb.append(addressAddUiModel);
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid) other).uiModel);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid copy(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel uiModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid(uiModel);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel getUiModel() {
                return this.uiModel;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid valid, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    addressAddUiModel = valid.uiModel;
                }
                return valid.copy(addressAddUiModel);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$Save$Invalid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel uiModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Invalid(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel) {
                super("SaveInvalid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddUiModel, "");
                this.uiModel = addressAddUiModel;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel getUiModel() {
                return this.uiModel;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel = this.uiModel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(uiModel=");
                sb.append(addressAddUiModel);
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid) other).uiModel);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid copy(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel uiModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid(uiModel);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel getUiModel() {
                return this.uiModel;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid invalid, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    addressAddUiModel = invalid.uiModel;
                }
                return invalid.copy(addressAddUiModel);
            }
        }

        public /* synthetic */ Save(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ClosePressed();

        public final int hashCode() {
            return -2137550318;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent$LayoutFailedToLoad;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LayoutFailedToLoad extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.LayoutFailedToLoad INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.LayoutFailedToLoad();

        public final int hashCode() {
            return 1383333360;
        }

        private LayoutFailedToLoad() {
            super("LayoutFailedToLoad", null);
        }

        public final java.lang.String toString() {
            return "LayoutFailedToLoad";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.LayoutFailedToLoad)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AddressAddEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
