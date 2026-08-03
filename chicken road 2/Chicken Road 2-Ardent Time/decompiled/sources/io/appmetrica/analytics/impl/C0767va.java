package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767va extends io.appmetrica.analytics.impl.C2 {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f6965b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f6966c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0741ua f6967d;

    public C0767va(int i2, int i3, int i4) {
        this(i2, new io.appmetrica.analytics.impl.C0689sa(i3), new io.appmetrica.analytics.impl.C0689sa(i4));
    }

    public C0767va(int i2, io.appmetrica.analytics.impl.C0689sa c0689sa, io.appmetrica.analytics.impl.C0689sa c0689sa2) {
        super(i2);
        this.f6967d = new io.appmetrica.analytics.impl.C0741ua();
        this.f6965b = c0689sa;
        this.f6966c = c0689sa2;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0715ta
    public final io.appmetrica.analytics.impl.Mn a(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap;
        int i2;
        int i3 = 0;
        if (map != null) {
            hashMap = new java.util.HashMap();
            java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
            java.util.Map.Entry[] entryArr = (java.util.Map.Entry[]) entrySet.toArray(new java.util.Map.Entry[entrySet.size()]);
            java.util.Arrays.sort(entryArr, this.f6967d);
            int length = entryArr.length;
            i2 = 0;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            while (i3 < length) {
                java.util.Map.Entry entry = entryArr[i3];
                io.appmetrica.analytics.impl.Mn a2 = this.f6965b.a((java.lang.String) entry.getKey());
                io.appmetrica.analytics.impl.Mn a3 = this.f6966c.a((java.lang.String) entry.getValue());
                int utf8BytesLength = io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength((java.lang.String) entry.getValue()) + io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength((java.lang.String) entry.getKey());
                int utf8BytesLength2 = io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength((java.lang.String) a3.f4694a) + io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength((java.lang.String) a2.f4694a);
                if (z2 || utf8BytesLength2 + i5 > this.f4162a) {
                    i4++;
                    i2 += utf8BytesLength;
                    z2 = true;
                } else {
                    i2 = a3.f4695b.getBytesTruncated() + a2.f4695b.getBytesTruncated() + i2;
                    int utf8BytesLength3 = io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength((java.lang.String) a3.f4694a) + io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength((java.lang.String) a2.f4694a) + i5;
                    hashMap.put((java.lang.String) a2.f4694a, (java.lang.String) a3.f4694a);
                    i5 = utf8BytesLength3;
                }
                i3++;
            }
            i3 = i4;
        } else {
            hashMap = null;
            i2 = 0;
        }
        return new io.appmetrica.analytics.impl.Mn(hashMap, new io.appmetrica.analytics.impl.C0554n4(i3, i2));
    }
}
