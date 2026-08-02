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
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f17546a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f17547b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17548c;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull ConstraintLayout constraintLayout2) {
        this.f17546a = constraintLayout;
        this.f17547b = buttonV3View;
        this.f17548c = constraintLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = R.id.continue_dbo_button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.continue_dbo_button, view);
        if (buttonV3View != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R.id.iv_warning;
            if (((ImageView) C2548q.d(R.id.iv_warning, view)) != null) {
                i12 = R.id.tv_description;
                if (((TextView) C2548q.d(R.id.tv_description, view)) != null) {
                    i12 = R.id.tv_title;
                    if (((TextView) C2548q.d(R.id.tv_title, view)) != null) {
                        return new a(constraintLayout, buttonV3View, constraintLayout);
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
        return this.f17546a;
    }
}
