package io.appmetrica.analytics.impl;

import d2.C0274d;
import e2.AbstractC0293h;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f5859a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5860b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0841t f5861c;

    /* renamed from: d, reason: collision with root package name */
    public final C0374an f5862d;

    /* renamed from: e, reason: collision with root package name */
    public final Ym f5863e;

    public E(AdRevenue adRevenue, boolean z3, C0580in c0580in, PublicLogger publicLogger) {
        this.f5859a = adRevenue;
        this.f5860b = z3;
        this.f5861c = c0580in;
        this.f5862d = new C0374an(100, "ad revenue strings", publicLogger);
        this.f5863e = new Ym(30720, "ad revenue payload", publicLogger);
    }

    public final C0274d a() {
        C0815s c0815s = new C0815s();
        int i3 = 0;
        for (C0274d c0274d : AbstractC0293h.S(new C0274d(this.f5859a.adNetwork, new C0945x(c0815s)), new C0274d(this.f5859a.adPlacementId, new C0970y(c0815s)), new C0274d(this.f5859a.adPlacementName, new C0995z(c0815s)), new C0274d(this.f5859a.adUnitId, new A(c0815s)), new C0274d(this.f5859a.adUnitName, new B(c0815s)), new C0274d(this.f5859a.precision, new C(c0815s)), new C0274d(this.f5859a.currency.getCurrencyCode(), new D(c0815s)))) {
            String str = (String) c0274d.f4845a;
            o2.l lVar = (o2.l) c0274d.f4846b;
            C0374an c0374an = this.f5862d;
            c0374an.getClass();
            String a3 = c0374an.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a3);
            lVar.invoke(stringToBytesForProtobuf2);
            i3 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f5919a.get(this.f5859a.adType);
        c0815s.f8264d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f5859a.adRevenue;
        BigInteger bigInteger = F7.f5935a;
        int i4 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f5935a) <= 0 && unscaledValue.compareTo(F7.f5936b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i4++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i4);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f8179a = longValue;
        rVar.f8180b = intValue;
        c0815s.f8262b = rVar;
        Map<String, String> map = this.f5859a.payload;
        String b3 = AbstractC0698nb.b(this.f5861c.a(map != null ? e2.r.q0(map) : new LinkedHashMap()));
        Ym ym = this.f5863e;
        ym.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(ym.a(b3));
        c0815s.f8270k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b3).length - stringToBytesForProtobuf3.length) + i3;
        if (this.f5860b) {
            c0815s.f8261a = "autocollected".getBytes(v2.a.f10417a);
        }
        return new C0274d(MessageNano.toByteArray(c0815s), Integer.valueOf(length));
    }
}
