package com.visa.cbp;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public abstract class getApplicationLabel implements com.visa.cbp.getIssuerApplicationDiscretionaryData {
    private final long getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    protected getApplicationLabel(long j, int i) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // com.visa.cbp.getIssuerApplicationDiscretionaryData
    public final long valueOf() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.visa.cbp.getIssuerApplicationDiscretionaryData
    public final boolean values() {
        return (this.getHighSpeedVideoFpsRangesFor & 1) != 0;
    }

    @Override // com.visa.cbp.getIssuerApplicationDiscretionaryData
    public final boolean ConfirmReplenishRequest() {
        return (this.getHighSpeedVideoFpsRangesFor & 2) != 0;
    }

    @Override // com.visa.cbp.getIssuerApplicationDiscretionaryData
    public final boolean ReplenishAckRequest() {
        return (this.getHighSpeedVideoFpsRangesFor & 8) != 0;
    }

    @Override // com.visa.cbp.getIssuerApplicationDiscretionaryData
    public final boolean BuildConfig() {
        return (this.getHighSpeedVideoFpsRangesFor & 16) != 0;
    }
}
