package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
public final class TiffOutputSet {
    private static final java.lang.String NEWLINE = java.lang.System.getProperty("line.separator");
    public final java.nio.ByteOrder byteOrder;
    private final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> directories;

    public TiffOutputSet() {
        this(org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER);
    }

    public TiffOutputSet(java.nio.ByteOrder byteOrder) {
        this.directories = new java.util.ArrayList();
        this.byteOrder = byteOrder;
    }

    protected final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> getOutputItems(org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary tiffOutputSummary) throws org.apache.commons.imaging.ImageWriteException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getOutputItems(tiffOutputSummary));
        }
        return arrayList;
    }

    public final void addDirectory(org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory) throws org.apache.commons.imaging.ImageWriteException {
        if (findDirectory(tiffOutputDirectory.type) != null) {
            throw new org.apache.commons.imaging.ImageWriteException("Output set already contains a directory of that type.");
        }
        this.directories.add(tiffOutputDirectory);
    }

    public final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> getDirectories() {
        return new java.util.ArrayList(this.directories);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getRootDirectory() {
        return findDirectory(0);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getExifDirectory() {
        return findDirectory(-2);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getOrCreateRootDirectory() throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory findDirectory = findDirectory(0);
        return findDirectory != null ? findDirectory : addRootDirectory();
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getOrCreateExifDirectory() throws org.apache.commons.imaging.ImageWriteException {
        getOrCreateRootDirectory();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory findDirectory = findDirectory(-2);
        return findDirectory != null ? findDirectory : addExifDirectory();
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getOrCreateGPSDirectory() throws org.apache.commons.imaging.ImageWriteException {
        getOrCreateExifDirectory();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory findDirectory = findDirectory(-3);
        return findDirectory != null ? findDirectory : addGPSDirectory();
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getGPSDirectory() {
        return findDirectory(-3);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory getInteroperabilityDirectory() {
        return findDirectory(-4);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory findDirectory(int i) {
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory : this.directories) {
            if (tiffOutputDirectory.type == i) {
                return tiffOutputDirectory;
            }
        }
        return null;
    }

    public final void setGPSInDegrees(double d, double d2) throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory orCreateGPSDirectory = getOrCreateGPSDirectory();
        orCreateGPSDirectory.removeField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_VERSION_ID);
        orCreateGPSDirectory.add(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_VERSION_ID, org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.gpsVersion());
        java.lang.String str = d < 0.0d ? "W" : "E";
        double abs = java.lang.Math.abs(d);
        java.lang.String str2 = d2 < 0.0d ? "S" : "N";
        double abs2 = java.lang.Math.abs(d2);
        orCreateGPSDirectory.removeField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        orCreateGPSDirectory.add(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF, str);
        orCreateGPSDirectory.removeField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        orCreateGPSDirectory.add(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF, str2);
        orCreateGPSDirectory.removeField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE);
        orCreateGPSDirectory.add(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE, org.apache.commons.imaging.common.RationalNumber.valueOf((long) abs), org.apache.commons.imaging.common.RationalNumber.valueOf((long) r11), org.apache.commons.imaging.common.RationalNumber.valueOf((((abs % 1.0d) * 60.0d) % 1.0d) * 60.0d));
        orCreateGPSDirectory.removeField(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE);
        orCreateGPSDirectory.add(org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE, org.apache.commons.imaging.common.RationalNumber.valueOf((long) abs2), org.apache.commons.imaging.common.RationalNumber.valueOf((long) r13), org.apache.commons.imaging.common.RationalNumber.valueOf((((abs2 % 1.0d) * 60.0d) % 1.0d) * 60.0d));
    }

    public final void removeField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    public final void removeField(int i) {
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            it.next().removeField(i);
        }
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField(int i) {
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField = it.next().findField(i);
            if (findField != null) {
                return findField;
            }
        }
        return null;
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addRootDirectory() throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(0, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addExifDirectory() throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(-2, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addGPSDirectory() throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(-3, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory addInteroperabilityDirectory() throws org.apache.commons.imaging.ImageWriteException {
        getOrCreateExifDirectory();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(-4, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public final java.lang.String toString() {
        return toString(null);
    }

    public final java.lang.String toString(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
        sb.append(str);
        sb.append("TiffOutputSet {");
        java.lang.String str2 = NEWLINE;
        sb.append(str2);
        sb.append(str);
        sb.append("byteOrder: ");
        sb.append(this.byteOrder);
        sb.append(str2);
        for (int i = 0; i < this.directories.size(); i++) {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = this.directories.get(i);
            sb.append(java.lang.String.format("%s\tdirectory %d: %s (%d)%n", str, java.lang.Integer.valueOf(i), tiffOutputDirectory.description(), java.lang.Integer.valueOf(tiffOutputDirectory.type)));
            for (org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField : tiffOutputDirectory.getFields()) {
                sb.append(str);
                sb.append("\t\tfield ");
                sb.append(i);
                sb.append(": ");
                sb.append(tiffOutputField.tagInfo);
                sb.append(NEWLINE);
            }
        }
        sb.append(str);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        sb.append(NEWLINE);
        return sb.toString();
    }

    public final void dump() {
        org.apache.commons.imaging.internal.Debug.debug(toString());
    }
}
