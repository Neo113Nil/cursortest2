package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006za extends K2 {
    public C1006za(int i3) {
        super(i3);
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(String str) {
        int i3 = 0;
        if (str != null) {
            int length = str.length();
            int i4 = this.f6175a;
            if (length > i4) {
                String substring = str.substring(0, i4);
                i3 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new On(str, new C0561i3(i3));
    }
}
