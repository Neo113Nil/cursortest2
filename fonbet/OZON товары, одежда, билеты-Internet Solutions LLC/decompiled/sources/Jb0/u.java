package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes3.dex */
public final class u implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f14550a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14551b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14552c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonView f14553d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14554e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonView f14555f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14556g;

    private u(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull LinearLayout linearLayout2, @NonNull ButtonView buttonView, @NonNull LinearLayout linearLayout3, @NonNull ButtonView buttonView2, @NonNull TextAtomV2View textAtomV2View2) {
        this.f14550a = linearLayout;
        this.f14551b = textAtomV2View;
        this.f14552c = linearLayout2;
        this.f14553d = buttonView;
        this.f14554e = linearLayout3;
        this.f14555f = buttonView2;
        this.f14556g = textAtomV2View2;
    }

    @NonNull
    public static u a(@NonNull View view) {
        int i11 = R.id.helpTextAtomView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.helpTextAtomView, view);
        if (textAtomV2View != null) {
            i11 = R.id.logoImageView;
            if (((AppCompatImageView) C2548q.d(R.id.logoImageView, view)) != null) {
                i11 = R.id.permissionsContainer;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.permissionsContainer, view);
                if (linearLayout != null) {
                    i11 = R.id.requestButton;
                    ButtonView buttonView = (ButtonView) C2548q.d(R.id.requestButton, view);
                    if (buttonView != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i11 = R.id.skipButton;
                        ButtonView buttonView2 = (ButtonView) C2548q.d(R.id.skipButton, view);
                        if (buttonView2 != null) {
                            i11 = R.id.titleTextAtomView;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, view);
                            if (textAtomV2View2 != null) {
                                return new u(linearLayout2, textAtomV2View, linearLayout, buttonView, linearLayout2, buttonView2, textAtomV2View2);
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
        return this.f14550a;
    }
}
