package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000e\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "FieldValueChanged", "ValidateField", "FieldValidated", "PasteValue", "Initialized", "Continue", "ApiSuccess", "ApiError", "ApplicationDeclined", "ErrorBackPressed", "DeclineClosePressed", "BackPressed", "ClosePressed", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApiError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApiSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$FieldValidated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Initialize;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Initialized;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$PasteValue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ValidateField;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AdditionalInfoEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AdditionalInfoEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Initialize;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "", "formattedAmount", "selectedOfferId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "getSelectedOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final java.lang.String selectedOfferId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, java.lang.String str2) {
            super("Initialize", null);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(formattedAmount=");
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize initialize = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, initialize.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOfferId, initialize.selectedOfferId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize copy(java.lang.String formattedAmount, java.lang.String selectedOfferId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOfferId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize(formattedAmount, selectedOfferId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedOfferId() {
            return this.selectedOfferId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize initialize, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.formattedAmount;
            }
            if ((i & 2) != 0) {
                str2 = initialize.selectedOfferId;
            }
            return initialize.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$FieldValueChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValueChanged extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged) other;
            return this.fieldId == fieldValueChanged.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fieldValueChanged.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged fieldValueChanged, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldValueChanged.fieldId;
            }
            if ((i & 2) != 0) {
                str = fieldValueChanged.value;
            }
            return fieldValueChanged.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ValidateField;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ValidateField;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidateField extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField validateField = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField) other;
            return this.fieldId == validateField.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.value, validateField.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField validateField, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = validateField.fieldId;
            }
            if ((i & 2) != 0) {
                str = validateField.value;
            }
            return validateField.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$FieldValidated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "validatedModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$FieldValidated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "getValidatedModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValidated extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated fieldValidated = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated) other;
            return this.fieldId == fieldValidated.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.validatedModel, fieldValidated.validatedModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel validatedModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validatedModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated(fieldId, validatedModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel getValidatedModel() {
            return this.validatedModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated fieldValidated, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = fieldValidated.fieldId;
            }
            if ((i & 2) != 0) {
                formFieldModel = fieldValidated.validatedModel;
            }
            return fieldValidated.copy(formFieldId, formFieldModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$PasteValue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", "rawValue", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$PasteValue;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "Ljava/lang/String;", "getRawValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasteValue extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue pasteValue = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue) other;
            return this.fieldId == pasteValue.fieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.rawValue, pasteValue.rawValue);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, java.lang.String rawValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue(fieldId, rawValue);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRawValue() {
            return this.rawValue;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue pasteValue, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formFieldId = pasteValue.fieldId;
            }
            if ((i & 2) != 0) {
                str = pasteValue.rawValue;
            }
            return pasteValue.copy(formFieldId, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Initialized;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Initialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialized extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialized(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
            super("Initialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoUiModel, "");
            this.uiModel = additionalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialized(uiModel=");
            sb.append(additionalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized copy(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized initialized, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                additionalInfoUiModel = initialized.uiModel;
            }
            return initialized.copy(additionalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Continue extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Pressed();

            public final int hashCode() {
                return 457871229;
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Continue(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Valid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel uiModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Valid(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
                super("ContinueValid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoUiModel, "");
                this.uiModel = additionalInfoUiModel;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getUiModel() {
                return this.uiModel;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel = this.uiModel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid(uiModel=");
                sb.append(additionalInfoUiModel);
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid) other).uiModel);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid copy(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel uiModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid(uiModel);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getUiModel() {
                return this.uiModel;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid valid, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    additionalInfoUiModel = valid.uiModel;
                }
                return valid.copy(additionalInfoUiModel);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$Continue$Invalid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel uiModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Invalid(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
                super("ContinueInvalid", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoUiModel, "");
                this.uiModel = additionalInfoUiModel;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getUiModel() {
                return this.uiModel;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel = this.uiModel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(uiModel=");
                sb.append(additionalInfoUiModel);
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid) other).uiModel);
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid copy(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel uiModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
                return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid(uiModel);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getUiModel() {
                return this.uiModel;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid invalid, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    additionalInfoUiModel = invalid.uiModel;
                }
                return invalid.copy(additionalInfoUiModel);
            }
        }

        public /* synthetic */ Continue(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApiSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "reviewTermsSuccess", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApiSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "getReviewTermsSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess) {
            super("ApiSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsSuccess, "");
            this.reviewTermsSuccess = reviewTermsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getReviewTermsSuccess() {
            return this.reviewTermsSuccess;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess = this.reviewTermsSuccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiSuccess(reviewTermsSuccess=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.reviewTermsSuccess, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess) other).reviewTermsSuccess);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsSuccess, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess(reviewTermsSuccess);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getReviewTermsSuccess() {
            return this.reviewTermsSuccess;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess apiSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsSuccess = apiSuccess.reviewTermsSuccess;
            }
            return apiSuccess.copy(reviewTermsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApiError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiError extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError apiError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = apiError.errorContent;
            }
            return apiError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ApplicationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplicationDeclined extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined applicationDeclined, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = applicationDeclined.declineContent;
            }
            return applicationDeclined.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ErrorBackPressed();

        public final int hashCode() {
            return -80043051;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeclineClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.DeclineClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.DeclineClosePressed();

        public final int hashCode() {
            return -1821794274;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.DeclineClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.BackPressed();

        public final int hashCode() {
            return -762935751;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed();

        public final int hashCode() {
            return -1783425588;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AdditionalInfoEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
