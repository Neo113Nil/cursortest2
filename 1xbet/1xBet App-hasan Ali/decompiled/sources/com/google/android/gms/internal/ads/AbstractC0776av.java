package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0776av {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f12730a;

    /* renamed from: b, reason: collision with root package name */
    public int f12731b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12732c;

    public AbstractC0776av(int i) {
        AbstractC0952et.q("initialCapacity", i);
        this.f12730a = new Object[i];
        this.f12731b = 0;
    }

    public static int d(int i, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i5 <= i) {
            return i;
        }
        int i6 = i + (i >> 1) + 1;
        if (i6 < i5) {
            int highestOneBit = Integer.highestOneBit(i5 - 1);
            i6 = highestOneBit + highestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f12730a;
        int i = this.f12731b;
        this.f12731b = i + 1;
        objArr[i] = obj;
    }

    public abstract AbstractC0776av b(Object obj);

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof AbstractC0821bv) {
                this.f12731b = ((AbstractC0821bv) collection).c(this.f12731b, this.f12730a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i) {
        int length = this.f12730a.length;
        int d5 = d(length, this.f12731b + i);
        if (d5 > length || this.f12732c) {
            this.f12730a = Arrays.copyOf(this.f12730a, d5);
            this.f12732c = false;
        }
    }
}
