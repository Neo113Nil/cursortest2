package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001fB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/core/internal/system/SystemInfo;", "", "", "batteryFullOrCharging", "", "batteryLevel", "powerSaveMode", "onExternalPowerSource", "<init>", "(ZIZZ)V", "component1", "()Z", "component2", "()I", "component3", "component4", "copy", "(ZIZZ)Lcom/datadog/android/core/internal/system/SystemInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getBatteryFullOrCharging", com.visa.cbp.getEncExpo.warmup, "getBatteryLevel", "getOnExternalPowerSource", "getPowerSaveMode", "BatteryStatus"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SystemInfo {
    private final boolean batteryFullOrCharging;
    private final int batteryLevel;
    private final boolean onExternalPowerSource;
    private final boolean powerSaveMode;

    public SystemInfo(boolean z, int i, boolean z2, boolean z3) {
        this.batteryFullOrCharging = z;
        this.batteryLevel = i;
        this.powerSaveMode = z2;
        this.onExternalPowerSource = z3;
    }

    public /* synthetic */ SystemInfo(boolean z, int i, boolean z2, boolean z3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
    }

    public final boolean getBatteryFullOrCharging() {
        return this.batteryFullOrCharging;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final boolean getPowerSaveMode() {
        return this.powerSaveMode;
    }

    public final boolean getOnExternalPowerSource() {
        return this.onExternalPowerSource;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNKNOWN", "CHARGING", "DISCHARGING", "NOT_CHARGING", "FULL"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum BatteryStatus {
        UNKNOWN,
        CHARGING,
        DISCHARGING,
        NOT_CHARGING,
        FULL;


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.Companion INSTANCE = new com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus$Companion;", "", "<init>", "()V", "", "status", "Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus;", "fromAndroidStatus", "(I)Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.datadog.android.core.internal.system.SystemInfo.BatteryStatus fromAndroidStatus(int status) {
                if (status == 2) {
                    return com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.CHARGING;
                }
                if (status == 3) {
                    return com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.DISCHARGING;
                }
                if (status == 4) {
                    return com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.NOT_CHARGING;
                }
                if (status == 5) {
                    return com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.FULL;
                }
                return com.datadog.android.core.internal.system.SystemInfo.BatteryStatus.UNKNOWN;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public final java.lang.String toString() {
        boolean z = this.batteryFullOrCharging;
        int i = this.batteryLevel;
        boolean z2 = this.powerSaveMode;
        boolean z3 = this.onExternalPowerSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemInfo(batteryFullOrCharging=");
        sb.append(z);
        sb.append(", batteryLevel=");
        sb.append(i);
        sb.append(", powerSaveMode=");
        sb.append(z2);
        sb.append(", onExternalPowerSource=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.batteryFullOrCharging) * 31) + java.lang.Integer.hashCode(this.batteryLevel)) * 31) + java.lang.Boolean.hashCode(this.powerSaveMode)) * 31) + java.lang.Boolean.hashCode(this.onExternalPowerSource);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.internal.system.SystemInfo)) {
            return false;
        }
        com.datadog.android.core.internal.system.SystemInfo systemInfo = (com.datadog.android.core.internal.system.SystemInfo) other;
        return this.batteryFullOrCharging == systemInfo.batteryFullOrCharging && this.batteryLevel == systemInfo.batteryLevel && this.powerSaveMode == systemInfo.powerSaveMode && this.onExternalPowerSource == systemInfo.onExternalPowerSource;
    }

    public final com.datadog.android.core.internal.system.SystemInfo copy(boolean batteryFullOrCharging, int batteryLevel, boolean powerSaveMode, boolean onExternalPowerSource) {
        return new com.datadog.android.core.internal.system.SystemInfo(batteryFullOrCharging, batteryLevel, powerSaveMode, onExternalPowerSource);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getOnExternalPowerSource() {
        return this.onExternalPowerSource;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPowerSaveMode() {
        return this.powerSaveMode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBatteryFullOrCharging() {
        return this.batteryFullOrCharging;
    }

    public static /* synthetic */ com.datadog.android.core.internal.system.SystemInfo copy$default(com.datadog.android.core.internal.system.SystemInfo systemInfo, boolean z, int i, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = systemInfo.batteryFullOrCharging;
        }
        if ((i2 & 2) != 0) {
            i = systemInfo.batteryLevel;
        }
        if ((i2 & 4) != 0) {
            z2 = systemInfo.powerSaveMode;
        }
        if ((i2 & 8) != 0) {
            z3 = systemInfo.onExternalPowerSource;
        }
        return systemInfo.copy(z, i, z2, z3);
    }

    public SystemInfo() {
        this(false, 0, false, false, 15, null);
    }
}
