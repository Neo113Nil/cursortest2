package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c00 implements y11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1055a;

    public /* synthetic */ c00(int i) {
        this.f1055a = i;
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        switch (this.f1055a) {
            case 0:
                return new C0310i4((File) obj);
            case 1:
                return new C0310i4(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new c80(drawable, 1);
                }
                return null;
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo19b(Object obj, uu0 uu0Var) {
        switch (this.f1055a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
