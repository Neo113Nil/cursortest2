package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class TiffEpTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_TIFF_EP_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational EXIF_TAG_BATTERY_LEVEL;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes EXIF_TAG_CFAPATTERN_2;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts EXIF_TAG_CFAREPEAT_PATTERN_DIM;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals EXIF_TAG_EXPOSURE_INDEX;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals EXIF_TAG_FLASH_ENERGY;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_IMAGE_HISTORY_EXIF_IFD;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong EXIF_TAG_IMAGE_NUMBER_EXIF_IFD;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_INTERLACE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds EXIF_TAG_INTER_COLOR_PROFILE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds EXIF_TAG_NOISE_1;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_SELF_TIMER_MODE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort EXIF_TAG_SENSING_METHOD;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes EXIF_TAG_TIFF_EPSTANDARD_ID_1;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts EXIF_TAG_TIME_ZONE_OFFSET;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES = 2;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_MM = 4;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_NONE = 1;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM = 5;
    public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final int SENSING_METHOD_VALUE_MONOCHROME_AREA = 1;
    public static final int SENSING_METHOD_VALUE_MONOCHROME_LINEAR = 6;
    public static final int SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    public static final int SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    public static final int SENSING_METHOD_VALUE_TRILINEAR = 7;
    public static final int SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA = 3;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("CFARepeatPatternDim", 33421, 2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_CFAREPEAT_PATTERN_DIM = tagInfoShorts;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("CFAPattern2", 33422, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_CFAPATTERN_2 = tagInfoBytes;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational tagInfoAsciiOrRational = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational("BatteryLevel", 33423, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_ROOT);
        EXIF_TAG_BATTERY_LEVEL = tagInfoAsciiOrRational;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds("InterColorProfile", 34675, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_INTER_COLOR_PROFILE = tagInfoUndefineds;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("Interlace", 34857, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_INTERLACE = tagInfoShort;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts("TimeZoneOffset", 34858, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
        EXIF_TAG_TIME_ZONE_OFFSET = tagInfoSShorts;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("SelfTimerMode", 34859, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
        EXIF_TAG_SELF_TIMER_MODE = tagInfoShort2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals(androidx.exifinterface.media.ExifInterface.TAG_FLASH_ENERGY, 37387, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FLASH_ENERGY = tagInfoRationals;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds(androidx.exifinterface.media.ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE, 37388, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1 = tagInfoUndefineds2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds("Noise", 37389, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_NOISE_1 = tagInfoUndefineds3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, 37390, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FOCAL_PLANE_XRESOLUTION = tagInfoRational;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, 37391, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FOCAL_PLANE_YRESOLUTION = tagInfoRational2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 37392, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT = tagInfoShort3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("ImageNumber", 37393, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
        EXIF_TAG_IMAGE_NUMBER_EXIF_IFD = tagInfoLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("SecurityClassification", 37394, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
        EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD = tagInfoAscii;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("ImageHistory", 37395, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
        EXIF_TAG_IMAGE_HISTORY_EXIF_IFD = tagInfoAscii2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_INDEX, 37397, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_EXPOSURE_INDEX = tagInfoRationals2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("TIFF/EPStandardID", 37398, 4, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_TIFF_EPSTANDARD_ID_1 = tagInfoBytes2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort(androidx.exifinterface.media.ExifInterface.TAG_SENSING_METHOD, 37399, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_SENSING_METHOD = tagInfoShort4;
        ALL_TIFF_EP_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoShorts, tagInfoBytes, tagInfoAsciiOrRational, tagInfoUndefineds, tagInfoShort, tagInfoSShorts, tagInfoShort2, tagInfoRationals, tagInfoUndefineds2, tagInfoUndefineds3, tagInfoRational, tagInfoRational2, tagInfoShort3, tagInfoLong, tagInfoAscii, tagInfoAscii2, tagInfoRationals2, tagInfoBytes2, tagInfoShort4));
    }

    private TiffEpTagConstants() {
    }
}
