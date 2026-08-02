package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class GdalLibraryTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_GDAL_LIBRARY_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_GDAL_METADATA;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_GDAL_NO_DATA;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("GDALMetadata", 42112, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_GDAL_METADATA = tagInfoAscii;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("GDALNoData", 42113, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_GDAL_NO_DATA = tagInfoAscii2;
        ALL_GDAL_LIBRARY_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoAscii, tagInfoAscii2));
    }

    private GdalLibraryTagConstants() {
    }
}
