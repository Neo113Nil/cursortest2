package io.appmetrica.analytics.impl;

import a.AbstractC0086a;
import e2.AbstractC0292g;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648ld implements Yj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0992yl f7805a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7806b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f7807c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7808d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7809e;
    public final long f;

    public C0648ld(InterfaceC0992yl interfaceC0992yl, String str, SystemTimeProvider systemTimeProvider, List<C0571id> list) {
        this.f7805a = interfaceC0992yl;
        this.f7806b = str;
        this.f7807c = systemTimeProvider;
        this.f7808d = list;
        this.f7809e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Xj a() {
        List asList;
        Ad ad;
        C0571id c0571id;
        if (!this.f7808d.isEmpty()) {
            List list = this.f7808d;
            C0622kd c0622kd = new C0622kd();
            kotlin.jvm.internal.j.e(list, "<this>");
            if (list.size() <= 1) {
                asList = AbstractC0292g.f0(list);
            } else {
                Object[] array = list.toArray(new Object[0]);
                kotlin.jvm.internal.j.e(array, "<this>");
                if (array.length > 1) {
                    Arrays.sort(array, c0622kd);
                }
                asList = Arrays.asList(array);
                kotlin.jvm.internal.j.d(asList, "asList(...)");
            }
            String c3 = ((Fd) this.f7805a).c(this.f7809e, (String) null);
            if (c3 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c3);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    s2.c c02 = AbstractC0086a.c0(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(AbstractC0294i.U(c02));
                    Iterator it = c02.iterator();
                    while (((s2.b) it).f10348c) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(((s2.b) it).a());
                        try {
                            c0571id = new C0571id(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                        } catch (Throwable unused) {
                            c0571id = new C0571id("", false);
                        }
                        arrayList.add(c0571id);
                    }
                    ad = new Ad(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    ad = new Ad(e2.o.f4877a, 0L);
                }
            } else {
                ad = null;
            }
            long currentTimeMillis = this.f7807c.currentTimeMillis();
            if (ad == null || currentTimeMillis - ad.f5698b > this.f || !asList.equals(ad.f5697a)) {
                Ad ad2 = new Ad(asList, currentTimeMillis);
                InterfaceC0992yl interfaceC0992yl = this.f7805a;
                Fd fd = (Fd) interfaceC0992yl;
                return new Xj(B0.c.l(new StringBuilder(), this.f7806b, "_status"), ad2.a());
            }
        }
        return null;
    }

    public /* synthetic */ C0648ld(InterfaceC0992yl interfaceC0992yl, String str, SystemTimeProvider systemTimeProvider, List list, int i3, kotlin.jvm.internal.f fVar) {
        this(interfaceC0992yl, str, (i3 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
