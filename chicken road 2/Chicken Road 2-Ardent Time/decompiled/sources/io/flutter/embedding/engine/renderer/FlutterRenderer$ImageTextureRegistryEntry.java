package io.flutter.embedding.engine.renderer;

@androidx.annotation.Keep
/* loaded from: classes.dex */
final class FlutterRenderer$ImageTextureRegistryEntry implements io.flutter.view.TextureRegistry$ImageTextureEntry, io.flutter.view.TextureRegistry$ImageConsumer {
    private static final java.lang.String TAG = "ImageTextureRegistryEntry";
    private final long id;
    private boolean ignoringFence = false;
    private android.media.Image image;
    private boolean released;
    final /* synthetic */ io.flutter.embedding.engine.renderer.h this$0;

    public FlutterRenderer$ImageTextureRegistryEntry(io.flutter.embedding.engine.renderer.h hVar, long j2) {
        this.this$0 = hVar;
        this.id = j2;
    }

    private void maybeWaitOnFence(android.media.Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void waitOnFence(android.media.Image image) {
        android.hardware.SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public android.media.Image acquireLatestImage() {
        android.media.Image image;
        synchronized (this) {
            image = this.image;
            this.image = null;
        }
        maybeWaitOnFence(image);
        return image;
    }

    public void finalize() {
        try {
            if (this.released) {
                super.finalize();
                return;
            }
            android.media.Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            this.released = true;
            io.flutter.embedding.engine.renderer.h hVar = this.this$0;
            hVar.f7679d.post(new io.flutter.embedding.engine.renderer.f(this.id, hVar.f7676a));
            super.finalize();
        } catch (java.lang.Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public long id() {
        return this.id;
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public void pushImage(android.media.Image image) {
        android.media.Image image2;
        if (this.released) {
            return;
        }
        synchronized (this) {
            image2 = this.image;
            this.image = image;
        }
        if (image2 != null) {
            android.util.Log.e(TAG, "Dropping PlatformView Frame");
            image2.close();
        }
        if (image != null) {
            this.this$0.f7676a.scheduleFrame();
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        android.media.Image image = this.image;
        if (image != null) {
            image.close();
            this.image = null;
        }
        io.flutter.embedding.engine.renderer.h hVar = this.this$0;
        hVar.f7676a.unregisterTexture(this.id);
    }
}
