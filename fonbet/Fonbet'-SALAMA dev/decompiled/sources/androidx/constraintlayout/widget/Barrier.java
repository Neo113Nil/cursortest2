package androidx.constraintlayout.widget;

import B.h;
import B.i;
import B.n;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.HashMap;
import v.C1650a;
import v.C1654e;
import v.C1655f;
import v.C1659j;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: A, reason: collision with root package name */
    public int f8987A;

    /* renamed from: B, reason: collision with root package name */
    public C1650a f8988B;

    /* renamed from: z, reason: collision with root package name */
    public int f8989z;

    public Barrier(Context context) {
        super(context);
        this.f8990a = new int[32];
        this.f8996x = null;
        this.f8997y = new HashMap();
        this.f8992c = context;
        k(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f8988B.f16884x0;
    }

    public int getMargin() {
        return this.f8988B.f16885y0;
    }

    public int getType() {
        return this.f8989z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f8988B = new C1650a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f8988B.f16884x0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f8988B.f16885y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8993d = this.f8988B;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(h hVar, C1659j c1659j, n nVar, SparseArray sparseArray) {
        super.l(hVar, c1659j, nVar, sparseArray);
        if (c1659j instanceof C1650a) {
            C1650a c1650a = (C1650a) c1659j;
            boolean z4 = ((C1655f) c1659j.f16938V).f17008z0;
            i iVar = hVar.f801e;
            r(c1650a, iVar.f844g0, z4);
            c1650a.f16884x0 = iVar.f859o0;
            c1650a.f16885y0 = iVar.f846h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(C1654e c1654e, boolean z4) {
        r(c1654e, this.f8989z, z4);
    }

    public final void r(C1654e c1654e, int i7, boolean z4) {
        this.f8987A = i7;
        if (z4) {
            int i8 = this.f8989z;
            if (i8 == 5) {
                this.f8987A = 1;
            } else if (i8 == 6) {
                this.f8987A = 0;
            }
        } else {
            int i9 = this.f8989z;
            if (i9 == 5) {
                this.f8987A = 0;
            } else if (i9 == 6) {
                this.f8987A = 1;
            }
        }
        if (c1654e instanceof C1650a) {
            ((C1650a) c1654e).f16883w0 = this.f8987A;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f8988B.f16884x0 = z4;
    }

    public void setDpMargin(int i7) {
        this.f8988B.f16885y0 = (int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i7) {
        this.f8988B.f16885y0 = i7;
    }

    public void setType(int i7) {
        this.f8989z = i7;
    }

    public Barrier(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        super.setVisibility(8);
    }
}
