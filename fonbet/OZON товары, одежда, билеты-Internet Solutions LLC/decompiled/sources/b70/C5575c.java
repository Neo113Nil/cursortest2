package b70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView;
import ru.ozon.fintech.features.offline.ui.itemcard.IconTextCardView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* renamed from: b70.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5575c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f55590a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55591b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Space f55592c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final IconTextCardView f55593d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final IconTextCardView f55594e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f55595f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final DisclaimerView f55596g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final AccountCardView f55597h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55598i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f55599j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55600k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ScrollView f55601l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f55602m;

    private C5575c(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Space space, @NonNull IconTextCardView iconTextCardView, @NonNull IconTextCardView iconTextCardView2, @NonNull ButtonV3View buttonV3View, @NonNull DisclaimerView disclaimerView, @NonNull AccountCardView accountCardView, @NonNull AppCompatTextView appCompatTextView, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2, @NonNull ScrollView scrollView, @NonNull FinToolbarView finToolbarView) {
        this.f55590a = constraintLayout;
        this.f55591b = view;
        this.f55592c = space;
        this.f55593d = iconTextCardView;
        this.f55594e = iconTextCardView2;
        this.f55595f = buttonV3View;
        this.f55596g = disclaimerView;
        this.f55597h = accountCardView;
        this.f55598i = appCompatTextView;
        this.f55599j = view2;
        this.f55600k = constraintLayout2;
        this.f55601l = scrollView;
        this.f55602m = finToolbarView;
    }

    @NonNull
    public static C5575c a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.offline_main_fragment, viewGroup, false);
        int i11 = R.id.bottom_holder;
        View d11 = C2548q.d(R.id.bottom_holder, inflate);
        if (d11 != null) {
            i11 = R.id.bottom_space;
            Space space = (Space) C2548q.d(R.id.bottom_space, inflate);
            if (space != null) {
                i11 = R.id.icon_text_card_call_center;
                IconTextCardView iconTextCardView = (IconTextCardView) C2548q.d(R.id.icon_text_card_call_center, inflate);
                if (iconTextCardView != null) {
                    i11 = R.id.icon_text_card_sbp;
                    IconTextCardView iconTextCardView2 = (IconTextCardView) C2548q.d(R.id.icon_text_card_sbp, inflate);
                    if (iconTextCardView2 != null) {
                        i11 = R.id.offline_button;
                        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.offline_button, inflate);
                        if (buttonV3View != null) {
                            i11 = R.id.offline_disclaimer;
                            DisclaimerView disclaimerView = (DisclaimerView) C2548q.d(R.id.offline_disclaimer, inflate);
                            if (disclaimerView != null) {
                                i11 = R.id.offline_main_account_view;
                                AccountCardView accountCardView = (AccountCardView) C2548q.d(R.id.offline_main_account_view, inflate);
                                if (accountCardView != null) {
                                    i11 = R.id.offline_title;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.offline_title, inflate);
                                    if (appCompatTextView != null) {
                                        i11 = R.id.offline_v_background;
                                        View d12 = C2548q.d(R.id.offline_v_background, inflate);
                                        if (d12 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                            i11 = R.id.scroll_view;
                                            ScrollView scrollView = (ScrollView) C2548q.d(R.id.scroll_view, inflate);
                                            if (scrollView != null) {
                                                i11 = R.id.tool_bar;
                                                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                                if (finToolbarView != null) {
                                                    i11 = R.id.top_space;
                                                    if (((Space) C2548q.d(R.id.top_space, inflate)) != null) {
                                                        return new C5575c(constraintLayout, d11, space, iconTextCardView, iconTextCardView2, buttonV3View, disclaimerView, accountCardView, appCompatTextView, d12, constraintLayout, scrollView, finToolbarView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f55590a;
    }
}
