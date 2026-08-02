package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
class ImageDataOffsets {
    final int[] imageDataOffsets;
    final org.apache.commons.imaging.formats.tiff.write.TiffOutputField imageDataOffsetsField;
    final org.apache.commons.imaging.formats.tiff.write.TiffOutputItem[] outputItems;

    ImageDataOffsets(org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr, int[] iArr, org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField) {
        this.imageDataOffsets = iArr;
        this.imageDataOffsetsField = tiffOutputField;
        this.outputItems = new org.apache.commons.imaging.formats.tiff.write.TiffOutputItem[dataElementArr.length];
        for (int i = 0; i < dataElementArr.length; i++) {
            this.outputItems[i] = new org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value("TIFF image data", dataElementArr[i].getData());
        }
    }
}
