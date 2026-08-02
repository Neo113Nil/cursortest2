package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.mv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312mv extends Lv {

    /* renamed from: l, reason: collision with root package name */
    public final Object f14545l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14546m;

    public C1312mv(Object obj) {
        super(0);
        this.f14545l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14546m;
    }

    @Override // com.google.android.gms.internal.ads.Lv, java.util.Iterator
    public final Object next() {
        if (this.f14546m) {
            throw new NoSuchElementException();
        }
        this.f14546m = true;
        return this.f14545l;
    }
}
