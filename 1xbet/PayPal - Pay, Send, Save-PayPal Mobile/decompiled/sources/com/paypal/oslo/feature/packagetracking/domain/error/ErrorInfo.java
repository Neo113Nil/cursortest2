package com.paypal.oslo.feature.packagetracking.domain.error;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getTitle", "getBody", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ErrorInfo {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.packagetracking.domain.UiString body;
    private final java.lang.String errorCode;
    private final com.paypal.oslo.feature.packagetracking.domain.UiString title;

    public ErrorInfo(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.title = uiString;
        this.body = uiString2;
        this.errorCode = str;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.UiString getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.UiString getBody() {
        return this.body;
    }

    public /* synthetic */ ErrorInfo(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uiString, uiString2, (i & 4) != 0 ? "" : str);
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.title;
        com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.body;
        java.lang.String str = this.errorCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorInfo(title=");
        sb.append(uiString);
        sb.append(", body=");
        sb.append(uiString2);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.errorCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo = (com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, errorInfo.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, errorInfo.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, errorInfo.errorCode);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo copy(com.paypal.oslo.feature.packagetracking.domain.UiString title, com.paypal.oslo.feature.packagetracking.domain.UiString body, java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        return new com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo(title, body, errorCode);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.UiString getBody() {
        return this.body;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.UiString getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo copy$default(com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = errorInfo.title;
        }
        if ((i & 2) != 0) {
            uiString2 = errorInfo.body;
        }
        if ((i & 4) != 0) {
            str = errorInfo.errorCode;
        }
        return errorInfo.copy(uiString, uiString2, str);
    }
}
