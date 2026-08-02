package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ErrorNode;", "", "", "code", "message", "field", "severity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ErrorNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getMessage", "getField", "getSeverity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ErrorNode {
    public static final int $stable = 0;
    private final java.lang.String code;
    private final java.lang.String field;
    private final java.lang.String message;
    private final java.lang.String severity;

    public ErrorNode(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.code = str;
        this.message = str2;
        this.field = str3;
        this.severity = str4;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getField() {
        return this.field;
    }

    public /* synthetic */ ErrorNode(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "ERROR" : str4);
    }

    public final java.lang.String getSeverity() {
        return this.severity;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.message;
        java.lang.String str3 = this.field;
        java.lang.String str4 = this.severity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorNode(code=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", field=");
        sb.append(str3);
        sb.append(", severity=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.code.hashCode();
        int hashCode2 = this.message.hashCode();
        java.lang.String str = this.field;
        return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.severity.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode errorNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, errorNode.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, errorNode.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, errorNode.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.severity, errorNode.severity);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode copy(java.lang.String code, java.lang.String message, java.lang.String field, java.lang.String severity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(severity, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode(code, message, field, severity);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSeverity() {
        return this.severity;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getField() {
        return this.field;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode errorNode, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = errorNode.code;
        }
        if ((i & 2) != 0) {
            str2 = errorNode.message;
        }
        if ((i & 4) != 0) {
            str3 = errorNode.field;
        }
        if ((i & 8) != 0) {
            str4 = errorNode.severity;
        }
        return errorNode.copy(str, str2, str3, str4);
    }
}
