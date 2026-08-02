package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public final class IptcTypeLookup {
    private static final java.util.Map<java.lang.Integer, org.apache.commons.imaging.formats.jpeg.iptc.IptcType> IPTC_TYPE_MAP = new java.util.HashMap();

    static {
        for (org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes iptcTypes : org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes.values()) {
            IPTC_TYPE_MAP.put(java.lang.Integer.valueOf(iptcTypes.getType()), iptcTypes);
        }
    }

    private IptcTypeLookup() {
    }

    public static org.apache.commons.imaging.formats.jpeg.iptc.IptcType getIptcType(int i) {
        java.util.Map<java.lang.Integer, org.apache.commons.imaging.formats.jpeg.iptc.IptcType> map = IPTC_TYPE_MAP;
        if (!map.containsKey(java.lang.Integer.valueOf(i))) {
            return org.apache.commons.imaging.formats.jpeg.iptc.IptcTypes.getUnknown(i);
        }
        return map.get(java.lang.Integer.valueOf(i));
    }
}
