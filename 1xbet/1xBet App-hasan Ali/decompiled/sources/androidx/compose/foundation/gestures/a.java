package androidx.compose.foundation.gestures;

import G4.l;
import b0.p;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1988b;
import kotlin.jvm.internal.t;
import v.d0;
import v.k0;
import x.C2569a0;
import x.C2592m;
import x.C2604s0;
import x.InterfaceC2591l0;
import x.P;
import x.W;
import x.X;
import x.Y;
import x.Z;
import y.C2654j;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final X f6841a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final W f6842b = new W();

    /* renamed from: c, reason: collision with root package name */
    public static final Y f6843c = new Y();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C2604s0 c2604s0, long j5, AbstractC0542c abstractC0542c) {
        Z z3;
        int i;
        t tVar;
        C2604s0 c2604s02;
        if (abstractC0542c instanceof Z) {
            z3 = (Z) abstractC0542c;
            int i5 = z3.f20732n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                z3.f20732n = i5 - Integer.MIN_VALUE;
                Object obj = z3.f20731m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = z3.f20732n;
                if (i != 0) {
                    l.N(obj);
                    tVar = new t();
                    d0 d0Var = d0.f20222k;
                    C2569a0 c2569a0 = new C2569a0(c2604s0, j5, tVar, null);
                    z3.f20729k = c2604s0;
                    z3.f20730l = tVar;
                    z3.f20732n = 1;
                    if (c2604s0.e(d0Var, c2569a0, z3) == enumC0510a) {
                        return enumC0510a;
                    }
                    c2604s02 = c2604s0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t tVar2 = z3.f20730l;
                    C2604s0 c2604s03 = z3.f20729k;
                    l.N(obj);
                    tVar = tVar2;
                    c2604s02 = c2604s03;
                }
                return new C1988b(c2604s02.g(tVar.f17621k));
            }
        }
        z3 = new Z(abstractC0542c);
        Object obj2 = z3.f20731m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = z3.f20732n;
        if (i != 0) {
        }
        return new C1988b(c2604s02.g(tVar.f17621k));
    }

    public static final p b(p pVar, InterfaceC2591l0 interfaceC2591l0, P p5, k0 k0Var, boolean z3, boolean z5, C2592m c2592m, C2654j c2654j) {
        return pVar.c(new ScrollableElement(k0Var, c2592m, p5, interfaceC2591l0, c2654j, z3, z5));
    }
}
