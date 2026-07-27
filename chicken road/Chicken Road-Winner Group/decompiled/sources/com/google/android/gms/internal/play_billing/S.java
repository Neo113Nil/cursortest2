package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class S extends C {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f2677c;

    public S(T t3) {
        this.f2677c = t3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        T t3 = this.f2677c;
        AbstractC0181d1.g(i3, t3.f2680e);
        int i4 = i3 + i3;
        Object[] objArr = t3.f2679d;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2677c.f2680e;
    }
}
