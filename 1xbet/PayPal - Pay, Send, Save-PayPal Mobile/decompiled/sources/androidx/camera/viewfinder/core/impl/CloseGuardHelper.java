package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/viewfinder/core/impl/CloseGuardHelper;", "", "Landroidx/camera/viewfinder/core/impl/CloseGuardImpl;", "p0", "<init>", "(Landroidx/camera/viewfinder/core/impl/CloseGuardImpl;)V", "", "closeMethodName", "", "open", "(Ljava/lang/String;)V", "close", "()V", "warnIfOpen", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/viewfinder/core/impl/CloseGuardImpl;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseGuardHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.impl.CloseGuardHelper.Companion INSTANCE = new androidx.camera.viewfinder.core.impl.CloseGuardHelper.Companion(null);
    private final androidx.camera.viewfinder.core.impl.CloseGuardImpl getHighResolutionOutputSizeshNQ4ISI;

    private CloseGuardHelper(androidx.camera.viewfinder.core.impl.CloseGuardImpl closeGuardImpl) {
        this.getHighResolutionOutputSizeshNQ4ISI = closeGuardImpl;
    }

    public final void open(java.lang.String closeMethodName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeMethodName, "");
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(closeMethodName);
    }

    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
    }

    public final void warnIfOpen() {
        this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/viewfinder/core/impl/CloseGuardHelper$Companion;", "", "<init>", "()V", "Landroidx/camera/viewfinder/core/impl/CloseGuardHelper;", "create", "()Landroidx/camera/viewfinder/core/impl/CloseGuardHelper;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.viewfinder.core.impl.CloseGuardHelper create() {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return new androidx.camera.viewfinder.core.impl.CloseGuardHelper(new androidx.camera.viewfinder.core.impl.CloseGuardApi30Impl(), defaultConstructorMarker);
            }
            return new androidx.camera.viewfinder.core.impl.CloseGuardHelper(new androidx.camera.viewfinder.core.impl.CloseGuardNoOpImpl(), defaultConstructorMarker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CloseGuardHelper(androidx.camera.viewfinder.core.impl.CloseGuardImpl closeGuardImpl, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(closeGuardImpl);
    }
}
