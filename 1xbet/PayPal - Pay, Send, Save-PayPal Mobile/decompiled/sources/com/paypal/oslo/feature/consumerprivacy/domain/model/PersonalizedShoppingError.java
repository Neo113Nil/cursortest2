package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "", "", "errorName", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "isRecoverable", "correlationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorName", "getDescription", "Z", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PersonalizedShoppingError {
    public static final int $stable = 0;
    private final java.lang.String correlationId;
    private final java.lang.String description;
    private final java.lang.String errorName;
    private final boolean isRecoverable;

    public PersonalizedShoppingError(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.errorName = str;
        this.description = str2;
        this.isRecoverable = z;
        this.correlationId = str3;
    }

    public /* synthetic */ PersonalizedShoppingError(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getErrorName() {
        return this.errorName;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final boolean isRecoverable() {
        return this.isRecoverable;
    }

    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.errorName;
        java.lang.String str2 = this.description;
        boolean z = this.isRecoverable;
        java.lang.String str3 = this.correlationId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalizedShoppingError(errorName=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", isRecoverable=");
        sb.append(z);
        sb.append(", correlationId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.errorName.hashCode();
        int hashCode2 = this.description.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isRecoverable);
        java.lang.String str = this.correlationId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError personalizedShoppingError = (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorName, personalizedShoppingError.errorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, personalizedShoppingError.description) && this.isRecoverable == personalizedShoppingError.isRecoverable && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, personalizedShoppingError.correlationId);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError copy(java.lang.String errorName, java.lang.String description, boolean isRecoverable, java.lang.String correlationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError(errorName, description, isRecoverable, correlationId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRecoverable() {
        return this.isRecoverable;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getErrorName() {
        return this.errorName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError copy$default(com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError personalizedShoppingError, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = personalizedShoppingError.errorName;
        }
        if ((i & 2) != 0) {
            str2 = personalizedShoppingError.description;
        }
        if ((i & 4) != 0) {
            z = personalizedShoppingError.isRecoverable;
        }
        if ((i & 8) != 0) {
            str3 = personalizedShoppingError.correlationId;
        }
        return personalizedShoppingError.copy(str, str2, z, str3);
    }
}
