package Jb0;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class o implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14522a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f14523b;

    private o(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.f14522a = constraintLayout;
        this.f14523b = constraintLayout2;
    }

    @NonNull
    public static o a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new o(constraintLayout, constraintLayout);
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14522a;
    }
}
