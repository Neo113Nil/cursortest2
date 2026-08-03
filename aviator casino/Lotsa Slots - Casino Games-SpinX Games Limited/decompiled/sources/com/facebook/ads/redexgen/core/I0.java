package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class I0 {
    public final java.io.ByteArrayOutputStream A00 = new java.io.ByteArrayOutputStream(512);
    public final java.io.DataOutputStream A01 = new java.io.DataOutputStream(this.A00);

    public static void A00(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] A01(com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage eventMessage) {
        this.A00.reset();
        try {
            A00(this.A01, eventMessage.A03);
            A00(this.A01, eventMessage.A04 != null ? eventMessage.A04 : "");
            this.A01.writeLong(eventMessage.A01);
            this.A01.writeLong(eventMessage.A02);
            this.A01.write(eventMessage.A05);
            this.A01.flush();
            return this.A00.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
