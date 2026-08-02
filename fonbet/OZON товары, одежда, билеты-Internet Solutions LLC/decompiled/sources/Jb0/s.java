package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes3.dex */
public final class s implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f14542a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14543b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14544c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14545d;

    private s(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextAtomV2View textAtomV2View) {
        this.f14542a = linearLayout;
        this.f14543b = linearLayout2;
        this.f14544c = linearLayout3;
        this.f14545d = textAtomV2View;
    }

    @NonNull
    public static s a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R.id.logoImageView;
        if (((ImageView) C2548q.d(R.id.logoImageView, view)) != null) {
            i11 = R.id.reasonCells;
            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(R.id.reasonCells, view);
            if (linearLayout2 != null) {
                i11 = R.id.titleTextAtomV2;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.titleTextAtomV2, view);
                if (textAtomV2View != null) {
                    return new s(linearLayout, linearLayout, linearLayout2, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14542a;
    }
}
