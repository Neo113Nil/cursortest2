package com.amplitude.core.utilities;

/* loaded from: classes3.dex */
public final class a {
    public static int a(com.google.zxing.qrcode.encoder.b bVar, boolean z) {
        int i = bVar.b;
        int i2 = bVar.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = bVar.a;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public void b(com.amplitude.eventbridge.e eVar, com.amplitude.eventbridge.a aVar) {
        throw null;
    }
}
