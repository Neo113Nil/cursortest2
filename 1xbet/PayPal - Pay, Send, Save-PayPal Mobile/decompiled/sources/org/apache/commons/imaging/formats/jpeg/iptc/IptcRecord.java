package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public class IptcRecord {
    public static final java.util.Comparator<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord.lambda$static$0((org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord) obj, (org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord) obj2);
        }
    };
    public final org.apache.commons.imaging.formats.jpeg.iptc.IptcType iptcType;
    private final java.lang.String value;

    static /* synthetic */ int lambda$static$0(org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord iptcRecord, org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord iptcRecord2) {
        return iptcRecord.iptcType.getType() - iptcRecord2.iptcType.getType();
    }

    public IptcRecord(org.apache.commons.imaging.formats.jpeg.iptc.IptcType iptcType, java.lang.String str) {
        this.iptcType = iptcType;
        this.value = str;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public java.lang.String getIptcTypeName() {
        return this.iptcType.getName();
    }
}
