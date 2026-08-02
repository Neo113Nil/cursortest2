package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/payair/model/InitializeData;", "", "", "isVisaOfflinePaymentsSupported", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/payair/model/InitializeData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InitializeData {
    private final java.lang.Boolean isVisaOfflinePaymentsSupported;

    /* JADX WARN: Multi-variable type inference failed */
    public InitializeData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.Boolean isVisaOfflinePaymentsSupported() {
        return this.isVisaOfflinePaymentsSupported;
    }

    public InitializeData(java.lang.Boolean bool) {
        this.isVisaOfflinePaymentsSupported = bool;
    }

    public /* synthetic */ InitializeData(java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.isVisaOfflinePaymentsSupported;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeData(isVisaOfflinePaymentsSupported=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.isVisaOfflinePaymentsSupported;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.model.InitializeData) && kotlin.jvm.internal.Intrinsics.areEqual(this.isVisaOfflinePaymentsSupported, ((com.payair.model.InitializeData) other).isVisaOfflinePaymentsSupported);
    }

    public final com.payair.model.InitializeData copy(java.lang.Boolean isVisaOfflinePaymentsSupported) {
        return new com.payair.model.InitializeData(isVisaOfflinePaymentsSupported);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getIsVisaOfflinePaymentsSupported() {
        return this.isVisaOfflinePaymentsSupported;
    }

    public static /* synthetic */ com.payair.model.InitializeData copy$default(com.payair.model.InitializeData initializeData, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = initializeData.isVisaOfflinePaymentsSupported;
        }
        return initializeData.copy(bool);
    }
}
