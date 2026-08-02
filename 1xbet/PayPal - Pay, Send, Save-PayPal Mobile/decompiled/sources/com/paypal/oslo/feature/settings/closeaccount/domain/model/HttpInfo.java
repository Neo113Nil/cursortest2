package com.paypal.oslo.feature.settings.closeaccount.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/HttpInfo;", "", "", "status", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/HttpInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HttpInfo {
    public static final int $stable = 0;
    private final int status;

    public HttpInfo(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        int i = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpInfo(status=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.status);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo) && this.status == ((com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo) other).status;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo copy(int status) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo(status);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo httpInfo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = httpInfo.status;
        }
        return httpInfo.copy(i);
    }
}
