package sg.bigo.ads.h;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.YandexWarningTextView;

/* renamed from: sg.bigo.ads.h.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5148b1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12874a;
    public final /* synthetic */ YandexWarningTextView b;
    public final /* synthetic */ RoundedFrameLayout c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ sg.bigo.ads.C.l f;
    public final /* synthetic */ MediaView g;
    public final /* synthetic */ int h;

    public ViewTreeObserverOnGlobalLayoutListenerC5148b1(View view, YandexWarningTextView yandexWarningTextView, RoundedFrameLayout roundedFrameLayout, float f, ViewGroup viewGroup, sg.bigo.ads.C.l lVar, MediaView mediaView, int i) {
        this.f12874a = view;
        this.b = yandexWarningTextView;
        this.c = roundedFrameLayout;
        this.d = f;
        this.e = viewGroup;
        this.f = lVar;
        this.g = mediaView;
        this.h = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int measuredHeight = this.f12874a.getMeasuredHeight();
        int i = this.f12874a.getContext().getResources().getDisplayMetrics().heightPixels;
        if (measuredHeight <= 0) {
            measuredHeight = AbstractC4963u.a(this.f12874a.getContext(), 130);
        }
        int paddingTop = this.b.getPaddingTop();
        int paddingBottom = this.b.getPaddingBottom();
        int a2 = AbstractC4963u.a(this.b.getContext(), 16);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        int i2 = marginLayoutParams.topMargin;
        if (i < 2000) {
            a2 *= 2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        int i3 = marginLayoutParams2.topMargin;
        int i4 = marginLayoutParams2.bottomMargin;
        int i5 = marginLayoutParams2.leftMargin;
        int i6 = marginLayoutParams2.rightMargin;
        int round = Math.round(this.d * i) + paddingBottom + paddingTop;
        int i7 = (((((i - measuredHeight) - round) - i2) - a2) - i3) - i4;
        if (i <= 1000) {
            i7 = i / 2;
            TextView textView = (TextView) this.e.findViewById(R.id.inter_description);
            if (textView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams3.topMargin = 0;
                textView.setLayoutParams(marginLayoutParams3);
            }
            ViewGroup viewGroup = (ViewGroup) this.e.findViewById(R.id.bigo_ad_btn_class);
            if (viewGroup != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams4.topMargin = 0;
                viewGroup.setLayoutParams(marginLayoutParams4);
            }
            TextView textView2 = (TextView) this.e.findViewById(R.id.inter_title);
            if (textView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                marginLayoutParams5.topMargin = 0;
                textView2.setLayoutParams(marginLayoutParams5);
            }
        }
        int c = (AbstractC4963u.c(this.f12874a.getContext()) - i5) - i6;
        sg.bigo.ads.U.r a3 = AbstractC5164f1.a(this.f);
        sg.bigo.ads.U.r a4 = sg.bigo.ads.U.r.a(a3.f12567a, a3.b, c, i7);
        this.c.setCornerRadius(AbstractC4963u.a(r1.getContext(), 8));
        marginLayoutParams2.setMargins(i5, i3, i6, i4);
        marginLayoutParams2.height = a4.b;
        marginLayoutParams2.width = a4.f12567a;
        sg.bigo.ads.K0.X.d(-1, -1, this.g);
        this.c.setLayoutParams(marginLayoutParams2);
        if (this.h == 0) {
            this.b.setVisibility(8);
            return;
        }
        marginLayoutParams.height = round;
        marginLayoutParams.bottomMargin = a2;
        this.b.setLayoutParams(marginLayoutParams);
    }
}
