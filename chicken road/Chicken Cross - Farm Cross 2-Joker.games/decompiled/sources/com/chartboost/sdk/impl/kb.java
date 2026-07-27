package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kb extends FrameLayout {
    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f4841a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(-1));
        this.f4841a = progressBar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(204, 0, 0, 0));
        gradientDrawable.setCornerRadius(o6.a(12, context));
        setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        addView(progressBar, layoutParams);
        setVisibility(8);
    }

    public final void a() {
        setVisibility(8);
    }

    public final void b() {
        setVisibility(0);
    }
}
