package V4;

import V4.l;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.X;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: V4.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4076e extends X {

    /* renamed from: V4.e$a */
    final class a extends l.e {
    }

    /* renamed from: V4.e$b */
    final class b implements l.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f28027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f28028b;

        b(View view, ArrayList arrayList) {
            this.f28027a = view;
            this.f28028b = arrayList;
        }

        @Override // V4.l.f
        public final void onTransitionCancel(@NonNull l lVar) {
        }

        @Override // V4.l.f
        public final void onTransitionEnd(@NonNull l lVar) {
            lVar.removeListener(this);
            this.f28027a.setVisibility(8);
            ArrayList arrayList = this.f28028b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((View) arrayList.get(i11)).setVisibility(0);
            }
        }

        @Override // V4.l.f
        public final void onTransitionPause(@NonNull l lVar) {
        }

        @Override // V4.l.f
        public final void onTransitionResume(@NonNull l lVar) {
        }

        @Override // V4.l.f
        public final void onTransitionStart(@NonNull l lVar) {
            lVar.removeListener(this);
            lVar.addListener(this);
        }
    }

    /* renamed from: V4.e$c */
    final class c extends l.e {
    }

    private static boolean t(l lVar) {
        return (X.h(lVar.getTargetIds()) && X.h(lVar.getTargetNames()) && X.h(lVar.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.X
    public final void a(View view, Object obj) {
        ((l) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.X
    public final void b(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i11 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int c11 = pVar.c();
            while (i11 < c11) {
                b(pVar.b(i11), arrayList);
                i11++;
            }
            return;
        }
        if (t(lVar) || !X.h(lVar.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i11 < size) {
            lVar.addTarget(arrayList.get(i11));
            i11++;
        }
    }

    @Override // androidx.fragment.app.X
    public final void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.X
    public final boolean e(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.X
    public final Object f(Object obj) {
        if (obj != null) {
            return ((l) obj).mo13clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.X
    public final Object j(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            p pVar = new p();
            pVar.a(lVar);
            pVar.a(lVar2);
            pVar.f(1);
            lVar = pVar;
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar2 = new p();
        if (lVar != null) {
            pVar2.a(lVar);
        }
        pVar2.a(lVar3);
        return pVar2;
    }

    @Override // androidx.fragment.app.X
    public final Object k(Object obj, Object obj2) {
        p pVar = new p();
        if (obj != null) {
            pVar.a((l) obj);
        }
        pVar.a((l) obj2);
        return pVar;
    }

    @Override // androidx.fragment.app.X
    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.X
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((l) obj).addListener(new C4077f(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.X
    public final void n(View view, Object obj) {
        if (view != null) {
            X.g(view, new Rect());
            ((l) obj).setEpicenterCallback(new a());
        }
    }

    @Override // androidx.fragment.app.X
    public final void o(Object obj, Rect rect) {
        ((l) obj).setEpicenterCallback(new c());
    }

    @Override // androidx.fragment.app.X
    public final void p(@NonNull Object obj, @NonNull androidx.core.os.e eVar, @NonNull Runnable runnable) {
        l lVar = (l) obj;
        eVar.c(new g(lVar));
        lVar.addListener(new h(runnable));
    }

    @Override // androidx.fragment.app.X
    public final void q(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> targets = pVar.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            X.d(arrayList.get(i11), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    @Override // androidx.fragment.app.X
    public final void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.getTargets().clear();
            pVar.getTargets().addAll(arrayList2);
            u(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.X
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.a((l) obj);
        return pVar;
    }

    public final void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        int i11 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int c11 = pVar.c();
            while (i11 < c11) {
                u(pVar.b(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (t(lVar)) {
            return;
        }
        List<View> targets = lVar.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i11 < size) {
                lVar.addTarget(arrayList2.get(i11));
                i11++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.removeTarget(arrayList.get(size2));
            }
        }
    }
}
