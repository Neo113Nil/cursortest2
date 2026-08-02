package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class Tiff4TagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_TIFF_4_TAGS;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_00001 = 5;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_0001 = 4;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_001 = 3;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_01 = 2;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_1 = 1;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort TIFF_TAG_COLOR_RESPONSE_UNIT;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("ColorResponseUnit", 300, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_ROOT);
        TIFF_TAG_COLOR_RESPONSE_UNIT = tagInfoShort;
        ALL_TIFF_4_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoShort));
    }

    private Tiff4TagConstants() {
    }
}
