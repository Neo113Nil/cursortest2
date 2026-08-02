package Qe0;

import android.animation.ValueAnimator;
import eg.s;
import eg.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.M;

/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M f23381a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f23382b;

    public d(M m11, u uVar) {
        this.f23381a = m11;
        this.f23382b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f7 = (Float) Bi.a.b(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float");
        M m11 = this.f23381a;
        List list = (List) m11.f71787a;
        ?? arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            u uVar = this.f23382b;
            if (!hasNext) {
                uVar.u(arrayList);
                m11.f71787a = arrayList;
                return;
            }
            s sVar = (s) it.next();
            if (uVar.l().b(sVar.b()) != null) {
                sVar.r(f7);
            } else {
                sVar = null;
            }
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
    }
}
