package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class CloseGuardHelper {
    private final androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl Camera2StreamConfigurationMap;

    interface CloseGuardImpl {
        void Camera2StreamConfigurationMap();

        void getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRangesFor(java.lang.String str);
    }

    private CloseGuardHelper(androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl closeGuardImpl) {
        this.Camera2StreamConfigurationMap = closeGuardImpl;
    }

    public static androidx.camera.core.impl.utils.CloseGuardHelper create() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return new androidx.camera.core.impl.utils.CloseGuardHelper(new androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardApi30Impl());
        }
        return new androidx.camera.core.impl.utils.CloseGuardHelper(new androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardNoOpImpl());
    }

    public final void open(java.lang.String str) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(str);
    }

    public final void close() {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    public final void warnIfOpen() {
        this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap();
    }

    static final class CloseGuardApi30Impl implements androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl {
        private final android.util.CloseGuard getHighSpeedVideoFpsRangesFor = new android.util.CloseGuard();

        CloseGuardApi30Impl() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.open(str);
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public final void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoFpsRangesFor.close();
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public final void Camera2StreamConfigurationMap() {
            this.getHighSpeedVideoFpsRangesFor.warnIfOpen();
        }
    }

    static final class CloseGuardNoOpImpl implements androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl {
        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public final void Camera2StreamConfigurationMap() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public final void getHighSpeedVideoFpsRanges() {
        }

        CloseGuardNoOpImpl() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str, "CloseMethodName must not be null.");
        }
    }
}
