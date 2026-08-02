package O10;

import P10.i;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f19857a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f19858b;

    public b(a aVar, List list) {
        this.f19857a = aVar;
        this.f19858b = list;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        c cVar;
        boolean z11;
        int i19;
        Integer num;
        c cVar2;
        view.removeOnLayoutChangeListener(this);
        a aVar = this.f19857a;
        cVar = aVar.f19842b;
        int b11 = cVar.b();
        z11 = aVar.f19845e;
        ?? r42 = this.f19858b;
        if (z11) {
            i19 = a.c(aVar, r42);
        } else {
            Iterator it = ((Iterable) r42).iterator();
            int i21 = 0;
            while (it.hasNext()) {
                i21 += ((View) it.next()).getMeasuredHeight();
            }
            i19 = i21;
        }
        float f7 = i19;
        if (b11 == -1) {
            aVar.f19843c.h(f7, f7);
            return;
        }
        View view2 = (View) C7714v.Z(r42);
        if (view2 != null) {
            e.a(view2);
            num = Integer.valueOf(d.c(view2));
        } else {
            num = null;
        }
        if (num != null) {
            i iVar = (i) C7714v.Q(num.intValue(), a.g(aVar));
            if (iVar != null) {
                int a11 = iVar.a();
                if (a11 < b11) {
                    aVar.f19843c.h(f7, f7);
                } else if (a11 == b11) {
                    Q10.a aVar2 = aVar.f19843c;
                    float measuredHeight = aVar.f19846f.getMeasuredHeight();
                    cVar2 = aVar.f19842b;
                    aVar2.h(f7, measuredHeight - cVar2.g());
                }
            }
        }
    }
}
