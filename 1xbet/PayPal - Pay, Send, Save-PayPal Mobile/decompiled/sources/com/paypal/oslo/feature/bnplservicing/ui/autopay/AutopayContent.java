package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayContent;", "", "", "autopayStatus", "", "title", "message", "buttonText", "", "iconResId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayContent;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Z", "getAutopayStatus", "Ljava/lang/String;", "getTitle", "getMessage", "getButtonText", "Ljava/lang/Integer;", "getIconResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutopayContent {
    public static final int $stable = 0;
    private final boolean autopayStatus;
    private final java.lang.String buttonText;
    private final java.lang.Integer iconResId;
    private final java.lang.String message;
    private final java.lang.String title;

    public AutopayContent(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.autopayStatus = z;
        this.title = str;
        this.message = str2;
        this.buttonText = str3;
        this.iconResId = num;
    }

    public /* synthetic */ AutopayContent(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : num);
    }

    public final boolean getAutopayStatus() {
        return this.autopayStatus;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    public final java.lang.Integer getIconResId() {
        return this.iconResId;
    }

    public final java.lang.String toString() {
        boolean z = this.autopayStatus;
        java.lang.String str = this.title;
        java.lang.String str2 = this.message;
        java.lang.String str3 = this.buttonText;
        java.lang.Integer num = this.iconResId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayContent(autopayStatus=");
        sb.append(z);
        sb.append(", title=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", buttonText=");
        sb.append(str3);
        sb.append(", iconResId=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.autopayStatus);
        int hashCode2 = this.title.hashCode();
        int hashCode3 = this.message.hashCode();
        int hashCode4 = this.buttonText.hashCode();
        java.lang.Integer num = this.iconResId;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent autopayContent = (com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent) other;
        return this.autopayStatus == autopayContent.autopayStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.title, autopayContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, autopayContent.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, autopayContent.buttonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconResId, autopayContent.iconResId);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent copy(boolean autopayStatus, java.lang.String title, java.lang.String message, java.lang.String buttonText, java.lang.Integer iconResId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent(autopayStatus, title, message, buttonText, iconResId);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getIconResId() {
        return this.iconResId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutopayStatus() {
        return this.autopayStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent autopayContent, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = autopayContent.autopayStatus;
        }
        if ((i & 2) != 0) {
            str = autopayContent.title;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = autopayContent.message;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = autopayContent.buttonText;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            num = autopayContent.iconResId;
        }
        return autopayContent.copy(z, str4, str5, str6, num);
    }

    public AutopayContent() {
        this(false, null, null, null, null, 31, null);
    }
}
