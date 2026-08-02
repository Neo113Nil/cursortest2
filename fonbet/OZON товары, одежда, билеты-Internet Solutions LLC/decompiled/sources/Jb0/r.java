package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes3.dex */
public final class r implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14536a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14537b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14538c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14539d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14540e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14541f;

    private r(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull ButtonV3View buttonV3View2, @NonNull ButtonV3View buttonV3View3, @NonNull TextAtomV2View textAtomV2View2) {
        this.f14536a = constraintLayout;
        this.f14537b = buttonV3View;
        this.f14538c = textAtomV2View;
        this.f14539d = buttonV3View2;
        this.f14540e = buttonV3View3;
        this.f14541f = textAtomV2View2;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i11 = R.id.cancelButton;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.cancelButton, view);
        if (buttonV3View != null) {
            i11 = R.id.descriptionTextAtomView;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.descriptionTextAtomView, view);
            if (textAtomV2View != null) {
                i11 = R.id.logoImageView;
                if (((AppCompatImageView) C2548q.d(R.id.logoImageView, view)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R.id.socialButton;
                    ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(R.id.socialButton, view);
                    if (buttonV3View2 != null) {
                        i11 = R.id.submitButton;
                        ButtonV3View buttonV3View3 = (ButtonV3View) C2548q.d(R.id.submitButton, view);
                        if (buttonV3View3 != null) {
                            i11 = R.id.titleTextAtomView;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, view);
                            if (textAtomV2View2 != null) {
                                return new r(constraintLayout, buttonV3View, textAtomV2View, buttonV3View2, buttonV3View3, textAtomV2View2);
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
        return this.f14536a;
    }
}
