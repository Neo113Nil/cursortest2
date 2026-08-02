package M70;

import B1.C2548q;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes3.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f17549a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f17550b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17551c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f17552d;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView) {
        this.f17549a = constraintLayout;
        this.f17550b = buttonV3View;
        this.f17551c = constraintLayout2;
        this.f17552d = imageView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = R.id.continue_empty_bank_phone_button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.continue_empty_bank_phone_button, view);
        if (buttonV3View != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R.id.ic_close;
            ImageView imageView = (ImageView) C2548q.d(R.id.ic_close, view);
            if (imageView != null) {
                i12 = R.id.iv_warning;
                if (((ImageView) C2548q.d(R.id.iv_warning, view)) != null) {
                    i12 = R.id.tv_hint;
                    if (((TextView) C2548q.d(R.id.tv_hint, view)) != null) {
                        i12 = R.id.tv_subtitle;
                        if (((TextView) C2548q.d(R.id.tv_subtitle, view)) != null) {
                            i12 = R.id.tv_title;
                            if (((TextView) C2548q.d(R.id.tv_title, view)) != null) {
                                return new b(constraintLayout, buttonV3View, constraintLayout, imageView);
                            }
                        }
                    }
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f17549a;
    }
}
