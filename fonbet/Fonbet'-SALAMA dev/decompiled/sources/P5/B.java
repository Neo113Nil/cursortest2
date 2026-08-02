package P5;

import A1.W;
import a.AbstractC0603a;
import b0.C0756d;
import b0.C0770s;
import b0.Z;
import b0.b0;
import b0.i0;
import b0.j0;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.Set;

/* loaded from: classes2.dex */
public final class B implements G6.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.h f5593b;

    public /* synthetic */ B(G6.h hVar, int i7) {
        this.f5592a = i7;
        this.f5593b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    @Override // G6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        A a2;
        int i7;
        C0770s c0770s;
        int i8;
        switch (this.f5592a) {
            case 0:
                if (interfaceC1287d instanceof A) {
                    a2 = (A) interfaceC1287d;
                    int i9 = a2.f5590b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        a2.f5590b = i9 - Integer.MIN_VALUE;
                        Object obj2 = a2.f5589a;
                        j6.a aVar = j6.a.f14642a;
                        i7 = a2.f5590b;
                        if (i7 != 0) {
                            AbstractC0603a.p0(obj2);
                            Set keySet = ((e0.b) obj).a().keySet();
                            a2.f5590b = 1;
                            if (this.f5593b.c(keySet, a2) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj2);
                        }
                        return C1116i.f13008a;
                    }
                }
                a2 = new A(this, interfaceC1287d);
                Object obj22 = a2.f5589a;
                j6.a aVar2 = j6.a.f14642a;
                i7 = a2.f5590b;
                if (i7 != 0) {
                }
                return C1116i.f13008a;
            default:
                if (interfaceC1287d instanceof C0770s) {
                    c0770s = (C0770s) interfaceC1287d;
                    int i10 = c0770s.f10094b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0770s.f10094b = i10 - Integer.MIN_VALUE;
                        Object obj3 = c0770s.f10093a;
                        j6.a aVar3 = j6.a.f14642a;
                        i8 = c0770s.f10094b;
                        if (i8 != 0) {
                            AbstractC0603a.p0(obj3);
                            i0 i0Var = (i0) obj;
                            if (i0Var instanceof b0) {
                                throw ((b0) i0Var).f10015b;
                            }
                            if (!(i0Var instanceof C0756d)) {
                                if (i0Var instanceof Z ? true : i0Var instanceof j0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new W();
                            }
                            Object obj4 = ((C0756d) i0Var).f10021b;
                            c0770s.f10094b = 1;
                            if (this.f5593b.c(obj4, c0770s) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj3);
                        }
                        return C1116i.f13008a;
                    }
                }
                c0770s = new C0770s(this, interfaceC1287d);
                Object obj32 = c0770s.f10093a;
                j6.a aVar32 = j6.a.f14642a;
                i8 = c0770s.f10094b;
                if (i8 != 0) {
                }
                return C1116i.f13008a;
        }
    }
}
