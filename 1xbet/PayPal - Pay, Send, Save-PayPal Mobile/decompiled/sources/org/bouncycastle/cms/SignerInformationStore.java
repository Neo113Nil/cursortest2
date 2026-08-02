package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SignerInformationStore implements org.bouncycastle.util.Iterable<org.bouncycastle.cms.SignerInformation> {
    private java.util.Map getHighSpeedVideoFpsRanges = new java.util.HashMap();
    private java.util.List getHighSpeedVideoSizes;

    public int size() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<org.bouncycastle.cms.SignerInformation> iterator() {
        return getSigners().iterator();
    }

    public java.util.Collection<org.bouncycastle.cms.SignerInformation> getSigners(org.bouncycastle.cms.SignerId signerId) {
        if (signerId.getIssuer() == null || signerId.getSubjectKeyIdentifier() == null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.getHighSpeedVideoFpsRanges.get(signerId);
            return arrayList == null ? new java.util.ArrayList() : new java.util.ArrayList(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Collection<org.bouncycastle.cms.SignerInformation> signers = getSigners(new org.bouncycastle.cms.SignerId(signerId.getIssuer(), signerId.getSerialNumber()));
        if (signers != null) {
            arrayList2.addAll(signers);
        }
        java.util.Collection<org.bouncycastle.cms.SignerInformation> signers2 = getSigners(new org.bouncycastle.cms.SignerId(signerId.getSubjectKeyIdentifier()));
        if (signers2 != null) {
            arrayList2.addAll(signers2);
        }
        return arrayList2;
    }

    public java.util.Collection<org.bouncycastle.cms.SignerInformation> getSigners() {
        return new java.util.ArrayList(this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.cms.SignerInformation get(org.bouncycastle.cms.SignerId signerId) {
        java.util.Collection<org.bouncycastle.cms.SignerInformation> signers = getSigners(signerId);
        if (signers.size() == 0) {
            return null;
        }
        return signers.iterator().next();
    }

    public SignerInformationStore(org.bouncycastle.cms.SignerInformation signerInformation) {
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        this.getHighSpeedVideoSizes = arrayList;
        arrayList.add(signerInformation);
        this.getHighSpeedVideoFpsRanges.put(signerInformation.getSID(), this.getHighSpeedVideoSizes);
    }

    public SignerInformationStore(java.util.Collection<org.bouncycastle.cms.SignerInformation> collection) {
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        for (org.bouncycastle.cms.SignerInformation signerInformation : collection) {
            org.bouncycastle.cms.SignerId sid = signerInformation.getSID();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.getHighSpeedVideoFpsRanges.get(sid);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                this.getHighSpeedVideoFpsRanges.put(sid, arrayList);
            }
            arrayList.add(signerInformation);
        }
        this.getHighSpeedVideoSizes = new java.util.ArrayList(collection);
    }
}
