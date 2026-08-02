package Ve;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.y9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4782y9 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f32546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32550e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32551f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32552g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32553h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32554i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f32555j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4782y9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpayOtpTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.SpayOtpTextView)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Intrinsics.checkNotNullParameter(context2, "<this>");
        float applyDimension = (int) TypedValue.applyDimension(1, 2.0f, context2.getResources().getDisplayMetrics());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Intrinsics.checkNotNullParameter(context3, "<this>");
        float applyDimension2 = (int) TypedValue.applyDimension(1, 24.0f, context3.getResources().getDisplayMetrics());
        int color = obtainStyledAttributes.getColor(R.styleable.SpayOtpTextView_android_textColor, androidx.core.content.res.g.b(getContext().getResources(), R.color.spay_otp_code_input_text_color, null));
        float dimension = obtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_height, applyDimension);
        int i11 = R.styleable.SpayOtpTextView_spay_bar_margin;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        float dimension2 = obtainStyledAttributes.getDimension(i11, E.a(0, context4));
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_bottom, 2.0f);
        float dimension4 = obtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_right, 2.0f);
        float dimension5 = obtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_left, 2.0f);
        float dimension6 = obtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_top, 2.0f);
        this.f32555j = obtainStyledAttributes.getBoolean(R.styleable.SpayOtpTextView_spay_hide_otp, false);
        this.f32551f = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_hide_otp_drawable, R.drawable.spay_masked_pin);
        this.f32552g = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_hide_otp_error_drawable, R.drawable.spay_pin);
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this.f32553h = E.b(resources, R.color.spay_transparent);
        this.f32554i = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_hide_otp_error_drawable, R.drawable.spay_error_pin);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.SpayOtpTextView_spay_bar_enabled, false);
        float dimension7 = obtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_otp_text_size, applyDimension2);
        String string = obtainStyledAttributes.getString(R.styleable.SpayOtpTextView_spay_text_typeface);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background, R.color.spay_transparent);
        this.f32547b = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_active, resourceId);
        this.f32548c = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_inactive, resourceId);
        this.f32549d = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_success, resourceId);
        this.f32550e = obtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_error, resourceId);
        int i12 = R.styleable.SpayOtpTextView_spay_bar_active_color;
        Resources resources2 = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
        obtainStyledAttributes.getColor(i12, E.b(resources2, R.color.spay_main_text_color));
        int i13 = R.styleable.SpayOtpTextView_spay_bar_inactive_color;
        Resources resources3 = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "context.resources");
        obtainStyledAttributes.getColor(i13, E.b(resources3, R.color.spay_otp_code_input_hint_color));
        int i14 = R.styleable.SpayOtpTextView_spay_bar_error_color;
        Resources resources4 = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "context.resources");
        obtainStyledAttributes.getColor(i14, E.b(resources4, R.color.spay_otp_code_error_text_color));
        int i15 = R.styleable.SpayOtpTextView_spay_bar_success_color;
        Resources resources5 = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "context.resources");
        obtainStyledAttributes.getColor(i15, E.b(resources5, R.color.spay_otp_code_input_text_color));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.f32546a = textView;
        textView.setGravity(17);
        if (string != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), string));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        TextView textView2 = this.f32546a;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        TextView textView3 = this.f32546a;
        if (textView3 != null) {
            textView3.setTextSize(0, dimension7);
        }
        addView(this.f32546a, layoutParams);
        if (z11) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 == 0.0f) {
                dimension2 = dimension6;
            } else {
                dimension3 = dimension2;
                dimension4 = dimension3;
                dimension5 = dimension4;
            }
            layoutParams2.leftMargin = (int) dimension5;
            layoutParams2.rightMargin = (int) dimension4;
            layoutParams2.bottomMargin = (int) dimension3;
            layoutParams2.topMargin = (int) dimension2;
            addView((View) null, layoutParams2);
        }
        obtainStyledAttributes.recycle();
    }

    public static void a(final C4782y9 c4782y9, final String value, boolean z11, final boolean z12, boolean z13, int i11) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            z13 = false;
        }
        c4782y9.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        TextView textView = c4782y9.f32546a;
        if (!c4782y9.f32555j && textView != null) {
            textView.setText(value);
            return;
        }
        if (z13 && Intrinsics.d(value, "")) {
            if (textView != null) {
                textView.setBackgroundResource(c4782y9.f32552g);
            }
        } else if (z13 && !Intrinsics.d(value, "")) {
            if (textView != null) {
                textView.setBackgroundResource(c4782y9.f32551f);
            }
        } else {
            if (z11) {
                if (textView != null) {
                    textView.setBackgroundResource(c4782y9.f32553h);
                }
                if (textView != null) {
                    textView.setText(value);
                }
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: Ve.x9
                @Override // java.lang.Runnable
                public final void run() {
                    C4782y9 this$0 = C4782y9.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    String value2 = value;
                    Intrinsics.checkNotNullParameter(value2, "$value");
                    TextView textView2 = this$0.f32546a;
                    if (textView2 != null) {
                        textView2.setText("");
                    }
                    boolean d11 = Intrinsics.d(value2, "");
                    TextView textView3 = this$0.f32546a;
                    boolean z14 = z12;
                    if (d11 && z14) {
                        if (textView3 != null) {
                            textView3.setBackgroundResource(this$0.f32554i);
                        }
                    } else if (!Intrinsics.d(value2, "") || z14) {
                        if (textView3 != null) {
                            textView3.setBackgroundResource(this$0.f32551f);
                        }
                    } else if (textView3 != null) {
                        textView3.setBackgroundResource(this$0.f32552g);
                    }
                }
            }, 300L);
        }
    }

    public final void b(int i11) {
        if (i11 == -1) {
            setBackgroundResource(this.f32550e);
            return;
        }
        if (i11 == 0) {
            setBackgroundResource(this.f32548c);
        } else if (i11 == 1) {
            setBackgroundResource(this.f32547b);
        } else {
            if (i11 != 2) {
                return;
            }
            setBackgroundResource(this.f32549d);
        }
    }
}
