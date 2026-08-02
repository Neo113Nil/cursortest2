package n1;

import A0.X0;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import g1.C1968b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class L extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1674uy f18378a;

    /* renamed from: b, reason: collision with root package name */
    public List f18379b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f18380c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18381d;

    public L(AbstractC1674uy abstractC1674uy) {
        super(abstractC1674uy.f15938k);
        this.f18381d = new HashMap();
        this.f18378a = abstractC1674uy;
    }

    public final O a(WindowInsetsAnimation windowInsetsAnimation) {
        O o5 = (O) this.f18381d.get(windowInsetsAnimation);
        if (o5 != null) {
            return o5;
        }
        O o6 = new O(0, null, 0L);
        o6.f18387a = new M(windowInsetsAnimation);
        this.f18381d.put(windowInsetsAnimation, o6);
        return o6;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f18378a.a(a(windowInsetsAnimation));
        this.f18381d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f18378a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f18380c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f18380c = arrayList2;
            this.f18379b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation h3 = K.h(list.get(size));
            O a5 = a(h3);
            fraction = h3.getFraction();
            a5.f18387a.e(fraction);
            this.f18380c.add(a5);
        }
        return this.f18378a.c(k0.c(null, windowInsets), this.f18379b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        G.v d5 = this.f18378a.d(a(windowInsetsAnimation), new G.v(bounds));
        d5.getClass();
        X0.l();
        return X0.h(((C1968b) d5.f1749l).d(), ((C1968b) d5.f1750m).d());
    }
}
