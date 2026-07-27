package io.appmetrica.analytics.impl;

import d2.C0274d;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692n5 implements Do {

    /* renamed from: a, reason: collision with root package name */
    public final List f7908a;

    public C0692n5(List<? extends C0274d> list) {
        this.f7908a = list;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        Iterator it = this.f7908a.iterator();
        while (it.hasNext()) {
            String a3 = ((Do) ((C0274d) it.next()).f4846b).a();
            if (a3 != null && a3.length() > 0) {
                return a3;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        Iterator it = this.f7908a.iterator();
        while (it.hasNext()) {
            ((Do) ((C0274d) it.next()).f4846b).a(str);
        }
    }
}
