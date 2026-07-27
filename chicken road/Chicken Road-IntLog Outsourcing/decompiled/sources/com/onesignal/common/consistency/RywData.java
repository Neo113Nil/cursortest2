package com.onesignal.common.consistency;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RywData {
    private final Long rywDelay;
    private final String rywToken;

    public RywData(String rywToken, Long l2) {
        i.e(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l2;
    }

    public static /* synthetic */ RywData copy$default(RywData rywData, String str, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rywData.rywToken;
        }
        if ((i2 & 2) != 0) {
            l2 = rywData.rywDelay;
        }
        return rywData.copy(str, l2);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final RywData copy(String rywToken, Long l2) {
        i.e(rywToken, "rywToken");
        return new RywData(rywToken, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RywData)) {
            return false;
        }
        RywData rywData = (RywData) obj;
        return i.a(this.rywToken, rywData.rywToken) && i.a(this.rywDelay, rywData.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int hashCode = this.rywToken.hashCode() * 31;
        Long l2 = this.rywDelay;
        return hashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
