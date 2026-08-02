package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132iv extends AbstractC0776av {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f14017d;

    /* renamed from: e, reason: collision with root package name */
    public int f14018e;

    @Override // com.google.android.gms.internal.ads.AbstractC0776av
    public final /* bridge */ /* synthetic */ AbstractC0776av b(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f14017d != null) {
            int j5 = AbstractC1177jv.j(this.f12731b);
            Object[] objArr = this.f14017d;
            if (j5 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a5 = AbstractC1400ot.a(hashCode);
                while (true) {
                    int i = a5 & length;
                    Object[] objArr2 = this.f14017d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f14018e += hashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        a5 = i + 1;
                    }
                }
            }
        }
        this.f14017d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f14017d == null) {
            c(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final AbstractC1177jv h() {
        AbstractC1177jv m5;
        int i = this.f12731b;
        if (i == 0) {
            return Dv.f8414t;
        }
        if (i == 1) {
            Object obj = this.f12730a[0];
            Objects.requireNonNull(obj);
            return new Jv(obj);
        }
        if (this.f14017d == null || AbstractC1177jv.j(i) != this.f14017d.length) {
            m5 = AbstractC1177jv.m(this.f12731b, this.f12730a);
            this.f12731b = m5.size();
        } else {
            int i5 = this.f12731b;
            Object[] objArr = this.f12730a;
            int length = objArr.length;
            if (i5 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            m5 = new Dv(this.f14018e, r8.length - 1, this.f12731b, objArr, this.f14017d);
        }
        this.f12732c = true;
        this.f14017d = null;
        return m5;
    }
}
