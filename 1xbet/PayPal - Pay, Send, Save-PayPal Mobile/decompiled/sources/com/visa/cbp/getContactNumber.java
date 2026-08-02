package com.visa.cbp;

/* loaded from: classes16.dex */
public final class getContactNumber implements com.visa.cbp.setContent {
    public byte[] BuildConfig;

    public getContactNumber(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private getContactNumber(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.BuildConfig = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }
}
