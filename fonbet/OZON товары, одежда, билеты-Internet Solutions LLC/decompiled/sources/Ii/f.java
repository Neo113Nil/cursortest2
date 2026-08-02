package Ii;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.cell.CellView;

/* loaded from: classes10.dex */
public final class f implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f12574a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CellView f12575b;

    private f(@NonNull FrameLayout frameLayout, @NonNull CellView cellView) {
        this.f12574a = frameLayout;
        this.f12575b = cellView;
    }

    @NonNull
    public static f b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.permissions_warning_message_gallery_item, viewGroup, false);
        CellView cellView = (CellView) C2548q.d(R.id.permission_warning, inflate);
        if (cellView != null) {
            return new f((FrameLayout) inflate, cellView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.permission_warning)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f12574a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f12574a;
    }
}
