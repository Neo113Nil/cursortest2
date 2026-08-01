package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R;
import sg.bigo.ads.h.C5213v;
import sg.bigo.ads.h.InterfaceC5216w;
import sg.bigo.ads.h.InterfaceC5219x;
import sg.bigo.ads.h.ViewOnClickListenerC5210u;

/* loaded from: classes3.dex */
public class AdCountDownButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12680a;
    public C5213v b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public View j;
    public View k;
    public TextView l;
    public int m;
    public InterfaceC5216w n;

    public AdCountDownButton(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        this.h = z;
        if (z) {
            this.l.setVisibility(0);
            this.k.setVisibility(0);
            this.j.setVisibility(0);
            this.j.setClickable(true);
            this.j.setAlpha(1.0f);
            return;
        }
        this.l.setVisibility(0);
        this.k.setVisibility(0);
        this.j.setVisibility(0);
        this.j.setAlpha(0.2f);
        this.j.setClickable(false);
    }

    public final void b(boolean z) {
        this.j.setVisibility(0);
        this.j.setClickable(true);
        this.j.setAlpha(1.0f);
        if (this.g) {
            this.l.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            this.l.setVisibility(z ? 0 : 8);
            this.k.setVisibility(z ? 0 : 8);
        }
    }

    public final void c() {
        C5213v c5213v = this.b;
        if (c5213v != null) {
            c5213v.a();
        }
        this.c = true;
        b(false);
    }

    public View getCloseView() {
        return this.j;
    }

    public long getMillisUntilFinished() {
        return this.i;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBtnClickArea(int i) {
        CustomTouchImageView customTouchImageView;
        float f;
        View view = this.j;
        if (view instanceof CustomTouchImageView) {
            if (i == 1) {
                customTouchImageView = (CustomTouchImageView) view;
                f = 0.5f;
            } else {
                if (i != 2) {
                    return;
                }
                customTouchImageView = (CustomTouchImageView) view;
                f = 0.25f;
            }
            customTouchImageView.setRegionScale(f);
        }
    }

    public void setCloseImageResource(int i) {
        View view = this.j;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i);
        }
    }

    public void setOnCloseListener(InterfaceC5216w interfaceC5216w) {
        View view = this.j;
        if (view == null) {
            return;
        }
        this.n = interfaceC5216w;
        if (interfaceC5216w == null) {
            view.setOnTouchListener(null);
        } else if (view instanceof CustomTouchImageView) {
            ((CustomTouchImageView) view).setCloseListener(interfaceC5216w);
        } else {
            view.setOnClickListener(new ViewOnClickListenerC5210u(interfaceC5216w));
        }
    }

    public void setShowCloseButtonInCountdown(boolean z) {
        this.d = z;
        TextView textView = this.l;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setPadding(AbstractC4963u.a(getContext(), 2), 0, 0, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
    }

    public void setTakeoverTickEvent(boolean z) {
        this.e = z;
    }

    public void setWithUnit(boolean z) {
        this.f = z;
    }

    public AdCountDownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdCountDownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.f12680a = context;
        setClickable(true);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.BigoAd_CountDownButton);
            int resourceId = typedArray.getResourceId(R.styleable.BigoAd_CountDownButton_bigo_ad_customLayout, 0);
            typedArray.recycle();
            AbstractC4944a.a(context, resourceId, this, true);
            this.m = resourceId;
            this.j = findViewById(R.id.bigo_ad_btn_close);
            this.k = findViewById(R.id.inter_view_stroke);
            this.l = (TextView) findViewById(R.id.inter_text_countdown);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public final void b(long j) {
        String format;
        if (j > 0 && j <= 1000) {
            j = 1000;
        }
        TextView textView = this.l;
        if (textView == null) {
            return;
        }
        boolean z = this.g;
        String str = CmcdData.Factory.STREAMING_FORMAT_SS;
        if (z) {
            StringBuilder append = new StringBuilder().append(AbstractC4944a.a(this.f12680a, R.string.bigo_ad_splash_skip_after, new Object[0])).append(" %d");
            if (!this.f) {
                str = "";
            }
            String sb = append.append(str).toString();
            TextView textView2 = this.l;
            Object[] objArr = {Integer.valueOf(Math.round(j / 1000.0f))};
            Pattern pattern = I.f12345a;
            format = String.format(Locale.ENGLISH, sb, objArr);
            textView = textView2;
        } else {
            if (!this.f) {
                str = "";
            }
            String concat = TimeModel.NUMBER_FORMAT.concat(str);
            Object[] objArr2 = {Integer.valueOf(Math.round(j / 1000.0f))};
            Pattern pattern2 = I.f12345a;
            format = String.format(Locale.ENGLISH, concat, objArr2);
        }
        textView.setText(format);
    }

    public final void a(long j) {
        if (this.e) {
            b(j);
        }
    }

    public final void a() {
        C5213v c5213v = this.b;
        if (c5213v != null) {
            c5213v.d();
        }
    }

    public final void b() {
        C5213v c5213v = this.b;
        if (c5213v == null || !c5213v.b()) {
            return;
        }
        this.b.e();
    }

    public final void a(int i) {
        if (this.m != i) {
            this.m = i;
            View view = this.j;
            int visibility = view != null ? view.getVisibility() : 8;
            View view2 = this.k;
            int visibility2 = view2 != null ? view2.getVisibility() : 8;
            TextView textView = this.l;
            int visibility3 = textView != null ? textView.getVisibility() : 8;
            removeAllViews();
            AbstractC4944a.a(this.f12680a, i, this, true);
            this.j = findViewById(R.id.bigo_ad_btn_close);
            this.k = findViewById(R.id.inter_view_stroke);
            this.l = (TextView) findViewById(R.id.inter_text_countdown);
            View view3 = this.j;
            if (view3 != null) {
                view3.setVisibility(visibility);
            }
            View view4 = this.k;
            if (view4 != null) {
                view4.setVisibility(visibility2);
            }
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setVisibility(visibility3);
            }
            setOnCloseListener(this.n);
        }
    }

    public final void a(int i, InterfaceC5219x interfaceC5219x) {
        this.l.setVisibility(0);
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        if (this.d) {
            this.k.setVisibility(0);
            this.j.setVisibility(0);
            this.j.setAlpha(0.2f);
            this.j.setClickable(false);
        }
        if (i == 0) {
            b(this.e);
            if (interfaceC5219x != null) {
                interfaceC5219x.a();
                return;
            }
            return;
        }
        this.c = false;
        if (i < 0) {
            return;
        }
        C5213v c5213v = new C5213v(this, i * 1000, interfaceC5219x);
        this.b = c5213v;
        c5213v.e();
    }
}
