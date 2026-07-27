package sg.bigo.ads.H;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.h.RunnableC5127D;
import sg.bigo.ads.m.m0;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class p extends F1 {
    public static final i u = new i();
    public final sg.bigo.ads.T0.q q;
    public o r;
    public Bitmap s;
    public g t;

    public p(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    public static Bitmap a(p pVar) {
        Bitmap bitmap = pVar.j;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = pVar.s;
        if (bitmap2 != null) {
            return bitmap2;
        }
        Pair pair = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) pVar.d.e())).V0;
        if (pair == null) {
            return null;
        }
        Bitmap bitmap3 = (Bitmap) pair.first;
        pVar.s = bitmap3;
        return bitmap3;
    }

    public abstract void a(Context context, ViewGroup viewGroup);

    public final void c(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_description);
        if (I.a((CharSequence) ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).c())) {
            if (textView != null) {
                textView.setLines(2);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    public void d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.media_layout);
        if (textView == null || viewGroup2 == null) {
            return;
        }
        X.a(viewGroup2, new k(viewGroup2, textView));
    }

    public final void e(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        a(viewGroup, (ImageView) viewGroup.findViewById(R.id.gift_widget), true);
        a(viewGroup, (ImageView) viewGroup.findViewById(R.id.heart_widget), false);
    }

    public final void f(ViewGroup viewGroup) {
        View findViewById = viewGroup != null ? viewGroup.findViewById(R.id.inter_btn_cta_layout) : null;
        if (findViewById == null) {
            return;
        }
        AbstractC5446j.a(2, new j(this, findViewById));
    }

    public abstract int g();

    public abstract boolean h();

    public abstract boolean i();

    public final void j() {
        f fVar;
        g gVar = this.t;
        if (gVar == null || gVar.f || (fVar = gVar.e) == null || !fVar.b()) {
            return;
        }
        gVar.e.e();
    }

    public p(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        super(lVar);
        this.q = qVar;
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(ViewGroup viewGroup) {
        viewGroup.post(new m(this, viewGroup));
    }

    public final void a(ViewGroup viewGroup, boolean z, boolean z2, boolean z3, int i) {
        int i2 = this instanceof m0 ? 9 : 8;
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (mediaView != null) {
            sg.bigo.ads.C.f.a(viewGroup, mediaView, i2, this.d, i);
            if (z) {
                mediaView.setMediaAreaClickable(true);
                ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(true);
            }
        }
        viewGroup.setTag(31);
        sg.bigo.ads.C.f.a(viewGroup, viewGroup, i2, z3 ? this.d : u, i);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_ad_info);
        if (viewGroup2 != null) {
            viewGroup2.setTag(18);
            sg.bigo.ads.C.f.a(viewGroup, viewGroup2, i2, z2 ? this.d : u, i);
        }
    }

    public final void a(ViewGroup viewGroup, ImageView imageView, boolean z) {
        Bitmap bitmap;
        Bitmap a2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (imageView == null) {
            return;
        }
        if (!i()) {
            imageView.clearAnimation();
            imageView.setVisibility(4);
            return;
        }
        Context context = imageView.getContext();
        Bitmap bitmap4 = null;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), z ? R.drawable.bigo_ad_layer_gift_shadow : R.drawable.bigo_ad_layer_heart_shadow);
        } catch (Throwable th) {
            AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th));
            bitmap = null;
        }
        if (bitmap != null && bitmap.getHeight() > 0 && bitmap.getWidth() > 0 && (a2 = AbstractC4962t.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig())) != null) {
            Canvas canvas = new Canvas(a2);
            int a3 = AbstractC4963u.a(context, 1);
            canvas.drawBitmap(bitmap, z ? a3 : -a3, a3, (Paint) null);
            float[] fArr = {0.0f, 75.0f, 85.0f};
            Color.colorToHSV(AbstractC5164f1.a(this.d, 3, null), fArr);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColorFilter(new PorterDuffColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN));
            try {
                bitmap2 = BitmapFactory.decodeResource(context.getResources(), z ? R.drawable.bigo_ad_layer_gift_color : R.drawable.bigo_ad_layer_heart_color);
            } catch (Throwable th2) {
                AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th2));
                bitmap2 = null;
            }
            if (bitmap2 != null && bitmap2.getHeight() > 0 && bitmap2.getWidth() > 0) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                try {
                    bitmap3 = BitmapFactory.decodeResource(context.getResources(), z ? R.drawable.bigo_ad_gift_widget : R.drawable.bigo_ad_heart_widget);
                } catch (Throwable th3) {
                    AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th3));
                    bitmap3 = null;
                }
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                }
                bitmap4 = a2;
            }
        }
        imageView.setImageBitmap(bitmap4);
        int a4 = AbstractC4963u.a(imageView.getContext(), 56);
        if (!z) {
            a4 = -a4;
        }
        imageView.post(new RunnableC5127D(imageView, a4));
        imageView.setVisibility(0);
        imageView.setTag(32);
        sg.bigo.ads.C.f.a(viewGroup, imageView, this instanceof m0 ? 9 : 8, this.d, this.d.f0);
    }

    public void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, n nVar) {
        if (adCountDownButton == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int g = g();
        if (g == 1) {
            layoutParams.addRule(2, R.id.media_layout);
            layoutParams.addRule(14, -1);
        } else {
            if (g != 3) {
                if (g != 4) {
                    return;
                }
                layoutParams.addRule(7, R.id.media_layout);
                layoutParams.addRule(6, R.id.media_layout);
                layoutParams.rightMargin = AbstractC4963u.a(adCountDownButton.getContext(), 12);
                layoutParams.topMargin = AbstractC4963u.a(adCountDownButton.getContext(), 12);
                adCountDownButton.setLayoutParams(layoutParams);
            }
            layoutParams.addRule(7, R.id.media_layout);
            layoutParams.addRule(2, R.id.media_layout);
        }
        layoutParams.bottomMargin = AbstractC4963u.a(adCountDownButton.getContext(), -84);
        adCountDownButton.setLayoutParams(layoutParams);
    }
}
