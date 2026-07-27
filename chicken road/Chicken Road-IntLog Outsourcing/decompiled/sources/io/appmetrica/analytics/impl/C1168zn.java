package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168zn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fl f9677a;

    public C1168zn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0687h6 fromModel(C1143yn c1143yn) {
        C0687h6 c0687h6 = new C0687h6();
        Integer num = c1143yn.f9609e;
        c0687h6.f8310e = num == null ? -1 : num.intValue();
        c0687h6.f8309d = c1143yn.f9608d;
        c0687h6.f8307b = c1143yn.f9606b;
        c0687h6.f8306a = c1143yn.f9605a;
        c0687h6.f8308c = c1143yn.f9607c;
        Fl fl = this.f9677a;
        List list = c1143yn.f9610f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Hl((StackTraceElement) it.next()));
        }
        c0687h6.f8311f = fl.fromModel(arrayList);
        return c0687h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1168zn(Fl fl) {
        this.f9677a = fl;
    }

    public final C1143yn a(C0687h6 c0687h6) {
        throw new UnsupportedOperationException();
    }
}
