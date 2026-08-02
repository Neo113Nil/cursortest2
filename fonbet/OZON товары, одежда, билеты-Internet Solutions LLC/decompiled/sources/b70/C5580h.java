package b70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.badgekit.BadgeKitView;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* renamed from: b70.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5580h implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f55645a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final InputView f55646b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final InputView f55647c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f55648d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final BadgeKitView f55649e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PermissionsScreenStateView f55650f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55651g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final BadgeKitView f55652h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f55653i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55654j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f55655k;

    private C5580h(@NonNull ConstraintLayout constraintLayout, @NonNull InputView inputView, @NonNull InputView inputView2, @NonNull View view, @NonNull BadgeKitView badgeKitView, @NonNull PermissionsScreenStateView permissionsScreenStateView, @NonNull RecyclerView recyclerView, @NonNull BadgeKitView badgeKitView2, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView, @NonNull FinToolbarView finToolbarView) {
        this.f55645a = constraintLayout;
        this.f55646b = inputView;
        this.f55647c = inputView2;
        this.f55648d = view;
        this.f55649e = badgeKitView;
        this.f55650f = permissionsScreenStateView;
        this.f55651g = recyclerView;
        this.f55652h = badgeKitView2;
        this.f55653i = view2;
        this.f55654j = appCompatTextView;
        this.f55655k = finToolbarView;
    }

    @NonNull
    public static C5580h b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.offline_select_fragment, viewGroup, false);
        int i11 = R.id.badges;
        if (((HorizontalScrollView) C2548q.d(R.id.badges, inflate)) != null) {
            i11 = R.id.input_bank;
            InputView inputView = (InputView) C2548q.d(R.id.input_bank, inflate);
            if (inputView != null) {
                i11 = R.id.input_contact;
                InputView inputView2 = (InputView) C2548q.d(R.id.input_contact, inflate);
                if (inputView2 != null) {
                    i11 = R.id.input_holder;
                    View d11 = C2548q.d(R.id.input_holder, inflate);
                    if (d11 != null) {
                        i11 = R.id.left;
                        BadgeKitView badgeKitView = (BadgeKitView) C2548q.d(R.id.left, inflate);
                        if (badgeKitView != null) {
                            i11 = R.id.permissions_screen_state;
                            PermissionsScreenStateView permissionsScreenStateView = (PermissionsScreenStateView) C2548q.d(R.id.permissions_screen_state, inflate);
                            if (permissionsScreenStateView != null) {
                                i11 = R.id.recycler;
                                RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.recycler, inflate);
                                if (recyclerView != null) {
                                    i11 = R.id.right;
                                    BadgeKitView badgeKitView2 = (BadgeKitView) C2548q.d(R.id.right, inflate);
                                    if (badgeKitView2 != null) {
                                        i11 = R.id.separator;
                                        View d12 = C2548q.d(R.id.separator, inflate);
                                        if (d12 != null) {
                                            i11 = R.id.text_bank_sbp;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.text_bank_sbp, inflate);
                                            if (appCompatTextView != null) {
                                                i11 = R.id.toolbar;
                                                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.toolbar, inflate);
                                                if (finToolbarView != null) {
                                                    return new C5580h((ConstraintLayout) inflate, inputView, inputView2, d11, badgeKitView, permissionsScreenStateView, recyclerView, badgeKitView2, d12, appCompatTextView, finToolbarView);
                                                }
                                            }
                                        }
                                    }
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
    public final ConstraintLayout a() {
        return this.f55645a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f55645a;
    }
}
