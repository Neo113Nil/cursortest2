package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pa extends b1 {
    public static final a i = new a(null);
    public final String d;
    public final Function1 e;
    public final ImageView f;
    public final TextView g;
    public String h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ pa(Context context, AttributeSet attributeSet, int i2, String str, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? context.getString(R.string.info_icon_view_description) : str, (i3 & 16) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.pa$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pa.a((String) obj);
            }
        } : function1);
    }

    public static final Unit a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void b() {
        String str;
        if (this.g.getVisibility() == 0) {
            str = this.d + ": " + ((Object) this.g.getText());
        } else {
            str = this.d;
        }
        setContentDescription(str);
    }

    public final String getClickthroughUrl() {
        return this.h;
    }

    public final ImageView getIconView() {
        return this.f;
    }

    public final TextView getSponsorText() {
        return this.g;
    }

    @Override // android.view.View
    public boolean performClick() {
        this.e.invoke(this.h);
        return super.performClick();
    }

    public final void setClickthroughUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.h = url;
    }

    public final void setCustomContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        b();
    }

    public final void setEnableSponsorText(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
        b();
    }

    public final void a(x0 size) {
        Intrinsics.checkNotNullParameter(size, "size");
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = a(size.b());
        layoutParams.height = a(size.a());
        this.f.setLayoutParams(layoutParams);
        setCornerRadius(a(size.a() / 2));
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(Context context, AttributeSet attributeSet, int i2, String infoIconContentDescription, Function1 onInfoIconClicked) {
        super(context, attributeSet, i2, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(infoIconContentDescription, "infoIconContentDescription");
        Intrinsics.checkNotNullParameter(onInfoIconClicked, "onInfoIconClicked");
        this.d = infoIconContentDescription;
        this.e = onInfoIconClicked;
        this.h = "";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setCornerRadius(a(14));
        setContentDescription(infoIconContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(R.drawable.cb_info_icon);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        this.f = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(context.getString(R.string.sponsored_text));
        textView.setTextSize(12.0f);
        textView.setTextColor(-1);
        textView.setGravity(16);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setVisibility(8);
        textView.setImportantForAccessibility(2);
        this.g = textView;
        addView(imageView);
        addView(textView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, imageView.getId(), 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.setMargin(textView.getId(), 2, a(8));
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }

    public final void b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() > 0) {
            return;
        }
        this.f.setImageResource(R.drawable.cb_info_icon);
    }

    public final void a(wk tracker, uk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
    }
}
