package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
public abstract class TiffImageWriterBase {
    protected final java.nio.ByteOrder byteOrder;

    public abstract void write(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException;

    public TiffImageWriterBase() {
        this.byteOrder = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
    }

    public TiffImageWriterBase(java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    protected static int imageDataPaddingLength(int i) {
        return (4 - (i % 4)) % 4;
    }

    protected org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary validateDirectories(org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageWriteException {
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> directories = tiffOutputSet.getDirectories();
        if (directories.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("No directories.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory2 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory3 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory4 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField2 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField3 = null;
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory5 : directories) {
            int i = tiffOutputDirectory5.type;
            hashMap.put(java.lang.Integer.valueOf(i), tiffOutputDirectory5);
            if (i >= 0) {
                if (arrayList.contains(java.lang.Integer.valueOf(i))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("More than one directory with index: ");
                    sb.append(i);
                    sb.append(".");
                    throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
                }
                arrayList.add(java.lang.Integer.valueOf(i));
            } else if (i == -4) {
                if (tiffOutputDirectory4 != null) {
                    throw new org.apache.commons.imaging.ImageWriteException("More than one Interoperability directory.");
                }
                tiffOutputDirectory4 = tiffOutputDirectory5;
            } else if (i != -3) {
                if (i != -2) {
                    throw new org.apache.commons.imaging.ImageWriteException("Unknown directory: ".concat(java.lang.String.valueOf(i)));
                }
                if (tiffOutputDirectory2 != null) {
                    throw new org.apache.commons.imaging.ImageWriteException("More than one EXIF directory.");
                }
                tiffOutputDirectory2 = tiffOutputDirectory5;
            } else {
                if (tiffOutputDirectory3 != null) {
                    throw new org.apache.commons.imaging.ImageWriteException("More than one GPS directory.");
                }
                tiffOutputDirectory3 = tiffOutputDirectory5;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            for (org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField4 : tiffOutputDirectory5.getFields()) {
                if (hashSet.contains(java.lang.Integer.valueOf(tiffOutputField4.tag))) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Tag (");
                    sb2.append(tiffOutputField4.tagInfo.getDescription());
                    sb2.append(") appears twice in directory.");
                    throw new org.apache.commons.imaging.ImageWriteException(sb2.toString());
                }
                hashSet.add(java.lang.Integer.valueOf(tiffOutputField4.tag));
                if (tiffOutputField4.tag == org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_OFFSET.tag) {
                    if (tiffOutputField3 != null) {
                        throw new org.apache.commons.imaging.ImageWriteException("More than one Exif directory offset field.");
                    }
                    tiffOutputField3 = tiffOutputField4;
                } else if (tiffOutputField4.tag == org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROP_OFFSET.tag) {
                    if (tiffOutputField != null) {
                        throw new org.apache.commons.imaging.ImageWriteException("More than one Interoperability directory offset field.");
                    }
                    tiffOutputField = tiffOutputField4;
                } else if (tiffOutputField4.tag != org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_GPSINFO.tag) {
                    continue;
                } else {
                    if (tiffOutputField2 != null) {
                        throw new org.apache.commons.imaging.ImageWriteException("More than one GPS directory offset field.");
                    }
                    tiffOutputField2 = tiffOutputField4;
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Missing root directory.");
        }
        java.util.Collections.sort(arrayList);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            java.lang.Integer num = (java.lang.Integer) arrayList.get(i2);
            if (num.intValue() != i2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Missing directory: ");
                sb3.append(i2);
                sb3.append(".");
                throw new org.apache.commons.imaging.ImageWriteException(sb3.toString());
            }
            org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory6 = (org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory) hashMap.get(num);
            if (tiffOutputDirectory != null) {
                tiffOutputDirectory.setNextDirectory(tiffOutputDirectory6);
            }
            i2++;
            tiffOutputDirectory = tiffOutputDirectory6;
        }
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory7 = (org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory) hashMap.get(0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary tiffOutputSummary = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary(this.byteOrder, tiffOutputDirectory7, hashMap);
        if (tiffOutputDirectory4 == null && tiffOutputField != null) {
            throw new org.apache.commons.imaging.ImageWriteException("Output set has Interoperability Directory Offset field, but no Interoperability Directory");
        }
        if (tiffOutputDirectory4 != null) {
            if (tiffOutputDirectory2 == null) {
                tiffOutputDirectory2 = tiffOutputSet.addExifDirectory();
            }
            if (tiffOutputField == null) {
                tiffOutputField = org.apache.commons.imaging.formats.tiff.write.TiffOutputField.createOffsetField(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROP_OFFSET, this.byteOrder);
                tiffOutputDirectory2.add(tiffOutputField);
            }
            tiffOutputSummary.add(tiffOutputDirectory4, tiffOutputField);
        }
        if (tiffOutputDirectory2 == null && tiffOutputField3 != null) {
            throw new org.apache.commons.imaging.ImageWriteException("Output set has Exif Directory Offset field, but no Exif Directory");
        }
        if (tiffOutputDirectory2 != null) {
            if (tiffOutputField3 == null) {
                tiffOutputField3 = org.apache.commons.imaging.formats.tiff.write.TiffOutputField.createOffsetField(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_OFFSET, this.byteOrder);
                tiffOutputDirectory7.add(tiffOutputField3);
            }
            tiffOutputSummary.add(tiffOutputDirectory2, tiffOutputField3);
        }
        if (tiffOutputDirectory3 == null && tiffOutputField2 != null) {
            throw new org.apache.commons.imaging.ImageWriteException("Output set has GPS Directory Offset field, but no GPS Directory");
        }
        if (tiffOutputDirectory3 != null) {
            if (tiffOutputField2 == null) {
                tiffOutputField2 = org.apache.commons.imaging.formats.tiff.write.TiffOutputField.createOffsetField(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_GPSINFO, this.byteOrder);
                tiffOutputDirectory7.add(tiffOutputField2);
            }
            tiffOutputSummary.add(tiffOutputDirectory3, tiffOutputField2);
        }
        return tiffOutputSummary;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x020a A[LOOP:1: B:50:0x0207->B:52:0x020a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        int i;
        int i2;
        int i3;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet;
        int intValue;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        java.lang.String str = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet2 = hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_EXIF) ? (org.apache.commons.imaging.formats.tiff.write.TiffOutputSet) hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_EXIF) : null;
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML)) {
            str = (java.lang.String) hashMap.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML);
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML);
        }
        org.apache.commons.imaging.PixelDensity pixelDensity = (org.apache.commons.imaging.PixelDensity) hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (pixelDensity == null) {
            pixelDensity = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(72.0d, 72.0d);
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int i9 = 64000;
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_COMPRESSION)) {
            java.lang.Object obj = hashMap.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_COMPRESSION);
            if (obj == null) {
                i = 5;
            } else {
                if (!(obj instanceof java.lang.Number)) {
                    throw new org.apache.commons.imaging.ImageWriteException("Invalid compression parameter, must be numeric: ".concat(java.lang.String.valueOf(obj)));
                }
                i = ((java.lang.Number) obj).intValue();
            }
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_COMPRESSION);
            if (hashMap.containsKey(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE)) {
                java.lang.Object obj2 = hashMap.get(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE);
                if (!(obj2 instanceof java.lang.Number)) {
                    throw new org.apache.commons.imaging.ImageWriteException("Invalid compression block-size parameter: ".concat(java.lang.String.valueOf(obj)));
                }
                int intValue2 = ((java.lang.Number) obj2).intValue();
                if (intValue2 < 8000) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Block size parameter ");
                    sb.append(intValue2);
                    sb.append(" is less than 8000 minimum");
                    throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
                }
                i9 = intValue2 * 8;
                hashMap.remove(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE);
            }
        } else {
            i = 5;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
        hashMap.remove(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_T4_OPTIONS);
        hashMap.remove(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_T6_OPTIONS);
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        int i10 = 3;
        if (i == 2 || i == 3 || i == 4) {
            i2 = 1;
            i10 = 1;
            i3 = 0;
        } else {
            i2 = 8;
            i3 = 2;
        }
        int max = java.lang.Math.max(1, i9 / ((width * i2) * i10));
        byte[][] strips = getStrips(bufferedImage, i10, i2, max);
        if (i == 2) {
            for (int i11 = 0; i11 < strips.length; i11++) {
                byte[] bArr = strips[i11];
                strips[i11] = org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.compressModifiedHuffman(bArr, width, bArr.length / ((width + 7) / 8));
            }
        } else {
            if (i == 3) {
                java.lang.Integer num = (java.lang.Integer) hashMap2.get(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_T4_OPTIONS);
                int intValue3 = num != null ? num.intValue() : 0;
                i4 = intValue3 & 7;
                boolean z = (intValue3 & 1) != 0;
                if ((intValue3 & 2) != 0) {
                    throw new org.apache.commons.imaging.ImageWriteException("T.4 compression with the uncompressed mode extension is not yet supported");
                }
                boolean z2 = (intValue3 & 4) != 0;
                int i12 = 0;
                while (i12 < strips.length) {
                    if (z) {
                        byte[] bArr2 = strips[i12];
                        i5 = i4;
                        strips[i12] = org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.compressT4_2D(bArr2, width, bArr2.length / ((width + 7) / 8), z2, max);
                    } else {
                        i5 = i4;
                        byte[] bArr3 = strips[i12];
                        strips[i12] = org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.compressT4_1D(bArr3, width, bArr3.length / ((width + 7) / 8), z2);
                    }
                    i12++;
                    i4 = i5;
                }
                tiffOutputSet = tiffOutputSet2;
                intValue = 0;
                org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr = new org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[strips.length];
                i6 = 0;
                while (i6 < strips.length) {
                    byte[] bArr4 = strips[i6];
                    dataElementArr[i6] = new org.apache.commons.imaging.formats.tiff.TiffImageData.Data(0L, bArr4.length, bArr4);
                    i6++;
                    intValue = intValue;
                    i4 = i4;
                    strips = strips;
                }
                i7 = intValue;
                i8 = i4;
                org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet3 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(this.byteOrder);
                org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addRootDirectory = tiffOutputSet3.addRootDirectory();
                addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
                addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
                addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) i3);
                addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION, (short) i);
                addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) i10);
                if (i10 != 3) {
                    short s2 = (short) i2;
                    s = 0;
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, s2, s2, s2);
                } else {
                    s = 0;
                    if (i10 == 1) {
                        addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, (short) i2);
                    }
                }
                addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, max);
                if (!pixelDensity.isUnitless()) {
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT, s);
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XRESOLUTION, org.apache.commons.imaging.common.RationalNumber.valueOf(pixelDensity.getRawHorizontalDensity()));
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YRESOLUTION, org.apache.commons.imaging.common.RationalNumber.valueOf(pixelDensity.getRawVerticalDensity()));
                } else if (pixelDensity.isInInches()) {
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT, (short) 2);
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XRESOLUTION, org.apache.commons.imaging.common.RationalNumber.valueOf(pixelDensity.horizontalDensityInches()));
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YRESOLUTION, org.apache.commons.imaging.common.RationalNumber.valueOf(pixelDensity.verticalDensityInches()));
                } else {
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT, (short) 1);
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XRESOLUTION, org.apache.commons.imaging.common.RationalNumber.valueOf(pixelDensity.horizontalDensityCentimetres()));
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YRESOLUTION, org.apache.commons.imaging.common.RationalNumber.valueOf(pixelDensity.verticalDensityCentimetres()));
                }
                if (i8 != 0) {
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_T4_OPTIONS, i8);
                }
                if (i7 != 0) {
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_T6_OPTIONS, i7);
                }
                if (str != null) {
                    addRootDirectory.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XMP, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                }
                addRootDirectory.setTiffImageData(new org.apache.commons.imaging.formats.tiff.TiffImageData.Strips(dataElementArr, max));
                if (tiffOutputSet != null) {
                    combineUserExifIntoFinalExif(tiffOutputSet, tiffOutputSet3);
                }
                write(outputStream, tiffOutputSet3);
            }
            if (i == 4) {
                java.lang.Integer num2 = (java.lang.Integer) hashMap2.get(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.PARAM_KEY_T6_OPTIONS);
                intValue = (num2 != null ? num2.intValue() : 0) & 4;
                for (int i13 = 0; i13 < strips.length; i13++) {
                    byte[] bArr5 = strips[i13];
                    strips[i13] = org.apache.commons.imaging.common.itu_t4.T4AndT6Compression.compressT6(bArr5, width, bArr5.length / ((width + 7) / 8));
                }
                tiffOutputSet = tiffOutputSet2;
                i4 = 0;
                org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr2 = new org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[strips.length];
                i6 = 0;
                while (i6 < strips.length) {
                }
                i7 = intValue;
                i8 = i4;
                org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet32 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(this.byteOrder);
                org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addRootDirectory2 = tiffOutputSet32.addRootDirectory();
                addRootDirectory2.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
                addRootDirectory2.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
                addRootDirectory2.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) i3);
                addRootDirectory2.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION, (short) i);
                addRootDirectory2.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) i10);
                if (i10 != 3) {
                }
                addRootDirectory2.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, max);
                if (!pixelDensity.isUnitless()) {
                }
                if (i8 != 0) {
                }
                if (i7 != 0) {
                }
                if (str != null) {
                }
                addRootDirectory2.setTiffImageData(new org.apache.commons.imaging.formats.tiff.TiffImageData.Strips(dataElementArr2, max));
                if (tiffOutputSet != null) {
                }
                write(outputStream, tiffOutputSet32);
            }
            if (i == 32773) {
                for (int i14 = 0; i14 < strips.length; i14++) {
                    strips[i14] = new org.apache.commons.imaging.common.PackBits().compress(strips[i14]);
                }
            } else if (i == 5) {
                int i15 = 0;
                while (i15 < strips.length) {
                    strips[i15] = new org.apache.commons.imaging.common.mylzw.MyLzwCompressor(8, java.nio.ByteOrder.BIG_ENDIAN, true).compress(strips[i15]);
                    i15++;
                    tiffOutputSet2 = tiffOutputSet2;
                }
            } else {
                tiffOutputSet = tiffOutputSet2;
                if (i == 8) {
                    for (int i16 = 0; i16 < strips.length; i16++) {
                        strips[i16] = org.apache.commons.imaging.common.ZlibDeflate.compress(strips[i16]);
                    }
                } else if (i != 1) {
                    throw new org.apache.commons.imaging.ImageWriteException("Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits, Zlib Deflate and uncompressed supported).");
                }
                intValue = 0;
                i4 = 0;
                org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr22 = new org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[strips.length];
                i6 = 0;
                while (i6 < strips.length) {
                }
                i7 = intValue;
                i8 = i4;
                org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet322 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(this.byteOrder);
                org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addRootDirectory22 = tiffOutputSet322.addRootDirectory();
                addRootDirectory22.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
                addRootDirectory22.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
                addRootDirectory22.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) i3);
                addRootDirectory22.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION, (short) i);
                addRootDirectory22.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) i10);
                if (i10 != 3) {
                }
                addRootDirectory22.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, max);
                if (!pixelDensity.isUnitless()) {
                }
                if (i8 != 0) {
                }
                if (i7 != 0) {
                }
                if (str != null) {
                }
                addRootDirectory22.setTiffImageData(new org.apache.commons.imaging.formats.tiff.TiffImageData.Strips(dataElementArr22, max));
                if (tiffOutputSet != null) {
                }
                write(outputStream, tiffOutputSet322);
            }
        }
        tiffOutputSet = tiffOutputSet2;
        intValue = 0;
        i4 = 0;
        org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr222 = new org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[strips.length];
        i6 = 0;
        while (i6 < strips.length) {
        }
        i7 = intValue;
        i8 = i4;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet3222 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(this.byteOrder);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addRootDirectory222 = tiffOutputSet3222.addRootDirectory();
        addRootDirectory222.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        addRootDirectory222.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        addRootDirectory222.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) i3);
        addRootDirectory222.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COMPRESSION, (short) i);
        addRootDirectory222.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) i10);
        if (i10 != 3) {
        }
        addRootDirectory222.add(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, max);
        if (!pixelDensity.isUnitless()) {
        }
        if (i8 != 0) {
        }
        if (i7 != 0) {
        }
        if (str != null) {
        }
        addRootDirectory222.setTiffImageData(new org.apache.commons.imaging.formats.tiff.TiffImageData.Strips(dataElementArr222, max));
        if (tiffOutputSet != null) {
        }
        write(outputStream, tiffOutputSet3222);
    }

    private void combineUserExifIntoFinalExif(org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet2) throws org.apache.commons.imaging.ImageWriteException {
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> directories = tiffOutputSet2.getDirectories();
        java.util.Collections.sort(directories, org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory.COMPARATOR);
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory : tiffOutputSet.getDirectories()) {
            int binarySearch = java.util.Collections.binarySearch(directories, tiffOutputDirectory, org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory.COMPARATOR);
            if (binarySearch < 0) {
                tiffOutputSet2.addDirectory(tiffOutputDirectory);
            } else {
                org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory2 = directories.get(binarySearch);
                for (org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField : tiffOutputDirectory.getFields()) {
                    if (tiffOutputDirectory2.findField(tiffOutputField.tagInfo) == null) {
                        tiffOutputDirectory2.add(tiffOutputField);
                    }
                }
            }
        }
    }

    private byte[][] getStrips(java.awt.image.BufferedImage bufferedImage, int i, int i2, int i3) {
        char c;
        int i4 = i3;
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        boolean z = true;
        int i5 = ((height + i4) - 1) / i4;
        byte[][] bArr = new byte[i5][];
        int i6 = height;
        int i7 = 0;
        while (i7 < i5) {
            int min = java.lang.Math.min(i4, i6);
            i6 -= min;
            char c2 = '\b';
            byte[] bArr2 = new byte[min * ((((i2 * i) * width) + 7) / 8)];
            int i8 = i7 * i4;
            int i9 = i8;
            int i10 = 0;
            while (i9 < height && i9 < i8 + i4) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < width) {
                    int rgb = bufferedImage.getRGB(i11, i9);
                    int i14 = (rgb >> 16) & 255;
                    int i15 = (rgb >> 8) & 255;
                    int i16 = rgb & 255;
                    int i17 = width;
                    if (i2 == 1) {
                        int i18 = (((i14 + i15) + i16) / 3 > 127 ? 0 : 1) | (i13 << 1);
                        int i19 = i12 + 1;
                        if (i19 == 8) {
                            bArr2[i10] = (byte) i18;
                            i10++;
                            i12 = 0;
                            i13 = 0;
                        } else {
                            i13 = i18;
                            i12 = i19;
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                        bArr2[i10] = (byte) i14;
                        bArr2[i10 + 1] = (byte) i15;
                        bArr2[i10 + 2] = (byte) i16;
                        i10 += 3;
                    }
                    i11++;
                    z = true;
                    c2 = c;
                    width = i17;
                }
                int i20 = width;
                boolean z2 = z;
                char c3 = c2;
                if (i12 > 0) {
                    bArr2[i10] = (byte) (i13 << (8 - i12));
                    i10++;
                }
                i9++;
                i4 = i3;
                z = z2;
                c2 = c3;
                width = i20;
            }
            bArr[i7] = bArr2;
            i7++;
            i4 = i3;
            z = z;
            width = width;
        }
        return bArr;
    }

    protected void writeImageFileHeader(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException {
        writeImageFileHeader(binaryOutputStream, 8L);
    }

    protected void writeImageFileHeader(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream, long j) throws java.io.IOException {
        if (this.byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            binaryOutputStream.write(73);
            binaryOutputStream.write(73);
        } else {
            binaryOutputStream.write(77);
            binaryOutputStream.write(77);
        }
        binaryOutputStream.write2Bytes(42);
        binaryOutputStream.write4Bytes((int) j);
    }
}
