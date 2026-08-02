package androidx.camera.video.internal.compat;

/* loaded from: classes6.dex */
public final class Api26Impl {
    private Api26Impl() {
    }

    public static android.media.MediaMuxer createMediaMuxer(java.io.FileDescriptor fileDescriptor, int i) throws java.io.IOException {
        return new android.media.MediaMuxer(fileDescriptor, i);
    }
}
