package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class AdobePageMaker6TagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_ADOBE_PAGEMAKER_6_TAGS;
    public static final int INDEXED_VALUE_INDEXED = 1;
    public static final int INDEXED_VALUE_NOT_INDEXED = 0;
    public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST = 0;
    public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS = 1;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes TIFF_TAG_CLIP_PATH;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii TIFF_TAG_IMAGE_ID;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort TIFF_TAG_INDEXED;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort TIFF_TAG_OPIPROXY;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD TIFF_TAG_SUB_IFD;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong TIFF_TAG_XCLIP_PATH_UNITS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong TIFF_TAG_YCLIP_PATH_UNITS;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD tagInfoLongOrIFD = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD("SubIFDs", com.visa.cbp.getCertUsage.setAucAID, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
        TIFF_TAG_SUB_IFD = tagInfoLongOrIFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("ClipPath", 343, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_CLIP_PATH = tagInfoBytes;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("XClipPathUnits", my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_XCLIP_PATH_UNITS = tagInfoLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("YClipPathUnits", 345, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_YCLIP_PATH_UNITS = tagInfoLong2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("Indexed", 346, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_INDEXED = tagInfoShort;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("OPIProxy", 351, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_OPIPROXY = tagInfoShort2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("ImageID", 32781, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        TIFF_TAG_IMAGE_ID = tagInfoAscii;
        ALL_ADOBE_PAGEMAKER_6_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoLongOrIFD, tagInfoBytes, tagInfoLong, tagInfoLong2, tagInfoShort, tagInfoShort2, tagInfoAscii));
    }

    private AdobePageMaker6TagConstants() {
    }
}
