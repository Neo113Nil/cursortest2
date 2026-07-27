package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import f4.C0430g;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U3 extends W5 {

    /* renamed from: q, reason: collision with root package name */
    public HashMap f7578q;

    /* renamed from: r, reason: collision with root package name */
    public C0523an f7579r;

    /* renamed from: s, reason: collision with root package name */
    public Ym f7580s;

    /* renamed from: t, reason: collision with root package name */
    public Ym f7581t;

    /* renamed from: u, reason: collision with root package name */
    public C0684h3 f7582u;

    /* renamed from: v, reason: collision with root package name */
    public C0523an f7583v;

    public U3(PublicLogger publicLogger) {
        this.f7578q = new HashMap();
        a(publicLogger);
    }

    public static W5 b(String str, String str2) {
        W5 w5 = new W5("", 0);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = 5376;
        w5.a(str, str2);
        return w5;
    }

    public static W5 n() {
        W5 w5 = new W5("", 0);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = 5632;
        return w5;
    }

    public static W5 o() {
        W5 w5 = new W5("", 0);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = 40961;
        return w5;
    }

    public final void a(String str, String str2, T3 t32) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f7578q.remove(t32);
        } else {
            this.f7578q.put(t32, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f7578q.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Integer) it.next()).intValue();
        }
        this.f7654g = i2;
    }

    @Override // io.appmetrica.analytics.impl.W5
    public final void c(String str) {
        C0523an c0523an = this.f7583v;
        c0523an.getClass();
        this.f7655h = c0523an.a(str);
    }

    public final String d(String str) {
        C0523an c0523an = this.f7579r;
        c0523an.getClass();
        String a6 = c0523an.a(str);
        a(str, a6, T3.NAME);
        return a6;
    }

    public final String e(String str) {
        Ym ym = this.f7580s;
        ym.getClass();
        String a6 = ym.a(str);
        a(str, a6, T3.VALUE);
        return a6;
    }

    public final U3 f(String str) {
        Ym ym = this.f7581t;
        ym.getClass();
        String a6 = ym.a(str);
        a(str, a6, T3.VALUE);
        this.f7649b = a6;
        return this;
    }

    public final HashMap<T3, Integer> p() {
        return this.f7578q;
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f7648a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f7649b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public U3(String str, int i2, PublicLogger publicLogger) {
        this("", str, i2, publicLogger);
    }

    public U3(String str, String str2, int i2, PublicLogger publicLogger) {
        this(str, str2, i2, 0, publicLogger);
    }

    public U3(String str, String str2, int i2, int i3, PublicLogger publicLogger) {
        this.f7578q = new HashMap();
        a(publicLogger);
        this.f7649b = e(str);
        this.f7648a = d(str2);
        setType(i2);
        setCustomType(i3);
    }

    public final U3 a(HashMap<T3, Integer> hashMap) {
        this.f7578q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f7579r = new C0523an(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f7580s = new Ym(245760, "event value", publicLogger);
        this.f7581t = new Ym(1024000, "event extended value", publicLogger);
        this.f7582u = new C0684h3(245760, "event value bytes", publicLogger);
        this.f7583v = new C0523an(200, "user profile id", publicLogger);
    }

    public U3(byte[] bArr, String str, int i2, PublicLogger publicLogger) {
        this.f7578q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f7648a = d(str);
        setType(i2);
    }

    public final void a(byte[] bArr) {
        C0684h3 c0684h3 = this.f7582u;
        c0684h3.getClass();
        byte[] a6 = c0684h3.a(bArr);
        T3 t32 = T3.VALUE;
        if (bArr.length != a6.length) {
            this.f7578q.put(t32, Integer.valueOf(bArr.length - a6.length));
        } else {
            this.f7578q.remove(t32);
        }
        Iterator it = this.f7578q.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Integer) it.next()).intValue();
        }
        this.f7654g = i2;
        super.setValueBytes(a6);
    }

    public static W5 a(C0782ko c0782ko) {
        W5 o2 = o();
        o2.setValue(new String(Base64.encode(MessageNano.toByteArray(c0782ko), 0)));
        return o2;
    }

    public static U3 a(PublicLogger publicLogger, Ti ti) {
        int i2;
        U3 u32 = new U3(publicLogger);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        u32.f7651d = 40976;
        Ri ri = new Ri();
        ri.f7387b = ti.f7543a.currency.getCurrencyCode().getBytes();
        ri.f7391f = ti.f7543a.priceMicros;
        ri.f7388c = StringUtils.stringToBytesForProtobuf(new C0523an(200, "revenue productID", ti.f7547e).a(ti.f7543a.productID));
        ri.f7386a = ((Integer) WrapUtils.getOrDefault(ti.f7543a.quantity, 1)).intValue();
        Ym ym = ti.f7544b;
        String str = ti.f7543a.payload;
        ym.getClass();
        ri.f7389d = StringUtils.stringToBytesForProtobuf(ym.a(str));
        if (AbstractC0860no.a(ti.f7543a.receipt)) {
            Mi mi = new Mi();
            String str2 = (String) ti.f7545c.a(ti.f7543a.receipt.data);
            i2 = !StringUtils.equalsNullSafety(ti.f7543a.receipt.data, str2) ? ti.f7543a.receipt.data.length() : 0;
            String str3 = (String) ti.f7546d.a(ti.f7543a.receipt.signature);
            mi.f7154a = StringUtils.stringToBytesForProtobuf(str2);
            mi.f7155b = StringUtils.stringToBytesForProtobuf(str3);
            ri.f7390e = mi;
        } else {
            i2 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(ri), Integer.valueOf(i2));
        u32.f7649b = u32.e(new String(Base64.encode((byte[]) pair.first, 0)));
        u32.f7654g = ((Integer) pair.second).intValue();
        return u32;
    }

    public static U3 a(PublicLogger publicLogger, E e3) {
        U3 u32 = new U3(publicLogger);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        u32.f7651d = 40977;
        C0430g a6 = e3.a();
        u32.f7649b = u32.e(new String(Base64.encode((byte[]) a6.f5668a, 0)));
        u32.f7654g = ((Integer) a6.f5669b).intValue();
        return u32;
    }
}
