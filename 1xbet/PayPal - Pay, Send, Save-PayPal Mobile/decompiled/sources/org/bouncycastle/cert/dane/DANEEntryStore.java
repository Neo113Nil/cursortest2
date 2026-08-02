package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANEEntryStore implements org.bouncycastle.util.Store {
    private final java.util.Map Camera2StreamConfigurationMap;

    public org.bouncycastle.util.Store toCertificateStore() {
        java.util.Collection matches = getMatches(null);
        java.util.ArrayList arrayList = new java.util.ArrayList(matches.size());
        java.util.Iterator it = matches.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.bouncycastle.cert.dane.DANEEntry) it.next()).getCertificate());
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    @Override // org.bouncycastle.util.Store
    public java.util.Collection getMatches(org.bouncycastle.util.Selector selector) throws org.bouncycastle.util.StoreException {
        if (selector == null) {
            return this.Camera2StreamConfigurationMap.values();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.Camera2StreamConfigurationMap.values()) {
            if (selector.match(obj)) {
                arrayList.add(obj);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    DANEEntryStore(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            org.bouncycastle.cert.dane.DANEEntry dANEEntry = (org.bouncycastle.cert.dane.DANEEntry) it.next();
            hashMap.put(dANEEntry.getDomainName(), dANEEntry);
        }
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(hashMap);
    }
}
