package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448dj implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0985ye f7157a;

    /* renamed from: b, reason: collision with root package name */
    public final C0845t3 f7158b;

    /* renamed from: c, reason: collision with root package name */
    public final C1006za f7159c;

    /* renamed from: d, reason: collision with root package name */
    public final C1006za f7160d;

    public C0448dj() {
        this(new C0985ye(), new C0845t3(), new C1006za(100), new C1006za(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(C0551hj c0551hj) {
        Ii ii;
        C0928w8 c0928w8 = new C0928w8();
        On a3 = this.f7159c.a(c0551hj.f7424a);
        c0928w8.f8553a = StringUtils.getUTF8Bytes((String) a3.f6370a);
        List<String> list = c0551hj.f7425b;
        Ii ii2 = null;
        if (list != null) {
            ii = this.f7158b.fromModel(list);
            c0928w8.f8554b = (C0643l8) ii.f6110a;
        } else {
            ii = null;
        }
        On a4 = this.f7160d.a(c0551hj.f7426c);
        c0928w8.f8555c = StringUtils.getUTF8Bytes((String) a4.f6370a);
        Map<String, String> map = c0551hj.f7427d;
        if (map != null) {
            ii2 = this.f7157a.fromModel(map);
            c0928w8.f8556d = (C0798r8) ii2.f6110a;
        }
        return new Ii(c0928w8, new C0561i3(C0561i3.b(a3, ii, a4, ii2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0448dj(C0985ye c0985ye, C0845t3 c0845t3, C1006za c1006za, C1006za c1006za2) {
        this.f7157a = c0985ye;
        this.f7158b = c0845t3;
        this.f7159c = c1006za;
        this.f7160d = c1006za2;
    }

    public final C0551hj a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
