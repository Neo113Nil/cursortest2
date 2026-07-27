package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Lf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0985ye f6232a;

    /* renamed from: b, reason: collision with root package name */
    public final Cf f6233b;

    /* renamed from: c, reason: collision with root package name */
    public final C0845t3 f6234c;

    /* renamed from: d, reason: collision with root package name */
    public final Nf f6235d;

    /* renamed from: e, reason: collision with root package name */
    public final C1006za f6236e;
    public final C1006za f;

    public Lf() {
        this(new C0985ye(), new Cf(), new C0845t3(), new Nf(), new C1006za(100), new C1006za(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Mf mf) {
        Ii ii;
        Ii ii2;
        Ii ii3;
        Ii ii4;
        C0850t8 c0850t8 = new C0850t8();
        On a3 = this.f6236e.a(mf.f6287a);
        c0850t8.f8347a = StringUtils.getUTF8Bytes((String) a3.f6370a);
        On a4 = this.f.a(mf.f6288b);
        c0850t8.f8348b = StringUtils.getUTF8Bytes((String) a4.f6370a);
        List<String> list = mf.f6289c;
        Ii ii5 = null;
        if (list != null) {
            ii = this.f6234c.fromModel(list);
            c0850t8.f8349c = (C0643l8) ii.f6110a;
        } else {
            ii = null;
        }
        Map<String, String> map = mf.f6290d;
        if (map != null) {
            ii2 = this.f6232a.fromModel(map);
            c0850t8.f8350d = (C0798r8) ii2.f6110a;
        } else {
            ii2 = null;
        }
        Ef ef = mf.f6291e;
        if (ef != null) {
            ii3 = this.f6233b.fromModel(ef);
            c0850t8.f8351e = (C0824s8) ii3.f6110a;
        } else {
            ii3 = null;
        }
        Ef ef2 = mf.f;
        if (ef2 != null) {
            ii4 = this.f6233b.fromModel(ef2);
            c0850t8.f = (C0824s8) ii4.f6110a;
        } else {
            ii4 = null;
        }
        List<String> list2 = mf.f6292g;
        if (list2 != null) {
            ii5 = this.f6235d.fromModel(list2);
            c0850t8.f8352g = (C0876u8[]) ii5.f6110a;
        }
        return new Ii(c0850t8, new C0561i3(C0561i3.b(a3, a4, ii, ii2, ii3, ii4, ii5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lf(C0985ye c0985ye, Cf cf, C0845t3 c0845t3, Nf nf, C1006za c1006za, C1006za c1006za2) {
        this.f6232a = c0985ye;
        this.f6233b = cf;
        this.f6234c = c0845t3;
        this.f6235d = nf;
        this.f6236e = c1006za;
        this.f = c1006za2;
    }

    public final Mf a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
