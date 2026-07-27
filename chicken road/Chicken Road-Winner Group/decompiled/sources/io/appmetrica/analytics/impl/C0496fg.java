package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496fg implements InterfaceC0393bg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0599jg f7292a;

    public C0496fg(C0599jg c0599jg) {
        this.f7292a = c0599jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0393bg
    public final void a() {
        C0599jg c0599jg = this.f7292a;
        ArrayList arrayList = c0599jg.f7629g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0832sg c0832sg = (C0832sg) next;
            c0599jg.f7626c.getClass();
            String str = c0832sg != null ? c0832sg.f8308a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 != null) {
                arrayList3.add(next2);
            }
        }
        c0599jg.a(c0599jg.f7626c.a(arrayList3));
    }
}
