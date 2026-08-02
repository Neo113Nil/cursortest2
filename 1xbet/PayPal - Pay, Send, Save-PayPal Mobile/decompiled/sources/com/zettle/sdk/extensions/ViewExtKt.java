package com.zettle.sdk.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "", "enableEdgeToEdgeScreenInsets", "(Landroid/view/View;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ViewExtKt {
    public static final void enableEdgeToEdgeScreenInsets(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.zettle.sdk.extensions.ViewExtKt$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.zettle.sdk.extensions.ViewExtKt.$r8$lambda$tPCTz7PplytPp_GlnWlM37sLCdE(view2, windowInsetsCompat);
            }
        });
    }

    public static /* synthetic */ androidx.core.view.WindowInsetsCompat $r8$lambda$tPCTz7PplytPp_GlnWlM37sLCdE(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars() | androidx.core.view.WindowInsetsCompat.Type.displayCutout());
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.bottomMargin = insets.bottom;
        marginLayoutParams2.topMargin = insets.top;
        marginLayoutParams2.leftMargin = insets.left;
        marginLayoutParams2.rightMargin = insets.right;
        view.setLayoutParams(marginLayoutParams);
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }
}
