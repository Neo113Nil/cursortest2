package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class Lv implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10558k;

    public abstract byte a();

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10558k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
