package androidx.camera.core;

/* loaded from: classes6.dex */
public final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    public static androidx.camera.core.impl.ImageReaderProxy createIsolatedReader(int i, int i2, int i3, int i4) {
        return new androidx.camera.core.AndroidImageReaderProxy(android.media.ImageReader.newInstance(i, i2, i3, i4));
    }
}
