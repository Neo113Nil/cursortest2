package E;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.p;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class U implements androidx.camera.core.p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6847a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6848b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6849c;

    /* renamed from: d, reason: collision with root package name */
    p.a[] f6850d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final C.L f6851e;

    public U(@NonNull N.p<Bitmap> pVar) {
        Bitmap c11 = pVar.c();
        int f7 = pVar.f();
        long timestamp = pVar.a().getTimestamp();
        x2.i.a("Only accept Bitmap with ARGB_8888 format for now.", c11.getConfig() == Bitmap.Config.ARGB_8888);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c11.getAllocationByteCount());
        ImageProcessingUtil.e(c11, allocateDirect, c11.getRowBytes());
        allocateDirect.rewind();
        int width = c11.getWidth();
        int height = c11.getHeight();
        this.f6847a = new Object();
        this.f6848b = width;
        this.f6849c = height;
        this.f6851e = new T(timestamp, f7);
        allocateDirect.rewind();
        this.f6850d = new p.a[]{new S(width * 4, allocateDirect)};
    }

    private void c() {
        synchronized (this.f6847a) {
            x2.i.f("The image is closed.", this.f6850d != null);
        }
    }

    @Override // androidx.camera.core.p
    @NonNull
    public final p.a[] c0() {
        p.a[] aVarArr;
        synchronized (this.f6847a) {
            c();
            p.a[] aVarArr2 = this.f6850d;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f6847a) {
            c();
            this.f6850d = null;
        }
    }

    @Override // androidx.camera.core.p
    public final int g() {
        synchronized (this.f6847a) {
            c();
        }
        return 1;
    }

    @Override // androidx.camera.core.p
    public final int getHeight() {
        int i11;
        synchronized (this.f6847a) {
            c();
            i11 = this.f6849c;
        }
        return i11;
    }

    @Override // androidx.camera.core.p
    public final Image getImage() {
        synchronized (this.f6847a) {
            c();
        }
        return null;
    }

    @Override // androidx.camera.core.p
    public final int getWidth() {
        int i11;
        synchronized (this.f6847a) {
            c();
            i11 = this.f6848b;
        }
        return i11;
    }

    @Override // androidx.camera.core.p
    @NonNull
    public final C.L x0() {
        C.L l11;
        synchronized (this.f6847a) {
            c();
            l11 = this.f6851e;
        }
        return l11;
    }
}
