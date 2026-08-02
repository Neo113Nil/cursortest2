package G6;

import P.U;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import b0.O;
import b0.Z;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e3.C1023h;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class s implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3125b;

    public /* synthetic */ s(Object obj, int i7) {
        this.f3124a = i7;
        this.f3125b = obj;
    }

    @Override // G6.h
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        Object e7;
        C1116i c1116i = C1116i.f13008a;
        Object obj2 = this.f3125b;
        switch (this.f3124a) {
            case 0:
                ((t6.p) obj2).f16472a = obj;
                throw new H6.a(this);
            case 1:
                X0.c cVar = (X0.c) obj;
                C1023h c1023h = ((I0.c) obj2).f3494d;
                C1116i c1116i2 = null;
                if (c1023h != null) {
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) c1023h.f12667a;
                    slidingPaneLayout.f9784L = cVar;
                    O0.g gVar = new O0.g();
                    gVar.f4878c = 300L;
                    gVar.f4879d = R.a.b(0.2f, 0.0f, 0.0f, 1.0f);
                    ArrayList arrayList = O0.q.f4890b;
                    if (!arrayList.contains(slidingPaneLayout)) {
                        WeakHashMap weakHashMap = U.f5037a;
                        if (slidingPaneLayout.isLaidOut()) {
                            arrayList.add(slidingPaneLayout);
                            O0.m clone = gVar.clone();
                            ArrayList arrayList2 = (ArrayList) O0.q.a().getOrDefault(slidingPaneLayout, null);
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ((O0.m) it.next()).u(slidingPaneLayout);
                                }
                            }
                            if (clone != null) {
                                clone.h(slidingPaneLayout, true);
                            }
                            if (slidingPaneLayout.getTag(R.id.transition_current_scene) != null) {
                                throw new ClassCastException();
                            }
                            slidingPaneLayout.setTag(R.id.transition_current_scene, null);
                            if (clone != null) {
                                O0.p pVar = new O0.p();
                                pVar.f4887a = clone;
                                pVar.f4888b = slidingPaneLayout;
                                slidingPaneLayout.addOnAttachStateChangeListener(pVar);
                                slidingPaneLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
                            }
                        }
                    }
                    slidingPaneLayout.requestLayout();
                    c1116i2 = c1116i;
                }
                return c1116i2 == j6.a.f14642a ? c1116i2 : c1116i;
            case 2:
                ((X0.i) obj2).accept(obj);
                return c1116i;
            default:
                O o7 = (O) obj2;
                return ((o7.f9971h.p() instanceof Z) || (e7 = O.e(o7, true, interfaceC1287d)) != j6.a.f14642a) ? c1116i : e7;
        }
    }
}
