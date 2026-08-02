package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/payair/model/TokensCardReference;", "", "", "csdkCardReference", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/payair/model/TokensCardReference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCsdkCardReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TokensCardReference {
    private final java.lang.String csdkCardReference;

    public TokensCardReference(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.csdkCardReference = str;
    }

    public final java.lang.String getCsdkCardReference() {
        return this.csdkCardReference;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.csdkCardReference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokensCardReference(csdkCardReference=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.csdkCardReference.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.model.TokensCardReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.csdkCardReference, ((com.payair.model.TokensCardReference) other).csdkCardReference);
    }

    public final com.payair.model.TokensCardReference copy(java.lang.String csdkCardReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(csdkCardReference, "");
        return new com.payair.model.TokensCardReference(csdkCardReference);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCsdkCardReference() {
        return this.csdkCardReference;
    }

    public static /* synthetic */ com.payair.model.TokensCardReference copy$default(com.payair.model.TokensCardReference tokensCardReference, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tokensCardReference.csdkCardReference;
        }
        return tokensCardReference.copy(str);
    }
}
