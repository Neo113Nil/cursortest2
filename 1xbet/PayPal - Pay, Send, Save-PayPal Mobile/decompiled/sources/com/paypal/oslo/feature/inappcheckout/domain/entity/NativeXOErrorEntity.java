package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "", "", "errorName", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "isRecoverable", "correlationId", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorName", "getDescription", "Z", "getCorrelationId", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NativeXOErrorEntity {
    public static final int $stable = 0;
    private final java.lang.String correlationId;
    private final java.lang.String description;
    private final java.lang.String errorName;
    private final boolean isRecoverable;
    private final java.lang.String returnUrl;

    public NativeXOErrorEntity(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.errorName = str;
        this.description = str2;
        this.isRecoverable = z;
        this.correlationId = str3;
        this.returnUrl = str4;
    }

    public /* synthetic */ NativeXOErrorEntity(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
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

    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.errorName;
        java.lang.String str2 = this.description;
        boolean z = this.isRecoverable;
        java.lang.String str3 = this.correlationId;
        java.lang.String str4 = this.returnUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeXOErrorEntity(errorName=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", isRecoverable=");
        sb.append(z);
        sb.append(", correlationId=");
        sb.append(str3);
        sb.append(", returnUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.errorName.hashCode();
        int hashCode2 = this.description.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isRecoverable);
        java.lang.String str = this.correlationId;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.returnUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorName, nativeXOErrorEntity.errorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, nativeXOErrorEntity.description) && this.isRecoverable == nativeXOErrorEntity.isRecoverable && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, nativeXOErrorEntity.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, nativeXOErrorEntity.returnUrl);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity copy(java.lang.String errorName, java.lang.String description, boolean isRecoverable, java.lang.String correlationId, java.lang.String returnUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(errorName, description, isRecoverable, correlationId, returnUrl);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
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

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = nativeXOErrorEntity.errorName;
        }
        if ((i & 2) != 0) {
            str2 = nativeXOErrorEntity.description;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            z = nativeXOErrorEntity.isRecoverable;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = nativeXOErrorEntity.correlationId;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = nativeXOErrorEntity.returnUrl;
        }
        return nativeXOErrorEntity.copy(str, str5, z2, str6, str4);
    }
}
