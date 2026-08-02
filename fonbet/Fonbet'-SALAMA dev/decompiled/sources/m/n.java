package m;

import P.AbstractC0347c;
import android.view.ActionProvider;
import android.view.View;

/* loaded from: classes.dex */
public final class n extends AbstractC0347c implements ActionProvider.VisibilityListener {

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f15179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f15180c;

    /* renamed from: d, reason: collision with root package name */
    public R4.c f15181d;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15180c = rVar;
        this.f15179b = actionProvider;
    }

    @Override // P.AbstractC0347c
    public final boolean a() {
        return this.f15179b.isVisible();
    }

    @Override // P.AbstractC0347c
    public final View b(m mVar) {
        return this.f15179b.onCreateActionView(mVar);
    }

    @Override // P.AbstractC0347c
    public final boolean c() {
        return this.f15179b.overridesItemVisibility();
    }

    @Override // P.AbstractC0347c
    public final void d(R4.c cVar) {
        this.f15181d = cVar;
        this.f15179b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        R4.c cVar = this.f15181d;
        if (cVar != null) {
            k kVar = ((m) cVar.f6064b).f15154E;
            kVar.f15145y = true;
            kVar.p(true);
        }
    }
}
