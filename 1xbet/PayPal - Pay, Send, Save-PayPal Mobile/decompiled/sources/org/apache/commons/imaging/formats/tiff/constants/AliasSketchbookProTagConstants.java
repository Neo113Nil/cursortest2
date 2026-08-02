package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class AliasSketchbookProTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_ALIAS_SKETCHBOOK_PRO_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_ALIAS_LAYER_METADATA;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("Alias Layer Metadata", 50784, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_ALIAS_LAYER_METADATA = tagInfoAscii;
        ALL_ALIAS_SKETCHBOOK_PRO_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoAscii));
    }

    private AliasSketchbookProTagConstants() {
    }
}
