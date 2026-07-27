package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class el extends b1 {
    public static final a i = new a(null);
    public final String d;
    public final String e;
    public final Function1 f;
    public final ImageView g;
    public boolean h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ el(Context context, AttributeSet attributeSet, int i2, String str, String str2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? context.getString(R.string.volume_on_description) : str, (i3 & 16) != 0 ? context.getString(R.string.volume_off_description) : str2, (i3 & 32) == 0 ? function1 : null);
    }

    public static final void a(el elVar, View view) {
        elVar.b();
    }

    private final void c() {
        setContentDescription(this.h ? this.e : this.d);
    }

    public final void b() {
        boolean z = this.h;
        this.h = !z;
        this.g.setImageResource(!z ? R.drawable.cb_volume_off_icon : R.drawable.cb_volume_on_icon);
        c();
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.h));
        }
    }

    public final ImageView getIconView() {
        return this.g;
    }

    public final void setMuted(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.g.setImageResource(z ? R.drawable.cb_volume_off_icon : R.drawable.cb_volume_on_icon);
            c();
        }
    }

    public final void a(wk tracker, uk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(Context context, AttributeSet attributeSet, int i2, String volumeOnContentDescription, String volumeOffContentDescription, Function1 function1) {
        super(context, attributeSet, i2, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(volumeOnContentDescription, "volumeOnContentDescription");
        Intrinsics.checkNotNullParameter(volumeOffContentDescription, "volumeOffContentDescription");
        this.d = volumeOnContentDescription;
        this.e = volumeOffContentDescription;
        this.f = function1;
        setId(View.generateViewId());
        setCornerRadius(a(14));
        c();
        setFocusable(true);
        setClickable(true);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(R.drawable.cb_volume_on_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.g = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.el$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                el.a(el.this, view);
            }
        });
    }
}
