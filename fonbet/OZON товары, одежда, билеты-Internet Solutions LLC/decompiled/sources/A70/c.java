package A70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f542a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f543b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f544c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f545d;

    private c(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull FinToolbarView finToolbarView) {
        this.f542a = linearLayout;
        this.f543b = linearLayout2;
        this.f544c = recyclerView;
        this.f545d = finToolbarView;
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.receipt_info_fragment, viewGroup, false);
        int i11 = R.id.nested_scroll_view;
        if (((NestedScrollView) C2548q.d(R.id.nested_scroll_view, inflate)) != null) {
            i11 = R.id.receipt_container;
            if (((ConstraintLayout) C2548q.d(R.id.receipt_container, inflate)) != null) {
                i11 = R.id.receipt_info_container;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.receipt_info_container, inflate);
                if (linearLayout != null) {
                    i11 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.recycler_view, inflate);
                    if (recyclerView != null) {
                        i11 = R.id.toolbar;
                        FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.toolbar, inflate);
                        if (finToolbarView != null) {
                            i11 = R.id.tv_receipt_title;
                            if (((TextView) C2548q.d(R.id.tv_receipt_title, inflate)) != null) {
                                i11 = R.id.tv_title;
                                if (((TextView) C2548q.d(R.id.tv_title, inflate)) != null) {
                                    return new c((LinearLayout) inflate, linearLayout, recyclerView, finToolbarView);
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
    public final LinearLayout a() {
        return this.f542a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f542a;
    }
}
