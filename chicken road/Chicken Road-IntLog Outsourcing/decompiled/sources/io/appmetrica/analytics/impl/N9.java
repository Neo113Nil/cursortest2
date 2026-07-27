package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class N9 {
    public static final H9 a(int i2, String str) {
        byte[] bArr;
        H9 h9 = new H9();
        h9.f6866a = i2;
        if (str == null || (bArr = str.getBytes(B4.a.f287a)) == null) {
            bArr = h9.f6867b;
        }
        h9.f6867b = bArr;
        return h9;
    }
}
