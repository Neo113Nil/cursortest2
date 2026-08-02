package G50;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f9725a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f9726b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f9727c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f9728d;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull FinToolbarView finToolbarView, @NonNull ScreenStateView screenStateView, @NonNull FrameLayout frameLayout) {
        this.f9725a = constraintLayout;
        this.f9726b = finToolbarView;
        this.f9727c = screenStateView;
        this.f9728d = frameLayout;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cbottom_webview_fragment, viewGroup, false);
        int i11 = R.id.ftv_cbottom;
        FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.ftv_cbottom, inflate);
        if (finToolbarView != null) {
            i11 = R.id.screen_state;
            ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
            if (screenStateView != null) {
                i11 = R.id.wv_container;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.wv_container, inflate);
                if (frameLayout != null) {
                    return new a((ConstraintLayout) inflate, finToolbarView, screenStateView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f9725a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f9725a;
    }
}
