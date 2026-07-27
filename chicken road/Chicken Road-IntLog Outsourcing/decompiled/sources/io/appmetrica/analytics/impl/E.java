package io.appmetrica.analytics.impl;

import f4.C0430g;
import g4.AbstractC0466k;
import g4.AbstractC0476u;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f6697a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6698b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0990t f6699c;

    /* renamed from: d, reason: collision with root package name */
    public final C0523an f6700d;

    /* renamed from: e, reason: collision with root package name */
    public final Ym f6701e;

    public E(AdRevenue adRevenue, boolean z, C0729in c0729in, PublicLogger publicLogger) {
        this.f6697a = adRevenue;
        this.f6698b = z;
        this.f6699c = c0729in;
        this.f6700d = new C0523an(100, "ad revenue strings", publicLogger);
        this.f6701e = new Ym(30720, "ad revenue payload", publicLogger);
    }

    public final C0430g a() {
        C0964s c0964s = new C0964s();
        int i2 = 0;
        for (C0430g c0430g : AbstractC0466k.A0(new C0430g(this.f6697a.adNetwork, new C1094x(c0964s)), new C0430g(this.f6697a.adPlacementId, new C1119y(c0964s)), new C0430g(this.f6697a.adPlacementName, new C1144z(c0964s)), new C0430g(this.f6697a.adUnitId, new A(c0964s)), new C0430g(this.f6697a.adUnitName, new B(c0964s)), new C0430g(this.f6697a.precision, new C(c0964s)), new C0430g(this.f6697a.currency.getCurrencyCode(), new D(c0964s)))) {
            String str = (String) c0430g.f5668a;
            InterfaceC1441l interfaceC1441l = (InterfaceC1441l) c0430g.f5669b;
            C0523an c0523an = this.f6700d;
            c0523an.getClass();
            String a6 = c0523an.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a6);
            interfaceC1441l.invoke(stringToBytesForProtobuf2);
            i2 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f6760a.get(this.f6697a.adType);
        c0964s.f9208d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f6697a.adRevenue;
        BigInteger bigInteger = F7.f6778a;
        int i3 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f6778a) <= 0 && unscaledValue.compareTo(F7.f6779b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i3++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i3);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f9122a = longValue;
        rVar.f9123b = intValue;
        c0964s.f9206b = rVar;
        Map<String, String> map = this.f6697a.payload;
        String b6 = AbstractC0847nb.b(this.f6699c.a(map != null ? AbstractC0476u.e0(map) : new LinkedHashMap()));
        Ym ym = this.f6701e;
        ym.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(ym.a(b6));
        c0964s.f9215k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b6).length - stringToBytesForProtobuf3.length) + i2;
        if (this.f6698b) {
            c0964s.f9205a = "autocollected".getBytes(B4.a.f287a);
        }
        return new C0430g(MessageNano.toByteArray(c0964s), Integer.valueOf(length));
    }
}
