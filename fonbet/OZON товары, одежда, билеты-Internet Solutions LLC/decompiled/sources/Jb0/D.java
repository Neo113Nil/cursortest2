package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.ImageFixed;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes3.dex */
public final class D implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14369a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonView f14370b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final IconView f14371c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageFixed f14372d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonView f14373e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14374f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14375g;

    private D(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonView buttonView, @NonNull IconView iconView, @NonNull ImageFixed imageFixed, @NonNull ButtonView buttonView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.f14369a = constraintLayout;
        this.f14370b = buttonView;
        this.f14371c = iconView;
        this.f14372d = imageFixed;
        this.f14373e = buttonView2;
        this.f14374f = textAtomV2View;
        this.f14375g = textAtomV2View2;
    }

    @NonNull
    public static D b(@NonNull LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.ozon_id_sheet_view_dialog, (ViewGroup) null, false);
        int i11 = R.id.cancelButton;
        ButtonView buttonView = (ButtonView) C2548q.d(R.id.cancelButton, inflate);
        if (buttonView != null) {
            i11 = R.id.iconView;
            IconView iconView = (IconView) C2548q.d(R.id.iconView, inflate);
            if (iconView != null) {
                i11 = R.id.imageView;
                ImageFixed imageFixed = (ImageFixed) C2548q.d(R.id.imageView, inflate);
                if (imageFixed != null) {
                    i11 = R.id.pictureBarrier;
                    if (((Barrier) C2548q.d(R.id.pictureBarrier, inflate)) != null) {
                        i11 = R.id.submitButton;
                        ButtonView buttonView2 = (ButtonView) C2548q.d(R.id.submitButton, inflate);
                        if (buttonView2 != null) {
                            i11 = R.id.subtitleTextAtomView;
                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.subtitleTextAtomView, inflate);
                            if (textAtomV2View != null) {
                                i11 = R.id.titleTextAtomView;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, inflate);
                                if (textAtomV2View2 != null) {
                                    return new D((ConstraintLayout) inflate, buttonView, iconView, imageFixed, buttonView2, textAtomV2View, textAtomV2View2);
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
        return this.f14369a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14369a;
    }
}
