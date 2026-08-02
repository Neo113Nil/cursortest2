package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724w2 implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final int f16088k;

    /* renamed from: l, reason: collision with root package name */
    public final C1499r2 f16089l;

    public C1724w2(int i, C1499r2 c1499r2) {
        this.f16088k = i;
        this.f16089l = c1499r2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f16088k, ((C1724w2) obj).f16088k);
    }
}
