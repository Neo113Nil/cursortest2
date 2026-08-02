package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PublicKeyCredentialParameter;", "", "", "type", "", "algorithm", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PublicKeyCredentialParameter;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getType", com.visa.cbp.getEncExpo.warmup, "getAlgorithm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PublicKeyCredentialParameter {
    public static final int $stable = 0;
    private final int algorithm;
    private final java.lang.String type;

    public PublicKeyCredentialParameter(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.algorithm = i;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final int getAlgorithm() {
        return this.algorithm;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        int i = this.algorithm;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialParameter(type=");
        sb.append(str);
        sb.append(", algorithm=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + java.lang.Integer.hashCode(this.algorithm);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter publicKeyCredentialParameter = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, publicKeyCredentialParameter.type) && this.algorithm == publicKeyCredentialParameter.algorithm;
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter copy(java.lang.String type, int algorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter(type, algorithm);
    }

    /* renamed from: component2, reason: from getter */
    public final int getAlgorithm() {
        return this.algorithm;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter publicKeyCredentialParameter, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = publicKeyCredentialParameter.type;
        }
        if ((i2 & 2) != 0) {
            i = publicKeyCredentialParameter.algorithm;
        }
        return publicKeyCredentialParameter.copy(str, i);
    }
}
