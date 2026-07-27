package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h2 extends b1 {
    public static final a e = new a(null);
    public final Function0 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, AttributeSet attributeSet, int i, Function0 function0) {
        super(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = function0;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setPadding(a(16), a(4), a(16), a(4));
    }

    public abstract void a(p5 p5Var);

    public abstract void a(wk wkVar, uk ukVar);

    public final Function0<Unit> getOnCtaClicked() {
        return this.d;
    }

    public final void setCustomContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription(description);
    }
}
