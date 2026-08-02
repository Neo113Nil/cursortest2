package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorEvent;", "", "", "sdkTransactionID", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "errorMessage", "<init>", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/ErrorMessage;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/android/threeds/data/model/ErrorMessage;", "copy", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/ErrorMessage;)Lcom/paypal/android/threeds/data/model/ProtocolErrorEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSdkTransactionID", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ProtocolErrorEvent {
    public static final int $stable = 0;
    private final com.paypal.android.threeds.data.model.ErrorMessage errorMessage;
    private final java.lang.String sdkTransactionID;

    public ProtocolErrorEvent(java.lang.String str, com.paypal.android.threeds.data.model.ErrorMessage errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        this.sdkTransactionID = str;
        this.errorMessage = errorMessage;
    }

    public final java.lang.String getSdkTransactionID() {
        return this.sdkTransactionID;
    }

    public final com.paypal.android.threeds.data.model.ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sdkTransactionID;
        com.paypal.android.threeds.data.model.ErrorMessage errorMessage = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProtocolErrorEvent(sdkTransactionID=");
        sb.append(str);
        sb.append(", errorMessage=");
        sb.append(errorMessage);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.sdkTransactionID.hashCode() * 31) + this.errorMessage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.ProtocolErrorEvent)) {
            return false;
        }
        com.paypal.android.threeds.data.model.ProtocolErrorEvent protocolErrorEvent = (com.paypal.android.threeds.data.model.ProtocolErrorEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sdkTransactionID, protocolErrorEvent.sdkTransactionID) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, protocolErrorEvent.errorMessage);
    }

    public final com.paypal.android.threeds.data.model.ProtocolErrorEvent copy(java.lang.String sdkTransactionID, com.paypal.android.threeds.data.model.ErrorMessage errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTransactionID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        return new com.paypal.android.threeds.data.model.ProtocolErrorEvent(sdkTransactionID, errorMessage);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.threeds.data.model.ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSdkTransactionID() {
        return this.sdkTransactionID;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.ProtocolErrorEvent copy$default(com.paypal.android.threeds.data.model.ProtocolErrorEvent protocolErrorEvent, java.lang.String str, com.paypal.android.threeds.data.model.ErrorMessage errorMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = protocolErrorEvent.sdkTransactionID;
        }
        if ((i & 2) != 0) {
            errorMessage = protocolErrorEvent.errorMessage;
        }
        return protocolErrorEvent.copy(str, errorMessage);
    }
}
