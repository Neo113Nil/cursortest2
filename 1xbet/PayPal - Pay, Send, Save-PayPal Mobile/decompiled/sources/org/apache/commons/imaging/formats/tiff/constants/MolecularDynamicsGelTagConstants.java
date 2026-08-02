package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class MolecularDynamicsGelTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_MOLECULAR_DYNAMICS_GEL_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts EXIF_TAG_MD_COLOR_TABLE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong EXIF_TAG_MD_FILE_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_MD_FILE_UNITS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_MD_LAB_NAME;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_MD_PREP_DATE;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_MD_PREP_TIME;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_MD_SAMPLE_INFO;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational EXIF_TAG_MD_SCALE_PIXEL;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("MD FileTag", 33445, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_FILE_TAG = tagInfoLong;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational("MD ScalePixel", 33446, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_SCALE_PIXEL = tagInfoRational;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("MD ColorTable", 33447, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_COLOR_TABLE = tagInfoShorts;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("MD LabName", 33448, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_LAB_NAME = tagInfoAscii;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("MD SampleInfo", 33449, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_SAMPLE_INFO = tagInfoAscii2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("MD PrepDate", 33450, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_PREP_DATE = tagInfoAscii3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("MD PrepTime", 33451, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_PREP_TIME = tagInfoAscii4;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("MD FileUnits", 33452, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MD_FILE_UNITS = tagInfoAscii5;
        ALL_MOLECULAR_DYNAMICS_GEL_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoLong, tagInfoRational, tagInfoShorts, tagInfoAscii, tagInfoAscii2, tagInfoAscii3, tagInfoAscii4, tagInfoAscii5));
    }

    private MolecularDynamicsGelTagConstants() {
    }
}
