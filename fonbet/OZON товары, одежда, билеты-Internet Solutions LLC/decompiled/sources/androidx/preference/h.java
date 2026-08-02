package androidx.preference;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class h extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<View> f44610a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44611b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44612c;

    h(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f44610a = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(ru.ozon.app.android.R.id.icon_frame, view.findViewById(ru.ozon.app.android.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    public final View e(int i11) {
        SparseArray<View> sparseArray = this.f44610a;
        View view = sparseArray.get(i11);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i11);
        if (findViewById != null) {
            sparseArray.put(i11, findViewById);
        }
        return findViewById;
    }

    public final boolean f() {
        return this.f44611b;
    }

    public final boolean g() {
        return this.f44612c;
    }

    public final void h(boolean z11) {
        this.f44611b = z11;
    }

    public final void i(boolean z11) {
        this.f44612c = z11;
    }
}
