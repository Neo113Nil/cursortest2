package io.appmetrica.analytics.impl;

import d2.C0274d;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700nd extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7934b;

    public C0700nd(C0459e5 c0459e5) {
        super(c0459e5);
        String b3 = c0459e5.b().b();
        b3 = b3 == null ? "empty" : b3;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b3}, 1));
        LinkedHashMap a3 = C0878ua.k().o().a(b3);
        ArrayList arrayList = new ArrayList(a3.size());
        for (Map.Entry entry : a3.entrySet()) {
            arrayList.add(new C0274d(entry.getValue(), new C0364ad(c0459e5, (String) entry.getKey())));
        }
        this.f7934b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        ArrayList arrayList;
        if (this.f6796a.f7211t.c() && ((arrayList = this.f7934b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0274d c0274d = (C0274d) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) c0274d.f4845a;
                C0364ad c0364ad = (C0364ad) c0274d.f4846b;
                if (moduleServiceEventHandler.handle(new C0442dd(c0364ad.f6963b, c0364ad.f6962a, new C0416cd(c0364ad.f6965d, c0364ad.f6964c, w5)), w5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
