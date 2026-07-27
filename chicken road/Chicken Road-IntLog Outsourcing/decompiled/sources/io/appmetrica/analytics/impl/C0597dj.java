package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597dj implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1134ye f8047a;

    /* renamed from: b, reason: collision with root package name */
    public final C0994t3 f8048b;

    /* renamed from: c, reason: collision with root package name */
    public final C1155za f8049c;

    /* renamed from: d, reason: collision with root package name */
    public final C1155za f8050d;

    public C0597dj() {
        this(new C1134ye(), new C0994t3(), new C1155za(100), new C1155za(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(C0700hj c0700hj) {
        Ii ii;
        C1077w8 c1077w8 = new C1077w8();
        On a6 = this.f8049c.a(c0700hj.f8327a);
        c1077w8.f9510a = StringUtils.getUTF8Bytes((String) a6.f7230a);
        List<String> list = c0700hj.f8328b;
        Ii ii2 = null;
        if (list != null) {
            ii = this.f8048b.fromModel(list);
            c1077w8.f9511b = (C0792l8) ii.f6960a;
        } else {
            ii = null;
        }
        On a7 = this.f8050d.a(c0700hj.f8329c);
        c1077w8.f9512c = StringUtils.getUTF8Bytes((String) a7.f7230a);
        Map<String, String> map = c0700hj.f8330d;
        if (map != null) {
            ii2 = this.f8047a.fromModel(map);
            c1077w8.f9513d = (C0947r8) ii2.f6960a;
        }
        return new Ii(c1077w8, new C0710i3(C0710i3.b(a6, ii, a7, ii2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0597dj(C1134ye c1134ye, C0994t3 c0994t3, C1155za c1155za, C1155za c1155za2) {
        this.f8047a = c1134ye;
        this.f8048b = c0994t3;
        this.f8049c = c1155za;
        this.f8050d = c1155za2;
    }

    public final C0700hj a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
