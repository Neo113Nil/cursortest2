package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class SofnSegment extends org.apache.commons.imaging.formats.jpeg.segments.Segment {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.class.getName());
    private final org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[] components;
    public final int height;
    public final int numberOfComponents;
    public final int precision;
    public final int width;

    public static class Component {
        public final int componentIdentifier;
        public final int horizontalSamplingFactor;
        public final int quantTabDestSelector;
        public final int verticalSamplingFactor;

        public Component(int i, int i2, int i3, int i4) {
            this.componentIdentifier = i;
            this.horizontalSamplingFactor = i2;
            this.verticalSamplingFactor = i3;
            this.quantTabDestSelector = i4;
        }
    }

    public SofnSegment(int i, byte[] bArr) throws java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public SofnSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2);
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("SOF0Segment marker_length: ".concat(java.lang.String.valueOf(i2)));
        }
        this.precision = org.apache.commons.imaging.common.BinaryFunctions.readByte("Data_precision", inputStream, "Not a Valid JPEG File");
        this.height = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Image_height", inputStream, "Not a Valid JPEG File", getByteOrder());
        this.width = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("Image_Width", inputStream, "Not a Valid JPEG File", getByteOrder());
        int readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("Number_of_components", inputStream, "Not a Valid JPEG File");
        this.numberOfComponents = readByte;
        this.components = new org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[readByte];
        for (int i3 = 0; i3 < this.numberOfComponents; i3++) {
            byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("ComponentIdentifier", inputStream, "Not a Valid JPEG File");
            byte readByte3 = org.apache.commons.imaging.common.BinaryFunctions.readByte("SamplingFactors", inputStream, "Not a Valid JPEG File");
            this.components[i3] = new org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component(readByte2, (readByte3 >> 4) & 15, readByte3 & com.google.common.base.Ascii.SI, org.apache.commons.imaging.common.BinaryFunctions.readByte("QuantTabDestSel", inputStream, "Not a Valid JPEG File"));
        }
    }

    public org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[] getComponents() {
        return (org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component[]) this.components.clone();
    }

    public org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component getComponents(int i) {
        return this.components[i];
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SOFN (SOF");
        sb.append(this.marker - org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER);
        sb.append(") (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }
}
