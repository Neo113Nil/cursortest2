package com.paypal.oslo.feature.cashin.ui.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/model/RetryStageContent;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "", "allowsRetry", "<init>", "(IIIZ)V", "component1", "()I", "component2", "component3", "component4", "()Z", "copy", "(IIIZ)Lcom/paypal/oslo/feature/cashin/ui/model/RetryStageContent;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitle", "getDescription", "getButtonText", "Z", "getAllowsRetry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RetryStageContent {
    public static final int $stable = 0;
    private final boolean allowsRetry;
    private final int buttonText;
    private final int description;
    private final int title;

    public RetryStageContent(int i, int i2, int i3, boolean z) {
        this.title = i;
        this.description = i2;
        this.buttonText = i3;
        this.allowsRetry = z;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getButtonText() {
        return this.buttonText;
    }

    public final boolean getAllowsRetry() {
        return this.allowsRetry;
    }

    public final java.lang.String toString() {
        int i = this.title;
        int i2 = this.description;
        int i3 = this.buttonText;
        boolean z = this.allowsRetry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryStageContent(title=");
        sb.append(i);
        sb.append(", description=");
        sb.append(i2);
        sb.append(", buttonText=");
        sb.append(i3);
        sb.append(", allowsRetry=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.title) * 31) + java.lang.Integer.hashCode(this.description)) * 31) + java.lang.Integer.hashCode(this.buttonText)) * 31) + java.lang.Boolean.hashCode(this.allowsRetry);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.ui.model.RetryStageContent)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.ui.model.RetryStageContent retryStageContent = (com.paypal.oslo.feature.cashin.ui.model.RetryStageContent) other;
        return this.title == retryStageContent.title && this.description == retryStageContent.description && this.buttonText == retryStageContent.buttonText && this.allowsRetry == retryStageContent.allowsRetry;
    }

    public final com.paypal.oslo.feature.cashin.ui.model.RetryStageContent copy(int title, int description, int buttonText, boolean allowsRetry) {
        return new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(title, description, buttonText, allowsRetry);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowsRetry() {
        return this.allowsRetry;
    }

    /* renamed from: component3, reason: from getter */
    public final int getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.model.RetryStageContent copy$default(com.paypal.oslo.feature.cashin.ui.model.RetryStageContent retryStageContent, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = retryStageContent.title;
        }
        if ((i4 & 2) != 0) {
            i2 = retryStageContent.description;
        }
        if ((i4 & 4) != 0) {
            i3 = retryStageContent.buttonText;
        }
        if ((i4 & 8) != 0) {
            z = retryStageContent.allowsRetry;
        }
        return retryStageContent.copy(i, i2, i3, z);
    }
}
