package p042f4;

import com.google.android.gms.common.api.internal.InterfaceC0781b;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements InterfaceC0781b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f12991a;

    public x(u uVar) {
        this.f12991a = uVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0781b
    public final void a(boolean z4) {
        if (z4) {
            this.f12991a.f12975c = true;
            C0899h c0899h = this.f12991a.f12974b;
            c0899h.f12947d.removeCallbacks(c0899h.f12948e);
        } else {
            this.f12991a.f12975c = false;
            u uVar = this.f12991a;
            if (uVar.f12973a <= 0 || uVar.f12975c) {
                return;
            }
            this.f12991a.f12974b.a();
        }
    }
}
