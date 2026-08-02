package com.paypal.oslo.feature.businesscustomers.ui.addressform;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "getField", "()Lcom/paypal/oslo/core/i18n/domain/model/Field;", "field", "", "getLabel", "()Ljava/lang/String;", "label", "", "getRequired", "()Z", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "TextInput", "Dropdown", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$Dropdown;", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$TextInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AddressComponentComposeState {
    com.paypal.oslo.core.i18n.domain.model.Field getField();

    java.lang.String getLabel();

    boolean getRequired();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$TextInput;", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "field", "", "label", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Field;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$TextInput;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "getField", "Ljava/lang/String;", "getLabel", "Z", "getRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TextInput implements com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.i18n.domain.model.Field field;
        private final java.lang.String label;
        private final boolean required;

        public TextInput(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            this.field = field;
            this.label = str;
            this.required = z;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState
        public final com.paypal.oslo.core.i18n.domain.model.Field getField() {
            return this.field;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState
        public final java.lang.String getLabel() {
            return this.label;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState
        public final boolean getRequired() {
            return this.required;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Field field = this.field;
            java.lang.String str = this.label;
            boolean z = this.required;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TextInput(field=");
            sb.append(field);
            sb.append(", label=");
            sb.append(str);
            sb.append(", required=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.field.hashCode();
            java.lang.String str = this.label;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.required);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput textInput = (com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.field, textInput.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, textInput.label) && this.required == textInput.required;
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput copy(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String label, boolean required) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput(field, label, required);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequired() {
            return this.required;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLabel() {
            return this.label;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Field getField() {
            return this.field;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput copy$default(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput textInput, com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                field = textInput.field;
            }
            if ((i & 2) != 0) {
                str = textInput.label;
            }
            if ((i & 4) != 0) {
                z = textInput.required;
            }
            return textInput.copy(field, str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$Dropdown;", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "field", "", "label", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "", "dropdownValues", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;ZLjava/util/Map;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Field;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;ZLjava/util/Map;)Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$Dropdown;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "getField", "Ljava/lang/String;", "getLabel", "Z", "getRequired", "Ljava/util/Map;", "getDropdownValues"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dropdown implements com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState {
        public static final int $stable = 0;
        private final java.util.Map<java.lang.String, java.lang.String> dropdownValues;
        private final com.paypal.oslo.core.i18n.domain.model.Field field;
        private final java.lang.String label;
        private final boolean required;

        public Dropdown(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, boolean z, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.field = field;
            this.label = str;
            this.required = z;
            this.dropdownValues = map;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState
        public final com.paypal.oslo.core.i18n.domain.model.Field getField() {
            return this.field;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState
        public final java.lang.String getLabel() {
            return this.label;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState
        public final boolean getRequired() {
            return this.required;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getDropdownValues() {
            return this.dropdownValues;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Field field = this.field;
            java.lang.String str = this.label;
            boolean z = this.required;
            java.util.Map<java.lang.String, java.lang.String> map = this.dropdownValues;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dropdown(field=");
            sb.append(field);
            sb.append(", label=");
            sb.append(str);
            sb.append(", required=");
            sb.append(z);
            sb.append(", dropdownValues=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.field.hashCode();
            java.lang.String str = this.label;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.required)) * 31) + this.dropdownValues.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown dropdown = (com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.field, dropdown.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, dropdown.label) && this.required == dropdown.required && kotlin.jvm.internal.Intrinsics.areEqual(this.dropdownValues, dropdown.dropdownValues);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown copy(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String label, boolean required, java.util.Map<java.lang.String, java.lang.String> dropdownValues) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownValues, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown(field, label, required, dropdownValues);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component4() {
            return this.dropdownValues;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequired() {
            return this.required;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLabel() {
            return this.label;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Field getField() {
            return this.field;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown copy$default(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown dropdown, com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, boolean z, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                field = dropdown.field;
            }
            if ((i & 2) != 0) {
                str = dropdown.label;
            }
            if ((i & 4) != 0) {
                z = dropdown.required;
            }
            if ((i & 8) != 0) {
                map = dropdown.dropdownValues;
            }
            return dropdown.copy(field, str, z, map);
        }
    }
}
