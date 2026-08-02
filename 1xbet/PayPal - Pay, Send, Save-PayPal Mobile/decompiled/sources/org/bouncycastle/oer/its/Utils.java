package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
class Utils {
    static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Encodable... aSN1EncodableArr) {
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableArr);
    }

    static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(java.util.List list) {
        return new org.bouncycastle.asn1.DERSequence((org.bouncycastle.asn1.ASN1Encodable[]) list.toArray(new org.bouncycastle.asn1.ASN1Encodable[0]));
    }

    static <T> java.util.List<T> getHighSpeedVideoFpsRangesFor(final java.lang.Class<T> cls, final org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        return (java.util.List) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.util.List<T>>() { // from class: org.bouncycastle.oer.its.Utils.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.util.List<T> run() {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.this.iterator();
                    while (it.hasNext()) {
                        arrayList.add(cls.cast(cls.getMethod("getInstance", java.lang.Object.class).invoke(null, it.next())));
                    }
                    return arrayList;
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("could not invoke getInstance on type ");
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalStateException(sb.toString(), e);
                }
            }
        });
    }

    Utils() {
    }
}
