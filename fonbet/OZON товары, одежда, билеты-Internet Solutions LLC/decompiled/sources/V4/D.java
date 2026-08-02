package V4;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class D extends m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f27984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f27985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f27986c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ E f27987d;

    D(E e11, ViewGroup viewGroup, View view, View view2) {
        this.f27987d = e11;
        this.f27984a = viewGroup;
        this.f27985b = view;
        this.f27986c = view2;
    }

    @Override // V4.l.f
    public final void onTransitionEnd(@NonNull l lVar) {
        this.f27986c.setTag(R.id.save_overlay_view, null);
        new u(this.f27984a).b(this.f27985b);
        lVar.removeListener(this);
    }

    @Override // V4.m, V4.l.f
    public final void onTransitionPause(@NonNull l lVar) {
        new u(this.f27984a).b(this.f27985b);
    }

    @Override // V4.m, V4.l.f
    public final void onTransitionResume(@NonNull l lVar) {
        View view = this.f27985b;
        if (view.getParent() == null) {
            new u(this.f27984a).a(view);
        } else {
            this.f27987d.cancel();
        }
    }
}
