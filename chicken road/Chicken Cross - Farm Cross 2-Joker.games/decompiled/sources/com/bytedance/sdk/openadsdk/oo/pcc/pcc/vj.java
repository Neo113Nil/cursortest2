package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public final class vj {
    private static final byte[] pcc = {105, -42, 73, -118, 67, -35, 89, -76, 122, -9, 45, 88, 34, 76, 10, 55};
    private static byte[] sf = null;

    public static byte[] pcc() {
        if (sf == null) {
            byte[] bArr = new byte[pcc.length];
            int i = 0;
            while (true) {
                byte[] bArr2 = pcc;
                if (i >= bArr2.length) {
                    break;
                }
                bArr[i] = (byte) (bArr2[i] ^ Ascii.DC4);
                i++;
            }
            sf = bArr;
        }
        return sf;
    }
}
