package p086m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p078l.c;

/* JADX INFO: loaded from: classes.dex */
public final class o extends FrameLayout implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f15188a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view) {
        super(view.getContext());
        this.f15188a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p078l.c
    public final void c() {
        this.f15188a.onActionViewExpanded();
    }

    @Override // p078l.c
    public final void d() {
        this.f15188a.onActionViewCollapsed();
    }
}
