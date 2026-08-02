package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoDirectory extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong {
    private static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> fieldList = java.util.Collections.unmodifiableList(java.util.Arrays.asList(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.IFD));

    public TagInfoDirectory(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, fieldList, 1, tiffDirectoryType, true);
    }
}
