package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class SosSegment extends org.apache.commons.imaging.formats.jpeg.segments.Segment {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.jpeg.segments.SosSegment.class.getName());
    private final org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component[] components;
    public final int endOfSpectralSelection;
    public final int numberOfComponents;
    public final int startOfSpectralSelection;
    public final int successiveApproximationBitHigh;
    public final int successiveApproximationBitLow;

    public static class Component {
        public final int acCodingTableSelector;
        public final int dcCodingTableSelector;
        public final int scanComponentSelector;

        public Component(int i, int i2, int i3) {
            this.scanComponentSelector = i;
            this.dcCodingTableSelector = i2;
            this.acCodingTableSelector = i3;
        }
    }

    public SosSegment(int i, byte[] bArr) throws java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public SosSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2);
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("SosSegment marker_length: ".concat(java.lang.String.valueOf(i2)));
        }
        int readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("number_of_components_in_scan", inputStream, "Not a Valid JPEG File");
        this.numberOfComponents = readByte;
        this.components = new org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component[readByte];
        for (int i3 = 0; i3 < this.numberOfComponents; i3++) {
            byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("scanComponentSelector", inputStream, "Not a Valid JPEG File");
            byte readByte3 = org.apache.commons.imaging.common.BinaryFunctions.readByte("acDcEntropoyCodingTableSelector", inputStream, "Not a Valid JPEG File");
            this.components[i3] = new org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component(readByte2, (readByte3 >> 4) & 15, readByte3 & com.google.common.base.Ascii.SI);
        }
        this.startOfSpectralSelection = org.apache.commons.imaging.common.BinaryFunctions.readByte("start_of_spectral_selection", inputStream, "Not a Valid JPEG File");
        this.endOfSpectralSelection = org.apache.commons.imaging.common.BinaryFunctions.readByte("end_of_spectral_selection", inputStream, "Not a Valid JPEG File");
        byte readByte4 = org.apache.commons.imaging.common.BinaryFunctions.readByte("successive_approximation_bit_position", inputStream, "Not a Valid JPEG File");
        this.successiveApproximationBitHigh = (readByte4 >> 4) & 15;
        this.successiveApproximationBitLow = readByte4 & com.google.common.base.Ascii.SI;
    }

    public org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component[] getComponents() {
        return (org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component[]) this.components.clone();
    }

    public org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component getComponents(int i) {
        return this.components[i];
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SOS (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }
}
