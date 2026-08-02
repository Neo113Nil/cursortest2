package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import live.football.scorerepublic.R;
import p000.AbstractC0612qb;
import p000.C0270h1;
import p000.C0678s3;
import p000.af0;
import p000.ci1;
import p000.m80;
import p000.ol0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ModalLayoutPortrait extends AbstractC0612qb {

    /* JADX INFO: renamed from: n */
    public final C0678s3 f1381n;

    /* JADX INFO: renamed from: o */
    public int f1382o;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0678s3 c0678s3 = new C0678s3();
        c0678s3.f7022k = new ArrayList();
        c0678s3.f7021j = 0;
        this.f1381n = c0678s3;
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = getVisibleChildren().get(i7);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i8 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i9 = (i3 - i) / 2;
                int i10 = measuredWidth / 2;
                i6 = i9 - i10;
                i5 = i9 + i10;
            } else {
                i5 = paddingLeft + measuredWidth;
                i6 = paddingLeft;
            }
            m80.m3343j("Layout child " + i7);
            m80.m3345l("\t(top, bottom)", (float) paddingTop, (float) i8);
            m80.m3345l("\t(left, right)", (float) i6, (float) i5);
            view.layout(i6, paddingTop, i5, i8);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i7 < size - 1) {
                measuredHeight2 += this.f1382o;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        this.f1382o = (int) Math.floor(TypedValue.applyDimension(1, 24.0f, this.f6448l));
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iM4050b = m4050b(i);
        int iM4049a = m4049a(i2);
        int size = ((getVisibleChildren().size() - 1) * this.f1382o) + paddingTop;
        C0678s3 c0678s3 = this.f1381n;
        c0678s3.getClass();
        c0678s3.f7021j = iM4049a;
        c0678s3.f7022k = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            boolean z = childAt.getId() == R.id.body_scroll || childAt.getId() == R.id.image_view;
            ci1 ci1Var = new ci1();
            ci1Var.f1262a = childAt;
            ci1Var.f1263b = z;
            ci1Var.f1264c = c0678s3.f7021j;
            ((ArrayList) c0678s3.f7022k).add(ci1Var);
        }
        m80.m3343j("Screen dimens: " + getDisplayMetrics());
        m80.m3345l("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f2 = (float) iM4050b;
        m80.m3345l("Base dimens", f2, iM4049a);
        ArrayList arrayList = (ArrayList) c0678s3.f7022k;
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            m80.m3343j("Pre-measure child");
            af0.m191f(((ci1) obj).f1262a, iM4050b, iM4049a, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        ArrayList arrayList2 = (ArrayList) c0678s3.f7022k;
        int size3 = arrayList2.size();
        int iM947a = 0;
        int i5 = 0;
        while (i5 < size3) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            iM947a += ((ci1) obj2).m947a();
        }
        int i6 = iM947a + size;
        m80.m3344k("Total reserved height", size);
        m80.m3344k("Total desired height", i6);
        boolean z2 = i6 > iM4049a;
        m80.m3343j("Total height constrained: " + z2);
        if (z2) {
            int i7 = iM4049a - size;
            ArrayList arrayList3 = (ArrayList) c0678s3.f7022k;
            int size4 = arrayList3.size();
            int iM947a2 = 0;
            int i8 = 0;
            while (i8 < size4) {
                Object obj3 = arrayList3.get(i8);
                i8++;
                ci1 ci1Var2 = (ci1) obj3;
                if (!ci1Var2.f1263b) {
                    iM947a2 += ci1Var2.m947a();
                }
            }
            int i9 = i7 - iM947a2;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = (ArrayList) c0678s3.f7022k;
            int size5 = arrayList5.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj4 = arrayList5.get(i10);
                i10++;
                ci1 ci1Var3 = (ci1) obj4;
                if (ci1Var3.f1263b) {
                    arrayList4.add(ci1Var3);
                }
            }
            Collections.sort(arrayList4, new ol0(2));
            int size6 = arrayList4.size();
            int iM947a3 = 0;
            int i11 = 0;
            while (i11 < size6) {
                Object obj5 = arrayList4.get(i11);
                i11++;
                iM947a3 += ((ci1) obj5).m947a();
            }
            int size7 = arrayList4.size();
            if (size7 >= 6) {
                C0270h1.m2191g("VerticalViewGroupMeasure only supports up to 5 children");
                return;
            }
            float f3 = size7 - 1;
            float f4 = 0.2f;
            float f5 = 1.0f - (f3 * 0.2f);
            m80.m3345l("VVGM (minFrac, maxFrac)", 0.2f, f5);
            int size8 = arrayList4.size();
            float f6 = 0.0f;
            int i12 = 0;
            while (i12 < size8) {
                Object obj6 = arrayList4.get(i12);
                i12++;
                ci1 ci1Var4 = (ci1) obj6;
                float f7 = f4;
                float fM947a = ci1Var4.m947a() / iM947a3;
                if (fM947a > f5) {
                    f6 += fM947a - f5;
                    f = f5;
                } else {
                    f = fM947a;
                }
                if (fM947a < f7) {
                    float fMin = Math.min(f7 - fM947a, f6);
                    f6 -= fMin;
                    f = fM947a + fMin;
                }
                m80.m3345l("\t(desired, granted)", fM947a, f);
                ci1Var4.f1264c = (int) (f * i9);
                f4 = f7;
                paddingLeft = paddingLeft;
            }
        }
        int i13 = iM4050b - paddingLeft;
        ArrayList arrayList6 = (ArrayList) c0678s3.f7022k;
        int size9 = arrayList6.size();
        int i14 = 0;
        while (i14 < size9) {
            Object obj7 = arrayList6.get(i14);
            i14++;
            ci1 ci1Var5 = (ci1) obj7;
            m80.m3343j("Measuring child");
            af0.m191f(ci1Var5.f1262a, i13, ci1Var5.f1264c, Integer.MIN_VALUE, Integer.MIN_VALUE);
            size += AbstractC0612qb.m4046d(ci1Var5.f1262a);
        }
        m80.m3345l("Measured dims", f2, size);
        setMeasuredDimension(iM4050b, size);
    }
}
