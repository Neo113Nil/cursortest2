package com.paypal.oslo.core.permission.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionRequest;", "", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "type", "", "reason", "moduleName", "<init>", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/permission/domain/model/PermissionRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "getType", "Ljava/lang/String;", "getReason", "getModuleName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PermissionRequest {
    public static final int $stable = 0;
    private final java.lang.String moduleName;
    private final java.lang.String reason;
    private final com.paypal.oslo.core.permission.domain.model.PermissionType type;

    public PermissionRequest(com.paypal.oslo.core.permission.domain.model.PermissionType permissionType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.type = permissionType;
        this.reason = str;
        this.moduleName = str2;
    }

    public final com.paypal.oslo.core.permission.domain.model.PermissionType getType() {
        return this.type;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final java.lang.String getModuleName() {
        return this.moduleName;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.permission.domain.model.PermissionType permissionType = this.type;
        java.lang.String str = this.reason;
        java.lang.String str2 = this.moduleName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PermissionRequest(type=");
        sb.append(permissionType);
        sb.append(", reason=");
        sb.append(str);
        sb.append(", moduleName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.reason.hashCode()) * 31) + this.moduleName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionRequest)) {
            return false;
        }
        com.paypal.oslo.core.permission.domain.model.PermissionRequest permissionRequest = (com.paypal.oslo.core.permission.domain.model.PermissionRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, permissionRequest.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, permissionRequest.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.moduleName, permissionRequest.moduleName);
    }

    public final com.paypal.oslo.core.permission.domain.model.PermissionRequest copy(com.paypal.oslo.core.permission.domain.model.PermissionType type, java.lang.String reason, java.lang.String moduleName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleName, "");
        return new com.paypal.oslo.core.permission.domain.model.PermissionRequest(type, reason, moduleName);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getModuleName() {
        return this.moduleName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.permission.domain.model.PermissionType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.core.permission.domain.model.PermissionRequest copy$default(com.paypal.oslo.core.permission.domain.model.PermissionRequest permissionRequest, com.paypal.oslo.core.permission.domain.model.PermissionType permissionType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            permissionType = permissionRequest.type;
        }
        if ((i & 2) != 0) {
            str = permissionRequest.reason;
        }
        if ((i & 4) != 0) {
            str2 = permissionRequest.moduleName;
        }
        return permissionRequest.copy(permissionType, str, str2);
    }
}
