package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.M0.a;
import sg.bigo.ads.M0.b;
import sg.bigo.ads.M0.c;
import sg.bigo.ads.M0.g;

/* loaded from: classes3.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public final g f12712a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        return background instanceof a ? ((a) background).f12992a : background;
    }

    public b getBlurStyle() {
        return this.f12712a.d.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g gVar = this.f12712a;
        View a2 = X.a(gVar.b, gVar.f12462a);
        gVar.f = a2;
        if (a2 != null) {
            a2.getViewTreeObserver().addOnPreDrawListener(gVar.k);
            gVar.a();
            if (gVar.f.getRootView() != gVar.f12462a.getRootView()) {
                gVar.f.postInvalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g gVar = this.f12712a;
        View view = gVar.f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(gVar.k);
        }
        gVar.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        g gVar = this.f12712a;
        a aVar = gVar.d;
        if (drawable != aVar) {
            aVar.a(drawable);
            gVar.b();
        }
        super.setBackground(gVar.d);
    }

    @Override // sg.bigo.ads.M0.c
    public void setBlurStyle(b bVar) {
        this.f12712a.setBlurStyle(bVar);
    }

    public RealtimeBlurLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g gVar = new g(this);
        this.f12712a = gVar;
        setBackground(gVar.d);
    }
}
