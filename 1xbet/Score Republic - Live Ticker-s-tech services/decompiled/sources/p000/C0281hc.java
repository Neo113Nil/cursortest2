package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: hc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0281hc implements y11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3161a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0318ic f3162b;

    public C0281hc() {
        this.f3161a = 0;
        this.f3162b = new wa0(12);
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        switch (this.f3161a) {
            case 0:
                return m2254c((ImageDecoder.Source) obj, i, i2, uu0Var);
            default:
                Bitmap bitmapM5747b = ((y91) obj).m5747b();
                if (bitmapM5747b == null) {
                    return null;
                }
                return new C0354jc(this.f3162b, bitmapM5747b);
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo19b(Object obj, uu0 uu0Var) {
        switch (this.f3161a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C0354jc m2254c(ImageDecoder.Source source, int i, int i2, uu0 uu0Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C0849wq(i, i2, uu0Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C0354jc((wa0) this.f3162b, bitmapDecodeBitmap);
    }

    public C0281hc(InterfaceC0318ic interfaceC0318ic) {
        this.f3161a = 1;
        this.f3162b = interfaceC0318ic;
    }
}
