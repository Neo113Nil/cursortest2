package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: jy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0376jy implements fc0 {
    @Override // p000.fc0
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo1765a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: b */
    public final int mo1766b(InputStream inputStream, nk0 nk0Var) throws Throwable {
        int iM1522e;
        C0339iy c0339iy = new C0339iy(inputStream);
        C0191ey c0191eyM2719c = c0339iy.m2719c("Orientation");
        if (c0191eyM2719c == null) {
            iM1522e = 1;
        } else {
            try {
                iM1522e = c0191eyM2719c.m1522e(c0339iy.f3731f);
            } catch (NumberFormatException unused) {
                iM1522e = 1;
            }
        }
        if (iM1522e == 0) {
            return -1;
        }
        return iM1522e;
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: c */
    public final boolean mo1767c(ByteBuffer byteBuffer, nk0 nk0Var) {
        return false;
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: d */
    public final int mo1768d(ByteBuffer byteBuffer, nk0 nk0Var) {
        AtomicReference atomicReference = AbstractC0429ld.f4762a;
        return mo1766b(new C0355jd(byteBuffer), nk0Var);
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: e */
    public final boolean mo1769e(InputStream inputStream, nk0 nk0Var) {
        return false;
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo1770f(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
