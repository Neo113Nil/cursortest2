package p086m;

import P.AbstractC0347c;
import R4.c;
import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0347c implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f15185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f15186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f15187d;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15186c = rVar;
        this.f15185b = actionProvider;
    }

    @Override // P.AbstractC0347c
    public final boolean a() {
        return this.f15185b.isVisible();
    }

    @Override // P.AbstractC0347c
    public final View b(m mVar) {
        return this.f15185b.onCreateActionView(mVar);
    }

    @Override // P.AbstractC0347c
    public final boolean c() {
        return this.f15185b.overridesItemVisibility();
    }

    @Override // P.AbstractC0347c
    public final void d(c cVar) {
        this.f15187d = cVar;
        this.f15185b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        c cVar = this.f15187d;
        if (cVar != null) {
            k kVar = ((m) cVar.f6064b).f15160E;
            kVar.f15151y = true;
            kVar.p(true);
        }
    }
}
