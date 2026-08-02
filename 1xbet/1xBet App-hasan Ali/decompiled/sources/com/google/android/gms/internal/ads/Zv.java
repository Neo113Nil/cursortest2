package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Zv {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12542a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i5 = 0; i5 < 26; i5++) {
            byte b3 = (byte) (i5 + 10);
            bArr[i5 + 65] = b3;
            bArr[i5 + 97] = b3;
        }
        f12542a = bArr;
    }
}
