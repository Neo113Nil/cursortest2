package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "externalReferenceId", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;", "deviceInfo", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExternalReferenceId", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;", "getDeviceInfo", com.miteksystems.misnap.core.MibiData.KEY_DEVICE_INFO}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentTokenFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo;
    private final java.lang.String externalReferenceId;

    public DebitInstrumentTokenFragment(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo) {
        this.externalReferenceId = str;
        this.deviceInfo = deviceInfo;
    }

    public final java.lang.String getExternalReferenceId() {
        return this.externalReferenceId;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;", "", "", "deviceName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment$DeviceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceInfo {
        public static final int $stable = 0;
        private final java.lang.String deviceName;

        public DeviceInfo(java.lang.String str) {
            this.deviceName = str;
        }

        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deviceName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo(deviceName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.deviceName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, ((com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo) other).deviceName);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo copy(java.lang.String deviceName) {
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo(deviceName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deviceInfo.deviceName;
            }
            return deviceInfo.copy(str);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.externalReferenceId;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo = this.deviceInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentTokenFragment(externalReferenceId=");
        sb.append(str);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.externalReferenceId;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo = this.deviceInfo;
        return (hashCode * 31) + (deviceInfo != null ? deviceInfo.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.externalReferenceId, debitInstrumentTokenFragment.externalReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceInfo, debitInstrumentTokenFragment.deviceInfo);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment copy(java.lang.String externalReferenceId, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment(externalReferenceId, deviceInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExternalReferenceId() {
        return this.externalReferenceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrumentTokenFragment.externalReferenceId;
        }
        if ((i & 2) != 0) {
            deviceInfo = debitInstrumentTokenFragment.deviceInfo;
        }
        return debitInstrumentTokenFragment.copy(str, deviceInfo);
    }
}
