package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.R;
import ru.ozon.id.antibot.errorView.AntibotErrorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes3.dex */
public final class E implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f14376a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final IconButtonV3View f14377b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14378c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14379d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14380e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14381f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14382g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14383h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f14384i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14385j;

    private E(@NonNull ViewGroup viewGroup, @NonNull IconButtonV3View iconButtonV3View, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull ButtonV3View buttonV3View2, @NonNull TextAtomV2View textAtomV2View2, @NonNull View view2, @NonNull TextAtomV2View textAtomV2View3) {
        this.f14376a = viewGroup;
        this.f14377b = iconButtonV3View;
        this.f14378c = view;
        this.f14379d = appCompatImageView;
        this.f14380e = buttonV3View;
        this.f14381f = textAtomV2View;
        this.f14382g = buttonV3View2;
        this.f14383h = textAtomV2View2;
        this.f14384i = view2;
        this.f14385j = textAtomV2View3;
    }

    @NonNull
    public static E a(@NonNull LayoutInflater layoutInflater, @NonNull AntibotErrorView antibotErrorView) {
        layoutInflater.inflate(R.layout.view_ozon_id_antibot_error, antibotErrorView);
        int i11 = R.id.closeBtn;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(R.id.closeBtn, antibotErrorView);
        if (iconButtonV3View != null) {
            i11 = R.id.contentBackground;
            View d11 = C2548q.d(R.id.contentBackground, antibotErrorView);
            if (d11 != null) {
                i11 = R.id.image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.image, antibotErrorView);
                if (appCompatImageView != null) {
                    i11 = R.id.refreshBtn;
                    ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.refreshBtn, antibotErrorView);
                    if (buttonV3View != null) {
                        i11 = R.id.subtitle;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.subtitle, antibotErrorView);
                        if (textAtomV2View != null) {
                            i11 = R.id.supportBtn;
                            ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(R.id.supportBtn, antibotErrorView);
                            if (buttonV3View2 != null) {
                                i11 = R.id.title;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.title, antibotErrorView);
                                if (textAtomV2View2 != null) {
                                    i11 = R.id.topBackground;
                                    View d12 = C2548q.d(R.id.topBackground, antibotErrorView);
                                    if (d12 != null) {
                                        i11 = R.id.traceView;
                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(R.id.traceView, antibotErrorView);
                                        if (textAtomV2View3 != null) {
                                            return new E(antibotErrorView, iconButtonV3View, d11, appCompatImageView, buttonV3View, textAtomV2View, buttonV3View2, textAtomV2View2, d12, textAtomV2View3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(antibotErrorView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14376a;
    }
}
