package com.paypal.oslo.feature.mosaic.domain.validator;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "message", "(Landroid/content/Context;)Ljava/lang/String;", "EmptyField", "InvalidFormat", "FutureDate", "MinAgeNotMet", "MaxAgeExceeded", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$EmptyField;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$FutureDate;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$InvalidFormat;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$MaxAgeExceeded;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$MinAgeNotMet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DateFieldError {
    public static final int $stable = 0;

    private DateFieldError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$EmptyField;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyField extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.EmptyField INSTANCE = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.EmptyField();

        public final int hashCode() {
            return -107995284;
        }

        private EmptyField() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyField";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.EmptyField)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$InvalidFormat;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidFormat extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.InvalidFormat INSTANCE = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.InvalidFormat();

        public final int hashCode() {
            return 2004584623;
        }

        private InvalidFormat() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidFormat";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.InvalidFormat)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$FutureDate;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FutureDate extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.FutureDate INSTANCE = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.FutureDate();

        public final int hashCode() {
            return 1511654352;
        }

        private FutureDate() {
            super(null);
        }

        public final java.lang.String toString() {
            return "FutureDate";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.FutureDate)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$MinAgeNotMet;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError;", "", "minAge", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$MinAgeNotMet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMinAge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MinAgeNotMet extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError {
        public static final int $stable = 0;
        private final int minAge;

        public MinAgeNotMet(int i) {
            super(null);
            this.minAge = i;
        }

        public final int getMinAge() {
            return this.minAge;
        }

        public final java.lang.String toString() {
            int i = this.minAge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MinAgeNotMet(minAge=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.minAge);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet) && this.minAge == ((com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet) other).minAge;
        }

        public final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet copy(int minAge) {
            return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet(minAge);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMinAge() {
            return this.minAge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet copy$default(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet minAgeNotMet, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = minAgeNotMet.minAge;
            }
            return minAgeNotMet.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$MaxAgeExceeded;", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError;", "", "maxAge", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldError$MaxAgeExceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMaxAge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxAgeExceeded extends com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError {
        public static final int $stable = 0;
        private final int maxAge;

        public MaxAgeExceeded(int i) {
            super(null);
            this.maxAge = i;
        }

        public final int getMaxAge() {
            return this.maxAge;
        }

        public final java.lang.String toString() {
            int i = this.maxAge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxAgeExceeded(maxAge=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.maxAge);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded) && this.maxAge == ((com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded) other).maxAge;
        }

        public final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded copy(int maxAge) {
            return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded(maxAge);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxAge() {
            return this.maxAge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded copy$default(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded maxAgeExceeded, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = maxAgeExceeded.maxAge;
            }
            return maxAgeExceeded.copy(i);
        }
    }

    public final java.lang.String message(android.content.Context context) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.EmptyField.INSTANCE)) {
            java.lang.String string = context.getString(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_empty_field);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.InvalidFormat.INSTANCE)) {
            java.lang.String string2 = context.getString(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_invalid_format);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.FutureDate.INSTANCE)) {
            java.lang.String string3 = context.getString(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_future_date);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (this instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet) {
            com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet minAgeNotMet = (com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet) this;
            if (minAgeNotMet.getMinAge() == 1) {
                i2 = com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_min_age_not_met_quantity_one;
            } else {
                i2 = com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_min_age_not_met_quantity_other;
            }
            java.lang.String string4 = context.getString(i2, java.lang.Integer.valueOf(minAgeNotMet.getMinAge()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (!(this instanceof com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded maxAgeExceeded = (com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded) this;
        if (maxAgeExceeded.getMaxAge() == 1) {
            i = com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_max_age_exceeded_quantity_one;
        } else {
            i = com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_date_field_error_max_age_exceeded_quantity_other;
        }
        java.lang.String string5 = context.getString(i, java.lang.Integer.valueOf(maxAgeExceeded.getMaxAge()));
        kotlin.jvm.internal.Intrinsics.checkNotNull(string5);
        return string5;
    }

    public /* synthetic */ DateFieldError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
