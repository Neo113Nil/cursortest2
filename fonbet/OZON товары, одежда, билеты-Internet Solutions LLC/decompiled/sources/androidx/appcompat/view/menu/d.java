package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.c;

/* loaded from: classes8.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.d f37392a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f37393b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f37394c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.C0714c f37395d;

    d(c.C0714c c0714c, c.d dVar, i iVar, g gVar) {
        this.f37395d = c0714c;
        this.f37392a = dVar;
        this.f37393b = iVar;
        this.f37394c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.d dVar = this.f37392a;
        if (dVar != null) {
            c.C0714c c0714c = this.f37395d;
            c.this.f37385z = true;
            dVar.f37390b.e(false);
            c.this.f37385z = false;
        }
        i iVar = this.f37393b;
        if (iVar.isEnabled() && iVar.hasSubMenu()) {
            this.f37394c.z(iVar, null, 4);
        }
    }
}
