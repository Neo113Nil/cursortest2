package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "", "", "isChanged", "", "collectionCount", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryDetail;", "details", "<init>", "(ZILjava/util/List;)V", "component1", "()Z", "component2", "()I", "component3", "()Ljava/util/List;", "copy", "(ZILjava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", com.visa.cbp.getEncExpo.warmup, "getCollectionCount", "Ljava/util/List;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BatteryInfo {
    public static final int $stable = 8;
    private final int collectionCount;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> details;
    private final boolean isChanged;

    public BatteryInfo(boolean z, int i, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.isChanged = z;
        this.collectionCount = i;
        this.details = list;
    }

    public final boolean isChanged() {
        return this.isChanged;
    }

    public final int getCollectionCount() {
        return this.collectionCount;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> getDetails() {
        return this.details;
    }

    public final java.lang.String toString() {
        boolean z = this.isChanged;
        int i = this.collectionCount;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> list = this.details;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatteryInfo(isChanged=");
        sb.append(z);
        sb.append(", collectionCount=");
        sb.append(i);
        sb.append(", details=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isChanged) * 31) + java.lang.Integer.hashCode(this.collectionCount)) * 31) + this.details.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo) other;
        return this.isChanged == batteryInfo.isChanged && this.collectionCount == batteryInfo.collectionCount && kotlin.jvm.internal.Intrinsics.areEqual(this.details, batteryInfo.details);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo copy(boolean isChanged, int collectionCount, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo(isChanged, collectionCount, details);
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> component3() {
        return this.details;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCollectionCount() {
        return this.collectionCount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsChanged() {
        return this.isChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo, boolean z, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = batteryInfo.isChanged;
        }
        if ((i2 & 2) != 0) {
            i = batteryInfo.collectionCount;
        }
        if ((i2 & 4) != 0) {
            list = batteryInfo.details;
        }
        return batteryInfo.copy(z, i, list);
    }
}
