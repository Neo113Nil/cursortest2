package L40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.ui.CbottomUIScrollableView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final CbottomUIScrollableView f16555a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CbottomUIScrollableView f16556b;

    private a(@NonNull CbottomUIScrollableView cbottomUIScrollableView, @NonNull CbottomUIScrollableView cbottomUIScrollableView2) {
        this.f16555a = cbottomUIScrollableView;
        this.f16556b = cbottomUIScrollableView2;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.full_fragment, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        CbottomUIScrollableView cbottomUIScrollableView = (CbottomUIScrollableView) inflate;
        return new a(cbottomUIScrollableView, cbottomUIScrollableView);
    }

    @NonNull
    public final CbottomUIScrollableView a() {
        return this.f16555a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f16555a;
    }
}
