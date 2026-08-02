package org.apache.commons.imaging.formats.jpeg;

/* loaded from: classes17.dex */
public class JpegUtils extends org.apache.commons.imaging.common.BinaryFileParser {

    public interface Visitor {
        boolean beginSOS();

        void visitSOS(int i, byte[] bArr, byte[] bArr2);

        boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;
    }

    public JpegUtils() {
        setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    public void traverseJFIF(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor visitor) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(inputStream, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOI, "Not a Valid JPEG File: doesn't begin with 0xffd8");
            int i4 = 0;
            while (true) {
                bArr = new byte[2];
                while (true) {
                    bArr[0] = bArr[1];
                    byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("marker", inputStream, "Could not read marker");
                    bArr[1] = readByte;
                    i = bArr[0] & 255;
                    if (i == 255 && (i2 = readByte & 255) != 255) {
                        break;
                    }
                }
                i3 = i2 | (i << 8);
                if (i3 == 65497 || i3 == 65498) {
                    break;
                }
                byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("segmentLengthBytes", inputStream, 2, "segmentLengthBytes");
                int uInt16 = org.apache.commons.imaging.common.ByteConversions.toUInt16(readBytes, getByteOrder());
                if (uInt16 < 2) {
                    throw new org.apache.commons.imaging.ImageReadException("Invalid segment size");
                }
                if (!visitor.visitSegment(i3, bArr, uInt16, readBytes, org.apache.commons.imaging.common.BinaryFunctions.readBytes("Segment Data", inputStream, uInt16 - 2, "Invalid Segment: insufficient data"))) {
                    if (inputStream != null) {
                        inputStream.close();
                        return;
                    }
                    return;
                }
                i4++;
            }
            if (!visitor.beginSOS()) {
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
            }
            visitor.visitSOS(i3, bArr, org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes(inputStream));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i4);
            sb.append(" markers");
            org.apache.commons.imaging.internal.Debug.debug(sb.toString());
            if (inputStream != null) {
                inputStream.close();
            }
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

    public static java.lang.String getMarkerName(int i) {
        if (i != 65501) {
            switch (i) {
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER /* 65472 */:
                    return "SOF0_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF1_MARKER /* 65473 */:
                    return "SOF1_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF2_MARKER /* 65474 */:
                    return "SOF2_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF3_MARKER /* 65475 */:
                    return "SOF3_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DHT_MARKER /* 65476 */:
                    return "SOF4_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF5_MARKER /* 65477 */:
                    return "SOF5_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF6_MARKER /* 65478 */:
                    return "SOF6_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER /* 65479 */:
                    return "SOF7_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF8_MARKER /* 65480 */:
                    return "SOF8_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER /* 65481 */:
                    return "SOF9_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF10_MARKER /* 65482 */:
                    return "SOF10_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF11_MARKER /* 65483 */:
                    return "SOF11_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DAC_MARKER /* 65484 */:
                    return "DAC_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF13_MARKER /* 65485 */:
                    return "SOF13_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF14_MARKER /* 65486 */:
                    return "SOF14_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF15_MARKER /* 65487 */:
                    return "SOF15_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST0_MARKER /* 65488 */:
                    return "RST0_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST1_MARKER /* 65489 */:
                    return "RST1_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST2_MARKER /* 65490 */:
                    return "RST2_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST3_MARKER /* 65491 */:
                    return "RST3_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST4_MARKER /* 65492 */:
                    return "RST4_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST5_MARKER /* 65493 */:
                    return "RST5_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST6_MARKER /* 65494 */:
                    return "RST6_MARKER";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST7_MARKER /* 65495 */:
                    return "RST7_MARKER";
                default:
                    switch (i) {
                        case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOS_MARKER /* 65498 */:
                            return "SOS_MARKER";
                        case org.apache.commons.imaging.formats.jpeg.JpegConstants.DQT_MARKER /* 65499 */:
                            return "DQT_MARKER";
                        default:
                            switch (i) {
                                case 65504:
                                    return "JFIF_MARKER";
                                case org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP1_MARKER /* 65505 */:
                                    return "JPEG_APP1_MARKER";
                                case org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP2_MARKER /* 65506 */:
                                    return "JPEG_APP2_MARKER";
                                default:
                                    switch (i) {
                                        case org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP13_MARKER /* 65517 */:
                                            return "JPEG_APP13_MARKER";
                                        case org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP14_MARKER /* 65518 */:
                                            return "JPEG_APP14_MARKER";
                                        case org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP15_MARKER /* 65519 */:
                                            return "JPEG_APP15_MARKER";
                                        default:
                                            return "Unknown";
                                    }
                            }
                    }
            }
        }
        return "DRI_MARKER";
    }

    public void dumpJFIF(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        traverseJFIF(byteSource, new org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegUtils.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return true;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SOS marker.  ");
                sb.append(bArr2.length);
                sb.append(" bytes of image data.");
                org.apache.commons.imaging.internal.Debug.debug(sb.toString());
                org.apache.commons.imaging.internal.Debug.debug("");
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Segment marker: ");
                sb.append(java.lang.Integer.toHexString(i));
                sb.append(" (");
                sb.append(org.apache.commons.imaging.formats.jpeg.JpegUtils.getMarkerName(i));
                sb.append("), ");
                sb.append(bArr3.length);
                sb.append(" bytes of segment data.");
                org.apache.commons.imaging.internal.Debug.debug(sb.toString());
                return true;
            }
        });
    }
}
