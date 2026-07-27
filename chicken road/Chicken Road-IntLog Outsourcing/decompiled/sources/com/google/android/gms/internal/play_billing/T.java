package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T extends C {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f5103c;

    public T(U u5) {
        this.f5103c = u5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        U u5 = this.f5103c;
        AbstractC0325d1.i(i2, u5.f5107e);
        int i3 = i2 + i2;
        Object[] objArr = u5.f5106d;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5103c.f5107e;
    }
}
