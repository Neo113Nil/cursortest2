package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import g4.AbstractC0464i;
import g4.AbstractC0465j;
import g4.AbstractC0467l;
import g4.C0471p;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.C1573b;
import y4.C1574c;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797ld implements Yj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1141yl f8728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8729b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f8730c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8731d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8732e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8733f;

    public C0797ld(InterfaceC1141yl interfaceC1141yl, String str, SystemTimeProvider systemTimeProvider, List<C0720id> list) {
        this.f8728a = interfaceC1141yl;
        this.f8729b = str;
        this.f8730c = systemTimeProvider;
        this.f8731d = list;
        this.f8732e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f8733f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Xj a() {
        List M5;
        Ad ad;
        C0720id c0720id;
        if (this.f8731d.isEmpty()) {
            return null;
        }
        List list = this.f8731d;
        C0771kd c0771kd = new C0771kd();
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.size() <= 1) {
            M5 = AbstractC0465j.S0(list);
        } else {
            Object[] array = list.toArray(new Object[0]);
            kotlin.jvm.internal.i.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, c0771kd);
            }
            M5 = AbstractC0464i.M(array);
        }
        String c2 = ((Fd) this.f8728a).c(this.f8732e, (String) null);
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(c2);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                C1574c s02 = K1.b.s0(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(AbstractC0467l.D0(s02, 10));
                Iterator it = s02.iterator();
                while (((C1573b) it).f12444c) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((C1573b) it).a());
                    try {
                        c0720id = new C0720id(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                    } catch (Throwable unused) {
                        c0720id = new C0720id("", false);
                    }
                    arrayList.add(c0720id);
                }
                ad = new Ad(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                ad = new Ad(C0471p.f5750a, 0L);
            }
        } else {
            ad = null;
        }
        long currentTimeMillis = this.f8730c.currentTimeMillis();
        if (ad != null && currentTimeMillis - ad.f6529b <= this.f8733f && M5.equals(ad.f6528a)) {
            return null;
        }
        Ad ad2 = new Ad(M5, currentTimeMillis);
        InterfaceC1141yl interfaceC1141yl = this.f8728a;
        Fd fd = (Fd) interfaceC1141yl;
        return new Xj(AbstractC0279e.h(new StringBuilder(), this.f8729b, "_status"), ad2.a());
    }

    public /* synthetic */ C0797ld(InterfaceC1141yl interfaceC1141yl, String str, SystemTimeProvider systemTimeProvider, List list, int i2, kotlin.jvm.internal.e eVar) {
        this(interfaceC1141yl, str, (i2 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
