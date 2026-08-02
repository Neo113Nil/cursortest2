package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/NetworkErrorResponse;", "", "", "errorCode", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/android/threeds/data/model/NetworkErrorResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NetworkErrorResponse {
    public static final int $stable = 0;
    private final int errorCode;
    private final java.lang.String errorMessage;

    public NetworkErrorResponse(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = i;
        this.errorMessage = str;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String toString() {
        int i = this.errorCode;
        java.lang.String str = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkErrorResponse(errorCode=");
        sb.append(i);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.NetworkErrorResponse)) {
            return false;
        }
        com.paypal.android.threeds.data.model.NetworkErrorResponse networkErrorResponse = (com.paypal.android.threeds.data.model.NetworkErrorResponse) other;
        return this.errorCode == networkErrorResponse.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, networkErrorResponse.errorMessage);
    }

    public final com.paypal.android.threeds.data.model.NetworkErrorResponse copy(int errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        return new com.paypal.android.threeds.data.model.NetworkErrorResponse(errorCode, errorMessage);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.NetworkErrorResponse copy$default(com.paypal.android.threeds.data.model.NetworkErrorResponse networkErrorResponse, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = networkErrorResponse.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = networkErrorResponse.errorMessage;
        }
        return networkErrorResponse.copy(i, str);
    }
}
