package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643uB extends Lv {

    /* renamed from: l, reason: collision with root package name */
    public int f15800l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1823yB f15802n;

    public C1643uB(AbstractC1823yB abstractC1823yB) {
        super(1);
        this.f15802n = abstractC1823yB;
        this.f15800l = 0;
        this.f15801m = abstractC1823yB.g();
    }

    @Override // com.google.android.gms.internal.ads.Lv
    public final byte a() {
        int i = this.f15800l;
        if (i >= this.f15801m) {
            throw new NoSuchElementException();
        }
        this.f15800l = i + 1;
        return this.f15802n.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15800l < this.f15801m;
    }
}
