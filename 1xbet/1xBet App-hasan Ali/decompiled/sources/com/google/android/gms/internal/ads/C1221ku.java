package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221ku implements InterfaceC1446pu {

    /* renamed from: k, reason: collision with root package name */
    public final char f14302k;

    public C1221ku(char c5) {
        this.f14302k = c5;
    }

    public final boolean a(char c5) {
        return c5 == this.f14302k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1446pu
    public final /* synthetic */ boolean k(Object obj) {
        return a(((Character) obj).charValue());
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f14302k;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return L1.a.n("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
