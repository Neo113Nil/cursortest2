package x;

import b4.EnumC0510a;
import c4.AbstractC0547h;
import java.util.concurrent.CancellationException;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class O extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f20686l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20687m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a4.h f20688n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0547h f20689o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(a4.h hVar, i4.e eVar, a4.c cVar) {
        super(cVar);
        this.f20688n = hVar;
        this.f20689o = (AbstractC0547h) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c4.h, i4.e] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        O o5 = new O(this.f20688n, this.f20689o, cVar);
        o5.f20687m = obj;
        return o5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, t0.E] */
    /* JADX WARN: Type inference failed for: r1v7, types: [c4.h, i4.e] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0.E e3;
        t0.E e5;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        t0.E e6 = this.f20686l;
        a4.h hVar = this.f20688n;
        try {
        } catch (CancellationException e7) {
            e = e7;
            if (AbstractC2282w.n(hVar)) {
                throw e;
            }
            this.f20687m = e6;
            this.f20686l = 3;
            Object a5 = v.r.a(e6, this);
            e5 = e6;
        }
        if (e6 == 0) {
            G4.l.N(obj);
            e3 = (t0.E) this.f20687m;
            if (AbstractC2282w.n(hVar)) {
            }
        } else {
            if (e6 != 1) {
                if (e6 == 2) {
                    t0.E e8 = (t0.E) this.f20687m;
                    G4.l.N(obj);
                    e5 = e8;
                } else {
                    if (e6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.E e9 = (t0.E) this.f20687m;
                    G4.l.N(obj);
                    e5 = e9;
                }
                e3 = e5;
                if (AbstractC2282w.n(hVar)) {
                    return W3.o.f6046a;
                }
                try {
                } catch (CancellationException e10) {
                    e6 = e3;
                    e = e10;
                    if (AbstractC2282w.n(hVar)) {
                    }
                }
                ?? r1 = this.f20689o;
                this.f20687m = e3;
                this.f20686l = 1;
                if (r1.invoke(e3, this) != enumC0510a) {
                    e6 = e3;
                    this.f20687m = e6;
                    this.f20686l = 2;
                    Object a6 = v.r.a(e6, this);
                    e5 = e6;
                }
                return enumC0510a;
            }
            t0.E e11 = (t0.E) this.f20687m;
            G4.l.N(obj);
            e6 = e11;
            this.f20687m = e6;
            this.f20686l = 2;
            Object a62 = v.r.a(e6, this);
            e5 = e6;
        }
    }
}
