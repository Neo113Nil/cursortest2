package com.google.android.ads.nativetemplates;

import L5.X;
import O2.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.salamadev.nabilalawadi.kisaskoran.R;
import p171z1.a;

/* JADX INFO: loaded from: classes.dex */
public final class TemplateView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MediaView f10512A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Button f10513B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ConstraintLayout f10514C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeAd f10517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAdView f10518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f10519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f10520f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RatingBar f10521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f10522y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f10523z;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, X.f4451a, 0, 0);
        try {
            this.f10515a = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.gnt_medium_template_view);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f10515a, this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.f10518d;
    }

    public String getTemplateTypeName() {
        int i7 = this.f10515a;
        if (i7 == R.layout.gnt_medium_template_view) {
            return "medium_template";
        }
        return i7 == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f10518d = (NativeAdView) findViewById(R.id.native_ad_view);
        this.f10519e = (TextView) findViewById(R.id.primary);
        this.f10520f = (TextView) findViewById(R.id.secondary);
        this.f10522y = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.f10521x = ratingBar;
        ratingBar.setEnabled(false);
        this.f10513B = (Button) findViewById(R.id.cta);
        this.f10523z = (ImageView) findViewById(R.id.icon);
        this.f10512A = (MediaView) findViewById(R.id.media_view);
        this.f10514C = (ConstraintLayout) findViewById(R.id.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f10517c = nativeAd;
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        b icon = nativeAd.getIcon();
        this.f10518d.setCallToActionView(this.f10513B);
        this.f10518d.setHeadlineView(this.f10519e);
        this.f10518d.setMediaView(this.f10512A);
        this.f10520f.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            this.f10518d.setStoreView(this.f10520f);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.f10518d.setAdvertiserView(this.f10520f);
            store = advertiser;
        }
        this.f10519e.setText(headline);
        this.f10513B.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= 0.0d) {
            this.f10520f.setText(store);
            this.f10520f.setVisibility(0);
            this.f10521x.setVisibility(8);
        } else {
            this.f10520f.setVisibility(8);
            this.f10521x.setVisibility(0);
            this.f10521x.setRating(starRating.floatValue());
            this.f10518d.setStarRatingView(this.f10521x);
        }
        if (icon != null) {
            this.f10523z.setVisibility(0);
            this.f10523z.setImageDrawable(icon.getDrawable());
        } else {
            this.f10523z.setVisibility(8);
        }
        TextView textView = this.f10522y;
        if (textView != null) {
            textView.setText(body);
            this.f10518d.setBodyView(this.f10522y);
        }
        this.f10518d.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        this.f10516b = aVar;
        ColorDrawable colorDrawable = aVar.f18459q;
        if (colorDrawable != null) {
            this.f10514C.setBackground(colorDrawable);
            TextView textView13 = this.f10519e;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.f10520f;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.f10522y;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.f10516b.f18448e;
        if (typeface != null && (textView12 = this.f10519e) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.f10516b.f18452i;
        if (typeface2 != null && (textView11 = this.f10520f) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.f10516b.f18455m;
        if (typeface3 != null && (textView10 = this.f10522y) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.f10516b.f18444a;
        if (typeface4 != null && (button4 = this.f10513B) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.f10516b.f18450g;
        if (num != null && (textView9 = this.f10519e) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.f10516b.f18453k;
        if (num2 != null && (textView8 = this.f10520f) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.f10516b.f18457o;
        if (num3 != null && (textView7 = this.f10522y) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.f10516b.f18446c;
        if (num4 != null && (button3 = this.f10513B) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f7 = this.f10516b.f18445b;
        if (f7 > 0.0f && (button2 = this.f10513B) != null) {
            button2.setTextSize(f7);
        }
        float f8 = this.f10516b.f18449f;
        if (f8 > 0.0f && (textView6 = this.f10519e) != null) {
            textView6.setTextSize(f8);
        }
        float f9 = this.f10516b.j;
        if (f9 > 0.0f && (textView5 = this.f10520f) != null) {
            textView5.setTextSize(f9);
        }
        float f10 = this.f10516b.f18456n;
        if (f10 > 0.0f && (textView4 = this.f10522y) != null) {
            textView4.setTextSize(f10);
        }
        ColorDrawable colorDrawable2 = this.f10516b.f18447d;
        if (colorDrawable2 != null && (button = this.f10513B) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.f10516b.f18451h;
        if (colorDrawable3 != null && (textView3 = this.f10519e) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.f10516b.f18454l;
        if (colorDrawable4 != null && (textView2 = this.f10520f) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.f10516b.f18458p;
        if (colorDrawable5 != null && (textView = this.f10522y) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }

    public TemplateView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a(context, attributeSet);
    }
}
