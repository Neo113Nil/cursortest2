package com.bytedance.sdk.component.sf.pcc;

/* loaded from: classes4.dex */
public class hc {
    public vy gm;
    public String oo;
    public byte[] vj;
    public pcc wh;

    public enum pcc {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public hc() {
    }

    public hc(vy vyVar, String str, pcc pccVar) {
        this.gm = vyVar;
        this.oo = str;
        this.wh = pccVar;
    }

    public hc(vy vyVar, byte[] bArr, pcc pccVar) {
        this.gm = vyVar;
        this.vj = bArr;
        this.wh = pccVar;
    }

    public static hc pcc(vy vyVar, String str) {
        return new hc(vyVar, str, pcc.STRING_TYPE);
    }

    public static hc pcc(vy vyVar, byte[] bArr) {
        return new hc(vyVar, bArr, pcc.BYTE_ARRAY_TYPE);
    }
}
