package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d5 extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public String f4724a;
    public String b;
    public String c;
    public final c6 d;
    public final Function0 e;
    public final Function0 f;
    public final th g;
    public final r4 h;
    public final bh i;
    public final int j;

    public /* synthetic */ d5(Context context, AttributeSet attributeSet, int i, String str, String str2, String str3, c6 c6Var, Function0 function0, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? context.getString(R.string.timer_notification_icon_description) : str, (i2 & 16) != 0 ? context.getString(R.string.close_button_description) : str2, (i2 & 32) != 0 ? context.getString(R.string.skip_button_description) : str3, (i2 & 64) != 0 ? new w5(context) : c6Var, (i2 & 128) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.d5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d5.a();
            }
        } : function0, (i2 & 256) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.d5$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d5.b();
            }
        } : function02);
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public final void c() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        Iterator it = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.g.getId()), Integer.valueOf(this.i.getId()), Integer.valueOf(this.h.getId())}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            constraintSet.connect(intValue, 1, 0, 1);
            constraintSet.connect(intValue, 2, 0, 2);
            constraintSet.connect(intValue, 3, 0, 3);
            constraintSet.connect(intValue, 4, 0, 4);
        }
        constraintSet.applyTo(this);
    }

    public final void d() {
        setContentDescription(this.g.getVisibility() == 0 ? this.f4724a : this.h.getVisibility() == 0 ? this.b : this.i.getVisibility() == 0 ? this.c : null);
        setFocusable(getContentDescription() != null);
        setClickable(getContentDescription() != null);
    }

    public final r4 getCloseButton() {
        return this.h;
    }

    public final bh getSkipButton() {
        return this.i;
    }

    public final th getTimerChipView() {
        return this.g;
    }

    public static /* synthetic */ void a(d5 d5Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        d5Var.c(z);
    }

    public final void b(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    public final void a(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(Context context, AttributeSet attributeSet, int i, String timerContentDescription, String closeContentDescription, String skipContentDescription, c6 densityProvider, Function0 onCloseClicked, Function0 onSkipClicked) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(closeContentDescription, "closeContentDescription");
        Intrinsics.checkNotNullParameter(skipContentDescription, "skipContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.f4724a = timerContentDescription;
        this.b = closeContentDescription;
        this.c = skipContentDescription;
        this.d = densityProvider;
        this.e = onCloseClicked;
        this.f = onSkipClicked;
        this.j = 28;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        int a2 = new w5(context).a(28);
        th thVar = new th(context, null, 0, null, null, 30, null);
        thVar.setId(View.generateViewId());
        thVar.setLayoutParams(new ConstraintLayout.LayoutParams(a2, a2));
        thVar.setVisibility(8);
        this.g = thVar;
        addView(thVar);
        bh bhVar = new bh(context, null, 0, 0, null, null, onSkipClicked, 62, null);
        bhVar.setId(View.generateViewId());
        bhVar.setLayoutParams(new ConstraintLayout.LayoutParams(a2, a2));
        bhVar.setVisibility(8);
        this.i = bhVar;
        addView(bhVar);
        r4 r4Var = new r4(context, null, 0, null, onCloseClicked, 14, null);
        r4Var.setId(View.generateViewId());
        r4Var.setLayoutParams(new ConstraintLayout.LayoutParams(a2, a2));
        r4Var.setVisibility(8);
        this.h = r4Var;
        addView(r4Var);
        c();
        d();
    }

    public final void c(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }
}
