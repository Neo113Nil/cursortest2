package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.ErrorView;

/* renamed from: Jb0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3386d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14408a;

    private C3386d(@NonNull ConstraintLayout constraintLayout) {
        this.f14408a = constraintLayout;
    }

    @NonNull
    public static C3386d b(@NonNull LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_ozon_id_logout, (ViewGroup) null, false);
        if (((ErrorView) C2548q.d(R.id.errorView, inflate)) != null) {
            return new C3386d((ConstraintLayout) inflate);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.errorView)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f14408a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14408a;
    }
}
