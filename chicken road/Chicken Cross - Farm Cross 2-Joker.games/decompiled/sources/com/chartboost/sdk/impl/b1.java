package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b1 extends ConstraintLayout {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final GradientDrawable f4686a;
    public final c6 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ b1(Context context, AttributeSet attributeSet, int i, GradientDrawable gradientDrawable, c6 c6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new GradientDrawable() : gradientDrawable, (i2 & 16) != 0 ? new w5(context) : c6Var);
    }

    public final void a() {
        GradientDrawable gradientDrawable = this.f4686a;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setColor(-15262682);
        setBackgroundColor(0);
        setBackground(this.f4686a);
    }

    public final GradientDrawable getBackgroundDrawable() {
        return this.f4686a;
    }

    public final void setCornerRadius(int i) {
        this.f4686a.setCornerRadius(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, AttributeSet attributeSet, int i, GradientDrawable backgroundDrawable, c6 densityProvider) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f4686a = backgroundDrawable;
        this.b = densityProvider;
        a();
    }

    public final void a(boolean z) {
        setBackground(z ? this.f4686a : null);
    }

    public final int a(int i) {
        return this.b.a(i);
    }

    public final int a(double d) {
        return this.b.a(d);
    }
}
