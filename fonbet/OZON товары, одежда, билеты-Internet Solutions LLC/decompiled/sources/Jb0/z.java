package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;

/* loaded from: classes3.dex */
public final class z implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14575a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LoaderView f14576b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14577c;

    private z(@NonNull ConstraintLayout constraintLayout, @NonNull LoaderView loaderView, @NonNull View view) {
        this.f14575a = constraintLayout;
        this.f14576b = loaderView;
        this.f14577c = view;
    }

    @NonNull
    public static z a(@NonNull ConstraintLayout constraintLayout) {
        int i11 = R.id.loaderView;
        LoaderView loaderView = (LoaderView) C2548q.d(R.id.loaderView, constraintLayout);
        if (loaderView != null) {
            i11 = R.id.shadowLoadingView;
            View d11 = C2548q.d(R.id.shadowLoadingView, constraintLayout);
            if (d11 != null) {
                return new z(constraintLayout, loaderView, d11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14575a;
    }
}
