package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class AdobePhotoshopTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_ADOBE_PHOTOSHOP_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds EXIF_TAG_IMAGE_SOURCE_DATA;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds EXIF_TAG_JPEGTABLES;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds("JPEGTables", 347, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_JPEGTABLES = tagInfoUndefineds;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds("ImageSourceData", 37724, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_IFD0);
        EXIF_TAG_IMAGE_SOURCE_DATA = tagInfoUndefineds2;
        ALL_ADOBE_PHOTOSHOP_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoUndefineds, tagInfoUndefineds2));
    }

    private AdobePhotoshopTagConstants() {
    }
}
