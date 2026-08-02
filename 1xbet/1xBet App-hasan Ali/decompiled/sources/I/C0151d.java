package I;

import P.AbstractC0329z;
import P.C0315s;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import k4.AbstractC2036a;

/* renamed from: I.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151d extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0159l f2470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2471m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V0.j f2472n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2473o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2474p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SuspendPointerInputElement f2475q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2476r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151d(InterfaceC0159l interfaceC0159l, boolean z3, V0.j jVar, boolean z5, long j5, SuspendPointerInputElement suspendPointerInputElement, int i) {
        super(2);
        this.f2470l = interfaceC0159l;
        this.f2471m = z3;
        this.f2472n = jVar;
        this.f2473o = z5;
        this.f2474p = j5;
        this.f2475q = suspendPointerInputElement;
        this.f2476r = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(this.f2476r | 1);
        SuspendPointerInputElement suspendPointerInputElement = this.f2475q;
        V0.j jVar = this.f2472n;
        boolean z3 = this.f2473o;
        AbstractC2036a.b(this.f2470l, this.f2471m, jVar, z3, this.f2474p, suspendPointerInputElement, (C0315s) obj, B5);
        return W3.o.f6046a;
    }
}
