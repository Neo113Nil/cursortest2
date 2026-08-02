package S40;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.dots.WormDotsIndicator;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f25767a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25768b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final WormDotsIndicator f25769c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f25770d;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull WormDotsIndicator wormDotsIndicator, @NonNull ViewPager2 viewPager2) {
        this.f25767a = constraintLayout;
        this.f25768b = frameLayout;
        this.f25769c = wormDotsIndicator;
        this.f25770d = viewPager2;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.onboarding_slides_fragment, viewGroup, false);
        int i11 = R.id.delimiter;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.delimiter, inflate);
        if (frameLayout != null) {
            i11 = R.id.onboarding_dots;
            WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) C2548q.d(R.id.onboarding_dots, inflate);
            if (wormDotsIndicator != null) {
                i11 = R.id.onboarding_viewpager;
                ViewPager2 viewPager2 = (ViewPager2) C2548q.d(R.id.onboarding_viewpager, inflate);
                if (viewPager2 != null) {
                    return new a((ConstraintLayout) inflate, frameLayout, wormDotsIndicator, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f25767a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f25767a;
    }
}
