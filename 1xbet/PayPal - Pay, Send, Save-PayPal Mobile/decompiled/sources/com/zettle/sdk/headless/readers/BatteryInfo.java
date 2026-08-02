package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Lcom/zettle/sdk/headless/readers/BatteryInfo;", "", "", "level", "", "isCharging", "<init>", "(IZ)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/zettle/sdk/headless/readers/BatteryInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", com.visa.cbp.getEncExpo.warmup, "getLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BatteryInfo {
    private final boolean isCharging;
    private final int level;

    public BatteryInfo(int i, boolean z) {
        this.level = i;
        this.isCharging = z;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public final java.lang.String toString() {
        int i = this.level;
        boolean z = this.isCharging;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatteryInfo(level=");
        sb.append(i);
        sb.append(", isCharging=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.level);
        boolean z = this.isCharging;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.headless.readers.BatteryInfo)) {
            return false;
        }
        com.zettle.sdk.headless.readers.BatteryInfo batteryInfo = (com.zettle.sdk.headless.readers.BatteryInfo) other;
        return this.level == batteryInfo.level && this.isCharging == batteryInfo.isCharging;
    }

    public final com.zettle.sdk.headless.readers.BatteryInfo copy(int level, boolean isCharging) {
        return new com.zettle.sdk.headless.readers.BatteryInfo(level, isCharging);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    public static /* synthetic */ com.zettle.sdk.headless.readers.BatteryInfo copy$default(com.zettle.sdk.headless.readers.BatteryInfo batteryInfo, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = batteryInfo.level;
        }
        if ((i2 & 2) != 0) {
            z = batteryInfo.isCharging;
        }
        return batteryInfo.copy(i, z);
    }
}
