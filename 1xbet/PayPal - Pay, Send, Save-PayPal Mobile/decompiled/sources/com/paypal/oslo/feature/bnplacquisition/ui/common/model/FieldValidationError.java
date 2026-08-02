package com.paypal.oslo.feature.bnplacquisition.ui.common.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u0000 \n2\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\nR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "", "getMessage", "()Ljava/lang/String;", "message", "Companion", "InvalidDateOfBirth", "InvalidAge", "InvalidPhoneNumber", "InvalidNationalIdentification", "InvalidAddress", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidAge;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidDateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidNationalIdentification;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidPhoneNumber;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FieldValidationError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.Companion INSTANCE = com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId();

    java.lang.String getMessage();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidDateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "message", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidDateOfBirth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getReason", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidDateOfBirth implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String message;
        private final java.lang.String reason;

        public InvalidDateOfBirth(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.reason = str2;
            this.fieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BIRTH_DATE;
        }

        public /* synthetic */ InvalidDateOfBirth(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidDateOfBirth(message=");
            sb.append(str);
            sb.append(", reason=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.String str = this.reason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth invalidDateOfBirth = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, invalidDateOfBirth.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidDateOfBirth.reason);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth copy(java.lang.String message, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth(message, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth invalidDateOfBirth, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidDateOfBirth.message;
            }
            if ((i & 2) != 0) {
                str2 = invalidDateOfBirth.reason;
            }
            return invalidDateOfBirth.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidAge;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "message", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidAge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getReason", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidAge implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String message;
        private final java.lang.String reason;

        public InvalidAge(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.reason = str2;
            this.fieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BIRTH_DATE;
        }

        public /* synthetic */ InvalidAge(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidAge(message=");
            sb.append(str);
            sb.append(", reason=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.String str = this.reason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge invalidAge = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, invalidAge.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidAge.reason);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge copy(java.lang.String message, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge(message, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge invalidAge, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidAge.message;
            }
            if ((i & 2) != 0) {
                str2 = invalidAge.reason;
            }
            return invalidAge.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidPhoneNumber;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidPhoneNumber;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidPhoneNumber implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String message;

        public InvalidPhoneNumber(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.fieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.PHONE_NUMBER;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidPhoneNumber(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber) other).message);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber invalidPhoneNumber, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidPhoneNumber.message;
            }
            return invalidPhoneNumber.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidNationalIdentification;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "message", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidNationalIdentification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getReason", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidNationalIdentification implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String message;
        private final java.lang.String reason;

        public InvalidNationalIdentification(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.reason = str2;
            this.fieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.NATIONAL_IDENTIFICATION;
        }

        public /* synthetic */ InvalidNationalIdentification(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidNationalIdentification(message=");
            sb.append(str);
            sb.append(", reason=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.String str = this.reason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification invalidNationalIdentification = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, invalidNationalIdentification.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidNationalIdentification.reason);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification copy(java.lang.String message, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification(message, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification invalidNationalIdentification, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidNationalIdentification.message;
            }
            if ((i & 2) != 0) {
                str2 = invalidNationalIdentification.reason;
            }
            return invalidNationalIdentification.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$InvalidAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFieldId", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidAddress implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId;
        private final java.lang.String message;

        public InvalidAddress(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.fieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BILLING_ADDRESS;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidAddress(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress) other).message);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress invalidAddress, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidAddress.message;
            }
            return invalidAddress.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "error", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FieldValidationError;", "", "fromUseCaseError", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;)Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.Companion();

        private Companion() {
        }

        public final kotlin.Pair<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError, java.lang.String> fromUseCaseError(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError invalidDateOfBirthError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError) error;
                return kotlin.TuplesKt.to(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidDateOfBirth(invalidDateOfBirthError.getErrorDetail().getMessage(), invalidDateOfBirthError.getReason()), error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError invalidAgeError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError) error;
                return kotlin.TuplesKt.to(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAge(invalidAgeError.getErrorDetail().getMessage(), invalidAgeError.getReason()), error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError) {
                return kotlin.TuplesKt.to(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidPhoneNumber(((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError) error).getErrorDetail().getMessage()), error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError invalidNationalIdentificationError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError) error;
                return kotlin.TuplesKt.to(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidNationalIdentification(invalidNationalIdentificationError.getErrorDetail().getMessage(), invalidNationalIdentificationError.getReason()), error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError) {
                return kotlin.TuplesKt.to(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError.InvalidAddress(((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError) error).getErrorDetail().getMessage()), error.getCorrelationId());
            }
            return null;
        }
    }
}
