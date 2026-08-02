package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "SheetElevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSheetElevation-D9Ej5fM", "()F", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "Landroidx/compose/animation/core/AnimationSpec;", "", "AnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldDefaults {
    public static final androidx.compose.material.BottomSheetScaffoldDefaults INSTANCE = new androidx.compose.material.BottomSheetScaffoldDefaults();
    private static final float SheetElevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
    private static final float SheetPeekHeight = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> AnimationSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private BottomSheetScaffoldDefaults() {
    }

    /* renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m2513getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m2514getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }
}
