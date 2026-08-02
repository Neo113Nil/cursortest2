package w1;

import java.util.HashMap;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677b extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1.h f17641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f17642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17644d;

    public C1677b(u1.h hVar, HashMap hashMap, long j, long j3) {
        this.f17641a = hVar;
        this.f17642b = hashMap;
        this.f17643c = j;
        this.f17644d = j3;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        Y1.c(this.f17641a.f16698a, 5, this.f17642b, false, false, null, this.f17643c, this.f17644d);
        if (this.f17642b.isEmpty()) {
            synchronized (AbstractC1706i0.class) {
            }
        }
    }
}
