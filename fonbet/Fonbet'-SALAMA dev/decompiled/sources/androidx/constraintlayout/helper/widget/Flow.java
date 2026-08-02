package androidx.constraintlayout.helper.widget;

import B.h;
import B.n;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import v.AbstractC1662m;
import v.C1654e;
import v.C1657h;
import v.C1659j;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: B, reason: collision with root package name */
    public C1657h f8793B;

    public Flow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f8793B = new C1657h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 0) {
                    this.f8793B.f17043Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1657h c1657h = this.f8793B;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1657h.f17065w0 = dimensionPixelSize;
                    c1657h.f17066x0 = dimensionPixelSize;
                    c1657h.f17067y0 = dimensionPixelSize;
                    c1657h.f17068z0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1657h c1657h2 = this.f8793B;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1657h2.f17067y0 = dimensionPixelSize2;
                    c1657h2.f17058A0 = dimensionPixelSize2;
                    c1657h2.f17059B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f8793B.f17068z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f8793B.f17058A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f8793B.f17065w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f8793B.f17059B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f8793B.f17066x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f8793B.f17041X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f8793B.f17026H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f8793B.f17027I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f8793B.f17028J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f8793B.f17030L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f8793B.f17029K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f8793B.f17031M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f8793B.f17032N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f8793B.f17034P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f8793B.f17036R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f8793B.f17035Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f8793B.f17037S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f8793B.f17033O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f8793B.f17040V0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f8793B.W0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f8793B.f17038T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f8793B.f17039U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f8793B.f17042Y0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8993d = this.f8793B;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(h hVar, C1659j c1659j, n nVar, SparseArray sparseArray) {
        super.l(hVar, c1659j, nVar, sparseArray);
        if (c1659j instanceof C1657h) {
            C1657h c1657h = (C1657h) c1659j;
            int i7 = nVar.f722V;
            if (i7 != -1) {
                c1657h.f17043Z0 = i7;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(C1654e c1654e, boolean z4) {
        C1657h c1657h = this.f8793B;
        int i7 = c1657h.f17067y0;
        if (i7 > 0 || c1657h.f17068z0 > 0) {
            if (z4) {
                c1657h.f17058A0 = c1657h.f17068z0;
                c1657h.f17059B0 = i7;
            } else {
                c1657h.f17058A0 = i7;
                c1657h.f17059B0 = c1657h.f17068z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i7, int i8) {
        r(this.f8793B, i7, i8);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(AbstractC1662m abstractC1662m, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (abstractC1662m == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC1662m.V(mode, size, mode2, size2);
            setMeasuredDimension(abstractC1662m.f17061D0, abstractC1662m.f17062E0);
        }
    }

    public void setFirstHorizontalBias(float f7) {
        this.f8793B.f17034P0 = f7;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.f8793B.f17028J0 = i7;
        requestLayout();
    }

    public void setFirstVerticalBias(float f7) {
        this.f8793B.f17035Q0 = f7;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.f8793B.f17029K0 = i7;
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.f8793B.f17040V0 = i7;
        requestLayout();
    }

    public void setHorizontalBias(float f7) {
        this.f8793B.f17032N0 = f7;
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.f8793B.f17038T0 = i7;
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.f8793B.f17026H0 = i7;
        requestLayout();
    }

    public void setLastHorizontalBias(float f7) {
        this.f8793B.f17036R0 = f7;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i7) {
        this.f8793B.f17030L0 = i7;
        requestLayout();
    }

    public void setLastVerticalBias(float f7) {
        this.f8793B.f17037S0 = f7;
        requestLayout();
    }

    public void setLastVerticalStyle(int i7) {
        this.f8793B.f17031M0 = i7;
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.f8793B.f17042Y0 = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.f8793B.f17043Z0 = i7;
        requestLayout();
    }

    public void setPadding(int i7) {
        C1657h c1657h = this.f8793B;
        c1657h.f17065w0 = i7;
        c1657h.f17066x0 = i7;
        c1657h.f17067y0 = i7;
        c1657h.f17068z0 = i7;
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.f8793B.f17066x0 = i7;
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.f8793B.f17058A0 = i7;
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.f8793B.f17059B0 = i7;
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.f8793B.f17065w0 = i7;
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.f8793B.W0 = i7;
        requestLayout();
    }

    public void setVerticalBias(float f7) {
        this.f8793B.f17033O0 = f7;
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.f8793B.f17039U0 = i7;
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.f8793B.f17027I0 = i7;
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.f8793B.f17041X0 = i7;
        requestLayout();
    }
}
