package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Ca extends K2 {

    /* renamed from: b, reason: collision with root package name */
    public final C1006za f5788b;

    /* renamed from: c, reason: collision with root package name */
    public final C1006za f5789c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba f5790d;

    public Ca(int i3, int i4, int i5) {
        this(i3, new C1006za(i4), new C1006za(i5));
    }

    public Ca(int i3, C1006za c1006za, C1006za c1006za2) {
        super(i3);
        this.f5790d = new Ba();
        this.f5788b = c1006za;
        this.f5789c = c1006za2;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(Map<String, String> map) {
        HashMap hashMap;
        int i3;
        int i4 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f5790d);
            int length = entryArr.length;
            i3 = 0;
            int i5 = 0;
            boolean z3 = false;
            int i6 = 0;
            while (i4 < length) {
                Map.Entry entry = entryArr[i4];
                On a3 = this.f5788b.a((String) entry.getKey());
                On a4 = this.f5789c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a4.f6370a) + StringUtils.getUtf8BytesLength((String) a3.f6370a);
                if (z3 || utf8BytesLength2 + i6 > this.f6175a) {
                    i5++;
                    i3 += utf8BytesLength;
                    z3 = true;
                } else {
                    i3 = a4.f6371b.getBytesTruncated() + a3.f6371b.getBytesTruncated() + i3;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a4.f6370a) + StringUtils.getUtf8BytesLength((String) a3.f6370a) + i6;
                    hashMap.put((String) a3.f6370a, (String) a4.f6370a);
                    i6 = utf8BytesLength3;
                }
                i4++;
            }
            i4 = i5;
        } else {
            hashMap = null;
            i3 = 0;
        }
        return new On(hashMap, new C0872u4(i4, i3));
    }
}
