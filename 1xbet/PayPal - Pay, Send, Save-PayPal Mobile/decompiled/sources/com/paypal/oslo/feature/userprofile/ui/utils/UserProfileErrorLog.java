package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileErrorLog;", "", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "", "error", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileErrorLog;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getAttributes", "getFailure", "Ljava/lang/Throwable;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserProfileErrorLog {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Object> attributes;
    private final java.lang.Throwable error;
    private final java.lang.String failure;
    private final java.lang.String message;

    public UserProfileErrorLog(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str2, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.message = str;
        this.attributes = map;
        this.failure = str2;
        this.error = th;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public /* synthetic */ UserProfileErrorLog(java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, str2, (i & 8) != 0 ? null : th);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return this.attributes;
    }

    public final java.lang.String getFailure() {
        return this.failure;
    }

    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
        java.lang.String str2 = this.failure;
        java.lang.Throwable th = this.error;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfileErrorLog(message=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", failure=");
        sb.append(str2);
        sb.append(", error=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        int hashCode2 = this.attributes.hashCode();
        int hashCode3 = this.failure.hashCode();
        java.lang.Throwable th = this.error;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (th == null ? 0 : th.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog userProfileErrorLog = (com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, userProfileErrorLog.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, userProfileErrorLog.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.failure, userProfileErrorLog.failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, userProfileErrorLog.error);
    }

    public final com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog copy(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.lang.String failure, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        return new com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog(message, attributes, failure, error);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Throwable getError() {
        return this.error;
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
    public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog copy$default(com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog userProfileErrorLog, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userProfileErrorLog.message;
        }
        if ((i & 2) != 0) {
            map = userProfileErrorLog.attributes;
        }
        if ((i & 4) != 0) {
            str2 = userProfileErrorLog.failure;
        }
        if ((i & 8) != 0) {
            th = userProfileErrorLog.error;
        }
        return userProfileErrorLog.copy(str, map, str2, th);
    }
}
