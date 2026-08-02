package K50;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f15285a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f15286b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f15287c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f15288d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f15289e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f15290f;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull RecyclerView recyclerView, @NonNull ScreenStateView screenStateView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull FinToolbarView finToolbarView) {
        this.f15285a = constraintLayout;
        this.f15286b = finLargeButtonView;
        this.f15287c = recyclerView;
        this.f15288d = screenStateView;
        this.f15289e = swipeRefreshLayout;
        this.f15290f = finToolbarView;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.demo_fragment, viewGroup, false);
        int i11 = R.id.goto_next;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.goto_next, inflate);
        if (finLargeButtonView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i11 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                i11 = R.id.screen_state;
                ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
                if (screenStateView != null) {
                    i11 = R.id.swipe_to_refresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C2548q.d(R.id.swipe_to_refresh, inflate);
                    if (swipeRefreshLayout != null) {
                        i11 = R.id.toolbar;
                        FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.toolbar, inflate);
                        if (finToolbarView != null) {
                            return new a(constraintLayout, finLargeButtonView, recyclerView, screenStateView, swipeRefreshLayout, finToolbarView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f15285a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f15285a;
    }
}
