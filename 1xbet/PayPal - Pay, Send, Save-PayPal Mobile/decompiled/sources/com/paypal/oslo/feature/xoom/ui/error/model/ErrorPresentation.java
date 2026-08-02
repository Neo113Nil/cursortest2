package com.paypal.oslo.feature.xoom.ui.error.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/error/model/ErrorPresentation;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "primaryButtonText", "secondaryButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/ui/error/model/ErrorPresentation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "getPrimaryButtonText", "getSecondaryButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ErrorPresentation {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String primaryButtonText;
    private final java.lang.String secondaryButtonText;
    private final java.lang.String title;

    public ErrorPresentation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.description = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public /* synthetic */ ErrorPresentation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final java.lang.String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.primaryButtonText;
        java.lang.String str4 = this.secondaryButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorPresentation(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", primaryButtonText=");
        sb.append(str3);
        sb.append(", secondaryButtonText=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        int hashCode2 = this.description.hashCode();
        int hashCode3 = this.primaryButtonText.hashCode();
        java.lang.String str = this.secondaryButtonText;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation)) {
            return false;
        }
        com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation errorPresentation = (com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, errorPresentation.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, errorPresentation.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryButtonText, errorPresentation.primaryButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryButtonText, errorPresentation.secondaryButtonText);
    }

    public final com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation copy(java.lang.String title, java.lang.String description, java.lang.String primaryButtonText, java.lang.String secondaryButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryButtonText, "");
        return new com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation(title, description, primaryButtonText, secondaryButtonText);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation copy$default(com.paypal.oslo.feature.xoom.ui.error.model.ErrorPresentation errorPresentation, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = errorPresentation.title;
        }
        if ((i & 2) != 0) {
            str2 = errorPresentation.description;
        }
        if ((i & 4) != 0) {
            str3 = errorPresentation.primaryButtonText;
        }
        if ((i & 8) != 0) {
            str4 = errorPresentation.secondaryButtonText;
        }
        return errorPresentation.copy(str, str2, str3, str4);
    }
}
