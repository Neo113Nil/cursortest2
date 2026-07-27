package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795r5 implements InterfaceC0955x9 {

    /* renamed from: a, reason: collision with root package name */
    public final C9 f8196a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8197b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8198c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8199d;

    public C0795r5(C9 c9, List<? extends K8> list, List<? extends K8> list2, X4 x4) {
        this.f8196a = c9;
        this.f8197b = list;
        this.f8198c = list2;
        Objects.toString(x4);
        this.f8199d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f8198c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((K8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f8197b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((K8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f8199d.set(false);
    }

    public final void c() {
        this.f8199d.set(true);
    }

    public final void d() {
        if (this.f8199d.get()) {
            List list = this.f8198c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((K8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0736on) this.f8196a).c();
        }
    }

    public final void e() {
        if (this.f8199d.get() && a()) {
            ((C0736on) this.f8196a).c();
        }
    }

    public final void f() {
        if (this.f8199d.get() && a()) {
            ((C0736on) this.f8196a).b();
        }
    }
}
