package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class BidirectionalMap extends java.util.Hashtable {
    private static final long serialVersionUID = -7457289971962812909L;
    java.util.Hashtable getHighSpeedVideoFpsRanges = new java.util.Hashtable();

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.getHighSpeedVideoFpsRanges.put(obj2, obj);
        return super.put(obj, obj2);
    }

    public java.lang.Object getReverse(java.lang.Object obj) {
        return this.getHighSpeedVideoFpsRanges.get(obj);
    }
}
