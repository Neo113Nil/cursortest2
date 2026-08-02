package org.betup.ui.fragment.home.compose.sections;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.AutoResizeSiblingsTextKt;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.common.video.VideoOfferMotion;
import org.betup.ui.common.video.VideoOfferMotionKt;
import org.betup.ui.fragment.home.compose.HomeActiveOfferUiState;
import org.betup.ui.fragment.home.compose.HomeCountdownFormat;
import org.betup.ui.fragment.home.compose.HomeCountdownTextKt;
import org.betup.ui.fragment.home.compose.HomePromoUiState;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.fragment.home.controller.HomeVideoBonusUiState;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomePromoSection.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\r\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001aM\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00042&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001af\u0010 \u001a\u00020\u0013*\u00020!2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\"\u001a\u00020#2;\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130$¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0002\u0010%\u001aU\u0010&\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b\u001d¢\u0006\u0002\b+H\u0003¢\u0006\u0004\b,\u0010-\u001a¡\u0001\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130<2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010<2\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00192\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00192\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\u0010B\u001aI\u0010C\u001a\u00020\u00132\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010D\u001a\u0002082\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00130<2\b\b\u0002\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\u0010F\u001aQ\u0010G\u001a\u00020\u00132\u0006\u00109\u001a\u00020:2\u0006\u0010D\u001a\u0002082\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00130<2\u0010\b\u0002\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010<2\b\b\u0002\u0010I\u001a\u0002042\b\b\u0002\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\u0010J\u001a#\u0010K\u001a\u00020\u0013*\u00020!2\u0006\u0010L\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010M\u001a#\u0010N\u001a\u00020\u0013*\u00020!2\u0006\u0010O\u001a\u0002082\b\b\u0002\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010P\u001aA\u0010Q\u001a\u00020\u0013*\u00020!2\b\b\u0001\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\b\b\u0002\u0010V\u001a\u00020W2\b\b\u0002\u0010X\u001a\u00020WH\u0003¢\u0006\u0004\bY\u0010Z\u001a\f\u0010]\u001a\u00020#*\u00020#H\u0002\u001a\r\u0010^\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010_\u001a\r\u0010`\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010_\u001a\r\u0010a\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010_\u001a\r\u0010b\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010_\u001a\r\u0010c\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010_\u001a \u0010d\u001a\u00020\u00132\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00130<¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0002\u0010e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r\"\u0010\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r\"\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010[\u001a\u00020\\X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006f"}, d2 = {"promoCardShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "promoBadgeShape", "promoBadgePeekOffset", "Landroidx/compose/ui/unit/Dp;", "F", "promoTimerBadgeOffsetY", "promoTimerBadgeChipHorizontalPadding", "promoTimerBadgeChipVerticalPadding", "promoTimerBadgeChipContentSpacing", "promoTimerBadgeChipOuterHorizontalPadding", "promoTimerBadgeMaxFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "promoTimerBadgeMinFontSize", "promoTimerCountdownTextStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "HomePromoBadgeAutoResizeTextArea", "", "measureTexts", "", "", "maxTextAreaWidth", "content", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/runtime/Composable;", "HomePromoBadgeAutoResizeTextArea-rAjV9yQ", "(Ljava/util/List;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "HomePromoTimerBadgeChipLayout", "Landroidx/compose/foundation/layout/BoxScope;", "modifier", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "(Landroidx/compose/foundation/layout/BoxScope;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HomePromoBadgeChip", "horizontalPadding", "verticalPadding", "contentSpacing", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "HomePromoBadgeChip-z_eaty8", "(Landroidx/compose/ui/Modifier;FFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "specialOfferBackground", "Landroidx/compose/ui/graphics/Brush;", "HomePromoSection", "promoState", "Lorg/betup/ui/fragment/home/compose/HomePromoUiState;", "bonusOfferActive", "", "activeOffer", "Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "offerExpirationMs", "", "videoBonus", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "onSpecialOfferClick", "Lkotlin/Function0;", "onVideoRewardClick", "onVideoRewardLongClick", "onSpecialOfferBoundsReported", "Landroid/graphics/Rect;", "onVideoRewardBoundsReported", "(Lorg/betup/ui/fragment/home/compose/HomePromoUiState;ZLorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;Ljava/lang/Long;Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "HomeSpecialOfferCard", "nowMs", "onClick", "(ZLorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;Ljava/lang/Long;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeVideoRewardCard", "onLongClick", "isExpanded", "(Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomePromoTimerBadgeChip", "timerText", "(Landroidx/compose/foundation/layout/BoxScope;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomePromoVideoRewardCooldownBadgeChip", "remainingMs", "(Landroidx/compose/foundation/layout/BoxScope;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PromoCardDecorativeImage", "painterRes", "", "offsetX", "offsetY", "alpha", "", "rotationDegrees", "PromoCardDecorativeImage-1yyLQnY", "(Landroidx/compose/foundation/layout/BoxScope;IFFFFLandroidx/compose/runtime/Composer;II)V", "previewBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "promoCardPreviewSize", "HomeSpecialOfferCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "HomeSpecialOfferCardInactivePreview", "HomeVideoRewardCardPreview", "HomePromoVideoOnlyPreview", "HomeVideoRewardCardCooldownPreview", "HomePromoCardPreviewSurface", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomePromoSectionKt {
    private static final float promoBadgePeekOffset;
    private static final RoundedCornerShape promoBadgeShape;
    private static final float promoTimerBadgeChipHorizontalPadding;
    private static final RoundedCornerShape promoCardShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
    private static final float promoTimerBadgeOffsetY = Dp.m7774constructorimpl(-Dp.m7774constructorimpl(2));
    private static final float promoTimerBadgeChipVerticalPadding = Dp.m7774constructorimpl(5);
    private static final float promoTimerBadgeChipContentSpacing = Dp.m7774constructorimpl(3);
    private static final float promoTimerBadgeChipOuterHorizontalPadding = Dp.m7774constructorimpl(4);
    private static final long promoTimerBadgeMaxFontSize = TextUnitKt.getSp(11);
    private static final long promoTimerBadgeMinFontSize = TextUnitKt.getSp(8);
    private static final Brush specialOfferBackground = Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4282004000L)), Color.m5158boximpl(ColorKt.Color(4280032032L))}), 0.0f, 0.0f, 0, 14, (Object) null);
    private static final long previewBackgroundColor = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();

    /* compiled from: HomePromoSection.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoOfferAvailabilityPhase.values().length];
            try {
                iArr[VideoOfferAvailabilityPhase.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.COOLDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.LIMIT_REACHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoBadgeAutoResizeTextArea_rAjV9yQ$lambda$1(List list, float f, Function3 function3, int i, Composer composer, int i2) {
        m13809HomePromoBadgeAutoResizeTextArearAjV9yQ(list, f, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoBadgeChip_z_eaty8$lambda$3(Modifier modifier, float f, float f2, float f3, Function3 function3, int i, int i2, Composer composer, int i3) {
        m13810HomePromoBadgeChipz_eaty8(modifier, f, f2, f3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoCardPreviewSurface$lambda$36(Function2 function2, int i, Composer composer, int i2) {
        HomePromoCardPreviewSurface(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoSection$lambda$4(HomePromoUiState homePromoUiState, boolean z, HomeActiveOfferUiState homeActiveOfferUiState, Long l, HomeVideoBonusUiState homeVideoBonusUiState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        HomePromoSection(homePromoUiState, z, homeActiveOfferUiState, l, homeVideoBonusUiState, function0, function02, function03, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoSection$lambda$6(HomePromoUiState homePromoUiState, boolean z, HomeActiveOfferUiState homeActiveOfferUiState, Long l, HomeVideoBonusUiState homeVideoBonusUiState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        HomePromoSection(homePromoUiState, z, homeActiveOfferUiState, l, homeVideoBonusUiState, function0, function02, function03, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoTimerBadgeChip$lambda$27(BoxScope boxScope, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomePromoTimerBadgeChip(boxScope, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoTimerBadgeChipLayout$lambda$2(BoxScope boxScope, List list, Modifier modifier, Function4 function4, int i, int i2, Composer composer, int i3) {
        HomePromoTimerBadgeChipLayout(boxScope, list, modifier, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoVideoOnlyPreview$lambda$33(int i, Composer composer, int i2) {
        HomePromoVideoOnlyPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePromoVideoRewardCooldownBadgeChip$lambda$28(BoxScope boxScope, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomePromoVideoRewardCooldownBadgeChip(boxScope, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeSpecialOfferCard$lambda$15(boolean z, HomeActiveOfferUiState homeActiveOfferUiState, Long l, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeSpecialOfferCard(z, homeActiveOfferUiState, l, j, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeSpecialOfferCardInactivePreview$lambda$31(int i, Composer composer, int i2) {
        HomeSpecialOfferCardInactivePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeSpecialOfferCardPreview$lambda$30(int i, Composer composer, int i2) {
        HomeSpecialOfferCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeVideoRewardCard$lambda$26(HomeVideoBonusUiState homeVideoBonusUiState, long j, Function0 function0, Function0 function02, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeVideoRewardCard(homeVideoBonusUiState, j, function0, function02, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeVideoRewardCardCooldownPreview$lambda$34(int i, Composer composer, int i2) {
        HomeVideoRewardCardCooldownPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeVideoRewardCardPreview$lambda$32(int i, Composer composer, int i2) {
        HomeVideoRewardCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoCardDecorativeImage_1yyLQnY$lambda$29(BoxScope boxScope, int i, float f, float f2, float f3, float f4, int i2, int i3, Composer composer, int i4) {
        m13811PromoCardDecorativeImage1yyLQnY(boxScope, i, f, f2, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle promoTimerCountdownTextStyle(Composer composer, int i) {
        composer.startReplaceGroup(-1718287685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1718287685, i, -1, "org.betup.ui.fragment.home.compose.sections.promoTimerCountdownTextStyle (HomePromoSection.kt:101)");
        }
        TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), promoTimerBadgeMaxFontSize, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HomePromoBadgeAutoResizeTextArea-rAjV9yQ, reason: not valid java name */
    public static final void m13809HomePromoBadgeAutoResizeTextArearAjV9yQ(final List<String> list, final float f, final Function3<? super TextUnit, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(470814154);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470814154, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoBadgeAutoResizeTextArea (HomePromoSection.kt:112)");
            }
            TextStyle promoTimerCountdownTextStyle = promoTimerCountdownTextStyle(startRestartGroup, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            function3.invoke(TextUnit.m7958boximpl(AutoResizeSiblingsTextKt.m12898CalculateAutoResizeFontSizeForWidtha8pgNYE(list, promoTimerBadgeMaxFontSize, promoTimerBadgeMinFontSize, RangesKt.coerceAtLeast(((Density) consume).mo1167toPx0680j_4(f), 1.0f), false, 1, promoTimerCountdownTextStyle, startRestartGroup, (i3 & 14) | 221616, 0)), composer2, Integer.valueOf((i3 >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePromoBadgeAutoResizeTextArea_rAjV9yQ$lambda$1;
                    HomePromoBadgeAutoResizeTextArea_rAjV9yQ$lambda$1 = HomePromoSectionKt.HomePromoBadgeAutoResizeTextArea_rAjV9yQ$lambda$1(list, f, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePromoBadgeAutoResizeTextArea_rAjV9yQ$lambda$1;
                }
            });
        }
    }

    private static final void HomePromoTimerBadgeChipLayout(final BoxScope boxScope, final List<String> list, Modifier modifier, final Function4<? super Dp, ? super TextUnit, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1256102651);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1256102651, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoTimerBadgeChipLayout (HomePromoSection.kt:133)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(boxScope.align(modifier, Alignment.INSTANCE.getBottomCenter()), 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(436252783, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$HomePromoTimerBadgeChipLayout$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i5) {
                    int i6;
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    float f7;
                    float f8;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i6 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(436252783, i6, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoTimerBadgeChipLayout.<anonymous> (HomePromoSection.kt:139)");
                    }
                    f = HomePromoSectionKt.promoTimerBadgeChipOuterHorizontalPadding;
                    float f9 = 2;
                    float m7774constructorimpl = Dp.m7774constructorimpl(f * f9);
                    f2 = HomePromoSectionKt.promoTimerBadgeChipHorizontalPadding;
                    float m7774constructorimpl2 = Dp.m7774constructorimpl(f2 * f9);
                    final float m7774constructorimpl3 = Dp.m7774constructorimpl(15);
                    float m7774constructorimpl4 = Dp.m7774constructorimpl(m7774constructorimpl2 + m7774constructorimpl3);
                    f3 = HomePromoSectionKt.promoTimerBadgeChipContentSpacing;
                    float m7774constructorimpl5 = Dp.m7774constructorimpl(m7774constructorimpl4 + f3);
                    float f10 = 0;
                    float m7788unboximpl = ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() - m7774constructorimpl)), Dp.m7772boximpl(Dp.m7774constructorimpl(f10)))).m7788unboximpl();
                    final float m7788unboximpl2 = ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(m7788unboximpl - m7774constructorimpl5)), Dp.m7772boximpl(Dp.m7774constructorimpl(f10)))).m7788unboximpl();
                    Modifier align = BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter());
                    f4 = HomePromoSectionKt.promoTimerBadgeOffsetY;
                    Modifier m1476offsetVpY3zN4$default = OffsetKt.m1476offsetVpY3zN4$default(align, 0.0f, f4, 1, null);
                    f5 = HomePromoSectionKt.promoTimerBadgeChipOuterHorizontalPadding;
                    Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1518paddingVpY3zN4$default(m1476offsetVpY3zN4$default, f5, 0.0f, 2, null), 0.0f, m7788unboximpl, 1, null), null, false, 3, null);
                    f6 = HomePromoSectionKt.promoTimerBadgeChipHorizontalPadding;
                    f7 = HomePromoSectionKt.promoTimerBadgeChipVerticalPadding;
                    f8 = HomePromoSectionKt.promoTimerBadgeChipContentSpacing;
                    final List<String> list2 = list;
                    final Function4<Dp, TextUnit, Composer, Integer, Unit> function42 = function4;
                    HomePromoSectionKt.m13810HomePromoBadgeChipz_eaty8(wrapContentWidth$default, f6, f7, f8, ComposableLambdaKt.rememberComposableLambda(1351835703, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$HomePromoTimerBadgeChipLayout$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope HomePromoBadgeChip, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(HomePromoBadgeChip, "$this$HomePromoBadgeChip");
                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1351835703, i7, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoTimerBadgeChipLayout.<anonymous>.<anonymous> (HomePromoSection.kt:158)");
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clock, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                            List<String> list3 = list2;
                            float f11 = m7788unboximpl2;
                            final Function4<Dp, TextUnit, Composer, Integer, Unit> function43 = function42;
                            final float f12 = m7788unboximpl2;
                            HomePromoSectionKt.m13809HomePromoBadgeAutoResizeTextArearAjV9yQ(list3, f11, ComposableLambdaKt.rememberComposableLambda(-429934299, true, new Function3<TextUnit, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt.HomePromoTimerBadgeChipLayout.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(TextUnit textUnit, Composer composer4, Integer num) {
                                    m13815invokeo2QH7mI(textUnit.getPackedValue(), composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-o2QH7mI, reason: not valid java name */
                                public final void m13815invokeo2QH7mI(long j, Composer composer4, int i8) {
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer4.changed(j) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-429934299, i8, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoTimerBadgeChipLayout.<anonymous>.<anonymous>.<anonymous> (HomePromoSection.kt:167)");
                                    }
                                    function43.invoke(Dp.m7772boximpl(f12), TextUnit.m7958boximpl(j), composer4, Integer.valueOf((i8 << 3) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 28080, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePromoTimerBadgeChipLayout$lambda$2;
                    HomePromoTimerBadgeChipLayout$lambda$2 = HomePromoSectionKt.HomePromoTimerBadgeChipLayout$lambda$2(BoxScope.this, list, modifier2, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePromoTimerBadgeChipLayout$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004e  */
    /* renamed from: HomePromoBadgeChip-z_eaty8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13810HomePromoBadgeChipz_eaty8(Modifier modifier, float f, float f2, float f3, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        float f6;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1283145536);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f4 = f;
            i3 |= startRestartGroup.changed(f4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f5 = f2;
                i3 |= startRestartGroup.changed(f5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f6 = f3;
                    i3 |= startRestartGroup.changed(f6) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            f4 = Dp.m7774constructorimpl(8);
                        }
                        if (i4 != 0) {
                            f5 = Dp.m7774constructorimpl(3);
                        }
                        if (i5 != 0) {
                            f6 = Dp.m7774constructorimpl(5);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1283145536, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoBadgeChip (HomePromoSection.kt:180)");
                        }
                        RoundedCornerShape roundedCornerShape = promoBadgeShape;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(companion, roundedCornerShape), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape, 0.0f, 4, null), f4, f5);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(f6);
                        int i8 = ((i3 >> 3) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        function3.invoke(RowScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i8 >> 6) & 112) | 6));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                    }
                    final float f7 = f5;
                    final float f8 = f6;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final float f9 = f4;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomePromoBadgeChip_z_eaty8$lambda$3;
                                HomePromoBadgeChip_z_eaty8$lambda$3 = HomePromoSectionKt.HomePromoBadgeChip_z_eaty8$lambda$3(Modifier.this, f9, f7, f8, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return HomePromoBadgeChip_z_eaty8$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                f6 = f3;
                if ((i2 & 16) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RoundedCornerShape roundedCornerShape2 = promoBadgeShape;
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(companion, roundedCornerShape2), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape2), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape2, 0.0f, 4, null), f4, f5);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(f6);
                int i82 = ((i3 >> 3) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                function3.invoke(RowScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i82 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                final float f72 = f5;
                final float f82 = f6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f5 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f6 = f3;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShape22 = promoBadgeShape;
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(companion, roundedCornerShape22), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape22), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape22, 0.0f, 4, null), f4, f5);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(f6);
            int i822 = ((i3 >> 3) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            function3.invoke(RowScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i822 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            final float f722 = f5;
            final float f822 = f6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f4 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f6 = f3;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape roundedCornerShape222 = promoBadgeShape;
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(companion, roundedCornerShape222), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape222), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape222, 0.0f, 4, null), f4, f5);
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(f6);
        int i8222 = ((i3 >> 3) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4222, centerVertically222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        function3.invoke(RowScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i8222 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        final float f7222 = f5;
        final float f8222 = f6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x017b, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomePromoSection(final HomePromoUiState promoState, final boolean z, final HomeActiveOfferUiState homeActiveOfferUiState, final Long l, final HomeVideoBonusUiState videoBonus, final Function0<Unit> onSpecialOfferClick, final Function0<Unit> onVideoRewardClick, Function0<Unit> function0, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Function1<? super Rect, Unit> function13;
        Function1<? super Rect, Unit> function14;
        Composer composer2;
        final Modifier modifier2;
        final Function0<Unit> function02;
        final Function1<? super Rect, Unit> function15;
        final Function1<? super Rect, Unit> function16;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(promoState, "promoState");
        Intrinsics.checkNotNullParameter(videoBonus, "videoBonus");
        Intrinsics.checkNotNullParameter(onSpecialOfferClick, "onSpecialOfferClick");
        Intrinsics.checkNotNullParameter(onVideoRewardClick, "onVideoRewardClick");
        Composer startRestartGroup = composer.startRestartGroup(927295085);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(promoState) : startRestartGroup.changedInstance(promoState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(homeActiveOfferUiState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(l) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(videoBonus) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(onSpecialOfferClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(onVideoRewardClick) ? 1048576 : 524288;
        }
        int i10 = i3 & 128;
        if (i10 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
            }
            i6 = i3 & 512;
            if (i6 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(function12) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i7 = i3 & 1024;
            if (i7 == 0) {
                i9 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i9 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
            } else {
                i8 = i2;
                if ((i4 & 306783379) != 306783378 && (i8 & 3) == 2 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    function16 = function1;
                    function15 = function12;
                    modifier2 = modifier;
                    composer2 = startRestartGroup;
                    function02 = function0;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomePromoSection$lambda$6;
                                HomePromoSection$lambda$6 = HomePromoSectionKt.HomePromoSection$lambda$6(HomePromoUiState.this, z, homeActiveOfferUiState, l, videoBonus, onSpecialOfferClick, onVideoRewardClick, function02, function16, function15, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return HomePromoSection$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                Function0<Unit> function03 = function0;
                Function1<? super Rect, Unit> function17 = i5 != 0 ? null : function1;
                Function1<? super Rect, Unit> function18 = i6 != 0 ? null : function12;
                Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(927295085, i4, i8, "org.betup.ui.fragment.home.compose.sections.HomePromoSection (HomePromoSection.kt:212)");
                }
                startRestartGroup.startReplaceGroup(2072363536);
                if (promoState instanceof HomePromoUiState.Loading) {
                    HomeSectionLoadingPlaceholderKt.m13830HomeSectionLoadingPlaceholderorJrPs(PromoCardArt.INSTANCE.m13838getCARD_HEIGHTD9Ej5fM(), modifier3, startRestartGroup, ((i8 << 3) & 112) | 6, 0);
                    startRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final Modifier modifier4 = modifier3;
                        final Function1<? super Rect, Unit> function19 = function17;
                        final Function1<? super Rect, Unit> function110 = function18;
                        final Function0<Unit> function04 = function03;
                        endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomePromoSection$lambda$4;
                                HomePromoSection$lambda$4 = HomePromoSectionKt.HomePromoSection$lambda$4(HomePromoUiState.this, z, homeActiveOfferUiState, l, videoBonus, onSpecialOfferClick, onVideoRewardClick, function04, function19, function110, modifier4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return HomePromoSection$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier5 = modifier3;
                Function1<? super Rect, Unit> function111 = function18;
                Function1<? super Rect, Unit> function112 = function17;
                startRestartGroup.endReplaceGroup();
                boolean z2 = z && homeActiveOfferUiState != null;
                int i11 = i4;
                long rememberTickingNowMs = HomeCountdownTextKt.rememberTickingNowMs((z2 && l != null) || videoBonus.getCooldownEndsAtEpochMs() != null || (videoBonus.getMaxPerInterval() > 0 && !videoBonus.getLimitReached()), 0L, startRestartGroup, 0, 2);
                if (z2) {
                    startRestartGroup.startReplaceGroup(-180655534);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i12 = i11 >> 3;
                    function13 = function112;
                    HomeSpecialOfferCard(true, homeActiveOfferUiState, l, rememberTickingNowMs, onSpecialOfferClick, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.m1549height3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), PromoCardArt.INSTANCE.m13838getCARD_HEIGHTD9Ej5fM()), function112, startRestartGroup, (i11 >> 21) & 112), startRestartGroup, (i12 & 112) | 6 | (i12 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i12 & 57344), 0);
                    HomeVideoRewardCard(videoBonus, rememberTickingNowMs, onVideoRewardClick, function03, false, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.m1549height3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), PromoCardArt.INSTANCE.m13838getCARD_HEIGHTD9Ej5fM()), function111, startRestartGroup, (i11 >> 24) & 112), startRestartGroup, (i11 >> 12) & 8078, 16);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    function14 = function111;
                } else {
                    function13 = function112;
                    startRestartGroup.startReplaceGroup(-179646980);
                    int i13 = i11 >> 12;
                    function14 = function111;
                    composer2 = startRestartGroup;
                    HomeVideoRewardCard(videoBonus, rememberTickingNowMs, onVideoRewardClick, function03, true, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.m1549height3ABfNKs(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), PromoCardArt.INSTANCE.m13839getEXPANDED_VIDEO_ROW_HORIZONTAL_PADDINGD9Ej5fM(), 0.0f, 2, null), PromoCardArt.INSTANCE.m13838getCARD_HEIGHTD9Ej5fM()), function111, startRestartGroup, (i11 >> 24) & 112), startRestartGroup, (i13 & 14) | 24576 | (i13 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i13 & 7168), 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
                function02 = function03;
                function15 = function14;
                function16 = function13;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i9;
            if ((i4 & 306783379) != 306783378) {
                startRestartGroup.skipToGroupEnd();
                function16 = function1;
                function15 = function12;
                modifier2 = modifier;
                composer2 = startRestartGroup;
                function02 = function0;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            Function0<Unit> function032 = function0;
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(2072363536);
            if (promoState instanceof HomePromoUiState.Loading) {
            }
        }
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        i8 = i9;
        if ((i4 & 306783379) != 306783378) {
        }
        Function0<Unit> function0322 = function0;
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(2072363536);
        if (promoState instanceof HomePromoUiState.Loading) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        if (r0.intValue() > 0) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0423  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeSpecialOfferCard(final boolean z, final HomeActiveOfferUiState homeActiveOfferUiState, final Long l, final long j, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str;
        Integer num;
        String formatHms;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-69873505);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(homeActiveOfferUiState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(l) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-69873505, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomeSpecialOfferCard (HomePromoSection.kt:276)");
                }
                if (homeActiveOfferUiState != null || (str = homeActiveOfferUiState.getTitle()) == null || StringsKt.isBlank(str)) {
                    str = null;
                }
                startRestartGroup.startReplaceGroup(1571048769);
                if (z || str == null) {
                    str = StringResources_androidKt.stringResource(R.string.special_offer, startRestartGroup, 6);
                }
                String str2 = str;
                startRestartGroup.endReplaceGroup();
                if (homeActiveOfferUiState != null) {
                    num = Integer.valueOf(homeActiveOfferUiState.getBetcoins());
                }
                num = null;
                String shopBetcoinsFormated = num == null ? FormatHelper.getShopBetcoinsFormated(num.intValue()) : null;
                formatHms = (z || l == null) ? null : HomeCountdownFormat.INSTANCE.formatHms(RangesKt.coerceAtLeast(l.longValue() - j, 0L));
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                Modifier subtleClickAnimation = ClickAnimationModifierKt.subtleClickAnimation(AlphaKt.alpha(modifier4, !z ? 1.0f : 0.55f), onClick, null, z, 0, false, false, 0.0f, false, 0.0f, null, composer2, ((i3 >> 9) & 112) | ((i3 << 9) & 7168), 0, 1018);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, subtleClickAnimation);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                RoundedCornerShape roundedCornerShape = promoCardShape;
                Modifier background$default = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(fillMaxSize$default, roundedCornerShape), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.ButtonBackgroundGoldBorder.INSTANCE.getBrush(), roundedCornerShape), specialOfferBackground, null, 0.0f, 6, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, background$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                m13811PromoCardDecorativeImage1yyLQnY(BoxScopeInstance.INSTANCE, R.drawable.design__3, PromoCardArt.INSTANCE.m13841getSPECIAL_OFFER_ART_OFFSET_XD9Ej5fM(), PromoCardArt.INSTANCE.m13842getSPECIAL_OFFER_ART_OFFSET_YD9Ej5fM(), 0.9f, -10.0f, composer2, 224694, 0);
                Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1516padding3ABfNKs);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                TextKt.m3621Text4IGK_g(str2, RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 3120, 55292);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (!z && shopBetcoinsFormated != null) {
                    composer2.startReplaceGroup(1820941255);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically2, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_daily_quests_reward, new Object[]{shopBetcoinsFormated}, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(17), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.betcoins, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(17)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                } else if (!z) {
                    composer2.startReplaceGroup(1821976066);
                    TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_special_offer_active, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), composer2, 0, 3120, 55294);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1822511467);
                    TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_special_offer, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), composer2, 0, 3120, 55294);
                    composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-767923402);
                if (formatHms != null) {
                    HomePromoTimerBadgeChip(boxScopeInstance, formatHms, null, composer2, 6, 2);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeSpecialOfferCard$lambda$15;
                        HomeSpecialOfferCard$lambda$15 = HomePromoSectionKt.HomeSpecialOfferCard$lambda$15(z, homeActiveOfferUiState, l, j, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeSpecialOfferCard$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (homeActiveOfferUiState != null) {
        }
        str = null;
        startRestartGroup.startReplaceGroup(1571048769);
        if (z) {
        }
        str = StringResources_androidKt.stringResource(R.string.special_offer, startRestartGroup, 6);
        String str22 = str;
        startRestartGroup.endReplaceGroup();
        if (homeActiveOfferUiState != null) {
        }
        num = null;
        if (num == null) {
        }
        if (z) {
        }
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        Modifier subtleClickAnimation2 = ClickAnimationModifierKt.subtleClickAnimation(AlphaKt.alpha(modifier4, !z ? 1.0f : 0.55f), onClick, null, z, 0, false, false, 0.0f, false, 0.0f, null, composer2, ((i3 >> 9) & 112) | ((i3 << 9) & 7168), 0, 1018);
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, subtleClickAnimation2);
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        RoundedCornerShape roundedCornerShape2 = promoCardShape;
        Modifier background$default2 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(fillMaxSize$default2, roundedCornerShape2), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.ButtonBackgroundGoldBorder.INSTANCE.getBrush(), roundedCornerShape2), specialOfferBackground, null, 0.0f, 6, null);
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, background$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        m13811PromoCardDecorativeImage1yyLQnY(BoxScopeInstance.INSTANCE, R.drawable.design__3, PromoCardArt.INSTANCE.m13841getSPECIAL_OFFER_ART_OFFSET_XD9Ej5fM(), PromoCardArt.INSTANCE.m13842getSPECIAL_OFFER_ART_OFFSET_YD9Ej5fM(), 0.9f, -10.0f, composer2, 224694, 0);
        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12));
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer2, m1516padding3ABfNKs2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer2, 48);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        TextKt.m3621Text4IGK_g(str22, RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 3120, 55292);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (!z) {
        }
        if (!z) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(-767923402);
        if (formatHms != null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeVideoRewardCard(final HomeVideoBonusUiState videoBonus, final long j, final Function0<Unit> onClick, Function0<Unit> function0, boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        boolean z2;
        int i5;
        Modifier modifier2;
        boolean z3;
        boolean isOnCooldown;
        float f;
        int i6;
        Integer valueOf;
        Integer num;
        final VideoOfferMotion rememberVideoOfferMotion;
        boolean changed;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed2;
        Object rememberedValue2;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        VideoOfferMotion videoOfferMotion;
        String str;
        BoxScopeInstance boxScopeInstance;
        float f2;
        int i7;
        Modifier m1516padding3ABfNKs;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        long j2;
        final boolean z4;
        final Modifier modifier3;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(videoBonus, "videoBonus");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1525211520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(videoBonus) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                    if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        Function0<Unit> function03 = i8 == 0 ? null : function02;
                        z3 = i4 == 0 ? false : z2;
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1525211520, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomeVideoRewardCard (HomePromoSection.kt:399)");
                        }
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        long integer = ((Context) consume).getResources().getInteger(R.integer.home_video_reward_fallback_betcoins);
                        if (videoBonus.getDisplayPrizeAmount() <= 0) {
                            integer = videoBonus.getDisplayPrizeAmount();
                        } else if (videoBonus.getAdsAmount() > 0) {
                            integer = videoBonus.getAdsAmount();
                        }
                        long j3 = integer;
                        final String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(j3);
                        isOnCooldown = videoBonus.isOnCooldown(j);
                        String quotaLabel = videoBonus.quotaLabel(j);
                        final boolean z5 = videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS;
                        switch (WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                f = 1.0f;
                                break;
                            case 4:
                                f = 0.72f;
                                break;
                            case 5:
                            case 6:
                                f = 0.55f;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        float f3 = f;
                        i6 = WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()];
                        if (i6 != 1) {
                            valueOf = Integer.valueOf(R.string.video_ads_checking_partners);
                        } else if (i6 == 4) {
                            valueOf = Integer.valueOf(R.string.video_ads_none_right_now);
                        } else {
                            num = null;
                            rememberVideoOfferMotion = VideoOfferMotionKt.rememberVideoOfferMotion(videoBonus.getAvailabilityPhase(), startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed = startRestartGroup.changed(z5) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit HomeVideoRewardCard$lambda$17$lambda$16;
                                        HomeVideoRewardCard$lambda$17$lambda$16 = HomePromoSectionKt.HomeVideoRewardCard$lambda$17$lambda$16(z5, onClick);
                                        return HomeVideoRewardCard$lambda$17$lambda$16;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            Function0 function04 = (Function0) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            Modifier subtleClickAnimation = ClickAnimationModifierKt.subtleClickAnimation(modifier4, function04, function03, (z5 && function03 == null) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i3 >> 15) & 14) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0, 1016);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(5004770);
                            changed2 = startRestartGroup.changed(rememberVideoOfferMotion);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                                        HomeVideoRewardCard$lambda$25$lambda$19$lambda$18 = HomePromoSectionKt.HomeVideoRewardCard$lambda$25$lambda$19$lambda$18(VideoOfferMotion.this, (GraphicsLayerScope) obj);
                                        return HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier alpha = AlphaKt.alpha(GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default, (Function1) rememberedValue2), f3);
                            RoundedCornerShape roundedCornerShape = promoCardShape;
                            Modifier background$default = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(alpha, roundedCornerShape), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            if (z3) {
                                startRestartGroup.startReplaceGroup(-1825452057);
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), 0.0f, 1, null), 0.52f);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor3);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash3);
                                }
                                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                videoOfferMotion = rememberVideoOfferMotion;
                                str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                f2 = 0.0f;
                                boxScopeInstance = boxScopeInstance2;
                                i7 = 0;
                                m13811PromoCardDecorativeImage1yyLQnY(BoxScopeInstance.INSTANCE, R.drawable.visual__3, PromoCardArt.INSTANCE.m13843getVIDEO_REWARD_ART_OFFSET_XD9Ej5fM(), PromoCardArt.INSTANCE.m13844getVIDEO_REWARD_ART_OFFSET_YD9Ej5fM(), 0.95f, -0.0f, startRestartGroup, 224694, 0);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                videoOfferMotion = rememberVideoOfferMotion;
                                str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                boxScopeInstance = boxScopeInstance2;
                                f2 = 0.0f;
                                i7 = 0;
                                startRestartGroup.startReplaceGroup(-1824772847);
                                m13811PromoCardDecorativeImage1yyLQnY(boxScopeInstance3, R.drawable.visual__3, PromoCardArt.INSTANCE.m13843getVIDEO_REWARD_ART_OFFSET_XD9Ej5fM(), PromoCardArt.INSTANCE.m13844getVIDEO_REWARD_ART_OFFSET_YD9Ej5fM(), 0.95f, -0.0f, startRestartGroup, 224694, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            Modifier align = boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
                            if (z3) {
                                float f4 = 12;
                                m1516padding3ABfNKs = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, f2, 1, null), 0.58f), Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f4), 0.0f, Dp.m7774constructorimpl(f4), 4, null);
                            } else {
                                m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f2, 1, null), Dp.m7774constructorimpl(12));
                            }
                            Modifier then = align.then(m1516padding3ABfNKs);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical center = z3 ? arrangement.getCenter() : arrangement.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, i7);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor5);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_video_reward_title, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z3 ? TextUnitKt.getSp(16) : TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
                            startRestartGroup.startReplaceGroup(1680557145);
                            if (!videoBonus.isActionLoading() || videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.CHECKING) {
                                ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (num != null) {
                                startRestartGroup.startReplaceGroup(-843163898);
                                String stringResource = StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, i7);
                                if (videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.CHECKING) {
                                    stringResource = VideoOfferMotionKt.withAnimatedEllipsis(stringResource, videoOfferMotion.getAnimatedEllipsis());
                                }
                                TextKt.m3621Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(z3 ? 10 : 8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55294);
                                startRestartGroup.endReplaceGroup();
                            } else if (!isOnCooldown && videoBonus.showQuota(j) && quotaLabel != null) {
                                startRestartGroup.startReplaceGroup(-842248685);
                                TextKt.m3621Text4IGK_g(quotaLabel, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), z3 ? TextUnitKt.getSp(14) : TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-841805664);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.startReplaceGroup(-581342492);
                            if (z3 && videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.READY && !isOnCooldown && j3 > 0) {
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically2, startRestartGroup, 54);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor6);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash6);
                                }
                                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_daily_quests_reward, new Object[]{shopBetcoinsFormated}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(18), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.betcoins, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(1125756940);
                            if (isOnCooldown) {
                                Long cooldownEndsAtEpochMs = videoBonus.getCooldownEndsAtEpochMs();
                                Intrinsics.checkNotNull(cooldownEndsAtEpochMs);
                                j2 = 0;
                                HomePromoVideoRewardCooldownBadgeChip(boxScopeInstance, RangesKt.coerceAtLeast(cooldownEndsAtEpochMs.longValue() - j, 0L), null, startRestartGroup, 6, 2);
                            } else {
                                j2 = 0;
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1125764494);
                            if (!z3 && videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.READY && !isOnCooldown && j3 > j2) {
                                m13810HomePromoBadgeChipz_eaty8(OffsetKt.m1476offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), 0.0f, promoBadgePeekOffset, 1, null), 0.0f, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1190926832, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$HomeVideoRewardCard$2$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num2) {
                                        invoke(rowScope, composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope HomePromoBadgeChip, Composer composer2, int i9) {
                                        Intrinsics.checkNotNullParameter(HomePromoBadgeChip, "$this$HomePromoBadgeChip");
                                        if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1190926832, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeVideoRewardCard.<anonymous>.<anonymous> (HomePromoSection.kt:591)");
                                        }
                                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_daily_quests_reward, new Object[]{shopBetcoinsFormated}, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(15), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.betcoins, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 24576, 14);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function02 = function03;
                            z4 = z3;
                            modifier3 = modifier4;
                        }
                        num = valueOf;
                        rememberVideoOfferMotion = VideoOfferMotionKt.rememberVideoOfferMotion(videoBonus.getAvailabilityPhase(), startRestartGroup, 0);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed = startRestartGroup.changed(z5) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HomeVideoRewardCard$lambda$17$lambda$16;
                                HomeVideoRewardCard$lambda$17$lambda$16 = HomePromoSectionKt.HomeVideoRewardCard$lambda$17$lambda$16(z5, onClick);
                                return HomeVideoRewardCard$lambda$17$lambda$16;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        Function0 function042 = (Function0) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        if (z5) {
                        }
                        Modifier subtleClickAnimation2 = ClickAnimationModifierKt.subtleClickAnimation(modifier4, function042, function03, (z5 && function03 == null) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i3 >> 15) & 14) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0, 1016);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation2);
                        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        changed2 = startRestartGroup.changed(rememberVideoOfferMotion);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                                HomeVideoRewardCard$lambda$25$lambda$19$lambda$18 = HomePromoSectionKt.HomeVideoRewardCard$lambda$25$lambda$19$lambda$18(VideoOfferMotion.this, (GraphicsLayerScope) obj);
                                return HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        Modifier alpha2 = AlphaKt.alpha(GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default2, (Function1) rememberedValue2), f3);
                        RoundedCornerShape roundedCornerShape2 = promoCardShape;
                        Modifier background$default2 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(alpha2, roundedCornerShape2), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape2), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                        if (z3) {
                        }
                        Modifier align2 = boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
                        if (z3) {
                        }
                        Modifier then2 = align2.then(m1516padding3ABfNKs);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        if (z3) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, i7);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting()) {
                        }
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash42);
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, null);
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                        CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting()) {
                        }
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52);
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_video_reward_title, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z3 ? TextUnitKt.getSp(16) : TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
                        startRestartGroup.startReplaceGroup(1680557145);
                        if (!videoBonus.isActionLoading()) {
                        }
                        ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (num != null) {
                        }
                        startRestartGroup.startReplaceGroup(-581342492);
                        if (z3) {
                            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically22, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                            CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl5.getInserting()) {
                            }
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash62);
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_daily_quests_reward, new Object[]{shopBetcoinsFormated}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(18), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.betcoins, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(1125756940);
                        if (isOnCooldown) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1125764494);
                        if (!z3) {
                            m13810HomePromoBadgeChipz_eaty8(OffsetKt.m1476offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), 0.0f, promoBadgePeekOffset, 1, null), 0.0f, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1190926832, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$HomeVideoRewardCard$2$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num2) {
                                    invoke(rowScope, composer2, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope HomePromoBadgeChip, Composer composer2, int i9) {
                                    Intrinsics.checkNotNullParameter(HomePromoBadgeChip, "$this$HomePromoBadgeChip");
                                    if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1190926832, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeVideoRewardCard.<anonymous>.<anonymous> (HomePromoSection.kt:591)");
                                    }
                                    TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_daily_quests_reward, new Object[]{shopBetcoinsFormated}, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(15), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.betcoins, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, 24576, 14);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function02 = function03;
                        z4 = z3;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Function0<Unit> function05 = function02;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeVideoRewardCard$lambda$26;
                                HomeVideoRewardCard$lambda$26 = HomePromoSectionKt.HomeVideoRewardCard$lambda$26(HomeVideoBonusUiState.this, j, onClick, function05, z4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeVideoRewardCard$lambda$26;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 74899) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long integer2 = ((Context) consume2).getResources().getInteger(R.integer.home_video_reward_fallback_betcoins);
                if (videoBonus.getDisplayPrizeAmount() <= 0) {
                }
                long j32 = integer2;
                final String shopBetcoinsFormated2 = FormatHelper.getShopBetcoinsFormated(j32);
                isOnCooldown = videoBonus.isOnCooldown(j);
                String quotaLabel2 = videoBonus.quotaLabel(j);
                if (videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS) {
                }
                switch (WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()]) {
                }
                float f32 = f;
                i6 = WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()];
                if (i6 != 1) {
                }
                num = valueOf;
                rememberVideoOfferMotion = VideoOfferMotionKt.rememberVideoOfferMotion(videoBonus.getAvailabilityPhase(), startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(z5) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HomeVideoRewardCard$lambda$17$lambda$16;
                        HomeVideoRewardCard$lambda$17$lambda$16 = HomePromoSectionKt.HomeVideoRewardCard$lambda$17$lambda$16(z5, onClick);
                        return HomeVideoRewardCard$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                Function0 function0422 = (Function0) rememberedValue;
                startRestartGroup.endReplaceGroup();
                if (z5) {
                }
                Modifier subtleClickAnimation22 = ClickAnimationModifierKt.subtleClickAnimation(modifier4, function0422, function03, (z5 && function03 == null) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i3 >> 15) & 14) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0, 1016);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation22);
                Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash72);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                changed2 = startRestartGroup.changed(rememberVideoOfferMotion);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                        HomeVideoRewardCard$lambda$25$lambda$19$lambda$18 = HomePromoSectionKt.HomeVideoRewardCard$lambda$25$lambda$19$lambda$18(VideoOfferMotion.this, (GraphicsLayerScope) obj);
                        return HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                Modifier alpha22 = AlphaKt.alpha(GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default22, (Function1) rememberedValue2), f32);
                RoundedCornerShape roundedCornerShape22 = promoCardShape;
                Modifier background$default22 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(alpha22, roundedCornerShape22), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape22), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default22);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                if (z3) {
                }
                Modifier align22 = boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
                if (z3) {
                }
                Modifier then22 = align22.then(m1516padding3ABfNKs);
                Arrangement arrangement22 = Arrangement.INSTANCE;
                if (z3) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, i7);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash422);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, null);
                Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
                CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash522);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_video_reward_title, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance32, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z3 ? TextUnitKt.getSp(16) : TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
                startRestartGroup.startReplaceGroup(1680557145);
                if (!videoBonus.isActionLoading()) {
                }
                ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (num != null) {
                }
                startRestartGroup.startReplaceGroup(-581342492);
                if (z3) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(1125756940);
                if (isOnCooldown) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1125764494);
                if (!z3) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function02 = function03;
                z4 = z3;
                modifier3 = modifier4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 74899) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localContext22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long integer22 = ((Context) consume22).getResources().getInteger(R.integer.home_video_reward_fallback_betcoins);
            if (videoBonus.getDisplayPrizeAmount() <= 0) {
            }
            long j322 = integer22;
            final String shopBetcoinsFormated22 = FormatHelper.getShopBetcoinsFormated(j322);
            isOnCooldown = videoBonus.isOnCooldown(j);
            String quotaLabel22 = videoBonus.quotaLabel(j);
            if (videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS) {
            }
            switch (WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()]) {
            }
            float f322 = f;
            i6 = WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()];
            if (i6 != 1) {
            }
            num = valueOf;
            rememberVideoOfferMotion = VideoOfferMotionKt.rememberVideoOfferMotion(videoBonus.getAvailabilityPhase(), startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(z5) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit HomeVideoRewardCard$lambda$17$lambda$16;
                    HomeVideoRewardCard$lambda$17$lambda$16 = HomePromoSectionKt.HomeVideoRewardCard$lambda$17$lambda$16(z5, onClick);
                    return HomeVideoRewardCard$lambda$17$lambda$16;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            Function0 function04222 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (z5) {
            }
            Modifier subtleClickAnimation222 = ClickAnimationModifierKt.subtleClickAnimation(modifier4, function04222, function03, (z5 && function03 == null) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i3 >> 15) & 14) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0, 1016);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap722 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier722 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation222);
            Function0<ComposeUiNode> constructor722 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash722);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            changed2 = startRestartGroup.changed(rememberVideoOfferMotion);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                    HomeVideoRewardCard$lambda$25$lambda$19$lambda$18 = HomePromoSectionKt.HomeVideoRewardCard$lambda$25$lambda$19$lambda$18(VideoOfferMotion.this, (GraphicsLayerScope) obj);
                    return HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            Modifier alpha222 = AlphaKt.alpha(GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default222, (Function1) rememberedValue2), f322);
            RoundedCornerShape roundedCornerShape222 = promoCardShape;
            Modifier background$default222 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(alpha222, roundedCornerShape222), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape222), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
            if (z3) {
            }
            Modifier align222 = boxScopeInstance3222.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
            if (z3) {
            }
            Modifier then222 = align222.then(m1516padding3ABfNKs);
            Arrangement arrangement222 = Arrangement.INSTANCE;
            if (z3) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, i7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
            CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
            Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash4222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, null);
            Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5222);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_video_reward_title, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance322, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z3 ? TextUnitKt.getSp(16) : TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
            startRestartGroup.startReplaceGroup(1680557145);
            if (!videoBonus.isActionLoading()) {
            }
            ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (num != null) {
            }
            startRestartGroup.startReplaceGroup(-581342492);
            if (z3) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1125756940);
            if (isOnCooldown) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1125764494);
            if (!z3) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function02 = function03;
            z4 = z3;
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 74899) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localContext222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long integer222 = ((Context) consume222).getResources().getInteger(R.integer.home_video_reward_fallback_betcoins);
        if (videoBonus.getDisplayPrizeAmount() <= 0) {
        }
        long j3222 = integer222;
        final String shopBetcoinsFormated222 = FormatHelper.getShopBetcoinsFormated(j3222);
        isOnCooldown = videoBonus.isOnCooldown(j);
        String quotaLabel222 = videoBonus.quotaLabel(j);
        if (videoBonus.getAvailabilityPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS) {
        }
        switch (WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()]) {
        }
        float f3222 = f;
        i6 = WhenMappings.$EnumSwitchMapping$0[videoBonus.getAvailabilityPhase().ordinal()];
        if (i6 != 1) {
        }
        num = valueOf;
        rememberVideoOfferMotion = VideoOfferMotionKt.rememberVideoOfferMotion(videoBonus.getAvailabilityPhase(), startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(z5) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit HomeVideoRewardCard$lambda$17$lambda$16;
                HomeVideoRewardCard$lambda$17$lambda$16 = HomePromoSectionKt.HomeVideoRewardCard$lambda$17$lambda$16(z5, onClick);
                return HomeVideoRewardCard$lambda$17$lambda$16;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        Function0 function042222 = (Function0) rememberedValue;
        startRestartGroup.endReplaceGroup();
        if (z5) {
        }
        Modifier subtleClickAnimation2222 = ClickAnimationModifierKt.subtleClickAnimation(modifier4, function042222, function03, (z5 && function03 == null) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ((i3 >> 15) & 14) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0, 1016);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy4222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier7222 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation2222);
        Function0<ComposeUiNode> constructor7222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier7222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(5004770);
        changed2 = startRestartGroup.changed(rememberVideoOfferMotion);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
                HomeVideoRewardCard$lambda$25$lambda$19$lambda$18 = HomePromoSectionKt.HomeVideoRewardCard$lambda$25$lambda$19$lambda$18(VideoOfferMotion.this, (GraphicsLayerScope) obj);
                return HomeVideoRewardCard$lambda$25$lambda$19$lambda$18;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        Modifier alpha2222 = AlphaKt.alpha(GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default2222, (Function1) rememberedValue2), f3222);
        RoundedCornerShape roundedCornerShape2222 = promoCardShape;
        Modifier background$default2222 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(alpha2222, roundedCornerShape2222), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape2222), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
        if (z3) {
        }
        Modifier align2222 = boxScopeInstance32222.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
        if (z3) {
        }
        Modifier then2222 = align2222.then(m1516padding3ABfNKs);
        Arrangement arrangement2222 = Arrangement.INSTANCE;
        if (z3) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, i7);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
        CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
        Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash42222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, null);
        Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i7);
        CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3222 = RowScopeInstance.INSTANCE;
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_video_reward_title, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance3222, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z3 ? TextUnitKt.getSp(16) : TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
        startRestartGroup.startReplaceGroup(1680557145);
        if (!videoBonus.isActionLoading()) {
        }
        ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (num != null) {
        }
        startRestartGroup.startReplaceGroup(-581342492);
        if (z3) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1125756940);
        if (isOnCooldown) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1125764494);
        if (!z3) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function02 = function03;
        z4 = z3;
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeVideoRewardCard$lambda$17$lambda$16(boolean z, Function0 function0) {
        if (z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeVideoRewardCard$lambda$25$lambda$19$lambda$18(VideoOfferMotion videoOfferMotion, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(videoOfferMotion.getCardScale());
        graphicsLayer.setScaleY(videoOfferMotion.getCardScale());
        return Unit.INSTANCE;
    }

    private static final void HomePromoTimerBadgeChip(final BoxScope boxScope, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-768279257);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-768279257, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoTimerBadgeChip (HomePromoSection.kt:617)");
            }
            HomePromoTimerBadgeChipLayout(boxScope, CollectionsKt.listOf(str), modifier, ComposableLambdaKt.rememberComposableLambda(1080057621, true, new Function4<Dp, TextUnit, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$HomePromoTimerBadgeChip$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Dp dp, TextUnit textUnit, Composer composer2, Integer num) {
                    m13814invokeKpM96b4(dp.m7788unboximpl(), textUnit.getPackedValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-KpM96b4, reason: not valid java name */
                public final void m13814invokeKpM96b4(float f, long j, Composer composer2, int i5) {
                    int i6;
                    TextStyle promoTimerCountdownTextStyle;
                    TextStyle m7263copyp1EtxEg;
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(f) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i6 |= composer2.changed(j) ? 32 : 16;
                    }
                    if ((i6 & Opcodes.I2S) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1080057621, i6, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoTimerBadgeChip.<anonymous> (HomePromoSection.kt:622)");
                    }
                    String str2 = str;
                    promoTimerCountdownTextStyle = HomePromoSectionKt.promoTimerCountdownTextStyle(composer2, 0);
                    m7263copyp1EtxEg = promoTimerCountdownTextStyle.m7263copyp1EtxEg((r48 & 1) != 0 ? promoTimerCountdownTextStyle.spanStyle.m7178getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontSize() : j, (r48 & 4) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? promoTimerCountdownTextStyle.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? promoTimerCountdownTextStyle.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? promoTimerCountdownTextStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? promoTimerCountdownTextStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? promoTimerCountdownTextStyle.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? promoTimerCountdownTextStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? promoTimerCountdownTextStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? promoTimerCountdownTextStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? promoTimerCountdownTextStyle.platformStyle : null, (r48 & 1048576) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextMotion() : null);
                    HomeCountdownTextKt.m13758HomeMonospaceCountdownTextjt2gSs(str2, m7263copyp1EtxEg, SizeKt.m1570widthInVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, f, 1, null), Dp.m7774constructorimpl(0), composer2, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePromoTimerBadgeChip$lambda$27;
                    HomePromoTimerBadgeChip$lambda$27 = HomePromoSectionKt.HomePromoTimerBadgeChip$lambda$27(BoxScope.this, str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePromoTimerBadgeChip$lambda$27;
                }
            });
        }
    }

    private static final void HomePromoVideoRewardCooldownBadgeChip(final BoxScope boxScope, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-420834932);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-420834932, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoVideoRewardCooldownBadgeChip (HomePromoSection.kt:637)");
            }
            HomePromoTimerBadgeChipLayout(boxScope, CollectionsKt.listOf(StringResources_androidKt.stringResource(R.string.home_video_reward_available_in, new Object[]{HomeCountdownFormat.INSTANCE.formatHms(j)}, startRestartGroup, 6)), modifier, ComposableLambdaKt.rememberComposableLambda(-807633286, true, new Function4<Dp, TextUnit, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$HomePromoVideoRewardCooldownBadgeChip$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Dp dp, TextUnit textUnit, Composer composer2, Integer num) {
                    m13816invokeKpM96b4(dp.m7788unboximpl(), textUnit.getPackedValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-KpM96b4, reason: not valid java name */
                public final void m13816invokeKpM96b4(float f, long j2, Composer composer2, int i5) {
                    int i6;
                    TextStyle promoTimerCountdownTextStyle;
                    TextStyle m7263copyp1EtxEg;
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(f) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i6 |= composer2.changed(j2) ? 32 : 16;
                    }
                    if ((i6 & Opcodes.I2S) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-807633286, i6, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoVideoRewardCooldownBadgeChip.<anonymous> (HomePromoSection.kt:647)");
                    }
                    long j3 = j;
                    promoTimerCountdownTextStyle = HomePromoSectionKt.promoTimerCountdownTextStyle(composer2, 0);
                    m7263copyp1EtxEg = promoTimerCountdownTextStyle.m7263copyp1EtxEg((r48 & 1) != 0 ? promoTimerCountdownTextStyle.spanStyle.m7178getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontSize() : j2, (r48 & 4) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? promoTimerCountdownTextStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? promoTimerCountdownTextStyle.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? promoTimerCountdownTextStyle.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? promoTimerCountdownTextStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? promoTimerCountdownTextStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? promoTimerCountdownTextStyle.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? promoTimerCountdownTextStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? promoTimerCountdownTextStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? promoTimerCountdownTextStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? promoTimerCountdownTextStyle.platformStyle : null, (r48 & 1048576) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? promoTimerCountdownTextStyle.paragraphStyle.getTextMotion() : null);
                    HomeCountdownTextKt.m13757HomeCountdownInlineTextAGcomas(R.string.home_video_reward_available_in, j3, m7263copyp1EtxEg, SizeKt.m1570widthInVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, f, 1, null), Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(15), composer2, 221190, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePromoVideoRewardCooldownBadgeChip$lambda$28;
                    HomePromoVideoRewardCooldownBadgeChip$lambda$28 = HomePromoSectionKt.HomePromoVideoRewardCooldownBadgeChip$lambda$28(BoxScope.this, j, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePromoVideoRewardCooldownBadgeChip$lambda$28;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* renamed from: PromoCardDecorativeImage-1yyLQnY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13811PromoCardDecorativeImage1yyLQnY(final BoxScope boxScope, final int i, final float f, final float f2, float f3, float f4, Composer composer, final int i2, final int i3) {
        int i4;
        float f5;
        int i5;
        float f6;
        final float f7;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1818545612);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            f5 = f3;
            i4 |= startRestartGroup.changed(f5) ? 16384 : 8192;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f6 = f4;
                i4 |= startRestartGroup.changed(f6) ? 131072 : 65536;
                if ((74899 & i4) == 74898 || !startRestartGroup.getSkipping()) {
                    float f8 = i6 != 0 ? 0.9f : f5;
                    float f9 = i5 != 0 ? 0.0f : f6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1818545612, i4, -1, "org.betup.ui.fragment.home.compose.sections.PromoCardDecorativeImage (HomePromoSection.kt:671)");
                    }
                    float f10 = f9;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14), (String) null, OffsetKt.m1475offsetVpY3zN4(RotateKt.rotate(boxScope.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomEnd()), f9), f, f2), (Alignment) null, ContentScale.INSTANCE.getCrop(), f8, (ColorFilter) null, startRestartGroup, ((i4 << 3) & 458752) | 24624, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f7 = f10;
                    f5 = f8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f7 = f6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final float f11 = f5;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PromoCardDecorativeImage_1yyLQnY$lambda$29;
                            PromoCardDecorativeImage_1yyLQnY$lambda$29 = HomePromoSectionKt.PromoCardDecorativeImage_1yyLQnY$lambda$29(BoxScope.this, i, f, f2, f11, f7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return PromoCardDecorativeImage_1yyLQnY$lambda$29;
                        }
                    });
                    return;
                }
                return;
            }
            f6 = f4;
            if ((74899 & i4) == 74898) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f102 = f9;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14), (String) null, OffsetKt.m1475offsetVpY3zN4(RotateKt.rotate(boxScope.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomEnd()), f9), f, f2), (Alignment) null, ContentScale.INSTANCE.getCrop(), f8, (ColorFilter) null, startRestartGroup, ((i4 << 3) & 458752) | 24624, 72);
            if (ComposerKt.isTraceInProgress()) {
            }
            f7 = f102;
            f5 = f8;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f5 = f3;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f6 = f4;
        if ((74899 & i4) == 74898) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f1022 = f9;
        ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14), (String) null, OffsetKt.m1475offsetVpY3zN4(RotateKt.rotate(boxScope.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomEnd()), f9), f, f2), (Alignment) null, ContentScale.INSTANCE.getCrop(), f8, (ColorFilter) null, startRestartGroup, ((i4 << 3) & 458752) | 24624, 72);
        if (ComposerKt.isTraceInProgress()) {
        }
        f7 = f1022;
        f5 = f8;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier promoCardPreviewSize(Modifier modifier) {
        return SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(modifier, PromoCardArt.INSTANCE.m13840getPREVIEW_CARD_WIDTHD9Ej5fM()), PromoCardArt.INSTANCE.m13838getCARD_HEIGHTD9Ej5fM());
    }

    public static final void HomeSpecialOfferCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2112110406);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112110406, i, -1, "org.betup.ui.fragment.home.compose.sections.HomeSpecialOfferCardPreview (HomePromoSection.kt:697)");
            }
            HomePromoCardPreviewSurface(ComposableSingletons$HomePromoSectionKt.INSTANCE.getLambda$791479328$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeSpecialOfferCardPreview$lambda$30;
                    HomeSpecialOfferCardPreview$lambda$30 = HomePromoSectionKt.HomeSpecialOfferCardPreview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeSpecialOfferCardPreview$lambda$30;
                }
            });
        }
    }

    public static final void HomeSpecialOfferCardInactivePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-834445563);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834445563, i, -1, "org.betup.ui.fragment.home.compose.sections.HomeSpecialOfferCardInactivePreview (HomePromoSection.kt:720)");
            }
            HomePromoCardPreviewSurface(ComposableSingletons$HomePromoSectionKt.INSTANCE.m13803getLambda$693773205$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeSpecialOfferCardInactivePreview$lambda$31;
                    HomeSpecialOfferCardInactivePreview$lambda$31 = HomePromoSectionKt.HomeSpecialOfferCardInactivePreview$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeSpecialOfferCardInactivePreview$lambda$31;
                }
            });
        }
    }

    public static final void HomeVideoRewardCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1293023463);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1293023463, i, -1, "org.betup.ui.fragment.home.compose.sections.HomeVideoRewardCardPreview (HomePromoSection.kt:740)");
            }
            HomePromoCardPreviewSurface(ComposableSingletons$HomePromoSectionKt.INSTANCE.m13802getLambda$1799900991$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeVideoRewardCardPreview$lambda$32;
                    HomeVideoRewardCardPreview$lambda$32 = HomePromoSectionKt.HomeVideoRewardCardPreview$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeVideoRewardCardPreview$lambda$32;
                }
            });
        }
    }

    public static final void HomePromoVideoOnlyPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(802383327);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802383327, i, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoVideoOnlyPreview (HomePromoSection.kt:766)");
            }
            HomePromoCardPreviewSurface(ComposableSingletons$HomePromoSectionKt.INSTANCE.m13804getLambda$821409083$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePromoVideoOnlyPreview$lambda$33;
                    HomePromoVideoOnlyPreview$lambda$33 = HomePromoSectionKt.HomePromoVideoOnlyPreview$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePromoVideoOnlyPreview$lambda$33;
                }
            });
        }
    }

    public static final void HomeVideoRewardCardCooldownPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2055832882);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055832882, i, -1, "org.betup.ui.fragment.home.compose.sections.HomeVideoRewardCardCooldownPreview (HomePromoSection.kt:796)");
            }
            HomePromoCardPreviewSurface(ComposableSingletons$HomePromoSectionKt.INSTANCE.getLambda$2060370700$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeVideoRewardCardCooldownPreview$lambda$34;
                    HomeVideoRewardCardCooldownPreview$lambda$34 = HomePromoSectionKt.HomeVideoRewardCardCooldownPreview$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeVideoRewardCardCooldownPreview$lambda$34;
                }
            });
        }
    }

    private static final void HomePromoCardPreviewSurface(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1941448364);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1941448364, i2, -1, "org.betup.ui.fragment.home.compose.sections.HomePromoCardPreviewSurface (HomePromoSection.kt:817)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, previewBackgroundColor, null, 2, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePromoCardPreviewSurface$lambda$36;
                    HomePromoCardPreviewSurface$lambda$36 = HomePromoSectionKt.HomePromoCardPreviewSurface$lambda$36(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePromoCardPreviewSurface$lambda$36;
                }
            });
        }
    }

    static {
        float f = 8;
        promoBadgeShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f));
        promoBadgePeekOffset = Dp.m7774constructorimpl(f);
        promoTimerBadgeChipHorizontalPadding = Dp.m7774constructorimpl(f);
    }
}
