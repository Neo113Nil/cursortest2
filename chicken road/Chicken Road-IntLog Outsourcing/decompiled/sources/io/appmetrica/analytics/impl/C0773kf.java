package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773kf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1084wf f8620a;

    /* renamed from: b, reason: collision with root package name */
    public final C0644ff f8621b;

    public C0773kf() {
        this(new C1084wf(), new C0644ff());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0980sf fromModel(Cif cif) {
        C0980sf c0980sf = new C0980sf();
        c0980sf.f9254a = this.f8620a.fromModel(cif.f8455a);
        c0980sf.f9255b = new C0954rf[cif.f8456b.size()];
        Iterator<C0696hf> it = cif.f8456b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c0980sf.f9255b[i2] = this.f8621b.fromModel(it.next());
            i2++;
        }
        return c0980sf;
    }

    public C0773kf(C1084wf c1084wf, C0644ff c0644ff) {
        this.f8620a = c1084wf;
        this.f8621b = c0644ff;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cif toModel(C0980sf c0980sf) {
        C1058vf model;
        ArrayList arrayList = new ArrayList(c0980sf.f9255b.length);
        for (C0954rf c0954rf : c0980sf.f9255b) {
            arrayList.add(this.f8621b.toModel(c0954rf));
        }
        C0929qf c0929qf = c0980sf.f9254a;
        if (c0929qf == null) {
            model = this.f8620a.toModel(new C0929qf());
        } else {
            model = this.f8620a.toModel(c0929qf);
        }
        return new Cif(model, arrayList);
    }
}
