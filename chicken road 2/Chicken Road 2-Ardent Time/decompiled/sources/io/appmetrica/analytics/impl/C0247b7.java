package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247b7 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0512le f5521a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0453j7 f5522b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0247b7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0531m7 fromModel(io.appmetrica.analytics.impl.C0299d7 c0299d7) {
        io.appmetrica.analytics.impl.C0531m7 c0531m7 = new io.appmetrica.analytics.impl.C0531m7();
        java.lang.Integer num = c0299d7.f5697a;
        if (num != null) {
            c0531m7.f6394a = num.intValue();
        }
        java.lang.String str = c0299d7.f5698b;
        if (str != null) {
            c0531m7.f6395b = io.appmetrica.analytics.coreutils.internal.StringUtils.correctIllFormedString(str);
        }
        java.lang.String str2 = c0299d7.f5699c;
        if (str2 != null) {
            c0531m7.f6396c = io.appmetrica.analytics.coreutils.internal.StringUtils.correctIllFormedString(str2);
        }
        java.lang.Long l2 = c0299d7.f5700d;
        if (l2 != null) {
            c0531m7.f6397d = l2.longValue();
        }
        io.appmetrica.analytics.impl.C0428i7 c0428i7 = c0299d7.f5701e;
        if (c0428i7 != null) {
            c0531m7.f6398e = this.f5522b.fromModel(c0428i7);
        }
        java.lang.String str3 = c0299d7.f5702f;
        if (str3 != null) {
            c0531m7.f6399f = str3;
        }
        java.lang.String str4 = c0299d7.f5703g;
        if (str4 != null) {
            c0531m7.f6400g = str4;
        }
        java.lang.Long l3 = c0299d7.f5704h;
        if (l3 != null) {
            c0531m7.f6401h = l3.longValue();
        }
        java.lang.Integer num2 = c0299d7.f5705i;
        if (num2 != null) {
            c0531m7.f6402i = num2.intValue();
        }
        java.lang.Integer num3 = c0299d7.f5706j;
        if (num3 != null) {
            c0531m7.f6403j = num3.intValue();
        }
        java.lang.String str5 = c0299d7.f5707k;
        if (str5 != null) {
            c0531m7.f6404k = str5;
        }
        io.appmetrica.analytics.impl.I8 i8 = c0299d7.f5708l;
        if (i8 != null) {
            c0531m7.f6405l = i8.f4448a;
        }
        java.lang.String str6 = c0299d7.f5709m;
        if (str6 != null) {
            c0531m7.f6406m = str6;
        }
        io.appmetrica.analytics.impl.EnumC0302da enumC0302da = c0299d7.f5710n;
        if (enumC0302da != null) {
            c0531m7.f6407n = enumC0302da.f5724a;
        }
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9 = c0299d7.f5711o;
        if (enumC0533m9 != null) {
            c0531m7.f6408o = enumC0533m9.f6419a;
        }
        java.lang.Boolean bool = c0299d7.f5712p;
        if (bool != null) {
            c0531m7.f6409p = this.f5521a.fromModel(bool).intValue();
        }
        java.lang.Integer num4 = c0299d7.f5713q;
        if (num4 != null) {
            c0531m7.f6410q = num4.intValue();
        }
        byte[] bArr = c0299d7.f5714r;
        if (bArr != null) {
            c0531m7.f6411r = bArr;
        }
        return c0531m7;
    }

    public C0247b7(io.appmetrica.analytics.impl.C0512le c0512le, io.appmetrica.analytics.impl.C0453j7 c0453j7) {
        this.f5521a = c0512le;
        this.f5522b = c0453j7;
    }

    public /* synthetic */ C0247b7(io.appmetrica.analytics.impl.C0512le c0512le, io.appmetrica.analytics.impl.C0453j7 c0453j7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.impl.C0512le() : c0512le, (i2 & 2) != 0 ? new io.appmetrica.analytics.impl.C0453j7(null, 1, null) : c0453j7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0299d7 toModel(io.appmetrica.analytics.impl.C0531m7 c0531m7) {
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9;
        io.appmetrica.analytics.impl.C0531m7 c0531m72 = new io.appmetrica.analytics.impl.C0531m7();
        int i2 = c0531m7.f6394a;
        java.lang.Integer valueOf = i2 != c0531m72.f6394a ? java.lang.Integer.valueOf(i2) : null;
        java.lang.String str = c0531m7.f6395b;
        java.lang.String str2 = !kotlin.jvm.internal.i.a(str, c0531m72.f6395b) ? str : null;
        java.lang.String str3 = c0531m7.f6396c;
        java.lang.String str4 = !kotlin.jvm.internal.i.a(str3, c0531m72.f6396c) ? str3 : null;
        long j2 = c0531m7.f6397d;
        java.lang.Long valueOf2 = j2 != c0531m72.f6397d ? java.lang.Long.valueOf(j2) : null;
        io.appmetrica.analytics.impl.C0428i7 model = this.f5522b.toModel(c0531m7.f6398e);
        java.lang.String str5 = c0531m7.f6399f;
        java.lang.String str6 = !kotlin.jvm.internal.i.a(str5, c0531m72.f6399f) ? str5 : null;
        java.lang.String str7 = c0531m7.f6400g;
        java.lang.String str8 = !kotlin.jvm.internal.i.a(str7, c0531m72.f6400g) ? str7 : null;
        long j3 = c0531m7.f6401h;
        java.lang.Long valueOf3 = java.lang.Long.valueOf(j3);
        if (j3 == c0531m72.f6401h) {
            valueOf3 = null;
        }
        int i3 = c0531m7.f6402i;
        java.lang.Integer valueOf4 = i3 != c0531m72.f6402i ? java.lang.Integer.valueOf(i3) : null;
        int i4 = c0531m7.f6403j;
        java.lang.Integer valueOf5 = i4 != c0531m72.f6403j ? java.lang.Integer.valueOf(i4) : null;
        java.lang.String str9 = c0531m7.f6404k;
        java.lang.String str10 = !kotlin.jvm.internal.i.a(str9, c0531m72.f6404k) ? str9 : null;
        int i5 = c0531m7.f6405l;
        java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i5);
        if (i5 == c0531m72.f6405l) {
            valueOf6 = null;
        }
        io.appmetrica.analytics.impl.I8 a2 = valueOf6 != null ? io.appmetrica.analytics.impl.I8.a(java.lang.Integer.valueOf(valueOf6.intValue())) : null;
        java.lang.String str11 = c0531m7.f6406m;
        java.lang.String str12 = !kotlin.jvm.internal.i.a(str11, c0531m72.f6406m) ? str11 : null;
        int i6 = c0531m7.f6407n;
        java.lang.Integer valueOf7 = java.lang.Integer.valueOf(i6);
        if (i6 == c0531m72.f6407n) {
            valueOf7 = null;
        }
        io.appmetrica.analytics.impl.EnumC0302da a3 = valueOf7 != null ? io.appmetrica.analytics.impl.EnumC0302da.a(java.lang.Integer.valueOf(valueOf7.intValue())) : null;
        int i7 = c0531m7.f6408o;
        java.lang.Integer valueOf8 = java.lang.Integer.valueOf(i7);
        if (i7 == c0531m72.f6408o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            io.appmetrica.analytics.impl.EnumC0533m9[] values = io.appmetrica.analytics.impl.EnumC0533m9.values();
            int length = values.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m92 = values[i8];
                    io.appmetrica.analytics.impl.EnumC0533m9[] enumC0533m9Arr = values;
                    if (enumC0533m92.f6419a == intValue) {
                        enumC0533m9 = enumC0533m92;
                        break;
                    }
                    i8++;
                    values = enumC0533m9Arr;
                } else {
                    enumC0533m9 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0533m9 = null;
        }
        java.lang.Boolean a4 = this.f5521a.a(c0531m7.f6409p);
        int i9 = c0531m7.f6410q;
        java.lang.Integer valueOf9 = i9 != c0531m72.f6410q ? java.lang.Integer.valueOf(i9) : null;
        byte[] bArr = c0531m7.f6411r;
        return new io.appmetrica.analytics.impl.C0299d7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a2, str12, a3, enumC0533m9, a4, valueOf9, !java.util.Arrays.equals(bArr, c0531m72.f6411r) ? bArr : null);
    }
}
