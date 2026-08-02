package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a`\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "", "modifier", "Landroidx/compose/ui/Modifier;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Card-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardKt {
    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m2534CardFjzlyU(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.ui.Modifier.Companion companion = (i2 & 1) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
        androidx.compose.foundation.shape.CornerBasedShape medium = (i2 & 2) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long m2566getSurface0d7_KjU = (i2 & 4) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU() : j;
        long m2580contentColorForek8zF_U = (i2 & 8) != 0 ? androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(m2566getSurface0d7_KjU, composer, (i >> 6) & 14) : j2;
        androidx.compose.foundation.BorderStroke borderStroke2 = (i2 & 16) != 0 ? null : borderStroke;
        float m8601constructorimpl = (i2 & 32) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f) : f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-574573525, i, -1, "androidx.compose.material.Card (Card.kt:63)");
        }
        androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(companion, medium, m2566getSurface0d7_KjU, m2580contentColorForek8zF_U, borderStroke2, m8601constructorimpl, function2, composer, 4194302 & i, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m2535CardLPr_se0(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.foundation.BorderStroke borderStroke, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.ui.Modifier.Companion companion = (i2 & 2) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        androidx.compose.foundation.shape.CornerBasedShape medium = (i2 & 8) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long m2566getSurface0d7_KjU = (i2 & 16) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU() : j;
        long m2580contentColorForek8zF_U = (i2 & 32) != 0 ? androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(m2566getSurface0d7_KjU, composer, (i >> 12) & 14) : j2;
        androidx.compose.foundation.BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        float m8601constructorimpl = (i2 & 128) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f) : f;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (i2 & 256) == 0 ? mutableInteractionSource : null;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-103820906, i, -1, "androidx.compose.material.Card (Card.kt:115)");
        }
        androidx.compose.material.SurfaceKt.m2767SurfaceLPr_se0(function0, companion, z2, medium, m2566getSurface0d7_KjU, m2580contentColorForek8zF_U, borderStroke2, m8601constructorimpl, mutableInteractionSource2, function2, composer, i & 2147483646, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }
}
