package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class GeneralNamesBuilder {
    private java.util.Vector getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();

    public org.bouncycastle.asn1.x509.GeneralNames build() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr = new org.bouncycastle.asn1.x509.GeneralName[size];
        for (int i = 0; i != size; i++) {
            generalNameArr[i] = (org.bouncycastle.asn1.x509.GeneralName) this.getHighResolutionOutputSizeshNQ4ISI.elementAt(i);
        }
        return new org.bouncycastle.asn1.x509.GeneralNames(generalNameArr);
    }

    public org.bouncycastle.asn1.x509.GeneralNamesBuilder addNames(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
        for (int i = 0; i != names.length; i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(names[i]);
        }
        return this;
    }

    public org.bouncycastle.asn1.x509.GeneralNamesBuilder addName(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighResolutionOutputSizeshNQ4ISI.addElement(generalName);
        return this;
    }
}
