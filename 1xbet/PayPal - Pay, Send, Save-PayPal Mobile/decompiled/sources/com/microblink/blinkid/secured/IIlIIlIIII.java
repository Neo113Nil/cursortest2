package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIlIIlIIII {
    public static final java.util.HashMap IlIllIlIIl;
    public final java.util.ArrayList llIIlIlIIl = new java.util.ArrayList();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        IlIllIlIIl = hashMap;
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Other, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Visa, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.AmericanExpress, new com.microblink.blinkid.secured.IIlIIlIIII(4, 6));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.ChinaUnionPay, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Mastercard, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Maestro, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Diners, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.DiscoverCard, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
        hashMap.put(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Jcb, new com.microblink.blinkid.secured.IIlIIlIIII(4, 4, 4));
    }

    public IIlIIlIIII(java.lang.Integer... numArr) {
        int i = 0;
        for (java.lang.Integer num : numArr) {
            int intValue = num.intValue() + i;
            this.llIIlIlIIl.add(java.lang.Integer.valueOf(intValue));
            i = intValue + 1;
        }
        this.llIIlIlIIl.add(100);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.microblink.blinkid.secured.IIlIIlIIII.class != obj.getClass()) {
            return false;
        }
        com.microblink.blinkid.secured.IIlIIlIIII iIlIIlIIII = (com.microblink.blinkid.secured.IIlIIlIIII) obj;
        if (iIlIIlIIII.llIIlIlIIl.size() != this.llIIlIlIIl.size()) {
            return false;
        }
        for (int i = 0; i < this.llIIlIlIIl.size(); i++) {
            if (!((java.lang.Integer) iIlIIlIIII.llIIlIlIIl.get(i)).equals(this.llIIlIlIIl.get(i))) {
                return false;
            }
        }
        return true;
    }
}
