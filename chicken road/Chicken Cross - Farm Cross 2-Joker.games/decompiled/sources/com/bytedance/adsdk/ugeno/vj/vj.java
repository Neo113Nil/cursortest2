package com.bytedance.adsdk.ugeno.vj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.qf.qf;
import com.bytedance.adsdk.ugeno.vj.oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class vj extends ViewGroup implements com.bytedance.adsdk.ugeno.vj.pcc {
    private List<gm> dax;
    private SparseIntArray gbb;
    private int gm;
    private int[] hc;
    private oo jr;
    private Drawable kj;
    private oo.pcc lu;
    private com.bytedance.adsdk.ugeno.oo nac;
    private int oo;
    private int ork;
    private int pcc;
    private Drawable qf;
    private int sf;
    private int tmg;
    private int vh;
    private int vj;
    private int vy;
    private int wh;

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int pcc(View view) {
        return 0;
    }

    public vj(Context context) {
        super(context, null);
        this.wh = -1;
        this.jr = new oo(this);
        this.dax = new ArrayList();
        this.lu = new oo.pcc();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            int[] pcc2 = ooVar.pcc(i, i2);
            pcc(pcc2[0], pcc2[1]);
        } else {
            pcc(i, i2);
        }
        com.bytedance.adsdk.ugeno.oo ooVar2 = this.nac;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    private void pcc(int i, int i2) {
        if (this.gbb == null) {
            this.gbb = new SparseIntArray(getChildCount());
        }
        if (this.jr.sf(this.gbb)) {
            this.hc = this.jr.pcc(this.gbb);
        }
        int i3 = this.pcc;
        if (i3 == 0 || i3 == 1) {
            sf(i, i2);
        } else {
            if (i3 == 2 || i3 == 3) {
                gm(i, i2);
                return;
            }
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.pcc);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public View pcc(int i) {
        return getChildAt(i);
    }

    public View gm(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.hc;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public View sf(int i) {
        return gm(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.gbb == null) {
            this.gbb = new SparseIntArray(getChildCount());
        }
        this.hc = this.jr.pcc(view, i, layoutParams, this.gbb);
        super.addView(view, i, layoutParams);
    }

    private void sf(int i, int i2) {
        this.dax.clear();
        this.lu.pcc();
        this.jr.pcc(this.lu, i, i2);
        this.dax = this.lu.pcc;
        this.jr.pcc(i, i2);
        if (this.oo == 3) {
            for (gm gmVar : this.dax) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < gmVar.kj; i4++) {
                    View gm = gm(gmVar.jr + i4);
                    if (gm != null && gm.getVisibility() != 8) {
                        pcc pccVar = (pcc) gm.getLayoutParams();
                        if (this.sf != 2) {
                            i3 = Math.max(i3, gm.getMeasuredHeight() + Math.max(gmVar.tmg - gm.getBaseline(), pccVar.topMargin) + pccVar.bottomMargin);
                        } else {
                            i3 = Math.max(i3, gm.getMeasuredHeight() + pccVar.topMargin + Math.max((gmVar.tmg - gm.getMeasuredHeight()) + gm.getBaseline(), pccVar.bottomMargin));
                        }
                    }
                }
                gmVar.qf = i3;
            }
        }
        this.jr.sf(i, i2, getPaddingTop() + getPaddingBottom());
        this.jr.pcc();
        pcc(this.pcc, i, i2, this.lu.sf);
    }

    private void gm(int i, int i2) {
        this.dax.clear();
        this.lu.pcc();
        this.jr.sf(this.lu, i, i2);
        this.dax = this.lu.pcc;
        this.jr.pcc(i, i2);
        this.jr.sf(i, i2, getPaddingLeft() + getPaddingRight());
        this.jr.pcc();
        pcc(this.pcc, i, i2, this.lu.sf);
    }

    private void pcc(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getLargestMainSize() {
        Iterator<gm> it = this.dax.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, it.next().vj);
        }
        return i;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.dax.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            gm gmVar = this.dax.get(i4);
            if (oo(i4)) {
                if (pcc()) {
                    i2 = this.vh;
                } else {
                    i2 = this.tmg;
                }
                i3 += i2;
            }
            if (wh(i4)) {
                if (pcc()) {
                    i = this.vh;
                } else {
                    i = this.tmg;
                }
                i3 += i;
            }
            i3 += gmVar.qf;
        }
        return i3;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public boolean pcc() {
        int i = this.pcc;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.wh();
        }
        int pcc2 = qf.pcc(this);
        int i5 = this.pcc;
        if (i5 == 0) {
            pcc(pcc2 == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            pcc(pcc2 != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = pcc2 == 1;
            pcc(this.sf == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = pcc2 == 1;
            pcc(this.sf == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.pcc);
        }
        com.bytedance.adsdk.ugeno.oo ooVar2 = this.nac;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        float f4;
        int i10;
        char c2;
        int i11;
        pcc pccVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.dax.size();
        int i13 = 0;
        while (i13 < size) {
            gm gmVar = this.dax.get(i13);
            if (oo(i13)) {
                int i14 = this.vh;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = this.gm;
            char c3 = 4;
            int i16 = 1;
            if (i15 == 0) {
                f = paddingLeft;
                i5 = i12 - paddingRight;
            } else if (i15 == 1) {
                f = (i12 - gmVar.vj) + paddingRight;
                i5 = gmVar.vj - paddingLeft;
            } else if (i15 == 2) {
                f = paddingLeft + ((i12 - gmVar.vj) / 2.0f);
                f2 = (i12 - paddingRight) - ((i12 - gmVar.vj) / 2.0f);
                f3 = 0.0f;
                float max = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < gmVar.kj) {
                }
                paddingTop += gmVar.qf;
                paddingBottom -= gmVar.qf;
                i13++;
                paddingLeft = paddingLeft;
            } else {
                if (i15 == 3) {
                    f = paddingLeft;
                    f3 = (i12 - gmVar.vj) / (gmVar.sf() != 1 ? r10 - 1 : 1.0f);
                    f2 = i12 - paddingRight;
                } else if (i15 == 4) {
                    int sf = gmVar.sf();
                    f3 = sf != 0 ? (i12 - gmVar.vj) / sf : 0.0f;
                    float f5 = f3 / 2.0f;
                    f = paddingLeft + f5;
                    f2 = (i12 - paddingRight) - f5;
                } else if (i15 == 5) {
                    f3 = gmVar.sf() != 0 ? (i12 - gmVar.vj) / (r7 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (i12 - paddingRight) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.gm);
                }
                float max2 = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < gmVar.kj) {
                    int i17 = gmVar.jr + i6;
                    View gm = gm(i17);
                    if (gm == null) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i6;
                        c = c3;
                    } else if (gm.getVisibility() != 8) {
                        pcc pccVar2 = (pcc) gm.getLayoutParams();
                        float f6 = f + pccVar2.leftMargin;
                        float f7 = f2 - pccVar2.rightMargin;
                        if (oo(i17, i6)) {
                            int i18 = this.tmg;
                            float f8 = i18;
                            f6 += f8;
                            i10 = i18;
                            f4 = f7 - f8;
                        } else {
                            f4 = f7;
                            i10 = 0;
                        }
                        if (i6 == gmVar.kj - i16) {
                            c2 = 4;
                            if ((this.ork & 4) > 0) {
                                i11 = this.tmg;
                                if (this.sf == 2) {
                                    i7 = paddingLeft;
                                    i8 = i16;
                                    i9 = i6;
                                    pccVar = pccVar2;
                                    c = c2;
                                    if (z) {
                                        this.jr.pcc(gm, gmVar, Math.round(f4) - gm.getMeasuredWidth(), paddingTop, Math.round(f4), paddingTop + gm.getMeasuredHeight());
                                    } else {
                                        this.jr.pcc(gm, gmVar, Math.round(f6), paddingTop, Math.round(f6) + gm.getMeasuredWidth(), paddingTop + gm.getMeasuredHeight());
                                    }
                                } else if (z) {
                                    i8 = i16;
                                    i9 = i6;
                                    i7 = paddingLeft;
                                    pccVar = pccVar2;
                                    c = c2;
                                    this.jr.pcc(gm, gmVar, Math.round(f4) - gm.getMeasuredWidth(), paddingBottom - gm.getMeasuredHeight(), Math.round(f4), paddingBottom);
                                } else {
                                    i7 = paddingLeft;
                                    i8 = i16;
                                    i9 = i6;
                                    pccVar = pccVar2;
                                    c = c2;
                                    this.jr.pcc(gm, gmVar, Math.round(f6), paddingBottom - gm.getMeasuredHeight(), Math.round(f6) + gm.getMeasuredWidth(), paddingBottom);
                                }
                                f = f6 + gm.getMeasuredWidth() + max2 + pccVar.rightMargin;
                                float measuredWidth = f4 - ((gm.getMeasuredWidth() + max2) + pccVar.leftMargin);
                                if (!z) {
                                    gmVar.pcc(gm, i11, 0, i10, 0);
                                } else {
                                    gmVar.pcc(gm, i10, 0, i11, 0);
                                }
                                f2 = measuredWidth;
                            }
                        } else {
                            c2 = 4;
                        }
                        i11 = 0;
                        if (this.sf == 2) {
                        }
                        f = f6 + gm.getMeasuredWidth() + max2 + pccVar.rightMargin;
                        float measuredWidth2 = f4 - ((gm.getMeasuredWidth() + max2) + pccVar.leftMargin);
                        if (!z) {
                        }
                        f2 = measuredWidth2;
                    } else {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i6;
                        c = 4;
                    }
                    i6 = i9 + 1;
                    paddingLeft = i7;
                    i16 = i8;
                    c3 = c;
                }
                paddingTop += gmVar.qf;
                paddingBottom -= gmVar.qf;
                i13++;
                paddingLeft = paddingLeft;
            }
            f2 = i5;
            f3 = 0.0f;
            float max22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < gmVar.kj) {
            }
            paddingTop += gmVar.qf;
            paddingBottom -= gmVar.qf;
            i13++;
            paddingLeft = paddingLeft;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        int i7;
        boolean z3;
        char c;
        float f4;
        float f5;
        int i8;
        char c2;
        int i9;
        pcc pccVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.dax.size();
        for (int i12 = 0; i12 < size; i12++) {
            gm gmVar = this.dax.get(i12);
            if (oo(i12)) {
                int i13 = this.tmg;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = this.gm;
            char c3 = 4;
            boolean z4 = true;
            if (i14 == 0) {
                f = paddingTop;
                i5 = i10 - paddingBottom;
            } else if (i14 == 1) {
                f = (i10 - gmVar.vj) + paddingBottom;
                i5 = gmVar.vj - paddingTop;
            } else if (i14 == 2) {
                f = ((i10 - gmVar.vj) / 2.0f) + paddingTop;
                f2 = (i10 - paddingBottom) - ((i10 - gmVar.vj) / 2.0f);
                f3 = 0.0f;
                float max = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < gmVar.kj) {
                }
                paddingLeft += gmVar.qf;
                i11 -= gmVar.qf;
            } else {
                if (i14 == 3) {
                    f = paddingTop;
                    f3 = (i10 - gmVar.vj) / (gmVar.sf() != 1 ? r7 - 1 : 1.0f);
                    f2 = i10 - paddingBottom;
                } else if (i14 == 4) {
                    int sf = gmVar.sf();
                    f3 = sf != 0 ? (i10 - gmVar.vj) / sf : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (i10 - paddingBottom) - f6;
                } else if (i14 == 5) {
                    f3 = gmVar.sf() != 0 ? (i10 - gmVar.vj) / (r10 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i10 - paddingBottom) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.gm);
                }
                float max2 = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < gmVar.kj) {
                    int i15 = gmVar.jr + i6;
                    View gm = gm(i15);
                    if (gm == null) {
                        i7 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (gm.getVisibility() != 8) {
                        pcc pccVar2 = (pcc) gm.getLayoutParams();
                        float f7 = f + pccVar2.topMargin;
                        float f8 = f2 - pccVar2.bottomMargin;
                        if (oo(i15, i6)) {
                            int i16 = this.vh;
                            float f9 = i16;
                            f4 = f7 + f9;
                            i8 = i16;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        if (i6 == gmVar.kj - 1) {
                            c2 = 4;
                            if ((this.vy & 4) > 0) {
                                i9 = this.vh;
                                if (z) {
                                    i7 = i6;
                                    z3 = true;
                                    pccVar = pccVar2;
                                    c = c2;
                                    if (z2) {
                                        this.jr.pcc(gm, gmVar, false, paddingLeft, Math.round(f5) - gm.getMeasuredHeight(), paddingLeft + gm.getMeasuredWidth(), Math.round(f5));
                                    } else {
                                        this.jr.pcc(gm, gmVar, false, paddingLeft, Math.round(f4), paddingLeft + gm.getMeasuredWidth(), Math.round(f4) + gm.getMeasuredHeight());
                                    }
                                } else if (z2) {
                                    i7 = i6;
                                    z3 = true;
                                    pccVar = pccVar2;
                                    c = c2;
                                    this.jr.pcc(gm, gmVar, true, i11 - gm.getMeasuredWidth(), Math.round(f5) - gm.getMeasuredHeight(), i11, Math.round(f5));
                                } else {
                                    i7 = i6;
                                    z3 = true;
                                    pccVar = pccVar2;
                                    c = c2;
                                    this.jr.pcc(gm, gmVar, true, i11 - gm.getMeasuredWidth(), Math.round(f4), i11, Math.round(f4) + gm.getMeasuredHeight());
                                }
                                pcc pccVar3 = pccVar;
                                float measuredHeight = f4 + gm.getMeasuredHeight() + max2 + pccVar3.bottomMargin;
                                float measuredHeight2 = f5 - ((gm.getMeasuredHeight() + max2) + pccVar3.topMargin);
                                if (!z2) {
                                    gmVar.pcc(gm, 0, i9, 0, i8);
                                } else {
                                    gmVar.pcc(gm, 0, i8, 0, i9);
                                }
                                f = measuredHeight;
                                f2 = measuredHeight2;
                            }
                        } else {
                            c2 = 4;
                        }
                        i9 = 0;
                        if (z) {
                        }
                        pcc pccVar32 = pccVar;
                        float measuredHeight3 = f4 + gm.getMeasuredHeight() + max2 + pccVar32.bottomMargin;
                        float measuredHeight22 = f5 - ((gm.getMeasuredHeight() + max2) + pccVar32.topMargin);
                        if (!z2) {
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight22;
                    } else {
                        i7 = i6;
                        z3 = true;
                        c = 4;
                    }
                    i6 = i7 + 1;
                    z4 = z3;
                    c3 = c;
                }
                paddingLeft += gmVar.qf;
                i11 -= gmVar.qf;
            }
            f2 = i5;
            f3 = 0.0f;
            float max22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < gmVar.kj) {
            }
            paddingLeft += gmVar.qf;
            i11 -= gmVar.qf;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.kj == null && this.qf == null) {
            return;
        }
        if (this.vy == 0 && this.ork == 0) {
            return;
        }
        int pcc2 = qf.pcc(this);
        int i = this.pcc;
        if (i == 0) {
            pcc(canvas, pcc2 == 1, this.sf == 2);
            return;
        }
        if (i == 1) {
            pcc(canvas, pcc2 != 1, this.sf == 2);
            return;
        }
        if (i == 2) {
            boolean z = pcc2 == 1;
            if (this.sf == 2) {
                z = !z;
            }
            sf(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = pcc2 == 1;
        if (this.sf == 2) {
            z2 = !z2;
        }
        sf(canvas, z2, true);
    }

    private void pcc(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.dax.size();
        for (int i3 = 0; i3 < size; i3++) {
            gm gmVar = this.dax.get(i3);
            for (int i4 = 0; i4 < gmVar.kj; i4++) {
                int i5 = gmVar.jr + i4;
                View gm = gm(i5);
                if (gm != null && gm.getVisibility() != 8) {
                    pcc pccVar = (pcc) gm.getLayoutParams();
                    if (oo(i5, i4)) {
                        if (z) {
                            left = gm.getRight() + pccVar.rightMargin;
                        } else {
                            left = (gm.getLeft() - pccVar.leftMargin) - this.tmg;
                        }
                        pcc(canvas, left, gmVar.sf, gmVar.qf);
                    }
                    if (i4 == gmVar.kj - 1 && (this.ork & 4) > 0) {
                        if (z) {
                            right = (gm.getLeft() - pccVar.leftMargin) - this.tmg;
                        } else {
                            right = gm.getRight() + pccVar.rightMargin;
                        }
                        pcc(canvas, right, gmVar.sf, gmVar.qf);
                    }
                }
            }
            if (oo(i3)) {
                if (z2) {
                    i2 = gmVar.oo;
                } else {
                    i2 = gmVar.sf - this.vh;
                }
                sf(canvas, paddingLeft, i2, max);
            }
            if (wh(i3) && (this.vy & 4) > 0) {
                if (z2) {
                    i = gmVar.sf - this.vh;
                } else {
                    i = gmVar.oo;
                }
                sf(canvas, paddingLeft, i, max);
            }
        }
    }

    private void sf(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.dax.size();
        for (int i3 = 0; i3 < size; i3++) {
            gm gmVar = this.dax.get(i3);
            for (int i4 = 0; i4 < gmVar.kj; i4++) {
                int i5 = gmVar.jr + i4;
                View gm = gm(i5);
                if (gm != null && gm.getVisibility() != 8) {
                    pcc pccVar = (pcc) gm.getLayoutParams();
                    if (oo(i5, i4)) {
                        if (z2) {
                            top = gm.getBottom() + pccVar.bottomMargin;
                        } else {
                            top = (gm.getTop() - pccVar.topMargin) - this.vh;
                        }
                        sf(canvas, gmVar.pcc, top, gmVar.qf);
                    }
                    if (i4 == gmVar.kj - 1 && (this.vy & 4) > 0) {
                        if (z2) {
                            bottom = (gm.getTop() - pccVar.topMargin) - this.vh;
                        } else {
                            bottom = gm.getBottom() + pccVar.bottomMargin;
                        }
                        sf(canvas, gmVar.pcc, bottom, gmVar.qf);
                    }
                }
            }
            if (oo(i3)) {
                if (z) {
                    i2 = gmVar.gm;
                } else {
                    i2 = gmVar.pcc - this.tmg;
                }
                pcc(canvas, i2, paddingTop, max);
            }
            if (wh(i3) && (this.ork & 4) > 0) {
                if (z) {
                    i = gmVar.pcc - this.tmg;
                } else {
                    i = gmVar.gm;
                }
                pcc(canvas, i, paddingTop, max);
            }
        }
    }

    private void pcc(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.kj;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.tmg + i, i3 + i2);
        this.kj.draw(canvas);
    }

    private void sf(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.qf;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.vh + i2);
        this.qf.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pcc;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof pcc) {
            return new pcc((pcc) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new pcc((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new pcc(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getFlexDirection() {
        return this.pcc;
    }

    public void setFlexDirection(int i) {
        if (this.pcc != i) {
            this.pcc = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getFlexWrap() {
        return this.sf;
    }

    public void setFlexWrap(int i) {
        if (this.sf != i) {
            this.sf = i;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.gm;
    }

    public void setJustifyContent(int i) {
        if (this.gm != i) {
            this.gm = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getAlignItems() {
        return this.oo;
    }

    public void setAlignItems(int i) {
        if (this.oo != i) {
            this.oo = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getAlignContent() {
        return this.vj;
    }

    public void setAlignContent(int i) {
        if (this.vj != i) {
            this.vj = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getMaxLine() {
        return this.wh;
    }

    public void setMaxLine(int i) {
        if (this.wh != i) {
            this.wh = i;
            requestLayout();
        }
    }

    public List<gm> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.dax.size());
        for (gm gmVar : this.dax) {
            if (gmVar.sf() != 0) {
                arrayList.add(gmVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int pcc(View view, int i, int i2) {
        int i3;
        int i4;
        if (pcc()) {
            i3 = oo(i, i2) ? this.tmg : 0;
            if ((this.ork & 4) <= 0) {
                return i3;
            }
            i4 = this.tmg;
        } else {
            i3 = oo(i, i2) ? this.vh : 0;
            if ((this.vy & 4) <= 0) {
                return i3;
            }
            i4 = this.vh;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public void pcc(gm gmVar) {
        if (pcc()) {
            if ((this.ork & 4) > 0) {
                gmVar.vj += this.tmg;
                gmVar.wh += this.tmg;
                return;
            }
            return;
        }
        if ((this.vy & 4) > 0) {
            gmVar.vj += this.vh;
            gmVar.wh += this.vh;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int pcc(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int sf(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public void pcc(View view, int i, int i2, gm gmVar) {
        if (oo(i, i2)) {
            if (pcc()) {
                gmVar.vj += this.tmg;
                gmVar.wh += this.tmg;
            } else {
                gmVar.vj += this.vh;
                gmVar.wh += this.vh;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public void setFlexLines(List<gm> list) {
        this.dax = list;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public List<gm> getFlexLinesInternal() {
        return this.dax;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.qf;
    }

    public Drawable getDividerDrawableVertical() {
        return this.kj;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.qf) {
            return;
        }
        this.qf = drawable;
        if (drawable != null) {
            this.vh = drawable.getIntrinsicHeight();
        } else {
            this.vh = 0;
        }
        sf();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.kj) {
            return;
        }
        this.kj = drawable;
        if (drawable != null) {
            this.tmg = drawable.getIntrinsicWidth();
        } else {
            this.tmg = 0;
        }
        sf();
        requestLayout();
    }

    public int getShowDividerVertical() {
        return this.ork;
    }

    public int getShowDividerHorizontal() {
        return this.vy;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.ork) {
            this.ork = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.vy) {
            this.vy = i;
            requestLayout();
        }
    }

    private void sf() {
        if (this.qf == null && this.kj == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean oo(int i, int i2) {
        return vj(i, i2) ? pcc() ? (this.ork & 1) != 0 : (this.vy & 1) != 0 : pcc() ? (this.ork & 2) != 0 : (this.vy & 2) != 0;
    }

    private boolean vj(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View gm = gm(i - i3);
            if (gm != null && gm.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean oo(int i) {
        if (i >= 0 && i < this.dax.size()) {
            if (vj(i)) {
                return pcc() ? (this.vy & 1) != 0 : (this.ork & 1) != 0;
            }
            if (pcc()) {
                return (this.vy & 2) != 0;
            }
            if ((this.ork & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean vj(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.dax.get(i2).sf() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean wh(int i) {
        if (i >= 0 && i < this.dax.size()) {
            for (int i2 = i + 1; i2 < this.dax.size(); i2++) {
                if (this.dax.get(i2).sf() > 0) {
                    return false;
                }
            }
            if (pcc()) {
                return (this.vy & 4) != 0;
            }
            if ((this.ork & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class pcc extends ViewGroup.MarginLayoutParams implements sf {
        public static final Parcelable.Creator<pcc> CREATOR = new Parcelable.Creator<pcc>() { // from class: com.bytedance.adsdk.ugeno.vj.vj.pcc.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public pcc createFromParcel(Parcel parcel) {
                return new pcc(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public pcc[] newArray(int i) {
                return new pcc[i];
            }
        };
        private float gm;
        private int kj;
        private int oo;
        private boolean ork;
        private int pcc;
        private int qf;
        private float sf;
        private float vj;
        private int vy;
        private int wh;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public pcc(pcc pccVar) {
            super((ViewGroup.MarginLayoutParams) pccVar);
            this.pcc = 1;
            this.sf = 0.0f;
            this.gm = 0.0f;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = ViewCompat.MEASURED_SIZE_MASK;
            this.vy = ViewCompat.MEASURED_SIZE_MASK;
            this.pcc = pccVar.pcc;
            this.sf = pccVar.sf;
            this.gm = pccVar.gm;
            this.oo = pccVar.oo;
            this.vj = pccVar.vj;
            this.wh = pccVar.wh;
            this.qf = pccVar.qf;
            this.kj = pccVar.kj;
            this.vy = pccVar.vy;
            this.ork = pccVar.ork;
        }

        public pcc(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.pcc = 1;
            this.sf = 0.0f;
            this.gm = 0.0f;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = ViewCompat.MEASURED_SIZE_MASK;
            this.vy = ViewCompat.MEASURED_SIZE_MASK;
        }

        public pcc(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.pcc = 1;
            this.sf = 0.0f;
            this.gm = 0.0f;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = ViewCompat.MEASURED_SIZE_MASK;
            this.vy = ViewCompat.MEASURED_SIZE_MASK;
        }

        public pcc(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.pcc = 1;
            this.sf = 0.0f;
            this.gm = 0.0f;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = ViewCompat.MEASURED_SIZE_MASK;
            this.vy = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int pcc() {
            return this.width;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int sf() {
            return this.height;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int gm() {
            return this.pcc;
        }

        public void gm(int i) {
            this.pcc = i;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public float oo() {
            return this.sf;
        }

        public void pcc(float f) {
            this.sf = f;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public float vj() {
            return this.gm;
        }

        public void sf(float f) {
            this.gm = f;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int wh() {
            return this.oo;
        }

        public void oo(int i) {
            this.oo = i;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int qf() {
            return this.wh;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public void pcc(int i) {
            this.wh = i;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int kj() {
            return this.qf;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public void sf(int i) {
            this.qf = i;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int vy() {
            return this.kj;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int ork() {
            return this.vy;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public boolean vh() {
            return this.ork;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public float tmg() {
            return this.vj;
        }

        public void gm(float f) {
            this.vj = f;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int hc() {
            return this.leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int gbb() {
            return this.topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int jr() {
            return this.rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int dax() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.pcc);
            parcel.writeFloat(this.sf);
            parcel.writeFloat(this.gm);
            parcel.writeInt(this.oo);
            parcel.writeFloat(this.vj);
            parcel.writeInt(this.wh);
            parcel.writeInt(this.qf);
            parcel.writeInt(this.kj);
            parcel.writeInt(this.vy);
            parcel.writeByte(this.ork ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected pcc(Parcel parcel) {
            super(0, 0);
            this.pcc = 1;
            this.sf = 0.0f;
            this.gm = 0.0f;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = ViewCompat.MEASURED_SIZE_MASK;
            this.vy = ViewCompat.MEASURED_SIZE_MASK;
            this.pcc = parcel.readInt();
            this.sf = parcel.readFloat();
            this.gm = parcel.readFloat();
            this.oo = parcel.readInt();
            this.vj = parcel.readFloat();
            this.wh = parcel.readInt();
            this.qf = parcel.readInt();
            this.kj = parcel.readInt();
            this.vy = parcel.readInt();
            this.ork = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.nac = gmVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }
}
