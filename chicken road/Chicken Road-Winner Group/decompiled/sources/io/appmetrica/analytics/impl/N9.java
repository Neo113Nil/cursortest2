package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class N9 {
    public static final H9 a(int i3, String str) {
        byte[] bArr;
        H9 h9 = new H9();
        h9.f6020a = i3;
        if (str == null || (bArr = str.getBytes(v2.a.f10417a)) == null) {
            bArr = h9.f6021b;
        }
        h9.f6021b = bArr;
        return h9;
    }
}
