package m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import l.InterfaceC1365c;

/* loaded from: classes.dex */
public final class o extends FrameLayout implements InterfaceC1365c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f15182a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view) {
        super(view.getContext());
        this.f15182a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // l.InterfaceC1365c
    public final void c() {
        this.f15182a.onActionViewExpanded();
    }

    @Override // l.InterfaceC1365c
    public final void d() {
        this.f15182a.onActionViewCollapsed();
    }
}
