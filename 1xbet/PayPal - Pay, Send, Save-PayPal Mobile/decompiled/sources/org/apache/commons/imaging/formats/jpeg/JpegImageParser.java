package org.apache.commons.imaging.formats.jpeg;

/* loaded from: classes17.dex */
public class JpegImageParser extends org.apache.commons.imaging.ImageParser implements org.apache.commons.imaging.common.XmpEmbeddable {
    private static final java.lang.String DEFAULT_EXTENSION = ".jpg";
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.jpeg.JpegImageParser.class.getName());
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {".jpg", ".jpeg"};

    public JpegImageParser() {
        setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.JPEG};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Jpeg-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return ".jpg";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return new org.apache.commons.imaging.formats.jpeg.decoder.JpegDecoder().decode(byteSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean keepMarker(int i, int[] iArr) {
        if (iArr == null) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, final int[] iArr, final boolean z, boolean z2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final int[] iArr2 = {org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF1_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF2_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF3_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF5_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF6_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF10_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF11_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF13_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF14_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF15_MARKER};
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                if (i == 65497) {
                    return false;
                }
                if (!org.apache.commons.imaging.formats.jpeg.JpegImageParser.this.keepMarker(i, iArr)) {
                    return true;
                }
                if (i == 65517) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.App13Segment(this, i, bArr3));
                } else if (i == 65518) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.App14Segment(i, bArr3));
                } else if (i == 65506) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.App2Segment(i, bArr3));
                } else if (i == 65504) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.JfifSegment(i, bArr3));
                } else if (java.util.Arrays.binarySearch(iArr2, i) >= 0) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.SofnSegment(i, bArr3));
                } else if (i == 65499) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.DqtSegment(i, bArr3));
                } else if (i >= 65505 && i <= 65519) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.UnknownSegment(i, bArr3));
                } else if (i == 65534) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.ComSegment(i, bArr3));
                }
                return !z;
            }
        });
        return arrayList;
    }

    private byte[] assembleSegments(java.util.List<org.apache.commons.imaging.formats.jpeg.segments.App2Segment> list) throws org.apache.commons.imaging.ImageReadException {
        try {
            return assembleSegments(list, false);
        } catch (org.apache.commons.imaging.ImageReadException unused) {
            return assembleSegments(list, true);
        }
    }

    private byte[] assembleSegments(java.util.List<org.apache.commons.imaging.formats.jpeg.segments.App2Segment> list, boolean z) throws org.apache.commons.imaging.ImageReadException {
        if (list.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("No App2 Segments Found.");
        }
        int i = list.get(0).numMarkers;
        if (list.size() != i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("App2 Segments Missing.  Found: ");
            sb.append(list.size());
            sb.append(", Expected: ");
            sb.append(i);
            sb.append(".");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        java.util.Collections.sort(list);
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            org.apache.commons.imaging.formats.jpeg.segments.App2Segment app2Segment = list.get(i3);
            if ((!z ? 1 : 0) + i3 != app2Segment.curMarker) {
                dumpSegments(list);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Incoherent App2 Segment Ordering.  i: ");
                sb2.append(i3);
                sb2.append(", segment[");
                sb2.append(i3);
                sb2.append("].curMarker: ");
                sb2.append(app2Segment.curMarker);
                sb2.append(".");
                throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
            }
            if (i != app2Segment.numMarkers) {
                dumpSegments(list);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Inconsistent App2 Segment Count info.  markerCount: ");
                sb3.append(i);
                sb3.append(", segment[");
                sb3.append(i3);
                sb3.append("].numMarkers: ");
                sb3.append(app2Segment.numMarkers);
                sb3.append(".");
                throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
            }
            i2 += app2Segment.getIccBytes().length;
        }
        byte[] bArr = new byte[i2];
        int i4 = 0;
        for (org.apache.commons.imaging.formats.jpeg.segments.App2Segment app2Segment2 : list) {
            java.lang.System.arraycopy(app2Segment2.getIccBytes(), 0, bArr, i4, app2Segment2.getIccBytes().length);
            i4 += app2Segment2.getIccBytes().length;
        }
        return bArr;
    }

    private void dumpSegments(java.util.List<? extends org.apache.commons.imaging.formats.jpeg.segments.Segment> list) {
        org.apache.commons.imaging.internal.Debug.debug();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("dumpSegments: ");
        sb.append(list.size());
        org.apache.commons.imaging.internal.Debug.debug(sb.toString());
        for (int i = 0; i < list.size(); i++) {
            org.apache.commons.imaging.formats.jpeg.segments.App2Segment app2Segment = (org.apache.commons.imaging.formats.jpeg.segments.App2Segment) list.get(i);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(i);
            sb2.append(": ");
            sb2.append(app2Segment.curMarker);
            sb2.append(" / ");
            sb2.append(app2Segment.numMarkers);
            org.apache.commons.imaging.internal.Debug.debug(sb2.toString());
        }
        org.apache.commons.imaging.internal.Debug.debug();
    }

    public java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, int[] iArr, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return readSegments(byteSource, iArr, z, false);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP2_MARKER}, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (readSegments != null) {
            java.util.Iterator<org.apache.commons.imaging.formats.jpeg.segments.Segment> it = readSegments.iterator();
            while (it.hasNext()) {
                org.apache.commons.imaging.formats.jpeg.segments.App2Segment app2Segment = (org.apache.commons.imaging.formats.jpeg.segments.App2Segment) it.next();
                if (app2Segment.getIccBytes() != null) {
                    arrayList.add(app2Segment);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        byte[] assembleSegments = assembleSegments(arrayList);
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("bytes: ");
            sb.append(assembleSegments.length);
            logger.finest(sb.toString());
        }
        return assembleSegments;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata exifMetadata = getExifMetadata(byteSource, map);
        org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata photoshopMetadata = getPhotoshopMetadata(byteSource, map);
        if (exifMetadata == null && photoshopMetadata == null) {
            return null;
        }
        return new org.apache.commons.imaging.formats.jpeg.JpegImageMetadata(photoshopMetadata, exifMetadata);
    }

    public static boolean isExifAPP1Segment(org.apache.commons.imaging.formats.jpeg.segments.GenericSegment genericSegment) {
        return org.apache.commons.imaging.common.BinaryFunctions.startsWith(genericSegment.getSegmentData(), org.apache.commons.imaging.formats.jpeg.JpegConstants.EXIF_IDENTIFIER_CODE);
    }

    private java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> filterAPP1Segments(java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<org.apache.commons.imaging.formats.jpeg.segments.Segment> it = list.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.jpeg.segments.GenericSegment genericSegment = (org.apache.commons.imaging.formats.jpeg.segments.GenericSegment) it.next();
            if (isExifAPP1Segment(genericSegment)) {
                arrayList.add(genericSegment);
            }
        }
        return arrayList;
    }

    public org.apache.commons.imaging.formats.tiff.TiffImageMetadata getExifMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] exifRawData = getExifRawData(byteSource);
        if (exifRawData == null) {
            return null;
        }
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        if (!map.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_READ_THUMBNAILS)) {
            map.put(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_READ_THUMBNAILS, java.lang.Boolean.TRUE);
        }
        return (org.apache.commons.imaging.formats.tiff.TiffImageMetadata) new org.apache.commons.imaging.formats.tiff.TiffImageParser().getMetadata(exifRawData, map);
    }

    public byte[] getExifRawData(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP1_MARKER}, false);
        if (readSegments == null || readSegments.isEmpty()) {
            return null;
        }
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> filterAPP1Segments = filterAPP1Segments(readSegments);
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exif_segments.size: ");
            sb.append(filterAPP1Segments.size());
            logger.finest(sb.toString());
        }
        if (filterAPP1Segments.isEmpty()) {
            return null;
        }
        if (filterAPP1Segments.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("Imaging currently can't parse EXIF metadata split across multiple APP1 segments.  Please send this image to the Imaging project.");
        }
        return org.apache.commons.imaging.common.BinaryFunctions.remainingBytes("trimmed exif bytes", ((org.apache.commons.imaging.formats.jpeg.segments.GenericSegment) filterAPP1Segments.get(0)).getSegmentData(), 6);
    }

    public boolean hasExifSegment(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final boolean[] zArr = {false};
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.2
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                if (i == 65497) {
                    return false;
                }
                if (i != 65505 || !org.apache.commons.imaging.common.BinaryFunctions.startsWith(bArr3, org.apache.commons.imaging.formats.jpeg.JpegConstants.EXIF_IDENTIFIER_CODE)) {
                    return true;
                }
                zArr[0] = true;
                return false;
            }
        });
        return zArr[0];
    }

    public boolean hasIptcSegment(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final boolean[] zArr = {false};
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.3
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                if (i == 65497) {
                    return false;
                }
                if (i != 65517 || !new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().isPhotoshopJpegSegment(bArr3)) {
                    return true;
                }
                zArr[0] = true;
                return false;
            }
        });
        return zArr[0];
    }

    public boolean hasXmpSegment(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final boolean[] zArr = {false};
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.4
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                if (i == 65497) {
                    return false;
                }
                if (i != 65505 || !new org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpParser().isXmpJpegSegment(bArr3)) {
                    return true;
                }
                zArr[0] = true;
                return false;
            }
        });
        return zArr[0];
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public java.lang.String getXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.5
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                if (i == 65497) {
                    return false;
                }
                if (i != 65505 || !new org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpParser().isXmpJpegSegment(bArr3)) {
                    return true;
                }
                arrayList.add(new org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpParser().parseXmpJpegSegment(bArr3));
                return false;
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("Jpeg file contains more than one XMP segment.");
        }
        return (java.lang.String) arrayList.get(0);
    }

    public org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata getPhotoshopMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP13_MARKER}, false);
        if (readSegments == null || readSegments.isEmpty()) {
            return null;
        }
        java.util.Iterator<org.apache.commons.imaging.formats.jpeg.segments.Segment> it = readSegments.iterator();
        org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data = null;
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data parsePhotoshopSegment = ((org.apache.commons.imaging.formats.jpeg.segments.App13Segment) it.next()).parsePhotoshopSegment(map);
            if (parsePhotoshopSegment != null) {
                if (photoshopApp13Data != null) {
                    throw new org.apache.commons.imaging.ImageReadException("Jpeg contains more than one Photoshop App13 segment.");
                }
                photoshopApp13Data = parsePhotoshopSegment;
            }
        }
        if (photoshopApp13Data == null) {
            return null;
        }
        return new org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata(photoshopApp13Data);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF1_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF2_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF3_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF5_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF6_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF10_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF11_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF13_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF14_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF15_MARKER}, true);
        if (readSegments == null || readSegments.isEmpty()) {
            throw new org.apache.commons.imaging.ImageReadException("No JFIF Data Found.");
        }
        if (readSegments.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("Redundant JFIF Data Found.");
        }
        org.apache.commons.imaging.formats.jpeg.segments.SofnSegment sofnSegment = (org.apache.commons.imaging.formats.jpeg.segments.SofnSegment) readSegments.get(0);
        return new java.awt.Dimension(sofnSegment.width, sofnSegment.height);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        double d;
        double d2;
        double d3;
        java.lang.String str;
        double d4;
        double d5;
        org.apache.commons.imaging.formats.jpeg.segments.App14Segment app14Segment;
        float f;
        float f2;
        int i;
        int i2;
        org.apache.commons.imaging.ImageInfo.ColorType colorType;
        org.apache.commons.imaging.ImageInfo.ColorType colorType2;
        org.apache.commons.imaging.ImageInfo.ColorType colorType3;
        org.apache.commons.imaging.ImageInfo.ColorType colorType4;
        boolean z;
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF1_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF2_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF3_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF5_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF6_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF10_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF11_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF13_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF14_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF15_MARKER}, false);
        if (readSegments == null) {
            throw new org.apache.commons.imaging.ImageReadException("No SOFN Data Found.");
        }
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments2 = readSegments(byteSource, new int[]{65504}, true);
        org.apache.commons.imaging.formats.jpeg.segments.SofnSegment sofnSegment = (org.apache.commons.imaging.formats.jpeg.segments.SofnSegment) readSegments.get(0);
        if (sofnSegment == null) {
            throw new org.apache.commons.imaging.ImageReadException("No SOFN Data Found.");
        }
        int i3 = sofnSegment.width;
        int i4 = sofnSegment.height;
        org.apache.commons.imaging.formats.jpeg.segments.App14Segment app14Segment2 = null;
        org.apache.commons.imaging.formats.jpeg.segments.JfifSegment jfifSegment = (readSegments2 == null || readSegments2.isEmpty()) ? null : (org.apache.commons.imaging.formats.jpeg.segments.JfifSegment) readSegments2.get(0);
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments3 = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP14_MARKER}, true);
        if (readSegments3 != null && !readSegments3.isEmpty()) {
            app14Segment2 = (org.apache.commons.imaging.formats.jpeg.segments.App14Segment) readSegments3.get(0);
        }
        if (jfifSegment != null) {
            d5 = jfifSegment.xDensity;
            d2 = jfifSegment.yDensity;
            int i5 = jfifSegment.densityUnits;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Jpeg/JFIF v.");
            sb.append(jfifSegment.jfifMajorVersion);
            sb.append(".");
            sb.append(jfifSegment.jfifMinorVersion);
            str = sb.toString();
            d4 = i5 != 1 ? i5 != 2 ? -1.0d : 2.54d : 1.0d;
        } else {
            org.apache.commons.imaging.formats.jpeg.JpegImageMetadata jpegImageMetadata = (org.apache.commons.imaging.formats.jpeg.JpegImageMetadata) getMetadata(byteSource, map);
            if (jpegImageMetadata != null) {
                org.apache.commons.imaging.formats.tiff.TiffField findEXIFValue = jpegImageMetadata.findEXIFValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XRESOLUTION);
                double doubleValue = findEXIFValue != null ? ((java.lang.Number) findEXIFValue.getValue()).doubleValue() : -1.0d;
                org.apache.commons.imaging.formats.tiff.TiffField findEXIFValue2 = jpegImageMetadata.findEXIFValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YRESOLUTION);
                d2 = findEXIFValue2 != null ? ((java.lang.Number) findEXIFValue2.getValue()).doubleValue() : -1.0d;
                org.apache.commons.imaging.formats.tiff.TiffField findEXIFValue3 = jpegImageMetadata.findEXIFValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
                if (findEXIFValue3 != null) {
                    int intValue = ((java.lang.Number) findEXIFValue3.getValue()).intValue();
                    if (intValue == 2) {
                        d3 = doubleValue;
                        d = 1.0d;
                    } else if (intValue == 3) {
                        d3 = doubleValue;
                        d = 2.54d;
                    }
                }
                d3 = doubleValue;
                d = -1.0d;
            } else {
                d = -1.0d;
                d2 = -1.0d;
                d3 = -1.0d;
            }
            str = "Jpeg/DCM";
            d4 = d;
            d5 = d3;
        }
        if (d4 > 0.0d) {
            double d6 = d5 * d4;
            int round = (int) java.lang.Math.round(d6);
            app14Segment = app14Segment2;
            double d7 = d2 * d4;
            f2 = (float) (i3 / d6);
            i = (int) java.lang.Math.round(d7);
            f = (float) (i4 / d7);
            i2 = round;
        } else {
            app14Segment = app14Segment2;
            f = -1.0f;
            f2 = -1.0f;
            i = -1;
            i2 = -1;
        }
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments4 = readSegments(byteSource, new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER}, false);
        java.util.ArrayList arrayList = new java.util.ArrayList(readSegments4.size());
        java.util.Iterator<org.apache.commons.imaging.formats.jpeg.segments.Segment> it = readSegments4.iterator();
        while (it.hasNext()) {
            arrayList.add(new java.lang.String(((org.apache.commons.imaging.formats.jpeg.segments.ComSegment) it.next()).getComment(), java.nio.charset.StandardCharsets.UTF_8));
        }
        int i6 = sofnSegment.numberOfComponents;
        int i7 = sofnSegment.precision;
        org.apache.commons.imaging.ImageFormats imageFormats = org.apache.commons.imaging.ImageFormats.JPEG;
        boolean z2 = sofnSegment.marker == 65474;
        org.apache.commons.imaging.ImageInfo.ColorType colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.UNKNOWN;
        if (app14Segment != null && app14Segment.isAdobeJpegSegment()) {
            int adobeColorTransform = app14Segment.getAdobeColorTransform();
            if (adobeColorTransform == 0) {
                if (i6 == 3) {
                    colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
                } else if (i6 == 4) {
                    colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.CMYK;
                }
            } else if (adobeColorTransform == 1) {
                colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.YCbCr;
            } else if (adobeColorTransform == 2) {
                colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.YCCK;
            }
        } else {
            if (jfifSegment != null) {
                if (i6 == 1) {
                    colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.GRAYSCALE;
                } else {
                    if (i6 == 3) {
                        colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.YCbCr;
                    }
                    colorType = colorType5;
                    colorType2 = colorType;
                }
            } else if (i6 == 1) {
                colorType5 = org.apache.commons.imaging.ImageInfo.ColorType.GRAYSCALE;
            } else {
                if (i6 == 2) {
                    colorType3 = org.apache.commons.imaging.ImageInfo.ColorType.GRAYSCALE;
                } else {
                    if (i6 == 3 || i6 == 4) {
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        boolean z6 = false;
                        boolean z7 = false;
                        for (org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component component : sofnSegment.getComponents()) {
                            int i8 = component.componentIdentifier;
                            if (i8 == 1) {
                                z3 = true;
                            } else if (i8 == 2) {
                                z4 = true;
                            } else if (i8 == 3) {
                                z5 = true;
                            } else if (i8 == 4) {
                                z6 = true;
                            } else {
                                z7 = true;
                            }
                        }
                        if (i6 == 3 && z3 && z4 && z5 && !z6 && !z7) {
                            colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.YCbCr;
                        } else if (i6 == 4 && z3 && z4 && z5 && z6 && !z7) {
                            colorType3 = org.apache.commons.imaging.ImageInfo.ColorType.YCbCr;
                        } else {
                            org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[] components = sofnSegment.getComponents();
                            int length = components.length;
                            int i9 = 0;
                            boolean z8 = false;
                            boolean z9 = false;
                            boolean z10 = false;
                            boolean z11 = false;
                            boolean z12 = false;
                            boolean z13 = false;
                            boolean z14 = false;
                            while (i9 < length) {
                                org.apache.commons.imaging.ImageInfo.ColorType colorType6 = colorType5;
                                int i10 = components[i9].componentIdentifier;
                                org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[] componentArr = components;
                                if (i10 == 82) {
                                    z10 = true;
                                } else if (i10 == 71) {
                                    z8 = true;
                                } else if (i10 == 66) {
                                    z9 = true;
                                } else if (i10 == 65) {
                                    z11 = true;
                                } else if (i10 == 67) {
                                    z12 = true;
                                } else if (i10 == 99) {
                                    z13 = true;
                                } else if (i10 == 89) {
                                    z14 = true;
                                }
                                i9++;
                                colorType5 = colorType6;
                                components = componentArr;
                            }
                            colorType = colorType5;
                            if (z10 && z8 && z9 && !z11 && !z12 && !z13 && !z14) {
                                colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
                            } else if (z10 && z8 && z9 && z11 && !z12 && !z13 && !z14) {
                                colorType3 = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
                            } else if (z14 && z12 && z13 && !z10 && !z8 && !z9 && !z11) {
                                colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.YCC;
                            } else if (z14 && z12 && z13 && z11 && !z10 && !z8 && !z9) {
                                colorType3 = org.apache.commons.imaging.ImageInfo.ColorType.YCC;
                            } else {
                                org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[] components2 = sofnSegment.getComponents();
                                int length2 = components2.length;
                                int i11 = Integer.MAX_VALUE;
                                int i12 = Integer.MIN_VALUE;
                                int i13 = Integer.MIN_VALUE;
                                int i14 = 0;
                                int i15 = Integer.MAX_VALUE;
                                while (i14 < length2) {
                                    org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component component2 = components2[i14];
                                    org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[] componentArr2 = components2;
                                    if (i11 > component2.horizontalSamplingFactor) {
                                        i11 = component2.horizontalSamplingFactor;
                                    }
                                    if (i12 < component2.horizontalSamplingFactor) {
                                        i12 = component2.horizontalSamplingFactor;
                                    }
                                    if (i15 > component2.verticalSamplingFactor) {
                                        i15 = component2.verticalSamplingFactor;
                                    }
                                    if (i13 < component2.verticalSamplingFactor) {
                                        i13 = component2.verticalSamplingFactor;
                                    }
                                    i14++;
                                    components2 = componentArr2;
                                }
                                boolean z15 = (i11 == i12 && i15 == i13) ? false : true;
                                if (i6 != 3) {
                                    if (i6 == 4) {
                                        if (z15) {
                                            colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.YCCK;
                                        } else {
                                            colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.CMYK;
                                        }
                                    }
                                    colorType2 = colorType;
                                } else if (z15) {
                                    colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.YCbCr;
                                } else {
                                    colorType2 = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
                                }
                            }
                        }
                    }
                    colorType = colorType5;
                    colorType2 = colorType;
                }
                colorType4 = colorType3;
                z = true;
                return new org.apache.commons.imaging.ImageInfo(str, i7 * i6, arrayList, imageFormats, "JPEG (Joint Photographic Experts Group) Format", i4, "image/jpeg", 1, i, f, i2, f2, i3, z2, z, false, colorType4, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.JPEG);
            }
            colorType4 = colorType2;
            z = false;
            return new org.apache.commons.imaging.ImageInfo(str, i7 * i6, arrayList, imageFormats, "JPEG (Joint Photographic Experts Group) Format", i4, "image/jpeg", 1, i, f, i2, f2, i3, z2, z, false, colorType4, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.JPEG);
        }
        colorType4 = colorType5;
        z = false;
        return new org.apache.commons.imaging.ImageInfo(str, i7 * i6, arrayList, imageFormats, "JPEG (Joint Photographic Experts Group) Format", i4, "image/jpeg", 1, i, f, i2, f2, i3, z2, z, false, colorType4, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.JPEG);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        printWriter.println("jpeg.dumpImageFile");
        org.apache.commons.imaging.ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        printWriter.println("");
        java.util.List<org.apache.commons.imaging.formats.jpeg.segments.Segment> readSegments = readSegments(byteSource, null, false);
        if (readSegments == null) {
            throw new org.apache.commons.imaging.ImageReadException("No Segments Found.");
        }
        for (int i = 0; i < readSegments.size(); i++) {
            org.apache.commons.imaging.formats.jpeg.segments.Segment segment = readSegments.get(i);
            java.text.NumberFormat integerInstance = java.text.NumberFormat.getIntegerInstance();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(": marker: ");
            sb.append(java.lang.Integer.toHexString(segment.marker));
            sb.append(", ");
            sb.append(segment.getDescription());
            sb.append(" (length: ");
            sb.append(integerInstance.format(segment.length));
            sb.append(")");
            printWriter.println(sb.toString());
            segment.dump(printWriter);
        }
        printWriter.println("");
        return true;
    }
}
