package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017JO\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory;", "", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifier;", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifier;", "create", "getCanUpdateZoom", "()Z", "canUpdateZoom", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlatformMagnifierFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.PlatformMagnifierFactory.Companion INSTANCE = androidx.compose.foundation.PlatformMagnifierFactory.Companion.getHighSpeedVideoFpsRangesFor;

    /* renamed from: create-nHHXs2Y, reason: not valid java name */
    androidx.compose.foundation.PlatformMagnifier mo1363createnHHXs2Y(android.view.View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, androidx.compose.ui.unit.Density density, float initialZoom);

    boolean getCanUpdateZoom();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "getForCurrentPlatform", "()Landroidx/compose/foundation/PlatformMagnifierFactory;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.PlatformMagnifierFactory.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.PlatformMagnifierFactory.Companion();

        private Companion() {
        }

        public final androidx.compose.foundation.PlatformMagnifierFactory getForCurrentPlatform() {
            if (androidx.compose.foundation.Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                return android.os.Build.VERSION.SDK_INT == 28 ? androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.INSTANCE : androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            throw new java.lang.UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
