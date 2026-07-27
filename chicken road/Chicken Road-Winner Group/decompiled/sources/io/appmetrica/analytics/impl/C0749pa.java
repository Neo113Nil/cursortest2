package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749pa implements U9 {

    /* renamed from: a, reason: collision with root package name */
    public final O8 f8065a = new O8();

    public final C0592j9[] a(byte[] bArr) {
        int i3 = 0;
        if (bArr == null) {
            return new C0592j9[0];
        }
        Map<String, byte[]> model = this.f8065a.toModel(bArr);
        C0592j9[] c0592j9Arr = new C0592j9[model.size()];
        for (Object obj : model.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0293h.T();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0592j9 c0592j9 = new C0592j9();
            c0592j9.f7610a = ((String) entry.getKey()).getBytes(v2.a.f10417a);
            c0592j9.f7611b = (byte[]) entry.getValue();
            c0592j9Arr[i3] = c0592j9;
            i3 = i4;
        }
        return c0592j9Arr;
    }
}
