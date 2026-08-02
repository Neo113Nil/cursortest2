package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class RecipientInformationStore implements org.bouncycastle.util.Iterable<org.bouncycastle.cms.RecipientInformation> {
    private final java.util.List Camera2StreamConfigurationMap;
    private final java.util.Map getHighSpeedVideoFpsRanges;

    public int size() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<org.bouncycastle.cms.RecipientInformation> iterator() {
        return getRecipients().iterator();
    }

    public java.util.Collection<org.bouncycastle.cms.RecipientInformation> getRecipients(org.bouncycastle.cms.RecipientId recipientId) {
        if (recipientId instanceof org.bouncycastle.cms.KeyTransRecipientId) {
            org.bouncycastle.cms.KeyTransRecipientId keyTransRecipientId = (org.bouncycastle.cms.KeyTransRecipientId) recipientId;
            org.bouncycastle.asn1.x500.X500Name issuer = keyTransRecipientId.getIssuer();
            byte[] subjectKeyIdentifier = keyTransRecipientId.getSubjectKeyIdentifier();
            if (issuer != null && subjectKeyIdentifier != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Collection<org.bouncycastle.cms.RecipientInformation> recipients = getRecipients(new org.bouncycastle.cms.KeyTransRecipientId(issuer, keyTransRecipientId.getSerialNumber()));
                if (recipients != null) {
                    arrayList.addAll(recipients);
                }
                java.util.Collection<org.bouncycastle.cms.RecipientInformation> recipients2 = getRecipients(new org.bouncycastle.cms.KeyTransRecipientId(subjectKeyIdentifier));
                if (recipients2 != null) {
                    arrayList.addAll(recipients2);
                }
                return arrayList;
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.getHighSpeedVideoFpsRanges.get(recipientId);
        return arrayList2 == null ? new java.util.ArrayList() : new java.util.ArrayList(arrayList2);
    }

    public java.util.Collection<org.bouncycastle.cms.RecipientInformation> getRecipients() {
        return new java.util.ArrayList(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.cms.RecipientInformation get(org.bouncycastle.cms.RecipientId recipientId) {
        java.util.Collection<org.bouncycastle.cms.RecipientInformation> recipients = getRecipients(recipientId);
        if (recipients.size() == 0) {
            return null;
        }
        return recipients.iterator().next();
    }

    public RecipientInformationStore(org.bouncycastle.cms.RecipientInformation recipientInformation) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        this.Camera2StreamConfigurationMap = arrayList;
        arrayList.add(recipientInformation);
        hashMap.put(recipientInformation.getRID(), arrayList);
    }

    public RecipientInformationStore(java.util.Collection<org.bouncycastle.cms.RecipientInformation> collection) {
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        for (org.bouncycastle.cms.RecipientInformation recipientInformation : collection) {
            org.bouncycastle.cms.RecipientId rid = recipientInformation.getRID();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.getHighSpeedVideoFpsRanges.get(rid);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                this.getHighSpeedVideoFpsRanges.put(rid, arrayList);
            }
            arrayList.add(recipientInformation);
        }
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(collection);
    }
}
