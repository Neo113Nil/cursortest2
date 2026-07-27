package io.appmetrica.analytics.impl;

import f4.C0430g;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841n5 implements Do {

    /* renamed from: a, reason: collision with root package name */
    public final List f8836a;

    public C0841n5(List<? extends C0430g> list) {
        this.f8836a = list;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        Iterator it = this.f8836a.iterator();
        while (it.hasNext()) {
            String a6 = ((Do) ((C0430g) it.next()).f5669b).a();
            if (a6 != null && a6.length() > 0) {
                return a6;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        Iterator it = this.f8836a.iterator();
        while (it.hasNext()) {
            ((Do) ((C0430g) it.next()).f5669b).a(str);
        }
    }
}
