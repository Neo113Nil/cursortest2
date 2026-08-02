package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5104l0;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class d implements InterfaceC5104l0 {

    /* renamed from: a, reason: collision with root package name */
    private final ImageReader f38075a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38076b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f38077c = true;

    d(ImageReader imageReader) {
        this.f38075a = imageReader;
    }

    public static /* synthetic */ void h(final d dVar, Executor executor, final InterfaceC5104l0.a aVar) {
        synchronized (dVar.f38076b) {
            try {
                if (!dVar.f38077c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d dVar2 = d.this;
                            dVar2.getClass();
                            aVar.a(dVar2);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final Surface a() {
        Surface surface;
        synchronized (this.f38076b) {
            surface = this.f38075a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int b() {
        int imageFormat;
        synchronized (this.f38076b) {
            imageFormat = this.f38075a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int c() {
        int maxImages;
        synchronized (this.f38076b) {
            maxImages = this.f38075a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void close() {
        synchronized (this.f38076b) {
            this.f38075a.close();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final p d() {
        Image image;
        synchronized (this.f38076b) {
            try {
                image = this.f38075a.acquireNextImage();
            } catch (RuntimeException e11) {
                if (!"ImageReaderContext is not initialized".equals(e11.getMessage())) {
                    throw e11;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final p e() {
        Image image;
        synchronized (this.f38076b) {
            try {
                image = this.f38075a.acquireLatestImage();
            } catch (RuntimeException e11) {
                if (!"ImageReaderContext is not initialized".equals(e11.getMessage())) {
                    throw e11;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void f() {
        synchronized (this.f38076b) {
            this.f38077c = true;
            this.f38075a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void g(@NonNull final InterfaceC5104l0.a aVar, @NonNull final Executor executor) {
        synchronized (this.f38076b) {
            this.f38077c = false;
            this.f38075a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.h(d.this, executor, aVar);
                }
            }, G.n.a());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getHeight() {
        int height;
        synchronized (this.f38076b) {
            height = this.f38075a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getWidth() {
        int width;
        synchronized (this.f38076b) {
            width = this.f38075a.getWidth();
        }
        return width;
    }
}
