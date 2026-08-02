package S40;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f25771a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25772b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25773c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25774d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f25775e;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ConstraintLayout constraintLayout2) {
        this.f25771a = constraintLayout;
        this.f25772b = frameLayout;
        this.f25773c = frameLayout2;
        this.f25774d = frameLayout3;
        this.f25775e = constraintLayout2;
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.onboarding_slides_page_fragment, viewGroup, false);
        int i11 = R.id.container_bottom;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.container_bottom, inflate);
        if (frameLayout != null) {
            i11 = R.id.container_texture;
            FrameLayout frameLayout2 = (FrameLayout) C2548q.d(R.id.container_texture, inflate);
            if (frameLayout2 != null) {
                i11 = R.id.container_top;
                FrameLayout frameLayout3 = (FrameLayout) C2548q.d(R.id.container_top, inflate);
                if (frameLayout3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    return new b(constraintLayout, frameLayout, frameLayout2, frameLayout3, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f25771a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f25771a;
    }
}
