package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;

/* loaded from: classes3.dex */
public final class y implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f14571a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final IconTitleSubtitleCellView f14572b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final UncontainedButtonView f14573c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14574d;

    private y(@NonNull LinearLayout linearLayout, @NonNull IconTitleSubtitleCellView iconTitleSubtitleCellView, @NonNull UncontainedButtonView uncontainedButtonView, @NonNull LinearLayout linearLayout2) {
        this.f14571a = linearLayout;
        this.f14572b = iconTitleSubtitleCellView;
        this.f14573c = uncontainedButtonView;
        this.f14574d = linearLayout2;
    }

    @NonNull
    public static y a(@NonNull View view) {
        int i11 = R.id.disclaimerBodyView;
        IconTitleSubtitleCellView iconTitleSubtitleCellView = (IconTitleSubtitleCellView) C2548q.d(R.id.disclaimerBodyView, view);
        if (iconTitleSubtitleCellView != null) {
            i11 = R.id.disclaimerButton;
            UncontainedButtonView uncontainedButtonView = (UncontainedButtonView) C2548q.d(R.id.disclaimerButton, view);
            if (uncontainedButtonView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new y(linearLayout, iconTitleSubtitleCellView, uncontainedButtonView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14571a;
    }
}
