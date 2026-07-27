package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Hn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fl f6896a;

    public Hn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0713i6 fromModel(In in) {
        C0713i6 c0713i6 = new C0713i6();
        c0713i6.f8388a = (String) WrapUtils.getOrDefault(in.f6977a, "");
        c0713i6.f8389b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(in.f6978b, ""));
        List<Hl> list = in.f6979c;
        if (list != null) {
            c0713i6.f8390c = this.f6896a.fromModel(list);
        }
        In in2 = in.f6980d;
        if (in2 != null) {
            c0713i6.f8391d = fromModel(in2);
        }
        List list2 = in.f6981e;
        int i2 = 0;
        if (list2 == null) {
            c0713i6.f8392e = new C0713i6[0];
        } else {
            c0713i6.f8392e = new C0713i6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c0713i6.f8392e[i2] = fromModel((In) it.next());
                i2++;
            }
        }
        return c0713i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hn(Fl fl) {
        this.f6896a = fl;
    }

    public final In a(C0713i6 c0713i6) {
        throw new UnsupportedOperationException();
    }
}
