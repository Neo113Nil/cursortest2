package com.datadog.android.rum.internal.domain.battery;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "Lcom/datadog/android/rum/internal/domain/InfoData;", "", "batteryLevel", "", "lowPowerMode", "<init>", "(Ljava/lang/Float;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Float;", "getBatteryLevel", "Ljava/lang/Boolean;", "getLowPowerMode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BatteryInfo implements com.datadog.android.rum.internal.domain.InfoData {
    private final java.lang.Float batteryLevel;
    private final java.lang.Boolean lowPowerMode;

    public BatteryInfo(java.lang.Float f, java.lang.Boolean bool) {
        this.batteryLevel = f;
        this.lowPowerMode = bool;
    }

    public /* synthetic */ BatteryInfo(java.lang.Float f, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : bool);
    }

    public final java.lang.Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public final java.lang.Boolean getLowPowerMode() {
        return this.lowPowerMode;
    }

    public final java.lang.String toString() {
        java.lang.Float f = this.batteryLevel;
        java.lang.Boolean bool = this.lowPowerMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatteryInfo(batteryLevel=");
        sb.append(f);
        sb.append(", lowPowerMode=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Float f = this.batteryLevel;
        int hashCode = f == null ? 0 : f.hashCode();
        java.lang.Boolean bool = this.lowPowerMode;
        return (hashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.battery.BatteryInfo)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.battery.BatteryInfo batteryInfo = (com.datadog.android.rum.internal.domain.battery.BatteryInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.batteryLevel, (java.lang.Object) batteryInfo.batteryLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.lowPowerMode, batteryInfo.lowPowerMode);
    }

    public final com.datadog.android.rum.internal.domain.battery.BatteryInfo copy(java.lang.Float batteryLevel, java.lang.Boolean lowPowerMode) {
        return new com.datadog.android.rum.internal.domain.battery.BatteryInfo(batteryLevel, lowPowerMode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getLowPowerMode() {
        return this.lowPowerMode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.battery.BatteryInfo copy$default(com.datadog.android.rum.internal.domain.battery.BatteryInfo batteryInfo, java.lang.Float f, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = batteryInfo.batteryLevel;
        }
        if ((i & 2) != 0) {
            bool = batteryInfo.lowPowerMode;
        }
        return batteryInfo.copy(f, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BatteryInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
