package io.appmetrica.analytics.impl;

import android.content.Context;
import d2.C0274d;
import e2.AbstractC0293h;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final Ib f5821a = new Ib(C0587j4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Jb f5822b = new Jb();

    /* renamed from: c, reason: collision with root package name */
    public final Lb f5823c = new Lb();

    public final void a(String str, String str2, String str3) {
        Ib ib = this.f5821a;
        if (ib.f6095c.a((Void) null).f8320a && ib.f6096d.a(str).f8320a && ib.f6097e.a(str2).f8320a && ib.f.a(str3).f8320a) {
            this.f5822b.getClass();
            ((G9) C0587j4.l().f7572c.a()).f5983b.post(new Lo(this, str, str2, str3, 0));
            return;
        }
        PublicLogger.Companion.getAnonymousInstance().warning(B0.c.j("[AppMetricaLibraryAdapterProxy]", "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new Object[0]);
    }

    public static final void a(D0 d02, String str, String str2, String str3) {
        List list;
        Context a3;
        Lb lb = d02.f5823c;
        lb.getClass();
        if (str == null) {
            str = "null";
        }
        C0274d c0274d = new C0274d("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        C0274d c0274d2 = new C0274d("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        C0274d[] c0274dArr = {c0274d, c0274d2, new C0274d("payload", str3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2.s.j0(3));
        e2.r.n0(linkedHashMap, c0274dArr);
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (lb) {
            try {
                if (lb.f6224a == null && (a3 = C0587j4.l().f7575g.a()) != null) {
                    lb.f6224a = AbstractC0293h.S(new Wd(), new C0580in(a3), new Ko());
                }
                list = lb.f6224a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0841t) it.next()).a(linkedHashMap);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(linkedHashMap).build());
    }
}
