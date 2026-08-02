package com.paypal.oslo.feature.consumerprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PermissionData;", "", "", "key", "", "values", "sharingStartTime", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PermissionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "Ljava/util/List;", "getValues", "getSharingStartTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PermissionData {
    public static final int $stable = 8;
    private final java.lang.String key;
    private final java.lang.String sharingStartTime;
    private final java.util.List<java.lang.String> values;

    public PermissionData(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        this.key = str;
        this.values = list;
        this.sharingStartTime = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    public final java.lang.String getSharingStartTime() {
        return this.sharingStartTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.key;
        java.util.List<java.lang.String> list = this.values;
        java.lang.String str2 = this.sharingStartTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PermissionData(key=");
        sb.append(str);
        sb.append(", values=");
        sb.append(list);
        sb.append(", sharingStartTime=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.key;
        int hashCode = str == null ? 0 : str.hashCode();
        java.util.List<java.lang.String> list = this.values;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.lang.String str2 = this.sharingStartTime;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData permissionData = (com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.key, permissionData.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.values, permissionData.values) && kotlin.jvm.internal.Intrinsics.areEqual(this.sharingStartTime, permissionData.sharingStartTime);
    }

    public final com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData copy(java.lang.String key, java.util.List<java.lang.String> values, java.lang.String sharingStartTime) {
        return new com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData(key, values, sharingStartTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSharingStartTime() {
        return this.sharingStartTime;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.values;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData copy$default(com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData permissionData, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = permissionData.key;
        }
        if ((i & 2) != 0) {
            list = permissionData.values;
        }
        if ((i & 4) != 0) {
            str2 = permissionData.sharingStartTime;
        }
        return permissionData.copy(str, list, str2);
    }
}
