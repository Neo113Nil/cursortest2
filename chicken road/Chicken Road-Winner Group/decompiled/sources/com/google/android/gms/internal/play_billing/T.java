package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class T extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient W f2678c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f2679d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f2680e;

    public T(W w3, Object[] objArr, int i3) {
        this.f2678c = w3;
        this.f2679d = objArr;
        this.f2680e = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int b(Object[] objArr) {
        return e().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2678c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    public final C i() {
        return new S(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2680e;
    }
}
