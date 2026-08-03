package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453j7 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0512le f6163a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0453j7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0557n7 fromModel(io.appmetrica.analytics.impl.C0428i7 c0428i7) {
        io.appmetrica.analytics.impl.C0557n7 c0557n7 = new io.appmetrica.analytics.impl.C0557n7();
        java.lang.Boolean bool = c0428i7.f6075a;
        if (bool != null) {
            c0557n7.f6464a = this.f6163a.fromModel(bool).intValue();
        }
        java.lang.Double d2 = c0428i7.f6077c;
        if (d2 != null) {
            c0557n7.f6466c = d2.doubleValue();
        }
        java.lang.Double d3 = c0428i7.f6076b;
        if (d3 != null) {
            c0557n7.f6465b = d3.doubleValue();
        }
        java.lang.Long l2 = c0428i7.f6082h;
        if (l2 != null) {
            c0557n7.f6471h = l2.longValue();
        }
        java.lang.Integer num = c0428i7.f6080f;
        if (num != null) {
            c0557n7.f6469f = num.intValue();
        }
        java.lang.Integer num2 = c0428i7.f6079e;
        if (num2 != null) {
            c0557n7.f6468e = num2.intValue();
        }
        java.lang.Integer num3 = c0428i7.f6081g;
        if (num3 != null) {
            c0557n7.f6470g = num3.intValue();
        }
        java.lang.Integer num4 = c0428i7.f6078d;
        if (num4 != null) {
            c0557n7.f6467d = num4.intValue();
        }
        java.lang.String str = c0428i7.f6083i;
        if (str != null) {
            c0557n7.f6472i = str;
        }
        java.lang.String str2 = c0428i7.f6084j;
        if (str2 != null) {
            c0557n7.f6473j = str2;
        }
        return c0557n7;
    }

    public C0453j7(io.appmetrica.analytics.impl.C0512le c0512le) {
        this.f6163a = c0512le;
    }

    public /* synthetic */ C0453j7(io.appmetrica.analytics.impl.C0512le c0512le, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.impl.C0512le() : c0512le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0428i7 toModel(io.appmetrica.analytics.impl.C0557n7 c0557n7) {
        if (c0557n7 == null) {
            return new io.appmetrica.analytics.impl.C0428i7(null, null, null, null, null, null, null, null, null, null);
        }
        io.appmetrica.analytics.impl.C0557n7 c0557n72 = new io.appmetrica.analytics.impl.C0557n7();
        java.lang.Boolean a2 = this.f6163a.a(c0557n7.f6464a);
        double d2 = c0557n7.f6466c;
        java.lang.Double valueOf = !((d2 > c0557n72.f6466c ? 1 : (d2 == c0557n72.f6466c ? 0 : -1)) == 0) ? java.lang.Double.valueOf(d2) : null;
        double d3 = c0557n7.f6465b;
        java.lang.Double valueOf2 = !(d3 == c0557n72.f6465b) ? java.lang.Double.valueOf(d3) : null;
        long j2 = c0557n7.f6471h;
        java.lang.Long valueOf3 = j2 != c0557n72.f6471h ? java.lang.Long.valueOf(j2) : null;
        int i2 = c0557n7.f6469f;
        java.lang.Integer valueOf4 = i2 != c0557n72.f6469f ? java.lang.Integer.valueOf(i2) : null;
        int i3 = c0557n7.f6468e;
        java.lang.Integer valueOf5 = i3 != c0557n72.f6468e ? java.lang.Integer.valueOf(i3) : null;
        int i4 = c0557n7.f6470g;
        java.lang.Integer valueOf6 = i4 != c0557n72.f6470g ? java.lang.Integer.valueOf(i4) : null;
        int i5 = c0557n7.f6467d;
        java.lang.Integer valueOf7 = i5 != c0557n72.f6467d ? java.lang.Integer.valueOf(i5) : null;
        java.lang.String str = c0557n7.f6472i;
        java.lang.String str2 = !kotlin.jvm.internal.i.a(str, c0557n72.f6472i) ? str : null;
        java.lang.String str3 = c0557n7.f6473j;
        return new io.appmetrica.analytics.impl.C0428i7(a2, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !kotlin.jvm.internal.i.a(str3, c0557n72.f6473j) ? str3 : null);
    }
}
