package androidx.compose.foundation;

import H0.g;
import P.C0302l;
import P.C0315s;
import b0.p;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.m;
import v.T;
import y.C2654j;

/* loaded from: classes.dex */
public final class c extends m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f6827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f6828m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f6829n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f6830o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f6831p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T t5, boolean z3, String str, g gVar, InterfaceC2015a interfaceC2015a) {
        super(3);
        this.f6827l = t5;
        this.f6828m = z3;
        this.f6829n = str;
        this.f6830o = gVar;
        this.f6831p = interfaceC2015a;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(-1525724089);
        Object M5 = c0315s.M();
        if (M5 == C0302l.f4480a) {
            M5 = new C2654j();
            c0315s.i0(M5);
        }
        C2654j c2654j = (C2654j) M5;
        p c5 = e.a(c2654j, this.f6827l).c(new ClickableElement(c2654j, null, this.f6828m, this.f6829n, this.f6830o, this.f6831p));
        c0315s.q(false);
        return c5;
    }
}
