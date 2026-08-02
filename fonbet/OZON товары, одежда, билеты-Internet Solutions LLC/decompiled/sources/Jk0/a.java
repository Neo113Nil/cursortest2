package Jk0;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import ru.ozon.uni.android.atom.badge.badgeList.BadgeListView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14827b;

    public /* synthetic */ a(View view, int i11) {
        this.f14826a = i11;
        this.f14827b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14826a) {
            case 0:
                this.f14827b.setVisibility(8);
                break;
            case 1:
                ((AppCompatEditText) this.f14827b).requestFocus();
                break;
            default:
                ((BadgeListView) this.f14827b).invalidateItemDecorations();
                break;
        }
    }
}
