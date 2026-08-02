package org.apache.commons.imaging.formats.jpeg.exif;

/* loaded from: classes17.dex */
public class ExifRewriter extends org.apache.commons.imaging.common.BinaryFileParser {
    public ExifRewriter() {
        this(java.nio.ByteOrder.BIG_ENDIAN);
    }

    public ExifRewriter(java.nio.ByteOrder byteOrder) {
        setByteOrder(byteOrder);
    }

    static class JFIFPieces {
        public final java.util.List<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> exifPieces;
        public final java.util.List<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> pieces;

        JFIFPieces(java.util.List<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> list, java.util.List<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> list2) {
            this.pieces = list;
            this.exifPieces = list2;
        }
    }

    static abstract class JFIFPiece {
        protected abstract void write(java.io.OutputStream outputStream) throws java.io.IOException;

        private JFIFPiece() {
        }
    }

    static class JFIFPieceSegment extends org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece {
        public final int marker;
        public final byte[] markerBytes;
        public final byte[] markerLengthBytes;
        public final byte[] segmentData;

        JFIFPieceSegment(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            super();
            this.marker = i;
            this.markerBytes = bArr;
            this.markerLengthBytes = bArr2;
            this.segmentData = bArr3;
        }

        @Override // org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece
        protected void write(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(this.markerBytes);
            outputStream.write(this.markerLengthBytes);
            outputStream.write(this.segmentData);
        }
    }

    static class JFIFPieceSegmentExif extends org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegment {
        JFIFPieceSegmentExif(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            super(i, bArr, bArr2, bArr3);
        }
    }

    static class JFIFPieceImageData extends org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece {
        public final byte[] imageData;
        public final byte[] markerBytes;

        JFIFPieceImageData(byte[] bArr, byte[] bArr2) {
            super();
            this.markerBytes = bArr;
            this.imageData = bArr2;
        }

        @Override // org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece
        protected void write(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(this.markerBytes);
            outputStream.write(this.imageData);
        }
    }

    private org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieces analyzeJFIF(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return true;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
                arrayList.add(new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceImageData(bArr, bArr2));
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
                if (i != 65505) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegment(i, bArr, bArr2, bArr3));
                    return true;
                }
                if (!org.apache.commons.imaging.common.BinaryFunctions.startsWith(bArr3, org.apache.commons.imaging.formats.jpeg.JpegConstants.EXIF_IDENTIFIER_CODE)) {
                    arrayList.add(new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegment(i, bArr, bArr2, bArr3));
                    return true;
                }
                org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegmentExif jFIFPieceSegmentExif = new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegmentExif(i, bArr, bArr2, bArr3);
                arrayList.add(jFIFPieceSegmentExif);
                arrayList2.add(jFIFPieceSegmentExif);
                return true;
            }
        });
        return new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieces(arrayList, arrayList2);
    }

    public void removeExifMetadata(java.io.File file, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeExifMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream);
    }

    public void removeExifMetadata(byte[] bArr, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeExifMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream);
    }

    public void removeExifMetadata(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeExifMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream);
    }

    public void removeExifMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        writeSegmentsReplacingExif(outputStream, analyzeJFIF(byteSource).pieces, null);
    }

    public void updateExifMetadataLossless(java.io.File file, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateExifMetadataLossless(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossless(byte[] bArr, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateExifMetadataLossless(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossless(java.io.InputStream inputStream, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateExifMetadataLossless(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossless(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase tiffImageWriterLossy;
        org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieces analyzeJFIF = analyzeJFIF(byteSource);
        java.util.List<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> list = analyzeJFIF.pieces;
        if (!analyzeJFIF.exifPieces.isEmpty()) {
            tiffImageWriterLossy = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(tiffOutputSet.byteOrder, org.apache.commons.imaging.common.BinaryFunctions.remainingBytes("trimmed exif bytes", ((org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegment) analyzeJFIF.exifPieces.get(0)).segmentData, 6));
        } else {
            tiffImageWriterLossy = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(tiffOutputSet.byteOrder);
        }
        writeSegmentsReplacingExif(outputStream, list, writeExifSegment(tiffImageWriterLossy, tiffOutputSet, true));
    }

    public void updateExifMetadataLossy(byte[] bArr, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateExifMetadataLossy(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossy(java.io.InputStream inputStream, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateExifMetadataLossy(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossy(java.io.File file, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateExifMetadataLossy(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossy(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        writeSegmentsReplacingExif(outputStream, analyzeJFIF(byteSource).pieces, writeExifSegment(new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(tiffOutputSet.byteOrder), tiffOutputSet, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        r11 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r11.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r12 = r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        if ((r12 instanceof org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegmentExif) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c4, code lost:
    
        r12.write(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r6 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r13 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        r12 = org.apache.commons.imaging.common.ByteConversions.toBytes((short) -31, getByteOrder());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r13.length > 65535) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r1 = org.apache.commons.imaging.common.ByteConversions.toBytes((short) (r13.length + 2), getByteOrder());
        r0.write(r12);
        r0.write(r1);
        r0.write(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        r12 = new java.lang.StringBuilder();
        r12.append("APP1 Segment is too long: ");
        r12.append(r13.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        throw new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.ExifOverflowException(r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeSegmentsReplacingExif(java.io.OutputStream outputStream, java.util.List<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> list, byte[] bArr) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
        try {
            org.apache.commons.imaging.formats.jpeg.JpegConstants.SOI.writeTo(dataOutputStream);
            java.util.Iterator<org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece> it = list.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    if (it.next() instanceof org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegmentExif) {
                        break;
                    }
                } else if (bArr != null) {
                    byte[] bytes = org.apache.commons.imaging.common.ByteConversions.toBytes((short) -31, getByteOrder());
                    if (bArr.length > 65535) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("APP1 Segment is too long: ");
                        sb.append(bArr.length);
                        throw new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.ExifOverflowException(sb.toString());
                    }
                    list.add(((org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegment) list.get(0)).marker == 65504 ? 1 : 0, new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegmentExif(org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP1_MARKER, bytes, org.apache.commons.imaging.common.ByteConversions.toBytes((short) (bArr.length + 2), getByteOrder()), bArr));
                }
            }
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

    public static class ExifOverflowException extends org.apache.commons.imaging.ImageWriteException {
        private static final long serialVersionUID = 1401484357224931218L;

        public ExifOverflowException(java.lang.String str) {
            super(str);
        }
    }

    private byte[] writeExifSegment(org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase tiffImageWriterBase, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet, boolean z) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (z) {
            org.apache.commons.imaging.formats.jpeg.JpegConstants.EXIF_IDENTIFIER_CODE.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
        }
        tiffImageWriterBase.write(byteArrayOutputStream, tiffOutputSet);
        return byteArrayOutputStream.toByteArray();
    }
}
