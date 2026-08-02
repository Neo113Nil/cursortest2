package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public class JpegIptcRewriter extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter {
    public void removeIPTC(java.io.File file, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(file, outputStream, false);
    }

    public void removeIPTC(java.io.File file, java.io.OutputStream outputStream, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream, z);
    }

    public void removeIPTC(byte[] bArr, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(bArr, outputStream, false);
    }

    public void removeIPTC(byte[] bArr, java.io.OutputStream outputStream, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream, z);
    }

    public void removeIPTC(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(inputStream, outputStream, false);
    }

    public void removeIPTC(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream, z);
    }

    public void removeIPTC(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        removeIPTC(byteSource, outputStream, false);
    }

    public void removeIPTC(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream, boolean z) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> list = analyzeJFIF(byteSource).pieces;
        java.util.List findPhotoshopApp13Segments = findPhotoshopApp13Segments(list);
        if (findPhotoshopApp13Segments.size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("Image contains more than one Photoshop App13 segment.");
        }
        java.util.List<? extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> removePhotoshopApp13Segments = removePhotoshopApp13Segments(list);
        if (!z && findPhotoshopApp13Segments.size() == 1) {
            org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment jFIFPieceSegment = (org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment) findPhotoshopApp13Segments.get(0);
            removePhotoshopApp13Segments.add(list.indexOf(jFIFPieceSegment), new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment(jFIFPieceSegment.marker, new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().writePhotoshopApp13Segment(new org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data(new java.util.ArrayList(), new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().parsePhotoshopSegment(jFIFPieceSegment.getSegmentData(), new java.util.HashMap()).getNonIptcBlocks()))));
        }
        writeSegments(outputStream, removePhotoshopApp13Segments);
    }

    public void writeIPTC(byte[] bArr, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        writeIPTC(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream, photoshopApp13Data);
    }

    public void writeIPTC(java.io.InputStream inputStream, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        writeIPTC(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream, photoshopApp13Data);
    }

    public void writeIPTC(java.io.File file, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        writeIPTC(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream, photoshopApp13Data);
    }

    public void writeIPTC(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream, org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        java.util.List<org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece> list = analyzeJFIF(byteSource).pieces;
        if (findPhotoshopApp13Segments(list).size() > 1) {
            throw new org.apache.commons.imaging.ImageReadException("Image contains more than one Photoshop App13 segment.");
        }
        java.util.List removePhotoshopApp13Segments = removePhotoshopApp13Segments(list);
        java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> nonIptcBlocks = photoshopApp13Data.getNonIptcBlocks();
        nonIptcBlocks.add(new org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, new byte[0], new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().writeIPTCBlock(photoshopApp13Data.getRecords())));
        writeSegments(outputStream, insertAfterLastAppSegments(removePhotoshopApp13Segments, java.util.Arrays.asList(new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment(org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP13_MARKER, new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().writePhotoshopApp13Segment(new org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data(photoshopApp13Data.getRecords(), nonIptcBlocks))))));
    }
}
