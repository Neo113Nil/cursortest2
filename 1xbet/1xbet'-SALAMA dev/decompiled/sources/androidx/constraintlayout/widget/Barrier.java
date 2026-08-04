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
import p149v.a;
import p149v.e;
import p149v.f;
import p149v.j;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8987A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a f8988B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
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
        return this.f8988B.f16890x0;
    }

    public int getMargin() {
        return this.f8988B.f16891y0;
    }

    public int getType() {
        return this.f8989z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f8988B = new a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f8988B.f16890x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f8988B.f16891y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8993d = this.f8988B;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(h hVar, j jVar, n nVar, SparseArray sparseArray) {
        super.l(hVar, jVar, nVar, sparseArray);
        if (jVar instanceof a) {
            a aVar = (a) jVar;
            boolean z4 = ((f) jVar.f16944V).f17014z0;
            i iVar = hVar.f801e;
            r(aVar, iVar.f844g0, z4);
            aVar.f16890x0 = iVar.f859o0;
            aVar.f16891y0 = iVar.f846h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(e eVar, boolean z4) {
        r(eVar, this.f8989z, z4);
    }

    public final void r(e eVar, int i7, boolean z4) {
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
        if (eVar instanceof a) {
            ((a) eVar).f16889w0 = this.f8987A;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f8988B.f16890x0 = z4;
    }

    public void setDpMargin(int i7) {
        this.f8988B.f16891y0 = (int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i7) {
        this.f8988B.f16891y0 = i7;
    }

    public void setType(int i7) {
        this.f8989z = i7;
    }

    public Barrier(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        super.setVisibility(8);
    }
}
