package P5;

import A1.W;
import java.util.Set;
import p010b0.C0733d;
import p010b0.C0747s;
import p010b0.Z;
import p010b0.b0;
import p010b0.i0;
import p010b0.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements G6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.h f5593b;

    public /* synthetic */ B(G6.h hVar, int i7) {
        this.f5592a = i7;
        this.f5593b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // G6.h
    public final Object c(Object obj, p065i6.d dVar) throws Throwable {
        A a2;
        C0747s c0747s;
        switch (this.f5592a) {
            case 0:
                if (dVar instanceof A) {
                    a2 = (A) dVar;
                    int i7 = a2.f5590b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        a2.f5590b = i7 - Integer.MIN_VALUE;
                    } else {
                        a2 = new A(this, dVar);
                    }
                } else {
                    a2 = new A(this, dVar);
                }
                Object obj2 = a2.f5589a;
                j6.a aVar = j6.a.f14648a;
                int i8 = a2.f5590b;
                if (i8 == 0) {
                    p003a.a.p0(obj2);
                    Set setKeySet = ((p030e0.b) obj).a().keySet();
                    a2.f5590b = 1;
                    if (this.f5593b.c(setKeySet, a2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj2);
                }
                return p044f6.i.f13014a;
            default:
                if (dVar instanceof C0747s) {
                    c0747s = (C0747s) dVar;
                    int i9 = c0747s.f10094b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0747s.f10094b = i9 - Integer.MIN_VALUE;
                    } else {
                        c0747s = new C0747s(this, dVar);
                    }
                } else {
                    c0747s = new C0747s(this, dVar);
                }
                Object obj3 = c0747s.f10093a;
                j6.a aVar2 = j6.a.f14648a;
                int i10 = c0747s.f10094b;
                if (i10 == 0) {
                    p003a.a.p0(obj3);
                    i0 i0Var = (i0) obj;
                    if (i0Var instanceof b0) {
                        throw ((b0) i0Var).f10015b;
                    }
                    if (!(i0Var instanceof C0733d)) {
                        if (i0Var instanceof Z ? true : i0Var instanceof j0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new W();
                    }
                    Object obj4 = ((C0733d) i0Var).f10021b;
                    c0747s.f10094b = 1;
                    if (this.f5593b.c(obj4, c0747s) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj3);
                }
                return p044f6.i.f13014a;
        }
    }
}
