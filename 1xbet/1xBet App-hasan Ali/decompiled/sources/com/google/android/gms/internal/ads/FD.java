package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FD extends BD {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8943b = 0;

    static {
        ED.a(Collections.EMPTY_MAP);
    }

    public static Dp a(int i) {
        return new Dp(i);
    }

    @Override // com.google.android.gms.internal.ads.ID
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map d() {
        Map map = this.f7795a;
        LinkedHashMap G5 = AbstractC0952et.G(map.size());
        for (Map.Entry entry : map.entrySet()) {
            G5.put(entry.getKey(), ((ID) entry.getValue()).d());
        }
        return Collections.unmodifiableMap(G5);
    }
}
