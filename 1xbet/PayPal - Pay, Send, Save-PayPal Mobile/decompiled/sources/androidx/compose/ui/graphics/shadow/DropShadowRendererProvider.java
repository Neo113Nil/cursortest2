package androidx.compose.ui.graphics.shadow;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J7\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/shadow/Shadow;", "shadow", "Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "obtainDropShadowRenderer-eZhPAX0", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "obtainDropShadowRenderer", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DropShadowRendererProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.shadow.DropShadowRendererProvider.Companion INSTANCE = androidx.compose.ui.graphics.shadow.DropShadowRendererProvider.Companion.getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: obtainDropShadowRenderer-eZhPAX0 */
    androidx.compose.ui.graphics.shadow.DropShadowRenderer mo6653obtainDropShadowRenderereZhPAX0(androidx.compose.ui.graphics.Shape shape, long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.graphics.shadow.Shadow shadow);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "Default", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "getDefault", "()Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.shadow.DropShadowRendererProvider.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.graphics.shadow.DropShadowRendererProvider.Companion();
        private static final androidx.compose.ui.graphics.shadow.DropShadowRendererProvider Default = new androidx.compose.ui.graphics.shadow.DropShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.DropShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
            /* renamed from: obtainDropShadowRenderer-eZhPAX0 */
            public final androidx.compose.ui.graphics.shadow.DropShadowRenderer mo6653obtainDropShadowRenderereZhPAX0(androidx.compose.ui.graphics.Shape shape, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.graphics.shadow.Shadow shadow) {
                return new androidx.compose.ui.graphics.shadow.DropShadowRenderer(shadow, shape.mo1334createOutlinePq9zytI(j, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final androidx.compose.ui.graphics.shadow.DropShadowRendererProvider getDefault() {
            return Default;
        }
    }
}
