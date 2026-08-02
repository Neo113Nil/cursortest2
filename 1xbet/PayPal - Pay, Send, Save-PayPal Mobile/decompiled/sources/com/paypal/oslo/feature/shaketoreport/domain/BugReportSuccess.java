package com.paypal.oslo.feature.shaketoreport.domain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "", "", "message", "", "mediaAttached", "correlationId", "paypalDebugId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z", "getMediaAttached", "getCorrelationId", "getPaypalDebugId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BugReportSuccess {
    public static final int $stable = 0;
    private final java.lang.String correlationId;
    private final boolean mediaAttached;
    private final java.lang.String message;
    private final java.lang.String paypalDebugId;

    public BugReportSuccess(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.mediaAttached = z;
        this.correlationId = str2;
        this.paypalDebugId = str3;
    }

    public /* synthetic */ BugReportSuccess(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final boolean getMediaAttached() {
        return this.mediaAttached;
    }

    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public final java.lang.String getPaypalDebugId() {
        return this.paypalDebugId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        boolean z = this.mediaAttached;
        java.lang.String str2 = this.correlationId;
        java.lang.String str3 = this.paypalDebugId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BugReportSuccess(message=");
        sb.append(str);
        sb.append(", mediaAttached=");
        sb.append(z);
        sb.append(", correlationId=");
        sb.append(str2);
        sb.append(", paypalDebugId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.mediaAttached);
        java.lang.String str = this.correlationId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.paypalDebugId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess = (com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, bugReportSuccess.message) && this.mediaAttached == bugReportSuccess.mediaAttached && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, bugReportSuccess.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalDebugId, bugReportSuccess.paypalDebugId);
    }

    public final com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess copy(java.lang.String message, boolean mediaAttached, java.lang.String correlationId, java.lang.String paypalDebugId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess(message, mediaAttached, correlationId, paypalDebugId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPaypalDebugId() {
        return this.paypalDebugId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMediaAttached() {
        return this.mediaAttached;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess copy$default(com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bugReportSuccess.message;
        }
        if ((i & 2) != 0) {
            z = bugReportSuccess.mediaAttached;
        }
        if ((i & 4) != 0) {
            str2 = bugReportSuccess.correlationId;
        }
        if ((i & 8) != 0) {
            str3 = bugReportSuccess.paypalDebugId;
        }
        return bugReportSuccess.copy(str, z, str2, str3);
    }
}
