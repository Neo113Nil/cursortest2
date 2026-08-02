package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffContents {
    public final java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory> directories;
    public final org.apache.commons.imaging.formats.tiff.TiffHeader header;
    public final java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFields;

    public TiffContents(org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader, java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory> list, java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> list2) {
        this.header = tiffHeader;
        this.directories = java.util.Collections.unmodifiableList(list);
        this.tiffFields = java.util.Collections.unmodifiableList(list2);
    }

    public java.util.List<org.apache.commons.imaging.formats.tiff.TiffElement> getElements() throws org.apache.commons.imaging.ImageReadException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.header);
        for (org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory : this.directories) {
            arrayList.add(tiffDirectory);
            java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> it = tiffDirectory.entries.iterator();
            while (it.hasNext()) {
                org.apache.commons.imaging.formats.tiff.TiffElement oversizeValueElement = it.next().getOversizeValueElement();
                if (oversizeValueElement != null) {
                    arrayList.add(oversizeValueElement);
                }
            }
            if (tiffDirectory.hasTiffImageData()) {
                arrayList.addAll(tiffDirectory.getTiffRawImageDataElements());
            }
            if (tiffDirectory.hasJpegImageData()) {
                arrayList.add(tiffDirectory.getJpegRawImageDataElement());
            }
        }
        return arrayList;
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) throws org.apache.commons.imaging.ImageReadException {
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffField findField = it.next().findField(tagInfo);
            if (findField != null) {
                return findField;
            }
        }
        return null;
    }

    public void dissect() throws org.apache.commons.imaging.ImageReadException {
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffElement> elements = getElements();
        java.util.Collections.sort(elements, org.apache.commons.imaging.formats.tiff.TiffElement.COMPARATOR);
        long j = 0;
        for (org.apache.commons.imaging.formats.tiff.TiffElement tiffElement : elements) {
            if (tiffElement.offset > j) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\tgap: ");
                sb.append(tiffElement.offset - j);
                org.apache.commons.imaging.internal.Debug.debug(sb.toString());
            }
            if (tiffElement.offset < j) {
                org.apache.commons.imaging.internal.Debug.debug("\toverlap");
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("element, start: ");
            sb2.append(tiffElement.offset);
            sb2.append(", length: ");
            sb2.append(tiffElement.length);
            sb2.append(", end: ");
            sb2.append(tiffElement.offset + tiffElement.length);
            sb2.append(": ");
            sb2.append(tiffElement.getElementDescription());
            org.apache.commons.imaging.internal.Debug.debug(sb2.toString());
            java.lang.String elementDescription = tiffElement.getElementDescription();
            if (elementDescription != null) {
                org.apache.commons.imaging.internal.Debug.debug(elementDescription);
            }
            j = tiffElement.offset + tiffElement.length;
        }
        org.apache.commons.imaging.internal.Debug.debug("end: ".concat(java.lang.String.valueOf(j)));
        org.apache.commons.imaging.internal.Debug.debug();
    }
}
