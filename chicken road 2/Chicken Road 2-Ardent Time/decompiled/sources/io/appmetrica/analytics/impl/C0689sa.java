package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689sa extends io.appmetrica.analytics.impl.C2 {
    public C0689sa(int i2) {
        super(i2);
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0715ta
    public final io.appmetrica.analytics.impl.Mn a(java.lang.String str) {
        int i2 = 0;
        if (str != null) {
            int length = str.length();
            int i3 = this.f4162a;
            if (length > i3) {
                java.lang.String substring = str.substring(0, i3);
                i2 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new io.appmetrica.analytics.impl.Mn(str, new io.appmetrica.analytics.impl.C0217a3(i2));
    }
}
