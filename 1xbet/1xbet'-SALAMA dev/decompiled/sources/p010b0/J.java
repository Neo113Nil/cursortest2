package p010b0;

import A1.Z;
import D6.C;
import D6.C0136t;
import D6.E;
import F6.b;
import F6.h;
import j6.a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p072k1.g;
import p077k6.i;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class J extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f9948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(O o7, Function2 function2, d dVar) {
        super(2, dVar);
        this.f9947c = o7;
        this.f9948d = (i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        J j = new J(this.f9947c, this.f9948d, dVar);
        j.f9946b = obj;
        return j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        int i7 = this.f9945a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            C c3 = (C) this.f9946b;
            C0136t c0136tA = E.a();
            O o7 = this.f9947c;
            a0 a0Var = new a0(this.f9948d, c0136tA, o7.f9971h.p(), c3.c());
            g gVar = o7.f9974l;
            Object objE = ((b) gVar.f14682c).e(a0Var);
            if (objE instanceof F6.g) {
                F6.g gVar2 = objE instanceof F6.g ? (F6.g) objE : null;
                Throwable th = gVar2 != null ? gVar2.f2821a : null;
                if (th == null) {
                    throw new Z("Channel was closed normally");
                }
                throw th;
            }
            if (objE instanceof h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((C1010l1) gVar.f14683d).f17777a).getAndIncrement() == 0) {
                E.p((C) gVar.f14680a, new d0(gVar, null));
            }
            this.f9945a = 1;
            obj = c0136tA.j(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return obj;
    }
}
