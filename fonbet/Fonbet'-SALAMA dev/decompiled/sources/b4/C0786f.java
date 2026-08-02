package b4;

import com.google.android.gms.common.api.internal.C0831h;
import com.google.android.gms.common.api.internal.InterfaceC0825b;
import com.google.android.gms.internal.base.zau;
import e6.C1054c;
import w1.V0;

/* renamed from: b4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0786f implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10144a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10145b;

    public C0786f(C0831h c0831h) {
        this.f10145b = c0831h;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0825b
    public final void a(boolean z4) {
        switch (this.f10144a) {
            case 0:
                C0787g c0787g = (C0787g) this.f10145b;
                c0787g.getClass();
                if (!z4) {
                    c0787g.getClass();
                    break;
                }
                break;
            default:
                zau zauVar = ((C0831h) this.f10145b).f11181E;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z4)));
                break;
        }
    }

    public C0786f(C0787g c0787g, V0 v02, C1054c c1054c) {
        this.f10145b = c0787g;
    }
}
