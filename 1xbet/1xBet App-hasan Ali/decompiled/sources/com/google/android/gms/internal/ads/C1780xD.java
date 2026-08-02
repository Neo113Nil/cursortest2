package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.xD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780xD implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public int f16277k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1825yD f16278l;

    public C1780xD(C1825yD c1825yD) {
        this.f16278l = c1825yD;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f16277k;
        C1825yD c1825yD = this.f16278l;
        return i < c1825yD.f16417k.size() || c1825yD.f16418l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f16277k;
        C1825yD c1825yD = this.f16278l;
        ArrayList arrayList = c1825yD.f16417k;
        if (i >= arrayList.size()) {
            arrayList.add(c1825yD.f16418l.next());
            return next();
        }
        int i5 = this.f16277k;
        this.f16277k = i5 + 1;
        return arrayList.get(i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
