package org.betup.ui.fragment.wheeloffortune.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.explorestack.protobuf.openrtb.LossReason;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: WheelBorders.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0019\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\u0005\u001a\u0019\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0019\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"CenterCircleBorder", "", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/unit/Dp;", "CenterCircleBorder-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)V", "OuterCircleBorder", "OuterCircleBorder-kHDZbjc", "OuterCircleBorder2", "OuterCircleBorder2-kHDZbjc", "OuterCircleBorderGold", "OuterCircleBorderGold-kHDZbjc", "WheelFramePNG", "WheelFramePNG-kHDZbjc", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WheelBordersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenterCircleBorder_kHDZbjc$lambda$0(float f, int i, int i2, Composer composer, int i3) {
        m14313CenterCircleBorderkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OuterCircleBorder2_kHDZbjc$lambda$2(float f, int i, int i2, Composer composer, int i3) {
        m14315OuterCircleBorder2kHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OuterCircleBorderGold_kHDZbjc$lambda$3(float f, int i, int i2, Composer composer, int i3) {
        m14316OuterCircleBorderGoldkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OuterCircleBorder_kHDZbjc$lambda$1(float f, int i, int i2, Composer composer, int i3) {
        m14314OuterCircleBorderkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelFramePNG_kHDZbjc$lambda$4(float f, int i, int i2, Composer composer, int i3) {
        m14317WheelFramePNGkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: CenterCircleBorder-kHDZbjc, reason: not valid java name */
    public static final void m14313CenterCircleBorderkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1799424722);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m7774constructorimpl(60);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1799424722, i3, -1, "org.betup.ui.fragment.wheeloffortune.compose.CenterCircleBorder (WheelBorders.kt:16)");
            }
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1038borderziNgDLE(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), Dp.m7774constructorimpl(6), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayMatchFilter.INSTANCE.getBrush(), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelBordersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CenterCircleBorder_kHDZbjc$lambda$0;
                    CenterCircleBorder_kHDZbjc$lambda$0 = WheelBordersKt.CenterCircleBorder_kHDZbjc$lambda$0(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CenterCircleBorder_kHDZbjc$lambda$0;
                }
            });
        }
    }

    /* renamed from: OuterCircleBorder-kHDZbjc, reason: not valid java name */
    public static final void m14314OuterCircleBorderkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1130296648);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m7774constructorimpl(LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1130296648, i3, -1, "org.betup.ui.fragment.wheeloffortune.compose.OuterCircleBorder (WheelBorders.kt:30)");
            }
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1038borderziNgDLE(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), Dp.m7774constructorimpl(10), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayMatchFilter.INSTANCE.getBrush(), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelBordersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OuterCircleBorder_kHDZbjc$lambda$1;
                    OuterCircleBorder_kHDZbjc$lambda$1 = WheelBordersKt.OuterCircleBorder_kHDZbjc$lambda$1(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OuterCircleBorder_kHDZbjc$lambda$1;
                }
            });
        }
    }

    /* renamed from: OuterCircleBorder2-kHDZbjc, reason: not valid java name */
    public static final void m14315OuterCircleBorder2kHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1714846856);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m7774constructorimpl(LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1714846856, i3, -1, "org.betup.ui.fragment.wheeloffortune.compose.OuterCircleBorder2 (WheelBorders.kt:44)");
            }
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1036borderxT4_qwU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), Dp.m7774constructorimpl(9), ColorKt.Color(4280295977L), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1036borderxT4_qwU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), Dp.m7774constructorimpl(2), ColorKt.Color(4282400073L), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelBordersKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OuterCircleBorder2_kHDZbjc$lambda$2;
                    OuterCircleBorder2_kHDZbjc$lambda$2 = WheelBordersKt.OuterCircleBorder2_kHDZbjc$lambda$2(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OuterCircleBorder2_kHDZbjc$lambda$2;
                }
            });
        }
    }

    /* renamed from: OuterCircleBorderGold-kHDZbjc, reason: not valid java name */
    public static final void m14316OuterCircleBorderGoldkHDZbjc(float f, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        final float m7774constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(-937288);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        if ((i3 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            m7774constructorimpl = f2;
        } else {
            m7774constructorimpl = i4 != 0 ? Dp.m7774constructorimpl(280) : f2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937288, i3, -1, "org.betup.ui.fragment.wheeloffortune.compose.OuterCircleBorderGold (WheelBorders.kt:68)");
            }
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1038borderziNgDLE(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), Dp.m7774constructorimpl(30), Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 60.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelBordersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OuterCircleBorderGold_kHDZbjc$lambda$3;
                    OuterCircleBorderGold_kHDZbjc$lambda$3 = WheelBordersKt.OuterCircleBorderGold_kHDZbjc$lambda$3(m7774constructorimpl, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OuterCircleBorderGold_kHDZbjc$lambda$3;
                }
            });
        }
    }

    /* renamed from: WheelFramePNG-kHDZbjc, reason: not valid java name */
    public static final void m14317WheelFramePNGkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1236956040);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m7774constructorimpl(300);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1236956040, i3, -1, "org.betup.ui.fragment.wheeloffortune.compose.WheelFramePNG (WheelBorders.kt:88)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.whell_1, startRestartGroup, 6), "Wheel Frame", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelBordersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WheelFramePNG_kHDZbjc$lambda$4;
                    WheelFramePNG_kHDZbjc$lambda$4 = WheelBordersKt.WheelFramePNG_kHDZbjc$lambda$4(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return WheelFramePNG_kHDZbjc$lambda$4;
                }
            });
        }
    }
}
