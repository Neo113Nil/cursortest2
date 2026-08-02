package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class h implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f14433a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f14434b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f14435c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14436d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14437e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14438f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14439g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14440h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14441i;

    private h(@NonNull NestedScrollView nestedScrollView, @NonNull View view, @NonNull SwitchCompat switchCompat, @NonNull MaterialButton materialButton, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.f14433a = nestedScrollView;
        this.f14434b = view;
        this.f14435c = switchCompat;
        this.f14436d = materialButton;
        this.f14437e = appCompatTextView;
        this.f14438f = appCompatTextView2;
        this.f14439g = appCompatTextView3;
        this.f14440h = appCompatTextView4;
        this.f14441i = appCompatTextView5;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i11 = R.id.appCredentialsBlock;
        View d11 = C2548q.d(R.id.appCredentialsBlock, view);
        if (d11 != null) {
            i11 = R.id.appCredentialsBlockTitleTextView;
            if (((AppCompatTextView) C2548q.d(R.id.appCredentialsBlockTitleTextView, view)) != null) {
                i11 = R.id.appCredentialsSwitchButton;
                SwitchCompat switchCompat = (SwitchCompat) C2548q.d(R.id.appCredentialsSwitchButton, view);
                if (switchCompat != null) {
                    i11 = R.id.copyAppCredentialsButton;
                    MaterialButton materialButton = (MaterialButton) C2548q.d(R.id.copyAppCredentialsButton, view);
                    if (materialButton != null) {
                        i11 = R.id.mainDomainCookiesTextView;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.mainDomainCookiesTextView, view);
                        if (appCompatTextView != null) {
                            i11 = R.id.mainDomainCookiesTextViewSSO2;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.mainDomainCookiesTextViewSSO2, view);
                            if (appCompatTextView2 != null) {
                                i11 = R.id.mainDomainCookiesTitleTextView;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(R.id.mainDomainCookiesTitleTextView, view);
                                if (appCompatTextView3 != null) {
                                    i11 = R.id.mainDomainCookiesTitleTextViewSSO2;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C2548q.d(R.id.mainDomainCookiesTitleTextViewSSO2, view);
                                    if (appCompatTextView4 != null) {
                                        i11 = R.id.otherDomainsCookiesTextView;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) C2548q.d(R.id.otherDomainsCookiesTextView, view);
                                        if (appCompatTextView5 != null) {
                                            i11 = R.id.otherDomainsCookiesTitleTextView;
                                            if (((AppCompatTextView) C2548q.d(R.id.otherDomainsCookiesTitleTextView, view)) != null) {
                                                i11 = R.id.ozonIdDebugAppCredentialsContent;
                                                if (((ConstraintLayout) C2548q.d(R.id.ozonIdDebugAppCredentialsContent, view)) != null) {
                                                    return new h((NestedScrollView) view, d11, switchCompat, materialButton, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14433a;
    }
}
