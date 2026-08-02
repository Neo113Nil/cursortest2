package androidx.camera.core;

import C.L;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.X0;
import androidx.camera.core.p;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final Image f38066a;

    /* renamed from: b, reason: collision with root package name */
    private final C0717a[] f38067b;

    /* renamed from: c, reason: collision with root package name */
    private final L f38068c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0717a implements p.a {

        /* renamed from: a, reason: collision with root package name */
        private final Image.Plane f38069a;

        C0717a(Image.Plane plane) {
            this.f38069a = plane;
        }

        @Override // androidx.camera.core.p.a
        @NonNull
        public final ByteBuffer f() {
            return this.f38069a.getBuffer();
        }

        @Override // androidx.camera.core.p.a
        public final int g() {
            return this.f38069a.getRowStride();
        }

        @Override // androidx.camera.core.p.a
        public final int h() {
            return this.f38069a.getPixelStride();
        }
    }

    a(@NonNull Image image) {
        this.f38066a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f38067b = new C0717a[planes.length];
            for (int i11 = 0; i11 < planes.length; i11++) {
                this.f38067b[i11] = new C0717a(planes[i11]);
            }
        } else {
            this.f38067b = new C0717a[0];
        }
        this.f38068c = new e(X0.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.p
    @NonNull
    public final p.a[] c0() {
        return this.f38067b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f38066a.close();
    }

    @Override // androidx.camera.core.p
    public final int g() {
        return this.f38066a.getFormat();
    }

    @Override // androidx.camera.core.p
    public final int getHeight() {
        return this.f38066a.getHeight();
    }

    @Override // androidx.camera.core.p
    public final Image getImage() {
        return this.f38066a;
    }

    @Override // androidx.camera.core.p
    public final int getWidth() {
        return this.f38066a.getWidth();
    }

    @Override // androidx.camera.core.p
    @NonNull
    public final L x0() {
        return this.f38068c;
    }
}
