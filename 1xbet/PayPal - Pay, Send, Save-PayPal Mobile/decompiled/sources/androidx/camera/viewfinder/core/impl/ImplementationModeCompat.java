package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/viewfinder/core/impl/ImplementationModeCompat;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImplementationModeCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.impl.ImplementationModeCompat.Companion INSTANCE = new androidx.camera.viewfinder.core.impl.ImplementationModeCompat.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/viewfinder/core/impl/ImplementationModeCompat$Companion;", "", "<init>", "()V", "Landroidx/camera/viewfinder/core/ImplementationMode;", "chooseCompatibleMode", "()Landroidx/camera/viewfinder/core/ImplementationMode;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.viewfinder.core.ImplementationMode chooseCompatibleMode() {
            androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks deviceQuirks = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.INSTANCE;
            java.util.List list = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((androidx.camera.viewfinder.core.impl.quirk.Quirk) it.next()) instanceof androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk) {
                        break;
                    }
                }
            }
            androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks deviceQuirks2 = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.INSTANCE;
            java.util.List list2 = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((androidx.camera.viewfinder.core.impl.quirk.Quirk) it2.next()) instanceof androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk) {
                        return androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED;
                    }
                }
            }
            return androidx.camera.viewfinder.core.ImplementationMode.EXTERNAL;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.ImplementationMode chooseCompatibleMode() {
        return INSTANCE.chooseCompatibleMode();
    }
}
