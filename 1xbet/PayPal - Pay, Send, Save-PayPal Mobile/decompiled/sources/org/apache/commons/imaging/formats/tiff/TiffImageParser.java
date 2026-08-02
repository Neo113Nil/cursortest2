package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffImageParser extends org.apache.commons.imaging.ImageParser implements org.apache.commons.imaging.common.XmpEmbeddable {
    private static final java.lang.String DEFAULT_EXTENSION = ".tif";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".tiff"};

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Tiff-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.TIFF};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map)).readFirstDirectory(byteSource, map, false, org.apache.commons.imaging.FormatCompliance.getDefault()).directories.get(0).getFieldValue((org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes) org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTER_COLOR_PROFILE, false);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory = new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map)).readFirstDirectory(byteSource, map, false, org.apache.commons.imaging.FormatCompliance.getDefault()).directories.get(0);
        org.apache.commons.imaging.formats.tiff.TiffField findField = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);
        if (findField == null || findField2 == null) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF image missing size info.");
        }
        return new java.awt.Dimension(findField.getIntValue(), findField2.getIntValue());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.FormatCompliance formatCompliance = org.apache.commons.imaging.FormatCompliance.getDefault();
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader = new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map));
        org.apache.commons.imaging.formats.tiff.TiffContents readContents = tiffReader.readContents(byteSource, map, formatCompliance);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory> list = readContents.directories;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(readContents);
        for (org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory : list) {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory(tiffReader.getByteOrder(), tiffDirectory);
            java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> it = tiffDirectory.getDirectoryEntries().iterator();
            while (it.hasNext()) {
                directory.add(it.next());
            }
            tiffImageMetadata.add(directory);
        }
        return tiffImageMetadata;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i;
        float f;
        int i2;
        float f2;
        org.apache.commons.imaging.ImageInfo.CompressionAlgorithm compressionAlgorithm;
        int i3;
        float f3;
        int i4;
        float f4;
        org.apache.commons.imaging.formats.tiff.TiffContents readDirectories = new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map)).readDirectories(byteSource, false, org.apache.commons.imaging.FormatCompliance.getDefault());
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory = readDirectories.directories.get(0);
        org.apache.commons.imaging.formats.tiff.TiffField findField = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);
        if (findField == null || findField2 == null) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF image missing size info.");
        }
        int intValue = findField2.getIntValue();
        int intValue2 = findField.getIntValue();
        org.apache.commons.imaging.formats.tiff.TiffField findField3 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
        int intValue3 = (findField3 == null || findField3.getValue() == null) ? 2 : findField3.getIntValue();
        double d = intValue3 != 2 ? intValue3 != 3 ? -1.0d : 2.54d : 1.0d;
        if (d > 0.0d) {
            org.apache.commons.imaging.formats.tiff.TiffField findField4 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XRESOLUTION);
            org.apache.commons.imaging.formats.tiff.TiffField findField5 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YRESOLUTION);
            if (findField4 == null || findField4.getValue() == null) {
                i3 = -1;
                f3 = -1.0f;
            } else {
                double doubleValue = findField4.getDoubleValue() * d;
                i3 = (int) java.lang.Math.round(doubleValue);
                f3 = (float) (intValue2 / doubleValue);
            }
            if (findField5 == null || findField5.getValue() == null) {
                i4 = -1;
                f4 = -1.0f;
            } else {
                double doubleValue2 = findField5.getDoubleValue() * d;
                i4 = (int) java.lang.Math.round(doubleValue2);
                f4 = (float) (intValue / doubleValue2);
            }
            i = i4;
            i2 = i3;
            f2 = f3;
            f = f4;
        } else {
            i = -1;
            f = -1.0f;
            i2 = -1;
            f2 = -1.0f;
        }
        org.apache.commons.imaging.formats.tiff.TiffField findField6 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        int intValueOrArraySum = (findField6 == null || findField6.getValue() == null) ? 1 : findField6.getIntValueOrArraySum();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> list = tiffDirectory.entries;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        org.apache.commons.imaging.ImageFormats imageFormats = org.apache.commons.imaging.ImageFormats.TIFF;
        int size = readDirectories.directories.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tiff v.");
        sb.append(readDirectories.header.tiffVersion);
        java.lang.String obj = sb.toString();
        boolean z = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COLOR_MAP) != null;
        org.apache.commons.imaging.ImageInfo.ColorType colorType = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
        int fieldValue = 65535 & (tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION) != null ? tiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION) : (short) 1);
        if (fieldValue == 32771) {
            compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE;
        } else if (fieldValue != 32773) {
            switch (fieldValue) {
                case 1:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE;
                    break;
                case 2:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.CCITT_1D;
                    break;
                case 3:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.CCITT_GROUP_3;
                    break;
                case 4:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.CCITT_GROUP_4;
                    break;
                case 5:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.LZW;
                    break;
                case 6:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.JPEG;
                    break;
                default:
                    compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.UNKNOWN;
                    break;
            }
        } else {
            compressionAlgorithm = org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.PACKBITS;
        }
        return new org.apache.commons.imaging.ImageInfo(obj, intValueOrArraySum, arrayList, imageFormats, "TIFF Tag-based Image File Format", intValue, "image/tiff", size, i, f, i2, f2, intValue2, false, false, z, colorType, compressionAlgorithm);
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public java.lang.String getXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] fieldValue = new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map)).readDirectories(byteSource, false, org.apache.commons.imaging.FormatCompliance.getDefault()).directories.get(0).getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XMP, false);
        if (fieldValue == null) {
            return null;
        }
        return new java.lang.String(fieldValue, java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        try {
            printWriter.println("tiff.dumpImageFile");
            org.apache.commons.imaging.ImageInfo imageInfo = getImageInfo(byteSource);
            if (imageInfo == null) {
                return false;
            }
            imageInfo.toString(printWriter, "");
            printWriter.println("");
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory> list = new org.apache.commons.imaging.formats.tiff.TiffReader(true).readContents(byteSource, null, org.apache.commons.imaging.FormatCompliance.getDefault()).directories;
            if (list == null) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> list2 = list.get(i).entries;
                if (list2 == null) {
                    return false;
                }
                java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> it = list2.iterator();
                while (it.hasNext()) {
                    it.next().dump(printWriter, java.lang.Integer.toString(i));
                }
            }
            printWriter.println("");
            return true;
        } finally {
            printWriter.println("");
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.FormatCompliance getFormatCompliance(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.FormatCompliance formatCompliance = org.apache.commons.imaging.FormatCompliance.getDefault();
        new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(null)).readContents(byteSource, null, formatCompliance);
        return formatCompliance;
    }

    public java.util.List<byte[]> collectRawImageData(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffContents readDirectories = new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map)).readDirectories(byteSource, true, org.apache.commons.imaging.FormatCompliance.getDefault());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < readDirectories.directories.size(); i++) {
            for (org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement : readDirectories.directories.get(i).getTiffRawImageDataElements()) {
                arrayList.add(byteSource.getBlock(imageDataElement.offset, imageDataElement.length));
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.FormatCompliance formatCompliance = org.apache.commons.imaging.FormatCompliance.getDefault();
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader = new org.apache.commons.imaging.formats.tiff.TiffReader(isStrict(map));
        org.apache.commons.imaging.formats.tiff.TiffContents readFirstDirectory = tiffReader.readFirstDirectory(byteSource, map, true, formatCompliance);
        java.awt.image.BufferedImage tiffImage = readFirstDirectory.directories.get(0).getTiffImage(tiffReader.getByteOrder(), map);
        if (tiffImage != null) {
            return tiffImage;
        }
        throw new org.apache.commons.imaging.ImageReadException("TIFF does not contain an image.");
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.FormatCompliance formatCompliance = org.apache.commons.imaging.FormatCompliance.getDefault();
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        org.apache.commons.imaging.formats.tiff.TiffContents readDirectories = tiffReader.readDirectories(byteSource, true, formatCompliance);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < readDirectories.directories.size(); i++) {
            java.awt.image.BufferedImage tiffImage = readDirectories.directories.get(i).getTiffImage(tiffReader.getByteOrder(), null);
            if (tiffImage != null) {
                arrayList.add(tiffImage);
            }
        }
        return arrayList;
    }

    private java.lang.Integer getIntegerParameter(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Integer) {
            return (java.lang.Integer) obj;
        }
        throw new org.apache.commons.imaging.ImageReadException("Non-Integer parameter ".concat(java.lang.String.valueOf(str)));
    }

    private java.awt.Rectangle checkForSubImage(java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException {
        java.lang.Integer integerParameter = getIntegerParameter(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_SUBIMAGE_X, map);
        java.lang.Integer integerParameter2 = getIntegerParameter(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_SUBIMAGE_Y, map);
        java.lang.Integer integerParameter3 = getIntegerParameter(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, map);
        java.lang.Integer integerParameter4 = getIntegerParameter(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, map);
        if (integerParameter == null && integerParameter2 == null && integerParameter3 == null && integerParameter4 == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        if (integerParameter == null) {
            sb.append(" x0,");
        }
        if (integerParameter2 == null) {
            sb.append(" y0,");
        }
        if (integerParameter3 == null) {
            sb.append(" width,");
        }
        if (integerParameter4 == null) {
            sb.append(" height,");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Incomplete subimage parameters, missing");
            sb2.append(sb.toString());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        return new java.awt.Rectangle(integerParameter.intValue(), integerParameter2.intValue(), integerParameter3.intValue(), integerParameter4.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, java.nio.ByteOrder byteOrder, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.awt.Rectangle rectangle;
        int intValue;
        org.apache.commons.imaging.formats.tiff.TiffField findField;
        int[] iArr;
        int i;
        int[] iArr2;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter;
        if (tiffDirectory.entries == null) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF missing entries");
        }
        short fieldValue = tiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION);
        short fieldValue2 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION) != null ? tiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION) : (short) 1;
        int singleFieldValue = tiffDirectory.getSingleFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        int singleFieldValue2 = tiffDirectory.getSingleFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
        java.awt.Rectangle checkForSubImage = checkForSubImage(map);
        if (checkForSubImage != null) {
            if (checkForSubImage.width <= 0) {
                throw new org.apache.commons.imaging.ImageReadException("negative or zero subimage width");
            }
            if (checkForSubImage.height <= 0) {
                throw new org.apache.commons.imaging.ImageReadException("negative or zero subimage height");
            }
            if (checkForSubImage.x < 0 || checkForSubImage.x >= singleFieldValue) {
                throw new org.apache.commons.imaging.ImageReadException("subimage x is outside raster");
            }
            if (checkForSubImage.x + checkForSubImage.width > singleFieldValue) {
                throw new org.apache.commons.imaging.ImageReadException("subimage (x+width) is outside raster");
            }
            if (checkForSubImage.y < 0 || checkForSubImage.y >= singleFieldValue2) {
                throw new org.apache.commons.imaging.ImageReadException("subimage y is outside raster");
            }
            if (checkForSubImage.y + checkForSubImage.height > singleFieldValue2) {
                throw new org.apache.commons.imaging.ImageReadException("subimage (y+height) is outside raster");
            }
            if (checkForSubImage.x == 0 && checkForSubImage.y == 0 && checkForSubImage.width == singleFieldValue && checkForSubImage.height == singleFieldValue2) {
                rectangle = null;
                org.apache.commons.imaging.formats.tiff.TiffField findField2 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
                intValue = findField2 == null ? findField2.getIntValue() : 1;
                int[] iArr3 = {1};
                findField = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
                if (findField == null) {
                    iArr = findField.getIntArrayValue();
                    i = findField.getIntValueOrArraySum();
                } else {
                    iArr = iArr3;
                    i = intValue;
                }
                org.apache.commons.imaging.formats.tiff.TiffField findField3 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PREDICTOR);
                int intValueOrArraySum = findField3 == null ? findField3.getIntValueOrArraySum() : -1;
                if (intValue == iArr.length) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Tiff: samplesPerPixel (");
                    sb.append(intValue);
                    sb.append(")!=fBitsPerSample.length (");
                    sb.append(iArr.length);
                    sb.append(")");
                    throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                }
                java.lang.Object obj = map != null ? map.get(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER) : null;
                if (obj instanceof org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) {
                    photometricInterpreter = (org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) obj;
                    iArr2 = iArr;
                } else {
                    iArr2 = iArr;
                    photometricInterpreter = getPhotometricInterpreter(tiffDirectory, fieldValue & kotlin.UShort.MAX_VALUE, i, iArr, intValueOrArraySum, intValue, singleFieldValue, singleFieldValue2);
                }
                org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader dataReader = tiffDirectory.getTiffImageData().getDataReader(tiffDirectory, photometricInterpreter, i, iArr2, intValueOrArraySum, intValue, singleFieldValue, singleFieldValue2, fieldValue2 & kotlin.UShort.MAX_VALUE, byteOrder);
                if (rectangle != null) {
                    return dataReader.readImageData(rectangle);
                }
                org.apache.commons.imaging.common.ImageBuilder imageBuilder = new org.apache.commons.imaging.common.ImageBuilder(singleFieldValue, singleFieldValue2, false);
                dataReader.readImageData(imageBuilder);
                return imageBuilder.getBufferedImage();
            }
        }
        rectangle = checkForSubImage;
        org.apache.commons.imaging.formats.tiff.TiffField findField22 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        if (findField22 == null) {
        }
        int[] iArr32 = {1};
        findField = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (findField == null) {
        }
        org.apache.commons.imaging.formats.tiff.TiffField findField32 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PREDICTOR);
        int intValueOrArraySum2 = findField32 == null ? findField32.getIntValueOrArraySum() : -1;
        if (intValue == iArr.length) {
        }
    }

    private org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter getPhotometricInterpreter(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) throws org.apache.commons.imaging.ImageReadException {
        if (i == 0 || i == 1) {
            return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(i4, iArr, i3, i5, i6, i == 0);
        }
        if (i == 2) {
            return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb(i4, iArr, i3, i5, i6);
        }
        if (i != 3) {
            if (i == 5) {
                return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk(i4, iArr, i3, i5, i6);
            }
            if (i == 6) {
                return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr(i4, iArr, i3, i5, i6);
            }
            if (i == 8) {
                return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(i4, iArr, i3, i5, i6);
            }
            switch (i) {
                case org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L /* 32844 */:
                case org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV /* 32845 */:
                    return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv(i4, iArr, i3, i5, i6);
                default:
                    throw new org.apache.commons.imaging.ImageReadException("TIFF: Unknown fPhotometricInterpretation: ".concat(java.lang.String.valueOf(i)));
            }
        }
        int[] intArrayValue = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COLOR_MAP, true).getIntArrayValue();
        int i7 = (1 << i2) * 3;
        if (intArrayValue.length != i7) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tiff: fColorMap.length (");
            sb.append(intArrayValue.length);
            sb.append(")!=expectedColormapSize (");
            sb.append(i7);
            sb.append(")");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette(i4, iArr, i3, i5, i6, intArrayValue);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy().writeImage(bufferedImage, outputStream, map);
    }

    org.apache.commons.imaging.formats.tiff.TiffRasterData getFloatingPointRasterData(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, java.nio.ByteOrder byteOrder, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int[] iArr;
        int i;
        if (tiffDirectory.entries == null) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF missing entries");
        }
        if (tiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, true)[0] != 3) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF does not provide floating-point data");
        }
        org.apache.commons.imaging.formats.tiff.TiffField findField = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        int intValue = findField != null ? findField.getIntValue() : 1;
        if (intValue != 1) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF floating-point data uses unsupported samples per pixel: ".concat(java.lang.String.valueOf(intValue)));
        }
        int[] iArr2 = {1};
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (findField2 != null) {
            iArr = findField2.getIntArrayValue();
            i = findField2.getIntValueOrArraySum();
        } else {
            iArr = iArr2;
            i = intValue;
        }
        if (i != 32 && i != 64) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF floating-point data uses unsupported bits-per-pixel: ".concat(java.lang.String.valueOf(i)));
        }
        short fieldValue = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION) != null ? tiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION) : (short) 1;
        int singleFieldValue = tiffDirectory.getSingleFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        int singleFieldValue2 = tiffDirectory.getSingleFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
        java.awt.Rectangle checkForSubImage = checkForSubImage(map);
        if (checkForSubImage != null) {
            if (checkForSubImage.width <= 0) {
                throw new org.apache.commons.imaging.ImageReadException("negative or zero subimage width");
            }
            if (checkForSubImage.height <= 0) {
                throw new org.apache.commons.imaging.ImageReadException("negative or zero subimage height");
            }
            if (checkForSubImage.x < 0 || checkForSubImage.x >= singleFieldValue) {
                throw new org.apache.commons.imaging.ImageReadException("subimage x is outside raster");
            }
            if (checkForSubImage.x + checkForSubImage.width > singleFieldValue) {
                throw new org.apache.commons.imaging.ImageReadException("subimage (x+width) is outside raster");
            }
            if (checkForSubImage.y < 0 || checkForSubImage.y >= singleFieldValue2) {
                throw new org.apache.commons.imaging.ImageReadException("subimage y is outside raster");
            }
            if (checkForSubImage.y + checkForSubImage.height > singleFieldValue2) {
                throw new org.apache.commons.imaging.ImageReadException("subimage (y+height) is outside raster");
            }
            if (checkForSubImage.x == 0 && checkForSubImage.y == 0 && checkForSubImage.width == singleFieldValue && checkForSubImage.height == singleFieldValue2) {
                checkForSubImage = null;
            }
        }
        org.apache.commons.imaging.formats.tiff.TiffField findField3 = tiffDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PREDICTOR);
        int intValueOrArraySum = findField3 != null ? findField3.getIntValueOrArraySum() : -1;
        if (intValueOrArraySum == 2) {
            throw new org.apache.commons.imaging.ImageReadException("TIFF floating-point data uses unsupported horizontal-differencing predictor");
        }
        return tiffDirectory.getTiffImageData().getDataReader(tiffDirectory, new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(intValue, iArr, intValueOrArraySum, singleFieldValue, singleFieldValue2, false), i, iArr, intValueOrArraySum, intValue, singleFieldValue, singleFieldValue2, fieldValue & kotlin.UShort.MAX_VALUE, byteOrder).readRasterData(checkForSubImage);
    }
}
