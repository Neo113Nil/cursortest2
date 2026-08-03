package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class G9 {
    public static final io.appmetrica.analytics.impl.A9 a(int i2, java.lang.String str) {
        byte[] bArr;
        io.appmetrica.analytics.impl.A9 a9 = new io.appmetrica.analytics.impl.A9();
        a9.f4043a = i2;
        if (str == null || (bArr = str.getBytes(y1.a.f8486a)) == null) {
            bArr = a9.f4044b;
        }
        a9.f4044b = bArr;
        return a9;
    }
}
