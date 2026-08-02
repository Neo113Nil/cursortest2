package H30;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D {
    public static final void a(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        try {
            View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setOverScrollMode(2);
            }
        } catch (Exception e11) {
            L80.a.a("disableNestedScroll", "error e=" + e11);
        }
    }

    public static final void b(@NotNull ViewPager2 viewPager2, int i11) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        viewPager2.v(i11);
        try {
            View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            if (recyclerView == null || layoutManager == null) {
                return;
            }
            recyclerView.setItemViewCacheSize(0);
            layoutManager.setItemPrefetchEnabled(false);
        } catch (Exception e11) {
            L80.a.b("fixOffset", "error stopSwipe e=" + e11);
        }
    }

    public static final void c(@NotNull ViewPager2 viewPager2, float f7) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        try {
            Field declaredField = ViewPager2.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(viewPager2);
            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            declaredField2.setAccessible(true);
            declaredField2.set((RecyclerView) obj, Integer.valueOf(C.D.c(f7)));
        } catch (Exception e11) {
            L80.a.a("reduceDragSensitivity", "error e=" + e11);
        }
    }

    public static void d(ViewPager2 viewPager2, int i11) {
        AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        int width = viewPager2.getWidth();
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (i11 - viewPager2.f()) * width);
        ofInt.addUpdateListener(new B(viewPager2, 0, new K()));
        ofInt.addListener(new C(viewPager2));
        ofInt.setInterpolator(interpolator);
        ofInt.setDuration(450L);
        ofInt.start();
    }
}
