package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806bg implements InterfaceC0699Uf {
    @Override // com.google.android.gms.internal.ads.InterfaceC0699Uf
    public final void a(HashMap hashMap) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.X9)).booleanValue() || hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        P2.o.f4767B.f4774g.d().e(Boolean.parseBoolean(str));
    }
}
