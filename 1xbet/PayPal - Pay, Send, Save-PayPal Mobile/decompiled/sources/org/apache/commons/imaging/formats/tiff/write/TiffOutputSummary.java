package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
class TiffOutputSummary {
    public final java.nio.ByteOrder byteOrder;
    public final java.util.Map<java.lang.Integer, org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> directoryTypeMap;
    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory rootDirectory;
    private final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary.OffsetItem> offsetItems = new java.util.ArrayList();
    private final java.util.List<org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets> imageDataItems = new java.util.ArrayList();

    TiffOutputSummary(java.nio.ByteOrder byteOrder, org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory, java.util.Map<java.lang.Integer, org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> map) {
        this.byteOrder = byteOrder;
        this.rootDirectory = tiffOutputDirectory;
        this.directoryTypeMap = map;
    }

    static class OffsetItem {
        public final org.apache.commons.imaging.formats.tiff.write.TiffOutputItem item;
        public final org.apache.commons.imaging.formats.tiff.write.TiffOutputField itemOffsetField;

        OffsetItem(org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem, org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField) {
            this.itemOffsetField = tiffOutputField;
            this.item = tiffOutputItem;
        }
    }

    public void add(org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem, org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField) {
        this.offsetItems.add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary.OffsetItem(tiffOutputItem, tiffOutputField));
    }

    public void updateOffsets(java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary.OffsetItem offsetItem : this.offsetItems) {
            offsetItem.itemOffsetField.setData(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG.writeData(java.lang.Integer.valueOf((int) offsetItem.item.getOffset()), byteOrder));
        }
        for (org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets imageDataOffsets : this.imageDataItems) {
            for (int i = 0; i < imageDataOffsets.outputItems.length; i++) {
                imageDataOffsets.imageDataOffsets[i] = (int) imageDataOffsets.outputItems[i].getOffset();
            }
            imageDataOffsets.imageDataOffsetsField.setData(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG.writeData(imageDataOffsets.imageDataOffsets, byteOrder));
        }
    }

    public void addTiffImageData(org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets imageDataOffsets) {
        this.imageDataItems.add(imageDataOffsets);
    }
}
