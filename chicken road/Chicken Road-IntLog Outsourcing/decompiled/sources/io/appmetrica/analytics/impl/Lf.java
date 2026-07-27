package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Lf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1134ye f7088a;

    /* renamed from: b, reason: collision with root package name */
    public final Cf f7089b;

    /* renamed from: c, reason: collision with root package name */
    public final C0994t3 f7090c;

    /* renamed from: d, reason: collision with root package name */
    public final Nf f7091d;

    /* renamed from: e, reason: collision with root package name */
    public final C1155za f7092e;

    /* renamed from: f, reason: collision with root package name */
    public final C1155za f7093f;

    public Lf() {
        this(new C1134ye(), new Cf(), new C0994t3(), new Nf(), new C1155za(100), new C1155za(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Mf mf) {
        Ii ii;
        Ii ii2;
        Ii ii3;
        Ii ii4;
        C0999t8 c0999t8 = new C0999t8();
        On a6 = this.f7092e.a(mf.f7143a);
        c0999t8.f9296a = StringUtils.getUTF8Bytes((String) a6.f7230a);
        On a7 = this.f7093f.a(mf.f7144b);
        c0999t8.f9297b = StringUtils.getUTF8Bytes((String) a7.f7230a);
        List<String> list = mf.f7145c;
        Ii ii5 = null;
        if (list != null) {
            ii = this.f7090c.fromModel(list);
            c0999t8.f9298c = (C0792l8) ii.f6960a;
        } else {
            ii = null;
        }
        Map<String, String> map = mf.f7146d;
        if (map != null) {
            ii2 = this.f7088a.fromModel(map);
            c0999t8.f9299d = (C0947r8) ii2.f6960a;
        } else {
            ii2 = null;
        }
        Ef ef = mf.f7147e;
        if (ef != null) {
            ii3 = this.f7089b.fromModel(ef);
            c0999t8.f9300e = (C0973s8) ii3.f6960a;
        } else {
            ii3 = null;
        }
        Ef ef2 = mf.f7148f;
        if (ef2 != null) {
            ii4 = this.f7089b.fromModel(ef2);
            c0999t8.f9301f = (C0973s8) ii4.f6960a;
        } else {
            ii4 = null;
        }
        List<String> list2 = mf.f7149g;
        if (list2 != null) {
            ii5 = this.f7091d.fromModel(list2);
            c0999t8.f9302g = (C1025u8[]) ii5.f6960a;
        }
        return new Ii(c0999t8, new C0710i3(C0710i3.b(a6, a7, ii, ii2, ii3, ii4, ii5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lf(C1134ye c1134ye, Cf cf, C0994t3 c0994t3, Nf nf, C1155za c1155za, C1155za c1155za2) {
        this.f7088a = c1134ye;
        this.f7089b = cf;
        this.f7090c = c0994t3;
        this.f7091d = nf;
        this.f7092e = c1155za;
        this.f7093f = c1155za2;
    }

    public final Mf a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
