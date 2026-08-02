package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import live.football.scorerepublic.R;
import p000.AbstractC0024an;
import p000.AbstractC0612qb;
import p000.af0;
import p000.m80;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class CardLayoutPortrait extends AbstractC0612qb {

    /* JADX INFO: renamed from: n */
    public View f1366n;

    /* JADX INFO: renamed from: o */
    public View f1367o;

    /* JADX INFO: renamed from: p */
    public View f1368p;

    /* JADX INFO: renamed from: q */
    public View f1369q;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = getVisibleChildren().get(i5);
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredHeight2 + measuredHeight;
            m80.m3343j("Layout child " + i5);
            m80.m3345l("\t(top, bottom)", (float) measuredHeight, (float) i6);
            m80.m3345l("\t(left, right)", 0.0f, (float) measuredWidth);
            view.layout(0, measuredHeight, measuredWidth, i6);
            m80.m3345l(AbstractC0024an.m282e(i5, "Child ", " wants to be "), view.getMeasuredWidth(), view.getMeasuredHeight());
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // p000.AbstractC0612qb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1366n = m4051c(R.id.image_view);
        this.f1367o = m4051c(R.id.message_title);
        this.f1368p = m4051c(R.id.body_scroll);
        this.f1369q = m4051c(R.id.action_bar);
        int iM4050b = m4050b(i);
        int iM4049a = m4049a(i2);
        int iRound = Math.round(((int) (0.8d * ((double) iM4049a))) / 4.0f) * 4;
        m80.m3343j("Measuring image");
        af0.m191f(this.f1366n, iM4050b, iM4049a, 1073741824, Integer.MIN_VALUE);
        if (AbstractC0612qb.m4046d(this.f1366n) > iRound) {
            m80.m3343j("Image exceeded maximum height, remeasuring image");
            af0.m191f(this.f1366n, iM4050b, iRound, Integer.MIN_VALUE, 1073741824);
        }
        int iM4047e = AbstractC0612qb.m4047e(this.f1366n);
        m80.m3343j("Measuring title");
        af0.m191f(this.f1367o, iM4047e, iM4049a, 1073741824, Integer.MIN_VALUE);
        m80.m3343j("Measuring action bar");
        af0.m191f(this.f1369q, iM4047e, iM4049a, 1073741824, Integer.MIN_VALUE);
        m80.m3343j("Measuring scroll view");
        af0.m191f(this.f1368p, iM4047e, ((iM4049a - AbstractC0612qb.m4046d(this.f1366n)) - AbstractC0612qb.m4046d(this.f1367o)) - AbstractC0612qb.m4046d(this.f1369q), 1073741824, Integer.MIN_VALUE);
        int size = getVisibleChildren().size();
        int iM4046d = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iM4046d += AbstractC0612qb.m4046d(getVisibleChildren().get(i3));
        }
        setMeasuredDimension(iM4047e, iM4046d);
    }
}
