package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileLog;", "", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileLog;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getAttributes", "getFailure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserProfileLog {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Object> attributes;
    private final java.lang.String failure;
    private final java.lang.String message;

    public UserProfileLog(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.message = str;
        this.attributes = map;
        this.failure = str2;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public /* synthetic */ UserProfileLog(java.lang.String str, java.util.Map map, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 4) != 0 ? null : str2);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return this.attributes;
    }

    public final java.lang.String getFailure() {
        return this.failure;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
        java.lang.String str2 = this.failure;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfileLog(message=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", failure=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        int hashCode2 = this.attributes.hashCode();
        java.lang.String str = this.failure;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog userProfileLog = (com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, userProfileLog.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, userProfileLog.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.failure, userProfileLog.failure);
    }

    public final com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog copy(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.lang.String failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        return new com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog(message, attributes, failure);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFailure() {
        return this.failure;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
        return this.attributes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog copy$default(com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog userProfileLog, java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userProfileLog.message;
        }
        if ((i & 2) != 0) {
            map = userProfileLog.attributes;
        }
        if ((i & 4) != 0) {
            str2 = userProfileLog.failure;
        }
        return userProfileLog.copy(str, map, str2);
    }
}
