package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class YUV {
    private byte[] Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public YUV(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.System.currentTimeMillis();
    }

    private static byte[] getHighSpeedVideoFpsRanges(android.media.Image image) {
        int i;
        android.graphics.Rect cropRect = image.getCropRect();
        int width = cropRect.width();
        int height = cropRect.height();
        try {
            android.media.Image.Plane[] planes = image.getPlanes();
            int i2 = width * height;
            byte[] bArr = new byte[(android.graphics.ImageFormat.getBitsPerPixel(image.getFormat()) * i2) / 8];
            int i3 = 0;
            byte[] bArr2 = new byte[planes[0].getRowStride()];
            int i4 = 1;
            int i5 = 0;
            int i6 = 0;
            int i7 = 1;
            while (i5 < planes.length) {
                if (i5 != 0) {
                    if (i5 == i4) {
                        i6 = i2 + 1;
                    } else if (i5 == 2) {
                        i6 = i2;
                    }
                    i7 = 2;
                } else {
                    i6 = i3;
                    i7 = i4;
                }
                java.nio.ByteBuffer buffer = planes[i5].getBuffer();
                int rowStride = planes[i5].getRowStride();
                int pixelStride = planes[i5].getPixelStride();
                int i8 = i5 == 0 ? i3 : i4;
                int i9 = width >> i8;
                int i10 = height >> i8;
                int i11 = width;
                int i12 = height;
                buffer.position(((cropRect.top >> i8) * rowStride) + ((cropRect.left >> i8) * pixelStride));
                for (int i13 = 0; i13 < i10; i13++) {
                    if (pixelStride == 1 && i7 == 1) {
                        buffer.get(bArr, i6, i9);
                        i6 += i9;
                        i = i9;
                    } else {
                        i = ((i9 - 1) * pixelStride) + 1;
                        buffer.get(bArr2, 0, i);
                        for (int i14 = 0; i14 < i9; i14++) {
                            bArr[i6] = bArr2[i14 * pixelStride];
                            i6 += i7;
                        }
                    }
                    if (i13 < i10 - 1) {
                        buffer.position((buffer.position() + rowStride) - i);
                    }
                }
                i5++;
                width = i11;
                height = i12;
                i3 = 0;
                i4 = 1;
            }
            return bArr;
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    public byte[] compress(int i) {
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(this.Camera2StreamConfigurationMap, 17, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public com.daon.sdk.face.YUV copy() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return new com.daon.sdk.face.YUV(bArr2, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            } catch (java.lang.Error e) {
                this.Camera2StreamConfigurationMap = null;
                e.getLocalizedMessage();
            }
        }
        return this;
    }

    public byte[] getData() {
        return this.Camera2StreamConfigurationMap;
    }

    public android.graphics.Bitmap getDisplayBitmap(android.content.Context context) {
        return com.daon.sdk.face.BitmapTools.rotate(toBitmap(), com.daon.sdk.face.CameraTools.getImageOrientation(context), false);
    }

    public int getHeight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public long getTimestamp() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getWidth() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isEmpty() {
        return this.Camera2StreamConfigurationMap == null;
    }

    public com.daon.sdk.face.YUV rotate180() {
        int i = this.getHighSpeedVideoFpsRanges * this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr = new byte[(i * 3) / 2];
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            bArr[i2] = this.Camera2StreamConfigurationMap[i3];
            i2++;
        }
        int i4 = (((this.getHighSpeedVideoFpsRanges * this.getHighSpeedVideoFpsRangesFor) * 3) / 2) - 1;
        while (true) {
            int i5 = this.getHighSpeedVideoFpsRanges;
            int i6 = this.getHighSpeedVideoFpsRangesFor;
            if (i4 < i5 * i6) {
                return new com.daon.sdk.face.YUV(bArr, i5, i6);
            }
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            bArr[i2] = bArr2[i4 - 1];
            bArr[i2 + 1] = bArr2[i4];
            i4 -= 2;
            i2 += 2;
        }
    }

    public com.daon.sdk.face.YUV rotate270() {
        return rotate90().rotate180();
    }

    public com.daon.sdk.face.YUV rotate90() {
        int i;
        byte[] bArr = new byte[((this.getHighSpeedVideoFpsRanges * this.getHighSpeedVideoFpsRangesFor) * 3) / 2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.getHighSpeedVideoFpsRanges;
            if (i2 >= i) {
                break;
            }
            for (int i4 = this.getHighSpeedVideoFpsRangesFor - 1; i4 >= 0; i4--) {
                bArr[i3] = this.Camera2StreamConfigurationMap[(this.getHighSpeedVideoFpsRanges * i4) + i2];
                i3++;
            }
            i2++;
        }
        int i5 = (((this.getHighSpeedVideoFpsRangesFor * i) * 3) / 2) - 1;
        for (int i6 = i - 1; i6 > 0; i6 -= 2) {
            int i7 = 0;
            while (true) {
                int i8 = this.getHighSpeedVideoFpsRangesFor;
                if (i7 < i8 / 2) {
                    byte[] bArr2 = this.Camera2StreamConfigurationMap;
                    int i9 = this.getHighSpeedVideoFpsRanges;
                    int i10 = (i8 * i9) + (i9 * i7);
                    bArr[i5] = bArr2[i10 + i6];
                    bArr[i5 - 1] = bArr2[i10 + (i6 - 1)];
                    i5 -= 2;
                    i7++;
                }
            }
        }
        return new com.daon.sdk.face.YUV(bArr, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    public android.graphics.Bitmap toBitmap() {
        return com.daon.sdk.renderscript.Toolkit.f2846a.b(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, com.daon.sdk.renderscript.c.b);
    }

    public android.graphics.Bitmap toGrayscale() {
        com.daon.sdk.renderscript.Toolkit toolkit = com.daon.sdk.renderscript.Toolkit.f2846a;
        return toolkit.a(toBitmap(), toolkit.a());
    }

    public android.graphics.Bitmap toJPEG(int i) {
        byte[] compress = compress(i);
        return android.graphics.BitmapFactory.decodeByteArray(compress, 0, compress.length);
    }

    public YUV(android.graphics.Bitmap bitmap) {
        this.Camera2StreamConfigurationMap = null;
        int width = bitmap.getWidth();
        this.getHighSpeedVideoFpsRanges = width;
        int height = bitmap.getHeight();
        this.getHighSpeedVideoFpsRangesFor = height;
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.System.currentTimeMillis();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i = width * height;
        int i2 = (i * 3) / 2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = 0;
            while (i6 < width) {
                int i7 = iArr[i3];
                int i8 = (16711680 & i7) >> 16;
                int i9 = (65280 & i7) >> 8;
                int i10 = i7 & 255;
                int i11 = ((i5 >> 1) * width) + i + (i6 & (-2));
                int i12 = (((((i8 * 66) + (i9 * 129)) + (i10 * 25)) + 128) >> 8) + 16;
                int i13 = width;
                if (i12 < 0) {
                    i12 = 0;
                } else if (i12 > 255) {
                    i12 = 255;
                }
                bArr[i4] = (byte) i12;
                if (i11 < i2) {
                    int i14 = (((((i8 * 112) - (i9 * 94)) - (i10 * 18)) + 128) >> 8) + 128;
                    if (i14 < 0) {
                        i14 = 0;
                    } else if (i14 > 255) {
                        i14 = 255;
                    }
                    bArr[i11] = (byte) i14;
                    i11++;
                }
                if (i11 < i2) {
                    int i15 = (((((i8 * (-38)) - (i9 * 74)) + (i10 * 112)) + 128) >> 8) + 128;
                    bArr[i11] = (byte) (i15 < 0 ? 0 : i15 > 255 ? 255 : i15);
                }
                i3++;
                i6++;
                i4++;
                width = i13;
            }
        }
        this.Camera2StreamConfigurationMap = bArr;
    }

    public YUV(android.media.Image image) throws java.lang.Exception {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = image.getWidth();
        this.getHighSpeedVideoFpsRangesFor = image.getHeight();
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.System.currentTimeMillis();
        int format = image.getFormat();
        if (format != 17) {
            if (format == 35) {
                this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(image);
                return;
            }
            throw new java.lang.Exception("Format not supported");
        }
        java.nio.ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        java.nio.ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
        java.nio.ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
        int remaining = buffer.remaining();
        int remaining2 = buffer2.remaining();
        int remaining3 = buffer3.remaining();
        byte[] bArr = new byte[remaining + remaining2 + remaining3];
        buffer.get(bArr, 0, remaining);
        buffer3.get(bArr, remaining, remaining3);
        buffer2.get(bArr, remaining + remaining3, remaining2);
        this.Camera2StreamConfigurationMap = bArr;
    }
}
