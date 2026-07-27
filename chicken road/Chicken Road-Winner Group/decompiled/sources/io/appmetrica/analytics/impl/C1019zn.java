package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019zn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fl f8714a;

    public C1019zn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0538h6 fromModel(C0994yn c0994yn) {
        C0538h6 c0538h6 = new C0538h6();
        Integer num = c0994yn.f8650e;
        c0538h6.f7408e = num == null ? -1 : num.intValue();
        c0538h6.f7407d = c0994yn.f8649d;
        c0538h6.f7405b = c0994yn.f8647b;
        c0538h6.f7404a = c0994yn.f8646a;
        c0538h6.f7406c = c0994yn.f8648c;
        Fl fl = this.f8714a;
        List list = c0994yn.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Hl((StackTraceElement) it.next()));
        }
        c0538h6.f = fl.fromModel(arrayList);
        return c0538h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1019zn(Fl fl) {
        this.f8714a = fl;
    }

    public final C0994yn a(C0538h6 c0538h6) {
        throw new UnsupportedOperationException();
    }
}
