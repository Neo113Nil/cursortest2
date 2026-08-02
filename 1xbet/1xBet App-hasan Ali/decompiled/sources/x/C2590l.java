package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import p4.InterfaceC2280u;
import u.AbstractC2453d;
import u.C2465l;
import u.C2466m;
import u.C2474v;
import u.C2475w;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2590l extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.t f20816k;

    /* renamed from: l, reason: collision with root package name */
    public C2465l f20817l;

    /* renamed from: m, reason: collision with root package name */
    public int f20818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f20819n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2592m f20820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2595n0 f20821p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2590l(float f, C2592m c2592m, C2595n0 c2595n0, a4.c cVar) {
        super(2, cVar);
        this.f20819n = f;
        this.f20820o = c2592m;
        this.f20821p = c2595n0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2590l(this.f20819n, this.f20820o, this.f20821p, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2590l) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        float f;
        C2465l c2465l;
        kotlin.jvm.internal.t tVar;
        Object obj2 = EnumC0510a.f7289k;
        int i = this.f20818m;
        if (i == 0) {
            G4.l.N(obj);
            f = this.f20819n;
            if (Math.abs(f) > 1.0f) {
                kotlin.jvm.internal.t tVar2 = new kotlin.jvm.internal.t();
                tVar2.f17621k = f;
                kotlin.jvm.internal.t tVar3 = new kotlin.jvm.internal.t();
                u.A0 a02 = u.B0.f19645a;
                c2465l = new C2465l(a02, Float.valueOf(0.0f), new C2466m(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    C2592m c2592m = this.f20820o;
                    C2475w c2475w = c2592m.f20822a;
                    B.t tVar4 = new B.t(tVar3, this.f20821p, tVar2, c2592m, 5);
                    this.f20816k = tVar2;
                    this.f20817l = c2465l;
                    this.f20818m = 1;
                    Object b3 = AbstractC2453d.b(c2465l, new C2474v(c2475w, a02, c2465l.f19846l.getValue(), c2465l.f19847m), Long.MIN_VALUE, tVar4, this);
                    if (b3 != obj2) {
                        b3 = W3.o.f6046a;
                    }
                    if (b3 == obj2) {
                        return obj2;
                    }
                    tVar = tVar2;
                } catch (CancellationException unused) {
                    tVar = tVar2;
                    tVar.f17621k = ((Number) c2465l.f19845k.f19644b.c(c2465l.f19847m)).floatValue();
                    f = tVar.f17621k;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2465l = this.f20817l;
        tVar = this.f20816k;
        try {
            G4.l.N(obj);
        } catch (CancellationException unused2) {
            tVar.f17621k = ((Number) c2465l.f19845k.f19644b.c(c2465l.f19847m)).floatValue();
            f = tVar.f17621k;
            return new Float(f);
        }
        f = tVar.f17621k;
        return new Float(f);
    }
}
