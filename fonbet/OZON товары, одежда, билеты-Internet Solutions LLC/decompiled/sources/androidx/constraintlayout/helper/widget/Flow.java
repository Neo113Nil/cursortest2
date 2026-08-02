package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.l;
import m2.e;
import m2.g;
import m2.j;
import m2.m;

/* loaded from: classes8.dex */
public class Flow extends l {
    private g mFlow;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.b
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mFlow = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f41845b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.mFlow.c2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.mFlow.m1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 18) {
                    this.mFlow.r1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 19) {
                    this.mFlow.o1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 2) {
                    this.mFlow.p1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.mFlow.s1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.mFlow.q1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.mFlow.n1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 54) {
                    this.mFlow.h2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 44) {
                    this.mFlow.W1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 53) {
                    this.mFlow.g2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 38) {
                    this.mFlow.Q1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 46) {
                    this.mFlow.Y1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 40) {
                    this.mFlow.S1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 48) {
                    this.mFlow.a2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 42) {
                    this.mFlow.U1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 37) {
                    this.mFlow.P1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 45) {
                    this.mFlow.X1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 39) {
                    this.mFlow.R1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 47) {
                    this.mFlow.Z1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 51) {
                    this.mFlow.e2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 41) {
                    this.mFlow.T1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == 50) {
                    this.mFlow.d2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == 43) {
                    this.mFlow.V1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 52) {
                    this.mFlow.f2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 49) {
                    this.mFlow.b2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.b
    public void loadParameters(d.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray<e> sparseArray) {
        super.loadParameters(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i11 = bVar.f41615V;
            if (i11 != -1) {
                gVar.c2(i11);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i11, int i12) {
        onMeasure(this.mFlow, i11, i12);
    }

    @Override // androidx.constraintlayout.widget.b
    public void resolveRtl(e eVar, boolean z11) {
        this.mFlow.a1(z11);
    }

    public void setHorizontalAlign(int i11) {
        this.mFlow.T1(i11);
        requestLayout();
    }

    public void setHorizontalBias(float f7) {
        this.mFlow.U1(f7);
        requestLayout();
    }

    public void setHorizontalGap(int i11) {
        this.mFlow.V1(i11);
        requestLayout();
    }

    public void setHorizontalStyle(int i11) {
        this.mFlow.W1(i11);
        requestLayout();
    }

    public void setOrientation(int i11) {
        this.mFlow.c2(i11);
        requestLayout();
    }

    public void setPaddingBottom(int i11) {
        this.mFlow.n1(i11);
        requestLayout();
    }

    public void setPaddingLeft(int i11) {
        this.mFlow.p1(i11);
        requestLayout();
    }

    public void setPaddingRight(int i11) {
        this.mFlow.q1(i11);
        requestLayout();
    }

    public void setPaddingTop(int i11) {
        this.mFlow.s1(i11);
        requestLayout();
    }

    public void setVerticalAlign(int i11) {
        this.mFlow.d2(i11);
        requestLayout();
    }

    public void setVerticalGap(int i11) {
        this.mFlow.f2(i11);
        requestLayout();
    }

    public void setVerticalStyle(int i11) {
        this.mFlow.g2(i11);
        requestLayout();
    }

    public void setWrapMode(int i11) {
        this.mFlow.h2(i11);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.l
    public void onMeasure(m mVar, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.h1(mode, size, mode2, size2);
            setMeasuredDimension(mVar.c1(), mVar.b1());
        }
    }

    public Flow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
