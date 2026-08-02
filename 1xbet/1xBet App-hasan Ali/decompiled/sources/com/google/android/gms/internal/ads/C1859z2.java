package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859z2 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16540a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16541b;

    /* renamed from: c, reason: collision with root package name */
    public final C1761wv f16542c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public C1859z2(Uri uri, C1761wv c1761wv) {
        List list = Collections.EMPTY_LIST;
        this.f16540a = uri;
        ArrayList arrayList = AbstractC1593t6.f15632a;
        this.f16541b = list;
        this.f16542c = c1761wv;
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        if (c1761wv.f16186n <= 0) {
            AbstractC1044gv.k(0, objArr);
        } else {
            c1761wv.get(0);
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1859z2)) {
            return false;
        }
        C1859z2 c1859z2 = (C1859z2) obj;
        if (!this.f16540a.equals(c1859z2.f16540a) || !this.f16541b.equals(c1859z2.f16541b) || !this.f16542c.equals(c1859z2.f16542c)) {
            return false;
        }
        Object obj2 = -9223372036854775807L;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return (int) ((((this.f16542c.hashCode() + ((this.f16541b.hashCode() + (this.f16540a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
