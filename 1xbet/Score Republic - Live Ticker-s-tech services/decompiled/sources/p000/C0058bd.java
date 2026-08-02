package p000;

import java.io.File;

/* JADX INFO: renamed from: bd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058bd implements hq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f832a;

    /* JADX INFO: renamed from: b */
    public final Object f833b;

    public /* synthetic */ C0058bd(int i, Object obj) {
        this.f832a = i;
        this.f833b = obj;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        switch (this.f832a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        int i3 = this.f832a;
        Object obj2 = this.f833b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new gq0(new us0(bArr), new in0(1, bArr, (InterfaceC0014ad) obj2));
            case 1:
                return new gq0(new us0(obj), new in0(obj.toString(), (o31) obj2));
            default:
                File file = (File) obj;
                return new gq0(new us0(file), new f00(file, (g00) obj2, 0));
        }
    }
}
