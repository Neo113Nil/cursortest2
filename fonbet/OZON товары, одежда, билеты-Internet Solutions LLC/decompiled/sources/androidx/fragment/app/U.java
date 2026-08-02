package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class U implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f42995a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f42996b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f42997c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f42998d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T f42999e;

    U(T t2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f42999e = t2;
        this.f42995a = obj;
        this.f42996b = arrayList;
        this.f42997c = obj2;
        this.f42998d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        T t2 = this.f42999e;
        Object obj = this.f42995a;
        if (obj != null) {
            t2.u(obj, this.f42996b, null);
        }
        Object obj2 = this.f42997c;
        if (obj2 != null) {
            t2.u(obj2, this.f42998d, null);
        }
    }
}
