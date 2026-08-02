package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ6\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentPermission;", "", "", "", "values", "permissionKey", "firstSharingTime", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentPermission;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getValues", "Ljava/lang/String;", "getPermissionKey", "getFirstSharingTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConsentPermission {
    public static final int $stable = 8;
    private final java.lang.String firstSharingTime;
    private final java.lang.String permissionKey;
    private final java.util.List<java.lang.String> values;

    public ConsentPermission(java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.values = list;
        this.permissionKey = str;
        this.firstSharingTime = str2;
    }

    public final java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    public final java.lang.String getPermissionKey() {
        return this.permissionKey;
    }

    public final java.lang.String getFirstSharingTime() {
        return this.firstSharingTime;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.values;
        java.lang.String str = this.permissionKey;
        java.lang.String str2 = this.firstSharingTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentPermission(values=");
        sb.append(list);
        sb.append(", permissionKey=");
        sb.append(str);
        sb.append(", firstSharingTime=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.values.hashCode();
        int hashCode2 = this.permissionKey.hashCode();
        java.lang.String str = this.firstSharingTime;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission consentPermission = (com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.values, consentPermission.values) && kotlin.jvm.internal.Intrinsics.areEqual(this.permissionKey, consentPermission.permissionKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstSharingTime, consentPermission.firstSharingTime);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission copy(java.util.List<java.lang.String> values, java.lang.String permissionKey, java.lang.String firstSharingTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionKey, "");
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission(values, permissionKey, firstSharingTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFirstSharingTime() {
        return this.firstSharingTime;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPermissionKey() {
        return this.permissionKey;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission copy$default(com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission consentPermission, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = consentPermission.values;
        }
        if ((i & 2) != 0) {
            str = consentPermission.permissionKey;
        }
        if ((i & 4) != 0) {
            str2 = consentPermission.firstSharingTime;
        }
        return consentPermission.copy(list, str, str2);
    }
}
