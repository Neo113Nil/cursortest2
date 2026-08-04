package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* JADX INFO: renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0915c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextureRegistry$ImageTextureEntry f14145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageReader f14146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14147c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14148d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f14149e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0914b f14150f = new C0914b(this);

    public C0915c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f14145a = textureRegistry$ImageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.i
    public final long a() {
        return this.f14145a.id();
    }

    @Override // io.flutter.plugin.platform.i
    public final void b(int i7, int i8) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = this.f14146b;
        if (imageReader != null && this.f14147c == i7 && this.f14148d == i8) {
            return;
        }
        if (imageReader != null) {
            this.f14145a.pushImage(null);
            this.f14146b.close();
            this.f14146b = null;
        }
        this.f14147c = i7;
        this.f14148d = i8;
        int i9 = Build.VERSION.SDK_INT;
        Handler handler = this.f14149e;
        C0914b c0914b = this.f14150f;
        if (i9 >= 33) {
            Q.b.q();
            ImageReader.Builder builderG = Q.b.g(this.f14147c, this.f14148d);
            builderG.setMaxImages(4);
            builderG.setImageFormat(34);
            builderG.setUsage(256L);
            imageReaderNewInstance = builderG.build();
            imageReaderNewInstance.setOnImageAvailableListener(c0914b, handler);
        } else {
            if (i9 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i7, i8, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(c0914b, handler);
        }
        this.f14146b = imageReaderNewInstance;
    }

    @Override // io.flutter.plugin.platform.i
    public final int getHeight() {
        return this.f14148d;
    }

    @Override // io.flutter.plugin.platform.i
    public final Surface getSurface() {
        return this.f14146b.getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public final int getWidth() {
        return this.f14147c;
    }

    @Override // io.flutter.plugin.platform.i
    public final void release() {
        if (this.f14146b != null) {
            this.f14145a.pushImage(null);
            this.f14146b.close();
            this.f14146b = null;
        }
        this.f14145a = null;
    }
}
