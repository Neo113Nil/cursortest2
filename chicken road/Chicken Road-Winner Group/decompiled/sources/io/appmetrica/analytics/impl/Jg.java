package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Jg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Hn f6159a;

    /* renamed from: b, reason: collision with root package name */
    public final W f6160b;

    /* renamed from: c, reason: collision with root package name */
    public final C0719o6 f6161c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f6162d;

    /* renamed from: e, reason: collision with root package name */
    public final Me f6163e;
    public final Ne f;

    public Jg() {
        this(new Hn(), new W(new C1019zn()), new C0719o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0460e6 fromModel(Ig ig) {
        C0460e6 c0460e6 = new C0460e6();
        c0460e6.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(ig.f6106a, c0460e6.f));
        Sn sn = ig.f6107b;
        if (sn != null) {
            In in = sn.f6621a;
            if (in != null) {
                c0460e6.f7219a = this.f6159a.fromModel(in);
            }
            V v3 = sn.f6622b;
            if (v3 != null) {
                c0460e6.f7220b = this.f6160b.fromModel(v3);
            }
            List<Hl> list = sn.f6623c;
            if (list != null) {
                c0460e6.f7223e = this.f6162d.fromModel(list);
            }
            c0460e6.f7221c = (String) WrapUtils.getOrDefault(sn.f6626g, c0460e6.f7221c);
            c0460e6.f7222d = this.f6161c.a(sn.f6627h);
            if (!TextUtils.isEmpty(sn.f6624d)) {
                c0460e6.f7226i = this.f6163e.fromModel(sn.f6624d);
            }
            if (!TextUtils.isEmpty(sn.f6625e)) {
                c0460e6.f7227j = sn.f6625e.getBytes();
            }
            if (!AbstractC0711no.a(sn.f)) {
                c0460e6.f7228k = this.f.fromModel(sn.f);
            }
        }
        return c0460e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jg(Hn hn, W w3, C0719o6 c0719o6, Fl fl, Me me, Ne ne) {
        this.f6159a = hn;
        this.f6160b = w3;
        this.f6161c = c0719o6;
        this.f6162d = fl;
        this.f6163e = me;
        this.f = ne;
    }

    public final Ig a(C0460e6 c0460e6) {
        throw new UnsupportedOperationException();
    }
}
