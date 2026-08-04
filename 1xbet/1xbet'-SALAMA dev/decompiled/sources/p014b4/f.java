package p014b4;

import com.google.android.gms.common.api.internal.C0787h;
import com.google.android.gms.common.api.internal.InterfaceC0781b;
import com.google.android.gms.internal.base.zau;
import p036e6.c;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements InterfaceC0781b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10144a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10145b;

    public f(C0787h c0787h) {
        this.f10145b = c0787h;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0781b
    public final void a(boolean z4) {
        switch (this.f10144a) {
            case 0:
                g gVar = (g) this.f10145b;
                gVar.getClass();
                if (!z4) {
                    gVar.getClass();
                    break;
                }
                break;
            default:
                zau zauVar = ((C0787h) this.f10145b).f11181E;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z4)));
                break;
        }
    }

    public f(g gVar, V0 v6, c cVar) {
        this.f10145b = gVar;
    }
}
