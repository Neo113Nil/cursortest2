package androidx.camera.core;

/* loaded from: classes6.dex */
final class ImageProxyDownsampler {

    enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    private ImageProxyDownsampler() {
    }

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.camera.core.ImageProxy.PlaneProxy {
        final java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public java.nio.ByteBuffer getBuffer() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    static final class ForwardingImageProxyImpl extends androidx.camera.core.ForwardingImageProxy {
        private final int Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRangesFor;
        private final androidx.camera.core.ImageProxy.PlaneProxy[] getHighSpeedVideoSizes;

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getWidth() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getHeight() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
