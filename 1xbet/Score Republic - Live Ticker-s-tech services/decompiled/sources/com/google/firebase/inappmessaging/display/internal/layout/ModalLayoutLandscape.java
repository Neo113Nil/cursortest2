package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import live.football.scorerepublic.R;
import p000.AbstractC0612qb;
import p000.af0;
import p000.m80;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ModalLayoutLandscape extends AbstractC0612qb {

    /* JADX INFO: renamed from: n */
    public View f1373n;

    /* JADX INFO: renamed from: o */
    public View f1374o;

    /* JADX INFO: renamed from: p */
    public View f1375p;

    /* JADX INFO: renamed from: q */
    public View f1376q;

    /* JADX INFO: renamed from: r */
    public int f1377r;

    /* JADX INFO: renamed from: s */
    public int f1378s;

    /* JADX INFO: renamed from: t */
    public int f1379t;

    /* JADX INFO: renamed from: u */
    public int f1380u;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i7 = this.f1379t;
        int i8 = this.f1380u;
        if (i7 < i8) {
            i6 = (i8 - i7) / 2;
            i5 = 0;
        } else {
            i5 = (i7 - i8) / 2;
            i6 = 0;
        }
        m80.m3343j("Layout image");
        int i9 = i6 + paddingTop;
        int iM4047e = AbstractC0612qb.m4047e(this.f1373n) + paddingLeft;
        AbstractC0612qb.m4048f(this.f1373n, paddingLeft, i9, iM4047e, AbstractC0612qb.m4046d(this.f1373n) + i9);
        int i10 = iM4047e + this.f1377r;
        m80.m3343j("Layout getTitle");
        int i11 = paddingTop + i5;
        int iM4046d = AbstractC0612qb.m4046d(this.f1374o) + i11;
        AbstractC0612qb.m4048f(this.f1374o, i10, i11, measuredWidth, iM4046d);
        m80.m3343j("Layout getBody");
        int i12 = iM4046d + (this.f1374o.getVisibility() == 8 ? 0 : this.f1378s);
        int iM4046d2 = AbstractC0612qb.m4046d(this.f1375p) + i12;
        AbstractC0612qb.m4048f(this.f1375p, i10, i12, measuredWidth, iM4046d2);
        m80.m3343j("Layout button");
        int i13 = iM4046d2 + (this.f1375p.getVisibility() != 8 ? this.f1378s : 0);
        View view = this.f1376q;
        AbstractC0612qb.m4048f(view, i10, i13, AbstractC0612qb.m4047e(view) + i10, AbstractC0612qb.m4046d(view) + i13);
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1373n = m4051c(R.id.image_view);
        this.f1374o = m4051c(R.id.message_title);
        this.f1375p = m4051c(R.id.body_scroll);
        this.f1376q = m4051c(R.id.button);
        int visibility = this.f1373n.getVisibility();
        DisplayMetrics displayMetrics = this.f6448l;
        int iMax = 0;
        this.f1377r = visibility == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24.0f, displayMetrics));
        this.f1378s = (int) Math.floor(TypedValue.applyDimension(1, 24.0f, displayMetrics));
        List listAsList = Arrays.asList(this.f1374o, this.f1375p, this.f1376q);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iM4050b = m4050b(i);
        int iM4049a = m4049a(i2) - paddingTop;
        int i3 = iM4050b - paddingRight;
        m80.m3343j("Measuring image");
        af0.m192g(this.f1373n, (int) (i3 * 0.4f), iM4049a);
        int iM4047e = AbstractC0612qb.m4047e(this.f1373n);
        int i4 = i3 - (this.f1377r + iM4047e);
        float f = iM4047e;
        m80.m3345l("Max col widths (l, r)", f, i4);
        Iterator it = listAsList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i5++;
            }
        }
        int iMax2 = Math.max(0, (i5 - 1) * this.f1378s);
        int i6 = iM4049a - iMax2;
        m80.m3343j("Measuring getTitle");
        af0.m192g(this.f1374o, i4, i6);
        m80.m3343j("Measuring button");
        af0.m192g(this.f1376q, i4, i6);
        m80.m3343j("Measuring scroll view");
        af0.m192g(this.f1375p, i4, (i6 - AbstractC0612qb.m4046d(this.f1374o)) - AbstractC0612qb.m4046d(this.f1376q));
        this.f1379t = AbstractC0612qb.m4046d(this.f1373n);
        this.f1380u = iMax2;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.f1380u = AbstractC0612qb.m4046d((View) it2.next()) + this.f1380u;
        }
        int iMax3 = Math.max(this.f1379t + paddingTop, this.f1380u + paddingTop);
        Iterator it3 = listAsList.iterator();
        while (it3.hasNext()) {
            iMax = Math.max(AbstractC0612qb.m4047e((View) it3.next()), iMax);
        }
        m80.m3345l("Measured columns (l, r)", f, iMax);
        int i7 = iM4047e + iMax + this.f1377r + paddingRight;
        m80.m3345l("Measured dims", i7, iMax3);
        setMeasuredDimension(i7, iMax3);
    }
}
