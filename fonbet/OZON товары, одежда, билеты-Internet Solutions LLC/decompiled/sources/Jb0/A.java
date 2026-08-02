package Jb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class A implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14347a;

    private A(@NonNull ConstraintLayout constraintLayout) {
        this.f14347a = constraintLayout;
    }

    @NonNull
    public static A b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.ozon_id_loader_list_item, viewGroup, false);
        if (inflate != null) {
            return new A((ConstraintLayout) inflate);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f14347a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14347a;
    }
}
