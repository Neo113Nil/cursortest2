package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffImageMetadata extends org.apache.commons.imaging.common.GenericImageMetadata {
    public final org.apache.commons.imaging.formats.tiff.TiffContents contents;

    public TiffImageMetadata(org.apache.commons.imaging.formats.tiff.TiffContents tiffContents) {
        this.contents = tiffContents;
    }

    public static class Directory extends org.apache.commons.imaging.common.GenericImageMetadata implements org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem {
        private final java.nio.ByteOrder byteOrder;
        private final org.apache.commons.imaging.formats.tiff.TiffDirectory directory;
        public final int type;

        public Directory(java.nio.ByteOrder byteOrder, org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory) {
            this.type = tiffDirectory.type;
            this.directory = tiffDirectory;
            this.byteOrder = byteOrder;
        }

        public void add(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
            add(new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem(tiffField));
        }

        public java.awt.image.BufferedImage getThumbnail() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
            return this.directory.getTiffImage(this.byteOrder);
        }

        public org.apache.commons.imaging.formats.tiff.TiffImageData getTiffImageData() {
            return this.directory.getTiffImageData();
        }

        public org.apache.commons.imaging.formats.tiff.TiffField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) throws org.apache.commons.imaging.ImageReadException {
            return this.directory.findField(tagInfo);
        }

        public java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> getAllFields() {
            return this.directory.getDirectoryEntries();
        }

        public org.apache.commons.imaging.formats.tiff.JpegImageData getJpegImageData() {
            return this.directory.getJpegImageData();
        }

        @Override // org.apache.commons.imaging.common.GenericImageMetadata, org.apache.commons.imaging.common.ImageMetadata
        public java.lang.String toString(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str != null ? str : "");
            sb.append(this.directory.description());
            sb.append(": ");
            sb.append(getTiffImageData() != null ? " (tiffImageData)" : "");
            sb.append(getJpegImageData() != null ? " (jpegImageData)" : "");
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(super.toString(str));
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            return sb.toString();
        }

        public org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getOutputDirectory(java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
            try {
                org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(this.type, byteOrder);
                java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = getItems().iterator();
                while (it.hasNext()) {
                    org.apache.commons.imaging.formats.tiff.TiffField tiffField = ((org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem) it.next()).getTiffField();
                    if (tiffOutputDirectory.findField(tiffField.getTag()) == null && !tiffField.getTagInfo().isOffset()) {
                        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo = tiffField.getTagInfo();
                        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType = tiffField.getFieldType();
                        byte[] encodeValue = tagInfo.encodeValue(fieldType, tiffField.getValue(), byteOrder);
                        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tiffField.getTag(), tagInfo, fieldType, encodeValue.length / fieldType.getSize(), encodeValue);
                        tiffOutputField.setSortHint(tiffField.getSortHint());
                        tiffOutputDirectory.add(tiffOutputField);
                    }
                }
                tiffOutputDirectory.setTiffImageData(getTiffImageData());
                tiffOutputDirectory.setJpegImageData(getJpegImageData());
                return tiffOutputDirectory;
            } catch (org.apache.commons.imaging.ImageReadException e) {
                throw new org.apache.commons.imaging.ImageWriteException(e.getMessage(), (java.lang.Throwable) e);
            }
        }
    }

    public java.util.List<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> getDirectories() {
        return super.getItems();
    }

    @Override // org.apache.commons.imaging.common.GenericImageMetadata, org.apache.commons.imaging.common.ImageMetadata
    public java.util.List<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = super.getItems().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next()).getItems());
        }
        return arrayList;
    }

    public static class TiffMetadataItem extends org.apache.commons.imaging.common.GenericImageMetadata.GenericImageMetadataItem {
        private final org.apache.commons.imaging.formats.tiff.TiffField entry;

        public TiffMetadataItem(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
            super(tiffField.getTagName(), tiffField.getValueDescription());
            this.entry = tiffField;
        }

        public org.apache.commons.imaging.formats.tiff.TiffField getTiffField() {
            return this.entry;
        }
    }

    public org.apache.commons.imaging.formats.tiff.write.TiffOutputSet getOutputSet() throws org.apache.commons.imaging.ImageWriteException {
        java.nio.ByteOrder byteOrder = this.contents.header.byteOrder;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(byteOrder);
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = getDirectories().iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory = (org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next();
            if (tiffOutputSet.findDirectory(directory.type) == null) {
                tiffOutputSet.addDirectory(directory.getOutputDirectory(byteOrder));
            }
        }
        return tiffOutputSet;
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) throws org.apache.commons.imaging.ImageReadException {
        return findField(tagInfo, false);
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField;
        org.apache.commons.imaging.formats.tiff.TiffField findField2;
        java.lang.Integer tagCount = org.apache.commons.imaging.formats.tiff.TiffTags.getTagCount(tagInfo.tag);
        int intValue = tagCount == null ? 0 : tagCount.intValue();
        java.util.List<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> directories = getDirectories();
        if (z || tagInfo.directoryType != org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
            java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = directories.iterator();
            while (it.hasNext()) {
                org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory = (org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next();
                if (directory.type == tagInfo.directoryType.directoryType && (findField2 = directory.findField(tagInfo)) != null) {
                    return findField2;
                }
            }
            if (z || intValue > 1) {
                return null;
            }
            java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it2 = directories.iterator();
            while (it2.hasNext()) {
                org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory2 = (org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it2.next();
                if (tagInfo.directoryType.isImageDirectory() && directory2.type >= 0) {
                    org.apache.commons.imaging.formats.tiff.TiffField findField3 = directory2.findField(tagInfo);
                    if (findField3 != null) {
                        return findField3;
                    }
                } else if (!tagInfo.directoryType.isImageDirectory() && directory2.type < 0 && (findField = directory2.findField(tagInfo)) != null) {
                    return findField;
                }
            }
        }
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it3 = directories.iterator();
        while (it3.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffField findField4 = ((org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it3.next()).findField(tagInfo);
            if (findField4 != null) {
                return findField4;
            }
        }
        return null;
    }

    public java.lang.Object getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfo);
        if (findField == null) {
            return null;
        }
        return findField.getValue();
    }

    public byte[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoByte);
        if (findField != null && tagInfoByte.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        return null;
    }

    public java.lang.String[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoAscii);
        if (findField == null || !tagInfoAscii.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoAscii.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public short[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoShorts);
        if (findField == null || !tagInfoShorts.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public int[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoLongs);
        if (findField == null || !tagInfoLongs.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public org.apache.commons.imaging.common.RationalNumber[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoRationals);
        if (findField == null || !tagInfoRationals.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public byte[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSBytes);
        if (findField != null && tagInfoSBytes.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        return null;
    }

    public short[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSShorts);
        if (findField == null || !tagInfoSShorts.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoSShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public int[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSLongs);
        if (findField == null || !tagInfoSLongs.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoSLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public org.apache.commons.imaging.common.RationalNumber[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSRationals);
        if (findField == null || !tagInfoSRationals.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoSRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public float[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoFloats);
        if (findField == null || !tagInfoFloats.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoFloats.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public double[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoDoubles);
        if (findField == null || !tagInfoDoubles.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoDoubles.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public java.lang.String getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoGpsText);
        if (findField == null) {
            return null;
        }
        return tagInfoGpsText.getValue(findField);
    }

    public java.lang.String getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoXpString);
        if (findField == null) {
            return null;
        }
        return tagInfoXpString.getValue(findField);
    }

    public org.apache.commons.imaging.formats.tiff.TiffDirectory findDirectory(int i) {
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = getDirectories().iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory = (org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next();
            if (directory.type == i) {
                return directory.directory;
            }
        }
        return null;
    }

    public java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> getAllFields() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = getDirectories().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next()).getAllFields());
        }
        return arrayList;
    }

    public org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GPSInfo getGPS() throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffDirectory findDirectory = findDirectory(-3);
        if (findDirectory == null) {
            return null;
        }
        org.apache.commons.imaging.formats.tiff.TiffField findField = findDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = findDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE);
        org.apache.commons.imaging.formats.tiff.TiffField findField3 = findDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        org.apache.commons.imaging.formats.tiff.TiffField findField4 = findDirectory.findField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE);
        if (findField == null || findField2 == null || findField3 == null || findField4 == null) {
            return null;
        }
        java.lang.String stringValue = findField.getStringValue();
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr = (org.apache.commons.imaging.common.RationalNumber[]) findField2.getValue();
        java.lang.String stringValue2 = findField3.getStringValue();
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr2 = (org.apache.commons.imaging.common.RationalNumber[]) findField4.getValue();
        if (rationalNumberArr.length != 3 || rationalNumberArr2.length != 3) {
            throw new org.apache.commons.imaging.ImageReadException("Expected three values for latitude and longitude.");
        }
        return new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GPSInfo(stringValue, stringValue2, rationalNumberArr[0], rationalNumberArr[1], rationalNumberArr[2], rationalNumberArr2[0], rationalNumberArr2[1], rationalNumberArr2[2]);
    }

    public static class GPSInfo {
        public final org.apache.commons.imaging.common.RationalNumber latitudeDegrees;
        public final org.apache.commons.imaging.common.RationalNumber latitudeMinutes;
        public final java.lang.String latitudeRef;
        public final org.apache.commons.imaging.common.RationalNumber latitudeSeconds;
        public final org.apache.commons.imaging.common.RationalNumber longitudeDegrees;
        public final org.apache.commons.imaging.common.RationalNumber longitudeMinutes;
        public final java.lang.String longitudeRef;
        public final org.apache.commons.imaging.common.RationalNumber longitudeSeconds;

        public GPSInfo(java.lang.String str, java.lang.String str2, org.apache.commons.imaging.common.RationalNumber rationalNumber, org.apache.commons.imaging.common.RationalNumber rationalNumber2, org.apache.commons.imaging.common.RationalNumber rationalNumber3, org.apache.commons.imaging.common.RationalNumber rationalNumber4, org.apache.commons.imaging.common.RationalNumber rationalNumber5, org.apache.commons.imaging.common.RationalNumber rationalNumber6) {
            this.latitudeRef = str;
            this.longitudeRef = str2;
            this.latitudeDegrees = rationalNumber;
            this.latitudeMinutes = rationalNumber2;
            this.latitudeSeconds = rationalNumber3;
            this.longitudeDegrees = rationalNumber4;
            this.longitudeMinutes = rationalNumber5;
            this.longitudeSeconds = rationalNumber6;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[GPS. Latitude: ");
            sb.append(this.latitudeDegrees.toDisplayString());
            sb.append(" degrees, ");
            sb.append(this.latitudeMinutes.toDisplayString());
            sb.append(" minutes, ");
            sb.append(this.latitudeSeconds.toDisplayString());
            sb.append(" seconds ");
            sb.append(this.latitudeRef);
            sb.append(", Longitude: ");
            sb.append(this.longitudeDegrees.toDisplayString());
            sb.append(" degrees, ");
            sb.append(this.longitudeMinutes.toDisplayString());
            sb.append(" minutes, ");
            sb.append(this.longitudeSeconds.toDisplayString());
            sb.append(" seconds ");
            sb.append(this.longitudeRef);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }

        public double getLongitudeAsDegreesEast() throws org.apache.commons.imaging.ImageReadException {
            double doubleValue = this.longitudeDegrees.doubleValue() + (this.longitudeMinutes.doubleValue() / 60.0d) + (this.longitudeSeconds.doubleValue() / 3600.0d);
            if (this.longitudeRef.trim().equalsIgnoreCase("e")) {
                return doubleValue;
            }
            if (this.longitudeRef.trim().equalsIgnoreCase("w")) {
                return -doubleValue;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown longitude ref: \"");
            sb.append(this.longitudeRef);
            sb.append("\"");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }

        public double getLatitudeAsDegreesNorth() throws org.apache.commons.imaging.ImageReadException {
            double doubleValue = this.latitudeDegrees.doubleValue() + (this.latitudeMinutes.doubleValue() / 60.0d) + (this.latitudeSeconds.doubleValue() / 3600.0d);
            if (this.latitudeRef.trim().equalsIgnoreCase("n")) {
                return doubleValue;
            }
            if (this.latitudeRef.trim().equalsIgnoreCase(lib.android.paypal.com.magnessdk.g.n2)) {
                return -doubleValue;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown latitude ref: \"");
            sb.append(this.latitudeRef);
            sb.append("\"");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
    }
}
