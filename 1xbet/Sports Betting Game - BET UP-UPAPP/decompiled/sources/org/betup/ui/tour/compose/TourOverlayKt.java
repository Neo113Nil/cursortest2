package org.betup.ui.tour.compose;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.X2;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.dialogs.compose.OddsDialogScreenKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TourOverlay.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001aE\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001e\u001a7\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\"\u001a/\u0010&\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010*\u001aI\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00101\u001a?\u00102\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u0001042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00105\u001a=\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00107\u001aA\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00107\u001aG\u00109\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010:\u001aA\u0010;\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00107\u001aA\u0010=\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00107\u001a?\u0010>\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010A\u001a/\u0010B\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010E\u001a'\u0010F\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010G\u001a9\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00102\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010M\u001a7\u0010N\u001a\u00020\u00012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010R\u001a\r\u0010S\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010U\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010V\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010W\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010X\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010Y\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010Z\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010[\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\u001a\r\u0010\\\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010T\"\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]²\u0006\n\u0010^\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010_\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010`\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010a\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010c\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010d\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010e\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002"}, d2 = {"TourOverlay", "", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "tourFavoriteSportsController", "Lorg/betup/ui/tour/controller/TourFavoriteSportsController;", "userService", "Lorg/betup/services/user/UserService;", "onStepComplete", "Lkotlin/Function0;", "onSkip", "isOnHomePage", "", "onSportButtonClick", "onSportItemClick", "Lkotlin/Function1;", "", "onLeagueItemClick", "onMatchItemClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/tour/compose/TourState;Lorg/betup/ui/tour/controller/TourFavoriteSportsController;Lorg/betup/services/user/UserService;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "TourWelcomeScreen", "title", "", "subtitle", "characterPosition", "Lorg/betup/ui/tour/compose/TourCharacterPosition;", "onProceed", "canProceed", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TourCharacterPosition;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourHighlightScreen", "highlightElement", "Lorg/betup/ui/tour/compose/TourHighlightElement;", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TourCharacterPosition;Lorg/betup/ui/tour/compose/TourHighlightElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shakeAnimationSpec", "Landroidx/compose/animation/core/KeyframesSpec;", "", "TourNextButton", "onClick", "shakeTrigger", "", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourHomeHighlightScreen", "target", "Lorg/betup/ui/tour/compose/TourHighlightTarget;", "step", "Lorg/betup/ui/tour/compose/TourStep;", "onNext", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TourHighlightTarget;Lorg/betup/ui/tour/compose/TourStep;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourClickBottomNavButtonScreen", "bounds", "Landroid/graphics/Rect;", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourClickSportScreen", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TourState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourSelectLeagueScreen", "TourSelectMatchScreen", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TourState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourSelectBetScreen", "onBetSectionClick", "TourSelectSportScreen", "TourInstructionScreen", "showHandPointer", "handPosition", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TourCharacterPosition;ZLorg/betup/ui/tour/compose/TourCharacterPosition;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpeechBubbleWithTip", "tipPosition", "Lorg/betup/ui/tour/compose/TipPosition;", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/tour/compose/TipPosition;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpeechBubble", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TourIntroV2FirstPage", "skipBetcoins", "completeBonusBetcoins", "onSkipTour", "onTakeTour", "(JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TourSkipConfirmationDialog", "onYesClick", "onNoClick", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SpeechBubblePreview", "(Landroidx/compose/runtime/Composer;I)V", "TourWelcomeScreenLeftPreview", "TourWelcomeScreenRightPreview", "TourWelcomeScreenBottomCenterPreview", "TourHighlightScreenSportButtonPreview", "TourHighlightScreenSportItemPreview", "TourHighlightScreenLeagueItemPreview", "TourInstructionScreenPreview", "TourInstructionScreenPlaceBetPreview", "app_release", "showSkipDialog", "contentTopPx", "lightsHeightPx", "characterVisible", "bubbleVisible", "characterAlpha", "bubbleAlpha", "scale"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourOverlayKt {
    private static final KeyframesSpec<Float> shakeAnimationSpec = AnimationSpecKt.keyframes(new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda63
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit shakeAnimationSpec$lambda$97;
            shakeAnimationSpec$lambda$97 = TourOverlayKt.shakeAnimationSpec$lambda$97((KeyframesSpec.KeyframesSpecConfig) obj);
            return shakeAnimationSpec$lambda$97;
        }
    });

    /* compiled from: TourOverlay.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[TourStep.values().length];
            try {
                iArr[TourStep.CLICK_SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TourStep.WELCOME_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TourStep.WELCOME_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TourStep.CHOOSE_ODDS_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TourStep.DEMO_MATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TourStep.DEMO_BET_CONFIRM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TourStep.DEMO_MATCH_SIMULATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TourStep.CHOOSE_FAVORITE_SPORTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TourStep.WELCOME_INTRO_V2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TourStep.DEMO_MATCH_WON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TourStep.CLICK_HOME_WIN_RATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TourStep.CLICK_HOME_GLOBAL_RANK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TourStep.CLICK_HOME_BEST_STREAK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TourStep.CLICK_SPECIAL_OFFER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TourStep.CLICK_VIDEO_REWARD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TourStep.CLICK_DAILY_QUESTS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TourStep.CLICK_BATTLES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TourStep.CLICK_COMPETITIONS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TourStep.CLICK_LIVE_ARENA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TourStep.CLICK_TOP_MATCHES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TourStep.CLICK_MINIGAMES.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TourStep.CLICK_RANKING.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TourStep.CLICK_FLASH_BET.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TourStep.CLICK_TV_BET.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SPORTS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MY_BETS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SHOP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MENU.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TourStep.SELECT_SPORT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TourStep.SELECT_LEAGUE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[TourStep.SELECT_MATCH.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[TourStep.SELECT_BET.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[TourStep.PLACE_BET.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[TourStep.BET_PLACED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[TourStep.COMPLETED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TourCharacterPosition.values().length];
            try {
                iArr2[TourCharacterPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[TourCharacterPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[TourCharacterPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[TourCharacterPosition.BOTTOM_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TourHighlightElement.values().length];
            try {
                iArr3[TourHighlightElement.SPORT_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[TourHighlightElement.SPORT_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[TourHighlightElement.LEAGUE_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TipPosition.values().length];
            try {
                iArr4[TipPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[TipPosition.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[TipPosition.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[TipPosition.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr4[TipPosition.BOTTOM_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr4[TipPosition.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr4[TipPosition.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpeechBubble$lambda$170(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpeechBubble(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpeechBubblePreview$lambda$183(int i, Composer composer, int i2) {
        SpeechBubblePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpeechBubbleWithTip$lambda$168(String str, String str2, TipPosition tipPosition, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpeechBubbleWithTip(str, str2, tipPosition, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourClickBottomNavButtonScreen$lambda$120(String str, String str2, Rect rect, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourClickBottomNavButtonScreen(str, str2, rect, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourClickSportScreen$lambda$129(String str, String str2, TourState tourState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourClickSportScreen(str, str2, tourState, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourHighlightScreen$lambda$96(String str, String str2, TourCharacterPosition tourCharacterPosition, TourHighlightElement tourHighlightElement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourHighlightScreen(str, str2, tourCharacterPosition, tourHighlightElement, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourHighlightScreenLeagueItemPreview$lambda$201(int i, Composer composer, int i2) {
        TourHighlightScreenLeagueItemPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourHighlightScreenSportButtonPreview$lambda$197(int i, Composer composer, int i2) {
        TourHighlightScreenSportButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourHighlightScreenSportItemPreview$lambda$199(int i, Composer composer, int i2) {
        TourHighlightScreenSportItemPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourHomeHighlightScreen$lambda$113(String str, String str2, TourHighlightTarget tourHighlightTarget, TourStep tourStep, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourHomeHighlightScreen(str, str2, tourHighlightTarget, tourStep, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourInstructionScreen$lambda$163(String str, String str2, TourCharacterPosition tourCharacterPosition, boolean z, TourCharacterPosition tourCharacterPosition2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourInstructionScreen(str, str2, tourCharacterPosition, z, tourCharacterPosition2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourInstructionScreenPlaceBetPreview$lambda$205(int i, Composer composer, int i2) {
        TourInstructionScreenPlaceBetPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourInstructionScreenPreview$lambda$203(int i, Composer composer, int i2) {
        TourInstructionScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourIntroV2FirstPage$lambda$175(long j, long j2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        TourIntroV2FirstPage(j, j2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourNextButton$lambda$103(Function0 function0, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        TourNextButton(function0, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$3(TourState tourState, TourFavoriteSportsController tourFavoriteSportsController, UserService userService, Function0 function0, Function0 function02, boolean z, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        TourOverlay(tourState, tourFavoriteSportsController, userService, function0, function02, z, function03, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$77(TourState tourState, TourFavoriteSportsController tourFavoriteSportsController, UserService userService, Function0 function0, Function0 function02, boolean z, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        TourOverlay(tourState, tourFavoriteSportsController, userService, function0, function02, z, function03, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectBetScreen$lambda$152(String str, String str2, TourState tourState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourSelectBetScreen(str, str2, tourState, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectLeagueScreen$lambda$138(String str, String str2, TourState tourState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourSelectLeagueScreen(str, str2, tourState, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectMatchScreen$lambda$143(String str, String str2, TourState tourState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourSelectMatchScreen(str, str2, tourState, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectSportScreen$lambda$161(String str, String str2, TourState tourState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourSelectSportScreen(str, str2, tourState, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSkipConfirmationDialog$lambda$182(Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        TourSkipConfirmationDialog(function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourWelcomeScreen$lambda$94(String str, String str2, TourCharacterPosition tourCharacterPosition, Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourWelcomeScreen(str, str2, tourCharacterPosition, function0, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourWelcomeScreenBottomCenterPreview$lambda$195(int i, Composer composer, int i2) {
        TourWelcomeScreenBottomCenterPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourWelcomeScreenLeftPreview$lambda$187(int i, Composer composer, int i2) {
        TourWelcomeScreenLeftPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourWelcomeScreenRightPreview$lambda$191(int i, Composer composer, int i2) {
        TourWelcomeScreenRightPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:374:0x15b6, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x1748, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L609;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x18c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0d0a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0d9d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0dfe  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0e2e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x1215  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x123f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x126d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x137f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1491  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x1605  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x1791  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x17ef  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x184a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1923  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x192c  */
    /* JADX WARN: Removed duplicated region for block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourOverlay(final TourState tourState, final TourFavoriteSportsController tourFavoriteSportsController, final UserService userService, final Function0<Unit> onStepComplete, final Function0<Unit> onSkip, boolean z, Function0<Unit> function0, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Long, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Function1<? super Long, Unit> function14;
        Function1<? super Long, Unit> function15;
        Modifier modifier2;
        boolean isOverlayVisible;
        TourStep currentStep;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        float f;
        boolean z2;
        TourStep tourStep;
        boolean z3;
        boolean z4;
        float f2;
        Object obj;
        int i11;
        boolean z5;
        int i12;
        Modifier m1059clickableXHw0xAI$default;
        Object obj2;
        Modifier.Companion companion;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        BoxScopeInstance boxScopeInstance;
        TourStep tourStep2;
        Modifier.Companion companion2;
        Modifier then;
        int i13;
        boolean changed;
        Object rememberedValue2;
        int i14;
        final TourHighlightTarget tourHighlightTarget;
        Function0<Unit> function02;
        MutableState mutableState;
        BoxScopeInstance boxScopeInstance2;
        final TourStep tourStep3;
        Function1<? super Long, Unit> function16;
        String str;
        boolean z6;
        Function1<? super Long, Unit> function17;
        String str2;
        Modifier modifier4;
        String str3;
        Modifier modifier5;
        float f3;
        String str4;
        Composer composer2;
        boolean z7;
        Composer composer3;
        TourStep tourStep4;
        final MutableState mutableState2;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z8;
        Object rememberedValue3;
        final TourState tourState2;
        boolean z9;
        Object rememberedValue4;
        boolean z10;
        Object rememberedValue5;
        Composer composer4;
        Function1<? super Long, Unit> function18;
        Function1<? super Long, Unit> function19;
        final Function0<Unit> function03;
        final TourState tourState3;
        final Function0<Unit> function04;
        Object obj3;
        Object obj4;
        Composer composer5;
        final TourState tourState4;
        Object obj5;
        Object obj6;
        int i19;
        final MutableState mutableState3;
        Function1<? super Long, Unit> function110;
        final Function1<? super Long, Unit> function111;
        Object obj7;
        final Function1<? super Long, Unit> function112;
        Object obj8;
        final Function0<Unit> function05;
        final Function1<? super Long, Unit> function113;
        final Function1<? super Long, Unit> function114;
        final boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(tourState, "tourState");
        Intrinsics.checkNotNullParameter(tourFavoriteSportsController, "tourFavoriteSportsController");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(onStepComplete, "onStepComplete");
        Intrinsics.checkNotNullParameter(onSkip, "onSkip");
        Composer startRestartGroup = composer.startRestartGroup(-827961494);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(tourState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(tourFavoriteSportsController) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(userService) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onStepComplete) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onSkip) ? 16384 : 8192;
        }
        int i20 = i3 & 64;
        if (i20 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((12582912 & i) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                i6 = i3 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changedInstance(function13) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                } else {
                    if ((i2 & 6) != 0) {
                        i9 = i2;
                        if ((i4 & 306717843) == 306717842 || (i9 & 3) != 2 || !startRestartGroup.getSkipping()) {
                            boolean z13 = (i3 & 32) == 0 ? false : z;
                            Function0<Unit> function06 = i20 == 0 ? null : function0;
                            Function1<? super Long, Unit> function115 = i5 == 0 ? null : function1;
                            function14 = i6 == 0 ? null : function12;
                            function15 = i7 == 0 ? null : function13;
                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-827961494, i4, i9, "org.betup.ui.tour.compose.TourOverlay (TourOverlay.kt:106)");
                            }
                            isOverlayVisible = tourState.isOverlayVisible();
                            currentStep = tourState.getCurrentStep();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            final Function0<Unit> function07 = function06;
                            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                rememberedValue = mutableStateOf$default;
                            }
                            MutableState mutableState4 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            final Function1<? super Long, Unit> function116 = function115;
                            Log.d("TourOverlay", "TourOverlay composable - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep + ", showSkipDialog: " + TourOverlay$lambda$1(mutableState4));
                            if (isOverlayVisible || currentStep == null || currentStep == TourStep.SELECT_BET) {
                                final Function1<? super Long, Unit> function117 = function14;
                                final Modifier modifier6 = modifier2;
                                Log.d("TourOverlay", "TourOverlay not showing - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    final boolean z14 = z13;
                                    final Function1<? super Long, Unit> function118 = function15;
                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj9, Object obj10) {
                                            Unit TourOverlay$lambda$3;
                                            TourOverlay$lambda$3 = TourOverlayKt.TourOverlay$lambda$3(TourState.this, tourFavoriteSportsController, userService, onStepComplete, onSkip, z14, function07, function116, function117, function118, modifier6, i, i2, i3, (Composer) obj9, ((Integer) obj10).intValue());
                                            return TourOverlay$lambda$3;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            boolean z15 = currentStep == TourStep.WELCOME_1 || currentStep == TourStep.WELCOME_2;
                            switch (WhenMappings.$EnumSwitchMapping$0[currentStep.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                default:
                                    f = 0.67f;
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                    f = 0.0f;
                                    break;
                            }
                            boolean z16 = currentStep == TourStep.CLICK_SPORT;
                            TourStep tourStep5 = TourStep.CLICK_BATTLES;
                            TourStep tourStep6 = TourStep.CLICK_COMPETITIONS;
                            Function1<? super Long, Unit> function119 = function14;
                            boolean z17 = currentStep == TourStep.CLICK_TOP_MATCHES;
                            TourStep tourStep7 = TourStep.CLICK_MINIGAMES;
                            TourStep tourStep8 = TourStep.CLICK_RANKING;
                            TourStep tourStep9 = TourStep.CLICK_TV_BET;
                            boolean z18 = currentStep == TourStep.CLICK_BOTTOM_SPORTS;
                            final boolean z19 = currentStep == TourStep.CLICK_BOTTOM_MY_BETS;
                            boolean z20 = currentStep == TourStep.CLICK_BOTTOM_SHOP;
                            final boolean z21 = z17;
                            boolean z22 = currentStep == TourStep.CLICK_BOTTOM_MENU;
                            final float f4 = f;
                            boolean z23 = currentStep == TourStep.SELECT_SPORT;
                            boolean z24 = currentStep == TourStep.SELECT_LEAGUE;
                            int i21 = i4;
                            boolean z25 = currentStep == TourStep.SELECT_MATCH;
                            boolean z26 = z15;
                            boolean z27 = currentStep == TourStep.SELECT_BET;
                            TourHighlightTarget targetForStep = HomeTourHighlight.INSTANCE.targetForStep(currentStep, tourState);
                            boolean usesRoundedCutout = HomeTourHighlight.INSTANCE.usesRoundedCutout(currentStep);
                            boolean isHomeV2HighlightStep = HomeTourSteps.INSTANCE.isHomeV2HighlightStep(currentStep);
                            boolean z28 = isHomeV2HighlightStep || z16 || z23 || z24 || z25;
                            if (z28 || z18 || z19 || z20 || z22) {
                                z2 = isHomeV2HighlightStep;
                                tourStep = currentStep;
                                z3 = z16;
                                z4 = usesRoundedCutout;
                                f2 = 0.0f;
                                obj = null;
                                i11 = 1;
                                z5 = true;
                            } else {
                                z2 = isHomeV2HighlightStep;
                                tourStep = currentStep;
                                z3 = z16;
                                z4 = usesRoundedCutout;
                                f2 = 0.0f;
                                obj = null;
                                i11 = 1;
                                z5 = false;
                            }
                            Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.fillMaxSize$default(modifier2, f2, i11, obj), 1000.0f);
                            if (!isOverlayVisible) {
                                startRestartGroup.startReplaceGroup(200604351);
                                startRestartGroup.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            } else if (TourOverlay$lambda$1(mutableState4)) {
                                startRestartGroup.startReplaceGroup(200765427);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                startRestartGroup.endReplaceGroup();
                                companion = ClickableKt.m1059clickableXHw0xAI$default(companion3, false, null, null, (Function0) rememberedValue6, 7, null);
                                startRestartGroup.endReplaceGroup();
                            } else if (z5) {
                                startRestartGroup.startReplaceGroup(201011133);
                                startRestartGroup.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            } else if (z23) {
                                startRestartGroup.startReplaceGroup(201206309);
                                startRestartGroup.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            } else if (z24) {
                                startRestartGroup.startReplaceGroup(201394820);
                                startRestartGroup.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            } else if (z25) {
                                startRestartGroup.startReplaceGroup(201583269);
                                startRestartGroup.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            } else if (!z27) {
                                if (z26) {
                                    startRestartGroup.startReplaceGroup(201953874);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    startRestartGroup.startReplaceGroup(5004770);
                                    i12 = i21;
                                    boolean z29 = (i12 & 7168) == 2048;
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (z29 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        Function0 function08 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda17
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$7$lambda$6;
                                                TourOverlay$lambda$7$lambda$6 = TourOverlayKt.TourOverlay$lambda$7$lambda$6(Function0.this);
                                                return TourOverlay$lambda$7$lambda$6;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(function08);
                                        obj2 = function08;
                                    } else {
                                        obj2 = rememberedValue7;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(companion4, false, null, null, (Function0) obj2, 7, null);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    i12 = i21;
                                    startRestartGroup.startReplaceGroup(202147810);
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda18
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(companion5, false, null, null, (Function0) rememberedValue8, 7, null);
                                    startRestartGroup.endReplaceGroup();
                                }
                                Modifier then2 = zIndex.then(m1059clickableXHw0xAI$default);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                modifier3 = modifier2;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                final boolean z30 = z25;
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
                                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (!z28 || z18 || z19 || z20 || z22) {
                                    tourStep2 = tourStep;
                                    startRestartGroup.startReplaceGroup(-859901753);
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    startRestartGroup.startReplaceGroup(1357741579);
                                    if (!z4) {
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        Object rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue9 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda19
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    Unit TourOverlay$lambda$76$lambda$11$lambda$10;
                                                    TourOverlay$lambda$76$lambda$11$lambda$10 = TourOverlayKt.TourOverlay$lambda$76$lambda$11$lambda$10((GraphicsLayerScope) obj9);
                                                    return TourOverlay$lambda$76$lambda$11$lambda$10;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue9);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        companion2 = GraphicsLayerModifierKt.graphicsLayer(companion6, (Function1) rememberedValue9);
                                    } else {
                                        companion2 = Modifier.INSTANCE;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    then = fillMaxSize$default.then(companion2);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    final boolean z31 = z3;
                                    final boolean z32 = z4;
                                    final boolean z33 = z2;
                                    i13 = i12;
                                    changed = startRestartGroup.changed(tourStep2.ordinal()) | ((i12 & 14) != 4) | startRestartGroup.changedInstance(targetForStep) | startRestartGroup.changed(z31) | startRestartGroup.changed(z23) | startRestartGroup.changed(z24) | startRestartGroup.changed(z30) | startRestartGroup.changed(density) | startRestartGroup.changed(f4) | startRestartGroup.changed(z32) | startRestartGroup.changed(z18) | startRestartGroup.changed(z19) | startRestartGroup.changed(z20) | startRestartGroup.changed(z22) | startRestartGroup.changed(z33) | startRestartGroup.changed(z21);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed && rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                        str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                        function02 = function07;
                                        str = "C72@3468L9:Box.kt#2w3rfo";
                                        modifier5 = then;
                                        boxScopeInstance2 = boxScopeInstance;
                                        composer2 = startRestartGroup;
                                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                        tourStep3 = tourStep2;
                                        str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                        i14 = i13;
                                        function17 = function116;
                                        function16 = function119;
                                        tourHighlightTarget = targetForStep;
                                        mutableState = mutableState4;
                                        modifier4 = modifier3;
                                        z6 = isOverlayVisible;
                                        f3 = 0.0f;
                                    } else {
                                        i14 = i13;
                                        tourHighlightTarget = targetForStep;
                                        function02 = function07;
                                        mutableState = mutableState4;
                                        final boolean z34 = z24;
                                        boxScopeInstance2 = boxScopeInstance;
                                        tourStep3 = tourStep2;
                                        final boolean z35 = z23;
                                        function16 = function119;
                                        str = "C72@3468L9:Box.kt#2w3rfo";
                                        z6 = isOverlayVisible;
                                        function17 = function116;
                                        str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                        modifier4 = modifier3;
                                        final boolean z36 = z18;
                                        str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                        modifier5 = then;
                                        f3 = 0.0f;
                                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                        final boolean z37 = z20;
                                        final boolean z38 = z22;
                                        Function1 function120 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda20
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj9) {
                                                Unit TourOverlay$lambda$76$lambda$26$lambda$25;
                                                TourOverlay$lambda$76$lambda$26$lambda$25 = TourOverlayKt.TourOverlay$lambda$76$lambda$26$lambda$25(TourHighlightTarget.this, z31, tourState, z35, z34, z30, density, f4, z32, z36, z19, z37, z38, z33, tourStep3, z21, (DrawScope) obj9);
                                                return TourOverlay$lambda$76$lambda$26$lambda$25;
                                            }
                                        };
                                        Composer composer6 = startRestartGroup;
                                        composer6.updateRememberedValue(function120);
                                        rememberedValue2 = function120;
                                        composer2 = composer6;
                                    }
                                    composer2.endReplaceGroup();
                                    z7 = false;
                                    BoxKt.Box(DrawModifierKt.drawBehind(modifier5, (Function1) rememberedValue2), composer2, 0);
                                    composer2.endReplaceGroup();
                                    composer3 = composer2;
                                } else {
                                    TourStep tourStep10 = tourStep;
                                    if (tourStep10 == TourStep.WELCOME_INTRO_V2 || tourStep10 == TourStep.DEMO_MATCH_WON) {
                                        z12 = false;
                                        startRestartGroup.startReplaceGroup(-844868768);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-844753076);
                                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
                                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.main_app_bg, startRestartGroup, 6), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                                        z12 = false;
                                        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f4, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    function02 = function07;
                                    i14 = i12;
                                    tourStep3 = tourStep10;
                                    boxScopeInstance2 = boxScopeInstance;
                                    z7 = z12;
                                    str = "C72@3468L9:Box.kt#2w3rfo";
                                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                    composer3 = startRestartGroup;
                                    str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                    str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                    function17 = function116;
                                    function16 = function119;
                                    tourHighlightTarget = targetForStep;
                                    mutableState = mutableState4;
                                    modifier4 = modifier3;
                                    z6 = isOverlayVisible;
                                    f3 = 0.0f;
                                }
                                composer3.startReplaceGroup(1358247137);
                                tourStep4 = tourStep3;
                                if (tourStep4 != TourStep.WELCOME_INTRO_V2 || tourStep4 == TourStep.CHOOSE_FAVORITE_SPORTS || tourStep4 == TourStep.CHOOSE_ODDS_FORMAT || tourStep4 == TourStep.DEMO_MATCH || tourStep4 == TourStep.DEMO_BET_CONFIRM || tourStep4 == TourStep.DEMO_MATCH_SIMULATION || tourStep4 == TourStep.DEMO_MATCH_WON || HomeTourSteps.INSTANCE.isHomeV2HighlightStep(tourStep4) || tourStep4 == TourStep.CLICK_BOTTOM_SPORTS || tourStep4 == TourStep.CLICK_BOTTOM_MY_BETS || tourStep4 == TourStep.CLICK_BOTTOM_SHOP || tourStep4 == TourStep.CLICK_BOTTOM_MENU) {
                                    mutableState2 = mutableState;
                                    i15 = 5004770;
                                    i16 = 6;
                                } else {
                                    i16 = 6;
                                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, composer3, 6);
                                    String stringResource = StringResources_androidKt.stringResource(R.string.cd_close_tour, composer3, 6);
                                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(16)), Dp.m7774constructorimpl(36));
                                    i15 = 5004770;
                                    composer3.startReplaceGroup(5004770);
                                    Object rememberedValue10 = composer3.rememberedValue();
                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        mutableState2 = mutableState;
                                        rememberedValue10 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$76$lambda$29$lambda$28;
                                                TourOverlay$lambda$76$lambda$29$lambda$28 = TourOverlayKt.TourOverlay$lambda$76$lambda$29$lambda$28(MutableState.this);
                                                return TourOverlay$lambda$76$lambda$29$lambda$28;
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue10);
                                    } else {
                                        mutableState2 = mutableState;
                                    }
                                    composer3.endReplaceGroup();
                                    ImageKt.Image(painterResource, stringResource, ZIndexModifierKt.zIndex(ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue10, 7, null), 1001.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 0, 120);
                                }
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1358281559);
                                if ((!TourOverlay$lambda$1(mutableState2) || tourState.getRequestShowSkipDialog()) && z6) {
                                    composer3.startReplaceGroup(-1746271574);
                                    i17 = i14;
                                    int i22 = i17 & 14;
                                    i18 = 4;
                                    z8 = (i22 != 4 ? true : z7 ? 1 : 0) | ((i17 & 57344) != 16384 ? true : z7 ? 1 : 0);
                                    rememberedValue3 = composer3.rememberedValue();
                                    if (!z8 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        tourState2 = tourState;
                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda23
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$76$lambda$31$lambda$30;
                                                TourOverlay$lambda$76$lambda$31$lambda$30 = TourOverlayKt.TourOverlay$lambda$76$lambda$31$lambda$30(TourState.this, onSkip, mutableState2);
                                                return TourOverlay$lambda$76$lambda$31$lambda$30;
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue3);
                                    } else {
                                        tourState2 = tourState;
                                    }
                                    Function0 function09 = (Function0) rememberedValue3;
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(-1633490746);
                                    z9 = i22 != 4 ? true : z7 ? 1 : 0;
                                    rememberedValue4 = composer3.rememberedValue();
                                    if (!z9 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda24
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$76$lambda$33$lambda$32;
                                                TourOverlay$lambda$76$lambda$33$lambda$32 = TourOverlayKt.TourOverlay$lambda$76$lambda$33$lambda$32(TourState.this, mutableState2);
                                                return TourOverlay$lambda$76$lambda$33$lambda$32;
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue4);
                                    }
                                    Function0 function010 = (Function0) rememberedValue4;
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(-1633490746);
                                    z10 = i22 != 4 ? true : z7 ? 1 : 0;
                                    rememberedValue5 = composer3.rememberedValue();
                                    if (!z10 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda25
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$76$lambda$35$lambda$34;
                                                TourOverlay$lambda$76$lambda$35$lambda$34 = TourOverlayKt.TourOverlay$lambda$76$lambda$35$lambda$34(TourState.this, mutableState2);
                                                return TourOverlay$lambda$76$lambda$35$lambda$34;
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue5);
                                    }
                                    composer3.endReplaceGroup();
                                    TourSkipConfirmationDialog(function09, function010, (Function0) rememberedValue5, composer3, z7 ? 1 : 0);
                                } else {
                                    tourState2 = tourState;
                                    i17 = i14;
                                    i18 = 4;
                                }
                                composer3.endReplaceGroup();
                                switch (WhenMappings.$EnumSwitchMapping$0[tourStep4.ordinal()]) {
                                    case 1:
                                        boolean z39 = z7 ? 1 : 0;
                                        composer4 = composer3;
                                        function18 = function16;
                                        function19 = function17;
                                        composer4.startReplaceGroup(-826499873);
                                        String stringResource2 = StringResources_androidKt.stringResource(R.string.tour_click_sport_title, composer4, 6);
                                        String stringResource3 = StringResources_androidKt.stringResource(R.string.tour_click_sport_subtitle, composer4, 6);
                                        composer4.startReplaceGroup(i15);
                                        boolean z40 = (3670016 & i17) != 1048576 ? z39 : true;
                                        Object rememberedValue11 = composer4.rememberedValue();
                                        if (z40 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            function03 = function02;
                                            rememberedValue11 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda12
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit TourOverlay$lambda$76$lambda$70$lambda$69;
                                                    TourOverlay$lambda$76$lambda$70$lambda$69 = TourOverlayKt.TourOverlay$lambda$76$lambda$70$lambda$69(Function0.this);
                                                    return TourOverlay$lambda$76$lambda$70$lambda$69;
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue11);
                                        } else {
                                            function03 = function02;
                                        }
                                        composer4.endReplaceGroup();
                                        TourClickSportScreen(stringResource2, stringResource3, tourState, (Function0) rememberedValue11, null, composer4, (i17 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 16);
                                        composer4.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                        break;
                                    case 2:
                                        boolean z41 = z7 ? 1 : 0;
                                        composer4 = composer3;
                                        function18 = function16;
                                        function19 = function17;
                                        composer4.startReplaceGroup(-834914606);
                                        String stringResource4 = StringResources_androidKt.stringResource(R.string.tour_welcome_1_title, composer4, 6);
                                        String stringResource5 = StringResources_androidKt.stringResource(R.string.tour_welcome_1_subtitle, composer4, 6);
                                        TourCharacterPosition tourCharacterPosition = TourCharacterPosition.LEFT;
                                        composer4.startReplaceGroup(i15);
                                        boolean z42 = (i17 & 7168) != 2048 ? z41 : true;
                                        Object rememberedValue12 = composer4.rememberedValue();
                                        if (z42 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue12 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit TourOverlay$lambda$76$lambda$66$lambda$65;
                                                    TourOverlay$lambda$76$lambda$66$lambda$65 = TourOverlayKt.TourOverlay$lambda$76$lambda$66$lambda$65(Function0.this);
                                                    return TourOverlay$lambda$76$lambda$66$lambda$65;
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue12);
                                        }
                                        composer4.endReplaceGroup();
                                        TourWelcomeScreen(stringResource4, stringResource5, tourCharacterPosition, (Function0) rememberedValue12, true, null, composer4, 24960, 32);
                                        composer4.endReplaceGroup();
                                        Unit unit2 = Unit.INSTANCE;
                                        function03 = function02;
                                        break;
                                    case 3:
                                        boolean z43 = z7 ? 1 : 0;
                                        function18 = function16;
                                        function19 = function17;
                                        composer4 = composer3;
                                        composer4.startReplaceGroup(-834454287);
                                        String stringResource6 = StringResources_androidKt.stringResource(R.string.tour_welcome_2_title, composer4, 6);
                                        String stringResource7 = StringResources_androidKt.stringResource(R.string.tour_welcome_2_subtitle, composer4, 6);
                                        TourCharacterPosition tourCharacterPosition2 = TourCharacterPosition.RIGHT;
                                        composer4.startReplaceGroup(i15);
                                        boolean z44 = (i17 & 7168) != 2048 ? z43 : true;
                                        Object rememberedValue13 = composer4.rememberedValue();
                                        if (z44 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue13 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda10
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit TourOverlay$lambda$76$lambda$68$lambda$67;
                                                    TourOverlay$lambda$76$lambda$68$lambda$67 = TourOverlayKt.TourOverlay$lambda$76$lambda$68$lambda$67(Function0.this);
                                                    return TourOverlay$lambda$76$lambda$68$lambda$67;
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue13);
                                        }
                                        composer4.endReplaceGroup();
                                        TourWelcomeScreen(stringResource6, stringResource7, tourCharacterPosition2, (Function0) rememberedValue13, true, null, composer4, 24960, 32);
                                        composer4.endReplaceGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                        function03 = function02;
                                        break;
                                    case 4:
                                        int i23 = i18;
                                        function18 = function16;
                                        String str5 = str;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-841560913);
                                        float f5 = 0;
                                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f3, 1, null), Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f5));
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str3);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str2);
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str5);
                                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                        OddType oddType = userService.getOddType();
                                        double tourCoefficientWin1 = tourState.getTourCoefficientWin1();
                                        double tourCoefficientDraw = tourState.getTourCoefficientDraw();
                                        double tourCoefficientWin2 = tourState.getTourCoefficientWin2();
                                        float m7774constructorimpl = Dp.m7774constructorimpl(16);
                                        float f6 = 8;
                                        float m7774constructorimpl2 = Dp.m7774constructorimpl(f6);
                                        float m7774constructorimpl3 = Dp.m7774constructorimpl(f6);
                                        composer3.startReplaceGroup(-1746271574);
                                        int i24 = i17 & 14;
                                        boolean changedInstance = ((i17 & 7168) == 2048) | composer3.changedInstance(userService) | (i24 == i23);
                                        Object rememberedValue14 = composer3.rememberedValue();
                                        if (changedInstance || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                            tourState3 = tourState;
                                            function04 = onStepComplete;
                                            Function1 function121 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    Unit TourOverlay$lambda$76$lambda$40$lambda$37$lambda$36;
                                                    TourOverlay$lambda$76$lambda$40$lambda$37$lambda$36 = TourOverlayKt.TourOverlay$lambda$76$lambda$40$lambda$37$lambda$36(UserService.this, tourState3, function04, (OddType) obj9);
                                                    return TourOverlay$lambda$76$lambda$40$lambda$37$lambda$36;
                                                }
                                            };
                                            composer3.updateRememberedValue(function121);
                                            obj3 = function121;
                                        } else {
                                            tourState3 = tourState;
                                            function04 = onStepComplete;
                                            obj3 = rememberedValue14;
                                        }
                                        Function1 function122 = (Function1) obj3;
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(i15);
                                        boolean z45 = i24 == i23;
                                        Object rememberedValue15 = composer3.rememberedValue();
                                        if (!z45) {
                                            obj4 = rememberedValue15;
                                            break;
                                        }
                                        Function0 function011 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$76$lambda$40$lambda$39$lambda$38;
                                                TourOverlay$lambda$76$lambda$40$lambda$39$lambda$38 = TourOverlayKt.TourOverlay$lambda$76$lambda$40$lambda$39$lambda$38(TourState.this);
                                                return TourOverlay$lambda$76$lambda$40$lambda$39$lambda$38;
                                            }
                                        };
                                        composer3.updateRememberedValue(function011);
                                        obj4 = function011;
                                        composer3.endReplaceGroup();
                                        composer5 = composer3;
                                        OddsDialogScreenKt.m13316OddsDialogScreeng3amZ_k(oddType, false, function122, (Function0) obj4, null, false, tourCoefficientWin1, tourCoefficientDraw, tourCoefficientWin2, m7774constructorimpl, m7774constructorimpl2, m7774constructorimpl3, true, composer5, 805503024, 438, 16);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endReplaceGroup();
                                        Unit unit4 = Unit.INSTANCE;
                                        function03 = function02;
                                        composer4 = composer5;
                                        break;
                                    case 5:
                                        int i25 = i18;
                                        function18 = function16;
                                        String str6 = str;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-840035465);
                                        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f3, 1, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(32));
                                        Alignment center2 = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str3);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str2);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN42);
                                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor4);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str6);
                                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                                        OddType oddType2 = userService.getOddType();
                                        Intrinsics.checkNotNullExpressionValue(oddType2, "getOddType(...)");
                                        String tourSelectedDemoBet = tourState.getTourSelectedDemoBet();
                                        double tourCoefficientWin12 = tourState.getTourCoefficientWin1();
                                        double tourCoefficientDraw2 = tourState.getTourCoefficientDraw();
                                        double tourCoefficientWin22 = tourState.getTourCoefficientWin2();
                                        composer3.startReplaceGroup(i15);
                                        int i26 = i17 & 14;
                                        boolean z46 = i26 == i25;
                                        Object rememberedValue16 = composer3.rememberedValue();
                                        if (z46 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                            tourState4 = tourState;
                                            Function1 function123 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    Unit TourOverlay$lambda$76$lambda$45$lambda$42$lambda$41;
                                                    TourOverlay$lambda$76$lambda$45$lambda$42$lambda$41 = TourOverlayKt.TourOverlay$lambda$76$lambda$45$lambda$42$lambda$41(TourState.this, (String) obj9);
                                                    return TourOverlay$lambda$76$lambda$45$lambda$42$lambda$41;
                                                }
                                            };
                                            composer3.updateRememberedValue(function123);
                                            obj5 = function123;
                                        } else {
                                            tourState4 = tourState;
                                            obj5 = rememberedValue16;
                                        }
                                        Function1 function124 = (Function1) obj5;
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(i15);
                                        boolean z47 = i26 == i25;
                                        Object rememberedValue17 = composer3.rememberedValue();
                                        if (!z47) {
                                            obj6 = rememberedValue17;
                                            break;
                                        }
                                        Function0 function012 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TourOverlay$lambda$76$lambda$45$lambda$44$lambda$43;
                                                TourOverlay$lambda$76$lambda$45$lambda$44$lambda$43 = TourOverlayKt.TourOverlay$lambda$76$lambda$45$lambda$44$lambda$43(TourState.this);
                                                return TourOverlay$lambda$76$lambda$45$lambda$44$lambda$43;
                                            }
                                        };
                                        composer3.updateRememberedValue(function012);
                                        obj6 = function012;
                                        composer3.endReplaceGroup();
                                        composer5 = composer3;
                                        TourDemoMatchScreenKt.TourDemoMatchScreen(oddType2, tourSelectedDemoBet, tourCoefficientWin12, tourCoefficientDraw2, tourCoefficientWin22, function124, 4, 8, (Function0) obj6, onStepComplete, null, composer5, ((i17 << 18) & 1879048192) | 14155776, 0, 1024);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endReplaceGroup();
                                        Unit unit5 = Unit.INSTANCE;
                                        function03 = function02;
                                        composer4 = composer5;
                                        break;
                                    case 6:
                                        function18 = function16;
                                        String str7 = str;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-839039125);
                                        Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f3, 1, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(32));
                                        Alignment center3 = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str3);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str2);
                                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN43);
                                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor5);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str7);
                                        BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                                        OddType oddType3 = userService.getOddType();
                                        Intrinsics.checkNotNullExpressionValue(oddType3, "getOddType(...)");
                                        TourDemoBetConfirmScreenKt.TourDemoBetConfirmScreen(oddType3, tourState.getTourSelectedDemoBet(), tourState.getTourDemoStakeBetcoins(), tourState.getTourCoefficientWin1(), tourState.getTourCoefficientDraw(), tourState.getTourCoefficientWin2(), onStepComplete, null, composer3, (i17 << 9) & 3670016, 128);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceGroup();
                                        Unit unit6 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 7:
                                        function18 = function16;
                                        String str8 = str;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-838179526);
                                        Modifier m1517paddingVpY3zN44 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f3, 1, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(32));
                                        Alignment center4 = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str3);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str2);
                                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN44);
                                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor6);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str8);
                                        BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                                        String tourSelectedDemoBet2 = tourState.getTourSelectedDemoBet();
                                        OddType oddType4 = userService.getOddType();
                                        Intrinsics.checkNotNullExpressionValue(oddType4, "getOddType(...)");
                                        TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen(tourSelectedDemoBet2, oddType4, tourState.getTourDemoStakeBetcoins(), tourState.getTourCoefficientWin1(), tourState.getTourCoefficientDraw(), tourState.getTourCoefficientWin2(), onStepComplete, null, composer3, (i17 << 9) & 3670016, 128);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceGroup();
                                        Unit unit7 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 8:
                                        function18 = function16;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-841907276);
                                        TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen(tourFavoriteSportsController, 2, 8, onStepComplete, null, composer3, ((i17 >> 3) & 14) | 432 | (i17 & 7168), 16);
                                        composer3.endReplaceGroup();
                                        Unit unit8 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 9:
                                        function18 = function16;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-842261048);
                                        TourIntroV2FirstPage(tourState.getTourSkipRewardBetcoins(), tourState.getTourCompleteBonusBetcoins(), onSkip, onStepComplete, composer3, ((i17 >> 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i17 & 7168));
                                        composer3.endReplaceGroup();
                                        Unit unit9 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 10:
                                        Function1<? super Long, Unit> function125 = function16;
                                        function19 = function17;
                                        composer3.startReplaceGroup(-837262267);
                                        composer3.startReplaceGroup(1849434622);
                                        Object rememberedValue18 = composer3.rememberedValue();
                                        if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                            i19 = 2;
                                            rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f3), null, 2, null);
                                            composer3.updateRememberedValue(rememberedValue18);
                                        } else {
                                            i19 = 2;
                                        }
                                        final MutableState mutableState5 = (MutableState) rememberedValue18;
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(1849434622);
                                        Object rememberedValue19 = composer3.rememberedValue();
                                        if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f3), null, i19, null);
                                            composer3.updateRememberedValue(rememberedValue19);
                                        }
                                        MutableState mutableState6 = (MutableState) rememberedValue19;
                                        composer3.endReplaceGroup();
                                        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localView);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        final View view = (View) consume2;
                                        Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f3, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                        String str9 = str3;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str9);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z7);
                                        String str10 = str2;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str10);
                                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, z7 ? 1 : 0);
                                        CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, m1025backgroundbw27NRU$default);
                                        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                        String str11 = str4;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str11);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor7);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                        String str12 = str;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str12);
                                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                                        Modifier m1517paddingVpY3zN45 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(32));
                                        Alignment center5 = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str9);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str10);
                                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN45);
                                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str11);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor8);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str12);
                                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                        composer3.startReplaceGroup(-1633490746);
                                        boolean changedInstance2 = composer3.changedInstance(view);
                                        Object rememberedValue20 = composer3.rememberedValue();
                                        if (changedInstance2 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue20 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    Unit TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55;
                                                    TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55 = TourOverlayKt.TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55(view, mutableState5, (LayoutCoordinates) obj9);
                                                    return TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55;
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue20);
                                        }
                                        composer3.endReplaceGroup();
                                        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion7, (Function1) rememberedValue20);
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str9);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str10);
                                        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer3, onGloballyPositioned);
                                        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str11);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer3);
                                        Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                            m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                            m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, str12);
                                        BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                                        function18 = function125;
                                        TourDemoMatchWonScreenKt.TourDemoMatchWonScreen(tourState.getTourSelectedDemoBet(), tourState.getTourDemoStakeBetcoins(), tourState.getTourCoefficientWin1(), tourState.getTourCoefficientDraw(), tourState.getTourCoefficientWin2(), onStepComplete, null, composer3, (i17 << 6) & 458752, 64);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.lights_battle_preview, composer3, 6);
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, 1.0f), 0.0f, 1, null);
                                        composer3.startReplaceGroup(-1633490746);
                                        boolean changedInstance3 = composer3.changedInstance(view);
                                        Object rememberedValue21 = composer3.rememberedValue();
                                        if (changedInstance3 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            mutableState3 = mutableState6;
                                            rememberedValue21 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    Unit TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60;
                                                    TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60 = TourOverlayKt.TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60(view, mutableState3, (LayoutCoordinates) obj9);
                                                    return TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60;
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue21);
                                        } else {
                                            mutableState3 = mutableState6;
                                        }
                                        composer3.endReplaceGroup();
                                        Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(fillMaxWidth$default, (Function1) rememberedValue21);
                                        composer3.startReplaceGroup(-1633490746);
                                        Object rememberedValue22 = composer3.rememberedValue();
                                        if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue22 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda8
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    IntOffset TourOverlay$lambda$76$lambda$64$lambda$63$lambda$62;
                                                    TourOverlay$lambda$76$lambda$64$lambda$63$lambda$62 = TourOverlayKt.TourOverlay$lambda$76$lambda$64$lambda$63$lambda$62(MutableState.this, mutableState3, (Density) obj9);
                                                    return TourOverlay$lambda$76$lambda$64$lambda$63$lambda$62;
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue22);
                                        }
                                        composer3.endReplaceGroup();
                                        ImageKt.Image(painterResource2, (String) null, OffsetKt.offset(onGloballyPositioned2, (Function1) rememberedValue22), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceGroup();
                                        Unit unit10 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 11:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-833984451);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_home_win_rate_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_home_win_rate_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit11 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 12:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-833553737);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_home_global_rank_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_home_global_rank_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit12 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 13:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-833117257);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_home_best_streak_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_home_best_streak_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit13 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 14:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-832683939);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_special_offer_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_special_offer_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit14 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 15:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-832257441);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_video_reward_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_video_reward_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit15 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 16:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-831832865);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_daily_quests_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_daily_quests_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit16 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 17:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-831413559);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_battles_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_battles_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit17 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 18:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-830998593);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_competitions_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_competitions_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit18 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 19:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-830576125);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_live_arena_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_live_arena_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit19 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 20:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-830156447);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_top_matches_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_top_matches_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit20 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 21:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-829736955);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_minigames_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_minigames_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit21 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 22:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-829323415);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_ranking_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_ranking_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit22 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 23:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-828911611);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_flash_bet_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_flash_bet_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit23 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 24:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-828499125);
                                        TourHomeHighlightScreen(StringResources_androidKt.stringResource(R.string.tour_click_tv_bet_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_tv_bet_subtitle, composer3, i16), tourHighlightTarget, tourStep4, onStepComplete, null, composer3, (i17 << 3) & 57344, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit24 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 25:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-828085895);
                                        TourClickBottomNavButtonScreen(StringResources_androidKt.stringResource(R.string.tour_click_bottom_sports_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_bottom_sports_subtitle, composer3, i16), tourState.getBottomTabBounds(), onStepComplete, null, composer3, i17 & 7168, 16);
                                        composer3.endReplaceGroup();
                                        Unit unit25 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 26:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-827685065);
                                        TourClickBottomNavButtonScreen(StringResources_androidKt.stringResource(R.string.tour_click_bottom_my_bets_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_bottom_my_bets_subtitle, composer3, i16), tourState.getBottomTabBounds(), onStepComplete, null, composer3, i17 & 7168, 16);
                                        composer3.endReplaceGroup();
                                        Unit unit26 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 27:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-827285475);
                                        TourClickBottomNavButtonScreen(StringResources_androidKt.stringResource(R.string.tour_click_bottom_shop_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_bottom_shop_subtitle, composer3, i16), tourState.getBottomTabBounds(), onStepComplete, null, composer3, i17 & 7168, 16);
                                        composer3.endReplaceGroup();
                                        Unit unit27 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 28:
                                        function110 = function16;
                                        function111 = function17;
                                        composer3.startReplaceGroup(-826891651);
                                        TourClickBottomNavButtonScreen(StringResources_androidKt.stringResource(R.string.tour_click_bottom_menu_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_click_bottom_menu_subtitle, composer3, i16), tourState.getBottomTabBounds(), onStepComplete, null, composer3, i17 & 7168, 16);
                                        composer3.endReplaceGroup();
                                        Unit unit28 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 29:
                                        final TourState tourState5 = tourState2;
                                        function110 = function16;
                                        composer3.startReplaceGroup(-825976314);
                                        String stringResource8 = StringResources_androidKt.stringResource(R.string.tour_select_sport_title, composer3, i16);
                                        String stringResource9 = StringResources_androidKt.stringResource(R.string.tour_select_sport_subtitle, composer3, i16);
                                        composer3.startReplaceGroup(-1633490746);
                                        char c = (i17 & 14) == i18 ? (char) 1 : z7 ? 1 : 0;
                                        boolean z48 = z7;
                                        if ((29360128 & i17) == 8388608) {
                                            z48 = 1;
                                        }
                                        int i27 = c | z48;
                                        Object rememberedValue23 = composer3.rememberedValue();
                                        if (i27 != 0 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                            function111 = function17;
                                            Function0 function013 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda14
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit TourOverlay$lambda$76$lambda$72$lambda$71;
                                                    TourOverlay$lambda$76$lambda$72$lambda$71 = TourOverlayKt.TourOverlay$lambda$76$lambda$72$lambda$71(TourState.this, function111);
                                                    return TourOverlay$lambda$76$lambda$72$lambda$71;
                                                }
                                            };
                                            composer3.updateRememberedValue(function013);
                                            obj7 = function013;
                                        } else {
                                            function111 = function17;
                                            obj7 = rememberedValue23;
                                        }
                                        composer3.endReplaceGroup();
                                        TourSelectSportScreen(stringResource8, stringResource9, tourState, (Function0) obj7, null, composer3, (i17 << i16) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 16);
                                        composer3.endReplaceGroup();
                                        Unit unit29 = Unit.INSTANCE;
                                        function18 = function110;
                                        function19 = function111;
                                        composer4 = composer3;
                                        function03 = function02;
                                        break;
                                    case 30:
                                        final TourState tourState6 = tourState2;
                                        composer3.startReplaceGroup(-825150598);
                                        String stringResource10 = StringResources_androidKt.stringResource(R.string.tour_select_league_title, composer3, i16);
                                        String stringResource11 = StringResources_androidKt.stringResource(R.string.tour_select_league_subtitle, composer3, i16);
                                        composer3.startReplaceGroup(-1633490746);
                                        char c2 = (i17 & 14) == i18 ? (char) 1 : z7 ? 1 : 0;
                                        boolean z49 = z7;
                                        if ((234881024 & i17) == 67108864) {
                                            z49 = 1;
                                        }
                                        int i28 = c2 | z49;
                                        Object rememberedValue24 = composer3.rememberedValue();
                                        if (i28 != 0 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                            function112 = function16;
                                            Function0 function014 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda15
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit TourOverlay$lambda$76$lambda$74$lambda$73;
                                                    TourOverlay$lambda$76$lambda$74$lambda$73 = TourOverlayKt.TourOverlay$lambda$76$lambda$74$lambda$73(TourState.this, function112);
                                                    return TourOverlay$lambda$76$lambda$74$lambda$73;
                                                }
                                            };
                                            composer3.updateRememberedValue(function014);
                                            obj8 = function014;
                                        } else {
                                            function112 = function16;
                                            obj8 = rememberedValue24;
                                        }
                                        composer3.endReplaceGroup();
                                        TourSelectLeagueScreen(stringResource10, stringResource11, tourState, (Function0) obj8, null, composer3, (i17 << i16) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 16);
                                        composer3.endReplaceGroup();
                                        Unit unit30 = Unit.INSTANCE;
                                        function18 = function112;
                                        composer4 = composer3;
                                        function03 = function02;
                                        function19 = function17;
                                        break;
                                    case 31:
                                        composer3.startReplaceGroup(-824328943);
                                        TourSelectMatchScreen(StringResources_androidKt.stringResource(R.string.tour_select_match_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_select_match_subtitle, composer3, i16), tourState, function15, null, composer3, ((i17 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i17 >> 18) & 7168), 16);
                                        composer3.endReplaceGroup();
                                        Unit unit31 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        function18 = function16;
                                        function19 = function17;
                                        break;
                                    case 32:
                                        composer3.startReplaceGroup(-823963174);
                                        composer3.endReplaceGroup();
                                        Integer.valueOf(Log.d("TourFlow", "TourOverlay - SELECT_BET step - no overlay, user can select bet directly"));
                                        composer4 = composer3;
                                        function03 = function02;
                                        function18 = function16;
                                        function19 = function17;
                                        break;
                                    case 33:
                                        composer3.startReplaceGroup(-823633613);
                                        TourInstructionScreen(StringResources_androidKt.stringResource(R.string.tour_place_bet_amount_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_place_bet_amount_subtitle, composer3, i16), TourCharacterPosition.BOTTOM_CENTER, true, TourCharacterPosition.CENTER, null, composer3, 28032, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit32 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        function18 = function16;
                                        function19 = function17;
                                        break;
                                    case 34:
                                        composer3.startReplaceGroup(-823165358);
                                        Unit unit33 = Unit.INSTANCE;
                                        composer3.startReplaceGroup(i15);
                                        boolean z50 = (i17 & 14) == i18 ? true : z7 ? 1 : 0;
                                        TourOverlayKt$TourOverlay$5$18$1 rememberedValue25 = composer3.rememberedValue();
                                        if (z50 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue25 = new TourOverlayKt$TourOverlay$5$18$1(tourState2, null);
                                            composer3.updateRememberedValue(rememberedValue25);
                                        }
                                        composer3.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(unit33, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, composer3, i16);
                                        TourWelcomeScreen(StringResources_androidKt.stringResource(R.string.tour_bet_placed_title, composer3, i16), StringResources_androidKt.stringResource(R.string.tour_bet_placed_subtitle, composer3, i16), TourCharacterPosition.BOTTOM_CENTER, onStepComplete, tourState.getCanProceed(), null, composer3, (i17 & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK, 32);
                                        composer3.endReplaceGroup();
                                        Unit unit34 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        function18 = function16;
                                        function19 = function17;
                                        break;
                                    case 35:
                                        composer3.startReplaceGroup(-822470059);
                                        composer3.endReplaceGroup();
                                        Unit unit35 = Unit.INSTANCE;
                                        composer4 = composer3;
                                        function03 = function02;
                                        function18 = function16;
                                        function19 = function17;
                                        break;
                                    default:
                                        composer4 = composer3;
                                        function03 = function02;
                                        function18 = function16;
                                        function19 = function17;
                                        composer4.startReplaceGroup(-822378020);
                                        composer4.endReplaceGroup();
                                        Unit unit36 = Unit.INSTANCE;
                                        break;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function05 = function03;
                                function113 = function19;
                                function114 = function18;
                                z11 = z13;
                            } else {
                                startRestartGroup.startReplaceGroup(201768804);
                                startRestartGroup.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            }
                            m1059clickableXHw0xAI$default = companion;
                            i12 = i21;
                            Modifier then22 = zIndex.then(m1059clickableXHw0xAI$default);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            modifier3 = modifier2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap10 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                            Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                            final boolean z302 = z25;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy10, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash10);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (!z28) {
                            }
                            tourStep2 = tourStep;
                            startRestartGroup.startReplaceGroup(-859901753);
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume3;
                            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(1357741579);
                            if (!z4) {
                            }
                            startRestartGroup.endReplaceGroup();
                            then = fillMaxSize$default3.then(companion2);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            final boolean z312 = z3;
                            final boolean z322 = z4;
                            final boolean z332 = z2;
                            i13 = i12;
                            changed = startRestartGroup.changed(tourStep2.ordinal()) | ((i12 & 14) != 4) | startRestartGroup.changedInstance(targetForStep) | startRestartGroup.changed(z312) | startRestartGroup.changed(z23) | startRestartGroup.changed(z24) | startRestartGroup.changed(z302) | startRestartGroup.changed(density2) | startRestartGroup.changed(f4) | startRestartGroup.changed(z322) | startRestartGroup.changed(z18) | startRestartGroup.changed(z19) | startRestartGroup.changed(z20) | startRestartGroup.changed(z22) | startRestartGroup.changed(z332) | startRestartGroup.changed(z21);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            i14 = i13;
                            tourHighlightTarget = targetForStep;
                            function02 = function07;
                            mutableState = mutableState4;
                            final boolean z342 = z24;
                            boxScopeInstance2 = boxScopeInstance;
                            tourStep3 = tourStep2;
                            final boolean z352 = z23;
                            function16 = function119;
                            str = "C72@3468L9:Box.kt#2w3rfo";
                            z6 = isOverlayVisible;
                            function17 = function116;
                            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            modifier4 = modifier3;
                            final boolean z362 = z18;
                            str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                            modifier5 = then;
                            f3 = 0.0f;
                            str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            final boolean z372 = z20;
                            final boolean z382 = z22;
                            Function1 function1202 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj9) {
                                    Unit TourOverlay$lambda$76$lambda$26$lambda$25;
                                    TourOverlay$lambda$76$lambda$26$lambda$25 = TourOverlayKt.TourOverlay$lambda$76$lambda$26$lambda$25(TourHighlightTarget.this, z312, tourState, z352, z342, z302, density2, f4, z322, z362, z19, z372, z382, z332, tourStep3, z21, (DrawScope) obj9);
                                    return TourOverlay$lambda$76$lambda$26$lambda$25;
                                }
                            };
                            Composer composer62 = startRestartGroup;
                            composer62.updateRememberedValue(function1202);
                            rememberedValue2 = function1202;
                            composer2 = composer62;
                            composer2.endReplaceGroup();
                            z7 = false;
                            BoxKt.Box(DrawModifierKt.drawBehind(modifier5, (Function1) rememberedValue2), composer2, 0);
                            composer2.endReplaceGroup();
                            composer3 = composer2;
                            composer3.startReplaceGroup(1358247137);
                            tourStep4 = tourStep3;
                            if (tourStep4 != TourStep.WELCOME_INTRO_V2) {
                            }
                            mutableState2 = mutableState;
                            i15 = 5004770;
                            i16 = 6;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1358281559);
                            if (TourOverlay$lambda$1(mutableState2)) {
                            }
                            composer3.startReplaceGroup(-1746271574);
                            i17 = i14;
                            int i222 = i17 & 14;
                            i18 = 4;
                            z8 = (i222 != 4 ? true : z7 ? 1 : 0) | ((i17 & 57344) != 16384 ? true : z7 ? 1 : 0);
                            rememberedValue3 = composer3.rememberedValue();
                            if (z8) {
                            }
                            tourState2 = tourState;
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourOverlay$lambda$76$lambda$31$lambda$30;
                                    TourOverlay$lambda$76$lambda$31$lambda$30 = TourOverlayKt.TourOverlay$lambda$76$lambda$31$lambda$30(TourState.this, onSkip, mutableState2);
                                    return TourOverlay$lambda$76$lambda$31$lambda$30;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                            Function0 function092 = (Function0) rememberedValue3;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1633490746);
                            if (i222 != 4) {
                            }
                            rememberedValue4 = composer3.rememberedValue();
                            if (!z9) {
                            }
                            rememberedValue4 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda24
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourOverlay$lambda$76$lambda$33$lambda$32;
                                    TourOverlay$lambda$76$lambda$33$lambda$32 = TourOverlayKt.TourOverlay$lambda$76$lambda$33$lambda$32(TourState.this, mutableState2);
                                    return TourOverlay$lambda$76$lambda$33$lambda$32;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                            Function0 function0102 = (Function0) rememberedValue4;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1633490746);
                            if (i222 != 4) {
                            }
                            rememberedValue5 = composer3.rememberedValue();
                            if (!z10) {
                            }
                            rememberedValue5 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourOverlay$lambda$76$lambda$35$lambda$34;
                                    TourOverlay$lambda$76$lambda$35$lambda$34 = TourOverlayKt.TourOverlay$lambda$76$lambda$35$lambda$34(TourState.this, mutableState2);
                                    return TourOverlay$lambda$76$lambda$35$lambda$34;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                            composer3.endReplaceGroup();
                            TourSkipConfirmationDialog(function092, function0102, (Function0) rememberedValue5, composer3, z7 ? 1 : 0);
                            composer3.endReplaceGroup();
                            switch (WhenMappings.$EnumSwitchMapping$0[tourStep4.ordinal()]) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function05 = function03;
                            function113 = function19;
                            function114 = function18;
                            z11 = z13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z11 = z;
                            function05 = function0;
                            function114 = function12;
                            function15 = function13;
                            modifier4 = modifier;
                            composer4 = startRestartGroup;
                            function113 = function1;
                        }
                        ScopeUpdateScope endRestartGroup2 = composer4.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            final Function1<? super Long, Unit> function126 = function15;
                            final Modifier modifier7 = modifier4;
                            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj9, Object obj10) {
                                    Unit TourOverlay$lambda$77;
                                    TourOverlay$lambda$77 = TourOverlayKt.TourOverlay$lambda$77(TourState.this, tourFavoriteSportsController, userService, onStepComplete, onSkip, z11, function05, function113, function114, function126, modifier7, i, i2, i3, (Composer) obj9, ((Integer) obj10).intValue());
                                    return TourOverlay$lambda$77;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
                }
                i9 = i10;
                if ((i4 & 306717843) == 306717842) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i20 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                isOverlayVisible = tourState.isOverlayVisible();
                currentStep = tourState.getCurrentStep();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                final Function0 function072 = function06;
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState42 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                final Function1 function1162 = function115;
                Log.d("TourOverlay", "TourOverlay composable - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep + ", showSkipDialog: " + TourOverlay$lambda$1(mutableState42));
                if (isOverlayVisible) {
                }
                final Function1 function1172 = function14;
                final Modifier modifier62 = modifier2;
                Log.d("TourOverlay", "TourOverlay not showing - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep);
                if (ComposerKt.isTraceInProgress()) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i9 = i10;
            if ((i4 & 306717843) == 306717842) {
            }
            if ((i3 & 32) == 0) {
            }
            if (i20 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            isOverlayVisible = tourState.isOverlayVisible();
            currentStep = tourState.getCurrentStep();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            final Function0 function0722 = function06;
            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState422 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            final Function1 function11622 = function115;
            Log.d("TourOverlay", "TourOverlay composable - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep + ", showSkipDialog: " + TourOverlay$lambda$1(mutableState422));
            if (isOverlayVisible) {
            }
            final Function1 function11722 = function14;
            final Modifier modifier622 = modifier2;
            Log.d("TourOverlay", "TourOverlay not showing - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i9 = i10;
        if ((i4 & 306717843) == 306717842) {
        }
        if ((i3 & 32) == 0) {
        }
        if (i20 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        isOverlayVisible = tourState.isOverlayVisible();
        currentStep = tourState.getCurrentStep();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        final Function0 function07222 = function06;
        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState4222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        final Function1 function116222 = function115;
        Log.d("TourOverlay", "TourOverlay composable - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep + ", showSkipDialog: " + TourOverlay$lambda$1(mutableState4222));
        if (isOverlayVisible) {
        }
        final Function1 function117222 = function14;
        final Modifier modifier6222 = modifier2;
        Log.d("TourOverlay", "TourOverlay not showing - isOverlayVisible: " + isOverlayVisible + ", currentStep: " + currentStep);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean TourOverlay$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TourOverlay$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$7$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$11$lambda$10(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.mo5359setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m5259getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$26$lambda$25(TourHighlightTarget tourHighlightTarget, boolean z, TourState tourState, boolean z2, boolean z3, boolean z4, Density density, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, TourStep tourStep, boolean z11, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Rect rect = null;
        if ((tourHighlightTarget != null ? tourHighlightTarget.getRect() : null) != null) {
            rect = tourHighlightTarget.getRect();
        } else if (z) {
            rect = tourState.getSportsButtonBounds();
        } else if (z2) {
            rect = tourState.getSportItemBounds();
        } else if (z3) {
            rect = tourState.getLeagueItemBounds();
        } else if (z4) {
            rect = tourState.getMatchItemBounds();
        }
        Log.d("TourFlow", "TourOverlay drawBehind - bounds: " + rect + ", size: width=" + Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) + ", height=" + Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) + ", isSelectMatchStep: " + z4);
        if (z4) {
            float mo1167toPx0680j_4 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(180));
            float mo1167toPx0680j_42 = mo1167toPx0680j_4 + density.mo1167toPx0680j_4(Dp.m7774constructorimpl(150));
            Log.d("TourFlow", "TourOverlay drawBehind - Manual match item hole: top=" + mo1167toPx0680j_4 + ", bottom=" + mo1167toPx0680j_42 + ", width=" + Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)));
            DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(mo1167toPx0680j_4) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            if (mo1167toPx0680j_42 < Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L))) {
                DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo1167toPx0680j_42) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) - mo1167toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32)), 0.0f, null, null, 0, 120, null);
            }
        } else if (rect != null) {
            float f2 = rect.left;
            float f3 = rect.right;
            float f4 = rect.top;
            float f5 = rect.bottom;
            if (z5 && tourHighlightTarget != null) {
                TourHighlightDrawKt.drawDimWithRoundedHole(drawBehind, f2, f4, f3, f5, TourHighlightDrawKt.cornerRadiusPx(density, tourHighlightTarget.getCornerRadiusDp()), f);
            } else if (z6 || z7 || z8 || z9) {
                TourHighlightDrawKt.drawDimWithRectHole(drawBehind, f2, f4, f3, f5, f);
            } else {
                TourHighlightDrawKt.drawDimWithRectHole(drawBehind, f2, f4, f3, f5, f);
            }
        } else if (!z) {
            if (!z10 && HomeTourHighlight.INSTANCE.quickPlayColumnIndex(tourStep) != null) {
                float mo1167toPx0680j_43 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(16));
                float mo1167toPx0680j_44 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(8));
                Integer quickPlayColumnIndex = HomeTourHighlight.INSTANCE.quickPlayColumnIndex(tourStep);
                Intrinsics.checkNotNull(quickPlayColumnIndex);
                TourHighlightDrawKt.drawFallbackHomeTileHole(drawBehind, quickPlayColumnIndex.intValue(), 3, 0.42f, TourHighlightDrawKt.cornerRadiusPx(density, 10.0f), f, mo1167toPx0680j_43, mo1167toPx0680j_44, 0.8f);
            } else if (!z10 && HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep) != null) {
                float mo1167toPx0680j_45 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(16));
                float mo1167toPx0680j_46 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(8));
                Integer gameModesColumnIndex = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep);
                Intrinsics.checkNotNull(gameModesColumnIndex);
                TourHighlightDrawKt.drawFallbackHomeTileHole(drawBehind, gameModesColumnIndex.intValue(), 3, 0.58f, TourHighlightDrawKt.cornerRadiusPx(density, 10.0f), f, mo1167toPx0680j_45, mo1167toPx0680j_46, 0.8f);
            } else if (z10) {
                TourHighlightDrawKt.drawDimOverlay(drawBehind, f);
            } else if (z11) {
                float mo1167toPx0680j_47 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(16));
                float mo1167toPx0680j_48 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(36));
                float mo1167toPx0680j_49 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(100));
                float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) * 0.36f;
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) - mo1167toPx0680j_47) - mo1167toPx0680j_49;
                TourHighlightDrawKt.drawDimWithRoundedHole(drawBehind, intBitsToFloat2, intBitsToFloat, mo1167toPx0680j_49 + intBitsToFloat2, mo1167toPx0680j_48 + intBitsToFloat, TourHighlightDrawKt.cornerRadiusPx(density, 6.0f), f);
            } else if (z6 || z7 || z8 || z9) {
                float intBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) / 5.0f;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) - density.mo1167toPx0680j_4(Dp.m7774constructorimpl(56));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L));
                float f6 = (z6 ? 1 : z7 ? 2 : z8 ? 3 : 4) * intBitsToFloat3;
                float f7 = f6 + intBitsToFloat3;
                if (intBitsToFloat4 > 0.0f) {
                    DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                }
                if (f6 > 0.0f) {
                    DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(r18) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                }
                if (f7 < Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) {
                    DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) - f7) << 32) | (Float.floatToRawIntBits(r18) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                }
                DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) - intBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32)), 0.0f, null, null, 0, 120, null);
            } else if (z4) {
                float mo1167toPx0680j_410 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(180));
                float mo1167toPx0680j_411 = mo1167toPx0680j_410 + density.mo1167toPx0680j_4(Dp.m7774constructorimpl(150));
                Log.d("TourFlow", "TourOverlay drawBehind - Manual match item hole: top=" + mo1167toPx0680j_410 + ", bottom=" + mo1167toPx0680j_411 + ", width=" + (Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) - 0.0f));
                DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(mo1167toPx0680j_410) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                if (mo1167toPx0680j_411 < Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L))) {
                    DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo1167toPx0680j_411) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) - mo1167toPx0680j_411) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32)), 0.0f, null, null, 0, 120, null);
                }
            } else {
                DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32)), 0.0f, null, null, 0, 120, null);
            }
        } else {
            float intBitsToFloat6 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) * 0.2f;
            float f8 = intBitsToFloat6 + intBitsToFloat6;
            float intBitsToFloat7 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) - density.mo1167toPx0680j_4(Dp.m7774constructorimpl(70));
            Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L));
            DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat6) << 32) | (Float.floatToRawIntBits(r19) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            DrawScope.m5724drawRectnJ9OG0$default(drawBehind, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) - f8) << 32) | (Float.floatToRawIntBits(r19) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$29$lambda$28(MutableState mutableState) {
        TourOverlay$lambda$2(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$31$lambda$30(TourState tourState, Function0 function0, MutableState mutableState) {
        TourOverlay$lambda$2(mutableState, false);
        tourState.setRequestShowSkipDialog(false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$33$lambda$32(TourState tourState, MutableState mutableState) {
        TourOverlay$lambda$2(mutableState, false);
        tourState.setRequestShowSkipDialog(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$35$lambda$34(TourState tourState, MutableState mutableState) {
        TourOverlay$lambda$2(mutableState, false);
        tourState.setRequestShowSkipDialog(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$40$lambda$37$lambda$36(UserService userService, TourState tourState, Function0 function0, OddType oddType) {
        if (oddType == null) {
            oddType = userService.getOddType();
        }
        tourState.setTourSelectedOddType(oddType);
        userService.saveOddType(oddType);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$40$lambda$39$lambda$38(TourState tourState) {
        if (!tourState.previousStep()) {
            tourState.setRequestShowSkipDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$45$lambda$42$lambda$41(TourState tourState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tourState.setTourSelectedDemoBet(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$45$lambda$44$lambda$43(TourState tourState) {
        tourState.previousStep();
        return Unit.INSTANCE;
    }

    private static final float TourOverlay$lambda$76$lambda$49(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void TourOverlay$lambda$76$lambda$50(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final float TourOverlay$lambda$76$lambda$52(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void TourOverlay$lambda$76$lambda$53(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55(View view, final MutableState mutableState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        final float intBitsToFloat = Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInRoot(coordinates) & 4294967295L));
        view.post(new Runnable() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda65
            @Override // java.lang.Runnable
            public final void run() {
                TourOverlayKt.TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55$lambda$54(intBitsToFloat, mutableState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TourOverlay$lambda$76$lambda$64$lambda$58$lambda$56$lambda$55$lambda$54(float f, MutableState mutableState) {
        if (TourOverlay$lambda$76$lambda$49(mutableState) == f) {
            return;
        }
        TourOverlay$lambda$76$lambda$50(mutableState, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60(View view, final MutableState mutableState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        final float mo6536getSizeYbymL2g = (int) (coordinates.mo6536getSizeYbymL2g() & 4294967295L);
        view.post(new Runnable() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                TourOverlayKt.TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60$lambda$59(mo6536getSizeYbymL2g, mutableState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TourOverlay$lambda$76$lambda$64$lambda$61$lambda$60$lambda$59(float f, MutableState mutableState) {
        if (TourOverlay$lambda$76$lambda$52(mutableState) == f) {
            return;
        }
        TourOverlay$lambda$76$lambda$53(mutableState, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset TourOverlay$lambda$76$lambda$64$lambda$63$lambda$62(MutableState mutableState, MutableState mutableState2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m7893boximpl(IntOffset.m7896constructorimpl((0 << 32) | ((((int) (TourOverlay$lambda$76$lambda$49(mutableState) - (TourOverlay$lambda$76$lambda$52(mutableState2) / 2.0f))) + Opcodes.F2L) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$66$lambda$65(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$68$lambda$67(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$70$lambda$69(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$72$lambda$71(TourState tourState, Function1 function1) {
        Long selectedSportId = tourState.getSelectedSportId();
        if (selectedSportId == null) {
            selectedSportId = tourState.getTourSportId();
        }
        if (selectedSportId == null) {
            Log.w("TourOverlay", "No sport ID available for click");
        } else if (function1 != null) {
            function1.invoke(selectedSportId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourOverlay$lambda$76$lambda$74$lambda$73(TourState tourState, Function1 function1) {
        Long selectedLeagueId = tourState.getSelectedLeagueId();
        if (selectedLeagueId == null) {
            selectedLeagueId = tourState.getTourLeagueId();
        }
        if (selectedLeagueId == null) {
            Log.w("TourOverlay", "No league ID available for click");
        } else if (function1 != null) {
            function1.invoke(selectedLeagueId);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourWelcomeScreen(final String str, final String str2, final TourCharacterPosition tourCharacterPosition, final Function0<Unit> function0, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object rememberedValue;
        Object rememberedValue2;
        TourOverlayKt$TourWelcomeScreen$1$1 rememberedValue3;
        boolean z2;
        Object rememberedValue4;
        int i4;
        Alignment centerStart;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean z3;
        Object rememberedValue5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(630726215);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(tourCharacterPosition.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(630726215, i3, -1, "org.betup.ui.tour.compose.TourWelcomeScreen (TourOverlay.kt:990)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState2 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!TourWelcomeScreen$lambda$79(mutableState) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(2000, 0, null, 6, null), 0.0f, null, null, startRestartGroup, 48, 28);
                State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!TourWelcomeScreen$lambda$82(mutableState2) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(2000, 500, null, 4, null), 0.0f, null, null, startRestartGroup, 48, 28);
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-1633490746);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new TourOverlayKt$TourWelcomeScreen$1$1(mutableState, mutableState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((57344 & i3) != 16384) | ((i3 & 7168) != 2048);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda48
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TourWelcomeScreen$lambda$88$lambda$87;
                            TourWelcomeScreen$lambda$88$lambda$87 = TourOverlayKt.TourWelcomeScreen$lambda$88$lambda$87(z, function0);
                            return TourWelcomeScreen$lambda$88$lambda$87;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                int i6 = i3;
                Modifier modifier5 = modifier4;
                Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxSize$default, z, null, null, (Function0) rememberedValue4, 6, null);
                i4 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
                if (i4 != 1) {
                    centerStart = Alignment.INSTANCE.getCenterStart();
                } else if (i4 == 2) {
                    centerStart = Alignment.INSTANCE.getCenterEnd();
                } else if (i4 == 3) {
                    centerStart = Alignment.INSTANCE.getCenter();
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    centerStart = Alignment.INSTANCE.getBottomCenter();
                }
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1059clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor);
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
                Modifier align = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart());
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, align);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
                int i7 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
                Arrangement.HorizontalOrVertical center = i7 == 1 ? i7 != 2 ? Arrangement.INSTANCE.getCenter() : Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getEnd();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                AnimatedVisibilityKt.AnimatedVisibility(RowScopeInstance.INSTANCE, TourWelcomeScreen$lambda$82(mutableState2), PaddingKt.m1520paddingqDBjuR0$default(AlphaKt.alpha(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), TourWelcomeScreen$lambda$85(animateFloatAsState2)), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(34), 7, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(2000, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1029176193, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourWelcomeScreen$3$1$1$1

                    /* compiled from: TourOverlay.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[TourCharacterPosition.values().length];
                            try {
                                iArr[TourCharacterPosition.LEFT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[TourCharacterPosition.RIGHT.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                        invoke(animatedVisibilityScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i8) {
                        TipPosition tipPosition;
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1029176193, i8, -1, "org.betup.ui.tour.compose.TourWelcomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TourOverlay.kt:1051)");
                        }
                        String str3 = str;
                        String str4 = str2;
                        int i9 = WhenMappings.$EnumSwitchMapping$0[tourCharacterPosition.ordinal()];
                        if (i9 == 1) {
                            tipPosition = TipPosition.BOTTOM_LEFT;
                        } else if (i9 == 2) {
                            tipPosition = TipPosition.BOTTOM_RIGHT;
                        } else {
                            tipPosition = TipPosition.BOTTOM_CENTER;
                        }
                        TourOverlayKt.SpeechBubbleWithTip(str3, str4, tipPosition, Modifier.INSTANCE, composer3, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 1575942, 24);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                boolean TourWelcomeScreen$lambda$79 = TourWelcomeScreen$lambda$79(mutableState);
                composer2.startReplaceGroup(5004770);
                z3 = (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256;
                rememberedValue5 = composer2.rememberedValue();
                if (!z3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda49
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90;
                            TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90 = TourOverlayKt.TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90(TourCharacterPosition.this, ((Integer) obj).intValue());
                            return Integer.valueOf(TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                composer2.endReplaceGroup();
                EnterTransition plus = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) rememberedValue5, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                Modifier alpha = AlphaKt.alpha(Modifier.INSTANCE, TourWelcomeScreen$lambda$84(animateFloatAsState));
                int i8 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, TourWelcomeScreen$lambda$79, OffsetKt.m1475offsetVpY3zN4(alpha, i8 == 1 ? i8 != 2 ? Dp.m7774constructorimpl(0) : Dp.m7774constructorimpl(40) : Dp.m7774constructorimpl(-Dp.m7774constructorimpl(40)), WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()] != 4 ? Dp.m7774constructorimpl(0) : Dp.m7774constructorimpl(0)), plus, (ExitTransition) null, (String) null, ComposableSingletons$TourOverlayKt.INSTANCE.getLambda$1392250907$app_release(), composer2, 1572870, 24);
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourWelcomeScreen$lambda$94;
                        TourWelcomeScreen$lambda$94 = TourOverlayKt.TourWelcomeScreen$lambda$94(str, str2, tourCharacterPosition, function0, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TourWelcomeScreen$lambda$94;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState22 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        State<Float> animateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(!TourWelcomeScreen$lambda$79(mutableState3) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(2000, 0, null, 6, null), 0.0f, null, null, startRestartGroup, 48, 28);
        State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(!TourWelcomeScreen$lambda$82(mutableState22) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(2000, 500, null, 4, null), 0.0f, null, null, startRestartGroup, 48, 28);
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        z2 = ((57344 & i3) != 16384) | ((i3 & 7168) != 2048);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue4 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourWelcomeScreen$lambda$88$lambda$87;
                TourWelcomeScreen$lambda$88$lambda$87 = TourOverlayKt.TourWelcomeScreen$lambda$88$lambda$87(z, function0);
                return TourWelcomeScreen$lambda$88$lambda$87;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        int i62 = i3;
        Modifier modifier52 = modifier4;
        Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(fillMaxSize$default2, z, null, null, (Function0) rememberedValue4, 6, null);
        i4 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
        if (i4 != 1) {
        }
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1059clickableXHw0xAI$default2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        Modifier align2 = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart());
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, align2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
        int i72 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
        if (i72 == 1) {
        }
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        AnimatedVisibilityKt.AnimatedVisibility(RowScopeInstance.INSTANCE, TourWelcomeScreen$lambda$82(mutableState22), PaddingKt.m1520paddingqDBjuR0$default(AlphaKt.alpha(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), TourWelcomeScreen$lambda$85(animateFloatAsState22)), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(34), 7, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(2000, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1029176193, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourWelcomeScreen$3$1$1$1

            /* compiled from: TourOverlay.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TourCharacterPosition.values().length];
                    try {
                        iArr[TourCharacterPosition.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TourCharacterPosition.RIGHT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                invoke(animatedVisibilityScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i82) {
                TipPosition tipPosition;
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1029176193, i82, -1, "org.betup.ui.tour.compose.TourWelcomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TourOverlay.kt:1051)");
                }
                String str3 = str;
                String str4 = str2;
                int i9 = WhenMappings.$EnumSwitchMapping$0[tourCharacterPosition.ordinal()];
                if (i9 == 1) {
                    tipPosition = TipPosition.BOTTOM_LEFT;
                } else if (i9 == 2) {
                    tipPosition = TipPosition.BOTTOM_RIGHT;
                } else {
                    tipPosition = TipPosition.BOTTOM_CENTER;
                }
                TourOverlayKt.SpeechBubbleWithTip(str3, str4, tipPosition, Modifier.INSTANCE, composer3, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, 1575942, 24);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        boolean TourWelcomeScreen$lambda$792 = TourWelcomeScreen$lambda$79(mutableState3);
        composer2.startReplaceGroup(5004770);
        if ((i62 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
        }
        rememberedValue5 = composer2.rememberedValue();
        if (!z3) {
        }
        rememberedValue5 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90;
                TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90 = TourOverlayKt.TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90(TourCharacterPosition.this, ((Integer) obj).intValue());
                return Integer.valueOf(TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90);
            }
        };
        composer2.updateRememberedValue(rememberedValue5);
        composer2.endReplaceGroup();
        EnterTransition plus2 = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) rememberedValue5, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
        Modifier alpha2 = AlphaKt.alpha(Modifier.INSTANCE, TourWelcomeScreen$lambda$84(animateFloatAsState3));
        int i82 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance2, TourWelcomeScreen$lambda$792, OffsetKt.m1475offsetVpY3zN4(alpha2, i82 == 1 ? i82 != 2 ? Dp.m7774constructorimpl(0) : Dp.m7774constructorimpl(40) : Dp.m7774constructorimpl(-Dp.m7774constructorimpl(40)), WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()] != 4 ? Dp.m7774constructorimpl(0) : Dp.m7774constructorimpl(0)), plus2, (ExitTransition) null, (String) null, ComposableSingletons$TourOverlayKt.INSTANCE.getLambda$1392250907$app_release(), composer2, 1572870, 24);
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
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean TourWelcomeScreen$lambda$79(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TourWelcomeScreen$lambda$80(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean TourWelcomeScreen$lambda$82(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TourWelcomeScreen$lambda$83(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourWelcomeScreen$lambda$88$lambda$87(boolean z, Function0 function0) {
        if (z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TourWelcomeScreen$lambda$93$lambda$92$lambda$91$lambda$90(TourCharacterPosition tourCharacterPosition, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
        if (i2 == 1) {
            return -i;
        }
        if (i2 != 2) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourHighlightScreen(final String str, final String str2, final TourCharacterPosition tourCharacterPosition, final TourHighlightElement tourHighlightElement, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int i4;
        Alignment centerStart;
        int i5;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        int i6;
        Alignment bottomCenter;
        int i7;
        int i8;
        float m7774constructorimpl3;
        int i9;
        float m7774constructorimpl4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1389808827);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(tourCharacterPosition.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(tourHighlightElement.ordinal()) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1389808827, i3, -1, "org.betup.ui.tour.compose.TourHighlightScreen (TourOverlay.kt:1107)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 16;
                float f2 = 300;
                SpeechBubble(str, str2, SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100), Dp.m7774constructorimpl(f), 0.0f, 8, null), 0.0f, Dp.m7774constructorimpl(f2), 1, null), startRestartGroup, i3 & 126, 0);
                EnterTransition fadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, 2, null);
                Modifier.Companion companion = Modifier.INSTANCE;
                i4 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
                if (i4 != 1) {
                    centerStart = Alignment.INSTANCE.getCenterStart();
                } else if (i4 == 2) {
                    centerStart = Alignment.INSTANCE.getCenterEnd();
                } else if (i4 == 3) {
                    centerStart = Alignment.INSTANCE.getCenter();
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    centerStart = Alignment.INSTANCE.getBottomCenter();
                }
                Modifier align = boxScopeInstance.align(companion, centerStart);
                i5 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
                if (i5 != 1) {
                    m7774constructorimpl = Dp.m7774constructorimpl(40);
                } else if (i5 == 2) {
                    m7774constructorimpl = Dp.m7774constructorimpl(-40);
                } else {
                    m7774constructorimpl = Dp.m7774constructorimpl(0);
                }
                if (WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()] != 4) {
                    m7774constructorimpl2 = Dp.m7774constructorimpl(-150);
                } else {
                    m7774constructorimpl2 = Dp.m7774constructorimpl(0);
                }
                Modifier modifier5 = modifier4;
                AnimatedVisibilityKt.AnimatedVisibility(true, SizeKt.m1563size3ABfNKs(OffsetKt.m1475offsetVpY3zN4(align, m7774constructorimpl, m7774constructorimpl2), Dp.m7774constructorimpl(f2)), fadeIn$default, (ExitTransition) null, (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$TourOverlayKt.INSTANCE.m14345getLambda$1479831129$app_release(), startRestartGroup, 196998, 24);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.helper_left_finger, startRestartGroup, 6);
                String stringResource = StringResources_androidKt.stringResource(R.string.cd_hand_pointer, startRestartGroup, 6);
                ContentScale fit = ContentScale.INSTANCE.getFit();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                i6 = WhenMappings.$EnumSwitchMapping$2[tourHighlightElement.ordinal()];
                if (i6 != 1) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                } else if (i6 == 2) {
                    bottomCenter = Alignment.INSTANCE.getCenterStart();
                } else if (i6 == 3) {
                    bottomCenter = Alignment.INSTANCE.getCenterStart();
                } else {
                    bottomCenter = Alignment.INSTANCE.getCenter();
                }
                Modifier align2 = boxScopeInstance.align(companion2, bottomCenter);
                i7 = WhenMappings.$EnumSwitchMapping$2[tourHighlightElement.ordinal()];
                if (i7 != 1) {
                    i8 = 0;
                    m7774constructorimpl3 = Dp.m7774constructorimpl(0);
                } else if (i7 == 2) {
                    i8 = 0;
                    m7774constructorimpl3 = Dp.m7774constructorimpl(50);
                } else if (i7 == 3) {
                    i8 = 0;
                    m7774constructorimpl3 = Dp.m7774constructorimpl(50);
                } else {
                    i8 = 0;
                    m7774constructorimpl3 = Dp.m7774constructorimpl(0);
                }
                i9 = WhenMappings.$EnumSwitchMapping$2[tourHighlightElement.ordinal()];
                if (i9 != 1) {
                    m7774constructorimpl4 = Dp.m7774constructorimpl(-80);
                } else if (i9 == 2) {
                    m7774constructorimpl4 = Dp.m7774constructorimpl(i8);
                } else if (i9 == 3) {
                    m7774constructorimpl4 = Dp.m7774constructorimpl(i8);
                } else {
                    m7774constructorimpl4 = Dp.m7774constructorimpl(i8);
                }
                ImageKt.Image(painterResource, stringResource, SizeKt.m1563size3ABfNKs(OffsetKt.m1475offsetVpY3zN4(align2, m7774constructorimpl3, m7774constructorimpl4), Dp.m7774constructorimpl(120)), (Alignment) null, fit, 0.0f, (ColorFilter) null, startRestartGroup, 24576, 104);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourHighlightScreen$lambda$96;
                        TourHighlightScreen$lambda$96 = TourOverlayKt.TourHighlightScreen$lambda$96(str, str2, tourCharacterPosition, tourHighlightElement, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TourHighlightScreen$lambda$96;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        float f3 = 16;
        float f22 = 300;
        SpeechBubble(str, str2, SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(100), Dp.m7774constructorimpl(f3), 0.0f, 8, null), 0.0f, Dp.m7774constructorimpl(f22), 1, null), startRestartGroup, i3 & 126, 0);
        EnterTransition fadeIn$default2 = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, 2, null);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        i4 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
        if (i4 != 1) {
        }
        Modifier align3 = boxScopeInstance2.align(companion3, centerStart);
        i5 = WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()];
        if (i5 != 1) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[tourCharacterPosition.ordinal()] != 4) {
        }
        Modifier modifier52 = modifier4;
        AnimatedVisibilityKt.AnimatedVisibility(true, SizeKt.m1563size3ABfNKs(OffsetKt.m1475offsetVpY3zN4(align3, m7774constructorimpl, m7774constructorimpl2), Dp.m7774constructorimpl(f22)), fadeIn$default2, (ExitTransition) null, (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$TourOverlayKt.INSTANCE.m14345getLambda$1479831129$app_release(), startRestartGroup, 196998, 24);
        Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.helper_left_finger, startRestartGroup, 6);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.cd_hand_pointer, startRestartGroup, 6);
        ContentScale fit2 = ContentScale.INSTANCE.getFit();
        Modifier.Companion companion22 = Modifier.INSTANCE;
        i6 = WhenMappings.$EnumSwitchMapping$2[tourHighlightElement.ordinal()];
        if (i6 != 1) {
        }
        Modifier align22 = boxScopeInstance2.align(companion22, bottomCenter);
        i7 = WhenMappings.$EnumSwitchMapping$2[tourHighlightElement.ordinal()];
        if (i7 != 1) {
        }
        i9 = WhenMappings.$EnumSwitchMapping$2[tourHighlightElement.ordinal()];
        if (i9 != 1) {
        }
        ImageKt.Image(painterResource2, stringResource2, SizeKt.m1563size3ABfNKs(OffsetKt.m1475offsetVpY3zN4(align22, m7774constructorimpl3, m7774constructorimpl4), Dp.m7774constructorimpl(120)), (Alignment) null, fit2, 0.0f, (ColorFilter) null, startRestartGroup, 24576, 104);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shakeAnimationSpec$lambda$97(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(500);
        Float valueOf = Float.valueOf(0.0f);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) valueOf, 0);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(-14.0f), 50);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(14.0f), 100);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(-10.0f), 150);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(10.0f), 200);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(-6.0f), 250);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(6.0f), 300);
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) valueOf, 350);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourNextButton(final Function0<Unit> function0, int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Object rememberedValue;
        boolean changedInstance;
        TourOverlayKt$TourNextButton$1$1 rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1165789085);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4;
                if ((i7 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    int i9 = i8 != 0 ? 0 : i5;
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1165789085, i7, -1, "org.betup.ui.tour.compose.TourNextButton (TourOverlay.kt:1210)");
                    }
                    Modifier modifier5 = modifier4;
                    int i10 = i9;
                    final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("tour_next_pulse", startRestartGroup, 6, 0), 1.0f, 1.08f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(700, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "scale", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final Animatable animatable = (Animatable) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    Integer valueOf = Integer.valueOf(i10);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = ((i7 & 112) == 32) | startRestartGroup.changedInstance(animatable);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new TourOverlayKt$TourNextButton$1$1(i10, animatable, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, (i7 >> 3) & 14);
                    String stringResource = StringResources_androidKt.stringResource(R.string.tour_next, startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(animateFloat) | startRestartGroup.changedInstance(animatable);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda46
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TourNextButton$lambda$102$lambda$101;
                                TourNextButton$lambda$102$lambda$101 = TourOverlayKt.TourNextButton$lambda$102$lambda$101(Animatable.this, animateFloat, (GraphicsLayerScope) obj);
                                return TourNextButton$lambda$102$lambda$101;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(GraphicsLayerModifierKt.graphicsLayer(modifier5, (Function1) rememberedValue3), true, stringResource, false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, ((i7 << 18) & 3670016) | 48, 0, 0, 2097080);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i5 = i10;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i11 = i5;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda47
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TourNextButton$lambda$103;
                            TourNextButton$lambda$103 = TourOverlayKt.TourNextButton$lambda$103(Function0.this, i11, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return TourNextButton$lambda$103;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            i7 = i4;
            if ((i7 & Opcodes.I2S) == 146) {
            }
            if (i8 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            int i102 = i9;
            final State animateFloat2 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("tour_next_pulse", startRestartGroup, 6, 0), 1.0f, 1.08f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(700, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "scale", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final Animatable animatable2 = (Animatable) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Integer valueOf2 = Integer.valueOf(i102);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = ((i7 & 112) == 32) | startRestartGroup.changedInstance(animatable2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new TourOverlayKt$TourNextButton$1$1(i102, animatable2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, (i7 >> 3) & 14);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.tour_next, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(animateFloat2) | startRestartGroup.changedInstance(animatable2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TourNextButton$lambda$102$lambda$101;
                    TourNextButton$lambda$102$lambda$101 = TourOverlayKt.TourNextButton$lambda$102$lambda$101(Animatable.this, animateFloat2, (GraphicsLayerScope) obj);
                    return TourNextButton$lambda$102$lambda$101;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            modifier3 = modifier52;
            CommonButtonKt.m12915CommonButtonUPEs2M4(GraphicsLayerModifierKt.graphicsLayer(modifier52, (Function1) rememberedValue3), true, stringResource2, false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, ((i7 << 18) & 3670016) | 48, 0, 0, 2097080);
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = i102;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4;
        if ((i7 & Opcodes.I2S) == 146) {
        }
        if (i8 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier522 = modifier4;
        int i1022 = i9;
        final State animateFloat22 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("tour_next_pulse", startRestartGroup, 6, 0), 1.0f, 1.08f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(700, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "scale", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final Animatable animatable22 = (Animatable) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Integer valueOf22 = Integer.valueOf(i1022);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = ((i7 & 112) == 32) | startRestartGroup.changedInstance(animatable22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new TourOverlayKt$TourNextButton$1$1(i1022, animatable22, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, (i7 >> 3) & 14);
        String stringResource22 = StringResources_androidKt.stringResource(R.string.tour_next, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(animateFloat22) | startRestartGroup.changedInstance(animatable22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TourNextButton$lambda$102$lambda$101;
                TourNextButton$lambda$102$lambda$101 = TourOverlayKt.TourNextButton$lambda$102$lambda$101(Animatable.this, animateFloat22, (GraphicsLayerScope) obj);
                return TourNextButton$lambda$102$lambda$101;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        modifier3 = modifier522;
        CommonButtonKt.m12915CommonButtonUPEs2M4(GraphicsLayerModifierKt.graphicsLayer(modifier522, (Function1) rememberedValue3), true, stringResource22, false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, ((i7 << 18) & 3670016) | 48, 0, 0, 2097080);
        if (ComposerKt.isTraceInProgress()) {
        }
        i5 = i1022;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourNextButton$lambda$102$lambda$101(Animatable animatable, State state, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(TourNextButton$lambda$98(state));
        graphicsLayer.setScaleY(TourNextButton$lambda$98(state));
        graphicsLayer.setTranslationX(((Number) animatable.getValue()).floatValue() * graphicsLayer.getDensity());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourHomeHighlightScreen(final String str, final String str2, final TourHighlightTarget tourHighlightTarget, final TourStep tourStep, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-249844959);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(tourHighlightTarget) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(tourStep == null ? -1 : tourStep.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249844959, i3, -1, "org.betup.ui.tour.compose.TourHomeHighlightScreen (TourOverlay.kt:1255)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density = (Density) consume;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                final float m7774constructorimpl = Dp.m7774constructorimpl(HomeTourHighlight.INSTANCE.bubbleGapDp(tourStep));
                final float m7774constructorimpl2 = Dp.m7774constructorimpl(110);
                final float m7774constructorimpl3 = Dp.m7774constructorimpl(16);
                Rect rect = tourHighlightTarget == null ? tourHighlightTarget.getRect() : null;
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TourBubbleLayout resolveBubbleLayout = HomeTourHighlight.INSTANCE.resolveBubbleLayout(tourStep, rect, density.mo1167toPx0680j_4(Dp.m7774constructorimpl(((Configuration) consume3).screenHeightDp)), density.mo1167toPx0680j_4(m7774constructorimpl2), density.mo1167toPx0680j_4(m7774constructorimpl));
                TourBubblePlacement mirrorPlacementForRtl = layoutDirection != LayoutDirection.Rtl ? HomeTourHighlight.INSTANCE.mirrorPlacementForRtl(resolveBubbleLayout.getPlacement()) : resolveBubbleLayout.getPlacement();
                final TipPosition tipPosition = resolveBubbleLayout.getTipPosition();
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TourHomeHighlightScreen$lambda$112$lambda$111;
                            TourHomeHighlightScreen$lambda$112$lambda$111 = TourOverlayKt.TourHomeHighlightScreen$lambda$112$lambda$111(MutableState.this);
                            return TourHomeHighlightScreen$lambda$112$lambda$111;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                final Rect rect2 = rect;
                final TourBubblePlacement tourBubblePlacement = mirrorPlacementForRtl;
                BoxWithConstraintsKt.BoxWithConstraints(ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue3, 28, null), null, false, ComposableLambdaKt.rememberComposableLambda(844387083, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourHomeHighlightScreen$3

                    /* compiled from: TourOverlay.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[TourBubblePlacement.values().length];
                            try {
                                iArr[TourBubblePlacement.AboveStart.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[TourBubblePlacement.BelowStart.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[TourBubblePlacement.AboveEnd.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[TourBubblePlacement.BelowEnd.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[TourBubblePlacement.AboveCenter.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[TourBubblePlacement.BelowCenter.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i5) {
                        int i6;
                        int TourHomeHighlightScreen$lambda$105;
                        Alignment topStart;
                        Modifier m1570widthInVpY3zN4$default;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844387083, i6, -1, "org.betup.ui.tour.compose.TourHomeHighlightScreen.<anonymous> (TourOverlay.kt:1288)");
                        }
                        float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                        float f = 2;
                        float m7788unboximpl = ((Dp) ComparisonsKt.minOf(Dp.m7772boximpl(Dp.m7774constructorimpl(280)), Dp.m7772boximpl(Dp.m7774constructorimpl(mo1423getMaxWidthD9Ej5fM - Dp.m7774constructorimpl(m7774constructorimpl3 * f))))).m7788unboximpl();
                        float mo1422getMaxHeightD9Ej5fM = BoxWithConstraints.mo1422getMaxHeightD9Ej5fM();
                        Function0<Unit> function02 = function0;
                        TourHomeHighlightScreen$lambda$105 = TourOverlayKt.TourHomeHighlightScreen$lambda$105(mutableState);
                        TourOverlayKt.TourNextButton(function02, TourHomeHighlightScreen$lambda$105, PaddingKt.m1516padding3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(16)), composer2, 0, 0);
                        Rect rect3 = rect2;
                        if (rect3 != null) {
                            float mo1164toDpu2uoSUM = density.mo1164toDpu2uoSUM(rect3.left);
                            float mo1164toDpu2uoSUM2 = density.mo1164toDpu2uoSUM(rect2.top);
                            float mo1164toDpu2uoSUM3 = density.mo1164toDpu2uoSUM(rect2.right);
                            float m7788unboximpl2 = StringsKt.startsWith$default(tourBubblePlacement.name(), "Above", false, 2, (Object) null) ? ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM2 - m7774constructorimpl2) - m7774constructorimpl)), Dp.m7772boximpl(Dp.m7774constructorimpl(72)))).m7788unboximpl() : ((Dp) RangesKt.coerceAtMost(Dp.m7772boximpl(Dp.m7774constructorimpl(density.mo1164toDpu2uoSUM(rect2.bottom) + m7774constructorimpl)), Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1422getMaxHeightD9Ej5fM - m7774constructorimpl2) - m7774constructorimpl3)))).m7788unboximpl();
                            switch (WhenMappings.$EnumSwitchMapping$0[tourBubblePlacement.ordinal()]) {
                                case 1:
                                case 2:
                                    Density density2 = density;
                                    m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density2.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density2.mo1167toPx0680j_4(mo1164toDpu2uoSUM), density2.mo1167toPx0680j_4(m7788unboximpl), density2.mo1167toPx0680j_4(mo1423getMaxWidthD9Ej5fM), density2.mo1167toPx0680j_4(m7774constructorimpl3))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                                    break;
                                case 3:
                                case 4:
                                    mo1164toDpu2uoSUM = Dp.m7774constructorimpl(mo1164toDpu2uoSUM3 - m7788unboximpl);
                                    Density density22 = density;
                                    m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density22.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density22.mo1167toPx0680j_4(mo1164toDpu2uoSUM), density22.mo1167toPx0680j_4(m7788unboximpl), density22.mo1167toPx0680j_4(mo1423getMaxWidthD9Ej5fM), density22.mo1167toPx0680j_4(m7774constructorimpl3))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                                    break;
                                case 5:
                                case 6:
                                    mo1164toDpu2uoSUM = Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM + mo1164toDpu2uoSUM3) / f) - Dp.m7774constructorimpl(m7788unboximpl / f));
                                    Density density222 = density;
                                    m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density222.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density222.mo1167toPx0680j_4(mo1164toDpu2uoSUM), density222.mo1167toPx0680j_4(m7788unboximpl), density222.mo1167toPx0680j_4(mo1423getMaxWidthD9Ej5fM), density222.mo1167toPx0680j_4(m7774constructorimpl3))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            switch (WhenMappings.$EnumSwitchMapping$0[tourBubblePlacement.ordinal()]) {
                                case 1:
                                case 2:
                                    topStart = Alignment.INSTANCE.getTopStart();
                                    break;
                                case 3:
                                case 4:
                                    topStart = Alignment.INSTANCE.getTopEnd();
                                    break;
                                case 5:
                                case 6:
                                    topStart = Alignment.INSTANCE.getTopCenter();
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(BoxWithConstraints.align(companion, topStart), (tourBubblePlacement == TourBubblePlacement.AboveStart || tourBubblePlacement == TourBubblePlacement.BelowStart) ? m7774constructorimpl3 : Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(20), (tourBubblePlacement == TourBubblePlacement.AboveEnd || tourBubblePlacement == TourBubblePlacement.BelowEnd) ? m7774constructorimpl3 : Dp.m7774constructorimpl(0), 0.0f, 8, null), 0.0f, m7788unboximpl, 1, null);
                        }
                        TourOverlayKt.SpeechBubbleWithTip(str, str2, tipPosition, m1570widthInVpY3zN4$default, composer2, 0, 0);
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
            final Modifier modifier4 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourHomeHighlightScreen$lambda$113;
                        TourHomeHighlightScreen$lambda$113 = TourOverlayKt.TourHomeHighlightScreen$lambda$113(str, str2, tourHighlightTarget, tourStep, function0, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TourHomeHighlightScreen$lambda$113;
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
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<Integer> mutableState2 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density2 = (Density) consume4;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localLayoutDirection2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
        final float m7774constructorimpl4 = Dp.m7774constructorimpl(HomeTourHighlight.INSTANCE.bubbleGapDp(tourStep));
        final float m7774constructorimpl22 = Dp.m7774constructorimpl(110);
        final float m7774constructorimpl32 = Dp.m7774constructorimpl(16);
        if (tourHighlightTarget == null) {
        }
        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TourBubbleLayout resolveBubbleLayout2 = HomeTourHighlight.INSTANCE.resolveBubbleLayout(tourStep, rect, density2.mo1167toPx0680j_4(Dp.m7774constructorimpl(((Configuration) consume32).screenHeightDp)), density2.mo1167toPx0680j_4(m7774constructorimpl22), density2.mo1167toPx0680j_4(m7774constructorimpl4));
        if (layoutDirection2 != LayoutDirection.Rtl) {
        }
        final TipPosition tipPosition2 = resolveBubbleLayout2.getTipPosition();
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        modifier2 = modifier3;
        final Rect rect22 = rect;
        final TourBubblePlacement tourBubblePlacement2 = mirrorPlacementForRtl;
        BoxWithConstraintsKt.BoxWithConstraints(ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default2, mutableInteractionSource2, null, false, null, null, (Function0) rememberedValue3, 28, null), null, false, ComposableLambdaKt.rememberComposableLambda(844387083, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourHomeHighlightScreen$3

            /* compiled from: TourOverlay.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TourBubblePlacement.values().length];
                    try {
                        iArr[TourBubblePlacement.AboveStart.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TourBubblePlacement.BelowStart.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TourBubblePlacement.AboveEnd.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TourBubblePlacement.BelowEnd.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TourBubblePlacement.AboveCenter.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TourBubblePlacement.BelowCenter.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                invoke(boxWithConstraintsScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i5) {
                int i6;
                int TourHomeHighlightScreen$lambda$105;
                Alignment topStart;
                Modifier m1570widthInVpY3zN4$default;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i5 & 6) == 0) {
                    i6 = i5 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i6 = i5;
                }
                if ((i6 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844387083, i6, -1, "org.betup.ui.tour.compose.TourHomeHighlightScreen.<anonymous> (TourOverlay.kt:1288)");
                }
                float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                float f = 2;
                float m7788unboximpl = ((Dp) ComparisonsKt.minOf(Dp.m7772boximpl(Dp.m7774constructorimpl(280)), Dp.m7772boximpl(Dp.m7774constructorimpl(mo1423getMaxWidthD9Ej5fM - Dp.m7774constructorimpl(m7774constructorimpl32 * f))))).m7788unboximpl();
                float mo1422getMaxHeightD9Ej5fM = BoxWithConstraints.mo1422getMaxHeightD9Ej5fM();
                Function0<Unit> function02 = function0;
                TourHomeHighlightScreen$lambda$105 = TourOverlayKt.TourHomeHighlightScreen$lambda$105(mutableState2);
                TourOverlayKt.TourNextButton(function02, TourHomeHighlightScreen$lambda$105, PaddingKt.m1516padding3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(16)), composer2, 0, 0);
                Rect rect3 = rect22;
                if (rect3 != null) {
                    float mo1164toDpu2uoSUM = density2.mo1164toDpu2uoSUM(rect3.left);
                    float mo1164toDpu2uoSUM2 = density2.mo1164toDpu2uoSUM(rect22.top);
                    float mo1164toDpu2uoSUM3 = density2.mo1164toDpu2uoSUM(rect22.right);
                    float m7788unboximpl2 = StringsKt.startsWith$default(tourBubblePlacement2.name(), "Above", false, 2, (Object) null) ? ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM2 - m7774constructorimpl22) - m7774constructorimpl4)), Dp.m7772boximpl(Dp.m7774constructorimpl(72)))).m7788unboximpl() : ((Dp) RangesKt.coerceAtMost(Dp.m7772boximpl(Dp.m7774constructorimpl(density2.mo1164toDpu2uoSUM(rect22.bottom) + m7774constructorimpl4)), Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1422getMaxHeightD9Ej5fM - m7774constructorimpl22) - m7774constructorimpl32)))).m7788unboximpl();
                    switch (WhenMappings.$EnumSwitchMapping$0[tourBubblePlacement2.ordinal()]) {
                        case 1:
                        case 2:
                            Density density222 = density2;
                            m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density222.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density222.mo1167toPx0680j_4(mo1164toDpu2uoSUM), density222.mo1167toPx0680j_4(m7788unboximpl), density222.mo1167toPx0680j_4(mo1423getMaxWidthD9Ej5fM), density222.mo1167toPx0680j_4(m7774constructorimpl32))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                            break;
                        case 3:
                        case 4:
                            mo1164toDpu2uoSUM = Dp.m7774constructorimpl(mo1164toDpu2uoSUM3 - m7788unboximpl);
                            Density density2222 = density2;
                            m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density2222.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density2222.mo1167toPx0680j_4(mo1164toDpu2uoSUM), density2222.mo1167toPx0680j_4(m7788unboximpl), density2222.mo1167toPx0680j_4(mo1423getMaxWidthD9Ej5fM), density2222.mo1167toPx0680j_4(m7774constructorimpl32))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                            break;
                        case 5:
                        case 6:
                            mo1164toDpu2uoSUM = Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM + mo1164toDpu2uoSUM3) / f) - Dp.m7774constructorimpl(m7788unboximpl / f));
                            Density density22222 = density2;
                            m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density22222.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density22222.mo1167toPx0680j_4(mo1164toDpu2uoSUM), density22222.mo1167toPx0680j_4(m7788unboximpl), density22222.mo1167toPx0680j_4(mo1423getMaxWidthD9Ej5fM), density22222.mo1167toPx0680j_4(m7774constructorimpl32))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    switch (WhenMappings.$EnumSwitchMapping$0[tourBubblePlacement2.ordinal()]) {
                        case 1:
                        case 2:
                            topStart = Alignment.INSTANCE.getTopStart();
                            break;
                        case 3:
                        case 4:
                            topStart = Alignment.INSTANCE.getTopEnd();
                            break;
                        case 5:
                        case 6:
                            topStart = Alignment.INSTANCE.getTopCenter();
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(BoxWithConstraints.align(companion, topStart), (tourBubblePlacement2 == TourBubblePlacement.AboveStart || tourBubblePlacement2 == TourBubblePlacement.BelowStart) ? m7774constructorimpl32 : Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(20), (tourBubblePlacement2 == TourBubblePlacement.AboveEnd || tourBubblePlacement2 == TourBubblePlacement.BelowEnd) ? m7774constructorimpl32 : Dp.m7774constructorimpl(0), 0.0f, 8, null), 0.0f, m7788unboximpl, 1, null);
                }
                TourOverlayKt.SpeechBubbleWithTip(str, str2, tipPosition2, m1570widthInVpY3zN4$default, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        final Modifier modifier42 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TourHomeHighlightScreen$lambda$105(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void TourHomeHighlightScreen$lambda$106(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourHomeHighlightScreen$lambda$112$lambda$111(MutableState mutableState) {
        TourHomeHighlightScreen$lambda$106(mutableState, TourHomeHighlightScreen$lambda$105(mutableState) + 1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourClickBottomNavButtonScreen(final String str, final String str2, final Rect rect, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-677271735);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changedInstance(rect) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-677271735, i3, -1, "org.betup.ui.tour.compose.TourClickBottomNavButtonScreen (TourOverlay.kt:1379)");
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    final float m7774constructorimpl = Dp.m7774constructorimpl(12);
                    final float m7774constructorimpl2 = Dp.m7774constructorimpl(110);
                    final float m7774constructorimpl3 = Dp.m7774constructorimpl(16);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda55
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TourClickBottomNavButtonScreen$lambda$119$lambda$118;
                                TourClickBottomNavButtonScreen$lambda$119$lambda$118 = TourOverlayKt.TourClickBottomNavButtonScreen$lambda$119$lambda$118(MutableState.this);
                                return TourClickBottomNavButtonScreen$lambda$119$lambda$118;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1057clickableO2vRcR0$default = ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue3, 28, null);
                    Modifier modifier5 = modifier4;
                    BoxWithConstraintsKt.BoxWithConstraints(m1057clickableO2vRcR0$default, null, false, ComposableLambdaKt.rememberComposableLambda(1142670879, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourClickBottomNavButtonScreen$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i5) {
                            int TourClickBottomNavButtonScreen$lambda$115;
                            Modifier m1570widthInVpY3zN4$default;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i5 & 6) == 0) {
                                i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1142670879, i5, -1, "org.betup.ui.tour.compose.TourClickBottomNavButtonScreen.<anonymous> (TourOverlay.kt:1392)");
                            }
                            float f = 2;
                            float m7788unboximpl = ((Dp) ComparisonsKt.minOf(Dp.m7772boximpl(Dp.m7774constructorimpl(280)), Dp.m7772boximpl(Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() - Dp.m7774constructorimpl(m7774constructorimpl3 * f))))).m7788unboximpl();
                            Function0<Unit> function02 = function0;
                            TourClickBottomNavButtonScreen$lambda$115 = TourOverlayKt.TourClickBottomNavButtonScreen$lambda$115(mutableState);
                            TourOverlayKt.TourNextButton(function02, TourClickBottomNavButtonScreen$lambda$115, PaddingKt.m1516padding3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(16)), composer2, 0, 0);
                            Rect rect2 = rect;
                            if (rect2 != null) {
                                float mo1164toDpu2uoSUM = density.mo1164toDpu2uoSUM(rect2.left);
                                float mo1164toDpu2uoSUM2 = density.mo1164toDpu2uoSUM(rect.top);
                                float mo1164toDpu2uoSUM3 = density.mo1164toDpu2uoSUM(rect.right);
                                float m7788unboximpl2 = ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM2 - m7774constructorimpl2) - m7774constructorimpl)), Dp.m7772boximpl(Dp.m7774constructorimpl(72)))).m7788unboximpl();
                                float m7774constructorimpl4 = Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM + mo1164toDpu2uoSUM3) / f) - Dp.m7774constructorimpl(m7788unboximpl / f));
                                Density density2 = density;
                                m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density2.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density2.mo1167toPx0680j_4(m7774constructorimpl4), density2.mo1167toPx0680j_4(m7788unboximpl), density2.mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()), density2.mo1167toPx0680j_4(m7774constructorimpl3))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                            } else {
                                m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, Dp.m7774constructorimpl(20), 1, null), 0.0f, m7788unboximpl, 1, null);
                            }
                            TourOverlayKt.SpeechBubbleWithTip(str, str2, TipPosition.BOTTOM_CENTER, m1570widthInVpY3zN4$default, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda62
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TourClickBottomNavButtonScreen$lambda$120;
                            TourClickBottomNavButtonScreen$lambda$120 = TourOverlayKt.TourClickBottomNavButtonScreen$lambda$120(str, str2, rect, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TourClickBottomNavButtonScreen$lambda$120;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<Integer> mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2 = (Density) consume2;
            final float m7774constructorimpl4 = Dp.m7774constructorimpl(12);
            final float m7774constructorimpl22 = Dp.m7774constructorimpl(110);
            final float m7774constructorimpl32 = Dp.m7774constructorimpl(16);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1057clickableO2vRcR0$default2 = ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default2, mutableInteractionSource2, null, false, null, null, (Function0) rememberedValue3, 28, null);
            Modifier modifier52 = modifier4;
            BoxWithConstraintsKt.BoxWithConstraints(m1057clickableO2vRcR0$default2, null, false, ComposableLambdaKt.rememberComposableLambda(1142670879, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourClickBottomNavButtonScreen$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i5) {
                    int TourClickBottomNavButtonScreen$lambda$115;
                    Modifier m1570widthInVpY3zN4$default;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1142670879, i5, -1, "org.betup.ui.tour.compose.TourClickBottomNavButtonScreen.<anonymous> (TourOverlay.kt:1392)");
                    }
                    float f = 2;
                    float m7788unboximpl = ((Dp) ComparisonsKt.minOf(Dp.m7772boximpl(Dp.m7774constructorimpl(280)), Dp.m7772boximpl(Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() - Dp.m7774constructorimpl(m7774constructorimpl32 * f))))).m7788unboximpl();
                    Function0<Unit> function02 = function0;
                    TourClickBottomNavButtonScreen$lambda$115 = TourOverlayKt.TourClickBottomNavButtonScreen$lambda$115(mutableState2);
                    TourOverlayKt.TourNextButton(function02, TourClickBottomNavButtonScreen$lambda$115, PaddingKt.m1516padding3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(16)), composer2, 0, 0);
                    Rect rect2 = rect;
                    if (rect2 != null) {
                        float mo1164toDpu2uoSUM = density2.mo1164toDpu2uoSUM(rect2.left);
                        float mo1164toDpu2uoSUM2 = density2.mo1164toDpu2uoSUM(rect.top);
                        float mo1164toDpu2uoSUM3 = density2.mo1164toDpu2uoSUM(rect.right);
                        float m7788unboximpl2 = ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM2 - m7774constructorimpl22) - m7774constructorimpl4)), Dp.m7772boximpl(Dp.m7774constructorimpl(72)))).m7788unboximpl();
                        float m7774constructorimpl42 = Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM + mo1164toDpu2uoSUM3) / f) - Dp.m7774constructorimpl(m7788unboximpl / f));
                        Density density22 = density2;
                        m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density22.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density22.mo1167toPx0680j_4(m7774constructorimpl42), density22.mo1167toPx0680j_4(m7788unboximpl), density22.mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()), density22.mo1167toPx0680j_4(m7774constructorimpl32))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                    } else {
                        m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, Dp.m7774constructorimpl(20), 1, null), 0.0f, m7788unboximpl, 1, null);
                    }
                    TourOverlayKt.SpeechBubbleWithTip(str, str2, TipPosition.BOTTOM_CENTER, m1570widthInVpY3zN4$default, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<Integer> mutableState22 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22 = (Density) consume22;
        final float m7774constructorimpl42 = Dp.m7774constructorimpl(12);
        final float m7774constructorimpl222 = Dp.m7774constructorimpl(110);
        final float m7774constructorimpl322 = Dp.m7774constructorimpl(16);
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1057clickableO2vRcR0$default22 = ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default22, mutableInteractionSource22, null, false, null, null, (Function0) rememberedValue3, 28, null);
        Modifier modifier522 = modifier4;
        BoxWithConstraintsKt.BoxWithConstraints(m1057clickableO2vRcR0$default22, null, false, ComposableLambdaKt.rememberComposableLambda(1142670879, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourClickBottomNavButtonScreen$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                invoke(boxWithConstraintsScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i5) {
                int TourClickBottomNavButtonScreen$lambda$115;
                Modifier m1570widthInVpY3zN4$default;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i5 & 6) == 0) {
                    i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                }
                if ((i5 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1142670879, i5, -1, "org.betup.ui.tour.compose.TourClickBottomNavButtonScreen.<anonymous> (TourOverlay.kt:1392)");
                }
                float f = 2;
                float m7788unboximpl = ((Dp) ComparisonsKt.minOf(Dp.m7772boximpl(Dp.m7774constructorimpl(280)), Dp.m7772boximpl(Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() - Dp.m7774constructorimpl(m7774constructorimpl322 * f))))).m7788unboximpl();
                Function0<Unit> function02 = function0;
                TourClickBottomNavButtonScreen$lambda$115 = TourOverlayKt.TourClickBottomNavButtonScreen$lambda$115(mutableState22);
                TourOverlayKt.TourNextButton(function02, TourClickBottomNavButtonScreen$lambda$115, PaddingKt.m1516padding3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(16)), composer2, 0, 0);
                Rect rect2 = rect;
                if (rect2 != null) {
                    float mo1164toDpu2uoSUM = density22.mo1164toDpu2uoSUM(rect2.left);
                    float mo1164toDpu2uoSUM2 = density22.mo1164toDpu2uoSUM(rect.top);
                    float mo1164toDpu2uoSUM3 = density22.mo1164toDpu2uoSUM(rect.right);
                    float m7788unboximpl2 = ((Dp) RangesKt.coerceAtLeast(Dp.m7772boximpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM2 - m7774constructorimpl222) - m7774constructorimpl42)), Dp.m7772boximpl(Dp.m7774constructorimpl(72)))).m7788unboximpl();
                    float m7774constructorimpl422 = Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1164toDpu2uoSUM + mo1164toDpu2uoSUM3) / f) - Dp.m7774constructorimpl(m7788unboximpl / f));
                    Density density222 = density22;
                    m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), density222.mo1163toDpu2uoSUM(HomeTourHighlight.INSTANCE.constrainBubbleStartPx(density222.mo1167toPx0680j_4(m7774constructorimpl422), density222.mo1167toPx0680j_4(m7788unboximpl), density222.mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()), density222.mo1167toPx0680j_4(m7774constructorimpl322))), m7788unboximpl2), 0.0f, m7788unboximpl, 1, null);
                } else {
                    m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, Dp.m7774constructorimpl(20), 1, null), 0.0f, m7788unboximpl, 1, null);
                }
                TourOverlayKt.SpeechBubbleWithTip(str, str2, TipPosition.BOTTOM_CENTER, m1570widthInVpY3zN4$default, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TourClickBottomNavButtonScreen$lambda$115(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void TourClickBottomNavButtonScreen$lambda$116(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourClickBottomNavButtonScreen$lambda$119$lambda$118(MutableState mutableState) {
        TourClickBottomNavButtonScreen$lambda$116(mutableState, TourClickBottomNavButtonScreen$lambda$115(mutableState) + 1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourClickSportScreen(final String str, final String str2, final TourState tourState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Rect sportsButtonBounds;
        String str3;
        TourOverlayKt$TourClickSportScreen$1$ButtonPosition tourOverlayKt$TourClickSportScreen$1$ButtonPosition;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(774316352);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(tourState) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(774316352, i3, -1, "org.betup.ui.tour.compose.TourClickSportScreen (TourOverlay.kt:1444)");
                    }
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    Modifier modifier5 = modifier4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m7774constructorimpl = Dp.m7774constructorimpl(((Configuration) consume).screenHeightDp);
                    ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localConfiguration2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m7774constructorimpl2 = Dp.m7774constructorimpl(((Configuration) consume2).screenWidthDp);
                    sportsButtonBounds = tourState.getSportsButtonBounds();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume3;
                    if (sportsButtonBounds != null) {
                        float mo1163toDpu2uoSUM = density.mo1163toDpu2uoSUM(sportsButtonBounds.left);
                        float mo1163toDpu2uoSUM2 = density.mo1163toDpu2uoSUM(sportsButtonBounds.top);
                        float mo1163toDpu2uoSUM3 = density.mo1163toDpu2uoSUM(sportsButtonBounds.width());
                        float mo1163toDpu2uoSUM4 = density.mo1163toDpu2uoSUM(sportsButtonBounds.height());
                        float m7774constructorimpl3 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM + Dp.m7774constructorimpl(0.5f * mo1163toDpu2uoSUM3));
                        float m7774constructorimpl4 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM + mo1163toDpu2uoSUM3);
                        str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        Log.d("TourClickSportScreen", "Using real bounds: left=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM) + ", top=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM2) + ", width=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM3) + ", height=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM4) + ", right=" + Dp.m7785toStringimpl(m7774constructorimpl4));
                        tourOverlayKt$TourClickSportScreen$1$ButtonPosition = new TourOverlayKt$TourClickSportScreen$1$ButtonPosition(mo1163toDpu2uoSUM, mo1163toDpu2uoSUM2, mo1163toDpu2uoSUM3, mo1163toDpu2uoSUM4, m7774constructorimpl3, m7774constructorimpl4, null);
                    } else {
                        str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        float f = 0.2f * m7774constructorimpl2;
                        float m7774constructorimpl5 = Dp.m7774constructorimpl(f);
                        float m7774constructorimpl6 = Dp.m7774constructorimpl(f);
                        float m7774constructorimpl7 = Dp.m7774constructorimpl(70);
                        float m7774constructorimpl8 = Dp.m7774constructorimpl(m7774constructorimpl - m7774constructorimpl7);
                        float m7774constructorimpl9 = Dp.m7774constructorimpl(m7774constructorimpl6 + Dp.m7774constructorimpl(0.5f * m7774constructorimpl5));
                        float m7774constructorimpl10 = Dp.m7774constructorimpl(m7774constructorimpl6 + m7774constructorimpl5);
                        Log.d("TourClickSportScreen", "Using calculated position: left=" + Dp.m7785toStringimpl(m7774constructorimpl6) + ", top=" + Dp.m7785toStringimpl(m7774constructorimpl8) + ", width=" + Dp.m7785toStringimpl(m7774constructorimpl5) + ", height=" + Dp.m7785toStringimpl(m7774constructorimpl7) + ", right=" + Dp.m7785toStringimpl(m7774constructorimpl10));
                        tourOverlayKt$TourClickSportScreen$1$ButtonPosition = new TourOverlayKt$TourClickSportScreen$1$ButtonPosition(m7774constructorimpl6, m7774constructorimpl8, m7774constructorimpl5, m7774constructorimpl7, m7774constructorimpl9, m7774constructorimpl10, null);
                    }
                    String str4 = str3;
                    SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                    Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getLeft(), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getTop()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getWidth()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getHeight()), 2000.0f);
                    startRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & 7168) == 2048;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda37
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TourClickSportScreen$lambda$128$lambda$126$lambda$125;
                                TourClickSportScreen$lambda$128$lambda$126$lambda$125 = TourOverlayKt.TourClickSportScreen$lambda$128$lambda$126$lambda$125(Function0.this);
                                return TourClickSportScreen$lambda$128$lambda$126$lambda$125;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(zIndex, false, null, null, (Function0) rememberedValue, 7, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
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
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda38
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TourClickSportScreen$lambda$129;
                            TourClickSportScreen$lambda$129 = TourOverlayKt.TourClickSportScreen$lambda$129(str, str2, tourState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TourClickSportScreen$lambda$129;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier52 = modifier4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl11 = Dp.m7774constructorimpl(((Configuration) consume4).screenHeightDp);
            ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localConfiguration22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl22 = Dp.m7774constructorimpl(((Configuration) consume22).screenWidthDp);
            sportsButtonBounds = tourState.getSportsButtonBounds();
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume32;
            if (sportsButtonBounds != null) {
            }
            String str42 = str3;
            SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl22 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl11 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
            Modifier zIndex2 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getLeft(), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getTop()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getWidth()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getHeight()), 2000.0f);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 7168) == 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TourClickSportScreen$lambda$128$lambda$126$lambda$125;
                    TourClickSportScreen$lambda$128$lambda$126$lambda$125 = TourOverlayKt.TourClickSportScreen$lambda$128$lambda$126$lambda$125(Function0.this);
                    return TourClickSportScreen$lambda$128$lambda$126$lambda$125;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(zIndex2, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str42);
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
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
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
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Modifier modifier522 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Configuration> localConfiguration32 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(localConfiguration32);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl112 = Dp.m7774constructorimpl(((Configuration) consume42).screenHeightDp);
        ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localConfiguration222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl222 = Dp.m7774constructorimpl(((Configuration) consume222).screenWidthDp);
        sportsButtonBounds = tourState.getSportsButtonBounds();
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume322;
        if (sportsButtonBounds != null) {
        }
        String str422 = str3;
        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl112 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
        Modifier zIndex22 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getLeft(), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getTop()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getWidth()), tourOverlayKt$TourClickSportScreen$1$ButtonPosition.getHeight()), 2000.0f);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 7168) == 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourClickSportScreen$lambda$128$lambda$126$lambda$125;
                TourClickSportScreen$lambda$128$lambda$126$lambda$125 = TourOverlayKt.TourClickSportScreen$lambda$128$lambda$126$lambda$125(Function0.this);
                return TourClickSportScreen$lambda$128$lambda$126$lambda$125;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(zIndex22, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str422);
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
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
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
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourClickSportScreen$lambda$128$lambda$126$lambda$125(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourSelectLeagueScreen(final String str, final String str2, final TourState tourState, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Rect leagueItemBounds;
        String str3;
        TourOverlayKt$TourSelectLeagueScreen$1$ItemPosition tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-313553857);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(tourState) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Function0<Unit> function04 = i4 == 0 ? null : function02;
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-313553857, i3, -1, "org.betup.ui.tour.compose.TourSelectLeagueScreen (TourOverlay.kt:1536)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        final Function0<Unit> function05 = function04;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl = Dp.m7774constructorimpl(((Configuration) consume).screenHeightDp);
                        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl2 = Dp.m7774constructorimpl(((Configuration) consume2).screenWidthDp);
                        leagueItemBounds = tourState.getLeagueItemBounds();
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume3;
                        if (leagueItemBounds == null) {
                            float mo1163toDpu2uoSUM = density.mo1163toDpu2uoSUM(leagueItemBounds.left);
                            float mo1163toDpu2uoSUM2 = density.mo1163toDpu2uoSUM(leagueItemBounds.top);
                            float mo1163toDpu2uoSUM3 = density.mo1163toDpu2uoSUM(leagueItemBounds.width());
                            float mo1163toDpu2uoSUM4 = density.mo1163toDpu2uoSUM(leagueItemBounds.height());
                            float m7774constructorimpl3 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM + Dp.m7774constructorimpl(mo1163toDpu2uoSUM3 * 0.5f));
                            float m7774constructorimpl4 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM2 + Dp.m7774constructorimpl(0.5f * mo1163toDpu2uoSUM4));
                            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            Log.d("TourSelectLeagueScreen", "Using real bounds: left=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM) + ", top=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM2) + ", width=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM3) + ", height=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM4) + ", centerX=" + Dp.m7785toStringimpl(m7774constructorimpl3) + ", centerY=" + Dp.m7785toStringimpl(m7774constructorimpl4));
                            tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition = new TourOverlayKt$TourSelectLeagueScreen$1$ItemPosition(mo1163toDpu2uoSUM, mo1163toDpu2uoSUM2, mo1163toDpu2uoSUM3, mo1163toDpu2uoSUM4, m7774constructorimpl3, m7774constructorimpl4, null);
                        } else {
                            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            float m7774constructorimpl5 = Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(32));
                            float m7774constructorimpl6 = Dp.m7774constructorimpl(16);
                            float m7774constructorimpl7 = Dp.m7774constructorimpl(60);
                            float m7774constructorimpl8 = Dp.m7774constructorimpl(0.3f * m7774constructorimpl);
                            float m7774constructorimpl9 = Dp.m7774constructorimpl(m7774constructorimpl6 + Dp.m7774constructorimpl(m7774constructorimpl5 * 0.5f));
                            float m7774constructorimpl10 = Dp.m7774constructorimpl(m7774constructorimpl8 + Dp.m7774constructorimpl(0.5f * m7774constructorimpl7));
                            Log.d("TourSelectLeagueScreen", "Using calculated position: left=" + Dp.m7785toStringimpl(m7774constructorimpl6) + ", top=" + Dp.m7785toStringimpl(m7774constructorimpl8) + ", width=" + Dp.m7785toStringimpl(m7774constructorimpl5) + ", height=" + Dp.m7785toStringimpl(m7774constructorimpl7) + ", centerX=" + Dp.m7785toStringimpl(m7774constructorimpl9) + ", centerY=" + Dp.m7785toStringimpl(m7774constructorimpl10));
                            tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition = new TourOverlayKt$TourSelectLeagueScreen$1$ItemPosition(m7774constructorimpl6, m7774constructorimpl8, m7774constructorimpl5, m7774constructorimpl7, m7774constructorimpl9, m7774constructorimpl10, null);
                        }
                        String str4 = str3;
                        Modifier modifier4 = modifier2;
                        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                        Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getHeight()), 2000.0f);
                        startRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 7168) != 2048;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda35
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                                    TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134 = TourOverlayKt.TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134(Function0.this);
                                    return TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(zIndex, false, null, null, (Function0) rememberedValue, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function05;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function03 = function02;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda36
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TourSelectLeagueScreen$lambda$138;
                                TourSelectLeagueScreen$lambda$138 = TourOverlayKt.TourSelectLeagueScreen$lambda$138(str, str2, tourState, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TourSelectLeagueScreen$lambda$138;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                final Function0 function052 = function04;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl11 = Dp.m7774constructorimpl(((Configuration) consume4).screenHeightDp);
                ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localConfiguration22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl22 = Dp.m7774constructorimpl(((Configuration) consume22).screenWidthDp);
                leagueItemBounds = tourState.getLeagueItemBounds();
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume32;
                if (leagueItemBounds == null) {
                }
                String str42 = str3;
                Modifier modifier42 = modifier2;
                SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl22 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl11 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                Modifier zIndex2 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getHeight()), 2000.0f);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 7168) != 2048) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                        TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134 = TourOverlayKt.TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134(Function0.this);
                        return TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(zIndex2, false, null, null, (Function0) rememberedValue, 7, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str42);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
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
                if (ComposerKt.isTraceInProgress()) {
                }
                function03 = function052;
                modifier3 = modifier42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            final Function0 function0522 = function04;
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ProvidableCompositionLocal<Configuration> localConfiguration32 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localConfiguration32);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl112 = Dp.m7774constructorimpl(((Configuration) consume42).screenHeightDp);
            ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localConfiguration222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl222 = Dp.m7774constructorimpl(((Configuration) consume222).screenWidthDp);
            leagueItemBounds = tourState.getLeagueItemBounds();
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume322;
            if (leagueItemBounds == null) {
            }
            String str422 = str3;
            Modifier modifier422 = modifier2;
            SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl112 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
            Modifier zIndex22 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getHeight()), 2000.0f);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                    TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134 = TourOverlayKt.TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134(Function0.this);
                    return TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(zIndex22, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str422);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
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
            if (ComposerKt.isTraceInProgress()) {
            }
            function03 = function0522;
            modifier3 = modifier422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        final Function0 function05222 = function04;
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Configuration> localConfiguration322 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localConfiguration322);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl1122 = Dp.m7774constructorimpl(((Configuration) consume422).screenHeightDp);
        ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localConfiguration2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl2222 = Dp.m7774constructorimpl(((Configuration) consume2222).screenWidthDp);
        leagueItemBounds = tourState.getLeagueItemBounds();
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume3222;
        if (leagueItemBounds == null) {
        }
        String str4222 = str3;
        Modifier modifier4222 = modifier2;
        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl1122 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
        Modifier zIndex222 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectLeagueScreen$1$ItemPosition.getHeight()), 2000.0f);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
                TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134 = TourOverlayKt.TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134(Function0.this);
                return TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default222 = ClickableKt.m1059clickableXHw0xAI$default(zIndex222, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4222);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
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
        if (ComposerKt.isTraceInProgress()) {
        }
        function03 = function05222;
        modifier3 = modifier4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectLeagueScreen$lambda$137$lambda$135$lambda$134(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourSelectMatchScreen(final String str, final String str2, final TourState tourState, Function1<? super Long, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function1<? super Long, Unit> function12;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function1<? super Long, Unit> function13;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(710090514);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(tourState) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Function1<? super Long, Unit> function14 = i4 == 0 ? null : function12;
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(710090514, i3, -1, "org.betup.ui.tour.compose.TourSelectMatchScreen (TourOverlay.kt:1628)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        final Function1<? super Long, Unit> function15 = function14;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl = Dp.m7774constructorimpl(((Configuration) consume).screenHeightDp);
                        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl2 = Dp.m7774constructorimpl(((Configuration) consume2).screenWidthDp);
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float f = 180;
                        TourOverlayKt$TourSelectMatchScreen$1$ItemPosition tourOverlayKt$TourSelectMatchScreen$1$ItemPosition = new TourOverlayKt$TourSelectMatchScreen$1$ItemPosition(Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(f), m7774constructorimpl2, Dp.m7774constructorimpl(130), Dp.m7774constructorimpl(0.5f * m7774constructorimpl2), Dp.m7774constructorimpl(Dp.m7774constructorimpl(f) + Dp.m7774constructorimpl(75)), null);
                        Log.d("TourSelectMatchScreen", "Using manual position: left=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getLeft()) + ", top=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getTop()) + ", width=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getWidth()) + ", height=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getHeight()) + ", centerX=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getCenterX()) + ", centerY=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getCenterY()));
                        Modifier modifier5 = modifier4;
                        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                        Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition.getHeight()), 2000.0f);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        z = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | ((i3 & 7168) != 2048);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda22
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                                    TourSelectMatchScreen$lambda$142$lambda$140$lambda$139 = TourOverlayKt.TourSelectMatchScreen$lambda$142$lambda$140$lambda$139(TourState.this, function15);
                                    return TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(zIndex, false, null, null, (Function0) rememberedValue, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function13 = function15;
                        modifier3 = modifier5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function13 = function12;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TourSelectMatchScreen$lambda$143;
                                TourSelectMatchScreen$lambda$143 = TourOverlayKt.TourSelectMatchScreen$lambda$143(str, str2, tourState, function13, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TourSelectMatchScreen$lambda$143;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                final Function1 function152 = function14;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl3 = Dp.m7774constructorimpl(((Configuration) consume4).screenHeightDp);
                ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localConfiguration22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl22 = Dp.m7774constructorimpl(((Configuration) consume22).screenWidthDp);
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f2 = 180;
                TourOverlayKt$TourSelectMatchScreen$1$ItemPosition tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2 = new TourOverlayKt$TourSelectMatchScreen$1$ItemPosition(Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(f2), m7774constructorimpl22, Dp.m7774constructorimpl(130), Dp.m7774constructorimpl(0.5f * m7774constructorimpl22), Dp.m7774constructorimpl(Dp.m7774constructorimpl(f2) + Dp.m7774constructorimpl(75)), null);
                Log.d("TourSelectMatchScreen", "Using manual position: left=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getLeft()) + ", top=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getTop()) + ", width=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getWidth()) + ", height=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getHeight()) + ", centerX=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getCenterX()) + ", centerY=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getCenterY()));
                Modifier modifier52 = modifier4;
                SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl22 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl3 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                Modifier zIndex2 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getLeft(), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getTop()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getWidth()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition2.getHeight()), 2000.0f);
                startRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | ((i3 & 7168) != 2048);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                        TourSelectMatchScreen$lambda$142$lambda$140$lambda$139 = TourOverlayKt.TourSelectMatchScreen$lambda$142$lambda$140$lambda$139(TourState.this, function152);
                        return TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(zIndex2, false, null, null, (Function0) rememberedValue, 7, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
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
                if (ComposerKt.isTraceInProgress()) {
                }
                function13 = function152;
                modifier3 = modifier52;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            final Function1 function1522 = function14;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ProvidableCompositionLocal<Configuration> localConfiguration32 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localConfiguration32);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl32 = Dp.m7774constructorimpl(((Configuration) consume42).screenHeightDp);
            ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localConfiguration222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl222 = Dp.m7774constructorimpl(((Configuration) consume222).screenWidthDp);
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f22 = 180;
            TourOverlayKt$TourSelectMatchScreen$1$ItemPosition tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22 = new TourOverlayKt$TourSelectMatchScreen$1$ItemPosition(Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(f22), m7774constructorimpl222, Dp.m7774constructorimpl(130), Dp.m7774constructorimpl(0.5f * m7774constructorimpl222), Dp.m7774constructorimpl(Dp.m7774constructorimpl(f22) + Dp.m7774constructorimpl(75)), null);
            Log.d("TourSelectMatchScreen", "Using manual position: left=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getLeft()) + ", top=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getTop()) + ", width=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getWidth()) + ", height=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getHeight()) + ", centerX=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getCenterX()) + ", centerY=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getCenterY()));
            Modifier modifier522 = modifier4;
            SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl32 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
            Modifier zIndex22 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getLeft(), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getTop()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getWidth()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition22.getHeight()), 2000.0f);
            startRestartGroup.startReplaceGroup(-1633490746);
            z = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | ((i3 & 7168) != 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                    TourSelectMatchScreen$lambda$142$lambda$140$lambda$139 = TourOverlayKt.TourSelectMatchScreen$lambda$142$lambda$140$lambda$139(TourState.this, function1522);
                    return TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(zIndex22, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
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
            if (ComposerKt.isTraceInProgress()) {
            }
            function13 = function1522;
            modifier3 = modifier522;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        final Function1 function15222 = function14;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Configuration> localConfiguration322 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localConfiguration322);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl322 = Dp.m7774constructorimpl(((Configuration) consume422).screenHeightDp);
        ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localConfiguration2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl2222 = Dp.m7774constructorimpl(((Configuration) consume2222).screenWidthDp);
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f222 = 180;
        TourOverlayKt$TourSelectMatchScreen$1$ItemPosition tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222 = new TourOverlayKt$TourSelectMatchScreen$1$ItemPosition(Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(f222), m7774constructorimpl2222, Dp.m7774constructorimpl(130), Dp.m7774constructorimpl(0.5f * m7774constructorimpl2222), Dp.m7774constructorimpl(Dp.m7774constructorimpl(f222) + Dp.m7774constructorimpl(75)), null);
        Log.d("TourSelectMatchScreen", "Using manual position: left=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getLeft()) + ", top=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getTop()) + ", width=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getWidth()) + ", height=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getHeight()) + ", centerX=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getCenterX()) + ", centerY=" + Dp.m7785toStringimpl(tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getCenterY()));
        Modifier modifier5222 = modifier4;
        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl322 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
        Modifier zIndex222 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getLeft(), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getTop()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getWidth()), tourOverlayKt$TourSelectMatchScreen$1$ItemPosition222.getHeight()), 2000.0f);
        startRestartGroup.startReplaceGroup(-1633490746);
        z = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | ((i3 & 7168) != 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
                TourSelectMatchScreen$lambda$142$lambda$140$lambda$139 = TourOverlayKt.TourSelectMatchScreen$lambda$142$lambda$140$lambda$139(TourState.this, function15222);
                return TourSelectMatchScreen$lambda$142$lambda$140$lambda$139;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default222 = ClickableKt.m1059clickableXHw0xAI$default(zIndex222, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
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
        if (ComposerKt.isTraceInProgress()) {
        }
        function13 = function15222;
        modifier3 = modifier5222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectMatchScreen$lambda$142$lambda$140$lambda$139(TourState tourState, Function1 function1) {
        Long selectedMatchId = tourState.getSelectedMatchId();
        if (selectedMatchId == null) {
            selectedMatchId = tourState.getTourMatchId();
        }
        if (selectedMatchId != null) {
            Log.d("TourFlow", "TourSelectMatchScreen - Click on match item area, matchId: " + selectedMatchId);
            if (function1 != null) {
                function1.invoke(selectedMatchId);
            }
        } else {
            Log.w("TourFlow", "TourSelectMatchScreen - No match ID available for click");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourSelectBetScreen(final String str, final String str2, final TourState tourState, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Rect betSectionBounds;
        String str3;
        TourOverlayKt$TourSelectBetScreen$1$ItemPosition tourOverlayKt$TourSelectBetScreen$1$ItemPosition;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(201930077);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(tourState) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Function0<Unit> function04 = i4 == 0 ? null : function02;
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201930077, i3, -1, "org.betup.ui.tour.compose.TourSelectBetScreen (TourOverlay.kt:1713)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        final Function0<Unit> function05 = function04;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl = Dp.m7774constructorimpl(((Configuration) consume).screenHeightDp);
                        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl2 = Dp.m7774constructorimpl(((Configuration) consume2).screenWidthDp);
                        betSectionBounds = tourState.getBetSectionBounds();
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume3;
                        if (betSectionBounds == null) {
                            float mo1163toDpu2uoSUM = density.mo1163toDpu2uoSUM(betSectionBounds.left);
                            float mo1163toDpu2uoSUM2 = density.mo1163toDpu2uoSUM(betSectionBounds.top);
                            float mo1163toDpu2uoSUM3 = density.mo1163toDpu2uoSUM(betSectionBounds.width());
                            float mo1163toDpu2uoSUM4 = density.mo1163toDpu2uoSUM(betSectionBounds.height());
                            float m7774constructorimpl3 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM + Dp.m7774constructorimpl(mo1163toDpu2uoSUM3 * 0.5f));
                            float m7774constructorimpl4 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM2 + Dp.m7774constructorimpl(0.5f * mo1163toDpu2uoSUM4));
                            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            Log.d("TourSelectBetScreen", "Using real bounds: left=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM) + ", top=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM2) + ", width=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM3) + ", height=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM4) + ", centerX=" + Dp.m7785toStringimpl(m7774constructorimpl3) + ", centerY=" + Dp.m7785toStringimpl(m7774constructorimpl4));
                            tourOverlayKt$TourSelectBetScreen$1$ItemPosition = new TourOverlayKt$TourSelectBetScreen$1$ItemPosition(mo1163toDpu2uoSUM, mo1163toDpu2uoSUM2, mo1163toDpu2uoSUM3, mo1163toDpu2uoSUM4, m7774constructorimpl3, m7774constructorimpl4, null);
                        } else {
                            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            float m7774constructorimpl5 = Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(32));
                            float m7774constructorimpl6 = Dp.m7774constructorimpl(16);
                            float m7774constructorimpl7 = Dp.m7774constructorimpl(80);
                            float m7774constructorimpl8 = Dp.m7774constructorimpl(0.3f * m7774constructorimpl);
                            float m7774constructorimpl9 = Dp.m7774constructorimpl(m7774constructorimpl6 + Dp.m7774constructorimpl(m7774constructorimpl5 * 0.5f));
                            float m7774constructorimpl10 = Dp.m7774constructorimpl(m7774constructorimpl8 + Dp.m7774constructorimpl(0.5f * m7774constructorimpl7));
                            Log.d("TourSelectBetScreen", "Using calculated position: left=" + Dp.m7785toStringimpl(m7774constructorimpl6) + ", top=" + Dp.m7785toStringimpl(m7774constructorimpl8) + ", width=" + Dp.m7785toStringimpl(m7774constructorimpl5) + ", height=" + Dp.m7785toStringimpl(m7774constructorimpl7) + ", centerX=" + Dp.m7785toStringimpl(m7774constructorimpl9) + ", centerY=" + Dp.m7785toStringimpl(m7774constructorimpl10));
                            tourOverlayKt$TourSelectBetScreen$1$ItemPosition = new TourOverlayKt$TourSelectBetScreen$1$ItemPosition(m7774constructorimpl6, m7774constructorimpl8, m7774constructorimpl5, m7774constructorimpl7, m7774constructorimpl9, m7774constructorimpl10, null);
                        }
                        String str4 = str3;
                        Modifier modifier4 = modifier2;
                        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                        Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getHeight()), 2000.0f);
                        startRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 7168) != 2048;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda39
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                                    TourSelectBetScreen$lambda$151$lambda$149$lambda$148 = TourOverlayKt.TourSelectBetScreen$lambda$151$lambda$149$lambda$148(Function0.this);
                                    return TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(zIndex, false, null, null, (Function0) rememberedValue, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function05;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function03 = function02;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TourSelectBetScreen$lambda$152;
                                TourSelectBetScreen$lambda$152 = TourOverlayKt.TourSelectBetScreen$lambda$152(str, str2, tourState, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TourSelectBetScreen$lambda$152;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                final Function0 function052 = function04;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl11 = Dp.m7774constructorimpl(((Configuration) consume4).screenHeightDp);
                ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localConfiguration22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl22 = Dp.m7774constructorimpl(((Configuration) consume22).screenWidthDp);
                betSectionBounds = tourState.getBetSectionBounds();
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume32;
                if (betSectionBounds == null) {
                }
                String str42 = str3;
                Modifier modifier42 = modifier2;
                SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl22 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl11 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                Modifier zIndex2 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getHeight()), 2000.0f);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 7168) != 2048) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                        TourSelectBetScreen$lambda$151$lambda$149$lambda$148 = TourOverlayKt.TourSelectBetScreen$lambda$151$lambda$149$lambda$148(Function0.this);
                        return TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(zIndex2, false, null, null, (Function0) rememberedValue, 7, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str42);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
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
                if (ComposerKt.isTraceInProgress()) {
                }
                function03 = function052;
                modifier3 = modifier42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            final Function0 function0522 = function04;
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ProvidableCompositionLocal<Configuration> localConfiguration32 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localConfiguration32);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl112 = Dp.m7774constructorimpl(((Configuration) consume42).screenHeightDp);
            ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localConfiguration222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl222 = Dp.m7774constructorimpl(((Configuration) consume222).screenWidthDp);
            betSectionBounds = tourState.getBetSectionBounds();
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume322;
            if (betSectionBounds == null) {
            }
            String str422 = str3;
            Modifier modifier422 = modifier2;
            SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl112 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
            Modifier zIndex22 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getHeight()), 2000.0f);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                    TourSelectBetScreen$lambda$151$lambda$149$lambda$148 = TourOverlayKt.TourSelectBetScreen$lambda$151$lambda$149$lambda$148(Function0.this);
                    return TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(zIndex22, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str422);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
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
            if (ComposerKt.isTraceInProgress()) {
            }
            function03 = function0522;
            modifier3 = modifier422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        final Function0 function05222 = function04;
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Configuration> localConfiguration322 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localConfiguration322);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl1122 = Dp.m7774constructorimpl(((Configuration) consume422).screenHeightDp);
        ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localConfiguration2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl2222 = Dp.m7774constructorimpl(((Configuration) consume2222).screenWidthDp);
        betSectionBounds = tourState.getBetSectionBounds();
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume3222;
        if (betSectionBounds == null) {
        }
        String str4222 = str3;
        Modifier modifier4222 = modifier2;
        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl1122 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
        Modifier zIndex222 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectBetScreen$1$ItemPosition.getHeight()), 2000.0f);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
                TourSelectBetScreen$lambda$151$lambda$149$lambda$148 = TourOverlayKt.TourSelectBetScreen$lambda$151$lambda$149$lambda$148(Function0.this);
                return TourSelectBetScreen$lambda$151$lambda$149$lambda$148;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default222 = ClickableKt.m1059clickableXHw0xAI$default(zIndex222, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4222);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
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
        if (ComposerKt.isTraceInProgress()) {
        }
        function03 = function05222;
        modifier3 = modifier4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectBetScreen$lambda$151$lambda$149$lambda$148(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourSelectSportScreen(final String str, final String str2, final TourState tourState, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Rect sportItemBounds;
        String str3;
        TourOverlayKt$TourSelectSportScreen$1$ItemPosition tourOverlayKt$TourSelectSportScreen$1$ItemPosition;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(61759936);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(tourState) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Function0<Unit> function04 = i4 == 0 ? null : function02;
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(61759936, i3, -1, "org.betup.ui.tour.compose.TourSelectSportScreen (TourOverlay.kt:1805)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        final Function0<Unit> function05 = function04;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl = Dp.m7774constructorimpl(((Configuration) consume).screenHeightDp);
                        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m7774constructorimpl2 = Dp.m7774constructorimpl(((Configuration) consume2).screenWidthDp);
                        sportItemBounds = tourState.getSportItemBounds();
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume3;
                        if (sportItemBounds == null) {
                            float mo1163toDpu2uoSUM = density.mo1163toDpu2uoSUM(sportItemBounds.left);
                            float mo1163toDpu2uoSUM2 = density.mo1163toDpu2uoSUM(sportItemBounds.top);
                            float mo1163toDpu2uoSUM3 = density.mo1163toDpu2uoSUM(sportItemBounds.width());
                            float mo1163toDpu2uoSUM4 = density.mo1163toDpu2uoSUM(sportItemBounds.height());
                            float m7774constructorimpl3 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM + Dp.m7774constructorimpl(mo1163toDpu2uoSUM3 * 0.5f));
                            float m7774constructorimpl4 = Dp.m7774constructorimpl(mo1163toDpu2uoSUM2 + Dp.m7774constructorimpl(0.5f * mo1163toDpu2uoSUM4));
                            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            Log.d("TourSelectSportScreen", "Using real bounds: left=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM) + ", top=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM2) + ", width=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM3) + ", height=" + Dp.m7785toStringimpl(mo1163toDpu2uoSUM4) + ", centerX=" + Dp.m7785toStringimpl(m7774constructorimpl3) + ", centerY=" + Dp.m7785toStringimpl(m7774constructorimpl4));
                            tourOverlayKt$TourSelectSportScreen$1$ItemPosition = new TourOverlayKt$TourSelectSportScreen$1$ItemPosition(mo1163toDpu2uoSUM, mo1163toDpu2uoSUM2, mo1163toDpu2uoSUM3, mo1163toDpu2uoSUM4, m7774constructorimpl3, m7774constructorimpl4, null);
                        } else {
                            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            float m7774constructorimpl5 = Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(32));
                            float m7774constructorimpl6 = Dp.m7774constructorimpl(16);
                            float m7774constructorimpl7 = Dp.m7774constructorimpl(60);
                            float m7774constructorimpl8 = Dp.m7774constructorimpl(0.3f * m7774constructorimpl);
                            float m7774constructorimpl9 = Dp.m7774constructorimpl(m7774constructorimpl6 + Dp.m7774constructorimpl(m7774constructorimpl5 * 0.5f));
                            float m7774constructorimpl10 = Dp.m7774constructorimpl(m7774constructorimpl8 + Dp.m7774constructorimpl(0.5f * m7774constructorimpl7));
                            Log.d("TourSelectSportScreen", "Using calculated position: left=" + Dp.m7785toStringimpl(m7774constructorimpl6) + ", top=" + Dp.m7785toStringimpl(m7774constructorimpl8) + ", width=" + Dp.m7785toStringimpl(m7774constructorimpl5) + ", height=" + Dp.m7785toStringimpl(m7774constructorimpl7) + ", centerX=" + Dp.m7785toStringimpl(m7774constructorimpl9) + ", centerY=" + Dp.m7785toStringimpl(m7774constructorimpl10));
                            tourOverlayKt$TourSelectSportScreen$1$ItemPosition = new TourOverlayKt$TourSelectSportScreen$1$ItemPosition(m7774constructorimpl6, m7774constructorimpl8, m7774constructorimpl5, m7774constructorimpl7, m7774constructorimpl9, m7774constructorimpl10, null);
                        }
                        String str4 = str3;
                        Modifier modifier4 = modifier2;
                        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                        Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getHeight()), 2000.0f);
                        startRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 7168) != 2048;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda57
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                                    TourSelectSportScreen$lambda$160$lambda$158$lambda$157 = TourOverlayKt.TourSelectSportScreen$lambda$160$lambda$158$lambda$157(Function0.this);
                                    return TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(zIndex, false, null, null, (Function0) rememberedValue, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function05;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function03 = function02;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda58
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TourSelectSportScreen$lambda$161;
                                TourSelectSportScreen$lambda$161 = TourOverlayKt.TourSelectSportScreen$lambda$161(str, str2, tourState, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TourSelectSportScreen$lambda$161;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                final Function0 function052 = function04;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl11 = Dp.m7774constructorimpl(((Configuration) consume4).screenHeightDp);
                ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localConfiguration22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m7774constructorimpl22 = Dp.m7774constructorimpl(((Configuration) consume22).screenWidthDp);
                sportItemBounds = tourState.getSportItemBounds();
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume32;
                if (sportItemBounds == null) {
                }
                String str42 = str3;
                Modifier modifier42 = modifier2;
                SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl22 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl11 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
                Modifier zIndex2 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getHeight()), 2000.0f);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 7168) != 2048) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                        TourSelectSportScreen$lambda$160$lambda$158$lambda$157 = TourOverlayKt.TourSelectSportScreen$lambda$160$lambda$158$lambda$157(Function0.this);
                        return TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(zIndex2, false, null, null, (Function0) rememberedValue, 7, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str42);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
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
                if (ComposerKt.isTraceInProgress()) {
                }
                function03 = function052;
                modifier3 = modifier42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            final Function0 function0522 = function04;
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ProvidableCompositionLocal<Configuration> localConfiguration32 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localConfiguration32);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl112 = Dp.m7774constructorimpl(((Configuration) consume42).screenHeightDp);
            ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localConfiguration222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7774constructorimpl222 = Dp.m7774constructorimpl(((Configuration) consume222).screenWidthDp);
            sportItemBounds = tourState.getSportItemBounds();
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume322;
            if (sportItemBounds == null) {
            }
            String str422 = str3;
            Modifier modifier422 = modifier2;
            SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl112 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
            Modifier zIndex22 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getHeight()), 2000.0f);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                    TourSelectSportScreen$lambda$160$lambda$158$lambda$157 = TourOverlayKt.TourSelectSportScreen$lambda$160$lambda$158$lambda$157(Function0.this);
                    return TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(zIndex22, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str422);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
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
            if (ComposerKt.isTraceInProgress()) {
            }
            function03 = function0522;
            modifier3 = modifier422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        final Function0 function05222 = function04;
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Configuration> localConfiguration322 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localConfiguration322);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl1122 = Dp.m7774constructorimpl(((Configuration) consume422).screenHeightDp);
        ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localConfiguration2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m7774constructorimpl2222 = Dp.m7774constructorimpl(((Configuration) consume2222).screenWidthDp);
        sportItemBounds = tourState.getSportItemBounds();
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume3222;
        if (sportItemBounds == null) {
        }
        String str4222 = str3;
        Modifier modifier4222 = modifier2;
        SpeechBubbleWithTip(str, str2, TipPosition.RIGHT, SizeKt.m1570widthInVpY3zN4$default(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(m7774constructorimpl2222 - Dp.m7774constructorimpl(320)), Dp.m7774constructorimpl(m7774constructorimpl1122 * 0.6f)), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i3 & 112), 0);
        Modifier zIndex222 = ZIndexModifierKt.zIndex(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getLeft(), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getTop()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getWidth()), tourOverlayKt$TourSelectSportScreen$1$ItemPosition.getHeight()), 2000.0f);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
                TourSelectSportScreen$lambda$160$lambda$158$lambda$157 = TourOverlayKt.TourSelectSportScreen$lambda$160$lambda$158$lambda$157(Function0.this);
                return TourSelectSportScreen$lambda$160$lambda$158$lambda$157;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default222 = ClickableKt.m1059clickableXHw0xAI$default(zIndex222, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4222);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
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
        if (ComposerKt.isTraceInProgress()) {
        }
        function03 = function05222;
        modifier3 = modifier4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSelectSportScreen$lambda$160$lambda$158$lambda$157(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TourInstructionScreen(final String str, final String str2, final TourCharacterPosition tourCharacterPosition, final boolean z, final TourCharacterPosition tourCharacterPosition2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-364807915);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((65555 & i3) == 65554 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-364807915, i3, -1, "org.betup.ui.tour.compose.TourInstructionScreen (TourOverlay.kt:1898)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                float f = 16;
                SpeechBubble(str, str2, SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100), Dp.m7774constructorimpl(f), 0.0f, 8, null), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, i3 & 126, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourInstructionScreen$lambda$163;
                        TourInstructionScreen$lambda$163 = TourOverlayKt.TourInstructionScreen$lambda$163(str, str2, tourCharacterPosition, z, tourCharacterPosition2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TourInstructionScreen$lambda$163;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((65555 & i3) == 65554) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        float f2 = 16;
        SpeechBubble(str, str2, SizeKt.m1570widthInVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(100), Dp.m7774constructorimpl(f2), 0.0f, 8, null), 0.0f, Dp.m7774constructorimpl(300), 1, null), startRestartGroup, i3 & 126, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpeechBubbleWithTip(final String str, final String str2, final TipPosition tipPosition, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int i4;
        float m7774constructorimpl;
        int i5;
        float m7774constructorimpl2;
        int i6;
        float m7774constructorimpl3;
        int i7;
        float m7774constructorimpl4;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        List split$default;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-203227110);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(tipPosition.ordinal()) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-203227110, i3, -1, "org.betup.ui.tour.compose.SpeechBubbleWithTip (TourOverlay.kt:1937)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion = Modifier.INSTANCE;
                long m5205getWhite0d7_KjU = Color.INSTANCE.m5205getWhite0d7_KjU();
                i4 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
                if (i4 != 1 || i4 == 2) {
                    m7774constructorimpl = Dp.m7774constructorimpl(0);
                } else {
                    m7774constructorimpl = Dp.m7774constructorimpl(24);
                }
                i5 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
                if (i5 != 2 || i5 == 3) {
                    m7774constructorimpl2 = Dp.m7774constructorimpl(0);
                } else {
                    m7774constructorimpl2 = Dp.m7774constructorimpl(24);
                }
                i6 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
                if (i6 != 4 || i6 == 5) {
                    m7774constructorimpl3 = Dp.m7774constructorimpl(0);
                } else {
                    m7774constructorimpl3 = Dp.m7774constructorimpl(24);
                }
                i7 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
                if (i7 != 5 || i7 == 6 || i7 == 7) {
                    m7774constructorimpl4 = Dp.m7774constructorimpl(0);
                } else {
                    m7774constructorimpl4 = Dp.m7774constructorimpl(24);
                }
                Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(companion, m5205getWhite0d7_KjU, RoundedCornerShapeKt.m1811RoundedCornerShapea9UjIt4(m7774constructorimpl, m7774constructorimpl2, m7774constructorimpl4, m7774constructorimpl3)), Dp.m7774constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                split$default = StringsKt.split$default((CharSequence) str, new String[]{"BETUP"}, true, 0, 4, (Object) null);
                int i9 = 1;
                if (split$default.size() <= 1) {
                    builder.append((String) split$default.get(0));
                    int pushStyle = builder.pushStyle(new SpanStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append("BETUP");
                        Unit unit = Unit.INSTANCE;
                        builder.pop(pushStyle);
                        i9 = 1;
                        if (split$default.size() > 1) {
                            builder.append((String) split$default.get(1));
                        }
                    } catch (Throwable th) {
                        builder.pop(pushStyle);
                        throw th;
                    }
                } else {
                    builder.append(str);
                }
                int i10 = i9;
                Modifier modifier5 = modifier4;
                TextKt.m2643TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i10, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 3, 0, null, null, null, startRestartGroup, 200112, 3120, 251344);
                TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i10, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 4, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 3120, 120304);
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda64
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SpeechBubbleWithTip$lambda$168;
                        SpeechBubbleWithTip$lambda$168 = TourOverlayKt.SpeechBubbleWithTip$lambda$168(str, str2, tipPosition, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SpeechBubbleWithTip$lambda$168;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        long m5205getWhite0d7_KjU2 = Color.INSTANCE.m5205getWhite0d7_KjU();
        i4 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
        if (i4 != 1) {
        }
        m7774constructorimpl = Dp.m7774constructorimpl(0);
        i5 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
        if (i5 != 2) {
        }
        m7774constructorimpl2 = Dp.m7774constructorimpl(0);
        i6 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
        if (i6 != 4) {
        }
        m7774constructorimpl3 = Dp.m7774constructorimpl(0);
        i7 = WhenMappings.$EnumSwitchMapping$3[tipPosition.ordinal()];
        if (i7 != 5) {
        }
        m7774constructorimpl4 = Dp.m7774constructorimpl(0);
        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(companion2, m5205getWhite0d7_KjU2, RoundedCornerShapeKt.m1811RoundedCornerShapea9UjIt4(m7774constructorimpl, m7774constructorimpl2, m7774constructorimpl4, m7774constructorimpl3)), Dp.m7774constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        split$default = StringsKt.split$default((CharSequence) str, new String[]{"BETUP"}, true, 0, 4, (Object) null);
        int i92 = 1;
        if (split$default.size() <= 1) {
        }
        int i102 = i92;
        Modifier modifier52 = modifier4;
        TextKt.m2643TextIbK3jfQ(builder2.toAnnotatedString(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i102, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 3, 0, null, null, null, startRestartGroup, 200112, 3120, 251344);
        TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i102, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 4, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 3120, 120304);
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
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SpeechBubble(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1721915291);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1721915291, i3, -1, "org.betup.ui.tour.compose.SpeechBubble (TourOverlay.kt:2022)");
                    }
                    float f = 16;
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(modifier4, Color.INSTANCE.m5205getWhite0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifier5 = modifier4;
                    TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200112, 0, 130512);
                    TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 0, 130544);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda54
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SpeechBubble$lambda$170;
                            SpeechBubble$lambda$170 = TourOverlayKt.SpeechBubble$lambda$170(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SpeechBubble$lambda$170;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & Opcodes.I2S) == 146) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f2 = 16;
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(modifier4, Color.INSTANCE.m5205getWhite0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), Dp.m7774constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifier52 = modifier4;
            TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200112, 0, 130512);
            TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 0, 130544);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f22 = 16;
        Modifier m1516padding3ABfNKs22 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(modifier4, Color.INSTANCE.m5205getWhite0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22))), Dp.m7774constructorimpl(f22));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        Modifier modifier522 = modifier4;
        TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200112, 0, 130512);
        TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 0, 130544);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void TourIntroV2FirstPage(final long j, final long j2, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(756995311);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(756995311, i2, -1, "org.betup.ui.tour.compose.TourIntroV2FirstPage (TourOverlay.kt:2061)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(32));
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1517paddingVpY3zN4, false, null, null, (Function0) rememberedValue, 6, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$TourOverlayKt.INSTANCE.getLambda$519000603$app_release(), ComposableLambdaKt.rememberComposableLambda(-1960479204, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourIntroV2FirstPage$1$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    float f;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    Composer composer3;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1960479204, i3, -1, "org.betup.ui.tour.compose.TourIntroV2FirstPage.<anonymous>.<anonymous>.<anonymous> (TourOverlay.kt:2082)");
                    }
                    float f2 = 12;
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null);
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    Function0<Unit> function03 = function0;
                    long j3 = j;
                    Function0<Unit> function04 = function02;
                    long j4 = j2;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.tour_first_big, composer2, 6), (String) null, SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), Dp.m7774constructorimpl(LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                    float f3 = 16;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_take_quick_app_tour, composer2, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 130512);
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 13, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                    Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, StringResources_androidKt.stringResource(R.string.tour_skip_tour, composer2, 6), false, false, false, function03, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 54, 0, 0, 2097080);
                    int i4 = 6;
                    float f4 = 6;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer2, 6);
                    if (j3 > 0) {
                        composer2.startReplaceGroup(-1159239415);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        str = "C101@5232L9:Row.kt#2w3rfo";
                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                        f = f4;
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_intro_reward_amount, new Object[]{FormatHelper.getDialogBetcoinsFormated(j3)}, composer2, 6) + " ", (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                        composer3 = composer2;
                        i4 = 6;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer3, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceGroup();
                    } else {
                        f = f4;
                        str = "C101@5232L9:Row.kt#2w3rfo";
                        str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        composer3 = composer2;
                        composer3.startReplaceGroup(-1158049232);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), composer3, 6);
                        composer2.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4, composer3, 48);
                    String str5 = str2;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str5);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, weight$default2);
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    String str6 = str4;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.tour_take_tour, composer3, i4), false, false, false, function04, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 54, 0, 0, 2097080);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer2, 6);
                    if (j4 > 0) {
                        composer2.startReplaceGroup(-2030132727);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str3);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically2, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion2);
                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str6);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor8);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                        }
                        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, str);
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_intro_reward_amount, new Object[]{FormatHelper.getDialogBetcoinsFormated(j4)}, composer2, 6) + " ", (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-2028933895);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), composer2, 6);
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
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableSingletons$TourOverlayKt.INSTANCE.m14344getLambda$144991715$app_release(), false, true, null, false, startRestartGroup, 224694, 192);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourIntroV2FirstPage$lambda$175;
                    TourIntroV2FirstPage$lambda$175 = TourOverlayKt.TourIntroV2FirstPage$lambda$175(j, j2, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourIntroV2FirstPage$lambda$175;
                }
            });
        }
    }

    private static final void TourSkipConfirmationDialog(final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1073175042);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1073175042, i2, -1, "org.betup.ui.tour.compose.TourSkipConfirmationDialog (TourOverlay.kt:2203)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourSkipConfirmationDialog$lambda$177$lambda$176;
                        TourSkipConfirmationDialog$lambda$177$lambda$176 = TourOverlayKt.TourSkipConfirmationDialog$lambda$177$lambda$176(Function0.this);
                        return TourSkipConfirmationDialog$lambda$177$lambda$176;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier zIndex = ZIndexModifierKt.zIndex(ClickableKt.m1059clickableXHw0xAI$default(m1025backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue, 7, null), 2000.0f);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, zIndex);
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
            float f = 32;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier zIndex2 = ZIndexModifierKt.zIndex(ClickableKt.m1059clickableXHw0xAI$default(m1517paddingVpY3zN4, false, null, null, (Function0) rememberedValue2, 6, null), 2001.0f);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, zIndex2);
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
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), function03, null, null, false, false, false, startRestartGroup, ((i2 >> 3) & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$TourOverlayKt.INSTANCE.m14346getLambda$1738960342$app_release(), ComposableSingletons$TourOverlayKt.INSTANCE.getLambda$424341867$app_release(), ComposableLambdaKt.rememberComposableLambda(-1707323220, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourOverlayKt$TourSkipConfirmationDialog$2$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1707323220, i3, -1, "org.betup.ui.tour.compose.TourSkipConfirmationDialog.<anonymous>.<anonymous>.<anonymous> (TourOverlay.kt:2236)");
                    }
                    float f2 = 16;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2));
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
                    Function0<Unit> function04 = function02;
                    Function0<Unit> function05 = function0;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 6);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, StringResources_androidKt.stringResource(R.string.no, composer3, 6), false, false, false, function04, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 48, 0, 0, 2097080);
                    CommonButtonKt.m12915CommonButtonUPEs2M4(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), true, StringResources_androidKt.stringResource(R.string.yes, composer3, 6), false, false, false, function05, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 48, 0, 0, 2097080);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), false, true, null, false, composer2, 224694, 192);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(65)), composer2, 6);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourSkipConfirmationDialog$lambda$182;
                    TourSkipConfirmationDialog$lambda$182 = TourOverlayKt.TourSkipConfirmationDialog$lambda$182(Function0.this, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourSkipConfirmationDialog$lambda$182;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourSkipConfirmationDialog$lambda$177$lambda$176(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void SpeechBubblePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(870456460);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(870456460, i, -1, "org.betup.ui.tour.compose.SpeechBubblePreview (TourOverlay.kt:2288)");
            }
            SpeechBubble("Hi! Welcome to BETUP", "Get ready to test your luck and strategy in this exciting betting experience.", PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SpeechBubblePreview$lambda$183;
                    SpeechBubblePreview$lambda$183 = TourOverlayKt.SpeechBubblePreview$lambda$183(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SpeechBubblePreview$lambda$183;
                }
            });
        }
    }

    private static final void TourWelcomeScreenLeftPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1600602695);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1600602695, i, -1, "org.betup.ui.tour.compose.TourWelcomeScreenLeftPreview (TourOverlay.kt:2298)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourCharacterPosition tourCharacterPosition = TourCharacterPosition.LEFT;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            TourWelcomeScreen("Hi! Welcome to BETUP", "Get ready to test your luck and strategy in this exciting betting experience.", tourCharacterPosition, (Function0) rememberedValue, true, null, startRestartGroup, 28086, 32);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourWelcomeScreenLeftPreview$lambda$187;
                    TourWelcomeScreenLeftPreview$lambda$187 = TourOverlayKt.TourWelcomeScreenLeftPreview$lambda$187(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourWelcomeScreenLeftPreview$lambda$187;
                }
            });
        }
    }

    private static final void TourWelcomeScreenRightPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1721524652);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1721524652, i, -1, "org.betup.ui.tour.compose.TourWelcomeScreenRightPreview (TourOverlay.kt:2316)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourCharacterPosition tourCharacterPosition = TourCharacterPosition.RIGHT;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            TourWelcomeScreen("Let's discover together", "What it takes to enjoy the thrill of a winner's success!", tourCharacterPosition, (Function0) rememberedValue, true, null, startRestartGroup, 28086, 32);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourWelcomeScreenRightPreview$lambda$191;
                    TourWelcomeScreenRightPreview$lambda$191 = TourOverlayKt.TourWelcomeScreenRightPreview$lambda$191(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourWelcomeScreenRightPreview$lambda$191;
                }
            });
        }
    }

    private static final void TourWelcomeScreenBottomCenterPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(221042752);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221042752, i, -1, "org.betup.ui.tour.compose.TourWelcomeScreenBottomCenterPreview (TourOverlay.kt:2338)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourCharacterPosition tourCharacterPosition = TourCharacterPosition.BOTTOM_CENTER;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            TourWelcomeScreen("Congratulations!", "You've placed your first bet! Let the game begin!", tourCharacterPosition, (Function0) rememberedValue, true, null, startRestartGroup, 28086, 32);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourWelcomeScreenBottomCenterPreview$lambda$195;
                    TourWelcomeScreenBottomCenterPreview$lambda$195 = TourOverlayKt.TourWelcomeScreenBottomCenterPreview$lambda$195(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourWelcomeScreenBottomCenterPreview$lambda$195;
                }
            });
        }
    }

    private static final void TourHighlightScreenSportButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1316806716);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1316806716, i, -1, "org.betup.ui.tour.compose.TourHighlightScreenSportButtonPreview (TourOverlay.kt:2360)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourHighlightScreen("Click the Sport button", "to get started", TourCharacterPosition.BOTTOM_CENTER, TourHighlightElement.SPORT_BUTTON, null, startRestartGroup, 3510, 16);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourHighlightScreenSportButtonPreview$lambda$197;
                    TourHighlightScreenSportButtonPreview$lambda$197 = TourOverlayKt.TourHighlightScreenSportButtonPreview$lambda$197(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourHighlightScreenSportButtonPreview$lambda$197;
                }
            });
        }
    }

    private static final void TourHighlightScreenSportItemPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1036801467);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1036801467, i, -1, "org.betup.ui.tour.compose.TourHighlightScreenSportItemPreview (TourOverlay.kt:2381)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourHighlightScreen("Pick your favorite sport", "and select it", TourCharacterPosition.LEFT, TourHighlightElement.SPORT_ITEM, null, startRestartGroup, 3510, 16);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourHighlightScreenSportItemPreview$lambda$199;
                    TourHighlightScreenSportItemPreview$lambda$199 = TourOverlayKt.TourHighlightScreenSportItemPreview$lambda$199(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourHighlightScreenSportItemPreview$lambda$199;
                }
            });
        }
    }

    private static final void TourHighlightScreenLeagueItemPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1430370668);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1430370668, i, -1, "org.betup.ui.tour.compose.TourHighlightScreenLeagueItemPreview (TourOverlay.kt:2402)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourHighlightScreen("Choose the league", "that interests you", TourCharacterPosition.LEFT, TourHighlightElement.LEAGUE_ITEM, null, startRestartGroup, 3510, 16);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourHighlightScreenLeagueItemPreview$lambda$201;
                    TourHighlightScreenLeagueItemPreview$lambda$201 = TourOverlayKt.TourHighlightScreenLeagueItemPreview$lambda$201(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourHighlightScreenLeagueItemPreview$lambda$201;
                }
            });
        }
    }

    private static final void TourInstructionScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1614011924);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614011924, i, -1, "org.betup.ui.tour.compose.TourInstructionScreenPreview (TourOverlay.kt:2419)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourInstructionScreen("Select the match", "you want to bet on", TourCharacterPosition.LEFT, true, TourCharacterPosition.CENTER, null, startRestartGroup, 28086, 32);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourInstructionScreenPreview$lambda$203;
                    TourInstructionScreenPreview$lambda$203 = TourOverlayKt.TourInstructionScreenPreview$lambda$203(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourInstructionScreenPreview$lambda$203;
                }
            });
        }
    }

    private static final void TourInstructionScreenPlaceBetPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(921474730);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(921474730, i, -1, "org.betup.ui.tour.compose.TourInstructionScreenPlaceBetPreview (TourOverlay.kt:2441)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            TourInstructionScreen("Enter the amount of BetCoins", "you want to wager and place your bet!", TourCharacterPosition.BOTTOM_CENTER, true, TourCharacterPosition.CENTER, null, startRestartGroup, 28086, 32);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourOverlayKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourInstructionScreenPlaceBetPreview$lambda$205;
                    TourInstructionScreenPlaceBetPreview$lambda$205 = TourOverlayKt.TourInstructionScreenPlaceBetPreview$lambda$205(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourInstructionScreenPlaceBetPreview$lambda$205;
                }
            });
        }
    }

    private static final float TourWelcomeScreen$lambda$84(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float TourWelcomeScreen$lambda$85(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float TourNextButton$lambda$98(State<Float> state) {
        return state.getValue().floatValue();
    }
}
