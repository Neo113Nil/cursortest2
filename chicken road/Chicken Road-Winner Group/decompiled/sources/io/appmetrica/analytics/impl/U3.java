package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import d2.C0274d;
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
    public HashMap f6705q;

    /* renamed from: r, reason: collision with root package name */
    public C0374an f6706r;

    /* renamed from: s, reason: collision with root package name */
    public Ym f6707s;

    /* renamed from: t, reason: collision with root package name */
    public Ym f6708t;

    /* renamed from: u, reason: collision with root package name */
    public C0535h3 f6709u;

    /* renamed from: v, reason: collision with root package name */
    public C0374an f6710v;

    public U3(PublicLogger publicLogger) {
        this.f6705q = new HashMap();
        a(publicLogger);
    }

    public static W5 b(String str, String str2) {
        W5 w5 = new W5("", 0);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = 5376;
        w5.a(str, str2);
        return w5;
    }

    public static W5 n() {
        W5 w5 = new W5("", 0);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = 5632;
        return w5;
    }

    public static W5 o() {
        W5 w5 = new W5("", 0);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = 40961;
        return w5;
    }

    public final void a(String str, String str2, T3 t3) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f6705q.remove(t3);
        } else {
            this.f6705q.put(t3, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f6705q.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Integer) it.next()).intValue();
        }
        this.f6780g = i3;
    }

    @Override // io.appmetrica.analytics.impl.W5
    public final void c(String str) {
        C0374an c0374an = this.f6710v;
        c0374an.getClass();
        this.f6781h = c0374an.a(str);
    }

    public final String d(String str) {
        C0374an c0374an = this.f6706r;
        c0374an.getClass();
        String a3 = c0374an.a(str);
        a(str, a3, T3.NAME);
        return a3;
    }

    public final String e(String str) {
        Ym ym = this.f6707s;
        ym.getClass();
        String a3 = ym.a(str);
        a(str, a3, T3.VALUE);
        return a3;
    }

    public final U3 f(String str) {
        Ym ym = this.f6708t;
        ym.getClass();
        String a3 = ym.a(str);
        a(str, a3, T3.VALUE);
        this.f6776b = a3;
        return this;
    }

    public final HashMap<T3, Integer> p() {
        return this.f6705q;
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f6775a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f6776b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public U3(String str, int i3, PublicLogger publicLogger) {
        this("", str, i3, publicLogger);
    }

    public U3(String str, String str2, int i3, PublicLogger publicLogger) {
        this(str, str2, i3, 0, publicLogger);
    }

    public U3(String str, String str2, int i3, int i4, PublicLogger publicLogger) {
        this.f6705q = new HashMap();
        a(publicLogger);
        this.f6776b = e(str);
        this.f6775a = d(str2);
        setType(i3);
        setCustomType(i4);
    }

    public final U3 a(HashMap<T3, Integer> hashMap) {
        this.f6705q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f6706r = new C0374an(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f6707s = new Ym(245760, "event value", publicLogger);
        this.f6708t = new Ym(1024000, "event extended value", publicLogger);
        this.f6709u = new C0535h3(245760, "event value bytes", publicLogger);
        this.f6710v = new C0374an(200, "user profile id", publicLogger);
    }

    public U3(byte[] bArr, String str, int i3, PublicLogger publicLogger) {
        this.f6705q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f6775a = d(str);
        setType(i3);
    }

    public final void a(byte[] bArr) {
        C0535h3 c0535h3 = this.f6709u;
        c0535h3.getClass();
        byte[] a3 = c0535h3.a(bArr);
        T3 t3 = T3.VALUE;
        if (bArr.length != a3.length) {
            this.f6705q.put(t3, Integer.valueOf(bArr.length - a3.length));
        } else {
            this.f6705q.remove(t3);
        }
        Iterator it = this.f6705q.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Integer) it.next()).intValue();
        }
        this.f6780g = i3;
        super.setValueBytes(a3);
    }

    public static W5 a(C0633ko c0633ko) {
        W5 o3 = o();
        o3.setValue(new String(Base64.encode(MessageNano.toByteArray(c0633ko), 0)));
        return o3;
    }

    public static U3 a(PublicLogger publicLogger, Ti ti) {
        int i3;
        U3 u3 = new U3(publicLogger);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        u3.f6778d = 40976;
        Ri ri = new Ri();
        ri.f6523b = ti.f6671a.currency.getCurrencyCode().getBytes();
        ri.f = ti.f6671a.priceMicros;
        ri.f6524c = StringUtils.stringToBytesForProtobuf(new C0374an(200, "revenue productID", ti.f6675e).a(ti.f6671a.productID));
        ri.f6522a = ((Integer) WrapUtils.getOrDefault(ti.f6671a.quantity, 1)).intValue();
        Ym ym = ti.f6672b;
        String str = ti.f6671a.payload;
        ym.getClass();
        ri.f6525d = StringUtils.stringToBytesForProtobuf(ym.a(str));
        if (AbstractC0711no.a(ti.f6671a.receipt)) {
            Mi mi = new Mi();
            String str2 = (String) ti.f6673c.a(ti.f6671a.receipt.data);
            i3 = !StringUtils.equalsNullSafety(ti.f6671a.receipt.data, str2) ? ti.f6671a.receipt.data.length() : 0;
            String str3 = (String) ti.f6674d.a(ti.f6671a.receipt.signature);
            mi.f6297a = StringUtils.stringToBytesForProtobuf(str2);
            mi.f6298b = StringUtils.stringToBytesForProtobuf(str3);
            ri.f6526e = mi;
        } else {
            i3 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(ri), Integer.valueOf(i3));
        u3.f6776b = u3.e(new String(Base64.encode((byte[]) pair.first, 0)));
        u3.f6780g = ((Integer) pair.second).intValue();
        return u3;
    }

    public static U3 a(PublicLogger publicLogger, E e3) {
        U3 u3 = new U3(publicLogger);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        u3.f6778d = 40977;
        C0274d a3 = e3.a();
        u3.f6776b = u3.e(new String(Base64.encode((byte[]) a3.f4845a, 0)));
        u3.f6780g = ((Integer) a3.f4846b).intValue();
        return u3;
    }
}
