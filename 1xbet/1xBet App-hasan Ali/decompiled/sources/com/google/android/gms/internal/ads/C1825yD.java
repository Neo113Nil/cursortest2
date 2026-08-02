package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.yD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825yD extends AbstractList {

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC1400ot f16416m = AbstractC1400ot.y(C1825yD.class);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f16417k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC1690vD f16418l;

    public C1825yD(ArrayList arrayList, AbstractC1690vD abstractC1690vD) {
        this.f16417k = arrayList;
        this.f16418l = abstractC1690vD;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f16417k;
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        AbstractC1690vD abstractC1690vD = this.f16418l;
        if (!abstractC1690vD.hasNext()) {
            throw new NoSuchElementException();
        }
        arrayList.add(abstractC1690vD.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1780xD(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        AbstractC1400ot abstractC1400ot = f16416m;
        abstractC1400ot.k("potentially expensive size() call");
        abstractC1400ot.k("blowup running");
        while (true) {
            AbstractC1690vD abstractC1690vD = this.f16418l;
            boolean hasNext = abstractC1690vD.hasNext();
            ArrayList arrayList = this.f16417k;
            if (!hasNext) {
                return arrayList.size();
            }
            arrayList.add(abstractC1690vD.next());
        }
    }
}
