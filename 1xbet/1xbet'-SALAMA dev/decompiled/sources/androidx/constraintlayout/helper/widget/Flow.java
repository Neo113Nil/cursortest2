package androidx.constraintlayout.helper.widget;

import B.n;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import p149v.e;
import p149v.h;
import p149v.j;
import p149v.m;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public h f8793B;

    public Flow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f8793B = new h();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 0) {
                    this.f8793B.f17049Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar = this.f8793B;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f17071w0 = dimensionPixelSize;
                    hVar.f17072x0 = dimensionPixelSize;
                    hVar.f17073y0 = dimensionPixelSize;
                    hVar.f17074z0 = dimensionPixelSize;
                } else if (index == 18) {
                    h hVar2 = this.f8793B;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f17073y0 = dimensionPixelSize2;
                    hVar2.f17064A0 = dimensionPixelSize2;
                    hVar2.f17065B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f8793B.f17074z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f8793B.f17064A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f8793B.f17071w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f8793B.f17065B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f8793B.f17072x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f8793B.f17047X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f8793B.f17032H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f8793B.f17033I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f8793B.f17034J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f8793B.f17036L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f8793B.f17035K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f8793B.f17037M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f8793B.f17038N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f8793B.f17040P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f8793B.f17042R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f8793B.f17041Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f8793B.f17043S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f8793B.f17039O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f8793B.f17046V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f8793B.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f8793B.f17044T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f8793B.f17045U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f8793B.f17048Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8993d = this.f8793B;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(B.h hVar, j jVar, n nVar, SparseArray sparseArray) {
        super.l(hVar, jVar, nVar, sparseArray);
        if (jVar instanceof h) {
            h hVar2 = (h) jVar;
            int i7 = nVar.f722V;
            if (i7 != -1) {
                hVar2.f17049Z0 = i7;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(e eVar, boolean z4) {
        h hVar = this.f8793B;
        int i7 = hVar.f17073y0;
        if (i7 > 0 || hVar.f17074z0 > 0) {
            if (z4) {
                hVar.f17064A0 = hVar.f17074z0;
                hVar.f17065B0 = i7;
            } else {
                hVar.f17064A0 = i7;
                hVar.f17065B0 = hVar.f17074z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i7, int i8) {
        r(this.f8793B, i7, i8);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(m mVar, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.V(mode, size, mode2, size2);
            setMeasuredDimension(mVar.f17067D0, mVar.f17068E0);
        }
    }

    public void setFirstHorizontalBias(float f7) {
        this.f8793B.f17040P0 = f7;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.f8793B.f17034J0 = i7;
        requestLayout();
    }

    public void setFirstVerticalBias(float f7) {
        this.f8793B.f17041Q0 = f7;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.f8793B.f17035K0 = i7;
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.f8793B.f17046V0 = i7;
        requestLayout();
    }

    public void setHorizontalBias(float f7) {
        this.f8793B.f17038N0 = f7;
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.f8793B.f17044T0 = i7;
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.f8793B.f17032H0 = i7;
        requestLayout();
    }

    public void setLastHorizontalBias(float f7) {
        this.f8793B.f17042R0 = f7;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i7) {
        this.f8793B.f17036L0 = i7;
        requestLayout();
    }

    public void setLastVerticalBias(float f7) {
        this.f8793B.f17043S0 = f7;
        requestLayout();
    }

    public void setLastVerticalStyle(int i7) {
        this.f8793B.f17037M0 = i7;
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.f8793B.f17048Y0 = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.f8793B.f17049Z0 = i7;
        requestLayout();
    }

    public void setPadding(int i7) {
        h hVar = this.f8793B;
        hVar.f17071w0 = i7;
        hVar.f17072x0 = i7;
        hVar.f17073y0 = i7;
        hVar.f17074z0 = i7;
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.f8793B.f17072x0 = i7;
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.f8793B.f17064A0 = i7;
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.f8793B.f17065B0 = i7;
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.f8793B.f17071w0 = i7;
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.f8793B.W0 = i7;
        requestLayout();
    }

    public void setVerticalBias(float f7) {
        this.f8793B.f17039O0 = f7;
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.f8793B.f17045U0 = i7;
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.f8793B.f17033I0 = i7;
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.f8793B.f17047X0 = i7;
        requestLayout();
    }
}
