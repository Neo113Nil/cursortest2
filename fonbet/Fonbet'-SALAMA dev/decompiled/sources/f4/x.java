package f4;

import com.google.android.gms.common.api.internal.InterfaceC0825b;

/* loaded from: classes2.dex */
public final class x implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f12985a;

    public x(u uVar) {
        this.f12985a = uVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0825b
    public final void a(boolean z4) {
        if (z4) {
            this.f12985a.f12969c = true;
            C1096h c1096h = this.f12985a.f12968b;
            c1096h.f12941d.removeCallbacks(c1096h.f12942e);
        } else {
            this.f12985a.f12969c = false;
            u uVar = this.f12985a;
            if (uVar.f12967a <= 0 || uVar.f12969c) {
                return;
            }
            this.f12985a.f12968b.a();
        }
    }
}
