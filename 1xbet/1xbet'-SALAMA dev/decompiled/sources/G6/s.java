package G6;

import P.U;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p010b0.O;
import p010b0.Z;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3125b;

    public /* synthetic */ s(Object obj, int i7) {
        this.f3124a = i7;
        this.f3125b = obj;
    }

    @Override // G6.h
    public final Object c(Object obj, p065i6.d dVar) {
        Object objE;
        p044f6.i iVar = p044f6.i.f13014a;
        Object obj2 = this.f3125b;
        switch (this.f3124a) {
            case 0:
                ((t6.p) obj2).f16478a = obj;
                throw new H6.a(this);
            case 1:
                X0.c cVar = (X0.c) obj;
                p033e3.h hVar = ((I0.c) obj2).f3494d;
                p044f6.i iVar2 = null;
                if (hVar != null) {
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) hVar.f12673a;
                    slidingPaneLayout.f9784L = cVar;
                    O0.g gVar = new O0.g();
                    gVar.f4878c = 300L;
                    gVar.f4879d = R.a.b(0.2f, 0.0f, 0.0f, 1.0f);
                    ArrayList arrayList = O0.q.f4890b;
                    if (!arrayList.contains(slidingPaneLayout)) {
                        WeakHashMap weakHashMap = U.f5037a;
                        if (slidingPaneLayout.isLaidOut()) {
                            arrayList.add(slidingPaneLayout);
                            O0.m mVarClone = gVar.clone();
                            ArrayList arrayList2 = (ArrayList) O0.q.a().getOrDefault(slidingPaneLayout, null);
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ((O0.m) it.next()).u(slidingPaneLayout);
                                }
                            }
                            if (mVarClone != null) {
                                mVarClone.h(slidingPaneLayout, true);
                            }
                            if (slidingPaneLayout.getTag(R.id.transition_current_scene) != null) {
                                throw new ClassCastException();
                            }
                            slidingPaneLayout.setTag(R.id.transition_current_scene, null);
                            if (mVarClone != null) {
                                O0.p pVar = new O0.p();
                                pVar.f4887a = mVarClone;
                                pVar.f4888b = slidingPaneLayout;
                                slidingPaneLayout.addOnAttachStateChangeListener(pVar);
                                slidingPaneLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
                            }
                        }
                    }
                    slidingPaneLayout.requestLayout();
                    iVar2 = iVar;
                }
                return iVar2 == j6.a.f14648a ? iVar2 : iVar;
            case 2:
                ((X0.i) obj2).accept(obj);
                return iVar;
            default:
                O o7 = (O) obj2;
                return ((o7.f9971h.p() instanceof Z) || (objE = O.e(o7, true, dVar)) != j6.a.f14648a) ? iVar : objE;
        }
    }
}
