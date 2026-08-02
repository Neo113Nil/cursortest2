package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
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
public class CardLayoutLandscape extends AbstractC0612qb {

    /* JADX INFO: renamed from: n */
    public View f1362n;

    /* JADX INFO: renamed from: o */
    public View f1363o;

    /* JADX INFO: renamed from: p */
    public View f1364p;

    /* JADX INFO: renamed from: q */
    public View f1365q;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        m80.m3343j("Layout image");
        int iM4047e = AbstractC0612qb.m4047e(this.f1362n);
        AbstractC0612qb.m4048f(this.f1362n, 0, 0, iM4047e, AbstractC0612qb.m4046d(this.f1362n));
        m80.m3343j("Layout title");
        int iM4046d = AbstractC0612qb.m4046d(this.f1363o);
        AbstractC0612qb.m4048f(this.f1363o, iM4047e, 0, measuredWidth, iM4046d);
        m80.m3343j("Layout scroll");
        AbstractC0612qb.m4048f(this.f1364p, iM4047e, iM4046d, measuredWidth, AbstractC0612qb.m4046d(this.f1364p) + iM4046d);
        m80.m3343j("Layout action bar");
        AbstractC0612qb.m4048f(this.f1365q, iM4047e, measuredHeight - AbstractC0612qb.m4046d(this.f1365q), measuredWidth, measuredHeight);
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1362n = m4051c(R.id.image_view);
        this.f1363o = m4051c(R.id.message_title);
        this.f1364p = m4051c(R.id.body_scroll);
        View viewM4051c = m4051c(R.id.action_bar);
        this.f1365q = viewM4051c;
        List listAsList = Arrays.asList(this.f1363o, this.f1364p, viewM4051c);
        int iM4050b = m4050b(i);
        int iM4049a = m4049a(i2);
        int iRound = Math.round(((int) (0.6d * ((double) iM4050b))) / 4.0f) * 4;
        m80.m3343j("Measuring image");
        af0.m191f(this.f1362n, iM4050b, iM4049a, Integer.MIN_VALUE, 1073741824);
        if (AbstractC0612qb.m4047e(this.f1362n) > iRound) {
            m80.m3343j("Image exceeded maximum width, remeasuring image");
            af0.m191f(this.f1362n, iRound, iM4049a, 1073741824, Integer.MIN_VALUE);
        }
        int iM4046d = AbstractC0612qb.m4046d(this.f1362n);
        int iM4047e = AbstractC0612qb.m4047e(this.f1362n);
        int i3 = iM4050b - iM4047e;
        float f = iM4047e;
        m80.m3345l("Max col widths (l, r)", f, i3);
        m80.m3343j("Measuring title");
        af0.m192g(this.f1363o, i3, iM4046d);
        m80.m3343j("Measuring action bar");
        af0.m192g(this.f1365q, i3, iM4046d);
        m80.m3343j("Measuring scroll view");
        af0.m191f(this.f1364p, i3, (iM4046d - AbstractC0612qb.m4046d(this.f1363o)) - AbstractC0612qb.m4046d(this.f1365q), Integer.MIN_VALUE, 1073741824);
        Iterator it = listAsList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(AbstractC0612qb.m4047e((View) it.next()), iMax);
        }
        m80.m3345l("Measured columns (l, r)", f, iMax);
        int i4 = iM4047e + iMax;
        m80.m3345l("Measured dims", i4, iM4046d);
        setMeasuredDimension(i4, iM4046d);
    }
}
