package com.paypal.oslo.feature.helpcenter.domain.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsData;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;", "paypalService", "creditService", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;", "component2", "copy", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;)Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;", "getPaypalService", "getCreditService"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CallUsData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo creditService;
    private final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo paypalService;

    public CallUsData(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo2) {
        this.paypalService = callUsServiceInfo;
        this.creditService = callUsServiceInfo2;
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo getPaypalService() {
        return this.paypalService;
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo getCreditService() {
        return this.creditService;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo = this.paypalService;
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo2 = this.creditService;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallUsData(paypalService=");
        sb.append(callUsServiceInfo);
        sb.append(", creditService=");
        sb.append(callUsServiceInfo2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo = this.paypalService;
        int hashCode = callUsServiceInfo == null ? 0 : callUsServiceInfo.hashCode();
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo2 = this.creditService;
        return (hashCode * 31) + (callUsServiceInfo2 != null ? callUsServiceInfo2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.domain.models.CallUsData)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsData callUsData = (com.paypal.oslo.feature.helpcenter.domain.models.CallUsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paypalService, callUsData.paypalService) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditService, callUsData.creditService);
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.CallUsData copy(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo paypalService, com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo creditService) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.CallUsData(paypalService, creditService);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo getCreditService() {
        return this.creditService;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo getPaypalService() {
        return this.paypalService;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.CallUsData copy$default(com.paypal.oslo.feature.helpcenter.domain.models.CallUsData callUsData, com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            callUsServiceInfo = callUsData.paypalService;
        }
        if ((i & 2) != 0) {
            callUsServiceInfo2 = callUsData.creditService;
        }
        return callUsData.copy(callUsServiceInfo, callUsServiceInfo2);
    }
}
