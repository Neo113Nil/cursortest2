package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FaceScanError {
    public static final int $stable = 0;
    private final java.lang.String description;

    public FaceScanError(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FaceScanError(description=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError) other).description);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError copy(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError(description);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError copy$default(com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError faceScanError, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = faceScanError.description;
        }
        return faceScanError.copy(str);
    }
}
