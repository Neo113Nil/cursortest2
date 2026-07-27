package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Hn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fl f6048a;

    public Hn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0564i6 fromModel(In in) {
        C0564i6 c0564i6 = new C0564i6();
        c0564i6.f7480a = (String) WrapUtils.getOrDefault(in.f6126a, "");
        c0564i6.f7481b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(in.f6127b, ""));
        List<Hl> list = in.f6128c;
        if (list != null) {
            c0564i6.f7482c = this.f6048a.fromModel(list);
        }
        In in2 = in.f6129d;
        if (in2 != null) {
            c0564i6.f7483d = fromModel(in2);
        }
        List list2 = in.f6130e;
        int i3 = 0;
        if (list2 == null) {
            c0564i6.f7484e = new C0564i6[0];
            return c0564i6;
        }
        c0564i6.f7484e = new C0564i6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0564i6.f7484e[i3] = fromModel((In) it.next());
            i3++;
        }
        return c0564i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hn(Fl fl) {
        this.f6048a = fl;
    }

    public final In a(C0564i6 c0564i6) {
        throw new UnsupportedOperationException();
    }
}
