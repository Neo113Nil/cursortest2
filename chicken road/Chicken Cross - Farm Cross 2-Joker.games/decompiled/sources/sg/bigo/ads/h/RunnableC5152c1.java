package sg.bigo.ads.h;

import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.YandexWarningTextView;

/* renamed from: sg.bigo.ads.h.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5152c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YandexWarningTextView f12875a;
    public final /* synthetic */ float b;
    public final /* synthetic */ sg.bigo.ads.C.l c;
    public final /* synthetic */ RoundedFrameLayout d;
    public final /* synthetic */ MediaView e;

    public RunnableC5152c1(YandexWarningTextView yandexWarningTextView, float f, sg.bigo.ads.C.l lVar, RoundedFrameLayout roundedFrameLayout, MediaView mediaView) {
        this.f12875a = yandexWarningTextView;
        this.b = f;
        this.c = lVar;
        this.d = roundedFrameLayout;
        this.e = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12875a.getContext().getResources().getDisplayMetrics().heightPixels;
        int c = AbstractC4963u.c(this.f12875a.getContext());
        int round = Math.round(this.b * i) + this.f12875a.getPaddingBottom() + this.f12875a.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = this.f12875a.getLayoutParams();
        int a2 = AbstractC4963u.a(this.f12875a.getContext(), 20);
        int i2 = (c / 2) - (a2 * 3);
        sg.bigo.ads.U.r a3 = AbstractC5164f1.a(this.c);
        this.d.setCornerRadius(AbstractC4963u.a(r5.getContext(), 8));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        marginLayoutParams.setMargins(a2, a2, a2, a2);
        int i3 = a3.b;
        int i4 = a3.f12567a;
        if (i3 <= i4) {
            marginLayoutParams.width = i2;
            marginLayoutParams.height = (int) (((i3 * 1.0f) * i2) / i4);
            sg.bigo.ads.K0.X.d(-1, -1, this.e);
        }
        this.d.setLayoutParams(marginLayoutParams);
        layoutParams.height = round;
        this.f12875a.setLayoutParams(layoutParams);
    }
}
