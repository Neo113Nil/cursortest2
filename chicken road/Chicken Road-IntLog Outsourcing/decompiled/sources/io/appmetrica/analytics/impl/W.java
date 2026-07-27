package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1168zn f7641a;

    public W(C1168zn c1168zn) {
        this.f7641a = c1168zn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(V v4) {
        Y5 y5 = new Y5();
        C1143yn c1143yn = v4.f7607a;
        if (c1143yn != null) {
            y5.f7726a = this.f7641a.fromModel(c1143yn);
        }
        y5.f7727b = new C0687h6[v4.f7608b.size()];
        Iterator it = v4.f7608b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            y5.f7727b[i2] = this.f7641a.fromModel((C1143yn) it.next());
            i2++;
        }
        String str = v4.f7609c;
        if (str != null) {
            y5.f7728c = str;
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
