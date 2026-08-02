package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 extends FrameLayout implements InterfaceC0434li {

    /* JADX INFO: renamed from: j */
    public final CollapsibleActionView f7535j;

    /* JADX WARN: Multi-variable type inference failed */
    public tn0(View view) {
        super(view.getContext());
        this.f7535j = (CollapsibleActionView) view;
        addView(view);
    }
}
