package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
public class GammaCorrection {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.png.GammaCorrection.class.getName());
    private final int[] lookupTable;

    public GammaCorrection(double d, double d2) {
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("src_gamma: ".concat(java.lang.String.valueOf(d)));
            logger.finest("dst_gamma: ".concat(java.lang.String.valueOf(d2)));
        }
        this.lookupTable = new int[256];
        for (int i = 0; i < 256; i++) {
            this.lookupTable[i] = correctSample(i, d, d2);
            java.util.logging.Logger logger2 = LOGGER;
            if (logger2.isLoggable(java.util.logging.Level.FINEST)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lookup_table[");
                sb.append(i);
                sb.append("]: ");
                sb.append(this.lookupTable[i]);
                logger2.finest(sb.toString());
            }
        }
    }

    public int correctSample(int i) {
        return this.lookupTable[i];
    }

    public int correctARGB(int i) {
        int correctSample = correctSample((i >> 16) & 255);
        int correctSample2 = correctSample((i >> 8) & 255);
        return (i & (-16777216)) | ((correctSample & 255) << 16) | ((correctSample2 & 255) << 8) | (correctSample(i & 255) & 255);
    }

    private int correctSample(int i, double d, double d2) {
        return (int) java.lang.Math.round(java.lang.Math.pow(i / 255.0d, d / d2) * 255.0d);
    }
}
