package io.appmetrica.analytics.impl;

import g4.AbstractC0466k;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898pa implements U9 {

    /* renamed from: a, reason: collision with root package name */
    public final O8 f9001a = new O8();

    public final C0741j9[] a(byte[] bArr) {
        int i2 = 0;
        if (bArr == null) {
            return new C0741j9[0];
        }
        Map<String, byte[]> model = this.f9001a.toModel(bArr);
        C0741j9[] c0741j9Arr = new C0741j9[model.size()];
        for (Object obj : model.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0741j9 c0741j9 = new C0741j9();
            c0741j9.f8525a = ((String) entry.getKey()).getBytes(B4.a.f287a);
            c0741j9.f8526b = (byte[]) entry.getValue();
            c0741j9Arr[i2] = c0741j9;
            i2 = i3;
        }
        return c0741j9Arr;
    }
}
