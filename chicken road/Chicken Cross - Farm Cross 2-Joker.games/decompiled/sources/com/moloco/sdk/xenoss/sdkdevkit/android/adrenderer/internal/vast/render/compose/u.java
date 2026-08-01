package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class u extends FrameLayout {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f11456a;
    public final Function0<Unit> b;
    public final Function0<Unit> c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j resource, Function0<Unit> onDisplayed, Function0<Unit> onClick) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f11456a = resource;
        this.b = onDisplayed;
        this.c = onClick;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_vast_icon_max_size);
        this.d = dimensionPixelSize;
        if (resource instanceof j.a) {
            View a2 = z.a(context, (j.a) resource);
            if (a2 != null) {
                addView(a2, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        if (!(resource instanceof j.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ImageView a3 = A.a(context, (j.b) resource);
        a3.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a3.getLayoutParams().width, dimensionPixelSize), Math.min(a3.getLayoutParams().height, dimensionPixelSize)));
        a3.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.a(u.this, view);
            }
        });
        addView(a3);
    }

    public static final void a(u uVar, View view) {
        uVar.c.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.invoke();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(a(i, this.d), a(i2, this.d));
    }

    public final int a(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i2), View.MeasureSpec.getMode(i) == 1073741824 ? Integer.MIN_VALUE : View.MeasureSpec.getMode(i));
    }
}
