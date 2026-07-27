package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Mb {

    /* renamed from: a, reason: collision with root package name */
    public final W2 f6281a;

    /* renamed from: b, reason: collision with root package name */
    public final C0741p2 f6282b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6283c;

    public Mb(W2 w22, C0741p2 c0741p2) {
        ArrayList arrayList = new ArrayList();
        this.f6283c = arrayList;
        this.f6281a = w22;
        arrayList.add(w22);
        this.f6282b = c0741p2;
        arrayList.add(c0741p2);
    }

    public final synchronized void a() {
        Iterator it = this.f6283c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0759pk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C0852ta c0852ta) {
        this.f6283c.add(c0852ta);
    }
}
