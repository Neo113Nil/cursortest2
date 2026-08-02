package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes3.dex */
public final class C implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f14363a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Image f14364b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Group f14365c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonView f14366d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14367e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14368f;

    private C(@NonNull View view, @NonNull Image image, @NonNull Group group, @NonNull ButtonView buttonView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.f14363a = view;
        this.f14364b = image;
        this.f14365c = group;
        this.f14366d = buttonView;
        this.f14367e = textAtomV2View;
        this.f14368f = textAtomV2View2;
    }

    @NonNull
    public static C a(@NonNull View view) {
        int i11 = R.id.errorImageView;
        Image image = (Image) C2548q.d(R.id.errorImageView, view);
        if (image != null) {
            i11 = R.id.errorPageTypeGroup;
            Group group = (Group) C2548q.d(R.id.errorPageTypeGroup, view);
            if (group != null) {
                i11 = R.id.errorRetryButton;
                ButtonView buttonView = (ButtonView) C2548q.d(R.id.errorRetryButton, view);
                if (buttonView != null) {
                    i11 = R.id.errorSubtitleTextAtomView;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.errorSubtitleTextAtomView, view);
                    if (textAtomV2View != null) {
                        i11 = R.id.errorTitleTextAtomView;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.errorTitleTextAtomView, view);
                        if (textAtomV2View2 != null) {
                            return new C(view, image, group, buttonView, textAtomV2View, textAtomV2View2);
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
        return this.f14363a;
    }
}
