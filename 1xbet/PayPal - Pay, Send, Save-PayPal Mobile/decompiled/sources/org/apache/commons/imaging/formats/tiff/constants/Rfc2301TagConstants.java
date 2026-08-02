package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class Rfc2301TagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_RFC_2301_TAGS;
    public static final int CLEAN_FAX_DATA_VALUE_CLEAN = 0;
    public static final int CLEAN_FAX_DATA_VALUE_REGENERATED = 1;
    public static final int CLEAN_FAX_DATA_VALUE_UNCLEAN = 2;
    public static final int CODING_METHODS_VALUE_T4_1D = 2;
    public static final int CODING_METHODS_VALUE_T4_2D = 4;
    public static final int CODING_METHODS_VALUE_T6 = 8;
    public static final int CODING_METHODS_VALUE_T81 = 32;
    public static final int CODING_METHODS_VALUE_T82_T43 = 64;
    public static final int CODING_METHODS_VALUE_T82_T85 = 16;
    public static final int FAX_PROFILE_VALUE_EXTENDED_B_AND_W_LOSSLESS_F = 2;
    public static final int FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L = 5;
    public static final int FAX_PROFILE_VALUE_LOSSLESS_JBIG_B_AND_W_J = 3;
    public static final int FAX_PROFILE_VALUE_LOSSY_COLOR_AND_GRAYSCALE_C = 4;
    public static final int FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S = 1;
    public static final int FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M = 6;
    public static final int FAX_PROFILE_VALUE_UNKNOWN = 0;
    public static final int PROFILE_TYPE_VALUE_GROUP_3_FAX = 1;
    public static final int PROFILE_TYPE_VALUE_UNSPECIFIED = 0;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong TIFF_TAG_BAD_FAX_LINES;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort TIFF_TAG_CLEAN_FAX_DATA;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong TIFF_TAG_CODING_METHODS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals TIFF_TAG_DECODE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts TIFF_TAG_DEFAULT_IMAGE_COLOR;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte TIFF_TAG_FAX_PROFILE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory TIFF_TAG_GLOBAL_PARAMETERS_IFD;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong TIFF_TAG_IMAGE_LAYER;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte TIFF_TAG_MODE_NUMBER;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong TIFF_TAG_PROFILE_TYPE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs TIFF_TAG_STRIP_ROW_COUNTS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes TIFF_TAG_VERSION_YEAR;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("BadFaxLines", 326, 1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_BAD_FAX_LINES = tagInfoShortOrLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("CleanFaxData", 327, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_CLEAN_FAX_DATA = tagInfoShort;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("ConsecutiveBadFaxLines", 328, 1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES = tagInfoShortOrLong2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("GlobalParametersIFD", 400, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_GLOBAL_PARAMETERS_IFD = tagInfoDirectory;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("ProfileType", 401, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_PROFILE_TYPE = tagInfoLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("FaxProfile", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_FAX_PROFILE = tagInfoByte;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("CodingMethods", 403, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_CODING_METHODS = tagInfoLong2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("VersionYear", 404, 4, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_VERSION_YEAR = tagInfoBytes;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("ModeNumber", com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_MODE_NUMBER = tagInfoByte2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals("Decode", 433, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_DECODE = tagInfoRationals;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("DefaultImageColor", 434, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_DEFAULT_IMAGE_COLOR = tagInfoShorts;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("StripRowCounts", 559, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_STRIP_ROW_COUNTS = tagInfoLongs;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("ImageLayer", 34732, 2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_IMAGE_LAYER = tagInfoShortOrLong3;
        ALL_RFC_2301_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoShortOrLong, tagInfoShort, tagInfoShortOrLong2, tagInfoDirectory, tagInfoLong, tagInfoByte, tagInfoLong2, tagInfoBytes, tagInfoByte2, tagInfoRationals, tagInfoShorts, tagInfoLongs, tagInfoShortOrLong3));
    }

    private Rfc2301TagConstants() {
    }
}
