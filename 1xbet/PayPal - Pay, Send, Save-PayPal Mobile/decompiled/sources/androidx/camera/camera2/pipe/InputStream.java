package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/InputStream;", "", "Landroidx/camera/camera2/pipe/InputStreamId;", "getId-m1bwn9M", "()I", "id", "", "getMaxImages", "maxImages", "Landroidx/camera/camera2/pipe/StreamFormat;", "getFormat-8FPWQzE", "format", "Config"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InputStream {
    /* renamed from: getFormat-8FPWQzE, reason: not valid java name */
    int mo513getFormat8FPWQzE();

    /* renamed from: getId-m1bwn9M, reason: not valid java name */
    int mo514getIdm1bwn9M();

    int getMaxImages();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/InputStream$Config;", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "stream", "", "maxImages", "Landroidx/camera/camera2/pipe/StreamFormat;", "streamFormat", "<init>", "(Landroidx/camera/camera2/pipe/CameraStream$Config;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "getStream", "()Landroidx/camera/camera2/pipe/CameraStream$Config;", com.visa.cbp.getEncExpo.warmup, "getMaxImages", "()I", "getStreamFormat-8FPWQzE", "setStreamFormat-hNQ4ISI", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private final int maxImages;
        private final androidx.camera.camera2.pipe.CameraStream.Config stream;
        private int streamFormat;

        private Config(androidx.camera.camera2.pipe.CameraStream.Config config, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.stream = config;
            this.maxImages = i;
            this.streamFormat = i2;
        }

        public final androidx.camera.camera2.pipe.CameraStream.Config getStream() {
            return this.stream;
        }

        public final int getMaxImages() {
            return this.maxImages;
        }

        /* renamed from: getStreamFormat-8FPWQzE, reason: not valid java name and from getter */
        public final int getStreamFormat() {
            return this.streamFormat;
        }

        /* renamed from: setStreamFormat-hNQ4ISI, reason: not valid java name */
        public final void m516setStreamFormathNQ4ISI(int i) {
            this.streamFormat = i;
        }

        public /* synthetic */ Config(androidx.camera.camera2.pipe.CameraStream.Config config, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(config, i, i2);
        }
    }
}
