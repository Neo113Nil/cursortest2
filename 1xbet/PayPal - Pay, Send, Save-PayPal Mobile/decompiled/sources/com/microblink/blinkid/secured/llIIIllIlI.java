package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class llIIIllIlI {
    public static com.microblink.blinkid.secured.llIIIllIlI llIIIlllll;
    public com.microblink.blinkid.secured.IIlIIlIIIl IlIllIlIIl;
    public boolean IllIIIllII;
    public com.microblink.blinkid.secured.llllIIIIll llIIlIlIIl;

    public static com.microblink.blinkid.secured.llIIIllIlI llIIlIlIIl() {
        if (llIIIlllll == null) {
            llIIIlllll = new com.microblink.blinkid.secured.llIIIllIlI();
        }
        return llIIIlllll;
    }

    public final void llIIlIlIIl(int i, com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType, com.microblink.blinkid.entities.recognizers.SignedPayload signedPayload) {
        if (this.llIIlIlIIl != null) {
            int llIIlIlIIl = com.microblink.blinkid.secured.llIlIIIIIl.llIIlIlIIl(i);
            if (llIIlIlIIl == 0) {
                if (this.IllIIIllII) {
                    this.llIIlIlIIl.llIIlIlIIl(signedPayload, this.IlIllIlIIl);
                    this.IllIIIllII = false;
                    return;
                }
                return;
            }
            if (llIIlIlIIl != 1) {
                if (llIIlIlIIl == 2 && this.IllIIIllII && recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL) {
                    this.llIIlIlIIl.llIIlIlIIl(signedPayload, this.IlIllIlIIl);
                    this.IllIIIllII = false;
                    return;
                }
                return;
            }
            this.llIIlIlIIl.llIIlIlIIl(signedPayload, this.IlIllIlIIl);
            return;
        }
        throw new java.lang.IllegalStateException("PingManager.setup wasn't called and pingRepository instance is null.");
    }

    public final void llIIlIlIIl(java.lang.String str, java.lang.String str2) {
        java.util.List arrayList;
        java.util.List arrayList2;
        com.microblink.blinkid.secured.IIlIIlIIIl iIlIIlIIIl = this.IlIllIlIIl;
        if (iIlIIlIIIl != null) {
            java.util.List list = (java.util.List) iIlIIlIIIl.llIIlIlIIl.get(str);
            java.lang.String concat = str.concat("Time");
            java.util.List list2 = (java.util.List) iIlIIlIIIl.llIIlIlIIl.get(concat);
            if (list == null || list2 == null) {
                synchronized (com.microblink.blinkid.secured.llllIIIIll.class) {
                    java.util.List list3 = (java.util.List) iIlIIlIIIl.llIIlIlIIl.get(str);
                    if (list3 == null || list2 == null) {
                        arrayList = new java.util.ArrayList();
                        arrayList2 = new java.util.ArrayList();
                        if (iIlIIlIIIl.llIIlIlIIl.isEmpty()) {
                            iIlIIlIIIl.IllIIIllII = java.lang.System.currentTimeMillis();
                        }
                        iIlIIlIIIl.llIIlIlIIl.put(str, arrayList);
                        iIlIIlIIIl.llIIlIlIIl.put(concat, arrayList2);
                    } else {
                        arrayList2 = list2;
                        arrayList = list3;
                    }
                }
                list = arrayList;
                list2 = arrayList2;
            }
            list.add(str2);
            list2.add(java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.lang.Float.valueOf((java.lang.System.currentTimeMillis() - iIlIIlIIIl.IllIIIllII) / 1000.0f)));
            return;
        }
        throw new java.lang.IllegalStateException("PingManager.setup wasn't called and pingExtras instance is null.");
    }
}
