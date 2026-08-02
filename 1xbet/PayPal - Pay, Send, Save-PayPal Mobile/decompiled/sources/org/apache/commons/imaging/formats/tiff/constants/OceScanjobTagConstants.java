package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class OceScanjobTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_OCE_SCANJOB_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_OCE_APPLICATION_SELECTOR;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_OCE_IDENTIFICATION_NUMBER;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_OCE_IMAGE_LOGIC_CHARACTERISTICS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_OCE_SCANJOB_DESCRIPTION;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("Oce Scanjob Description", 50215, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_OCE_SCANJOB_DESCRIPTION = tagInfoAscii;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("Oce Application Selector", 50216, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_OCE_APPLICATION_SELECTOR = tagInfoAscii2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("Oce Identification Number", 50217, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_OCE_IDENTIFICATION_NUMBER = tagInfoAscii3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("Oce ImageLogic Characteristics", 50218, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_OCE_IMAGE_LOGIC_CHARACTERISTICS = tagInfoAscii4;
        ALL_OCE_SCANJOB_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoAscii, tagInfoAscii2, tagInfoAscii3, tagInfoAscii4));
    }

    private OceScanjobTagConstants() {
    }
}
