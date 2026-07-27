package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class th extends b1 {
    public static final a k = new a(null);
    public static final int l = -14669512;
    public static final int m = -436207617;
    public static final int n = -1;
    public final String d;
    public final c6 e;
    public final sh f;
    public final TextView g;
    public uh h;
    public String i;
    public String j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5018a;

        static {
            int[] iArr = new int[uh.values().length];
            try {
                iArr[uh.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uh.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5018a = iArr;
        }
    }

    public /* synthetic */ th(Context context, AttributeSet attributeSet, int i, String str, c6 c6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? context.getString(R.string.timer_notification_icon_description) : str, (i2 & 16) != 0 ? new w5(context) : c6Var);
    }

    public final void a(uh mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.h = mode;
        int i = b.f5018a[mode.ordinal()];
        if (i == 1) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = a(28);
            setLayoutParams(layoutParams);
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            setCornerRadius(a(14));
            getBackgroundDrawable().setColor(l);
            if (str != null) {
                this.i = str;
            }
            if (str2 != null) {
                this.j = str2;
            }
            this.g.setPadding(a(12), 0, a(12), 0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.width = a(28);
            layoutParams2.height = a(28);
            setLayoutParams(layoutParams2);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            setCornerRadius(a(14));
            getBackgroundDrawable().setColor(-15262682);
            this.g.setPadding(0, 0, 0, 0);
        }
        requestLayout();
    }

    public final void b(long j) {
        int i = b.f5018a[this.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.g.setText(a(j));
        } else {
            if (j <= 0) {
                this.g.setText(this.j);
                return;
            }
            TextView textView = this.g;
            String format = String.format(this.i, Arrays.copyOf(new Object[]{Long.valueOf(j / 1000)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
        }
    }

    public final sh getTimerArc() {
        return this.f;
    }

    public final TextView getTimerText() {
        return this.g;
    }

    public final void setContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setDurationMs(long j) {
        this.f.setProgress(1.0f);
        b(j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(Context context, AttributeSet attributeSet, int i, String timerContentDescription, c6 densityProvider) {
        super(context, attributeSet, i, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.d = timerContentDescription;
        this.e = densityProvider;
        this.h = uh.c;
        this.i = "Reward in %d seconds";
        this.j = "Reward granted";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        setCornerRadius(a(14));
        setContentDescription((CharSequence) timerContentDescription);
        sh shVar = new sh(context, attributeSet, i, densityProvider);
        shVar.setId(View.generateViewId());
        shVar.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        shVar.setBackgroundPaintColor(-15262682);
        shVar.setArcColor(m);
        this.f = shVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, 0));
        textView.setTextSize(12.0f);
        textView.setTextColor(n);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        this.g = textView;
        addView(shVar);
        addView(textView);
        setFocusable(true);
        setClickable(true);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(shVar.getId(), 1, 0, 1);
        constraintSet.connect(shVar.getId(), 2, 0, 2);
        constraintSet.connect(shVar.getId(), 3, 0, 3);
        constraintSet.connect(shVar.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, 0, 1);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    public final void a(long j, long j2) {
        this.f.setProgress(RangesKt.coerceIn(j / j2, 0.0f, 1.0f));
        b(j);
    }

    public final String a(long j) {
        return String.valueOf((int) Math.rint(j / 1000.0f));
    }

    public final void a(wk tracker, uk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
    }
}
