package org.apache.commons.imaging.formats.jpeg.xmp;

/* loaded from: classes17.dex */
public class JpegRewriter extends org.apache.commons.imaging.common.BinaryFileParser {
    private static final java.nio.ByteOrder JPEG_BYTE_ORDER = java.nio.ByteOrder.BIG_ENDIAN;
    private static final org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter EXIF_SEGMENT_FILTER = new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$$ExternalSyntheticLambda0
        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter
        public final boolean filter(org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment jFIFPieceSegment) {
            boolean isExifSegment;
            isExifSegment = jFIFPieceSegment.isExifSegment();
            return isExifSegment;
        }
    };
    private static final org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter XMP_SEGMENT_FILTER = new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$$ExternalSyntheticLambda1
        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter
        public final boolean filter(org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment jFIFPieceSegment) {
            boolean isXmpSegment;
            isXmpSegment = jFIFPieceSegment.isXmpSegment();
            return isXmpSegment;
        }
    };
    private static final org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter PHOTOSHOP_APP13_SEGMENT_FILTER = new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$$ExternalSyntheticLambda2
        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter
        public final boolean filter(org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment jFIFPieceSegment) {
            boolean isPhotoshopApp13Segment;
            isPhotoshopApp13Segment = jFIFPieceSegment.isPhotoshopApp13Segment();
            return isPhotoshopApp13Segment;
        }
    };

    interface SegmentFilter {
        boolean filter(org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment jFIFPieceSegment);
    }

    public JpegRewriter() {
        setByteOrder(JPEG_BYTE_ORDER);
    }

    public static class JFIFPieces {
        public final java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> pieces;
        public final java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> segmentPieces;

        public JFIFPieces(java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> list, java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> list2) {
            this.pieces = list;
            this.segmentPieces = list2;
        }
    }

    protected static abstract class JFIFPiece {
        protected abstract void write(java.io.OutputStream outputStream) throws java.io.IOException;

        protected JFIFPiece() {
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(getClass().getName());
            sb.append("]");
            return sb.toString();
        }
    }

    public static class JFIFPieceSegment extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece {
        public final int marker;
        private final byte[] markerBytes;
        private final byte[] segmentData;
        private final byte[] segmentLengthBytes;

        public JFIFPieceSegment(int i, byte[] bArr) {
            this(i, org.apache.commons.imaging.common.ByteConversions.toBytes((short) i, org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JPEG_BYTE_ORDER), org.apache.commons.imaging.common.ByteConversions.toBytes((short) (bArr.length + 2), org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JPEG_BYTE_ORDER), bArr);
        }

        JFIFPieceSegment(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.marker = i;
            this.markerBytes = bArr;
            this.segmentLengthBytes = bArr2;
            this.segmentData = (byte[]) bArr3.clone();
        }

        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(getClass().getName());
            sb.append(" (0x");
            sb.append(java.lang.Integer.toHexString(this.marker));
            sb.append(")]");
            return sb.toString();
        }

        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece
        protected void write(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(this.markerBytes);
            outputStream.write(this.segmentLengthBytes);
            outputStream.write(this.segmentData);
        }

        public boolean isApp1Segment() {
            return this.marker == 65505;
        }

        public boolean isAppSegment() {
            int i = this.marker;
            return i >= 65504 && i <= 65519;
        }

        public boolean isExifSegment() {
            return this.marker == 65505 && org.apache.commons.imaging.common.BinaryFunctions.startsWith(this.segmentData, org.apache.commons.imaging.formats.jpeg.JpegConstants.EXIF_IDENTIFIER_CODE);
        }

        public boolean isPhotoshopApp13Segment() {
            return this.marker == 65517 && new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().isPhotoshopJpegSegment(this.segmentData);
        }

        public boolean isXmpSegment() {
            return this.marker == 65505 && org.apache.commons.imaging.common.BinaryFunctions.startsWith(this.segmentData, org.apache.commons.imaging.formats.jpeg.JpegConstants.XMP_IDENTIFIER);
        }

        public byte[] getSegmentData() {
            return (byte[]) this.segmentData.clone();
        }
    }

    static class JFIFPieceImageData extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece {
        private final byte[] imageData;
        private final byte[] markerBytes;

        JFIFPieceImageData(byte[] bArr, byte[] bArr2) {
            this.markerBytes = bArr;
            this.imageData = bArr2;
        }

        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece
        protected void write(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(this.markerBytes);
            outputStream.write(this.imageData);
        }
    }

    protected org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieces analyzeJFIF(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return true;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
                arrayList.add(new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceImageData(bArr, bArr2));
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment jFIFPieceSegment = new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment(i, bArr, bArr2, bArr3);
                arrayList.add(jFIFPieceSegment);
                arrayList2.add(jFIFPieceSegment);
                return true;
            }
        });
        return new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieces(arrayList, arrayList2);
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<T> removeXmpSegments(java.util.List<T> list) {
        return filterSegments(list, XMP_SEGMENT_FILTER);
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<T> removePhotoshopApp13Segments(java.util.List<T> list) {
        return filterSegments(list, PHOTOSHOP_APP13_SEGMENT_FILTER);
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<T> findPhotoshopApp13Segments(java.util.List<T> list) {
        return filterSegments(list, PHOTOSHOP_APP13_SEGMENT_FILTER, true);
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<T> removeExifSegments(java.util.List<T> list) {
        return filterSegments(list, EXIF_SEGMENT_FILTER);
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<T> filterSegments(java.util.List<T> list, org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter segmentFilter) {
        return filterSegments(list, segmentFilter, false);
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<T> filterSegments(java.util.List<T> list, org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter segmentFilter, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : list) {
            if (t instanceof org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) {
                if (segmentFilter.filter((org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) t) ^ (!z)) {
                    arrayList.add(t);
                }
            } else if (!z) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece, U extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> insertBeforeFirstAppSegments(java.util.List<T> list, java.util.List<U> list2) throws org.apache.commons.imaging.ImageWriteException {
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            if ((t instanceof org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) && ((org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) t).isAppSegment() && i == -1) {
                i = i2;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (i == -1) {
            throw new org.apache.commons.imaging.ImageWriteException("JPEG file has no APP segments.");
        }
        arrayList.addAll(i, list2);
        return arrayList;
    }

    protected <T extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece, U extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> insertAfterLastAppSegments(java.util.List<T> list, java.util.List<U> list2) throws org.apache.commons.imaging.ImageWriteException {
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            if ((t instanceof org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) && ((org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) t).isAppSegment()) {
                i = i2;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (i == -1) {
            if (list.isEmpty()) {
                throw new org.apache.commons.imaging.ImageWriteException("JPEG file has no APP segments.");
            }
            arrayList.addAll(1, list2);
            return arrayList;
        }
        arrayList.addAll(i + 1, list2);
        return arrayList;
    }

    protected void writeSegments(java.io.OutputStream outputStream, java.util.List<? extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> list) throws java.io.IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
        try {
            org.apache.commons.imaging.formats.jpeg.JpegConstants.SOI.writeTo(dataOutputStream);
            java.util.Iterator<? extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> it = list.iterator();
            while (it.hasNext()) {
                it.next().write(dataOutputStream);
            }
            dataOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static class JpegSegmentOverflowException extends org.apache.commons.imaging.ImageWriteException {
        private static final long serialVersionUID = -1062145751550646846L;

        public JpegSegmentOverflowException(java.lang.String str) {
            super(str);
        }
    }
}
