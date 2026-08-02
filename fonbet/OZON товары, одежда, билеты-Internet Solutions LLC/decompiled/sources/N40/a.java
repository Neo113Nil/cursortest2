package N40;

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
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f18684a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f18685b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f18686c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f18687d;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout) {
        this.f18684a = constraintLayout;
        this.f18685b = recyclerView;
        this.f18686c = constraintLayout2;
        this.f18687d = frameLayout;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cbottom_modal_fragment, viewGroup, false);
        int i11 = R.id.holder;
        if (((FrameLayout) C2548q.d(R.id.holder, inflate)) != null) {
            i11 = R.id.main_recycler;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.main_recycler, inflate);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.top_holder, inflate);
                if (frameLayout != null) {
                    return new a(constraintLayout, recyclerView, constraintLayout, frameLayout);
                }
                i11 = R.id.top_holder;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f18684a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f18684a;
    }
}
