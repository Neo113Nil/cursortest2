package io.appmetrica.analytics.impl;

import f4.C0430g;
import g4.AbstractC0476u;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ld implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Kd f7083a = new Kd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7084b = AbstractC0476u.Y(new C0430g(NativeCrashSource.UNKNOWN, 0), new C0430g(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0558c6 fromModel(Rd rd) {
        C0558c6 c0558c6 = new C0558c6();
        c0558c6.f7982f = 1;
        C0532b6 c0532b6 = new C0532b6();
        c0532b6.f7913a = rd.f7369a;
        C0635f6 c0635f6 = new C0635f6();
        Integer num = (Integer) f7084b.get(rd.f7370b.f7214a);
        if (num != null) {
            c0635f6.f8169a = num.intValue();
        }
        String str = rd.f7370b.f7215b;
        if (str == null) {
            str = "";
        }
        c0635f6.f8170b = str;
        c0532b6.f7914b = c0635f6;
        c0558c6.f7983g = c0532b6;
        return c0558c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Rd a(C0558c6 c0558c6) {
        throw new UnsupportedOperationException();
    }
}
