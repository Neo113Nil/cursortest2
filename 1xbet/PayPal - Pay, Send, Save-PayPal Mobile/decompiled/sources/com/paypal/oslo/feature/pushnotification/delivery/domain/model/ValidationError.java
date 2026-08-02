package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "MissingRequiredField", "InvalidFieldValue", "JsonParsingFailed", "UnsupportedVersion", "BusinessRuleViolation", "Unknown", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$BusinessRuleViolation;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$InvalidFieldValue;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$JsonParsingFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$MissingRequiredField;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$Unknown;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$UnsupportedVersion;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ValidationError {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$MissingRequiredField;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "fieldName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$MissingRequiredField;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFieldName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingRequiredField implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError {
        public static final int $stable = 0;
        private final java.lang.String fieldName;

        public MissingRequiredField(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fieldName = str;
        }

        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fieldName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingRequiredField(fieldName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fieldName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField) && kotlin.jvm.internal.Intrinsics.areEqual(this.fieldName, ((com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField) other).fieldName);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField copy(java.lang.String fieldName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField(fieldName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField missingRequiredField, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = missingRequiredField.fieldName;
            }
            return missingRequiredField.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$InvalidFieldValue;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "fieldName", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$InvalidFieldValue;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFieldName", "getValue", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidFieldValue implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError {
        public static final int $stable = 0;
        private final java.lang.String fieldName;
        private final java.lang.String reason;
        private final java.lang.String value;

        public InvalidFieldValue(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.fieldName = str;
            this.value = str2;
            this.reason = str3;
        }

        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fieldName;
            java.lang.String str2 = this.value;
            java.lang.String str3 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidFieldValue(fieldName=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(", reason=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.fieldName.hashCode() * 31) + this.value.hashCode()) * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue invalidFieldValue = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fieldName, invalidFieldValue.fieldName) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, invalidFieldValue.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidFieldValue.reason);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue copy(java.lang.String fieldName, java.lang.String value, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue(fieldName, value, reason);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue invalidFieldValue, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidFieldValue.fieldName;
            }
            if ((i & 2) != 0) {
                str2 = invalidFieldValue.value;
            }
            if ((i & 4) != 0) {
                str3 = invalidFieldValue.reason;
            }
            return invalidFieldValue.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$JsonParsingFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "fieldName", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$JsonParsingFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFieldName", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class JsonParsingFailed implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError {
        public static final int $stable = 0;
        private final java.lang.String error;
        private final java.lang.String fieldName;

        public JsonParsingFailed(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.fieldName = str;
            this.error = str2;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fieldName;
            java.lang.String str2 = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonParsingFailed(fieldName=");
            sb.append(str);
            sb.append(", error=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed jsonParsingFailed = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fieldName, jsonParsingFailed.fieldName) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, jsonParsingFailed.error);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed copy(java.lang.String fieldName, java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed(fieldName, error);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.JsonParsingFailed jsonParsingFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = jsonParsingFailed.fieldName;
            }
            if ((i & 2) != 0) {
                str2 = jsonParsingFailed.error;
            }
            return jsonParsingFailed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$UnsupportedVersion;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "version", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$UnsupportedVersion;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedVersion implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError {
        public static final int $stable = 0;
        private final int version;

        public UnsupportedVersion(int i) {
            this.version = i;
        }

        public final int getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            int i = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedVersion(version=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.version);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.UnsupportedVersion) && this.version == ((com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.UnsupportedVersion) other).version;
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.UnsupportedVersion copy(int version) {
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.UnsupportedVersion(version);
        }

        /* renamed from: component1, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.UnsupportedVersion copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.UnsupportedVersion unsupportedVersion, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = unsupportedVersion.version;
            }
            return unsupportedVersion.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$BusinessRuleViolation;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "rule", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$BusinessRuleViolation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRule", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BusinessRuleViolation implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError {
        public static final int $stable = 0;
        private final java.lang.String reason;
        private final java.lang.String rule;

        public BusinessRuleViolation(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.rule = str;
            this.reason = str2;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String getRule() {
            return this.rule;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.rule;
            java.lang.String str2 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessRuleViolation(rule=");
            sb.append(str);
            sb.append(", reason=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.rule.hashCode() * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation businessRuleViolation = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rule, businessRuleViolation.rule) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, businessRuleViolation.reason);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation copy(java.lang.String rule, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation(rule, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRule() {
            return this.rule;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.BusinessRuleViolation businessRuleViolation, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = businessRuleViolation.rule;
            }
            if ((i & 2) != 0) {
                str2 = businessRuleViolation.reason;
            }
            return businessRuleViolation.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$Unknown;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError {
        public static final int $stable = 0;
        private final java.lang.String error;

        public Unknown(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.Unknown) other).error);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.Unknown copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.Unknown(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.Unknown copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.error;
            }
            return unknown.copy(str);
        }
    }
}
