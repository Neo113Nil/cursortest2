package com.paypal.oslo.feature.mosaic.domain.validator;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult;", "", "<init>", "()V", "", "isValid", "()Z", "", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "Valid", "Invalid", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult$Invalid;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DateFieldValidationResult {
    public static final int $stable = 0;

    private DateFieldValidationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult$Valid;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid INSTANCE = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid();

        public final int hashCode() {
            return -1062751459;
        }

        private Valid() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Valid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult$Invalid;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult$Invalid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Invalid extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(message=");
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
            return (other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid) other).message);
        }

        public final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid copy$default(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid invalid, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalid.message;
            }
            return invalid.copy(str);
        }
    }

    public final boolean isValid() {
        return this instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid;
    }

    public final java.lang.String getErrorMessage() {
        com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid invalid = this instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid ? (com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid) this : null;
        if (invalid != null) {
            return invalid.getMessage();
        }
        return null;
    }

    public /* synthetic */ DateFieldValidationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
