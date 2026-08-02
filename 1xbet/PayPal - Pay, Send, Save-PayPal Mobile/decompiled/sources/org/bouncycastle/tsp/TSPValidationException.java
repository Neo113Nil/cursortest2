package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TSPValidationException extends org.bouncycastle.tsp.TSPException {
    private int Camera2StreamConfigurationMap;

    public int getFailureCode() {
        return this.Camera2StreamConfigurationMap;
    }

    public TSPValidationException(java.lang.String str, int i) {
        super(str);
        this.Camera2StreamConfigurationMap = i;
    }

    public TSPValidationException(java.lang.String str) {
        super(str);
        this.Camera2StreamConfigurationMap = -1;
    }
}
