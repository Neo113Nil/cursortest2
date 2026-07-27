package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bh extends b1 {
    public static final a i = new a(null);
    public final int d;
    public final String e;
    public final c6 f;
    public final Function0 g;
    public final ImageView h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ bh(Context context, AttributeSet attributeSet, int i2, int i3, String str, c6 c6Var, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? R.drawable.cb_skip_icon : i3, (i4 & 16) != 0 ? context.getString(R.string.skip_button_description) : str, (i4 & 32) != 0 ? new w5(context) : c6Var, (i4 & 64) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.bh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bh.b();
            }
        } : function0);
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public final ImageView getIconView() {
        return this.h;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.g.invoke();
        }
        return true;
    }

    public final void setContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setSkipIcon(int i2) {
        this.h.setImageResource(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, AttributeSet attributeSet, int i2, int i3, String skipButtonContentDescription, c6 densityProvider, Function0 onSkipClicked) {
        super(context, attributeSet, i2, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skipButtonContentDescription, "skipButtonContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.d = i3;
        this.e = skipButtonContentDescription;
        this.f = densityProvider;
        this.g = onSkipClicked;
        setId(View.generateViewId());
        setCornerRadius(a(14));
        setContentDescription((CharSequence) skipButtonContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(i3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.h = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }
}
