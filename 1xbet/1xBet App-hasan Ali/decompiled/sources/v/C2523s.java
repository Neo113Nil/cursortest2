package v;

import a3.AbstractC0467k;
import h0.C1989c;
import i0.C2001f;
import i0.C2006k;
import k0.C2022b;
import k0.C2023c;
import z0.C2733I;

/* renamed from: v.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2523s extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1989c f20298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f20299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f20300n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2006k f20301o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2523s(C1989c c1989c, kotlin.jvm.internal.w wVar, long j5, C2006k c2006k) {
        super(1);
        this.f20298l = c1989c;
        this.f20299m = wVar;
        this.f20300n = j5;
        this.f20301o = c2006k;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        C2733I c2733i = (C2733I) obj;
        c2733i.a();
        C1989c c1989c = this.f20298l;
        kotlin.jvm.internal.w wVar = this.f20299m;
        long j5 = this.f20300n;
        C2006k c2006k = this.f20301o;
        C2022b c2022b = c2733i.f21647k;
        C2023c c2023c = (C2023c) c2022b.f17540l.f20432l;
        float f = c1989c.f17193a;
        float f5 = c1989c.f17194b;
        c2023c.B(f, f5);
        try {
            AbstractC0467k.i(c2733i, (C2001f) wVar.f17624k, j5, 0L, 0.0f, c2006k, 0, 890);
            ((C2023c) c2022b.f17540l.f20432l).B(-f, -f5);
            return W3.o.f6046a;
        } catch (Throwable th) {
            ((C2023c) c2022b.f17540l.f20432l).B(-f, -f5);
            throw th;
        }
    }
}
