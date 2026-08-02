package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
abstract class ScanExpediter {
    final java.awt.image.BufferedImage bi;
    final int bitDepth;
    final int bitsPerPixel;
    final int bytesPerPixel;
    final org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection;
    final int height;
    final java.io.InputStream is;
    final org.apache.commons.imaging.formats.png.chunks.PngChunkPlte pngChunkPLTE;
    final org.apache.commons.imaging.formats.png.PngColorType pngColorType;
    final org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter;
    final int width;

    public abstract void drive() throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    final int getPixelARGB(int i, int i2, int i3, int i4) {
        return ((i & 255) << 24) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255);
    }

    ScanExpediter(int i, int i2, java.io.InputStream inputStream, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.png.PngColorType pngColorType, int i3, int i4, org.apache.commons.imaging.formats.png.chunks.PngChunkPlte pngChunkPlte, org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection, org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter) {
        this.width = i;
        this.height = i2;
        this.is = inputStream;
        this.bi = bufferedImage;
        this.pngColorType = pngColorType;
        this.bitDepth = i3;
        this.bytesPerPixel = getBitsToBytesRoundingUp(i4);
        this.bitsPerPixel = i4;
        this.pngChunkPLTE = pngChunkPlte;
        this.gammaCorrection = gammaCorrection;
        this.transparencyFilter = transparencyFilter;
    }

    final int getBitsToBytesRoundingUp(int i) {
        return (i + 7) / 8;
    }

    final int getPixelRGB(int i, int i2, int i3) {
        return getPixelARGB(255, i, i2, i3);
    }

    int getRGB(org.apache.commons.imaging.formats.png.BitParser bitParser, int i) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i2 = org.apache.commons.imaging.formats.png.ScanExpediter.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[this.pngColorType.ordinal()];
        if (i2 == 1) {
            int sampleAsByte = bitParser.getSampleAsByte(i, 0);
            org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection = this.gammaCorrection;
            if (gammaCorrection != null) {
                sampleAsByte = gammaCorrection.correctSample(sampleAsByte);
            }
            int pixelRGB = getPixelRGB(sampleAsByte, sampleAsByte, sampleAsByte);
            org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter = this.transparencyFilter;
            return transparencyFilter != null ? transparencyFilter.filter(pixelRGB, sampleAsByte) : pixelRGB;
        }
        if (i2 == 2) {
            int sampleAsByte2 = bitParser.getSampleAsByte(i, 0);
            int sampleAsByte3 = bitParser.getSampleAsByte(i, 1);
            int sampleAsByte4 = bitParser.getSampleAsByte(i, 2);
            int pixelRGB2 = getPixelRGB(sampleAsByte2, sampleAsByte3, sampleAsByte4);
            org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter2 = this.transparencyFilter;
            if (transparencyFilter2 != null) {
                pixelRGB2 = transparencyFilter2.filter(pixelRGB2, -1);
            }
            org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection2 = this.gammaCorrection;
            if (gammaCorrection2 != null) {
                return getPixelARGB((pixelRGB2 & (-16777216)) >> 24, gammaCorrection2.correctSample(sampleAsByte2), this.gammaCorrection.correctSample(sampleAsByte3), this.gammaCorrection.correctSample(sampleAsByte4));
            }
            return pixelRGB2;
        }
        if (i2 == 3) {
            int sample = bitParser.getSample(i, 0);
            int rgb = this.pngChunkPLTE.getRGB(sample);
            org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter3 = this.transparencyFilter;
            return transparencyFilter3 != null ? transparencyFilter3.filter(rgb, sample) : rgb;
        }
        if (i2 == 4) {
            int sampleAsByte5 = bitParser.getSampleAsByte(i, 0);
            int sampleAsByte6 = bitParser.getSampleAsByte(i, 1);
            org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection3 = this.gammaCorrection;
            if (gammaCorrection3 != null) {
                sampleAsByte5 = gammaCorrection3.correctSample(sampleAsByte5);
            }
            return getPixelARGB(sampleAsByte6, sampleAsByte5, sampleAsByte5, sampleAsByte5);
        }
        if (i2 == 5) {
            int sampleAsByte7 = bitParser.getSampleAsByte(i, 0);
            int sampleAsByte8 = bitParser.getSampleAsByte(i, 1);
            int sampleAsByte9 = bitParser.getSampleAsByte(i, 2);
            int sampleAsByte10 = bitParser.getSampleAsByte(i, 3);
            org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection4 = this.gammaCorrection;
            if (gammaCorrection4 != null) {
                sampleAsByte7 = gammaCorrection4.correctSample(sampleAsByte7);
                sampleAsByte8 = this.gammaCorrection.correctSample(sampleAsByte8);
                sampleAsByte9 = this.gammaCorrection.correctSample(sampleAsByte9);
            }
            return getPixelARGB(sampleAsByte10, sampleAsByte7, sampleAsByte8, sampleAsByte9);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PNG: unknown color type: ");
        sb.append(this.pngColorType);
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    /* renamed from: org.apache.commons.imaging.formats.png.ScanExpediter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$formats$png$FilterType;
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType;

        static {
            int[] iArr = new int[org.apache.commons.imaging.formats.png.FilterType.values().length];
            $SwitchMap$org$apache$commons$imaging$formats$png$FilterType = iArr;
            try {
                iArr[org.apache.commons.imaging.formats.png.FilterType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$FilterType[org.apache.commons.imaging.formats.png.FilterType.SUB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$FilterType[org.apache.commons.imaging.formats.png.FilterType.UP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$FilterType[org.apache.commons.imaging.formats.png.FilterType.AVERAGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$FilterType[org.apache.commons.imaging.formats.png.FilterType.PAETH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[org.apache.commons.imaging.formats.png.PngColorType.values().length];
            $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType = iArr2;
            try {
                iArr2[org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE_WITH_ALPHA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR_WITH_ALPHA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter getScanlineFilter(org.apache.commons.imaging.formats.png.FilterType filterType, int i) throws org.apache.commons.imaging.ImageReadException {
        int i2 = org.apache.commons.imaging.formats.png.ScanExpediter.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$FilterType[filterType.ordinal()];
        if (i2 == 1) {
            return new org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterNone();
        }
        if (i2 == 2) {
            return new org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterSub(i);
        }
        if (i2 == 3) {
            return new org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterUp();
        }
        if (i2 == 4) {
            return new org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage(i);
        }
        if (i2 != 5) {
            return null;
        }
        return new org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterPaeth(i);
    }

    byte[] unfilterScanline(org.apache.commons.imaging.formats.png.FilterType filterType, byte[] bArr, byte[] bArr2, int i) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter scanlineFilter = getScanlineFilter(filterType, i);
        byte[] bArr3 = new byte[bArr.length];
        scanlineFilter.unfilter(bArr, bArr3, bArr2);
        return bArr3;
    }

    byte[] getNextScanline(java.io.InputStream inputStream, int i, byte[] bArr, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: missing filter type");
        }
        if (read >= org.apache.commons.imaging.formats.png.FilterType.values().length) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: unknown filterType: ".concat(java.lang.String.valueOf(read)));
        }
        return unfilterScanline(org.apache.commons.imaging.formats.png.FilterType.values()[read], org.apache.commons.imaging.common.BinaryFunctions.readBytes("scanline", inputStream, i, "PNG: missing image data"), bArr, i2);
    }
}
