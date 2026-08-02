package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import m2.C8043a;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: a, reason: collision with root package name */
    private int f41590a;

    /* renamed from: b, reason: collision with root package name */
    private int f41591b;

    /* renamed from: c, reason: collision with root package name */
    private C8043a f41592c;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void g(m2.e eVar, int i11, boolean z11) {
        this.f41591b = i11;
        if (z11) {
            int i12 = this.f41590a;
            if (i12 == 5) {
                this.f41591b = 1;
            } else if (i12 == 6) {
                this.f41591b = 0;
            }
        } else {
            int i13 = this.f41590a;
            if (i13 == 5) {
                this.f41591b = 0;
            } else if (i13 == 6) {
                this.f41591b = 1;
            }
        }
        if (eVar instanceof C8043a) {
            ((C8043a) eVar).h1(this.f41591b);
        }
    }

    public final boolean a() {
        return this.f41592c.b1();
    }

    public final int b() {
        return this.f41592c.d1();
    }

    public final int c() {
        return this.f41590a;
    }

    public final void d(boolean z11) {
        this.f41592c.g1(z11);
    }

    public final void e(int i11) {
        this.f41592c.i1(i11);
    }

    public final void f(int i11) {
        this.f41590a = i11;
    }

    @Override // androidx.constraintlayout.widget.b
    protected final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.f41592c = new C8043a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f41845b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 26) {
                    this.f41590a = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f41592c.g1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == 27) {
                    this.f41592c.i1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.f41592c;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void loadParameters(d.a aVar, m2.j jVar, ConstraintLayout.b bVar, SparseArray<m2.e> sparseArray) {
        super.loadParameters(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof C8043a) {
            C8043a c8043a = (C8043a) jVar;
            g(c8043a, aVar.f41711e.f41767g0, ((m2.f) jVar.f74116W).l1());
            d.b bVar2 = aVar.f41711e;
            c8043a.g1(bVar2.f41783o0);
            c8043a.i1(bVar2.f41769h0);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public final void resolveRtl(m2.e eVar, boolean z11) {
        g(eVar, this.f41590a, z11);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
