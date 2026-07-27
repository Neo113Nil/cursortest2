package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Fl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Gl f5952a = new Gl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0512g6[] fromModel(List<Hl> list) {
        C0512g6[] c0512g6Arr = new C0512g6[list.size()];
        Iterator<Hl> it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            c0512g6Arr[i3] = this.f5952a.fromModel(it.next());
            i3++;
        }
        return c0512g6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Hl> a(C0512g6[] c0512g6Arr) {
        throw new UnsupportedOperationException();
    }
}
