package H30;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* loaded from: classes7.dex */
public final class z {

    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10572a;

        a(View view) {
            this.f10572a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f10572a.setVisibility(8);
        }
    }

    public static final void a(@NotNull View view, Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (rect != null) {
            view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static final void b(int i11, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(i11).setListener(null);
    }

    public static final void c(int i11, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().alpha(0.0f).setDuration(i11).setListener(new a(view));
    }

    public static void d(View view, int i11, Float f7, int i12) {
        Integer valueOf = Integer.valueOf(R.color.oz_ripple);
        if ((i12 & 64) != 0) {
            f7 = null;
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        int color = androidx.core.content.a.getColor(view.getContext(), i11);
        int color2 = androidx.core.content.a.getColor(view.getContext(), valueOf.intValue());
        float[] fArr = f7 != null ? new float[]{UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue()), UiExtKt.toPxF(f7.floatValue())} : new float[]{UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f), UiExtKt.toPxF(0.0f)};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(fArr);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(fArr);
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(color2), gradientDrawable, gradientDrawable2));
    }

    public static final void e(int i11, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginEnd() != i11) {
                marginLayoutParams.setMarginEnd(i11);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void f(int i11, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginStart() != i11) {
                marginLayoutParams.setMarginStart(i11);
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
