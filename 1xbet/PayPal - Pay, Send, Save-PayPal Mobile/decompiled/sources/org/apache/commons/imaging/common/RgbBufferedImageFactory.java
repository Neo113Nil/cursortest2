package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class RgbBufferedImageFactory implements org.apache.commons.imaging.common.BufferedImageFactory {
    @Override // org.apache.commons.imaging.common.BufferedImageFactory
    public java.awt.image.BufferedImage getColorBufferedImage(int i, int i2, boolean z) {
        if (z) {
            return new java.awt.image.BufferedImage(i, i2, 2);
        }
        return new java.awt.image.BufferedImage(i, i2, 1);
    }

    @Override // org.apache.commons.imaging.common.BufferedImageFactory
    public java.awt.image.BufferedImage getGrayscaleBufferedImage(int i, int i2, boolean z) {
        return getColorBufferedImage(i, i2, z);
    }
}
