package Ii;

import B1.C2548q;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes10.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f12553a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f12554b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final IconButtonV3View f12555c;

    private b(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull IconButtonV3View iconButtonV3View) {
        this.f12553a = linearLayout;
        this.f12554b = recyclerView;
        this.f12555c = iconButtonV3View;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = R.id.albumsRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.albumsRecyclerView, view);
        if (recyclerView != null) {
            i11 = R.id.albumsTitleTextView;
            if (((AppCompatTextView) C2548q.d(R.id.albumsTitleTextView, view)) != null) {
                i11 = R.id.closeButton;
                IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(R.id.closeButton, view);
                if (iconButtonV3View != null) {
                    return new b((LinearLayout) view, recyclerView, iconButtonV3View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f12553a;
    }
}
