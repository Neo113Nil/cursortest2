package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0346j4 implements y11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3812a;

    /* JADX INFO: renamed from: b */
    public final C0312i6 f3813b;

    public /* synthetic */ C0346j4(C0312i6 c0312i6, int i) {
        this.f3812a = i;
        this.f3813b = c0312i6;
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        switch (this.f3812a) {
            case 0:
                return C0312i6.m2535j(ImageDecoder.createSource((ByteBuffer) obj), i, i2, uu0Var);
            default:
                return C0312i6.m2535j(ImageDecoder.createSource(AbstractC0429ld.m3210b((InputStream) obj)), i, i2, uu0Var);
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final boolean mo19b(Object obj, uu0 uu0Var) throws IOException {
        int i = this.f3812a;
        C0312i6 c0312i6 = this.f3813b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM5771j = yd0.m5771j((ArrayList) c0312i6.f3447k, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM5771j != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM5771j == ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return true;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM5770i = yd0.m5770i((ArrayList) c0312i6.f3447k, (InputStream) obj, (nk0) c0312i6.f3448l);
                if (imageHeaderParser$ImageTypeM5770i != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM5770i == ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return true;
        }
    }
}
