package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* renamed from: Jb0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3385c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14400a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14401b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14402c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f14403d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ErrorView f14404e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LoaderView f14405f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f14406g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14407h;

    private C3385c(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull NestedScrollView nestedScrollView, @NonNull ErrorView errorView, @NonNull LoaderView loaderView, @NonNull View view, @NonNull TextAtomV2View textAtomV2View) {
        this.f14400a = constraintLayout;
        this.f14401b = appCompatImageView;
        this.f14402c = appCompatImageView2;
        this.f14403d = nestedScrollView;
        this.f14404e = errorView;
        this.f14405f = loaderView;
        this.f14406g = view;
        this.f14407h = textAtomV2View;
    }

    @NonNull
    public static C3385c b(@NonNull LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_ozon_id_flow, (ViewGroup) null, false);
        int i11 = R.id.backButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.backButton, inflate);
        if (appCompatImageView != null) {
            i11 = R.id.closeFlowButton;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(R.id.closeFlowButton, inflate);
            if (appCompatImageView2 != null) {
                i11 = R.id.contentScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) C2548q.d(R.id.contentScrollView, inflate);
                if (nestedScrollView != null) {
                    i11 = R.id.errorView;
                    ErrorView errorView = (ErrorView) C2548q.d(R.id.errorView, inflate);
                    if (errorView != null) {
                        i11 = R.id.fragment_container;
                        if (((FrameLayout) C2548q.d(R.id.fragment_container, inflate)) != null) {
                            i11 = R.id.loaderView;
                            LoaderView loaderView = (LoaderView) C2548q.d(R.id.loaderView, inflate);
                            if (loaderView != null) {
                                i11 = R.id.navigationButtonsGuideline;
                                if (((Guideline) C2548q.d(R.id.navigationButtonsGuideline, inflate)) != null) {
                                    i11 = R.id.shadowLoadingView;
                                    View d11 = C2548q.d(R.id.shadowLoadingView, inflate);
                                    if (d11 != null) {
                                        i11 = R.id.toolbarTitle;
                                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.toolbarTitle, inflate);
                                        if (textAtomV2View != null) {
                                            return new C3385c((ConstraintLayout) inflate, appCompatImageView, appCompatImageView2, nestedScrollView, errorView, loaderView, d11, textAtomV2View);
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
        return this.f14400a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14400a;
    }
}
