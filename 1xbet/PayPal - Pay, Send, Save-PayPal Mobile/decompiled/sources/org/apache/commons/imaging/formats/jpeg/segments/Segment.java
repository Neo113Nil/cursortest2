package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public abstract class Segment extends org.apache.commons.imaging.common.BinaryFileParser {
    public final int length;
    public final int marker;

    public void dump(java.io.PrintWriter printWriter) {
    }

    public abstract java.lang.String getDescription();

    public Segment(int i, int i2) {
        this.marker = i;
        this.length = i2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[Segment: ");
        sb.append(getDescription());
        sb.append("]");
        return sb.toString();
    }

    public java.lang.String getSegmentType() {
        int i = this.marker;
        if (i == 65281) {
            return "For temporary private use in arithmetic coding";
        }
        if (i != 65534) {
            switch (i) {
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER /* 65472 */:
                    return "Start Of Frame, Baseline Dct, Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF1_MARKER /* 65473 */:
                    return "Start Of Frame, Extended sequential Dct, Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF2_MARKER /* 65474 */:
                    return "Start Of Frame, Progressive Dct, Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF3_MARKER /* 65475 */:
                    return "Start Of Frame, Lossless (sequential), Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DHT_MARKER /* 65476 */:
                    return "Define Huffman table(s)";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF5_MARKER /* 65477 */:
                    return "Start Of Frame, Differential sequential Dct, Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF6_MARKER /* 65478 */:
                    return "Start Of Frame, Differential progressive Dct, Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER /* 65479 */:
                    return "Start Of Frame, Differential lossless (sequential), Huffman coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF8_MARKER /* 65480 */:
                    return "Start Of Frame, Reserved for JPEG extensions, arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER /* 65481 */:
                    return "Start Of Frame, Extended sequential Dct, arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF10_MARKER /* 65482 */:
                    return "Start Of Frame, Progressive Dct, arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF11_MARKER /* 65483 */:
                    return "Start Of Frame, Lossless (sequential), arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DAC_MARKER /* 65484 */:
                    return "Define arithmetic coding conditioning(s)";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF13_MARKER /* 65485 */:
                    return "Start Of Frame, Differential sequential Dct, arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF14_MARKER /* 65486 */:
                    return "Start Of Frame, Differential progressive Dct, arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF15_MARKER /* 65487 */:
                    return "Start Of Frame, Differential lossless (sequential), arithmetic coding";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST0_MARKER /* 65488 */:
                    return "Restart with modulo 8 count 0";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST1_MARKER /* 65489 */:
                    return "Restart with modulo 8 count 1";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST2_MARKER /* 65490 */:
                    return "Restart with modulo 8 count 2";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST3_MARKER /* 65491 */:
                    return "Restart with modulo 8 count 3";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST4_MARKER /* 65492 */:
                    return "Restart with modulo 8 count 4";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST5_MARKER /* 65493 */:
                    return "Restart with modulo 8 count 5";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST6_MARKER /* 65494 */:
                    return "Restart with modulo 8 count 6";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.RST7_MARKER /* 65495 */:
                    return "Restart with modulo 8 count 7";
                case 65496:
                    return "Start of image";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.EOI_MARKER /* 65497 */:
                    return "End of image";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.SOS_MARKER /* 65498 */:
                    return "Start of scan";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DQT_MARKER /* 65499 */:
                    return "Define quantization table(s)";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DNL_MARKER /* 65500 */:
                    return "Define number of lines";
                case org.apache.commons.imaging.formats.jpeg.JpegConstants.DRI_MARKER /* 65501 */:
                    return "Define restart interval";
                case 65502:
                    return "Define hierarchical progression";
                case 65503:
                    return "Expand reference component(s)";
                default:
                    if (i >= 65282 && i <= 65471) {
                        return "Reserved";
                    }
                    if (i >= 65504 && i <= 65519) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("APP");
                        sb.append(this.marker - 65504);
                        return sb.toString();
                    }
                    if (i >= 65520 && i <= 65533) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JPG");
                        sb2.append(this.marker - 65504);
                        return sb2.toString();
                    }
                    return "Unknown";
            }
        }
        return "Comment";
    }
}
