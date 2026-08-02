package com.paypal.oslo.feature.helpcenter.domain.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;", "", "", "phoneNumber", "estimatedWaitTime", "hoursOfOperation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getEstimatedWaitTime", "getHoursOfOperation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CallUsServiceInfo {
    public static final int $stable = 0;
    private final java.lang.String estimatedWaitTime;
    private final java.lang.String hoursOfOperation;
    private final java.lang.String phoneNumber;

    public CallUsServiceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.phoneNumber = str;
        this.estimatedWaitTime = str2;
        this.hoursOfOperation = str3;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.lang.String getEstimatedWaitTime() {
        return this.estimatedWaitTime;
    }

    public final java.lang.String getHoursOfOperation() {
        return this.hoursOfOperation;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.phoneNumber;
        java.lang.String str2 = this.estimatedWaitTime;
        java.lang.String str3 = this.hoursOfOperation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallUsServiceInfo(phoneNumber=");
        sb.append(str);
        sb.append(", estimatedWaitTime=");
        sb.append(str2);
        sb.append(", hoursOfOperation=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.phoneNumber.hashCode();
        java.lang.String str = this.estimatedWaitTime;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.hoursOfOperation;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo = (com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, callUsServiceInfo.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedWaitTime, callUsServiceInfo.estimatedWaitTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.hoursOfOperation, callUsServiceInfo.hoursOfOperation);
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo copy(java.lang.String phoneNumber, java.lang.String estimatedWaitTime, java.lang.String hoursOfOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        return new com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo(phoneNumber, estimatedWaitTime, hoursOfOperation);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHoursOfOperation() {
        return this.hoursOfOperation;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEstimatedWaitTime() {
        return this.estimatedWaitTime;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo copy$default(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = callUsServiceInfo.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = callUsServiceInfo.estimatedWaitTime;
        }
        if ((i & 4) != 0) {
            str3 = callUsServiceInfo.hoursOfOperation;
        }
        return callUsServiceInfo.copy(str, str2, str3);
    }
}
