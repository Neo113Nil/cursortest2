package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1019zn f6768a;

    public W(C1019zn c1019zn) {
        this.f6768a = c1019zn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(V v3) {
        Y5 y5 = new Y5();
        C0994yn c0994yn = v3.f6734a;
        if (c0994yn != null) {
            y5.f6850a = this.f6768a.fromModel(c0994yn);
        }
        y5.f6851b = new C0538h6[v3.f6735b.size()];
        Iterator it = v3.f6735b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            y5.f6851b[i3] = this.f6768a.fromModel((C0994yn) it.next());
            i3++;
        }
        String str = v3.f6736c;
        if (str != null) {
            y5.f6852c = str;
        }
        return y5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final V a(Y5 y5) {
        throw new UnsupportedOperationException();
    }
}
