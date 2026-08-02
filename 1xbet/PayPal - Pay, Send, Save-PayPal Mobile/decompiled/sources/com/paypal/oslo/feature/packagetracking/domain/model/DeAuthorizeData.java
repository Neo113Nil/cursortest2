package com.paypal.oslo.feature.packagetracking.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/DeAuthorizeData;", "", "", "deauthorized", "dataDeleted", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(ZZLcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Z", "component2", "component3", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(ZZLcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/model/DeAuthorizeData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getDeauthorized", "getDataDeleted", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeAuthorizeData {
    public static final int $stable = 0;
    private final boolean dataDeleted;
    private final boolean deauthorized;
    private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

    public DeAuthorizeData(boolean z, boolean z2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        this.deauthorized = z;
        this.dataDeleted = z2;
        this.emailProvider = emailProvider;
    }

    public final boolean getDeauthorized() {
        return this.deauthorized;
    }

    public final boolean getDataDeleted() {
        return this.dataDeleted;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
        return this.emailProvider;
    }

    public final java.lang.String toString() {
        boolean z = this.deauthorized;
        boolean z2 = this.dataDeleted;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeAuthorizeData(deauthorized=");
        sb.append(z);
        sb.append(", dataDeleted=");
        sb.append(z2);
        sb.append(", emailProvider=");
        sb.append(emailProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.deauthorized);
        int hashCode2 = java.lang.Boolean.hashCode(this.dataDeleted);
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
        return (((hashCode * 31) + hashCode2) * 31) + (emailProvider == null ? 0 : emailProvider.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData deAuthorizeData = (com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData) other;
        return this.deauthorized == deAuthorizeData.deauthorized && this.dataDeleted == deAuthorizeData.dataDeleted && this.emailProvider == deAuthorizeData.emailProvider;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData copy(boolean deauthorized, boolean dataDeleted, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        return new com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData(deauthorized, dataDeleted, emailProvider);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
        return this.emailProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDataDeleted() {
        return this.dataDeleted;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDeauthorized() {
        return this.deauthorized;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData copy$default(com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData deAuthorizeData, boolean z, boolean z2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = deAuthorizeData.deauthorized;
        }
        if ((i & 2) != 0) {
            z2 = deAuthorizeData.dataDeleted;
        }
        if ((i & 4) != 0) {
            emailProvider = deAuthorizeData.emailProvider;
        }
        return deAuthorizeData.copy(z, z2, emailProvider);
    }
}
