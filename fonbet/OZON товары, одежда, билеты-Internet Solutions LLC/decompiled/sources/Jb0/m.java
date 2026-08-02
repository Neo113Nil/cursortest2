package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.credentials.views.BadgeOr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes3.dex */
public final class m implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14500a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14501b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f14502c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final x f14503d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextFieldCellView f14504e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final y f14505f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f14506g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14507h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ButtonView f14508i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14509j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14510k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final BadgeOr f14511l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14512m;

    private m(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull x xVar, @NonNull TextFieldCellView textFieldCellView, @NonNull y yVar, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ButtonView buttonView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull BadgeOr badgeOr, @NonNull TextAtomV2View textAtomV2View3) {
        this.f14500a = constraintLayout;
        this.f14501b = linearLayout;
        this.f14502c = constraintLayout2;
        this.f14503d = xVar;
        this.f14504e = textFieldCellView;
        this.f14505f = yVar;
        this.f14506g = textView;
        this.f14507h = linearLayout2;
        this.f14508i = buttonView;
        this.f14509j = textAtomV2View;
        this.f14510k = textAtomV2View2;
        this.f14511l = badgeOr;
        this.f14512m = textAtomV2View3;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i11 = R.id.containerSocialButtons;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.containerSocialButtons, view);
        if (linearLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R.id.countrySelector;
            View d11 = C2548q.d(R.id.countrySelector, view);
            if (d11 != null) {
                x a11 = x.a(d11);
                i11 = R.id.credentialsTextField;
                TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(R.id.credentialsTextField, view);
                if (textFieldCellView != null) {
                    i11 = R.id.disclaimer;
                    View d12 = C2548q.d(R.id.disclaimer, view);
                    if (d12 != null) {
                        y a12 = y.a(d12);
                        i11 = R.id.errorButton;
                        TextView textView = (TextView) C2548q.d(R.id.errorButton, view);
                        if (textView != null) {
                            i11 = R.id.hintButtonsLinearLayout;
                            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(R.id.hintButtonsLinearLayout, view);
                            if (linearLayout2 != null) {
                                i11 = R.id.logoImageView;
                                if (((ImageView) C2548q.d(R.id.logoImageView, view)) != null) {
                                    i11 = R.id.submitButton;
                                    ButtonView buttonView = (ButtonView) C2548q.d(R.id.submitButton, view);
                                    if (buttonView != null) {
                                        i11 = R.id.subtitleTextAtomV2;
                                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.subtitleTextAtomV2, view);
                                        if (textAtomV2View != null) {
                                            i11 = R.id.termsOfUseTextView;
                                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.termsOfUseTextView, view);
                                            if (textAtomV2View2 != null) {
                                                i11 = R.id.titleSocialButtons;
                                                BadgeOr badgeOr = (BadgeOr) C2548q.d(R.id.titleSocialButtons, view);
                                                if (badgeOr != null) {
                                                    i11 = R.id.titleTextAtomV2;
                                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomV2, view);
                                                    if (textAtomV2View3 != null) {
                                                        return new m(constraintLayout, linearLayout, constraintLayout, a11, textFieldCellView, a12, textView, linearLayout2, buttonView, textAtomV2View, textAtomV2View2, badgeOr, textAtomV2View3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14500a;
    }
}
