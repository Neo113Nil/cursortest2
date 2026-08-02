package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public class PhotoshopApp13Data {
    private final java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> rawBlocks;
    private final java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> records;

    public PhotoshopApp13Data(java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> list, java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> list2) {
        this.rawBlocks = list2;
        this.records = list;
    }

    public java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord> getRecords() {
        return new java.util.ArrayList(this.records);
    }

    public java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> getRawBlocks() {
        return new java.util.ArrayList(this.rawBlocks);
    }

    public java.util.List<org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock> getNonIptcBlocks() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock iptcBlock : this.rawBlocks) {
            if (!iptcBlock.isIPTCBlock()) {
                arrayList.add(iptcBlock);
            }
        }
        return arrayList;
    }
}
