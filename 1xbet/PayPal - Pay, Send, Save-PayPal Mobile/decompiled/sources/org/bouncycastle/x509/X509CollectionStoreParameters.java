package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509CollectionStoreParameters implements org.bouncycastle.x509.X509StoreParameters {
    private java.util.Collection getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("X509CollectionStoreParameters: [\n");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("  collection: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public java.util.Collection getCollection() {
        return new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
    }

    public java.lang.Object clone() {
        return new org.bouncycastle.x509.X509CollectionStoreParameters(this.getHighSpeedVideoFpsRanges);
    }

    public X509CollectionStoreParameters(java.util.Collection collection) {
        if (collection == null) {
            throw new java.lang.NullPointerException("collection cannot be null");
        }
        this.getHighSpeedVideoFpsRanges = collection;
    }
}
