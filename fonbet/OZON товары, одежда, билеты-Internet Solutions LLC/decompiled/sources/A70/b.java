package A70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.operations.ui.actioncard.ActionCardView;
import ru.ozon.fintech.features.operations.ui.operationinfo.OperationInfoCardView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f535a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionCardView f536b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ActionCardView f537c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final OperationInfoCardView f538d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f539e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ShimmerFrameLayout f540f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f541g;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ActionCardView actionCardView, @NonNull ActionCardView actionCardView2, @NonNull OperationInfoCardView operationInfoCardView, @NonNull ScreenStateView screenStateView, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull FinToolbarView finToolbarView) {
        this.f535a = constraintLayout;
        this.f536b = actionCardView;
        this.f537c = actionCardView2;
        this.f538d = operationInfoCardView;
        this.f539e = screenStateView;
        this.f540f = shimmerFrameLayout;
        this.f541g = finToolbarView;
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.operation_info_fragment, viewGroup, false);
        int i11 = R.id.action_card_home;
        ActionCardView actionCardView = (ActionCardView) C2548q.d(R.id.action_card_home, inflate);
        if (actionCardView != null) {
            i11 = R.id.action_card_show_another_info;
            ActionCardView actionCardView2 = (ActionCardView) C2548q.d(R.id.action_card_show_another_info, inflate);
            if (actionCardView2 != null) {
                i11 = R.id.guideline;
                if (((Guideline) C2548q.d(R.id.guideline, inflate)) != null) {
                    i11 = R.id.operation_info_card;
                    OperationInfoCardView operationInfoCardView = (OperationInfoCardView) C2548q.d(R.id.operation_info_card, inflate);
                    if (operationInfoCardView != null) {
                        i11 = R.id.screen_state;
                        ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
                        if (screenStateView != null) {
                            i11 = R.id.shimmer_placeholder;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(R.id.shimmer_placeholder, inflate);
                            if (shimmerFrameLayout != null) {
                                i11 = R.id.toolbar;
                                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.toolbar, inflate);
                                if (finToolbarView != null) {
                                    return new b((ConstraintLayout) inflate, actionCardView, actionCardView2, operationInfoCardView, screenStateView, shimmerFrameLayout, finToolbarView);
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
        return this.f535a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f535a;
    }
}
