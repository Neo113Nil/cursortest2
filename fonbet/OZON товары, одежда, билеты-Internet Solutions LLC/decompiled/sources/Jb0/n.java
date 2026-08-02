package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes3.dex */
public final class n implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14513a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14514b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14515c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14516d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14517e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Image f14518f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14519g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14520h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14521i;

    private n(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View2, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4, @NonNull TextAtomV2View textAtomV2View5) {
        this.f14513a = constraintLayout;
        this.f14514b = textAtomV2View;
        this.f14515c = linearLayout;
        this.f14516d = buttonV3View;
        this.f14517e = textAtomV2View2;
        this.f14518f = image;
        this.f14519g = textAtomV2View3;
        this.f14520h = textAtomV2View4;
        this.f14521i = textAtomV2View5;
    }

    @NonNull
    public static n a(@NonNull View view) {
        int i11 = R.id.bottomUserInfo;
        if (((Barrier) C2548q.d(R.id.bottomUserInfo, view)) != null) {
            i11 = R.id.descriptionTextAtomView;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.descriptionTextAtomView, view);
            if (textAtomV2View != null) {
                i11 = R.id.hintButtonsLinearLayout;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.hintButtonsLinearLayout, view);
                if (linearLayout != null) {
                    i11 = R.id.logoImageView;
                    if (((AppCompatImageView) C2548q.d(R.id.logoImageView, view)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R.id.submitButton;
                        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.submitButton, view);
                        if (buttonV3View != null) {
                            i11 = R.id.termOfUse;
                            if (((TextAtomV2View) C2548q.d(R.id.termOfUse, view)) != null) {
                                i11 = R.id.titleTextAtomView;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, view);
                                if (textAtomV2View2 != null) {
                                    i11 = R.id.userImage;
                                    Image image = (Image) C2548q.d(R.id.userImage, view);
                                    if (image != null) {
                                        i11 = R.id.userMail;
                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(R.id.userMail, view);
                                        if (textAtomV2View3 != null) {
                                            i11 = R.id.userName;
                                            TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(R.id.userName, view);
                                            if (textAtomV2View4 != null) {
                                                i11 = R.id.userPhone;
                                                TextAtomV2View textAtomV2View5 = (TextAtomV2View) C2548q.d(R.id.userPhone, view);
                                                if (textAtomV2View5 != null) {
                                                    return new n(constraintLayout, textAtomV2View, linearLayout, buttonV3View, textAtomV2View2, image, textAtomV2View3, textAtomV2View4, textAtomV2View5);
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
        return this.f14513a;
    }
}
