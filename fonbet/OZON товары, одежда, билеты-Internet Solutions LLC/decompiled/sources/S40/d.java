package S40;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f25784a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f25785b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f25786c;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.f25784a = constraintLayout;
        this.f25785b = frameLayout;
        this.f25786c = recyclerView;
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.onboarding_slides_v2_page_content_fragment, viewGroup, false);
        int i11 = R.id.container_texture;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.container_texture, inflate);
        if (frameLayout != null) {
            i11 = R.id.main_content_recycler;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.main_content_recycler, inflate);
            if (recyclerView != null) {
                return new d((ConstraintLayout) inflate, frameLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f25784a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f25784a;
    }
}
