package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0187f1 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0190g1 f2751a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0190g1 f2752b;

    public AbstractC0187f1(AbstractC0190g1 abstractC0190g1) {
        this.f2751a = abstractC0190g1;
        if (abstractC0190g1.c()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2752b = (AbstractC0190g1) abstractC0190g1.d(4);
    }

    public static void a(int i3, List list) {
        String i4 = B0.c.i(list.size() - i3, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i3) {
                throw new NullPointerException(i4);
            }
            list.remove(size);
        }
    }

    public final AbstractC0190g1 b() {
        AbstractC0190g1 c3 = c();
        if (AbstractC0190g1.m(c3, true)) {
            return c3;
        }
        throw new G1();
    }

    public final AbstractC0190g1 c() {
        if (!this.f2752b.c()) {
            return this.f2752b;
        }
        AbstractC0190g1 abstractC0190g1 = this.f2752b;
        abstractC0190g1.getClass();
        A1.f2595c.a(abstractC0190g1.getClass()).a(abstractC0190g1);
        abstractC0190g1.j();
        return this.f2752b;
    }

    public final Object clone() {
        AbstractC0187f1 abstractC0187f1 = (AbstractC0187f1) this.f2751a.d(5);
        abstractC0187f1.f2752b = c();
        return abstractC0187f1;
    }

    public final void d() {
        if (this.f2752b.c()) {
            return;
        }
        AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) this.f2751a.d(4);
        A1.f2595c.a(abstractC0190g1.getClass()).d(abstractC0190g1, this.f2752b);
        this.f2752b = abstractC0190g1;
    }
}
