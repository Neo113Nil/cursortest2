package org.apache.commons.imaging.formats.tiff.constants;

/* loaded from: classes17.dex */
public final class GeoTiffTagConstants {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> ALL_GEO_TIFF_TAGS;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii EXIF_TAG_GEO_ASCII_PARAMS_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles EXIF_TAG_GEO_DOUBLE_PARAMS_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts EXIF_TAG_GEO_KEY_DIRECTORY_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles EXIF_TAG_INTERGRAPH_MATRIX_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles EXIF_TAG_MODEL_PIXEL_SCALE_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles EXIF_TAG_MODEL_TIEPOINT_TAG;
    public static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles EXIF_TAG_MODEL_TRANSFORMATION_TAG;

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("ModelPixelScaleTag", 33550, 3, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MODEL_PIXEL_SCALE_TAG = tagInfoDoubles;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("IntergraphMatrixTag", 33920, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_INTERGRAPH_MATRIX_TAG = tagInfoDoubles2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("ModelTiepointTag", 33922, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MODEL_TIEPOINT_TAG = tagInfoDoubles3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("ModelTransformationTag", 34264, 16, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_MODEL_TRANSFORMATION_TAG = tagInfoDoubles4;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("GeoKeyDirectoryTag", 34735, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_GEO_KEY_DIRECTORY_TAG = tagInfoShorts;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("GeoDoubleParamsTag", 34736, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_GEO_DOUBLE_PARAMS_TAG = tagInfoDoubles5;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("GeoAsciiParamsTag", 34737, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
        EXIF_TAG_GEO_ASCII_PARAMS_TAG = tagInfoAscii;
        ALL_GEO_TIFF_TAGS = java.util.Collections.unmodifiableList(java.util.Arrays.asList(tagInfoDoubles, tagInfoDoubles2, tagInfoDoubles3, tagInfoDoubles4, tagInfoShorts, tagInfoDoubles5, tagInfoAscii));
    }

    private GeoTiffTagConstants() {
    }
}
