package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes.dex */
public final class Tn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Hn f6681a;

    /* renamed from: b, reason: collision with root package name */
    public final W f6682b;

    /* renamed from: c, reason: collision with root package name */
    public final C0719o6 f6683c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f6684d;

    /* renamed from: e, reason: collision with root package name */
    public final Me f6685e;
    public final Ne f;

    public Tn() {
        this(new Hn(), new W(new C1019zn()), new C0719o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0409c6 fromModel(Sn sn) {
        C0409c6 c0409c6 = new C0409c6();
        In in = sn.f6621a;
        if (in != null) {
            c0409c6.f7090a = this.f6681a.fromModel(in);
        }
        V v3 = sn.f6622b;
        if (v3 != null) {
            c0409c6.f7091b = this.f6682b.fromModel(v3);
        }
        List<Hl> list = sn.f6623c;
        if (list != null) {
            c0409c6.f7094e = this.f6684d.fromModel(list);
        }
        String str = sn.f6626g;
        if (str != null) {
            c0409c6.f7092c = str;
        }
        c0409c6.f7093d = this.f6683c.a(sn.f6627h);
        if (!TextUtils.isEmpty(sn.f6624d)) {
            c0409c6.f7096h = this.f6685e.fromModel(sn.f6624d);
        }
        if (!TextUtils.isEmpty(sn.f6625e)) {
            c0409c6.f7097i = sn.f6625e.getBytes();
        }
        if (!AbstractC0711no.a(sn.f)) {
            c0409c6.f7098j = this.f.fromModel(sn.f);
        }
        return c0409c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Tn(Hn hn, W w3, C0719o6 c0719o6, Fl fl, Me me, Ne ne) {
        this.f6682b = w3;
        this.f6681a = hn;
        this.f6683c = c0719o6;
        this.f6684d = fl;
        this.f6685e = me;
        this.f = ne;
    }

    public final Sn a(C0409c6 c0409c6) {
        throw new UnsupportedOperationException();
    }
}
