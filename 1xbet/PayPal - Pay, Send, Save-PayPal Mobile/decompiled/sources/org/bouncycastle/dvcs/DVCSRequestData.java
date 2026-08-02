package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public abstract class DVCSRequestData {
    protected org.bouncycastle.asn1.dvcs.Data data;

    public org.bouncycastle.asn1.dvcs.Data toASN1Structure() {
        return this.data;
    }

    protected DVCSRequestData(org.bouncycastle.asn1.dvcs.Data data) {
        this.data = data;
    }
}
