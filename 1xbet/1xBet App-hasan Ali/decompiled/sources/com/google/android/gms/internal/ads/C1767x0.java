package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767x0 extends M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f16200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E4.a f16201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767x0(E4.a aVar, U u5, U u6) {
        super(u5);
        this.f16200b = u6;
        this.f16201c = aVar;
    }

    @Override // com.google.android.gms.internal.ads.M, com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        T c5 = this.f16200b.c(j5);
        V v4 = c5.f11607a;
        long j6 = v4.f11849b;
        long j7 = this.f16201c.f1485k;
        V v5 = new V(v4.f11848a, j6 + j7);
        V v6 = c5.f11608b;
        return new T(v5, new V(v6.f11848a, v6.f11849b + j7));
    }
}
