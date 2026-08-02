package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes3.dex */
public final class F implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f14386a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14387b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14388c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f14389d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14390e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonView f14391f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final SmallButtonView f14392g;

    private F(@NonNull ViewGroup viewGroup, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View2, @NonNull ButtonView buttonView, @NonNull SmallButtonView smallButtonView) {
        this.f14386a = viewGroup;
        this.f14387b = appCompatImageView;
        this.f14388c = textAtomV2View;
        this.f14389d = imageView;
        this.f14390e = textAtomV2View2;
        this.f14391f = buttonView;
        this.f14392g = smallButtonView;
    }

    @NonNull
    public static F a(@NonNull LayoutInflater layoutInflater, @NonNull ErrorView errorView) {
        layoutInflater.inflate(R.layout.view_ozon_id_error, errorView);
        int i11 = R.id.closeButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.closeButton, errorView);
        if (appCompatImageView != null) {
            i11 = R.id.errorDescTv;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.errorDescTv, errorView);
            if (textAtomV2View != null) {
                i11 = R.id.errorLogoIv;
                ImageView imageView = (ImageView) C2548q.d(R.id.errorLogoIv, errorView);
                if (imageView != null) {
                    i11 = R.id.errorTitleTv;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.errorTitleTv, errorView);
                    if (textAtomV2View2 != null) {
                        i11 = R.id.screenStateActionBtn;
                        ButtonView buttonView = (ButtonView) C2548q.d(R.id.screenStateActionBtn, errorView);
                        if (buttonView != null) {
                            i11 = R.id.screenStateSecondaryActionBtn;
                            SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(R.id.screenStateSecondaryActionBtn, errorView);
                            if (smallButtonView != null) {
                                return new F(errorView, appCompatImageView, textAtomV2View, imageView, textAtomV2View2, buttonView, smallButtonView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(errorView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14386a;
    }
}
