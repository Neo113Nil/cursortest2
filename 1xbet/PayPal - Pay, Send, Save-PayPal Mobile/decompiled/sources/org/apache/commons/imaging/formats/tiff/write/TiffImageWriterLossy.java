package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
public class TiffImageWriterLossy extends org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase {
    public TiffImageWriterLossy() {
    }

    public TiffImageWriterLossy(java.nio.ByteOrder byteOrder) {
        super(byteOrder);
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase
    public void write(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary validateDirectories = validateDirectories(tiffOutputSet);
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> outputItems = tiffOutputSet.getOutputItems(validateDirectories);
        updateOffsetsStep(outputItems);
        validateDirectories.updateOffsets(this.byteOrder);
        writeStep(new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, this.byteOrder), outputItems);
    }

    private void updateOffsetsStep(java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> list) {
        int i = 8;
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem : list) {
            tiffOutputItem.setOffset(i);
            int itemLength = tiffOutputItem.getItemLength();
            i = i + itemLength + imageDataPaddingLength(itemLength);
        }
    }

    private void writeStep(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream, java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> list) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        writeImageFileHeader(binaryOutputStream);
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem : list) {
            tiffOutputItem.writeItem(binaryOutputStream);
            int imageDataPaddingLength = imageDataPaddingLength(tiffOutputItem.getItemLength());
            for (int i = 0; i < imageDataPaddingLength; i++) {
                binaryOutputStream.write(0);
            }
        }
    }
}
