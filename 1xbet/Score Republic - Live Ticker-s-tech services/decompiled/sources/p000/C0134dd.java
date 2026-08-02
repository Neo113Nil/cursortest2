package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0134dd implements y11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1627a;

    /* JADX INFO: renamed from: b */
    public final C0281hc f1628b;

    public C0134dd(int i) {
        this.f1627a = i;
        switch (i) {
            case 1:
                this.f1628b = new C0281hc();
                break;
            default:
                this.f1628b = new C0281hc();
                break;
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        int i3 = this.f1627a;
        C0281hc c0281hc = this.f1628b;
        switch (i3) {
            case 0:
                return c0281hc.m2254c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, uu0Var);
            default:
                return c0281hc.m2254c(ImageDecoder.createSource(AbstractC0429ld.m3210b((InputStream) obj)), i, i2, uu0Var);
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo19b(Object obj, uu0 uu0Var) {
        switch (this.f1627a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
