package com.fyber.inneractive.sdk.tcf;

import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5924a = new byte[0];
    public int b;

    public final void a(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("TC string cannot be empty");
        }
        IAlog.a("%s decoding: %s", "GppTcfBitReader", str);
        this.b = 0;
        byte[] decode = Base64.decode(str, 9);
        this.f5924a = decode;
        if (decode.length == 0) {
            throw new IllegalArgumentException("Invalid TC string");
        }
    }

    public final int a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (a()) {
                i2 |= 1 << ((i - 1) - i3);
            }
        }
        return i2;
    }

    public final boolean a() {
        String str;
        int i;
        byte[] bArr = this.f5924a;
        if (bArr != null && bArr.length != 0 && (i = this.b) < bArr.length * 8) {
            int i2 = i / 8;
            if (i2 >= bArr.length) {
                IAlog.a("%s readBit failed: byteIdx >= mBytes.length", "GppTcfBitReader");
                return false;
            }
            boolean z = (bArr[i2] & (1 << (7 - (i % 8)))) != 0;
            this.b = i + 1;
            return z;
        }
        if (bArr == null) {
            str = "mBytes == null";
        } else {
            str = bArr.length == 0 ? "mBytes.length == 0" : "mCursor >= mBytes.length * BITS_PER_BYTE";
        }
        IAlog.a("%s readBit failed: %s", "GppTcfBitReader", str);
        return false;
    }
}
