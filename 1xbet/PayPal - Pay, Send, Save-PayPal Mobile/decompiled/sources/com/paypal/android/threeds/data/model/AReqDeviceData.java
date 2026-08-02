package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/android/threeds/data/model/AReqDeviceData;", "", "", "deviceChannel", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/AReqDeviceData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AReqDeviceData {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("device_channel")
    private final java.lang.String deviceChannel;

    public AReqDeviceData(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.deviceChannel = str;
    }

    public final java.lang.String getDeviceChannel() {
        return this.deviceChannel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceChannel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AReqDeviceData(deviceChannel=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.deviceChannel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.android.threeds.data.model.AReqDeviceData) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceChannel, ((com.paypal.android.threeds.data.model.AReqDeviceData) other).deviceChannel);
    }

    public final com.paypal.android.threeds.data.model.AReqDeviceData copy(java.lang.String deviceChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceChannel, "");
        return new com.paypal.android.threeds.data.model.AReqDeviceData(deviceChannel);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceChannel() {
        return this.deviceChannel;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.AReqDeviceData copy$default(com.paypal.android.threeds.data.model.AReqDeviceData aReqDeviceData, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aReqDeviceData.deviceChannel;
        }
        return aReqDeviceData.copy(str);
    }
}
