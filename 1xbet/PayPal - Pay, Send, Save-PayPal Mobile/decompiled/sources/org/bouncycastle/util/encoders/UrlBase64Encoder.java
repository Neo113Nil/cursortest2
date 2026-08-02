package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class UrlBase64Encoder extends org.bouncycastle.util.encoders.Base64Encoder {
    public UrlBase64Encoder() {
        this.encodingTable[this.encodingTable.length - 2] = 45;
        this.encodingTable[this.encodingTable.length - 1] = com.visa.cbp.getEncExpo.addOnTrimMemoryListener;
        this.padding = (byte) 46;
        initialiseDecodingTable();
    }
}
