package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes3.dex */
public final class q implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14531a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14532b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14533c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14534d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Image f14535e;

    private q(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View2, @NonNull Image image) {
        this.f14531a = constraintLayout;
        this.f14532b = textAtomV2View;
        this.f14533c = buttonV3View;
        this.f14534d = textAtomV2View2;
        this.f14535e = image;
    }

    @NonNull
    public static q a(@NonNull View view) {
        int i11 = R.id.centerHorizontal;
        if (((Guideline) C2548q.d(R.id.centerHorizontal, view)) != null) {
            i11 = R.id.descriptionTextAtomView;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.descriptionTextAtomView, view);
            if (textAtomV2View != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R.id.submitButton;
                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.submitButton, view);
                if (buttonV3View != null) {
                    i11 = R.id.titleTextAtomView;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, view);
                    if (textAtomV2View2 != null) {
                        i11 = R.id.userImage;
                        Image image = (Image) C2548q.d(R.id.userImage, view);
                        if (image != null) {
                            return new q(constraintLayout, textAtomV2View, buttonV3View, textAtomV2View2, image);
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
        return this.f14531a;
    }
}
