package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.װ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0589 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ConcurrentHashMap f1544 = new ConcurrentHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5537() {
        C0604 c0604 = (C0604) this.f1544.get(1);
        if (c0604 == null) {
            throw new IllegalArgumentException(StringFog.decrypt("/uqg3NB4lZ/CpevKzCqFlcXr5I/TZZHa2+D5j/xO2do=\n", "sIWAr7UK4/o=\n") + 1);
        }
        byte[] m5557 = c0604.m5557();
        byte[] bArr = new byte[m5557.length];
        System.arraycopy(m5557, 0, bArr, 0, m5557.length);
        return bArr;
    }
}
