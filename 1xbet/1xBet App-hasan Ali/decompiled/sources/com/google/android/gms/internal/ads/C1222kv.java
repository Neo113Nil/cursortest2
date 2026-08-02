package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222kv extends Lv {

    /* renamed from: l, reason: collision with root package name */
    public Object f14303l;

    /* renamed from: m, reason: collision with root package name */
    public int f14304m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f14305n;

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f14306o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f14307p;

    public C1222kv() {
        super(0);
        this.f14304m = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f14304m;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i5 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i5 == 0) {
            return true;
        }
        if (i5 != 2) {
            this.f14304m = 4;
            switch (this.f14305n) {
                case 0:
                    do {
                        Iterator it = this.f14306o;
                        if (!it.hasNext()) {
                            this.f14304m = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((InterfaceC1446pu) this.f14307p).k(next));
                default:
                    do {
                        Iterator it2 = this.f14306o;
                        if (!it2.hasNext()) {
                            this.f14304m = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((AbstractC1177jv) this.f14307p).contains(next));
            }
            this.f14303l = next;
            if (this.f14304m != 3) {
                this.f14304m = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Lv, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14304m = 2;
        Object obj = this.f14303l;
        this.f14303l = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1222kv(AbstractC1177jv abstractC1177jv, AbstractC1177jv abstractC1177jv2) {
        this();
        this.f14305n = 1;
        this.f14307p = abstractC1177jv2;
        this.f14306o = abstractC1177jv.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1222kv(Iterator it, InterfaceC1446pu interfaceC1446pu) {
        this();
        this.f14305n = 0;
        this.f14306o = it;
        this.f14307p = interfaceC1446pu;
    }
}
