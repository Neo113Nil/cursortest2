package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class Base64UrlEncoder extends com.visa.cbp.external.common.Base64Encoder {
    public Base64UrlEncoder() {
        this.encodeTable[this.encodeTable.length - 2] = 45;
        this.encodeTable[this.encodeTable.length - 1] = com.visa.cbp.getEncExpo.addOnTrimMemoryListener;
        this.padding = (byte) 46;
        initialiseDecodeTable();
    }
}
