package W70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f33300a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f33301b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final PermissionsScreenStateView f33302c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f33303d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f33304e;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull PermissionsScreenStateView permissionsScreenStateView, @NonNull FinToolbarView finToolbarView, @NonNull ViewPager2 viewPager2) {
        this.f33300a = constraintLayout;
        this.f33301b = recyclerView;
        this.f33302c = permissionsScreenStateView;
        this.f33303d = finToolbarView;
        this.f33304e = viewPager2;
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.photo_preview_fragment, viewGroup, false);
        int i11 = R.id.gallery_recycler;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.gallery_recycler, inflate);
        if (recyclerView != null) {
            i11 = R.id.permissions_screen_state;
            PermissionsScreenStateView permissionsScreenStateView = (PermissionsScreenStateView) C2548q.d(R.id.permissions_screen_state, inflate);
            if (permissionsScreenStateView != null) {
                i11 = R.id.photo_toolbar;
                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.photo_toolbar, inflate);
                if (finToolbarView != null) {
                    i11 = R.id.photo_viewpager;
                    ViewPager2 viewPager2 = (ViewPager2) C2548q.d(R.id.photo_viewpager, inflate);
                    if (viewPager2 != null) {
                        i11 = R.id.screen_state;
                        if (((ScreenStateView) C2548q.d(R.id.screen_state, inflate)) != null) {
                            return new c((ConstraintLayout) inflate, recyclerView, permissionsScreenStateView, finToolbarView, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f33300a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f33300a;
    }
}
