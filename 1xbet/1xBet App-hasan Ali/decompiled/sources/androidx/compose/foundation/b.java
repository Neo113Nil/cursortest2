package androidx.compose.foundation;

import P.C0302l;
import P.C0315s;
import b0.k;
import b0.p;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.m;
import v.T;
import v.Y;
import y.C2654j;

/* loaded from: classes.dex */
public final class b extends m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f6824l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f6825m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f6826n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z3, String str, InterfaceC2015a interfaceC2015a) {
        super(3);
        this.f6824l = z3;
        this.f6825m = str;
        this.f6826n = interfaceC2015a;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C2654j c2654j;
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(-756081143);
        T t5 = (T) c0315s.j(e.f6832a);
        boolean z3 = t5 instanceof Y;
        if (z3) {
            c0315s.X(617140216);
            c0315s.q(false);
            c2654j = null;
        } else {
            c0315s.X(617248189);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = new C2654j();
                c0315s.i0(M5);
            }
            c2654j = (C2654j) M5;
            c0315s.q(false);
        }
        C2654j c2654j2 = c2654j;
        boolean z5 = this.f6824l;
        String str = this.f6825m;
        InterfaceC2015a interfaceC2015a = this.f6826n;
        p clickableElement = z3 ? new ClickableElement(c2654j2, (Y) t5, z5, str, null, interfaceC2015a) : t5 == null ? new ClickableElement(c2654j2, null, z5, str, null, interfaceC2015a) : c2654j2 != null ? e.a(c2654j2, t5).c(new ClickableElement(c2654j2, null, z5, str, null, interfaceC2015a)) : new k(new c(t5, z5, str, null, interfaceC2015a));
        c0315s.q(false);
        return clickableElement;
    }
}
