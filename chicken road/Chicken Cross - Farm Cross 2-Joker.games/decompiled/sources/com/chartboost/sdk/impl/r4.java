package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r4 extends FrameLayout {
    public static final a d = new a(null);
    public static final int e = -15262682;

    /* renamed from: a, reason: collision with root package name */
    public final c6 f4990a;
    public final Function0 b;
    public final ImageView c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ r4(Context context, AttributeSet attributeSet, int i, c6 c6Var, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new w5(context) : c6Var, (i2 & 16) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.r4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r4.a();
            }
        } : function0);
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.b.invoke();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(Context context, AttributeSet attributeSet, int i, c6 densityProvider, Function0 onCloseClicked) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        this.f4990a = densityProvider;
        this.b = onCloseClicked;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(e);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityProvider.a(28), densityProvider.a(28));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.cb_close_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.c = imageView;
        addView(imageView);
    }
}
