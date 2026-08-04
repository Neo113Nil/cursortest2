package androidx.appcompat.widget;

import P.AbstractC0347c;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0640s implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f8737a;

    public ViewOnClickListenerC0640s(ActivityChooserView activityChooserView) {
        this.f8737a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.f8737a;
        FrameLayout frameLayout = activityChooserView.f8254f;
        r rVar = activityChooserView.f8249a;
        if (view == frameLayout) {
            activityChooserView.a();
            rVar.getClass();
            throw null;
        }
        if (view != activityChooserView.f8252d) {
            throw new IllegalArgumentException();
        }
        rVar.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0623j c0623j;
        p086m.k kVar;
        ActivityChooserView activityChooserView = this.f8737a;
        PopupWindow.OnDismissListener onDismissListener = activityChooserView.f8247A;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        AbstractC0347c abstractC0347c = activityChooserView.f8255x;
        if (abstractC0347c == null || (c0623j = abstractC0347c.f5050a) == null || (kVar = c0623j.f8653c) == null) {
            return;
        }
        kVar.c(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        ((r) adapterView.getAdapter()).getClass();
        ActivityChooserView activityChooserView = this.f8737a;
        activityChooserView.a();
        activityChooserView.f8249a.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.f8737a;
        if (view != activityChooserView.f8254f) {
            throw new IllegalArgumentException();
        }
        activityChooserView.f8249a.getClass();
        throw null;
    }
}
