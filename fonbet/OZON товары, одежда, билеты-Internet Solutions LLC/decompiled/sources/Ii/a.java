package Ii;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;

/* loaded from: classes10.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f12551a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f12552b;

    private a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f12551a = frameLayout;
        this.f12552b = frameLayout2;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_ozon_gallery, (ViewGroup) null, false);
        int i11 = R.id.gallery_fragment_container;
        if (((FragmentContainerView) C2548q.d(R.id.gallery_fragment_container, inflate)) != null) {
            i11 = R.id.loadingOverlay;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.loadingOverlay, inflate);
            if (frameLayout != null) {
                i11 = R.id.progress;
                if (((LoaderView) C2548q.d(R.id.progress, inflate)) != null) {
                    return new a((FrameLayout) inflate, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f12551a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f12551a;
    }
}
