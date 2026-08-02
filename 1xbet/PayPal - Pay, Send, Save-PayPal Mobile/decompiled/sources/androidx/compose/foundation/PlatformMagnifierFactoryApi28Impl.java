package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "create", "canUpdateZoom", "Z", "getCanUpdateZoom", "()Z", "PlatformMagnifierImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformMagnifierFactoryApi28Impl implements androidx.compose.foundation.PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl INSTANCE = new androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl();
    private static final boolean canUpdateZoom = false;

    private PlatformMagnifierFactoryApi28Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public final androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl mo1363createnHHXs2Y(android.view.View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, androidx.compose.ui.unit.Density density, float initialZoom) {
        return new androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl(new android.widget.Magnifier(view));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifier;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "", "updateContent", "()V", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "update-Wko1d7g", "(JJF)V", "update", "dismiss", "Landroid/widget/Magnifier;", "getMagnifier", "()Landroid/widget/Magnifier;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class PlatformMagnifierImpl implements androidx.compose.foundation.PlatformMagnifier {
        public static final int $stable = 8;
        private final android.widget.Magnifier magnifier;

        public PlatformMagnifierImpl(android.widget.Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        public final android.widget.Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: getSize-YbymL2g */
        public long mo1361getSizeYbymL2g() {
            return androidx.compose.ui.unit.IntSize.m8767constructorimpl((this.magnifier.getHeight() & 4294967295L) | (this.magnifier.getWidth() << 32));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.magnifier.update();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo1362updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(java.lang.Float.intBitsToFloat((int) (sourceCenter >> 32)), java.lang.Float.intBitsToFloat((int) (sourceCenter & 4294967295L)));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.magnifier.dismiss();
        }
    }
}
