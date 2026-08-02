package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper;", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "p0", "<init>", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "", "expirationTimeMillis", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "screenFlashListener", "", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(JLandroidx/camera/core/ImageCapture$ScreenFlashListener;)V", "clear", "()V", "getBaseScreenFlash", "()Landroidx/camera/core/ImageCapture$ScreenFlash;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "completePendingTasks", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "", "Z", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenFlashWrapper implements androidx.camera.core.ImageCapture.ScreenFlash {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.internal.ScreenFlashWrapper.Companion INSTANCE = new androidx.camera.core.internal.ScreenFlashWrapper.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.core.ImageCapture.ScreenFlash getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.camera.core.ImageCapture.ScreenFlashListener getHighSpeedVideoFpsRanges;

    private ScreenFlashWrapper(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.getHighResolutionOutputSizeshNQ4ISI = screenFlash;
        this.getHighSpeedVideoSizes = new java.lang.Object();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper$Companion;", "", "<init>", "()V", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "screenFlash", "Landroidx/camera/core/internal/ScreenFlashWrapper;", "from", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)Landroidx/camera/core/internal/ScreenFlashWrapper;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.internal.ScreenFlashWrapper from(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
            return new androidx.camera.core.internal.ScreenFlashWrapper(screenFlash, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void apply(long expirationTimeMillis, androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenFlashListener, "");
        synchronized (this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges = screenFlashListener;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.camera.core.ImageCapture.ScreenFlash screenFlash = this.getHighResolutionOutputSizeshNQ4ISI;
        if (screenFlash != null) {
            screenFlash.apply(expirationTimeMillis, new androidx.camera.core.ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.ScreenFlashWrapper$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    androidx.camera.core.internal.ScreenFlashWrapper.m1014$r8$lambda$3O4w5sgEqhZqXYjdagTyWXM7Vw(androidx.camera.core.internal.ScreenFlashWrapper.this);
                }
            });
        } else {
            androidx.camera.core.Logger.e("ScreenFlashWrapper", "apply: screenFlash is null!");
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void clear() {
        getHighSpeedVideoFpsRanges();
    }

    /* renamed from: getBaseScreenFlash, reason: from getter */
    public final androidx.camera.core.ImageCapture.ScreenFlash getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.getHighSpeedVideoSizes) {
            androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener = this.getHighSpeedVideoFpsRanges;
            if (screenFlashListener != null) {
                screenFlashListener.onCompleted();
            }
            this.getHighSpeedVideoFpsRanges = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.Camera2StreamConfigurationMap) {
                androidx.camera.core.ImageCapture.ScreenFlash screenFlash = this.getHighResolutionOutputSizeshNQ4ISI;
                if (screenFlash != null) {
                    screenFlash.clear();
                } else {
                    androidx.camera.core.internal.ScreenFlashWrapper screenFlashWrapper = this;
                    androidx.camera.core.Logger.e("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                androidx.camera.core.Logger.w("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            this.Camera2StreamConfigurationMap = false;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void completePendingTasks() {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges();
    }

    /* renamed from: $r8$lambda$3O4w5sgEqhZqXYjda-gTyWXM7Vw, reason: not valid java name */
    public static /* synthetic */ void m1014$r8$lambda$3O4w5sgEqhZqXYjdagTyWXM7Vw(androidx.camera.core.internal.ScreenFlashWrapper screenFlashWrapper) {
        synchronized (screenFlashWrapper.getHighSpeedVideoSizes) {
            if (screenFlashWrapper.getHighSpeedVideoFpsRanges == null) {
                androidx.camera.core.Logger.w("ScreenFlashWrapper", "apply: pendingListener is null!");
            }
            screenFlashWrapper.getHighResolutionOutputSizeshNQ4ISI();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.internal.ScreenFlashWrapper from(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        return INSTANCE.from(screenFlash);
    }

    public /* synthetic */ ScreenFlashWrapper(androidx.camera.core.ImageCapture.ScreenFlash screenFlash, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(screenFlash);
    }
}
