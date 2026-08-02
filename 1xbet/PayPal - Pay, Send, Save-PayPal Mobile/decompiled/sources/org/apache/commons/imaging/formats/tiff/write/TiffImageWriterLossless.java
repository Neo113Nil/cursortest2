package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
public class TiffImageWriterLossless extends org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase {
    private static final java.util.Comparator<org.apache.commons.imaging.formats.tiff.TiffElement> ELEMENT_SIZE_COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless.lambda$static$0((org.apache.commons.imaging.formats.tiff.TiffElement) obj, (org.apache.commons.imaging.formats.tiff.TiffElement) obj2);
        }
    };
    private static final java.util.Comparator<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> ITEM_SIZE_COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless.lambda$static$1((org.apache.commons.imaging.formats.tiff.write.TiffOutputItem) obj, (org.apache.commons.imaging.formats.tiff.write.TiffOutputItem) obj2);
        }
    };
    private final byte[] exifBytes;

    static /* synthetic */ int lambda$static$0(org.apache.commons.imaging.formats.tiff.TiffElement tiffElement, org.apache.commons.imaging.formats.tiff.TiffElement tiffElement2) {
        return tiffElement.length - tiffElement2.length;
    }

    static /* synthetic */ int lambda$static$1(org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem, org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem2) {
        return tiffOutputItem.getItemLength() - tiffOutputItem2.getItemLength();
    }

    public TiffImageWriterLossless(byte[] bArr) {
        this.exifBytes = bArr;
    }

    public TiffImageWriterLossless(java.nio.ByteOrder byteOrder, byte[] bArr) {
        super(byteOrder);
        this.exifBytes = bArr;
    }

    private java.util.List<org.apache.commons.imaging.formats.tiff.TiffElement> analyzeOldTiff(java.util.Map<java.lang.Integer, org.apache.commons.imaging.formats.tiff.write.TiffOutputField> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        try {
            org.apache.commons.imaging.formats.tiff.TiffElement tiffElement = null;
            org.apache.commons.imaging.formats.tiff.TiffContents readContents = new org.apache.commons.imaging.formats.tiff.TiffReader(false).readContents(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(this.exifBytes), null, org.apache.commons.imaging.FormatCompliance.getDefault());
            java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffElement> arrayList = new java.util.ArrayList();
            for (org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory : readContents.directories) {
                arrayList.add(tiffDirectory);
                for (org.apache.commons.imaging.formats.tiff.TiffField tiffField : tiffDirectory.getDirectoryEntries()) {
                    org.apache.commons.imaging.formats.tiff.TiffElement oversizeValueElement = tiffField.getOversizeValueElement();
                    if (oversizeValueElement != null) {
                        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField = map.get(java.lang.Integer.valueOf(tiffField.getTag()));
                        if (tiffOutputField != null && tiffOutputField.getSeperateValue() != null && tiffOutputField.bytesEqual(tiffField.getByteArrayValue())) {
                            tiffOutputField.getSeperateValue().setOffset(tiffField.getOffset());
                        } else {
                            arrayList.add(oversizeValueElement);
                        }
                    }
                }
                org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData = tiffDirectory.getJpegImageData();
                if (jpegImageData != null) {
                    arrayList.add(jpegImageData);
                }
                org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData = tiffDirectory.getTiffImageData();
                if (tiffImageData != null) {
                    java.util.Collections.addAll(arrayList, tiffImageData.getImageData());
                }
            }
            java.util.Collections.sort(arrayList, org.apache.commons.imaging.formats.tiff.TiffElement.COMPARATOR);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            long j = -1;
            for (org.apache.commons.imaging.formats.tiff.TiffElement tiffElement2 : arrayList) {
                long j2 = tiffElement2.offset;
                long j3 = tiffElement2.length;
                if (tiffElement != null) {
                    if (tiffElement2.offset - j > 3) {
                        arrayList2.add(new org.apache.commons.imaging.formats.tiff.TiffElement.Stub(tiffElement.offset, (int) (j - tiffElement.offset)));
                    } else {
                        j = j2 + j3;
                    }
                }
                tiffElement = tiffElement2;
                j = j2 + j3;
            }
            if (tiffElement != null) {
                arrayList2.add(new org.apache.commons.imaging.formats.tiff.TiffElement.Stub(tiffElement.offset, (int) (j - tiffElement.offset)));
            }
            return arrayList2;
        } catch (org.apache.commons.imaging.ImageReadException e) {
            throw new org.apache.commons.imaging.ImageWriteException(e.getMessage(), (java.lang.Throwable) e);
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase
    public void write(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField = tiffOutputSet.findField(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MAKER_NOTE);
        if (findField != null && findField.getSeperateValue() != null) {
            hashMap.put(java.lang.Integer.valueOf(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MAKER_NOTE.tag), findField);
        }
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffElement> analyzeOldTiff = analyzeOldTiff(hashMap);
        int length = this.exifBytes.length;
        if (analyzeOldTiff.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Couldn't analyze old tiff data.");
        }
        if (analyzeOldTiff.size() == 1) {
            org.apache.commons.imaging.formats.tiff.TiffElement tiffElement = analyzeOldTiff.get(0);
            if (tiffElement.offset == 8 && tiffElement.offset + tiffElement.length + 8 == length) {
                new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(this.byteOrder).write(outputStream, tiffOutputSet);
                return;
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, org.apache.commons.imaging.formats.tiff.write.TiffOutputField>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputField value = it.next().getValue();
            if (value.getSeperateValue().getOffset() != -1) {
                hashMap2.put(java.lang.Long.valueOf(value.getSeperateValue().getOffset()), value);
            }
        }
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary validateDirectories = validateDirectories(tiffOutputSet);
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> outputItems = tiffOutputSet.getOutputItems(validateDirectories);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem : outputItems) {
            if (!hashMap2.containsKey(java.lang.Long.valueOf(tiffOutputItem.getOffset()))) {
                arrayList.add(tiffOutputItem);
            }
        }
        long updateOffsetsStep = updateOffsetsStep(analyzeOldTiff, arrayList);
        validateDirectories.updateOffsets(this.byteOrder);
        writeStep(outputStream, tiffOutputSet, analyzeOldTiff, arrayList, updateOffsetsStep);
    }

    private long updateOffsetsStep(java.util.List<org.apache.commons.imaging.formats.tiff.TiffElement> list, java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> list2) {
        long length = this.exifBytes.length;
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffElement> arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList, org.apache.commons.imaging.formats.tiff.TiffElement.COMPARATOR);
        java.util.Collections.reverse(arrayList);
        while (!arrayList.isEmpty()) {
            if (((org.apache.commons.imaging.formats.tiff.TiffElement) arrayList.get(0)).offset + r4.length != length) {
                break;
            }
            length -= r4.length;
            arrayList.remove(0);
        }
        java.util.Collections.sort(arrayList, ELEMENT_SIZE_COMPARATOR);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2);
        java.util.Collections.sort(arrayList2, ITEM_SIZE_COMPARATOR);
        java.util.Collections.reverse(arrayList2);
        while (!arrayList2.isEmpty()) {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem = (org.apache.commons.imaging.formats.tiff.write.TiffOutputItem) arrayList2.remove(0);
            int itemLength = tiffOutputItem.getItemLength();
            org.apache.commons.imaging.formats.tiff.TiffElement tiffElement = null;
            for (org.apache.commons.imaging.formats.tiff.TiffElement tiffElement2 : arrayList) {
                if (tiffElement2.length < itemLength) {
                    break;
                }
                tiffElement = tiffElement2;
            }
            if (tiffElement == null) {
                if ((length & 1) != 0) {
                    length++;
                }
                tiffOutputItem.setOffset(length);
                length += itemLength;
            } else {
                long j = tiffElement.offset;
                if ((j & 1) != 0) {
                    j++;
                }
                tiffOutputItem.setOffset(j);
                arrayList.remove(tiffElement);
                if (tiffElement.length > itemLength) {
                    arrayList.add(new org.apache.commons.imaging.formats.tiff.TiffElement.Stub(tiffElement.offset + itemLength, tiffElement.length - itemLength));
                    java.util.Collections.sort(arrayList, ELEMENT_SIZE_COMPARATOR);
                    java.util.Collections.reverse(arrayList);
                }
            }
        }
        return length;
    }

    static class BufferOutputStream extends java.io.OutputStream {
        private final byte[] buffer;
        private int index;

        BufferOutputStream(byte[] bArr, int i) {
            this.buffer = bArr;
            this.index = i;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            int i2 = this.index;
            byte[] bArr = this.buffer;
            if (i2 >= bArr.length) {
                throw new java.io.IOException("Buffer overflow.");
            }
            this.index = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            int i3 = this.index;
            byte[] bArr2 = this.buffer;
            if (i3 + i2 > bArr2.length) {
                throw new java.io.IOException("Buffer overflow.");
            }
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.index += i2;
        }
    }

    private void writeStep(java.io.OutputStream outputStream, org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet, java.util.List<org.apache.commons.imaging.formats.tiff.TiffElement> list, java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> list2, long j) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory rootDirectory = tiffOutputSet.getRootDirectory();
        int i = (int) j;
        byte[] bArr = new byte[i];
        byte[] bArr2 = this.exifBytes;
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, java.lang.Math.min(bArr2.length, i));
        writeImageFileHeader(new org.apache.commons.imaging.common.BinaryOutputStream(new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless.BufferOutputStream(bArr, 0), this.byteOrder), rootDirectory.getOffset());
        for (org.apache.commons.imaging.formats.tiff.TiffElement tiffElement : list) {
            java.util.Arrays.fill(bArr, (int) tiffElement.offset, (int) java.lang.Math.min(tiffElement.offset + tiffElement.length, i), (byte) 0);
        }
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputItem tiffOutputItem : list2) {
            org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless.BufferOutputStream(bArr, (int) tiffOutputItem.getOffset()), this.byteOrder);
            try {
                tiffOutputItem.writeItem(binaryOutputStream);
                binaryOutputStream.close();
            } finally {
            }
        }
        outputStream.write(bArr);
    }
}
