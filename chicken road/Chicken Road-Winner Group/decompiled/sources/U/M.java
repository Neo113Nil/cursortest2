package U;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1510a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f1511b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f1512c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f1513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1514e;

    public M(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f1514e = staggeredGridLayoutManager;
        this.f1513d = i3;
    }

    public final int a(int i3) {
        int i4 = this.f1512c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f1510a.size() == 0) {
            return i3;
        }
        View view = (View) this.f1510a.get(r3.size() - 1);
        I i5 = (I) view.getLayoutParams();
        this.f1512c = this.f1514e.f2428j.b(view);
        i5.getClass();
        return this.f1512c;
    }
}
