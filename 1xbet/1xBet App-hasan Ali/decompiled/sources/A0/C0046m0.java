package A0;

import android.view.View;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.concurrent.atomic.AtomicReference;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: A0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046m0 implements InterfaceC2280u {

    /* renamed from: k, reason: collision with root package name */
    public final View f533k;

    /* renamed from: l, reason: collision with root package name */
    public final P0.x f534l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2280u f535m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f536n = new AtomicReference(null);

    public C0046m0(View view, P0.x xVar, InterfaceC2280u interfaceC2280u) {
        this.f533k = view;
        this.f534l = xVar;
        this.f535m = interfaceC2280u;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(G.B b3, AbstractC0542c abstractC0542c) {
        C0037j0 c0037j0;
        int i;
        if (abstractC0542c instanceof C0037j0) {
            c0037j0 = (C0037j0) abstractC0542c;
            int i5 = c0037j0.f517m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0037j0.f517m = i5 - Integer.MIN_VALUE;
                Object obj = c0037j0.f515k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c0037j0.f517m;
                if (i != 0) {
                    G4.l.N(obj);
                    AtomicReference atomicReference = this.f536n;
                    C0028g0 c0028g0 = new C0028g0(2, b3, this);
                    C0043l0 c0043l0 = new C0043l0(this, null);
                    c0037j0.f517m = 1;
                    if (AbstractC2282w.e(new b0.t(c0028g0, atomicReference, c0043l0, null), c0037j0) == enumC0510a) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                }
                throw new D2.e();
            }
        }
        c0037j0 = new C0037j0(this, abstractC0542c);
        Object obj2 = c0037j0.f515k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c0037j0.f517m;
        if (i != 0) {
        }
        throw new D2.e();
    }

    @Override // p4.InterfaceC2280u
    public final a4.h i() {
        return this.f535m.i();
    }
}
