package V4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import androidx.core.view.Y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static C4072a f28044a = new C4072a();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<C5132a<ViewGroup, ArrayList<l>>>> f28045b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f28046c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        l f28047a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f28048b;

        /* renamed from: V4.n$a$a, reason: collision with other inner class name */
        final class C0572a extends m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5132a f28049a;

            C0572a(C5132a c5132a) {
                this.f28049a = c5132a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // V4.l.f
            public final void onTransitionEnd(@NonNull l lVar) {
                ((ArrayList) this.f28049a.get(a.this.f28048b)).remove(lVar);
                lVar.removeListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup = this.f28048b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = n.f28046c;
            ViewGroup viewGroup2 = this.f28048b;
            if (!arrayList.remove(viewGroup2)) {
                return true;
            }
            C5132a<ViewGroup, ArrayList<l>> c11 = n.c();
            ArrayList<l> arrayList2 = c11.get(viewGroup2);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                c11.put(viewGroup2, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList3 = new ArrayList(arrayList2);
            }
            l lVar = this.f28047a;
            arrayList2.add(lVar);
            lVar.addListener(new C0572a(c11));
            lVar.captureValues(viewGroup2, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).resume(viewGroup2);
                }
            }
            lVar.playTransition(viewGroup2);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f28048b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = n.f28046c;
            ViewGroup viewGroup2 = this.f28048b;
            arrayList.remove(viewGroup2);
            ArrayList<l> arrayList2 = n.c().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<l> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().resume(viewGroup2);
                }
            }
            this.f28047a.clearValues(true);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, l lVar) {
        ArrayList<ViewGroup> arrayList = f28046c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        int i11 = Y.f42258g;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (lVar == null) {
                lVar = f28044a;
            }
            l mo13clone = lVar.mo13clone();
            ArrayList<l> arrayList2 = c().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<l> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().pause(viewGroup);
                }
            }
            if (mo13clone != null) {
                mo13clone.captureValues(viewGroup, true);
            }
            if (((k) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (mo13clone != null) {
                a aVar = new a();
                aVar.f28047a = mo13clone;
                aVar.f28048b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static void b(ViewGroup viewGroup) {
        f28046c.remove(viewGroup);
        ArrayList<l> arrayList = c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((l) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    static C5132a<ViewGroup, ArrayList<l>> c() {
        C5132a<ViewGroup, ArrayList<l>> c5132a;
        ThreadLocal<WeakReference<C5132a<ViewGroup, ArrayList<l>>>> threadLocal = f28045b;
        WeakReference<C5132a<ViewGroup, ArrayList<l>>> weakReference = threadLocal.get();
        if (weakReference != null && (c5132a = weakReference.get()) != null) {
            return c5132a;
        }
        C5132a<ViewGroup, ArrayList<l>> c5132a2 = new C5132a<>();
        threadLocal.set(new WeakReference<>(c5132a2));
        return c5132a2;
    }
}
