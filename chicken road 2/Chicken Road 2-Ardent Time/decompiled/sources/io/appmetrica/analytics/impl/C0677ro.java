package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677ro implements io.appmetrica.analytics.impl.InterfaceC0703so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.util.List<io.appmetrica.analytics.impl.C0652qo> list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean z2 = true;
        for (io.appmetrica.analytics.impl.C0652qo c0652qo : list) {
            if (!c0652qo.f6701a) {
                linkedList.add(c0652qo.f6702b);
                z2 = false;
            }
        }
        return z2 ? new io.appmetrica.analytics.impl.C0652qo(this, true, "") : new io.appmetrica.analytics.impl.C0652qo(this, false, android.text.TextUtils.join(", ", linkedList));
    }
}
