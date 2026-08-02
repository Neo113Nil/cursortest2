package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class P implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f9367a;

    public P(Q q7) {
        this.f9367a = q7;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Q q7 = this.f9367a;
        ArrayList arrayList3 = q7.f9386d;
        C0702a c0702a = (C0702a) arrayList3.get(arrayList3.size() - 1);
        q7.f9390h = c0702a;
        Iterator it = c0702a.f9431a.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = ((W) it.next()).f9420b;
            if (abstractComponentCallbacksC0722v != null) {
                abstractComponentCallbacksC0722v.f9507D = true;
            }
        }
        boolean R6 = q7.R(arrayList, arrayList2, -1, 0);
        if (!q7.f9394m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(Q.F((C0702a) it2.next()));
            }
            Iterator it3 = q7.f9394m.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return R6;
    }
}
