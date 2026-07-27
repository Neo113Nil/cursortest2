package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624kf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0935wf f7701a;

    /* renamed from: b, reason: collision with root package name */
    public final C0495ff f7702b;

    public C0624kf() {
        this(new C0935wf(), new C0495ff());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0831sf fromModel(Cif cif) {
        C0831sf c0831sf = new C0831sf();
        c0831sf.f8306a = this.f7701a.fromModel(cif.f7544a);
        c0831sf.f8307b = new C0805rf[cif.f7545b.size()];
        Iterator<C0547hf> it = cif.f7545b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            c0831sf.f8307b[i3] = this.f7702b.fromModel(it.next());
            i3++;
        }
        return c0831sf;
    }

    public C0624kf(C0935wf c0935wf, C0495ff c0495ff) {
        this.f7701a = c0935wf;
        this.f7702b = c0495ff;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cif toModel(C0831sf c0831sf) {
        C0909vf model;
        ArrayList arrayList = new ArrayList(c0831sf.f8307b.length);
        for (C0805rf c0805rf : c0831sf.f8307b) {
            arrayList.add(this.f7702b.toModel(c0805rf));
        }
        C0780qf c0780qf = c0831sf.f8306a;
        if (c0780qf == null) {
            model = this.f7701a.toModel(new C0780qf());
        } else {
            model = this.f7701a.toModel(c0780qf);
        }
        return new Cif(model, arrayList);
    }
}
