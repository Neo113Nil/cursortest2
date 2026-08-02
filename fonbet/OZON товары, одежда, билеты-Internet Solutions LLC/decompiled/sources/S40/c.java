package S40;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.ui.dots.WormDotsIndicator;

/* loaded from: classes3.dex */
public final class c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f25776a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final NoScrollRecycler f25777b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25778c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final NoScrollRecycler f25779d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25780e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final WormDotsIndicator f25781f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f25782g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f25783h;

    private c(@NonNull FrameLayout frameLayout, @NonNull NoScrollRecycler noScrollRecycler, @NonNull FrameLayout frameLayout2, @NonNull NoScrollRecycler noScrollRecycler2, @NonNull FrameLayout frameLayout3, @NonNull WormDotsIndicator wormDotsIndicator, @NonNull ViewPager2 viewPager2, @NonNull View view) {
        this.f25776a = frameLayout;
        this.f25777b = noScrollRecycler;
        this.f25778c = frameLayout2;
        this.f25779d = noScrollRecycler2;
        this.f25780e = frameLayout3;
        this.f25781f = wormDotsIndicator;
        this.f25782g = viewPager2;
        this.f25783h = view;
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.onboarding_slides_v2_fragment, viewGroup, false);
        int i11 = R.id.cbottom_bottom;
        NoScrollRecycler noScrollRecycler = (NoScrollRecycler) C2548q.d(R.id.cbottom_bottom, inflate);
        if (noScrollRecycler != null) {
            i11 = R.id.cbottom_bottom_holder;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.cbottom_bottom_holder, inflate);
            if (frameLayout != null) {
                i11 = R.id.cbottom_header;
                NoScrollRecycler noScrollRecycler2 = (NoScrollRecycler) C2548q.d(R.id.cbottom_header, inflate);
                if (noScrollRecycler2 != null) {
                    i11 = R.id.cbottom_header_holder;
                    FrameLayout frameLayout2 = (FrameLayout) C2548q.d(R.id.cbottom_header_holder, inflate);
                    if (frameLayout2 != null) {
                        i11 = R.id.onboarding_dots;
                        WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) C2548q.d(R.id.onboarding_dots, inflate);
                        if (wormDotsIndicator != null) {
                            i11 = R.id.onboarding_viewpager;
                            ViewPager2 viewPager2 = (ViewPager2) C2548q.d(R.id.onboarding_viewpager, inflate);
                            if (viewPager2 != null) {
                                i11 = R.id.view_bg;
                                View d11 = C2548q.d(R.id.view_bg, inflate);
                                if (d11 != null) {
                                    return new c((FrameLayout) inflate, noScrollRecycler, frameLayout, noScrollRecycler2, frameLayout2, wormDotsIndicator, viewPager2, d11);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f25776a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f25776a;
    }
}
