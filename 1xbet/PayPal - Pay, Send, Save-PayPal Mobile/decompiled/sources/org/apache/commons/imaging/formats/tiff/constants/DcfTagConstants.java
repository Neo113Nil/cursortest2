package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class DcfTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_DCF_TAGS;
    public static final int COLOR_SPACE_VALUE_ADOBE_RGB = 2;
    public static final int COLOR_SPACE_VALUE_SRGB = 1;
    public static final int COLOR_SPACE_VALUE_UNCALIBRATED = 65535;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_COLOR_SPACE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_RELATED_IMAGE_FILE_FORMAT;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong EXIF_TAG_RELATED_IMAGE_LENGTH;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong EXIF_TAG_RELATED_IMAGE_WIDTH;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("RelatedImageFileFormat", 4096, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
        EXIF_TAG_RELATED_IMAGE_FILE_FORMAT = tagInfoAscii;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("RelatedImageWidth", androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN, 1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
        EXIF_TAG_RELATED_IMAGE_WIDTH = tagInfoShortOrLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("RelatedImageLength", 4098, 1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
        EXIF_TAG_RELATED_IMAGE_LENGTH = tagInfoShortOrLong2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, 40961, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
        EXIF_TAG_COLOR_SPACE = tagInfoShort;
        ALL_DCF_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoAscii, tagInfoShortOrLong, tagInfoShortOrLong2, tagInfoShort));
    }

    private DcfTagConstants() {
    }
}
