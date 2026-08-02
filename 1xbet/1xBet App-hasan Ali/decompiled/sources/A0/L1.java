package A0;

import P.AbstractC0321v;
import P.C0327y;
import android.view.View;
import android.view.ViewGroup;
import game.betting133.sports1xbet.R;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public abstract class L1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f326a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final K1 a(AbstractC0012b abstractC0012b, AbstractC0321v abstractC0321v, X.d dVar) {
        F f;
        K1 k12;
        if (V0.f399a.compareAndSet(false, true)) {
            r4.c a5 = r4.j.a(1, 6, null);
            AbstractC2282w.p(AbstractC2282w.a((a4.h) C0055r0.f554w.getValue()), null, new U0(a5, null), 3);
            A.B b3 = new A.B(4, a5);
            synchronized (Z.l.f6208c) {
                Z.l.i = X3.m.h0(Z.l.i, b3);
            }
            Z.l.a();
        }
        if (abstractC0012b.getChildCount() > 0) {
            View childAt = abstractC0012b.getChildAt(0);
            if (childAt instanceof F) {
                f = (F) childAt;
                if (f == null) {
                    f = new F(abstractC0012b.getContext(), abstractC0321v.i());
                    abstractC0012b.addView(f.getView(), f326a);
                }
                Object tag = f.getView().getTag(R.id.wrapped_composition_tag);
                k12 = tag instanceof K1 ? (K1) tag : null;
                if (k12 == null) {
                    k12 = new K1(f, new C0327y(abstractC0321v, new v3.e(f.getRoot())));
                    f.getView().setTag(R.id.wrapped_composition_tag, k12);
                }
                k12.c(dVar);
                if (!kotlin.jvm.internal.l.a(f.getCoroutineContext(), abstractC0321v.i())) {
                    f.setCoroutineContext(abstractC0321v.i());
                }
                return k12;
            }
        } else {
            abstractC0012b.removeAllViews();
        }
        f = null;
        if (f == null) {
        }
        Object tag2 = f.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof K1) {
        }
        if (k12 == null) {
        }
        k12.c(dVar);
        if (!kotlin.jvm.internal.l.a(f.getCoroutineContext(), abstractC0321v.i())) {
        }
        return k12;
    }
}
