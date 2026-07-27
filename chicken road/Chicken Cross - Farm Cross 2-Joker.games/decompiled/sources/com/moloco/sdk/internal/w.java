package com.moloco.sdk.internal;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.moloco.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class w extends LinearLayout {
    public static final int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function0<Unit> f10860a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;

    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), w.this.d);
        }
    }

    public static final class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), w.this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, String text, int i, int i2, String str, Function0<Unit> onClick) {
        super(context);
        Drawable mutate;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f10860a = onClick;
        this.b = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_max_width);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_image_size);
        this.c = dimensionPixelSize;
        this.d = getResources().getDimension(R.dimen.moloco_moloco_vast_cta_corner_radius);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_image_text_gap);
        this.e = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_text_horizontal_padding);
        this.f = dimensionPixelSize3;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_text_vertical_padding);
        this.g = dimensionPixelSize4;
        setOrientation(0);
        setGravity(17);
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.moloco_moloco_vast_cta_background);
        Drawable drawable2 = null;
        drawable2 = null;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i2);
            }
            drawable2 = mutate;
        }
        setBackground(drawable2);
        setClipToOutline(true);
        setOutlineProvider(new a());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.internal.w$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.a(w.this, view);
            }
        });
        setContentDescription(NativeAdContent.ViewTag.CTA);
        if (str != null) {
            Space space = new Space(context);
            space.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize2, 0));
            addView(space);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new b());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(imageView, str);
            addView(imageView);
        }
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setMaxLines(1);
        textView.setTextColor(i);
        textView.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        textView.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        addView(textView);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.b), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public static final void a(w wVar, View view) {
        wVar.f10860a.invoke();
    }
}
