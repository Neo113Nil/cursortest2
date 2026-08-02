package A0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g0.AbstractC1961f;
import g0.C1959d;
import g0.C1965j;
import h0.C1989c;
import i4.InterfaceC2015a;
import p4.InterfaceC2280u;
import r0.AbstractC2346c;
import r0.C2344a;
import r0.C2345b;

/* renamed from: A0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068y extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f595l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f596m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068y(F f, int i) {
        super(1);
        this.f595l = i;
        this.f596m = f;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        C1959d c1959d;
        switch (this.f595l) {
            case 0:
                KeyEvent keyEvent = ((C2345b) obj).f19083a;
                long q5 = AbstractC2346c.q(keyEvent);
                if (C2344a.a(q5, C2344a.f19070c)) {
                    c1959d = new C1959d(2);
                } else if (C2344a.a(q5, C2344a.f19071d)) {
                    c1959d = new C1959d(1);
                } else if (C2344a.a(q5, C2344a.f19075j)) {
                    c1959d = new C1959d(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    c1959d = C2344a.a(q5, C2344a.f19074h) ? new C1959d(4) : C2344a.a(q5, C2344a.f19073g) ? new C1959d(3) : (C2344a.a(q5, C2344a.f19072e) || C2344a.a(q5, C2344a.f19078m)) ? new C1959d(5) : (C2344a.a(q5, C2344a.f) || C2344a.a(q5, C2344a.f19079n)) ? new C1959d(6) : (C2344a.a(q5, C2344a.i) || C2344a.a(q5, C2344a.f19076k) || C2344a.a(q5, C2344a.f19080o)) ? new C1959d(7) : (C2344a.a(q5, C2344a.f19069b) || C2344a.a(q5, C2344a.f19077l)) ? new C1959d(8) : null;
                }
                if (c1959d == null || AbstractC2346c.t(keyEvent) != 2) {
                    return Boolean.FALSE;
                }
                int i = c1959d.f17021a;
                Integer C5 = AbstractC1961f.C(i);
                F f = this.f596m;
                C1989c embeddedViewFocusRect = f.getEmbeddedViewFocusRect();
                Boolean e3 = ((C1965j) f.getFocusOwner()).e(i, embeddedViewFocusRect, new C0066x(c1959d, 1));
                if (e3 != null ? e3.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(i == 1 || i == 2)) {
                    return Boolean.FALSE;
                }
                if (C5 != null) {
                    int intValue = C5.intValue();
                    Object obj2 = R0.f.get();
                    kotlin.jvm.internal.l.c(obj2);
                    R0 r02 = (R0) obj2;
                    View view = f;
                    while (true) {
                        if (view != null) {
                            View rootView = f.getRootView();
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.ViewGroup", rootView);
                            view = r02.b(intValue, view, (ViewGroup) rootView);
                            if (view != null) {
                                if (!view.equals(f)) {
                                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == f) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            view = null;
                        }
                    }
                    if (kotlin.jvm.internal.l.a(view, f)) {
                        view = null;
                    }
                    if (view != null) {
                        Rect s2 = embeddedViewFocusRect != null ? i0.F.s(embeddedViewFocusRect) : null;
                        if (s2 == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View rootView2 = f.getRootView();
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.ViewGroup", rootView2);
                        ViewGroup viewGroup = (ViewGroup) rootView2;
                        viewGroup.offsetDescendantRectToMyCoords(f, s2);
                        viewGroup.offsetRectIntoDescendantCoords(view, s2);
                        if (AbstractC1961f.y(view, C5, s2)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!((C1965j) f.getFocusOwner()).b(i, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean e5 = ((C1965j) f.getFocusOwner()).e(i, null, new C0066x(c1959d, 0));
                return Boolean.valueOf(e5 != null ? e5.booleanValue() : true);
            case 1:
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) obj;
                F f5 = this.f596m;
                Handler handler = f5.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC2015a.invoke();
                } else {
                    Handler handler2 = f5.getHandler();
                    if (handler2 != null) {
                        handler2.post(new D(interfaceC2015a, 0));
                    }
                }
                return W3.o.f6046a;
            default:
                F f6 = this.f596m;
                return new C0046m0(f6, f6.getTextInputService(), (InterfaceC2280u) obj);
        }
    }
}
