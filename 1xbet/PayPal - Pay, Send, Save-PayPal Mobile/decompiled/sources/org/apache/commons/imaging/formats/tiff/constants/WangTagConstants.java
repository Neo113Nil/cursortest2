package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class WangTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_WANG_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes EXIF_TAG_WANG_ANNOTATION;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("WangAnnotation", 32932, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_WANG_ANNOTATION = tagInfoBytes;
        ALL_WANG_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoBytes));
    }

    private WangTagConstants() {
    }
}
