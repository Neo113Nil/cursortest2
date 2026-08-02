package com.paypal.oslo.feature.oneonboarding.validators.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationError;", "", "", "messageResId", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationErrorStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(ILcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationErrorStyle;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationErrorStyle;", "copy", "(ILcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationErrorStyle;)Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationErrorStyle;", "getStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ValidationError {
    public static final int $stable = 0;
    private final int messageResId;
    private final com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle style;

    public ValidationError(int i, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle validationErrorStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationErrorStyle, "");
        this.messageResId = i;
        this.style = validationErrorStyle;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public /* synthetic */ ValidationError(int i, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle validationErrorStyle, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle.NEGATIVE : validationErrorStyle);
    }

    public final com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle getStyle() {
        return this.style;
    }

    public final java.lang.String toString() {
        int i = this.messageResId;
        com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle validationErrorStyle = this.style;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(messageResId=");
        sb.append(i);
        sb.append(", style=");
        sb.append(validationErrorStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.messageResId) * 31) + this.style.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError validationError = (com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError) other;
        return this.messageResId == validationError.messageResId && this.style == validationError.style;
    }

    public final com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError copy(int messageResId, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        return new com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError(messageResId, style);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle getStyle() {
        return this.style;
    }

    /* renamed from: component1, reason: from getter */
    public final int getMessageResId() {
        return this.messageResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError copy$default(com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError validationError, int i, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle validationErrorStyle, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = validationError.messageResId;
        }
        if ((i2 & 2) != 0) {
            validationErrorStyle = validationError.style;
        }
        return validationError.copy(i, validationErrorStyle);
    }
}
