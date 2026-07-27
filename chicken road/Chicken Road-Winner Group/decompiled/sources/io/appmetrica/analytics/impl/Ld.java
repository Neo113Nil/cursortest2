package io.appmetrica.analytics.impl;

import d2.C0274d;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ld implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Kd f6227a = new Kd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f6228b = e2.r.m0(new C0274d(NativeCrashSource.UNKNOWN, 0), new C0274d(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0409c6 fromModel(Rd rd) {
        C0409c6 c0409c6 = new C0409c6();
        c0409c6.f = 1;
        C0383b6 c0383b6 = new C0383b6();
        c0383b6.f7029a = rd.f6505a;
        C0486f6 c0486f6 = new C0486f6();
        Integer num = (Integer) f6228b.get(rd.f6506b.f6355a);
        if (num != null) {
            c0486f6.f7274a = num.intValue();
        }
        String str = rd.f6506b.f6356b;
        if (str == null) {
            str = "";
        }
        c0486f6.f7275b = str;
        c0383b6.f7030b = c0486f6;
        c0409c6.f7095g = c0383b6;
        return c0409c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Rd a(C0409c6 c0409c6) {
        throw new UnsupportedOperationException();
    }
}
