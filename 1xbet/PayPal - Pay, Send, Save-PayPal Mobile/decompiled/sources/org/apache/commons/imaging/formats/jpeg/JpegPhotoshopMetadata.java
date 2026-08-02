package org.apache.commons.imaging.formats.jpeg;

/* loaded from: classes17.dex */
public class JpegPhotoshopMetadata extends org.apache.commons.imaging.common.GenericImageMetadata {
    public final org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data;

    public JpegPhotoshopMetadata(org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data photoshopApp13Data) {
        this.photoshopApp13Data = photoshopApp13Data;
        java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> records = photoshopApp13Data.getRecords();
        java.util.Collections.sort(records, org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord.COMPARATOR);
        for (org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord iptcRecord : records) {
            if (iptcRecord.iptcType != org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes.RECORD_VERSION) {
                add(iptcRecord.getIptcTypeName(), iptcRecord.getValue());
            }
        }
    }

    public void dump() {
        org.apache.commons.imaging.internal.Debug.debug(toString());
    }
}
