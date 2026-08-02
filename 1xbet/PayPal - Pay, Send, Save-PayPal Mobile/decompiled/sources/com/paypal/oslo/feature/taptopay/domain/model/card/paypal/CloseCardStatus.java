package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CloseCardStatus;", "", "", "deviceId", "id", "", "isSuccessful", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CloseCardStatus;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "getId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CloseCardStatus {
    public static final int $stable = 0;
    private final java.lang.String deviceId;
    private final java.lang.String id;
    private final boolean isSuccessful;

    public CloseCardStatus(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.deviceId = str;
        this.id = str2;
        this.isSuccessful = z;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        java.lang.String str2 = this.id;
        boolean z = this.isSuccessful;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseCardStatus(deviceId=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", isSuccessful=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.deviceId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.id.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSuccessful);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus closeCardStatus = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, closeCardStatus.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, closeCardStatus.id) && this.isSuccessful == closeCardStatus.isSuccessful;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus copy(java.lang.String deviceId, java.lang.String id, boolean isSuccessful) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus(deviceId, id, isSuccessful);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CloseCardStatus closeCardStatus, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = closeCardStatus.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = closeCardStatus.id;
        }
        if ((i & 4) != 0) {
            z = closeCardStatus.isSuccessful;
        }
        return closeCardStatus.copy(str, str2, z);
    }
}
