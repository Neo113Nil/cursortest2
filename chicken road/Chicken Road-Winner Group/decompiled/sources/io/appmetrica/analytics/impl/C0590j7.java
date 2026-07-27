package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590j7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0830se f7605a;

    /* renamed from: b, reason: collision with root package name */
    public final C0797r7 f7606b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0590j7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0875u7 fromModel(C0642l7 c0642l7) {
        C0875u7 c0875u7 = new C0875u7();
        Integer num = c0642l7.f7738a;
        if (num != null) {
            c0875u7.f8393a = num.intValue();
        }
        String str = c0642l7.f7739b;
        if (str != null) {
            c0875u7.f8394b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0642l7.f7740c;
        if (str2 != null) {
            c0875u7.f8395c = StringUtils.correctIllFormedString(str2);
        }
        Long l3 = c0642l7.f7741d;
        if (l3 != null) {
            c0875u7.f8396d = l3.longValue();
        }
        C0772q7 c0772q7 = c0642l7.f7742e;
        if (c0772q7 != null) {
            c0875u7.f8397e = this.f7606b.fromModel(c0772q7);
        }
        String str3 = c0642l7.f;
        if (str3 != null) {
            c0875u7.f = str3;
        }
        String str4 = c0642l7.f7743g;
        if (str4 != null) {
            c0875u7.f8398g = str4;
        }
        Long l4 = c0642l7.f7744h;
        if (l4 != null) {
            c0875u7.f8399h = l4.longValue();
        }
        Integer num2 = c0642l7.f7745i;
        if (num2 != null) {
            c0875u7.f8400i = num2.intValue();
        }
        Integer num3 = c0642l7.f7746j;
        if (num3 != null) {
            c0875u7.f8401j = num3.intValue();
        }
        String str5 = c0642l7.f7747k;
        if (str5 != null) {
            c0875u7.f8402k = str5;
        }
        N8 n8 = c0642l7.f7748l;
        if (n8 != null) {
            c0875u7.f8403l = n8.f6319a;
        }
        String str6 = c0642l7.f7749m;
        if (str6 != null) {
            c0875u7.f8404m = str6;
        }
        EnumC0619ka enumC0619ka = c0642l7.f7750n;
        if (enumC0619ka != null) {
            c0875u7.f8405n = enumC0619ka.f7699a;
        }
        EnumC0851t9 enumC0851t9 = c0642l7.f7751o;
        if (enumC0851t9 != null) {
            c0875u7.f8406o = enumC0851t9.f8357a;
        }
        Boolean bool = c0642l7.f7752p;
        if (bool != null) {
            c0875u7.f8407p = this.f7605a.fromModel(bool).intValue();
        }
        Integer num4 = c0642l7.f7753q;
        if (num4 != null) {
            c0875u7.f8408q = num4.intValue();
        }
        byte[] bArr = c0642l7.f7754r;
        if (bArr != null) {
            c0875u7.f8409r = bArr;
        }
        return c0875u7;
    }

    public C0590j7(C0830se c0830se, C0797r7 c0797r7) {
        this.f7605a = c0830se;
        this.f7606b = c0797r7;
    }

    public /* synthetic */ C0590j7(C0830se c0830se, C0797r7 c0797r7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0830se() : c0830se, (i3 & 2) != 0 ? new C0797r7(null, 1, null) : c0797r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0642l7 toModel(C0875u7 c0875u7) {
        EnumC0851t9 enumC0851t9;
        C0875u7 c0875u72 = new C0875u7();
        int i3 = c0875u7.f8393a;
        Integer valueOf = i3 != c0875u72.f8393a ? Integer.valueOf(i3) : null;
        String str = c0875u7.f8394b;
        String str2 = !kotlin.jvm.internal.j.a(str, c0875u72.f8394b) ? str : null;
        String str3 = c0875u7.f8395c;
        String str4 = !kotlin.jvm.internal.j.a(str3, c0875u72.f8395c) ? str3 : null;
        long j3 = c0875u7.f8396d;
        Long valueOf2 = j3 != c0875u72.f8396d ? Long.valueOf(j3) : null;
        C0772q7 model = this.f7606b.toModel(c0875u7.f8397e);
        String str5 = c0875u7.f;
        String str6 = !kotlin.jvm.internal.j.a(str5, c0875u72.f) ? str5 : null;
        String str7 = c0875u7.f8398g;
        String str8 = !kotlin.jvm.internal.j.a(str7, c0875u72.f8398g) ? str7 : null;
        long j4 = c0875u7.f8399h;
        Long valueOf3 = Long.valueOf(j4);
        if (j4 == c0875u72.f8399h) {
            valueOf3 = null;
        }
        int i4 = c0875u7.f8400i;
        Integer valueOf4 = i4 != c0875u72.f8400i ? Integer.valueOf(i4) : null;
        int i5 = c0875u7.f8401j;
        Integer valueOf5 = i5 != c0875u72.f8401j ? Integer.valueOf(i5) : null;
        String str9 = c0875u7.f8402k;
        String str10 = !kotlin.jvm.internal.j.a(str9, c0875u72.f8402k) ? str9 : null;
        int i6 = c0875u7.f8403l;
        Integer valueOf6 = Integer.valueOf(i6);
        if (i6 == c0875u72.f8403l) {
            valueOf6 = null;
        }
        N8 a3 = valueOf6 != null ? N8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0875u7.f8404m;
        String str12 = !kotlin.jvm.internal.j.a(str11, c0875u72.f8404m) ? str11 : null;
        int i7 = c0875u7.f8405n;
        Integer valueOf7 = Integer.valueOf(i7);
        if (i7 == c0875u72.f8405n) {
            valueOf7 = null;
        }
        EnumC0619ka a4 = valueOf7 != null ? EnumC0619ka.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i8 = c0875u7.f8406o;
        Integer valueOf8 = Integer.valueOf(i8);
        if (i8 == c0875u72.f8406o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0851t9[] values = EnumC0851t9.values();
            int length = values.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    enumC0851t9 = values[i9];
                    EnumC0851t9[] enumC0851t9Arr = values;
                    if (enumC0851t9.f8357a == intValue) {
                        break;
                    }
                    i9++;
                    values = enumC0851t9Arr;
                } else {
                    enumC0851t9 = EnumC0851t9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0851t9 = null;
        }
        Boolean a5 = this.f7605a.a(c0875u7.f8407p);
        int i10 = c0875u7.f8408q;
        Integer valueOf9 = i10 != c0875u72.f8408q ? Integer.valueOf(i10) : null;
        byte[] bArr = c0875u7.f8409r;
        return new C0642l7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a3, str12, a4, enumC0851t9, a5, valueOf9, !Arrays.equals(bArr, c0875u72.f8409r) ? bArr : null);
    }
}
