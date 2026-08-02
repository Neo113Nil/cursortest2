package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H&¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0015\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "", "Landroid/view/Surface;", "newSurface", "()Landroid/view/Surface;", "", "width", "height", "", "setBufferSize", "(II)V", "release", "()V", "detach", "newParent", "", "reparent", "(Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;)Z", "Companion", "SurfaceControlApi29Impl", "SurfaceControlStub", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat$SurfaceControlApi29Impl;", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat$SurfaceControlStub;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SurfaceControlCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.impl.SurfaceControlCompat.Companion INSTANCE = androidx.camera.viewfinder.core.impl.SurfaceControlCompat.Companion.getHighSpeedVideoSizes;

    void detach();

    android.view.Surface newSurface();

    void release();

    boolean reparent(androidx.camera.viewfinder.core.impl.SurfaceControlCompat newParent);

    void setBufferSize(int width, int height);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat$Companion;", "", "<init>", "()V", "Landroid/view/SurfaceView;", "parent", "", "format", "width", "height", "", "name", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "create", "(Landroid/view/SurfaceView;IIILjava/lang/String;)Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "(Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;IILjava/lang/String;)Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "surfaceView", "wrap", "(Landroid/view/SurfaceView;)Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.viewfinder.core.impl.SurfaceControlCompat.Companion getHighSpeedVideoSizes = new androidx.camera.viewfinder.core.impl.SurfaceControlCompat.Companion();

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.viewfinder.core.impl.SurfaceControlCompat create(android.view.SurfaceView parent, int format, int width, int height, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlApi29Impl(parent, format, width, height, name2);
            }
            return androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlStub.INSTANCE;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.viewfinder.core.impl.SurfaceControlCompat create(androidx.camera.viewfinder.core.impl.SurfaceControlCompat parent, int width, int height, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlApi29Impl(parent, width, height, name2);
            }
            return androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlStub.INSTANCE;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.viewfinder.core.impl.SurfaceControlCompat wrap(android.view.SurfaceView surfaceView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceView, "");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                android.view.SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaceControl, "");
                return new androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlApi29Impl(surfaceControl);
            }
            return androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlStub.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat$SurfaceControlApi29Impl;", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "Landroid/view/SurfaceControl;", "p0", "<init>", "(Landroid/view/SurfaceControl;)V", "Landroid/view/SurfaceView;", "", "p1", "p2", "p3", "", "p4", "(Landroid/view/SurfaceView;IIILjava/lang/String;)V", "(Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;IILjava/lang/String;)V", "", "Camera2StreamConfigurationMap", "()V", "Landroid/view/Surface;", "newSurface", "()Landroid/view/Surface;", "setBufferSize", "(II)V", "release", "detach", "", "reparent", "(Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/SurfaceControl;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class SurfaceControlApi29Impl implements androidx.camera.viewfinder.core.impl.SurfaceControlCompat {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final android.view.SurfaceControl getHighSpeedVideoSizes;

        public SurfaceControlApi29Impl(android.view.SurfaceControl surfaceControl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceControl, "");
            this.getHighSpeedVideoSizes = surfaceControl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SurfaceControlApi29Impl(android.view.SurfaceView surfaceView, int i, int i2, int i3, java.lang.String str) {
            this(r3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            android.view.SurfaceControl build = new android.view.SurfaceControl.Builder().setName(str).setFormat(i).setBufferSize(i2, i3).setParent(surfaceView.getSurfaceControl()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            Camera2StreamConfigurationMap();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SurfaceControlApi29Impl(androidx.camera.viewfinder.core.impl.SurfaceControlCompat surfaceControlCompat, int i, int i2, java.lang.String str) {
            this(r3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceControlCompat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            android.view.SurfaceControl build = new android.view.SurfaceControl.Builder().setName(str).setBufferSize(i, i2).setParent(((androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlApi29Impl) surfaceControlCompat).getHighSpeedVideoSizes).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            Camera2StreamConfigurationMap();
        }

        private final void Camera2StreamConfigurationMap() {
            android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
            try {
                transaction.setVisibility(this.getHighSpeedVideoSizes, true).apply();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(transaction, null);
            } finally {
            }
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final android.view.Surface newSurface() {
            return new android.view.Surface(this.getHighSpeedVideoSizes);
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final void setBufferSize(int p0, int p1) {
            android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
            try {
                transaction.setBufferSize(this.getHighSpeedVideoSizes, p0, p1).apply();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(transaction, null);
            } finally {
            }
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final void release() {
            this.getHighSpeedVideoSizes.release();
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final void detach() {
            android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
            try {
                transaction.reparent(this.getHighSpeedVideoSizes, null).apply();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(transaction, null);
            } finally {
            }
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final boolean reparent(androidx.camera.viewfinder.core.impl.SurfaceControlCompat p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (!this.getHighSpeedVideoSizes.isValid()) {
                return false;
            }
            android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
            try {
                transaction.reparent(this.getHighSpeedVideoSizes, ((androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlApi29Impl) p0).getHighSpeedVideoSizes).apply();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(transaction, null);
                return true;
            } finally {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat$SurfaceControlStub;", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "<init>", "()V", "Landroid/view/Surface;", "newSurface", "()Landroid/view/Surface;", "", "p0", "p1", "", "setBufferSize", "(II)V", "release", "detach", "", "reparent", "(Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class SurfaceControlStub implements androidx.camera.viewfinder.core.impl.SurfaceControlCompat {
        public static final androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlStub INSTANCE = new androidx.camera.viewfinder.core.impl.SurfaceControlCompat.SurfaceControlStub();

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final void detach() {
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final android.view.Surface newSurface() {
            return null;
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final void release() {
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final void setBufferSize(int p0, int p1) {
        }

        private SurfaceControlStub() {
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public final boolean reparent(androidx.camera.viewfinder.core.impl.SurfaceControlCompat p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    static androidx.camera.viewfinder.core.impl.SurfaceControlCompat wrap(android.view.SurfaceView surfaceView) {
        return INSTANCE.wrap(surfaceView);
    }

    @kotlin.jvm.JvmStatic
    static androidx.camera.viewfinder.core.impl.SurfaceControlCompat create(androidx.camera.viewfinder.core.impl.SurfaceControlCompat surfaceControlCompat, int i, int i2, java.lang.String str) {
        return INSTANCE.create(surfaceControlCompat, i, i2, str);
    }

    @kotlin.jvm.JvmStatic
    static androidx.camera.viewfinder.core.impl.SurfaceControlCompat create(android.view.SurfaceView surfaceView, int i, int i2, int i3, java.lang.String str) {
        return INSTANCE.create(surfaceView, i, i2, i3, str);
    }
}
