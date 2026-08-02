package Ii;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes10.dex */
public final class c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f12556a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final IconButtonV3View f12557b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CellView f12558c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final CellView f12559d;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull CellView cellView, @NonNull CellView cellView2) {
        this.f12556a = constraintLayout;
        this.f12557b = iconButtonV3View;
        this.f12558c = cellView;
        this.f12559d = cellView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = R.id.closeButton;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(R.id.closeButton, view);
        if (iconButtonV3View != null) {
            i11 = R.id.takePhotoCV;
            CellView cellView = (CellView) C2548q.d(R.id.takePhotoCV, view);
            if (cellView != null) {
                i11 = R.id.takeVideoCV;
                CellView cellView2 = (CellView) C2548q.d(R.id.takeVideoCV, view);
                if (cellView2 != null) {
                    i11 = R.id.title;
                    if (((TextAtomV2View) C2548q.d(R.id.title, view)) != null) {
                        return new c((ConstraintLayout) view, iconButtonV3View, cellView, cellView2);
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
        return this.f12556a;
    }
}
