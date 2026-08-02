package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
public final class WindowInsetsApplier implements androidx.core.view.OnApplyWindowInsetsListener {
    private WindowInsetsApplier() {
    }

    public static boolean install(androidx.viewpager2.widget.ViewPager2 viewPager2) {
        android.content.pm.ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (android.os.Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(viewPager2, new androidx.viewpager2.widget.WindowInsetsApplier());
        return true;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.viewpager2.widget.ViewPager2 viewPager2 = (androidx.viewpager2.widget.ViewPager2) view;
        androidx.core.view.WindowInsetsCompat onApplyWindowInsets = androidx.core.view.ViewCompat.onApplyWindowInsets(viewPager2, windowInsetsCompat);
        if (onApplyWindowInsets.isConsumed()) {
            return onApplyWindowInsets;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = viewPager2.getOutputFormats;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(recyclerView.getChildAt(i), new androidx.core.view.WindowInsetsCompat(onApplyWindowInsets));
        }
        if (androidx.core.view.WindowInsetsCompat.CONSUMED.toWindowInsets() != null) {
            return androidx.core.view.WindowInsetsCompat.CONSUMED;
        }
        return onApplyWindowInsets.consumeSystemWindowInsets().consumeStableInsets();
    }
}
