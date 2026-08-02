package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llllIIIIll {
    public final com.microblink.blinkid.secured.IIIIIllIlI IlIllIlIIl;
    public final com.microblink.blinkid.secured.IlIlIlIIIl IllIIIllII;
    public final com.microblink.blinkid.secured.IlIIIlIlII llIIlIlIIl = new com.microblink.blinkid.secured.IlIIIlIlII();

    public llllIIIIll(android.content.Context context) {
        this.IlIllIlIIl = new com.microblink.blinkid.secured.IIIIIllIlI(context);
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl("Ping");
        this.IllIIIllII = ilIlIlIIIl;
        ilIlIlIIIl.start();
    }

    public final void IlIllIlIIl() {
        this.IllIIIllII.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llllIIIIll$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.llllIIIIll.this.llIIlIlIIl();
            }
        });
    }

    public final void finalize() {
        super.finalize();
        this.IllIIIllII.IllIIIllII();
    }

    public final /* synthetic */ void llIIlIlIIl() {
        llIIlIlIIl(this.IlIllIlIIl.llIIlIlIIl());
    }

    public final void IlIllIlIIl(com.microblink.blinkid.entities.recognizers.SignedPayload signedPayload, com.microblink.blinkid.secured.IIlIIlIIIl iIlIIlIIIl) {
        int i;
        com.microblink.blinkid.ping.Ping ping = new com.microblink.blinkid.ping.Ping(signedPayload.getBase64EncodedPayload(), signedPayload.getSignature(), signedPayload.getSignatureVersion());
        if (signedPayload.isEmpty()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Android");
            ping.llIIlIlIIl(hashMap);
        } else if (!iIlIIlIIIl.llIIlIlIIl.isEmpty() || !iIlIIlIIIl.IlIllIlIIl.isEmpty()) {
            java.util.HashMap hashMap2 = new java.util.HashMap(iIlIIlIIIl.IlIllIlIIl);
            for (java.util.Map.Entry entry : iIlIIlIIIl.llIIlIlIIl.entrySet()) {
                java.util.List list = (java.util.List) entry.getValue();
                int i2 = 0;
                java.util.List subList = list.subList(java.lang.Math.max(0, list.size() - 20), list.size());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int size = subList.size();
                while (true) {
                    i = size - 1;
                    if (i2 >= i) {
                        break;
                    }
                    sb.append((java.lang.String) subList.get(i2));
                    sb.append(",");
                    i2++;
                }
                if (size > 0) {
                    sb.append((java.lang.String) subList.get(i));
                }
                hashMap2.put((java.lang.String) entry.getKey(), sb.toString());
            }
            ping.llIIlIlIIl(hashMap2);
        }
        try {
            com.microblink.blinkid.secured.IIIIlIlIll llIIlIlIIl = com.microblink.blinkid.secured.IIIIlIlIll.llIIlIlIIl(this.llIIlIlIIl.llIIlIlIIl);
            llIIlIlIIl.llIIlIlIIl().setConnectTimeout(10000);
            llIIlIlIIl.llIIlIlIIl(ping.llIIlIlIIl());
            if (llIIlIlIIl.IlIllIlIIl() != 201) {
                com.microblink.blinkid.secured.IIIIIllIlI iIIIIllIlI = this.IlIllIlIIl;
                java.util.ArrayList llIIlIlIIl2 = iIIIIllIlI.llIIlIlIIl();
                llIIlIlIIl2.add(ping);
                iIIIIllIlI.llIIlIlIIl(llIIlIlIIl2);
            }
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.llllIIIIll.class, e, "Failed to send Ping!", e.getMessage());
            com.microblink.blinkid.secured.IIIIIllIlI iIIIIllIlI2 = this.IlIllIlIIl;
            java.util.ArrayList llIIlIlIIl3 = iIIIIllIlI2.llIIlIlIIl();
            llIIlIlIIl3.add(ping);
            iIIIIllIlI2.llIIlIlIIl(llIIlIlIIl3);
        }
        llIIlIlIIl(this.IlIllIlIIl.llIIlIlIIl());
    }

    public final void llIIlIlIIl(final com.microblink.blinkid.entities.recognizers.SignedPayload signedPayload, final com.microblink.blinkid.secured.IIlIIlIIIl iIlIIlIIIl) {
        this.IllIIIllII.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llllIIIIll$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.llllIIIIll.this.IlIllIlIIl(signedPayload, iIlIIlIIIl);
            }
        });
    }

    public final void llIIlIlIIl(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i = 0;
            while (i < arrayList.size()) {
                int i2 = i + 400;
                arrayList2.add(new com.microblink.blinkid.secured.lIllIIlIII(arrayList.subList(i, java.lang.Math.min(i2, arrayList.size()))));
                i = i2;
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.microblink.blinkid.secured.lIllIIlIII lilliiliii = (com.microblink.blinkid.secured.lIllIIlIII) it.next();
                if (this.llIIlIlIIl.llIIlIlIIl(lilliiliii).llIIlIlIIl == 201) {
                    com.microblink.blinkid.secured.IIIIIllIlI iIIIIllIlI = this.IlIllIlIIl;
                    java.util.List list = lilliiliii.llIIlIlIIl;
                    java.util.ArrayList llIIlIlIIl = iIIIIllIlI.llIIlIlIIl();
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        llIIlIlIIl.remove((com.microblink.blinkid.ping.Ping) it2.next());
                    }
                    iIIIIllIlI.llIIlIlIIl(llIIlIlIIl);
                }
            }
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.llllIIIIll.class, e, "Failed to send multi Ping!", e.getMessage());
        }
    }
}
