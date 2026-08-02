package J0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* renamed from: J0.e3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3287e3 extends AbstractC7737t implements InterfaceC6511n<U0, InterfaceC3967k, Integer, C7807Z> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T2 f13202b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13203c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f13204d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.o f13205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3287e3(T2 t2, boolean z11, boolean z12, t0.o oVar) {
        super(3);
        this.f13202b = t2;
        this.f13203c = z11;
        this.f13204d = z12;
        this.f13205e = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final C7807Z invoke(U0 u02, InterfaceC3967k interfaceC3967k, Integer num) {
        U0 u03 = u02;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-1272940975);
        long w11 = ((C7807Z) this.f13202b.c(this.f13203c, u03 == U0.UnfocusedEmpty ? false : this.f13204d, this.f13205e, interfaceC3967k2).getValue()).w();
        interfaceC3967k2.k();
        return C7807Z.m(w11);
    }
}
