package sg.bigo.ads.q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.r.C5449b;
import sg.bigo.ads.s.C5458a;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final C5458a f13249a;
    public final List b;
    public final sg.bigo.ads.r.c c;
    public final Context d;
    public final C5449b g;
    public final float h;
    public final float i;
    public boolean f = false;
    public final C5431b e = a();

    public x(C5458a c5458a, ArrayList arrayList, sg.bigo.ads.r.c cVar) {
        this.f13249a = c5458a;
        this.b = arrayList;
        this.c = cVar;
        this.d = c5458a.getContext();
        this.g = cVar.j;
        this.h = AbstractC4963u.a(r2, 1);
        this.i = AbstractC4963u.a(r2, 4);
    }

    public abstract ArrayList a(C5430a c5430a);

    public abstract C5431b a();

    public void a(TextView textView) {
    }

    public final void a(C5430a c5430a, boolean z) {
        Drawable drawable;
        this.f13249a.removeAllViews();
        ArrayList a2 = a(c5430a);
        if (A.a(a2)) {
            return;
        }
        for (int i = 0; i < a2.size() && i < this.b.size(); i++) {
            View view = (View) a2.get(i);
            NativeAd nativeAd = (NativeAd) this.b.get(i);
            if (view != null && nativeAd != null) {
                ArrayList arrayList = new ArrayList();
                RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.inter_icon_ads_icon_item_layout);
                if (roundedFrameLayout != null) {
                    roundedFrameLayout.setStrokeWidth(this.h);
                    roundedFrameLayout.setStrokeColor(this.g.g);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.inter_icon_ads_item_icon);
                if (imageView != null) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setTag(1);
                    arrayList.add(imageView);
                    imageView.setBackgroundColor(this.g.f);
                    imageView.setImageDrawable(AbstractC4944a.c(imageView.getContext(), R.drawable.bigo_ad_icon_default));
                }
                TextView textView = (TextView) view.findViewById(R.id.inter_icon_ads_item_title);
                if (textView != null) {
                    if (z) {
                        textView.setTextColor(this.g.d);
                    }
                    textView.setText(nativeAd.getTitle());
                    textView.setTag(2);
                    arrayList.add(textView);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.inter_icon_ads_item_sponsored);
                if (textView2 != null) {
                    if (z) {
                        textView2.setTextColor(this.g.d);
                    }
                    textView2.setText(nativeAd.getSponsored());
                    textView2.setTag(3);
                    a(textView2);
                    arrayList.add(textView2);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.inter_icon_ads_item_desc);
                if (textView3 != null) {
                    if (z) {
                        textView3.setTextColor(this.g.d);
                    }
                    textView3.setText(nativeAd.getDescription());
                    textView3.setTag(6);
                    arrayList.add(textView3);
                }
                Button button = (Button) view.findViewById(R.id.inter_icon_ads_item_btn_cta);
                if (button != null) {
                    button.setText(nativeAd.getCallToAction());
                    button.setTag(7);
                    arrayList.add(button);
                    float f = this.i;
                    C5449b c5449b = this.g;
                    int i2 = c5449b.h;
                    int i3 = c5449b.i;
                    float f2 = this.h;
                    Drawable a3 = AbstractC4962t.a(f, f, f, f, (Rect) null, i2);
                    if (i3 == 0 || f2 <= 0.0f) {
                        drawable = a3;
                    } else {
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a3, AbstractC4962t.a(f, f, f, f, i3, f2, null)});
                        layerDrawable.setId(0, android.R.id.background);
                        drawable = layerDrawable;
                    }
                    button.setBackground(drawable);
                }
                ViewGroup viewGroup = a2.size() == 1 ? this.f13249a : (ViewGroup) view;
                if (nativeAd instanceof sg.bigo.ads.C.l) {
                    sg.bigo.ads.C.l lVar = (sg.bigo.ads.C.l) nativeAd;
                    int i4 = this.c.h;
                    lVar.f0 = (i4 == 1 || i4 == 2 || i4 == 3) ? i4 : 3;
                    if (this.f) {
                        sg.bigo.ads.C.f.a(viewGroup, viewGroup, 1, lVar, (i4 == 1 || i4 == 2 || i4 == 3) ? i4 : 3);
                    }
                }
                nativeAd.registerViewForInteraction(viewGroup, (MediaView) null, imageView, (AdOptionsView) null, arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(LinearLayout linearLayout, C5431b c5431b) {
        if (c5431b == null) {
            c5431b = this.e;
        }
        if (c5431b == null || linearLayout == 0) {
            return;
        }
        Drawable drawable = c5431b.j;
        if (drawable != null) {
            linearLayout.setBackground(drawable);
            linearLayout.setPadding(0, 0, 0, 0);
        } else if (linearLayout instanceof sg.bigo.ads.M0.c) {
            ((sg.bigo.ads.M0.c) linearLayout).setBlurStyle(c5431b);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f13249a.setPadding(AbstractC4963u.a(this.d, i), AbstractC4963u.a(this.d, i2), AbstractC4963u.a(this.d, i3), AbstractC4963u.a(this.d, i4));
    }
}
