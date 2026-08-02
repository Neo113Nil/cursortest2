package com.paypal.oslo.feature.activity.ui.detail.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;", "", "", "title", "email", "optionType", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getEmail", "getOptionType", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RequestRefundData {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String email;
    private final java.lang.String optionType;
    private final java.lang.String title;

    public RequestRefundData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.email = str2;
        this.optionType = str3;
        this.description = str4;
    }

    public /* synthetic */ RequestRefundData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getOptionType() {
        return this.optionType;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.email;
        java.lang.String str3 = this.optionType;
        java.lang.String str4 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRefundData(title=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", optionType=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.email.hashCode();
        java.lang.String str2 = this.optionType;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.description;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData requestRefundData = (com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, requestRefundData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, requestRefundData.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionType, requestRefundData.optionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, requestRefundData.description);
    }

    public final com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData copy(java.lang.String title, java.lang.String email, java.lang.String optionType, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        return new com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData(title, email, optionType, description);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOptionType() {
        return this.optionType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData copy$default(com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData requestRefundData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestRefundData.title;
        }
        if ((i & 2) != 0) {
            str2 = requestRefundData.email;
        }
        if ((i & 4) != 0) {
            str3 = requestRefundData.optionType;
        }
        if ((i & 8) != 0) {
            str4 = requestRefundData.description;
        }
        return requestRefundData.copy(str, str2, str3, str4);
    }
}
