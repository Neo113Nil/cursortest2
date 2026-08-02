package com.visa.cbp;

/* loaded from: classes5.dex */
public final class setLongDescription extends java.io.BufferedWriter {
    private final int getHighSpeedVideoFpsRanges;
    public char[] values;

    public setLongDescription(java.io.Writer writer) {
        super(writer);
        this.values = new char[64];
        java.lang.String valueOf = com.visa.cbp.setContactNumber.valueOf();
        if (valueOf != null) {
            this.getHighSpeedVideoFpsRanges = valueOf.length();
        } else {
            this.getHighSpeedVideoFpsRanges = 2;
        }
    }
}
