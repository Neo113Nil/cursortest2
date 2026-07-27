package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797r7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0830se f8201a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0797r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0901v7 fromModel(C0772q7 c0772q7) {
        C0901v7 c0901v7 = new C0901v7();
        Boolean bool = c0772q7.f8120a;
        if (bool != null) {
            c0901v7.f8491a = this.f8201a.fromModel(bool).intValue();
        }
        Double d3 = c0772q7.f8122c;
        if (d3 != null) {
            c0901v7.f8493c = d3.doubleValue();
        }
        Double d4 = c0772q7.f8121b;
        if (d4 != null) {
            c0901v7.f8492b = d4.doubleValue();
        }
        Long l3 = c0772q7.f8126h;
        if (l3 != null) {
            c0901v7.f8497h = l3.longValue();
        }
        Integer num = c0772q7.f;
        if (num != null) {
            c0901v7.f = num.intValue();
        }
        Integer num2 = c0772q7.f8124e;
        if (num2 != null) {
            c0901v7.f8495e = num2.intValue();
        }
        Integer num3 = c0772q7.f8125g;
        if (num3 != null) {
            c0901v7.f8496g = num3.intValue();
        }
        Integer num4 = c0772q7.f8123d;
        if (num4 != null) {
            c0901v7.f8494d = num4.intValue();
        }
        String str = c0772q7.f8127i;
        if (str != null) {
            c0901v7.f8498i = str;
        }
        String str2 = c0772q7.f8128j;
        if (str2 != null) {
            c0901v7.f8499j = str2;
        }
        return c0901v7;
    }

    public C0797r7(C0830se c0830se) {
        this.f8201a = c0830se;
    }

    public /* synthetic */ C0797r7(C0830se c0830se, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0830se() : c0830se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0772q7 toModel(C0901v7 c0901v7) {
        if (c0901v7 == null) {
            return new C0772q7(null, null, null, null, null, null, null, null, null, null);
        }
        C0901v7 c0901v72 = new C0901v7();
        Boolean a3 = this.f8201a.a(c0901v7.f8491a);
        double d3 = c0901v7.f8493c;
        Double valueOf = Double.valueOf(d3);
        if (d3 == c0901v72.f8493c) {
            valueOf = null;
        }
        double d4 = c0901v7.f8492b;
        Double valueOf2 = !(d4 == c0901v72.f8492b) ? Double.valueOf(d4) : null;
        long j3 = c0901v7.f8497h;
        Long valueOf3 = j3 != c0901v72.f8497h ? Long.valueOf(j3) : null;
        int i3 = c0901v7.f;
        Integer valueOf4 = i3 != c0901v72.f ? Integer.valueOf(i3) : null;
        int i4 = c0901v7.f8495e;
        Integer valueOf5 = i4 != c0901v72.f8495e ? Integer.valueOf(i4) : null;
        int i5 = c0901v7.f8496g;
        Integer valueOf6 = i5 != c0901v72.f8496g ? Integer.valueOf(i5) : null;
        int i6 = c0901v7.f8494d;
        Integer valueOf7 = i6 != c0901v72.f8494d ? Integer.valueOf(i6) : null;
        String str = c0901v7.f8498i;
        String str2 = !kotlin.jvm.internal.j.a(str, c0901v72.f8498i) ? str : null;
        String str3 = c0901v7.f8499j;
        return new C0772q7(a3, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !kotlin.jvm.internal.j.a(str3, c0901v72.f8499j) ? str3 : null);
    }
}
