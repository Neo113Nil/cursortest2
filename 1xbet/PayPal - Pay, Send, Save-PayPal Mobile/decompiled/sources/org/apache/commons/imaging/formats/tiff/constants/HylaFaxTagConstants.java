package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class HylaFaxTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_HYLAFAX_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_FAX_DCS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong EXIF_TAG_FAX_RECV_PARAMS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong EXIF_TAG_FAX_RECV_TIME;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_FAX_SUB_ADDRESS;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("FaxRecvParams", 34908, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FAX_RECV_PARAMS = tagInfoLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("FaxSubAddress", 34909, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FAX_SUB_ADDRESS = tagInfoAscii;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("FaxRecvTime", 34910, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FAX_RECV_TIME = tagInfoLong2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("FaxDCS", 34911, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_FAX_DCS = tagInfoAscii2;
        ALL_HYLAFAX_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoLong, tagInfoAscii, tagInfoLong2, tagInfoAscii2));
    }

    private HylaFaxTagConstants() {
    }
}
