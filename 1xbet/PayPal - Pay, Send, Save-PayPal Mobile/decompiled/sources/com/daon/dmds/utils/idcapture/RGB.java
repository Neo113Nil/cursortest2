package com.daon.dmds.utils.idcapture;

/* loaded from: classes7.dex */
public class RGB {
    private byte[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public RGB(android.graphics.Bitmap bitmap) {
        this.getHighSpeedVideoFpsRanges = null;
        int width = bitmap.getWidth();
        this.getHighSpeedVideoSizes = width;
        int height = bitmap.getHeight();
        this.getHighSpeedVideoFpsRangesFor = height;
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[width * height * 3];
        this.getHighSpeedVideoFpsRanges = bArr;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            int i4 = 0;
            while (i4 < width) {
                int i5 = iArr[i2];
                int i6 = (16711680 & i5) >> 16;
                int i7 = (65280 & i5) >> 8;
                int i8 = 255;
                int i9 = i5 & 255;
                if (i6 < 0) {
                    i6 = 0;
                } else if (i6 > 255) {
                    i6 = 255;
                }
                bArr[i] = (byte) i6;
                bArr[i + 1] = (byte) (i7 < 0 ? 0 : i7 > 255 ? 255 : i7);
                int i10 = i + 3;
                if (i9 < 0) {
                    i8 = 0;
                } else if (i7 <= 255) {
                    i8 = i9;
                }
                bArr[i + 2] = (byte) i8;
                i2++;
                i4++;
                i = i10;
            }
        }
    }

    public byte[] getData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getHeight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getWidth() {
        return this.getHighSpeedVideoSizes;
    }

    public android.graphics.Bitmap toBitmap() {
        int[] iArr = new int[this.getHighSpeedVideoSizes * this.getHighSpeedVideoFpsRangesFor];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            if (i >= i3) {
                return android.graphics.Bitmap.createBitmap(iArr, this.getHighSpeedVideoSizes, i3, android.graphics.Bitmap.Config.ARGB_8888);
            }
            int i4 = 0;
            while (true) {
                int i5 = this.getHighSpeedVideoSizes;
                if (i4 < i5 * 3) {
                    byte[] bArr = this.getHighSpeedVideoFpsRanges;
                    int i6 = (i5 * i) + i4;
                    int i7 = 255;
                    int i8 = bArr[i6] & 255;
                    int i9 = bArr[i6 + 1] & 255;
                    int i10 = bArr[i6 + 2] & 255;
                    if (i8 < 0) {
                        i8 = 0;
                    } else if (i8 > 255) {
                        i8 = 255;
                    }
                    if (i9 < 0) {
                        i9 = 0;
                    } else if (i9 > 255) {
                        i9 = 255;
                    }
                    if (i10 < 0) {
                        i7 = 0;
                    } else if (i10 <= 255) {
                        i7 = i10;
                    }
                    iArr[i2] = (i8 << 16) | (-16777216) | (i9 << 8) | i7;
                    i4 += 3;
                    i2++;
                }
            }
            i++;
        }
    }
}
