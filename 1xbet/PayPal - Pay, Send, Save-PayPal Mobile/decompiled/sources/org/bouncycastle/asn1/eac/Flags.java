package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class Flags {
    int getHighResolutionOutputSizeshNQ4ISI;

    public void set(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i | this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isSet(int i) {
        return (i & this.getHighResolutionOutputSizeshNQ4ISI) != 0;
    }

    public int getFlags() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static class StringJoiner {
        java.lang.StringBuffer getHighSpeedVideoFpsRanges;

        public java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges.toString();
        }
    }

    public Flags(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public Flags() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }
}
