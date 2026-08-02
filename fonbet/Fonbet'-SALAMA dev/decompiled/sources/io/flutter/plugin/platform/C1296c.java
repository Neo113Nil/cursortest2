package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1296c implements i {

    /* renamed from: a, reason: collision with root package name */
    public TextureRegistry$ImageTextureEntry f14139a;

    /* renamed from: b, reason: collision with root package name */
    public ImageReader f14140b;

    /* renamed from: c, reason: collision with root package name */
    public int f14141c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f14142d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14143e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final C1295b f14144f = new C1295b(this);

    public C1296c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f14139a = textureRegistry$ImageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.i
    public final long a() {
        return this.f14139a.id();
    }

    @Override // io.flutter.plugin.platform.i
    public final void b(int i7, int i8) {
        ImageReader newInstance;
        ImageReader imageReader = this.f14140b;
        if (imageReader != null && this.f14141c == i7 && this.f14142d == i8) {
            return;
        }
        if (imageReader != null) {
            this.f14139a.pushImage(null);
            this.f14140b.close();
            this.f14140b = null;
        }
        this.f14141c = i7;
        this.f14142d = i8;
        int i9 = Build.VERSION.SDK_INT;
        Handler handler = this.f14143e;
        C1295b c1295b = this.f14144f;
        if (i9 >= 33) {
            Q.b.q();
            ImageReader.Builder g3 = Q.b.g(this.f14141c, this.f14142d);
            g3.setMaxImages(4);
            g3.setImageFormat(34);
            g3.setUsage(256L);
            newInstance = g3.build();
            newInstance.setOnImageAvailableListener(c1295b, handler);
        } else {
            if (i9 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i7, i8, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c1295b, handler);
        }
        this.f14140b = newInstance;
    }

    @Override // io.flutter.plugin.platform.i
    public final int getHeight() {
        return this.f14142d;
    }

    @Override // io.flutter.plugin.platform.i
    public final Surface getSurface() {
        return this.f14140b.getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public final int getWidth() {
        return this.f14141c;
    }

    @Override // io.flutter.plugin.platform.i
    public final void release() {
        if (this.f14140b != null) {
            this.f14139a.pushImage(null);
            this.f14140b.close();
            this.f14140b = null;
        }
        this.f14139a = null;
    }
}
