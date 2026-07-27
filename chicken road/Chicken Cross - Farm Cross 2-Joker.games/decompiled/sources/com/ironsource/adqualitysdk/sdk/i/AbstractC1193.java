package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC1193 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Charset f3387 = Charset.forName(StringFog.decrypt("L06ONz8=\n", "ehrIGgcgSQI=\n"));

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m5919(byte[] bArr, C1199 c1199, C0630 c0630) {
        if (bArr.length < 29) {
            throw new IllegalArgumentException(AbstractC1257.m5940("SOi1cyam\n", "aIrMB0PVm4Q=\n", new StringBuilder().append(StringFog.decrypt("Sc0VZecmoJQ73Al6qDu7nmncXDU=\n", "G6hmFYhI0/E=\n")).append(bArr.length)));
        }
        int i = (bArr[0] & 255) + 1;
        if (i > bArr.length) {
            throw new IllegalArgumentException(StringFog.decrypt("xgsXHq7dvsi0GhYbr9Cs2fEKRA+1k6PC+g0B\n", "lG5kbsGzza0=\n"));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, bArr.length);
        if (copyOfRange2.length < 16) {
            throw new IllegalArgumentException(StringFog.decrypt("Dtmheu3fKvV8yKB/7NI45DnY8mv2kTr5LNS3ePbUIeQ=\n", "XLzSCoKxWZA=\n"));
        }
        c0630.getClass();
        byte[] bArr2 = C0630.f1724;
        byte[] bArr3 = new byte[bArr2.length + 3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        bArr3[bArr2.length] = (byte) 0;
        bArr3[bArr2.length + 1] = (byte) 1;
        bArr3[bArr2.length + 2] = (byte) 2;
        return c0630.m5595(c0630.m5594(c1199.f3397, copyOfRange, bArr3), copyOfRange, copyOfRange2, c1199.f3398.getBytes(f3387));
    }
}
