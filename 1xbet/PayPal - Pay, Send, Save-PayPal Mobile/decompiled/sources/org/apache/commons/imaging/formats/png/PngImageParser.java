package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
public class PngImageParser extends org.apache.commons.imaging.ImageParser implements org.apache.commons.imaging.common.XmpEmbeddable {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.png.PngImageParser.class.getName());
    private static final java.lang.String DEFAULT_EXTENSION = ".png";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Png-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return (java.lang.String[]) ACCEPTED_EXTENSIONS.clone();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.PNG};
    }

    public static java.lang.String getChunkTypeName(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public java.util.List<java.lang.String> getChunkTypes(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(inputStream, (org.apache.commons.imaging.formats.png.ChunkType[]) null, false);
        java.util.ArrayList arrayList = new java.util.ArrayList(readChunks.size());
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it = readChunks.iterator();
        while (it.hasNext()) {
            arrayList.add(getChunkTypeName(it.next().chunkType));
        }
        return arrayList;
    }

    public boolean hasChunkType(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, org.apache.commons.imaging.formats.png.ChunkType chunkType) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            readSignature(inputStream);
            boolean isEmpty = readChunks(inputStream, new org.apache.commons.imaging.formats.png.ChunkType[]{chunkType}, true).isEmpty();
            if (inputStream != null) {
                inputStream.close();
            }
            return !isEmpty;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private boolean keepChunk(int i, org.apache.commons.imaging.formats.png.ChunkType[] chunkTypeArr) {
        if (chunkTypeArr == null) {
            return true;
        }
        for (org.apache.commons.imaging.formats.png.ChunkType chunkType : chunkTypeArr) {
            if (chunkType.value == i) {
                return true;
            }
        }
        return false;
    }

    private java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks(java.io.InputStream inputStream, org.apache.commons.imaging.formats.png.ChunkType[] chunkTypeArr, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int read4Bytes;
        byte[] bArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Length", inputStream, "Not a Valid PNG File", getByteOrder());
            if (read4Bytes2 < 0) {
                throw new org.apache.commons.imaging.ImageReadException("Invalid PNG chunk length: ".concat(java.lang.String.valueOf(read4Bytes2)));
            }
            read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ChunkType", inputStream, "Not a Valid PNG File", getByteOrder());
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("ChunkType", read4Bytes);
                debugNumber("Length", read4Bytes2, 4);
            }
            boolean keepChunk = keepChunk(read4Bytes, chunkTypeArr);
            if (keepChunk) {
                bArr = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Chunk Data", inputStream, read4Bytes2, "Not a Valid PNG File: Couldn't read Chunk Data.");
            } else {
                org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, read4Bytes2, "Not a Valid PNG File");
                bArr = null;
            }
            if (logger.isLoggable(java.util.logging.Level.FINEST) && bArr != null) {
                debugNumber(com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, bArr.length, 4);
            }
            int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("CRC", inputStream, "Not a Valid PNG File", getByteOrder());
            if (keepChunk) {
                if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.iCCP.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkIccp(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.tEXt.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkText(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.zTXt.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.IHDR.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.PLTE.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkPlte(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.pHYs.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkPhys(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.sCAL.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkScal(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.IDAT.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkIdat(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.gAMA.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkGama(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == org.apache.commons.imaging.formats.png.ChunkType.iTXt.value) {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunkItxt(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else {
                    arrayList.add(new org.apache.commons.imaging.formats.png.chunks.PngChunk(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                }
                if (z) {
                    break;
                }
            }
        } while (read4Bytes != org.apache.commons.imaging.formats.png.ChunkType.IEND.value);
        return arrayList;
    }

    public void readSignature(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(inputStream, org.apache.commons.imaging.formats.png.PngConstants.PNG_SIGNATURE, "Not a Valid PNG Segment: Incorrect Signature");
    }

    private java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, org.apache.commons.imaging.formats.png.ChunkType[] chunkTypeArr, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            readSignature(inputStream);
            java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(inputStream, chunkTypeArr, z);
            if (inputStream != null) {
                inputStream.close();
            }
            return readChunks;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, new org.apache.commons.imaging.formats.png.ChunkType[]{org.apache.commons.imaging.formats.png.ChunkType.iCCP}, true);
        if (readChunks == null || readChunks.isEmpty()) {
            return null;
        }
        if (readChunks.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG contains more than one ICC Profile ");
        }
        return ((org.apache.commons.imaging.formats.png.chunks.PngChunkIccp) readChunks.get(0)).getUncompressedProfile();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, new org.apache.commons.imaging.formats.png.ChunkType[]{org.apache.commons.imaging.formats.png.ChunkType.IHDR}, true);
        if (readChunks == null || readChunks.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("Png: No chunks");
        }
        if (readChunks.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG contains more than one Header");
        }
        org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr pngChunkIhdr = (org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr) readChunks.get(0);
        return new java.awt.Dimension(pngChunkIhdr.width, pngChunkIhdr.height);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, new org.apache.commons.imaging.formats.png.ChunkType[]{org.apache.commons.imaging.formats.png.ChunkType.tEXt, org.apache.commons.imaging.formats.png.ChunkType.zTXt}, false);
        if (readChunks == null || readChunks.isEmpty()) {
            return null;
        }
        org.apache.commons.imaging.common.GenericImageMetadata genericImageMetadata = new org.apache.commons.imaging.common.GenericImageMetadata();
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it = readChunks.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.png.chunks.PngTextChunk pngTextChunk = (org.apache.commons.imaging.formats.png.chunks.PngTextChunk) it.next();
            genericImageMetadata.add(pngTextChunk.getKeyword(), pngTextChunk.getText());
        }
        return genericImageMetadata;
    }

    private java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks(java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> list, org.apache.commons.imaging.formats.png.ChunkType chunkType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.apache.commons.imaging.formats.png.chunks.PngChunk pngChunk : list) {
            if (pngChunk.chunkType == chunkType.value) {
                arrayList.add(pngChunk);
            }
        }
        return arrayList;
    }

    private org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter getTransparencyFilter(org.apache.commons.imaging.formats.png.PngColorType pngColorType, org.apache.commons.imaging.formats.png.chunks.PngChunk pngChunk) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i = org.apache.commons.imaging.formats.png.PngImageParser.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[pngColorType.ordinal()];
        if (i == 1) {
            return new org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale(pngChunk.getBytes());
        }
        if (i == 2) {
            return new org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor(pngChunk.getBytes());
        }
        if (i == 3) {
            return new org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor(pngChunk.getBytes());
        }
        throw new org.apache.commons.imaging.ImageReadException("Simple Transparency not compatible with ColorType: ".concat(java.lang.String.valueOf(pngColorType)));
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr pngChunkIhdr;
        org.apache.commons.imaging.ImageFormats imageFormats;
        int i;
        int i2;
        float f;
        float f2;
        org.apache.commons.imaging.ImageInfo.ColorType colorType;
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, new org.apache.commons.imaging.formats.png.ChunkType[]{org.apache.commons.imaging.formats.png.ChunkType.IHDR, org.apache.commons.imaging.formats.png.ChunkType.pHYs, org.apache.commons.imaging.formats.png.ChunkType.sCAL, org.apache.commons.imaging.formats.png.ChunkType.tEXt, org.apache.commons.imaging.formats.png.ChunkType.zTXt, org.apache.commons.imaging.formats.png.ChunkType.tRNS, org.apache.commons.imaging.formats.png.ChunkType.PLTE, org.apache.commons.imaging.formats.png.ChunkType.iTXt}, false);
        if (readChunks == null || readChunks.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: no chunks");
        }
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.IHDR);
        if (filterChunks.size() != 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG contains more than one Header");
        }
        org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr pngChunkIhdr2 = (org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr) filterChunks.get(0);
        boolean hasAlpha = !filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.tRNS).isEmpty() ? true : pngChunkIhdr2.pngColorType.hasAlpha();
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks2 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.pHYs);
        if (filterChunks2.size() > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PNG contains more than one pHYs: ");
            sb.append(filterChunks2.size());
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        org.apache.commons.imaging.formats.png.chunks.PngChunkPhys pngChunkPhys = filterChunks2.size() == 1 ? (org.apache.commons.imaging.formats.png.chunks.PngChunkPhys) filterChunks2.get(0) : null;
        org.apache.commons.imaging.formats.png.PhysicalScale physicalScale = org.apache.commons.imaging.formats.png.PhysicalScale.UNDEFINED;
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks3 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.sCAL);
        if (filterChunks3.size() > 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PNG contains more than one sCAL:");
            sb2.append(filterChunks3.size());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (filterChunks3.size() == 1) {
            org.apache.commons.imaging.formats.png.chunks.PngChunkScal pngChunkScal = (org.apache.commons.imaging.formats.png.chunks.PngChunkScal) filterChunks3.get(0);
            if (pngChunkScal.unitSpecifier == 1) {
                physicalScale = org.apache.commons.imaging.formats.png.PhysicalScale.createFromMeters(pngChunkScal.unitsPerPixelXAxis, pngChunkScal.unitsPerPixelYAxis);
            } else {
                physicalScale = org.apache.commons.imaging.formats.png.PhysicalScale.createFromRadians(pngChunkScal.unitsPerPixelXAxis, pngChunkScal.unitsPerPixelYAxis);
            }
        }
        org.apache.commons.imaging.formats.png.PhysicalScale physicalScale2 = physicalScale;
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks4 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.tEXt);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks5 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.zTXt);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks6 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.iTXt);
        int size = filterChunks4.size() + filterChunks5.size() + filterChunks6.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it = filterChunks4.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.png.chunks.PngChunkText pngChunkText = (org.apache.commons.imaging.formats.png.chunks.PngChunkText) it.next();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(pngChunkText.keyword);
            sb3.append(": ");
            sb3.append(pngChunkText.text);
            arrayList.add(sb3.toString());
            arrayList2.add(pngChunkText.getContents());
        }
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it2 = filterChunks5.iterator();
        while (it2.hasNext()) {
            org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt pngChunkZtxt = (org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt) it2.next();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(pngChunkZtxt.keyword);
            sb4.append(": ");
            sb4.append(pngChunkZtxt.text);
            arrayList.add(sb4.toString());
            arrayList2.add(pngChunkZtxt.getContents());
        }
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it3 = filterChunks6.iterator();
        while (it3.hasNext()) {
            org.apache.commons.imaging.formats.png.chunks.PngChunkItxt pngChunkItxt = (org.apache.commons.imaging.formats.png.chunks.PngChunkItxt) it3.next();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(pngChunkItxt.keyword);
            sb5.append(": ");
            sb5.append(pngChunkItxt.text);
            arrayList.add(sb5.toString());
            arrayList2.add(pngChunkItxt.getContents());
        }
        int i3 = pngChunkIhdr2.bitDepth;
        int samplesPerPixel = pngChunkIhdr2.pngColorType.getSamplesPerPixel();
        org.apache.commons.imaging.ImageFormats imageFormats2 = org.apache.commons.imaging.ImageFormats.PNG;
        int i4 = pngChunkIhdr2.height;
        int i5 = pngChunkIhdr2.width;
        boolean isProgressive = pngChunkIhdr2.interlaceMethod.isProgressive();
        if (pngChunkPhys == null || pngChunkPhys.unitSpecifier != 1) {
            pngChunkIhdr = pngChunkIhdr2;
            imageFormats = imageFormats2;
            i = -1;
            i2 = -1;
            f = -1.0f;
            f2 = -1.0f;
        } else {
            int round = (int) java.lang.Math.round(pngChunkPhys.pixelsPerUnitXAxis * 0.0254d);
            pngChunkIhdr = pngChunkIhdr2;
            imageFormats = imageFormats2;
            f = (float) (i4 / (pngChunkPhys.pixelsPerUnitYAxis * 0.0254d));
            i2 = round;
            f2 = (float) (i5 / (pngChunkPhys.pixelsPerUnitXAxis * 0.0254d));
            i = (int) java.lang.Math.round(pngChunkPhys.pixelsPerUnitYAxis * 0.0254d);
        }
        boolean z = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.PLTE).size() > 1;
        org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr pngChunkIhdr3 = pngChunkIhdr;
        int i6 = org.apache.commons.imaging.formats.png.PngImageParser.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[pngChunkIhdr3.pngColorType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2 && i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 5) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Png: Unknown ColorType: ");
                        sb6.append(pngChunkIhdr3.pngColorType);
                        throw new org.apache.commons.imaging.ImageReadException(sb6.toString());
                    }
                }
            }
            colorType = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
            return new org.apache.commons.imaging.formats.png.PngImageInfo("Png", i3 * samplesPerPixel, arrayList, imageFormats, "PNG Portable Network Graphics", i4, androidx.media3.common.MimeTypes.IMAGE_PNG, 1, i, f, i2, f2, i5, isProgressive, hasAlpha, z, colorType, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.PNG_FILTER, arrayList2, physicalScale2);
        }
        colorType = org.apache.commons.imaging.ImageInfo.ColorType.GRAYSCALE;
        return new org.apache.commons.imaging.formats.png.PngImageInfo("Png", i3 * samplesPerPixel, arrayList, imageFormats, "PNG Portable Network Graphics", i4, androidx.media3.common.MimeTypes.IMAGE_PNG, 1, i, f, i2, f2, i5, isProgressive, hasAlpha, z, colorType, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.PNG_FILTER, arrayList2, physicalScale2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3  */
    @Override // org.apache.commons.imaging.ImageParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection;
        java.awt.color.ICC_Profile iCC_Profile;
        java.awt.image.BufferedImage colorBufferedImage;
        org.apache.commons.imaging.formats.png.ScanExpediter scanExpediterSimple;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, new org.apache.commons.imaging.formats.png.ChunkType[]{org.apache.commons.imaging.formats.png.ChunkType.IHDR, org.apache.commons.imaging.formats.png.ChunkType.PLTE, org.apache.commons.imaging.formats.png.ChunkType.IDAT, org.apache.commons.imaging.formats.png.ChunkType.tRNS, org.apache.commons.imaging.formats.png.ChunkType.iCCP, org.apache.commons.imaging.formats.png.ChunkType.gAMA, org.apache.commons.imaging.formats.png.ChunkType.sRGB}, false);
        if (readChunks == null || readChunks.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: no chunks");
        }
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.IHDR);
        if (filterChunks.size() != 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG contains more than one Header");
        }
        org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr pngChunkIhdr = (org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr) filterChunks.get(0);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks2 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.PLTE);
        if (filterChunks2.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG contains more than one Palette");
        }
        java.awt.color.ICC_Profile iCC_Profile2 = null;
        org.apache.commons.imaging.formats.png.chunks.PngChunkPlte pngChunkPlte = filterChunks2.size() == 1 ? (org.apache.commons.imaging.formats.png.chunks.PngChunkPlte) filterChunks2.get(0) : null;
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks3 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.IDAT);
        if (filterChunks3.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("PNG missing image data");
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it = filterChunks3.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(((org.apache.commons.imaging.formats.png.chunks.PngChunkIdat) it.next()).getBytes());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks4 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.tRNS);
        org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter = !filterChunks4.isEmpty() ? getTransparencyFilter(pngChunkIhdr.pngColorType, filterChunks4.get(0)) : null;
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks5 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.sRGB);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks6 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.gAMA);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks7 = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.iCCP);
        if (filterChunks5.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: unexpected sRGB chunk");
        }
        if (filterChunks6.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: unexpected gAMA chunk");
        }
        if (filterChunks7.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: unexpected iCCP chunk");
        }
        if (filterChunks5.size() == 1) {
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                logger.finest("sRGB, no color management necessary.");
            }
        } else {
            if (filterChunks7.size() == 1) {
                java.util.logging.Logger logger2 = LOGGER;
                if (logger2.isLoggable(java.util.logging.Level.FINEST)) {
                    logger2.finest("iCCP.");
                }
                iCC_Profile = java.awt.color.ICC_Profile.getInstance(((org.apache.commons.imaging.formats.png.chunks.PngChunkIccp) filterChunks7.get(0)).getUncompressedProfile());
                gammaCorrection = null;
                iCC_Profile2 = iCC_Profile;
                int i = pngChunkIhdr.width;
                int i2 = pngChunkIhdr.height;
                org.apache.commons.imaging.formats.png.PngColorType pngColorType = pngChunkIhdr.pngColorType;
                int i3 = pngChunkIhdr.bitDepth;
                if (pngChunkIhdr.filterMethod != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PNG: unknown FilterMethod: ");
                    sb.append(pngChunkIhdr.filterMethod);
                    throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                }
                int samplesPerPixel = i3 * pngColorType.getSamplesPerPixel();
                boolean z = pngColorType.hasAlpha() || transparencyFilter != null;
                if (pngColorType.isGreyscale()) {
                    colorBufferedImage = getBufferedImageFactory(hashMap).getGrayscaleBufferedImage(i, i2, z);
                } else {
                    colorBufferedImage = getBufferedImageFactory(hashMap).getColorBufferedImage(i, i2, z);
                }
                java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(byteArray));
                int i4 = org.apache.commons.imaging.formats.png.PngImageParser.AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod[pngChunkIhdr.interlaceMethod.ordinal()];
                if (i4 == 1) {
                    scanExpediterSimple = new org.apache.commons.imaging.formats.png.ScanExpediterSimple(i, i2, inflaterInputStream, colorBufferedImage, pngColorType, i3, samplesPerPixel, pngChunkPlte, gammaCorrection, transparencyFilter);
                } else if (i4 == 2) {
                    scanExpediterSimple = new org.apache.commons.imaging.formats.png.ScanExpediterInterlaced(i, i2, inflaterInputStream, colorBufferedImage, pngColorType, i3, samplesPerPixel, pngChunkPlte, gammaCorrection, transparencyFilter);
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown InterlaceMethod: ");
                    sb2.append(pngChunkIhdr.interlaceMethod);
                    throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
                }
                scanExpediterSimple.drive();
                if (iCC_Profile2 == null) {
                    return colorBufferedImage;
                }
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(new org.apache.commons.imaging.icc.IccProfileParser().issRGB(iCC_Profile2));
                if (valueOf == null || !valueOf.booleanValue()) {
                    return new org.apache.commons.imaging.ColorTools().convertBetweenColorSpaces(colorBufferedImage, new java.awt.color.ICC_ColorSpace(iCC_Profile2), java.awt.image.ColorModel.getRGBdefault().getColorSpace());
                }
                return colorBufferedImage;
            }
            if (filterChunks6.size() == 1) {
                double gamma = ((org.apache.commons.imaging.formats.png.chunks.PngChunkGama) filterChunks6.get(0)).getGamma();
                org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection2 = java.lang.Math.abs(1.0d - gamma) >= 0.5d ? new org.apache.commons.imaging.formats.png.GammaCorrection(gamma, 1.0d) : null;
                if (gammaCorrection2 != null && pngChunkPlte != null) {
                    pngChunkPlte.correct(gammaCorrection2);
                }
                gammaCorrection = gammaCorrection2;
                int i5 = pngChunkIhdr.width;
                int i22 = pngChunkIhdr.height;
                org.apache.commons.imaging.formats.png.PngColorType pngColorType2 = pngChunkIhdr.pngColorType;
                int i32 = pngChunkIhdr.bitDepth;
                if (pngChunkIhdr.filterMethod != 0) {
                }
            }
        }
        iCC_Profile = null;
        gammaCorrection = null;
        iCC_Profile2 = iCC_Profile;
        int i52 = pngChunkIhdr.width;
        int i222 = pngChunkIhdr.height;
        org.apache.commons.imaging.formats.png.PngColorType pngColorType22 = pngChunkIhdr.pngColorType;
        int i322 = pngChunkIhdr.bitDepth;
        if (pngChunkIhdr.filterMethod != 0) {
        }
    }

    /* renamed from: org.apache.commons.imaging.formats.png.PngImageParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod;
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType;

        static {
            int[] iArr = new int[org.apache.commons.imaging.formats.png.InterlaceMethod.values().length];
            $SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod = iArr;
            try {
                iArr[org.apache.commons.imaging.formats.png.InterlaceMethod.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod[org.apache.commons.imaging.formats.png.InterlaceMethod.ADAM7.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[org.apache.commons.imaging.formats.png.PngColorType.values().length];
            $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType = iArr2;
            try {
                iArr2[org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.INDEXED_COLOR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.GREYSCALE_WITH_ALPHA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[org.apache.commons.imaging.formats.png.PngColorType.TRUE_COLOR_WITH_ALPHA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, (org.apache.commons.imaging.formats.png.ChunkType[]) null, false);
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> filterChunks = filterChunks(readChunks, org.apache.commons.imaging.formats.png.ChunkType.IHDR);
        if (filterChunks.size() != 1) {
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                logger.finest("PNG contains more than one Header");
            }
            return false;
        }
        org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr pngChunkIhdr = (org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr) filterChunks.get(0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Color: ");
        sb.append(pngChunkIhdr.pngColorType.name());
        printWriter.println(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("chunks: ");
        sb2.append(readChunks.size());
        printWriter.println(sb2.toString());
        if (readChunks.isEmpty()) {
            return false;
        }
        for (int i = 0; i < readChunks.size(); i++) {
            org.apache.commons.imaging.formats.png.chunks.PngChunk pngChunk = readChunks.get(i);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\t");
            sb3.append(i);
            sb3.append(": ");
            org.apache.commons.imaging.common.BinaryFunctions.printCharQuad(printWriter, sb3.toString(), pngChunk.chunkType);
        }
        printWriter.println("");
        printWriter.flush();
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        new org.apache.commons.imaging.formats.png.PngWriter().writeImage(bufferedImage, outputStream, map);
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public java.lang.String getXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.png.chunks.PngChunk> readChunks = readChunks(byteSource, new org.apache.commons.imaging.formats.png.ChunkType[]{org.apache.commons.imaging.formats.png.ChunkType.iTXt}, false);
        if (readChunks == null || readChunks.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<org.apache.commons.imaging.formats.png.chunks.PngChunk> it = readChunks.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.png.chunks.PngChunkItxt pngChunkItxt = (org.apache.commons.imaging.formats.png.chunks.PngChunkItxt) it.next();
            if (pngChunkItxt.getKeyword().equals(org.apache.commons.imaging.formats.png.PngConstants.XMP_KEYWORD)) {
                arrayList.add(pngChunkItxt);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG contains more than one XMP chunk.");
        }
        return ((org.apache.commons.imaging.formats.png.chunks.PngChunkItxt) arrayList.get(0)).getText();
    }
}
