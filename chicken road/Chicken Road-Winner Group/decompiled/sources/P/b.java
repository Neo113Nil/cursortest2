package P;

import android.view.ViewGroup;
import e2.AbstractC0292g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1077a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1078b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1079c;

    public b(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        this.f1077a = container;
        this.f1078b = new ArrayList();
        this.f1079c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (!pVar.f1117a) {
                pVar.f1117a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
            e2.m.V(arrayList2, null);
        }
        List f0 = AbstractC0292g.f0(AbstractC0292g.h0(arrayList2));
        int size2 = f0.size();
        for (int i4 = 0; i4 < size2; i4++) {
            o oVar = (o) f0.get(i4);
            oVar.getClass();
            ViewGroup container = this.f1077a;
            kotlin.jvm.internal.j.e(container, "container");
            if (!oVar.f1116a) {
                oVar.b(container);
            }
            oVar.f1116a = true;
        }
    }
}
