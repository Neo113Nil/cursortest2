package androidx.compose.ui.graphics.shadow;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroid/graphics/BlurMaskFilter;", "Landroidx/compose/ui/graphics/shadow/Camera2StreamConfigurationMap;", "blurFilter", "Landroidx/compose/ui/graphics/PaintingStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "configureShadow-FoewPVk", "(Landroidx/compose/ui/graphics/Paint;JILandroid/graphics/BlurMaskFilter;I)Landroidx/compose/ui/graphics/Paint;", "configureShadow"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlurKt {
    /* renamed from: configureShadow-FoewPVk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.graphics.Paint m6661configureShadowFoewPVk$default(androidx.compose.ui.graphics.Paint paint, long j, int i, android.graphics.BlurMaskFilter blurMaskFilter, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        android.graphics.BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i3 & 8) != 0) {
            i2 = androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6259getFillTiuSbCo();
        }
        return m6660configureShadowFoewPVk(paint, j2, i4, blurMaskFilter2, i2);
    }

    /* renamed from: configureShadow-FoewPVk, reason: not valid java name */
    public static final androidx.compose.ui.graphics.Paint m6660configureShadowFoewPVk(androidx.compose.ui.graphics.Paint paint, long j, int i, android.graphics.BlurMaskFilter blurMaskFilter, int i2) {
        paint.mo5873setColor8_81llA(j);
        paint.mo5872setBlendModes9anfk8(i);
        paint.mo5877setStylek9PVt8s(i2);
        androidx.compose.ui.graphics.shadow.Blur_androidKt.setBlurFilter(paint, blurMaskFilter);
        return paint;
    }
}
