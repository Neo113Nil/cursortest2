package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985ye implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ca f8639a;

    public C0985ye() {
        this(new Ca(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Map<String, String> map) {
        On a3 = this.f8639a.a(map);
        C0798r8 c0798r8 = new C0798r8();
        c0798r8.f8204b = ((C0872u4) a3.f6371b).f8386b;
        Map map2 = (Map) a3.f6370a;
        if (map2 != null) {
            c0798r8.f8203a = new C0773q8[map2.size()];
            int i3 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0798r8.f8203a[i3] = new C0773q8();
                c0798r8.f8203a[i3].f8130a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0798r8.f8203a[i3].f8131b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i3++;
            }
        }
        InterfaceC0586j3 interfaceC0586j3 = a3.f6371b;
        int i4 = ((C0872u4) interfaceC0586j3).f7472a;
        return new Ii(c0798r8, interfaceC0586j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0985ye(Ca ca) {
        this.f8639a = ca;
    }

    public final Map<String, String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
