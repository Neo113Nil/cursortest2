package org.betup.ui.dialogs.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import io.sentry.SentryBaseEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.challenges.NewChallengeBetDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetTypeGroupModel;
import org.betup.model.remote.entity.challenges.NewChallengeMatchModel;
import org.betup.model.remote.entity.challenges.NewChallengeParticipantModel;
import org.betup.model.remote.entity.challenges.NewChallengeTeamModel;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BattleBetHighlightStyle;
import org.betup.utils.BattleBetOutcomeResolverKt;
import org.betup.utils.BattleOutcomeMessage;
import org.betup.utils.FormatHelper;
import org.betup.utils.OddHelper;
import org.betup.utils.OrderedBattleParticipants;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BattleResultComponents.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a3\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u001b\u001a1\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001a_\u0010 \u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'\u001a1\u0010(\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010)\u001a=\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u0019\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u00020$H\u0003¢\u0006\u0004\b3\u00104\u001aM\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0002\u0010:\u001aS\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010@\u001a\u00020\u001e2\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010A\u001ak\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"2\b\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00102\u0014\b\u0002\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010KH\u0007¢\u0006\u0002\u0010L\u001aQ\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"2\u0006\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010P\u001a'\u0010Q\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010R\u001a\u008a\u0001\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00102!\u0010[\u001a\u001d\u0012\u0013\u0012\u001107¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\u00010KH\u0007¢\u0006\u0002\u0010_\u001a¼\u0001\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020b2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"2\b\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010F\u001a\u00020\"2\b\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010V\u001a\u00020W2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u00102\u0006\u0010e\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010f\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00032!\u0010[\u001a\u001d\u0012\u0013\u0012\u001107¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\u00010KH\u0003¢\u0006\u0002\u0010g\u001a=\u0010h\u001a\u00020\u00012\u0006\u0010i\u001a\u00020j2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010m\u001a\u00020nH\u0002\u001aM\u0010o\u001a\u00020\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010.2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010p\u001ai\u0010q\u001a\u00020\u00012\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00010.2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00010.2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00010.2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010u\u001aO\u0010v\u001a\u00020\u00012\u0006\u0010w\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010.2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010y\u001a?\u0010z\u001a\u00020\u00012\u0006\u0010w\u001a\u00020\"2\u0006\u0010{\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010.2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010|\u001a;\u0010}\u001a\u00020\u00012\u0006\u0010i\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0002\u0010~\u001a@\u0010\u007f\u001a\u00020\u00012\u0006\u0010w\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010.2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0003\u0010\u0080\u0001\u001a\u001b\u0010\u0081\u0001\u001a\u00020\"2\b\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010C\u001a\u00020\"H\u0002\u001a*\u0010\u0082\u0001\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u00010d2\u0006\u0010V\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0003\u0010\u0084\u0001\u001a\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00102\u0006\u0010G\u001a\u00020HH\u0002¢\u0006\u0003\u0010\u0086\u0001¨\u0006\u0087\u0001²\u0006\n\u0010O\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\u000b\u0010\u0088\u0001\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\u000b\u0010\u0089\u0001\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\u000b\u0010\u008b\u0001\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"BattleEmblemLightDisc", "", "modifier", "Landroidx/compose/ui/Modifier;", "palette", "Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;Landroidx/compose/runtime/Composer;II)V", "BattleEmblemCoinShine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "battleEmblemGlowRes", "", "tone", "Lorg/betup/ui/dialogs/compose/BattleResultTone;", "(Lorg/betup/ui/dialogs/compose/BattleResultTone;)Ljava/lang/Integer;", "battleEmblemPngRes", "battleEmblemUsesPngAsset", "", "BattleEmblemCoin", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/unit/Dp;", "yOffset", "BattleEmblemCoin-UuyPYSY", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;FFLandroidx/compose/runtime/Composer;II)V", "BattleResultEmblemOverlay", "animationsEnabled", "revealPhase", "compact", "(Lorg/betup/ui/dialogs/compose/BattleResultPalette;Landroidx/compose/ui/Modifier;ZIZLandroidx/compose/runtime/Composer;II)V", "BattleResultEmblemGraphic", "victoryPulse", "", "(Lorg/betup/ui/dialogs/compose/BattleResultTone;Lorg/betup/ui/dialogs/compose/BattleResultPalette;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "BattleResultHeaderBand", "amountText", "", "amountColorOverride", "Landroidx/compose/ui/graphics/Color;", "subtitleOverride", "BattleResultHeaderBand-EoQKNkA", "(Lorg/betup/ui/dialogs/compose/BattleResultPalette;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Ljava/lang/String;ZIZLandroidx/compose/runtime/Composer;II)V", "BattleResultPremiumHeader", "(Lorg/betup/ui/dialogs/compose/BattleResultPalette;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "BattleMatchChip", "match", "Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "onClick", "Lkotlin/Function0;", "(Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "battleChipTextStyle", "Landroidx/compose/ui/text/TextStyle;", "color", "battleChipTextStyle-Iv8Zu3U", "(JLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "BattleStakesStrip", "buyIn", "", "pot", "yourOdds", "(JJLjava/lang/String;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;ZILandroidx/compose/runtime/Composer;II)V", "BattleStakeCell", "label", "value", "highlighted", "showCoin", "glowPulse", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLorg/betup/ui/dialogs/compose/BattleResultPalette;FZLandroidx/compose/runtime/Composer;II)V", "BattlePickChip", "groupName", "betName", "varietyName", "coefficient", "highlight", "Lorg/betup/utils/BattleBetHighlightStyle;", "betWon", "onExpandedChange", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/utils/BattleBetHighlightStyle;Ljava/lang/Boolean;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BattlePickChipBody", "periodTag", "expanded", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/utils/BattleBetHighlightStyle;Ljava/lang/Boolean;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BattlePickChipOddsRow", "(Ljava/lang/String;Lorg/betup/utils/BattleBetHighlightStyle;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;I)V", "BattleDuelSection", "ordered", "Lorg/betup/utils/OrderedBattleParticipants;", "oddType", "Lorg/betup/model/local/entity/OddType;", "leftBetHidden", "rightBetHidden", "betHiddenText", "onUserClick", "Lkotlin/ParameterName;", "name", "userId", "(Lorg/betup/utils/OrderedBattleParticipants;Lorg/betup/model/local/entity/OddType;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;ZIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "BattleDuelColumn", SentryBaseEvent.JsonKeys.USER, "Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "rawCoefficient", "", "isCurrentUserColumn", "oddsRace", "(Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lorg/betup/model/local/entity/OddType;Lorg/betup/utils/BattleBetHighlightStyle;Ljava/lang/Boolean;ZLorg/betup/ui/dialogs/compose/BattleResultPalette;FZZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "BattleOutcomeCaption", "message", "Lorg/betup/utils/BattleOutcomeMessage;", "(Lorg/betup/utils/BattleOutcomeMessage;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;ZILandroidx/compose/runtime/Composer;II)V", "battleInfoSurface", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "BattleHowDecidedLink", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;ZIZLandroidx/compose/runtime/Composer;II)V", "BattleResultActions", "onShare", "onRematch", "onHowBattlesDecided", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;ZIZLandroidx/compose/runtime/Composer;II)V", "BattleRematchButton", "text", "shimmerProgress", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;FZLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "BattleOutlineActionButton", "iconRes", "(Ljava/lang/String;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "BattleDetailsStatusBanner", "(Ljava/lang/String;Lorg/betup/ui/dialogs/compose/BattleResultPalette;Landroidx/compose/ui/Modifier;ZILandroidx/compose/runtime/Composer;II)V", "BattleDetailsOkButton", "(Ljava/lang/String;Lorg/betup/ui/dialogs/compose/BattleResultPalette;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "buildPeriodTag", "formatBattleCoef", "hidden", "(Ljava/lang/Double;Lorg/betup/model/local/entity/OddType;Z)Ljava/lang/String;", "betWonFromHighlight", "(Lorg/betup/utils/BattleBetHighlightStyle;)Ljava/lang/Boolean;", "app_release", "oddsRaceDone", "displayOdds", "bob", "pickExpanded"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleResultComponentsKt {

    /* compiled from: BattleResultComponents.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BattleResultTone.values().length];
            try {
                iArr[BattleResultTone.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleResultTone.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleResultTone.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BattleResultTone.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BattleResultTone.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BattleResultTone.RETURNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BattleResultTone.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BattleResultTone.FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BattleResultTone.NEUTRAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BattleBetHighlightStyle.values().length];
            try {
                iArr2[BattleBetHighlightStyle.WINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BattleBetHighlightStyle.LOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BattleBetHighlightStyle.WINNER_MUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BattleBetHighlightStyle.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BattleBetHighlightStyle.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDetailsOkButton$lambda$98(String str, BattleResultPalette battleResultPalette, Function0 function0, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        BattleDetailsOkButton(str, battleResultPalette, function0, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDetailsStatusBanner$lambda$96(String str, BattleResultPalette battleResultPalette, Modifier modifier, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        BattleDetailsStatusBanner(str, battleResultPalette, modifier, z, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelColumn$lambda$79(NewChallengeParticipantModel newChallengeParticipantModel, String str, String str2, String str3, String str4, Double d, OddType oddType, BattleBetHighlightStyle battleBetHighlightStyle, Boolean bool, boolean z, BattleResultPalette battleResultPalette, float f, boolean z2, boolean z3, boolean z4, Modifier modifier, Function1 function1, int i, int i2, int i3, Composer composer, int i4) {
        BattleDuelColumn(newChallengeParticipantModel, str, str2, str3, str4, d, oddType, battleBetHighlightStyle, bool, z, battleResultPalette, f, z2, z3, z4, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelSection$lambda$51(OrderedBattleParticipants orderedBattleParticipants, OddType oddType, boolean z, boolean z2, String str, Modifier modifier, BattleResultPalette battleResultPalette, boolean z3, int i, boolean z4, Function1 function1, int i2, int i3, int i4, Composer composer, int i5) {
        BattleDuelSection(orderedBattleParticipants, oddType, z, z2, str, modifier, battleResultPalette, z3, i, z4, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleEmblemCoinShine$lambda$5(Modifier modifier, int i, int i2, Composer composer, int i3) {
        BattleEmblemCoinShine(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleEmblemCoin_UuyPYSY$lambda$7(Modifier modifier, BattleResultPalette battleResultPalette, float f, float f2, int i, int i2, Composer composer, int i3) {
        m13217BattleEmblemCoinUuyPYSY(modifier, battleResultPalette, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleEmblemLightDisc$lambda$2(Modifier modifier, BattleResultPalette battleResultPalette, int i, int i2, Composer composer, int i3) {
        BattleEmblemLightDisc(modifier, battleResultPalette, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleHowDecidedLink$lambda$84(Function0 function0, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, boolean z2, int i2, int i3, Composer composer, int i4) {
        BattleHowDecidedLink(function0, modifier, battleResultPalette, z, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchChip$lambda$22(NewChallengeMatchModel newChallengeMatchModel, Modifier modifier, BattleResultPalette battleResultPalette, Function0 function0, int i, int i2, Composer composer, int i3) {
        BattleMatchChip(newChallengeMatchModel, modifier, battleResultPalette, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleOutcomeCaption$lambda$81(BattleOutcomeMessage battleOutcomeMessage, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        BattleOutcomeCaption(battleOutcomeMessage, modifier, battleResultPalette, z, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleOutlineActionButton$lambda$94(String str, int i, Modifier modifier, Function0 function0, boolean z, int i2, int i3, Composer composer, int i4) {
        BattleOutlineActionButton(str, i, modifier, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePickChip$lambda$41(String str, String str2, String str3, String str4, BattleBetHighlightStyle battleBetHighlightStyle, Boolean bool, Modifier modifier, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        BattlePickChip(str, str2, str3, str4, battleBetHighlightStyle, bool, modifier, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePickChipBody$lambda$44(String str, String str2, String str3, BattleBetHighlightStyle battleBetHighlightStyle, Boolean bool, boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BattlePickChipBody(str, str2, str3, battleBetHighlightStyle, bool, z, z2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePickChipOddsRow$lambda$48(String str, BattleBetHighlightStyle battleBetHighlightStyle, Boolean bool, int i, Composer composer, int i2) {
        BattlePickChipOddsRow(str, battleBetHighlightStyle, bool, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleRematchButton$lambda$92(String str, Modifier modifier, BattleResultPalette battleResultPalette, float f, boolean z, Function0 function0, boolean z2, int i, int i2, Composer composer, int i3) {
        BattleRematchButton(str, modifier, battleResultPalette, f, z, function0, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleResultActions$lambda$87(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, boolean z2, int i2, int i3, Composer composer, int i4) {
        BattleResultActions(function0, function02, function03, modifier, battleResultPalette, z, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleResultEmblemGraphic$lambda$11(BattleResultTone battleResultTone, BattleResultPalette battleResultPalette, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        BattleResultEmblemGraphic(battleResultTone, battleResultPalette, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleResultEmblemOverlay$lambda$9(BattleResultPalette battleResultPalette, Modifier modifier, boolean z, int i, boolean z2, int i2, int i3, Composer composer, int i4) {
        BattleResultEmblemOverlay(battleResultPalette, modifier, z, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleResultHeaderBand_EoQKNkA$lambda$17(BattleResultPalette battleResultPalette, String str, Modifier modifier, Color color, String str2, boolean z, int i, boolean z2, int i2, int i3, Composer composer, int i4) {
        m13218BattleResultHeaderBandEoQKNkA(battleResultPalette, str, modifier, color, str2, z, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleResultPremiumHeader$lambda$18(BattleResultPalette battleResultPalette, String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        BattleResultPremiumHeader(battleResultPalette, str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleStakeCell$lambda$29(String str, String str2, Modifier modifier, boolean z, boolean z2, BattleResultPalette battleResultPalette, float f, boolean z3, int i, int i2, Composer composer, int i3) {
        BattleStakeCell(str, str2, modifier, z, z2, battleResultPalette, f, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleStakesStrip$lambda$24(long j, long j2, String str, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        BattleStakesStrip(j, j2, str, modifier, battleResultPalette, z, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void BattleEmblemLightDisc(final Modifier modifier, final BattleResultPalette battleResultPalette, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-564971656);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(battleResultPalette) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-564971656, i3, -1, "org.betup.ui.dialogs.compose.BattleEmblemLightDisc (BattleResultComponents.kt:89)");
            }
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleEmblemLightDisc$lambda$1$lambda$0;
                        BattleEmblemLightDisc$lambda$1$lambda$0 = BattleResultComponentsKt.BattleEmblemLightDisc$lambda$1$lambda$0(BattleResultPalette.this, (DrawScope) obj);
                        return BattleEmblemLightDisc$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifier, (Function1) rememberedValue, startRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleEmblemLightDisc$lambda$2;
                    BattleEmblemLightDisc$lambda$2 = BattleResultComponentsKt.BattleEmblemLightDisc$lambda$2(Modifier.this, battleResultPalette, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleEmblemLightDisc$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleEmblemLightDisc$lambda$1$lambda$0(BattleResultPalette battleResultPalette, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m5710drawCircleV9BoPsw$default(Canvas, Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13235getAccent0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), Canvas.mo5729getCenterF1C5BW0(), 0.52f * Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()), 0, 8, (Object) null), 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    private static final void BattleEmblemCoinShine(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1224063359);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224063359, i3, -1, "org.betup.ui.dialogs.compose.BattleEmblemCoinShine (BattleResultComponents.kt:106)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleEmblemCoinShine$lambda$4$lambda$3;
                        BattleEmblemCoinShine$lambda$4$lambda$3 = BattleResultComponentsKt.BattleEmblemCoinShine$lambda$4$lambda$3((DrawScope) obj);
                        return BattleEmblemCoinShine$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifier, (Function1) rememberedValue, startRestartGroup, (i3 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleEmblemCoinShine$lambda$5;
                    BattleEmblemCoinShine$lambda$5 = BattleResultComponentsKt.BattleEmblemCoinShine$lambda$5(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleEmblemCoinShine$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleEmblemCoinShine$lambda$4$lambda$3(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * 0.2f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.1f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * 0.32f;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.16f;
        DrawScope.m5718drawOvalnJ9OG0$default(Canvas, m5167copywmQWz5c$default, m4919constructorimpl, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), 0.0f, null, null, 0, 120, null);
        long m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        float intBitsToFloat5 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * 0.48f;
        float intBitsToFloat6 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.58f;
        long m4919constructorimpl2 = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * 0.22f;
        float intBitsToFloat8 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.1f;
        DrawScope.m5718drawOvalnJ9OG0$default(Canvas, m5167copywmQWz5c$default2, m4919constructorimpl2, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat7) << 32)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    private static final Integer battleEmblemGlowRes(BattleResultTone battleResultTone) {
        switch (WhenMappings.$EnumSwitchMapping$0[battleResultTone.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 3:
                return Integer.valueOf(R.drawable.battle_result_glow_draw);
            case 8:
                return Integer.valueOf(R.drawable.battle_result_glow_finished);
            case 9:
                return Integer.valueOf(R.drawable.battle_result_glow_neutral);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Integer battleEmblemPngRes(BattleResultTone battleResultTone) {
        int i = WhenMappings.$EnumSwitchMapping$0[battleResultTone.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.image_b_won);
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.image_b_lost);
        }
        if (i == 4) {
            return Integer.valueOf(R.drawable.image_b_pending);
        }
        if (i == 5) {
            return Integer.valueOf(R.drawable.image_b_started);
        }
        if (i == 6) {
            return Integer.valueOf(R.drawable.image_b_cancel);
        }
        if (i != 7) {
            return null;
        }
        return Integer.valueOf(R.drawable.image_b_cancel);
    }

    private static final boolean battleEmblemUsesPngAsset(BattleResultTone battleResultTone) {
        return battleEmblemPngRes(battleResultTone) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* renamed from: BattleEmblemCoin-UuyPYSY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13217BattleEmblemCoinUuyPYSY(Modifier modifier, final BattleResultPalette battleResultPalette, final float f, float f2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2072539842);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(battleResultPalette) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f3 = f2;
            i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                float m7774constructorimpl = i5 == 0 ? Dp.m7774constructorimpl(0) : f3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2072539842, i3, -1, "org.betup.ui.dialogs.compose.BattleEmblemCoin (BattleResultComponents.kt:152)");
                }
                Modifier m1476offsetVpY3zN4$default = OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1563size3ABfNKs(companion, f), 0.0f, m7774constructorimpl, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1476offsetVpY3zN4$default);
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
                float f5 = m7774constructorimpl;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_coin_battle_preview, startRestartGroup, 6), (String) null, ShadowKt.m4803shadows4CzXII$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(14), RoundedCornerShapeKt.getCircleShape(), false, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), battleResultPalette.m13242getEmblemShadow0d7_KjU(), 4, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                BattleEmblemCoinShine(PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12)), startRestartGroup, 6, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = f5;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                f4 = f3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattleEmblemCoin_UuyPYSY$lambda$7;
                        BattleEmblemCoin_UuyPYSY$lambda$7 = BattleResultComponentsKt.BattleEmblemCoin_UuyPYSY$lambda$7(Modifier.this, battleResultPalette, f, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BattleEmblemCoin_UuyPYSY$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        f3 = f2;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1476offsetVpY3zN4$default2 = OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1563size3ABfNKs(companion, f), 0.0f, m7774constructorimpl, 1, null);
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1476offsetVpY3zN4$default2);
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
        float f52 = m7774constructorimpl;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_coin_battle_preview, startRestartGroup, 6), (String) null, ShadowKt.m4803shadows4CzXII$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(14), RoundedCornerShapeKt.getCircleShape(), false, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), battleResultPalette.m13242getEmblemShadow0d7_KjU(), 4, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
        BattleEmblemCoinShine(PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12)), startRestartGroup, 6, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        f4 = f52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleResultEmblemOverlay(final BattleResultPalette palette, Modifier modifier, boolean z, int i, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        float m7774constructorimpl;
        int i10;
        float f;
        int i11;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int i12;
        char c;
        float m7774constructorimpl2;
        boolean z5;
        final int i13;
        final boolean z6;
        final boolean z7;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(8540697);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(palette) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 2048 : 1024;
                    i8 = i3 & 16;
                    if (i8 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                        i9 = i4;
                        if ((i9 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                i7 = 8;
                            }
                            if (i8 != 0) {
                                z4 = false;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(8540697, i9, -1, "org.betup.ui.dialogs.compose.BattleResultEmblemOverlay (BattleResultComponents.kt:183)");
                            }
                            final float rememberGlowPulse = BattleResultAnimationsKt.rememberGlowPulse(!z3 && CollectionsKt.listOf((Object[]) new BattleResultTone[]{BattleResultTone.WON, BattleResultTone.ACTIVE, BattleResultTone.PENDING}).contains(palette.getTone()), 1500, startRestartGroup, 48, 0);
                            float m7774constructorimpl3 = Dp.m7774constructorimpl(z4 ? 156 : 200);
                            m7774constructorimpl = Dp.m7774constructorimpl(z4 ? 156 : 200);
                            i10 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                            if (i10 != 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
                                f = m7774constructorimpl3;
                            } else {
                                f = Dp.m7774constructorimpl(z4 ? Opcodes.F2L : Opcodes.ARETURN);
                            }
                            i11 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                                m7774constructorimpl = !z4 ? Dp.m7774constructorimpl(132) : Dp.m7774constructorimpl(Opcodes.JSR);
                            }
                            final float f2 = m7774constructorimpl;
                            boolean battleEmblemUsesPngAsset = battleEmblemUsesPngAsset(palette.getTone());
                            Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m1563size3ABfNKs(modifier2, f), 20.0f);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                            i12 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                            if (i12 != 1 || i12 == 2 || i12 == 4 || i12 == 5) {
                                c = 6;
                            } else {
                                c = 6;
                                if (i12 != 6 && i12 != 7) {
                                    m7774constructorimpl2 = Dp.m7774constructorimpl(z4 ? 118 : Opcodes.LCMP);
                                    Modifier alpha = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(companion, m7774constructorimpl2), (z3 || i7 >= 1) ? 1.0f : 0.0f);
                                    int i15 = (i9 << 3) & 112;
                                    Modifier modifier4 = modifier2;
                                    BattleResultAnimationsKt.BattleAmbientGlow(alpha, palette, rememberGlowPulse, (z3 || battleEmblemUsesPngAsset) ? false : true, startRestartGroup, i15, 0);
                                    Modifier alpha2 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z4 ? 118 : Opcodes.LCMP)), (z3 || i7 >= 3) ? 1.0f : 0.0f);
                                    int i16 = (i9 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                                    BattleResultAnimationsKt.BattleCelebrationParticles(alpha2, z3, palette, startRestartGroup, ((i9 >> 3) & 112) | i16, 0);
                                    BattleResultAnimationsKt.BattleConfettiBurst(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), !z3 && palette.getTone() == BattleResultTone.WON && 3 <= i7 && i7 < 8, palette, startRestartGroup, i16 | 6, 0);
                                    startRestartGroup.startReplaceGroup(2025169872);
                                    if (palette.getTone() == BattleResultTone.NEUTRAL) {
                                        z5 = z3;
                                        BattleResultAnimationsKt.BattleAnimatedEmblem(BattleResultAnimationsKt.medalDropGraphicsLayer(z3, i7), palette, z3, !z3, ComposableLambdaKt.rememberComposableLambda(2092331136, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$BattleResultEmblemOverlay$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i17) {
                                                if ((i17 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2092331136, i17, -1, "org.betup.ui.dialogs.compose.BattleResultEmblemOverlay.<anonymous>.<anonymous> (BattleResultComponents.kt:261)");
                                                }
                                                BattleResultComponentsKt.BattleResultEmblemGraphic(BattleResultPalette.this.getTone(), BattleResultPalette.this, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f2), rememberGlowPulse, composer2, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, i15 | 24576 | (i9 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                                    } else {
                                        z5 = z3;
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
                                    i13 = i7;
                                    z6 = z5;
                                    z7 = z4;
                                    modifier3 = modifier4;
                                }
                            }
                            m7774constructorimpl2 = Dp.m7774constructorimpl(z4 ? 132 : Opcodes.JSR);
                            Modifier alpha3 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(companion, m7774constructorimpl2), (z3 || i7 >= 1) ? 1.0f : 0.0f);
                            int i152 = (i9 << 3) & 112;
                            Modifier modifier42 = modifier2;
                            BattleResultAnimationsKt.BattleAmbientGlow(alpha3, palette, rememberGlowPulse, (z3 || battleEmblemUsesPngAsset) ? false : true, startRestartGroup, i152, 0);
                            Modifier alpha22 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z4 ? 118 : Opcodes.LCMP)), (z3 || i7 >= 3) ? 1.0f : 0.0f);
                            int i162 = (i9 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                            BattleResultAnimationsKt.BattleCelebrationParticles(alpha22, z3, palette, startRestartGroup, ((i9 >> 3) & 112) | i162, 0);
                            BattleResultAnimationsKt.BattleConfettiBurst(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), !z3 && palette.getTone() == BattleResultTone.WON && 3 <= i7 && i7 < 8, palette, startRestartGroup, i162 | 6, 0);
                            startRestartGroup.startReplaceGroup(2025169872);
                            if (palette.getTone() == BattleResultTone.NEUTRAL) {
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i13 = i7;
                            z6 = z5;
                            z7 = z4;
                            modifier3 = modifier42;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z6 = z3;
                            i13 = i7;
                            z7 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda32
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BattleResultEmblemOverlay$lambda$9;
                                    BattleResultEmblemOverlay$lambda$9 = BattleResultComponentsKt.BattleResultEmblemOverlay$lambda$9(BattleResultPalette.this, modifier3, z6, i13, z7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BattleResultEmblemOverlay$lambda$9;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    i9 = i4;
                    if ((i9 & 9363) == 9362) {
                    }
                    if (i14 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final float rememberGlowPulse2 = BattleResultAnimationsKt.rememberGlowPulse(!z3 && CollectionsKt.listOf((Object[]) new BattleResultTone[]{BattleResultTone.WON, BattleResultTone.ACTIVE, BattleResultTone.PENDING}).contains(palette.getTone()), 1500, startRestartGroup, 48, 0);
                    float m7774constructorimpl32 = Dp.m7774constructorimpl(z4 ? 156 : 200);
                    m7774constructorimpl = Dp.m7774constructorimpl(z4 ? 156 : 200);
                    i10 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                    if (i10 != 1) {
                    }
                    f = m7774constructorimpl32;
                    i11 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                    if (i11 != 1) {
                        if (!z4) {
                        }
                    }
                    final float f22 = m7774constructorimpl;
                    boolean battleEmblemUsesPngAsset2 = battleEmblemUsesPngAsset(palette.getTone());
                    Modifier zIndex2 = ZIndexModifierKt.zIndex(SizeKt.m1563size3ABfNKs(modifier2, f), 20.0f);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, zIndex2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
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
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    i12 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                    if (i12 != 1) {
                    }
                    c = 6;
                    m7774constructorimpl2 = Dp.m7774constructorimpl(z4 ? 132 : Opcodes.JSR);
                    Modifier alpha32 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(companion2, m7774constructorimpl2), (z3 || i7 >= 1) ? 1.0f : 0.0f);
                    int i1522 = (i9 << 3) & 112;
                    Modifier modifier422 = modifier2;
                    BattleResultAnimationsKt.BattleAmbientGlow(alpha32, palette, rememberGlowPulse2, (z3 || battleEmblemUsesPngAsset2) ? false : true, startRestartGroup, i1522, 0);
                    Modifier alpha222 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z4 ? 118 : Opcodes.LCMP)), (z3 || i7 >= 3) ? 1.0f : 0.0f);
                    int i1622 = (i9 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                    BattleResultAnimationsKt.BattleCelebrationParticles(alpha222, z3, palette, startRestartGroup, ((i9 >> 3) & 112) | i1622, 0);
                    BattleResultAnimationsKt.BattleConfettiBurst(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), !z3 && palette.getTone() == BattleResultTone.WON && 3 <= i7 && i7 < 8, palette, startRestartGroup, i1622 | 6, 0);
                    startRestartGroup.startReplaceGroup(2025169872);
                    if (palette.getTone() == BattleResultTone.NEUTRAL) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i13 = i7;
                    z6 = z5;
                    z7 = z4;
                    modifier3 = modifier422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                i8 = i3 & 16;
                if (i8 == 0) {
                }
                z4 = z2;
                i9 = i4;
                if ((i9 & 9363) == 9362) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final float rememberGlowPulse22 = BattleResultAnimationsKt.rememberGlowPulse(!z3 && CollectionsKt.listOf((Object[]) new BattleResultTone[]{BattleResultTone.WON, BattleResultTone.ACTIVE, BattleResultTone.PENDING}).contains(palette.getTone()), 1500, startRestartGroup, 48, 0);
                float m7774constructorimpl322 = Dp.m7774constructorimpl(z4 ? 156 : 200);
                m7774constructorimpl = Dp.m7774constructorimpl(z4 ? 156 : 200);
                i10 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                if (i10 != 1) {
                }
                f = m7774constructorimpl322;
                i11 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                if (i11 != 1) {
                }
                final float f222 = m7774constructorimpl;
                boolean battleEmblemUsesPngAsset22 = battleEmblemUsesPngAsset(palette.getTone());
                Modifier zIndex22 = ZIndexModifierKt.zIndex(SizeKt.m1563size3ABfNKs(modifier2, f), 20.0f);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, zIndex22);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                i12 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
                if (i12 != 1) {
                }
                c = 6;
                m7774constructorimpl2 = Dp.m7774constructorimpl(z4 ? 132 : Opcodes.JSR);
                Modifier alpha322 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(companion22, m7774constructorimpl2), (z3 || i7 >= 1) ? 1.0f : 0.0f);
                int i15222 = (i9 << 3) & 112;
                Modifier modifier4222 = modifier2;
                BattleResultAnimationsKt.BattleAmbientGlow(alpha322, palette, rememberGlowPulse22, (z3 || battleEmblemUsesPngAsset22) ? false : true, startRestartGroup, i15222, 0);
                Modifier alpha2222 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z4 ? 118 : Opcodes.LCMP)), (z3 || i7 >= 3) ? 1.0f : 0.0f);
                int i16222 = (i9 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                BattleResultAnimationsKt.BattleCelebrationParticles(alpha2222, z3, palette, startRestartGroup, ((i9 >> 3) & 112) | i16222, 0);
                BattleResultAnimationsKt.BattleConfettiBurst(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), !z3 && palette.getTone() == BattleResultTone.WON && 3 <= i7 && i7 < 8, palette, startRestartGroup, i16222 | 6, 0);
                startRestartGroup.startReplaceGroup(2025169872);
                if (palette.getTone() == BattleResultTone.NEUTRAL) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                i13 = i7;
                z6 = z5;
                z7 = z4;
                modifier3 = modifier4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            z4 = z2;
            i9 = i4;
            if ((i9 & 9363) == 9362) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final float rememberGlowPulse222 = BattleResultAnimationsKt.rememberGlowPulse(!z3 && CollectionsKt.listOf((Object[]) new BattleResultTone[]{BattleResultTone.WON, BattleResultTone.ACTIVE, BattleResultTone.PENDING}).contains(palette.getTone()), 1500, startRestartGroup, 48, 0);
            float m7774constructorimpl3222 = Dp.m7774constructorimpl(z4 ? 156 : 200);
            m7774constructorimpl = Dp.m7774constructorimpl(z4 ? 156 : 200);
            i10 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
            if (i10 != 1) {
            }
            f = m7774constructorimpl3222;
            i11 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
            if (i11 != 1) {
            }
            final float f2222 = m7774constructorimpl;
            boolean battleEmblemUsesPngAsset222 = battleEmblemUsesPngAsset(palette.getTone());
            Modifier zIndex222 = ZIndexModifierKt.zIndex(SizeKt.m1563size3ABfNKs(modifier2, f), 20.0f);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, zIndex222);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion222 = Modifier.INSTANCE;
            i12 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
            if (i12 != 1) {
            }
            c = 6;
            m7774constructorimpl2 = Dp.m7774constructorimpl(z4 ? 132 : Opcodes.JSR);
            Modifier alpha3222 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(companion222, m7774constructorimpl2), (z3 || i7 >= 1) ? 1.0f : 0.0f);
            int i152222 = (i9 << 3) & 112;
            Modifier modifier42222 = modifier2;
            BattleResultAnimationsKt.BattleAmbientGlow(alpha3222, palette, rememberGlowPulse222, (z3 || battleEmblemUsesPngAsset222) ? false : true, startRestartGroup, i152222, 0);
            Modifier alpha22222 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z4 ? 118 : Opcodes.LCMP)), (z3 || i7 >= 3) ? 1.0f : 0.0f);
            int i162222 = (i9 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
            BattleResultAnimationsKt.BattleCelebrationParticles(alpha22222, z3, palette, startRestartGroup, ((i9 >> 3) & 112) | i162222, 0);
            BattleResultAnimationsKt.BattleConfettiBurst(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), !z3 && palette.getTone() == BattleResultTone.WON && 3 <= i7 && i7 < 8, palette, startRestartGroup, i162222 | 6, 0);
            startRestartGroup.startReplaceGroup(2025169872);
            if (palette.getTone() == BattleResultTone.NEUTRAL) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            i13 = i7;
            z6 = z5;
            z7 = z4;
            modifier3 = modifier42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        z4 = z2;
        i9 = i4;
        if ((i9 & 9363) == 9362) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final float rememberGlowPulse2222 = BattleResultAnimationsKt.rememberGlowPulse(!z3 && CollectionsKt.listOf((Object[]) new BattleResultTone[]{BattleResultTone.WON, BattleResultTone.ACTIVE, BattleResultTone.PENDING}).contains(palette.getTone()), 1500, startRestartGroup, 48, 0);
        float m7774constructorimpl32222 = Dp.m7774constructorimpl(z4 ? 156 : 200);
        m7774constructorimpl = Dp.m7774constructorimpl(z4 ? 156 : 200);
        i10 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
        if (i10 != 1) {
        }
        f = m7774constructorimpl32222;
        i11 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
        if (i11 != 1) {
        }
        final float f22222 = m7774constructorimpl;
        boolean battleEmblemUsesPngAsset2222 = battleEmblemUsesPngAsset(palette.getTone());
        Modifier zIndex2222 = ZIndexModifierKt.zIndex(SizeKt.m1563size3ABfNKs(modifier2, f), 20.0f);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, zIndex2222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        i12 = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
        if (i12 != 1) {
        }
        c = 6;
        m7774constructorimpl2 = Dp.m7774constructorimpl(z4 ? 132 : Opcodes.JSR);
        Modifier alpha32222 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(companion2222, m7774constructorimpl2), (z3 || i7 >= 1) ? 1.0f : 0.0f);
        int i1522222 = (i9 << 3) & 112;
        Modifier modifier422222 = modifier2;
        BattleResultAnimationsKt.BattleAmbientGlow(alpha32222, palette, rememberGlowPulse2222, (z3 || battleEmblemUsesPngAsset2222) ? false : true, startRestartGroup, i1522222, 0);
        Modifier alpha222222 = AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z4 ? 118 : Opcodes.LCMP)), (z3 || i7 >= 3) ? 1.0f : 0.0f);
        int i1622222 = (i9 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
        BattleResultAnimationsKt.BattleCelebrationParticles(alpha222222, z3, palette, startRestartGroup, ((i9 >> 3) & 112) | i1622222, 0);
        BattleResultAnimationsKt.BattleConfettiBurst(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), !z3 && palette.getTone() == BattleResultTone.WON && 3 <= i7 && i7 < 8, palette, startRestartGroup, i1622222 | 6, 0);
        startRestartGroup.startReplaceGroup(2025169872);
        if (palette.getTone() == BattleResultTone.NEUTRAL) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        i13 = i7;
        z6 = z5;
        z7 = z4;
        modifier3 = modifier422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleResultEmblemGraphic(final BattleResultTone tone, final BattleResultPalette palette, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Integer battleEmblemPngRes;
        Integer battleEmblemGlowRes;
        int i4;
        ColorFilter m5212tintxETnrds;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int i5;
        Object obj;
        Composer composer2;
        Composer composer3;
        final Modifier modifier3;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(tone, "tone");
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(2126745521);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(tone.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                float f3 = (i2 & 8) == 0 ? 1.0f : f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2126745521, i3, -1, "org.betup.ui.dialogs.compose.BattleResultEmblemGraphic (BattleResultComponents.kt:279)");
                }
                battleEmblemPngRes = battleEmblemPngRes(tone);
                battleEmblemGlowRes = battleEmblemGlowRes(tone);
                i4 = WhenMappings.$EnumSwitchMapping$0[tone.ordinal()];
                if (i4 != 2) {
                    if (i4 == 3 || i4 == 5) {
                        m5212tintxETnrds = ColorFilter.INSTANCE.m5212tintxETnrds(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), BlendMode.INSTANCE.m5105getSoftlight0nO6VwU());
                    } else if (i4 != 7) {
                        m5212tintxETnrds = ColorFilter.INSTANCE.m5212tintxETnrds(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), BlendMode.INSTANCE.m5105getSoftlight0nO6VwU());
                    }
                    Modifier m13251battleEmblemDropShadowy6ga9Xk$default = BattleResultVisualModifiersKt.m13251battleEmblemDropShadowy6ga9Xk$default(modifier4, palette.m13242getEmblemShadow0d7_KjU(), 0.0f, 0.0f, 6, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m13251battleEmblemDropShadowy6ga9Xk$default);
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
                    startRestartGroup.startReplaceGroup(-1960156266);
                    if (battleEmblemPngRes == null) {
                        BattleEmblemLightDisc(SizeKt.fillMaxSize(Modifier.INSTANCE, 0.88f), palette, startRestartGroup, (i3 & 112) | 6, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1960150344);
                    if (battleEmblemGlowRes != null) {
                        Painter painterResource = PainterResources_androidKt.painterResource(battleEmblemGlowRes.intValue(), startRestartGroup, 0);
                        i5 = 1;
                        obj = null;
                        ImageKt.Image(painterResource, (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), tone == BattleResultTone.WON ? 1.0f : 0.95f, (ColorFilter) null, startRestartGroup, 25008, 72);
                    } else {
                        i5 = 1;
                        obj = null;
                    }
                    startRestartGroup.endReplaceGroup();
                    switch (WhenMappings.$EnumSwitchMapping$0[tone.ordinal()]) {
                        case 1:
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            startRestartGroup.startReplaceGroup(-634532277);
                            Intrinsics.checkNotNull(battleEmblemPngRes);
                            composer2 = startRestartGroup;
                            ImageKt.Image(PainterResources_androidKt.painterResource(battleEmblemPngRes.intValue(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i5, obj), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            f2 = f3;
                            break;
                        case 3:
                            startRestartGroup.startReplaceGroup(-634204390);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.laurel_wreath_battle_preview, startRestartGroup, 6), (String) null, AlphaKt.alpha(PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i5, obj), Dp.m7774constructorimpl(2), Dp.m7774constructorimpl(4)), 0.95f), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_result_scale_draw, startRestartGroup, 6), (String) null, ShadowKt.m4803shadows4CzXII$default(OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1565sizeVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(96), Dp.m7774constructorimpl(80)), 0.0f, Dp.m7774constructorimpl(-6), i5, obj), Dp.m7774constructorimpl(8), RoundedCornerShapeKt.getCircleShape(), false, palette.m13242getEmblemShadow0d7_KjU(), 0L, 20, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                            composer3 = startRestartGroup;
                            m13217BattleEmblemCoinUuyPYSY(null, palette, Dp.m7774constructorimpl(88), Dp.m7774constructorimpl(10), startRestartGroup, (i3 & 112) | 3456, 1);
                            composer3.endReplaceGroup();
                            break;
                        case 8:
                            startRestartGroup.startReplaceGroup(-633116786);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.laurel_wreath_battle_preview, startRestartGroup, 6), (String) null, AlphaKt.alpha(PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i5, obj), Dp.m7774constructorimpl(4)), 0.72f), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, m5212tintxETnrds, startRestartGroup, 25008, 40);
                            float f4 = 8;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_result_medal_finished, startRestartGroup, 6), (String) null, ShadowKt.m4803shadows4CzXII$default(OffsetKt.m1476offsetVpY3zN4$default(boxScopeInstance.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(72)), Alignment.INSTANCE.getTopCenter()), 0.0f, Dp.m7774constructorimpl(6), i5, obj), Dp.m7774constructorimpl(f4), RoundedCornerShapeKt.getCircleShape(), false, palette.m13242getEmblemShadow0d7_KjU(), 0L, 20, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                            m13217BattleEmblemCoinUuyPYSY(null, palette, Dp.m7774constructorimpl(84), Dp.m7774constructorimpl(f4), startRestartGroup, (i3 & 112) | 3456, 1);
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            f2 = f3;
                            break;
                        case 9:
                            startRestartGroup.startReplaceGroup(-632017557);
                            composer3 = startRestartGroup;
                            m13217BattleEmblemCoinUuyPYSY(null, palette, Dp.m7774constructorimpl(88), 0.0f, startRestartGroup, (i3 & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 9);
                            composer3.endReplaceGroup();
                            break;
                        default:
                            startRestartGroup.startReplaceGroup(-1960136793);
                            startRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                    }
                    composer2 = composer3;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    f2 = f3;
                }
                m5212tintxETnrds = ColorFilter.INSTANCE.m5212tintxETnrds(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), BlendMode.INSTANCE.m5105getSoftlight0nO6VwU());
                Modifier m13251battleEmblemDropShadowy6ga9Xk$default2 = BattleResultVisualModifiersKt.m13251battleEmblemDropShadowy6ga9Xk$default(modifier4, palette.m13242getEmblemShadow0d7_KjU(), 0.0f, 0.0f, 6, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m13251battleEmblemDropShadowy6ga9Xk$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
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
                startRestartGroup.startReplaceGroup(-1960156266);
                if (battleEmblemPngRes == null) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1960150344);
                if (battleEmblemGlowRes != null) {
                }
                startRestartGroup.endReplaceGroup();
                switch (WhenMappings.$EnumSwitchMapping$0[tone.ordinal()]) {
                }
                composer2 = composer3;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                f2 = f3;
            } else {
                startRestartGroup.skipToGroupEnd();
                f2 = f;
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit BattleResultEmblemGraphic$lambda$11;
                        BattleResultEmblemGraphic$lambda$11 = BattleResultComponentsKt.BattleResultEmblemGraphic$lambda$11(BattleResultTone.this, palette, modifier3, f2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return BattleResultEmblemGraphic$lambda$11;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        battleEmblemPngRes = battleEmblemPngRes(tone);
        battleEmblemGlowRes = battleEmblemGlowRes(tone);
        i4 = WhenMappings.$EnumSwitchMapping$0[tone.ordinal()];
        if (i4 != 2) {
        }
        m5212tintxETnrds = ColorFilter.INSTANCE.m5212tintxETnrds(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), BlendMode.INSTANCE.m5105getSoftlight0nO6VwU());
        Modifier m13251battleEmblemDropShadowy6ga9Xk$default22 = BattleResultVisualModifiersKt.m13251battleEmblemDropShadowy6ga9Xk$default(modifier4, palette.m13242getEmblemShadow0d7_KjU(), 0.0f, 0.0f, 6, null);
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m13251battleEmblemDropShadowy6ga9Xk$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1960156266);
        if (battleEmblemPngRes == null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1960150344);
        if (battleEmblemGlowRes != null) {
        }
        startRestartGroup.endReplaceGroup();
        switch (WhenMappings.$EnumSwitchMapping$0[tone.ordinal()]) {
        }
        composer2 = composer3;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        f2 = f3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0376  */
    /* renamed from: BattleResultHeaderBand-EoQKNkA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13218BattleResultHeaderBandEoQKNkA(final BattleResultPalette palette, final String amountText, Modifier modifier, Color color, String str, boolean z, int i, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Color color2;
        int i6;
        String str2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        final boolean z4;
        int i11;
        int i12;
        boolean z5;
        boolean z6;
        Object rememberedValue;
        String str3;
        float m7774constructorimpl;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        float m7774constructorimpl2;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        final int i13;
        final Color color3;
        final boolean z7;
        final String str4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Composer startRestartGroup = composer.startRestartGroup(-522338290);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(palette) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(amountText) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                color2 = color;
                i4 |= startRestartGroup.changed(color2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    str2 = str;
                    i4 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        i9 = i;
                    } else {
                        i9 = i;
                        if ((i2 & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(i9) ? 1048576 : 524288;
                        }
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i4 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                        Color color4 = i5 == 0 ? null : color2;
                        String str5 = i6 == 0 ? null : str2;
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i8 != 0) {
                            i9 = 8;
                        }
                        z4 = i10 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-522338290, i4, -1, "org.betup.ui.dialogs.compose.BattleResultHeaderBand (BattleResultComponents.kt:397)");
                        }
                        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
                            case 1:
                                i11 = R.string.battle_won;
                                break;
                            case 2:
                                i11 = R.string.battle_lost;
                                break;
                            case 3:
                                i11 = R.string.battle_draw_title;
                                break;
                            case 4:
                                i11 = R.string.battle_pending_title;
                                break;
                            case 5:
                                i11 = R.string.battle_active_title;
                                break;
                            case 6:
                                i11 = R.string.battle_returned_title;
                                break;
                            case 7:
                                i11 = R.string.battle_canceled_title;
                                break;
                            case 8:
                                i11 = R.string.battle_finished_title;
                                break;
                            case 9:
                                i11 = R.string.battle;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
                            case 1:
                                i12 = R.string.battle_you_earned;
                                break;
                            case 2:
                                i12 = R.string.battle_you_lost_amount;
                                break;
                            case 3:
                                i12 = R.string.draw;
                                break;
                            case 4:
                                i12 = R.string.battle_awaiting_opponent;
                                break;
                            case 5:
                                i12 = R.string.battle_stakes_locked;
                                break;
                            case 6:
                                i12 = R.string.battle_stake_returned;
                                break;
                            case 7:
                                i12 = R.string.battle_canceled_subtitle;
                                break;
                            case 8:
                                i12 = R.string.battle_settling_results;
                                break;
                            case 9:
                                i12 = R.string.prize_label;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        String upperCase = StringResources_androidKt.stringResource(i11, startRestartGroup, 0).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        z5 = (str5 == null && (palette.getTone() == BattleResultTone.WON || palette.getTone() == BattleResultTone.LOST)) ? false : true;
                        startRestartGroup.startReplaceGroup(544135165);
                        String stringResource = str5 == null ? StringResources_androidKt.stringResource(i12, startRestartGroup, 0) : str5;
                        startRestartGroup.endReplaceGroup();
                        String upperCase2 = stringResource.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        long m5178unboximpl = color4 != null ? color4.m5178unboximpl() : palette.m13238getAmountColor0d7_KjU();
                        startRestartGroup.startReplaceGroup(5004770);
                        z6 = (i4 & 112) == 32;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = BattleResultAnimationsKt.parseBattleAmount(amountText);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ParsedBattleAmount parsedBattleAmount = (ParsedBattleAmount) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        int i15 = (i4 >> 3) & 14;
                        int i16 = i4 >> 12;
                        Long rememberAnimatedBattleAmountValue = BattleResultAnimationsKt.rememberAnimatedBattleAmountValue(amountText, z3, i9, 0, startRestartGroup, (i16 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | i15 | (i16 & 112), 8);
                        if (z3 || parsedBattleAmount == null) {
                            str3 = amountText;
                        } else if (i9 < 3) {
                            str3 = parsedBattleAmount.getPrefix();
                        } else {
                            str3 = parsedBattleAmount.getPrefix() + FormatHelper.getDialogBetcoinsFormated(rememberAnimatedBattleAmountValue != null ? rememberAnimatedBattleAmountValue.longValue() : 0L);
                        }
                        float f = 12;
                        Modifier background$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 0.0f, 12, null)), palette.getHeaderGradient(), null, 0.0f, 6, null);
                        if (!z4 && (palette.getTone() == BattleResultTone.WON || palette.getTone() == BattleResultTone.LOST)) {
                            m7774constructorimpl = Dp.m7774constructorimpl(48);
                        } else if (!z4) {
                            if (palette.getTone() == BattleResultTone.WON || palette.getTone() == BattleResultTone.LOST) {
                                m7774constructorimpl = Dp.m7774constructorimpl(58);
                            } else {
                                m7774constructorimpl = Dp.m7774constructorimpl(64);
                            }
                        } else {
                            m7774constructorimpl = Dp.m7774constructorimpl(52);
                        }
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(background$default, 0.0f, m7774constructorimpl, 0.0f, z4 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(8), 5, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Color color5 = color4;
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
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        Modifier battleRevealPop = BattleResultAnimationsKt.battleRevealPop(Modifier.INSTANCE, i9, 2, z3);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealPop);
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
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        float f2 = 2;
                        TextKt.m2642Text4IGK_g(upperCase, OffsetKt.m1475offsetVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(z4 ? 17 : 20), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                        long sp = TextUnitKt.getSp(z4 ? 17 : 20);
                        FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                        FontWeight black = FontWeight.INSTANCE.getBlack();
                        TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(palette.getTitleGradient(), 0.0f, sp, black, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), 14.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 33537714, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(-1699705827);
                        if (z5) {
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                            TextKt.m2642Text4IGK_g(upperCase2, BattleResultAnimationsKt.battleRevealRise(Modifier.INSTANCE, i9, 3, z3), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(palette.m13247getSubtitle0d7_KjU(), z4 ? TextUnitKt.getSp(8) : TextUnitKt.getSp(9), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(z4 ? 1.0d : 1.3d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                        }
                        startRestartGroup.endReplaceGroup();
                        if (z5) {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(f2);
                        } else {
                            m7774constructorimpl2 = z4 ? Dp.m7774constructorimpl(4) : Dp.m7774constructorimpl(6);
                        }
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl2), startRestartGroup, 0);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Modifier battleRevealRise = BattleResultAnimationsKt.battleRevealRise(Modifier.INSTANCE, i9, 3, z3);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise);
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
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m5178unboximpl, TextUnitKt.getSp(z4 ? 22 : 26), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(2.0f) & 4294967295L)), 10.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16768984, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z4 ? 15 : 18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
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
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        i13 = i9;
                        color3 = color5;
                        z7 = z3;
                        str4 = str5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        i13 = i9;
                        color3 = color2;
                        z7 = z3;
                        str4 = str2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleResultHeaderBand_EoQKNkA$lambda$17;
                                BattleResultHeaderBand_EoQKNkA$lambda$17 = BattleResultComponentsKt.BattleResultHeaderBand_EoQKNkA$lambda$17(BattleResultPalette.this, amountText, modifier3, color3, str4, z7, i13, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleResultHeaderBand_EoQKNkA$lambda$17;
                            }
                        });
                        return;
                    }
                    return;
                }
                str2 = str;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                if (i14 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
                }
                switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
                }
                String upperCase3 = StringResources_androidKt.stringResource(i11, startRestartGroup, 0).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                if (str5 == null) {
                    startRestartGroup.startReplaceGroup(544135165);
                    if (str5 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    String upperCase22 = stringResource.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase22, "toUpperCase(...)");
                    long m5178unboximpl2 = color4 != null ? color4.m5178unboximpl() : palette.m13238getAmountColor0d7_KjU();
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i4 & 112) == 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z6) {
                    }
                    rememberedValue = BattleResultAnimationsKt.parseBattleAmount(amountText);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ParsedBattleAmount parsedBattleAmount2 = (ParsedBattleAmount) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    int i152 = (i4 >> 3) & 14;
                    int i162 = i4 >> 12;
                    Long rememberAnimatedBattleAmountValue2 = BattleResultAnimationsKt.rememberAnimatedBattleAmountValue(amountText, z3, i9, 0, startRestartGroup, (i162 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | i152 | (i162 & 112), 8);
                    if (z3) {
                    }
                    str3 = amountText;
                    float f3 = 12;
                    Modifier background$default2 = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3), 0.0f, 0.0f, 12, null)), palette.getHeaderGradient(), null, 0.0f, 6, null);
                    if (!z4) {
                    }
                    if (!z4) {
                    }
                    Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(background$default2, 0.0f, m7774constructorimpl, 0.0f, z4 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(8), 5, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    Color color52 = color4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
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
                    Modifier battleRevealPop2 = BattleResultAnimationsKt.battleRevealPop(Modifier.INSTANCE, i9, 2, z3);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealPop2);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    float f22 = 2;
                    TextKt.m2642Text4IGK_g(upperCase3, OffsetKt.m1475offsetVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f22)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(z4 ? 17 : 20), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                    long sp2 = TextUnitKt.getSp(z4 ? 17 : 20);
                    FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                    FontWeight black2 = FontWeight.INSTANCE.getBlack();
                    TextKt.m2642Text4IGK_g(upperCase3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(palette.getTitleGradient(), 0.0f, sp2, black2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), 14.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 33537714, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(-1699705827);
                    if (z5) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (z5) {
                    }
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl2), startRestartGroup, 0);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Modifier battleRevealRise2 = BattleResultAnimationsKt.battleRevealRise(Modifier.INSTANCE, i9, 3, z3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise2);
                    Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting()) {
                    }
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m5178unboximpl2, TextUnitKt.getSp(z4 ? 22 : 26), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(2.0f) & 4294967295L)), 10.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16768984, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z4 ? 15 : 18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    i13 = i9;
                    color3 = color52;
                    z7 = z3;
                    str4 = str5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                startRestartGroup.startReplaceGroup(544135165);
                if (str5 == null) {
                }
                startRestartGroup.endReplaceGroup();
                String upperCase222 = stringResource.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase222, "toUpperCase(...)");
                long m5178unboximpl22 = color4 != null ? color4.m5178unboximpl() : palette.m13238getAmountColor0d7_KjU();
                startRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 112) == 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z6) {
                }
                rememberedValue = BattleResultAnimationsKt.parseBattleAmount(amountText);
                startRestartGroup.updateRememberedValue(rememberedValue);
                ParsedBattleAmount parsedBattleAmount22 = (ParsedBattleAmount) rememberedValue;
                startRestartGroup.endReplaceGroup();
                int i1522 = (i4 >> 3) & 14;
                int i1622 = i4 >> 12;
                Long rememberAnimatedBattleAmountValue22 = BattleResultAnimationsKt.rememberAnimatedBattleAmountValue(amountText, z3, i9, 0, startRestartGroup, (i1622 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | i1522 | (i1622 & 112), 8);
                if (z3) {
                }
                str3 = amountText;
                float f32 = 12;
                Modifier background$default22 = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32), 0.0f, 0.0f, 12, null)), palette.getHeaderGradient(), null, 0.0f, 6, null);
                if (!z4) {
                }
                if (!z4) {
                }
                Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(background$default22, 0.0f, m7774constructorimpl, 0.0f, z4 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(8), 5, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
                Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                Color color522 = color4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash52);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                Modifier battleRevealPop22 = BattleResultAnimationsKt.battleRevealPop(Modifier.INSTANCE, i9, 2, z3);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealPop22);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                float f222 = 2;
                TextKt.m2642Text4IGK_g(upperCase3, OffsetKt.m1475offsetVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f222)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(z4 ? 17 : 20), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                long sp22 = TextUnitKt.getSp(z4 ? 17 : 20);
                FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight black22 = FontWeight.INSTANCE.getBlack();
                TextKt.m2642Text4IGK_g(upperCase3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(palette.getTitleGradient(), 0.0f, sp22, black22, (FontStyle) null, (FontSynthesis) null, sfProFontFamily22, (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), 14.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 33537714, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-1699705827);
                if (z5) {
                }
                startRestartGroup.endReplaceGroup();
                if (z5) {
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl2), startRestartGroup, 0);
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                Modifier battleRevealRise22 = BattleResultAnimationsKt.battleRevealRise(Modifier.INSTANCE, i9, 3, z3);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise22);
                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m5178unboximpl22, TextUnitKt.getSp(z4 ? 22 : 26), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(2.0f) & 4294967295L)), 10.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16768984, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z4 ? 15 : 18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
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
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                i13 = i9;
                color3 = color522;
                z7 = z3;
                str4 = str5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            color2 = color;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            if (i14 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
            }
            switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
            }
            String upperCase32 = StringResources_androidKt.stringResource(i11, startRestartGroup, 0).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase32, "toUpperCase(...)");
            if (str5 == null) {
            }
            startRestartGroup.startReplaceGroup(544135165);
            if (str5 == null) {
            }
            startRestartGroup.endReplaceGroup();
            String upperCase2222 = stringResource.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2222, "toUpperCase(...)");
            long m5178unboximpl222 = color4 != null ? color4.m5178unboximpl() : palette.m13238getAmountColor0d7_KjU();
            startRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 112) == 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z6) {
            }
            rememberedValue = BattleResultAnimationsKt.parseBattleAmount(amountText);
            startRestartGroup.updateRememberedValue(rememberedValue);
            ParsedBattleAmount parsedBattleAmount222 = (ParsedBattleAmount) rememberedValue;
            startRestartGroup.endReplaceGroup();
            int i15222 = (i4 >> 3) & 14;
            int i16222 = i4 >> 12;
            Long rememberAnimatedBattleAmountValue222 = BattleResultAnimationsKt.rememberAnimatedBattleAmountValue(amountText, z3, i9, 0, startRestartGroup, (i16222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | i15222 | (i16222 & 112), 8);
            if (z3) {
            }
            str3 = amountText;
            float f322 = 12;
            Modifier background$default222 = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f322), Dp.m7774constructorimpl(f322), 0.0f, 0.0f, 12, null)), palette.getHeaderGradient(), null, 0.0f, 6, null);
            if (!z4) {
            }
            if (!z4) {
            }
            Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(background$default222, 0.0f, m7774constructorimpl, 0.0f, z4 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(8), 5, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222);
            Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
            Color color5222 = color4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash522);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            Modifier battleRevealPop222 = BattleResultAnimationsKt.battleRevealPop(Modifier.INSTANCE, i9, 2, z3);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealPop222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            float f2222 = 2;
            TextKt.m2642Text4IGK_g(upperCase32, OffsetKt.m1475offsetVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f2222)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(z4 ? 17 : 20), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            long sp222 = TextUnitKt.getSp(z4 ? 17 : 20);
            FontFamily sfProFontFamily222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            FontWeight black222 = FontWeight.INSTANCE.getBlack();
            TextKt.m2642Text4IGK_g(upperCase32, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(palette.getTitleGradient(), 0.0f, sp222, black222, (FontStyle) null, (FontSynthesis) null, sfProFontFamily222, (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), 14.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 33537714, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1699705827);
            if (z5) {
            }
            startRestartGroup.endReplaceGroup();
            if (z5) {
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl2), startRestartGroup, 0);
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            Modifier battleRevealRise222 = BattleResultAnimationsKt.battleRevealRise(Modifier.INSTANCE, i9, 3, z3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise222);
            Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m5178unboximpl222, TextUnitKt.getSp(z4 ? 22 : 26), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(2.0f) & 4294967295L)), 10.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16768984, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z4 ? 15 : 18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            i13 = i9;
            color3 = color5222;
            z7 = z3;
            str4 = str5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        color2 = color;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        if (i14 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
        }
        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
        }
        String upperCase322 = StringResources_androidKt.stringResource(i11, startRestartGroup, 0).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase322, "toUpperCase(...)");
        if (str5 == null) {
        }
        startRestartGroup.startReplaceGroup(544135165);
        if (str5 == null) {
        }
        startRestartGroup.endReplaceGroup();
        String upperCase22222 = stringResource.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase22222, "toUpperCase(...)");
        long m5178unboximpl2222 = color4 != null ? color4.m5178unboximpl() : palette.m13238getAmountColor0d7_KjU();
        startRestartGroup.startReplaceGroup(5004770);
        if ((i4 & 112) == 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue = BattleResultAnimationsKt.parseBattleAmount(amountText);
        startRestartGroup.updateRememberedValue(rememberedValue);
        ParsedBattleAmount parsedBattleAmount2222 = (ParsedBattleAmount) rememberedValue;
        startRestartGroup.endReplaceGroup();
        int i152222 = (i4 >> 3) & 14;
        int i162222 = i4 >> 12;
        Long rememberAnimatedBattleAmountValue2222 = BattleResultAnimationsKt.rememberAnimatedBattleAmountValue(amountText, z3, i9, 0, startRestartGroup, (i162222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | i152222 | (i162222 & 112), 8);
        if (z3) {
        }
        str3 = amountText;
        float f3222 = 12;
        Modifier background$default2222 = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f3222), Dp.m7774constructorimpl(f3222), 0.0f, 0.0f, 12, null)), palette.getHeaderGradient(), null, 0.0f, 6, null);
        if (!z4) {
        }
        if (!z4) {
        }
        Modifier m1520paddingqDBjuR0$default2222 = PaddingKt.m1520paddingqDBjuR0$default(background$default2222, 0.0f, m7774constructorimpl, 0.0f, z4 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(8), 5, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222);
        Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
        Color color52222 = color4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        Modifier battleRevealPop2222 = BattleResultAnimationsKt.battleRevealPop(Modifier.INSTANCE, i9, 2, z3);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealPop2222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        float f22222 = 2;
        TextKt.m2642Text4IGK_g(upperCase322, OffsetKt.m1475offsetVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f22222)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(z4 ? 17 : 20), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
        long sp2222 = TextUnitKt.getSp(z4 ? 17 : 20);
        FontFamily sfProFontFamily2222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight black2222 = FontWeight.INSTANCE.getBlack();
        TextKt.m2642Text4IGK_g(upperCase322, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(palette.getTitleGradient(), 0.0f, sp2222, black2222, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2222, (String) null, TextUnitKt.getSp(z4 ? 0.8d : 1.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), 14.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 33537714, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-1699705827);
        if (z5) {
        }
        startRestartGroup.endReplaceGroup();
        if (z5) {
        }
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl2), startRestartGroup, 0);
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        Modifier battleRevealRise2222 = BattleResultAnimationsKt.battleRevealRise(Modifier.INSTANCE, i9, 3, z3);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise2222);
        Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m5178unboximpl2222, TextUnitKt.getSp(z4 ? 22 : 26), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(2.0f) & 4294967295L)), 10.0f, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16768984, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z4 ? 15 : 18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        i13 = i9;
        color3 = color52222;
        z7 = z3;
        str4 = str5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleResultPremiumHeader(final BattleResultPalette palette, final String amountText, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final boolean z2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Composer startRestartGroup = composer.startRestartGroup(-1460495067);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(palette) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(amountText) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z3 = (i2 & 8) == 0 ? true : z;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1460495067, i3, -1, "org.betup.ui.dialogs.compose.BattleResultPremiumHeader (BattleResultComponents.kt:552)");
                }
                m13218BattleResultHeaderBandEoQKNkA(palette, amountText, modifier3, null, null, false, 0, false, startRestartGroup, i3 & 1022, 248);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z2 = z3;
            } else {
                startRestartGroup.skipToGroupEnd();
                z2 = z;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattleResultPremiumHeader$lambda$18;
                        BattleResultPremiumHeader$lambda$18 = BattleResultComponentsKt.BattleResultPremiumHeader$lambda$18(BattleResultPalette.this, amountText, modifier2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BattleResultPremiumHeader$lambda$18;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m13218BattleResultHeaderBandEoQKNkA(palette, amountText, modifier3, null, null, false, 0, false, startRestartGroup, i3 & 1022, 248);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        z2 = z3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleMatchChip(final NewChallengeMatchModel match, Modifier modifier, BattleResultPalette battleResultPalette, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BattleResultPalette battleResultPalette2;
        int i5;
        Function0<Unit> function02;
        BattleResultPalette battleResultPalette3;
        String name;
        String str;
        Brush m5117horizontalGradient8A3gB4$default;
        long m5167copywmQWz5c$default;
        long m5167copywmQWz5c$default2;
        long j;
        Modifier m1025backgroundbw27NRU$default;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        final BattleResultPalette battleResultPalette4;
        final Function0<Unit> function03;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(match, "match");
        Composer startRestartGroup = composer.startRestartGroup(-995844159);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(match) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                battleResultPalette2 = battleResultPalette;
                i3 |= startRestartGroup.changed(battleResultPalette2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        battleResultPalette3 = i4 == 0 ? null : battleResultPalette2;
                        Function0<Unit> function04 = i5 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-995844159, i3, -1, "org.betup.ui.dialogs.compose.BattleMatchChip (BattleResultComponents.kt:566)");
                        }
                        NewChallengeTeamModel homeTeam = match.getHomeTeam();
                        name = homeTeam == null ? homeTeam.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        NewChallengeTeamModel awayTeam = match.getAwayTeam();
                        String name2 = awayTeam == null ? awayTeam.getName() : null;
                        String str2 = name2 != null ? "" : name2;
                        String str3 = (UiExtensionsKt.isStarted(match) || match.getScoreHome() == null || match.getScoreAway() == null) ? "vs" : ((int) match.getScoreHome().doubleValue()) + "–" + ((int) match.getScoreAway().doubleValue());
                        String date = match.getDate();
                        String formattedDateWithoutYear = date == null ? UiExtensionsKt.getFormattedDateWithoutYear(date) : null;
                        str = formattedDateWithoutYear != null ? formattedDateWithoutYear : "";
                        m5117horizontalGradient8A3gB4$default = battleResultPalette3 == null ? Brush.Companion.m5117horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette3.m13237getAccentSoft0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.BattleChipSurface.INSTANCE.getColor(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette3.m13237getAccentSoft0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null) : null;
                        if (battleResultPalette3 == null) {
                            m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.BattleChipSurface.INSTANCE.getColor(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j2 = m5167copywmQWz5c$default;
                        if (battleResultPalette3 == null) {
                            m5167copywmQWz5c$default2 = battleResultPalette3.m13239getCaptionBorder0d7_KjU();
                        } else {
                            m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (battleResultPalette3 == null) {
                            j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                        }
                        long j3 = j;
                        long m13235getAccent0d7_KjU = battleResultPalette3 == null ? battleResultPalette3.m13235getAccent0d7_KjU() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        float f = 100;
                        Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                        if (m5117horizontalGradient8A3gB4$default == null) {
                            m1025backgroundbw27NRU$default = BackgroundKt.background$default(Modifier.INSTANCE, m5117horizontalGradient8A3gB4$default, null, 0.0f, 6, null);
                        } else {
                            m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, j2, null, 2, null);
                        }
                        Modifier m1036borderxT4_qwU = BorderKt.m1036borderxT4_qwU(clip.then(m1025backgroundbw27NRU$default), Dp.m7774constructorimpl(1), m5167copywmQWz5c$default2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(m1036borderxT4_qwU.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion2, false, null, null, function04, 7, null) : companion2), Dp.m7774constructorimpl(14), Dp.m7774constructorimpl(7));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        modifier3 = companion;
                        TextKt.m2642Text4IGK_g(name, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j3, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
                        TextKt.m2642Text4IGK_g(str3, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m13235getAccent0d7_KjU, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                        TextKt.m2642Text4IGK_g(str2, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7663getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j3, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
                        startRestartGroup.startReplaceGroup(-1855545307);
                        if (!StringsKt.isBlank(str)) {
                            TextKt.m2642Text4IGK_g("· " + str, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(battleResultPalette3 != null ? battleResultPalette3.m13247getSubtitle0d7_KjU() : ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(10), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 3072, 57340);
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
                        battleResultPalette4 = battleResultPalette3;
                        function03 = function04;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        battleResultPalette4 = battleResultPalette2;
                        function03 = function02;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleMatchChip$lambda$22;
                                BattleMatchChip$lambda$22 = BattleResultComponentsKt.BattleMatchChip$lambda$22(NewChallengeMatchModel.this, modifier4, battleResultPalette4, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleMatchChip$lambda$22;
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if ((i3 & 1171) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                NewChallengeTeamModel homeTeam2 = match.getHomeTeam();
                if (homeTeam2 == null) {
                }
                if (name == null) {
                }
                NewChallengeTeamModel awayTeam2 = match.getAwayTeam();
                if (awayTeam2 == null) {
                }
                if (name2 != null) {
                }
                String str32 = (UiExtensionsKt.isStarted(match) || match.getScoreHome() == null || match.getScoreAway() == null) ? "vs" : ((int) match.getScoreHome().doubleValue()) + "–" + ((int) match.getScoreAway().doubleValue());
                String date2 = match.getDate();
                if (date2 == null) {
                }
                if (formattedDateWithoutYear != null) {
                }
                if (battleResultPalette3 == null) {
                }
                if (battleResultPalette3 == null) {
                }
                long j22 = m5167copywmQWz5c$default;
                if (battleResultPalette3 == null) {
                }
                if (battleResultPalette3 == null) {
                }
                long j32 = j;
                long m13235getAccent0d7_KjU2 = battleResultPalette3 == null ? battleResultPalette3.m13235getAccent0d7_KjU() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                float f2 = 100;
                Modifier clip2 = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2)));
                if (m5117horizontalGradient8A3gB4$default == null) {
                }
                Modifier m1036borderxT4_qwU2 = BorderKt.m1036borderxT4_qwU(clip2.then(m1025backgroundbw27NRU$default), Dp.m7774constructorimpl(1), m5167copywmQWz5c$default2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2)));
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(m1036borderxT4_qwU2.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion22, false, null, null, function04, 7, null) : companion22), Dp.m7774constructorimpl(14), Dp.m7774constructorimpl(7));
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
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
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                modifier3 = companion;
                TextKt.m2642Text4IGK_g(name, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j32, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
                TextKt.m2642Text4IGK_g(str32, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m13235getAccent0d7_KjU2, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                TextKt.m2642Text4IGK_g(str2, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7663getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j32, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
                startRestartGroup.startReplaceGroup(-1855545307);
                if (!StringsKt.isBlank(str)) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                battleResultPalette4 = battleResultPalette3;
                function03 = function04;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            battleResultPalette2 = battleResultPalette;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            NewChallengeTeamModel homeTeam22 = match.getHomeTeam();
            if (homeTeam22 == null) {
            }
            if (name == null) {
            }
            NewChallengeTeamModel awayTeam22 = match.getAwayTeam();
            if (awayTeam22 == null) {
            }
            if (name2 != null) {
            }
            String str322 = (UiExtensionsKt.isStarted(match) || match.getScoreHome() == null || match.getScoreAway() == null) ? "vs" : ((int) match.getScoreHome().doubleValue()) + "–" + ((int) match.getScoreAway().doubleValue());
            String date22 = match.getDate();
            if (date22 == null) {
            }
            if (formattedDateWithoutYear != null) {
            }
            if (battleResultPalette3 == null) {
            }
            if (battleResultPalette3 == null) {
            }
            long j222 = m5167copywmQWz5c$default;
            if (battleResultPalette3 == null) {
            }
            if (battleResultPalette3 == null) {
            }
            long j322 = j;
            long m13235getAccent0d7_KjU22 = battleResultPalette3 == null ? battleResultPalette3.m13235getAccent0d7_KjU() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            float f22 = 100;
            Modifier clip22 = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22)));
            if (m5117horizontalGradient8A3gB4$default == null) {
            }
            Modifier m1036borderxT4_qwU22 = BorderKt.m1036borderxT4_qwU(clip22.then(m1025backgroundbw27NRU$default), Dp.m7774constructorimpl(1), m5167copywmQWz5c$default2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22)));
            Modifier.Companion companion222 = Modifier.INSTANCE;
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(m1036borderxT4_qwU22.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion222, false, null, null, function04, 7, null) : companion222), Dp.m7774constructorimpl(14), Dp.m7774constructorimpl(7));
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
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
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            modifier3 = companion;
            TextKt.m2642Text4IGK_g(name, rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j322, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
            TextKt.m2642Text4IGK_g(str322, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m13235getAccent0d7_KjU22, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            TextKt.m2642Text4IGK_g(str2, rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7663getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j322, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
            startRestartGroup.startReplaceGroup(-1855545307);
            if (!StringsKt.isBlank(str)) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            battleResultPalette4 = battleResultPalette3;
            function03 = function04;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        battleResultPalette2 = battleResultPalette;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        NewChallengeTeamModel homeTeam222 = match.getHomeTeam();
        if (homeTeam222 == null) {
        }
        if (name == null) {
        }
        NewChallengeTeamModel awayTeam222 = match.getAwayTeam();
        if (awayTeam222 == null) {
        }
        if (name2 != null) {
        }
        String str3222 = (UiExtensionsKt.isStarted(match) || match.getScoreHome() == null || match.getScoreAway() == null) ? "vs" : ((int) match.getScoreHome().doubleValue()) + "–" + ((int) match.getScoreAway().doubleValue());
        String date222 = match.getDate();
        if (date222 == null) {
        }
        if (formattedDateWithoutYear != null) {
        }
        if (battleResultPalette3 == null) {
        }
        if (battleResultPalette3 == null) {
        }
        long j2222 = m5167copywmQWz5c$default;
        if (battleResultPalette3 == null) {
        }
        if (battleResultPalette3 == null) {
        }
        long j3222 = j;
        long m13235getAccent0d7_KjU222 = battleResultPalette3 == null ? battleResultPalette3.m13235getAccent0d7_KjU() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        float f222 = 100;
        Modifier clip222 = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f222)));
        if (m5117horizontalGradient8A3gB4$default == null) {
        }
        Modifier m1036borderxT4_qwU222 = BorderKt.m1036borderxT4_qwU(clip222.then(m1025backgroundbw27NRU$default), Dp.m7774constructorimpl(1), m5167copywmQWz5c$default2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f222)));
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(m1036borderxT4_qwU222.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion2222, false, null, null, function04, 7, null) : companion2222), Dp.m7774constructorimpl(14), Dp.m7774constructorimpl(7));
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
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
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        modifier3 = companion;
        TextKt.m2642Text4IGK_g(name, rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j3222, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
        TextKt.m2642Text4IGK_g(str3222, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m13235getAccent0d7_KjU222, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
        TextKt.m2642Text4IGK_g(str2, rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7663getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m13219battleChipTextStyleIv8Zu3U(j3222, startRestartGroup, 0, 0), startRestartGroup, 0, 3120, 54780);
        startRestartGroup.startReplaceGroup(-1855545307);
        if (!StringsKt.isBlank(str)) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        battleResultPalette4 = battleResultPalette3;
        function03 = function04;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: battleChipTextStyle-Iv8Zu3U, reason: not valid java name */
    private static final TextStyle m13219battleChipTextStyleIv8Zu3U(long j, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1188527105);
        long j2 = (i2 & 1) != 0 ? ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor() : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1188527105, i, -1, "org.betup.ui.dialogs.compose.battleChipTextStyle (BattleResultComponents.kt:657)");
        }
        TextStyle textStyle = new TextStyle(j2, TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleStakesStrip(final long j, final long j2, final String yourOdds, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, Composer composer, final int i2, final int i3) {
        int i4;
        BattleResultPalette battleResultPalette2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        BattleResultPalette battleResultPalette3;
        boolean z3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final int i9;
        final boolean z4;
        final Modifier modifier3;
        final BattleResultPalette battleResultPalette4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(yourOdds, "yourOdds");
        Composer startRestartGroup = composer.startRestartGroup(1152194282);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(yourOdds) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    battleResultPalette2 = battleResultPalette;
                    if (startRestartGroup.changed(battleResultPalette2)) {
                        i10 = 16384;
                        i4 |= i10;
                    }
                } else {
                    battleResultPalette2 = battleResultPalette;
                }
                i10 = 8192;
                i4 |= i10;
            } else {
                battleResultPalette2 = battleResultPalette;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 1048576 : 524288;
                    if ((i4 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                battleResultPalette2 = BattleResultPalette.INSTANCE.from(BattleResultTone.NEUTRAL);
                            }
                            if (i5 != 0) {
                                z2 = false;
                            }
                            modifier2 = companion;
                            if (i6 != 0) {
                                i8 = 8;
                                battleResultPalette3 = battleResultPalette2;
                                z3 = z2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1152194282, i4, -1, "org.betup.ui.dialogs.compose.BattleStakesStrip (BattleResultComponents.kt:673)");
                                }
                                float rememberGlowPulse = BattleResultAnimationsKt.rememberGlowPulse(z3, 1600, startRestartGroup, ((i4 >> 15) & 14) | 48, 0);
                                Modifier battleRevealRise = BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i8, 3, z3);
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise);
                                int i12 = i8;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Modifier modifier4 = modifier2;
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
                                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                String stringResource = StringResources_androidKt.stringResource(R.string.buy_in, startRestartGroup, 6);
                                String dialogBetcoinsFormated = FormatHelper.getDialogBetcoinsFormated(j);
                                Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated, "getDialogBetcoinsFormated(...)");
                                int i13 = 458752 & (i4 << 3);
                                int i14 = i13 | 27648;
                                BattleStakeCell(stringResource, dialogBetcoinsFormated, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, true, battleResultPalette3, 0.0f, false, startRestartGroup, i14, 192);
                                String stringResource2 = StringResources_androidKt.stringResource(R.string.battle_pot_label, startRestartGroup, 6);
                                String dialogBetcoinsFormated2 = FormatHelper.getDialogBetcoinsFormated(j2);
                                Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated2, "getDialogBetcoinsFormated(...)");
                                BattleStakeCell(stringResource2, dialogBetcoinsFormated2, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), true, true, battleResultPalette3, rememberGlowPulse, z3, startRestartGroup, i14 | ((i4 << 6) & 29360128), 0);
                                boolean z5 = z3;
                                composer2 = startRestartGroup;
                                BattleStakeCell(StringResources_androidKt.stringResource(R.string.battle_your_odds, startRestartGroup, 6), yourOdds, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, false, battleResultPalette3, 0.0f, false, startRestartGroup, ((i4 >> 3) & 112) | 27648 | i13, 192);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i9 = i12;
                                z4 = z5;
                                modifier3 = modifier4;
                                battleResultPalette4 = battleResultPalette3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            modifier2 = modifier;
                        }
                        battleResultPalette3 = battleResultPalette2;
                        z3 = z2;
                        i8 = i7;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        float rememberGlowPulse2 = BattleResultAnimationsKt.rememberGlowPulse(z3, 1600, startRestartGroup, ((i4 >> 15) & 14) | 48, 0);
                        Modifier battleRevealRise2 = BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i8, 3, z3);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise2);
                        int i122 = i8;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier42 = modifier2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
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
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        String stringResource3 = StringResources_androidKt.stringResource(R.string.buy_in, startRestartGroup, 6);
                        String dialogBetcoinsFormated3 = FormatHelper.getDialogBetcoinsFormated(j);
                        Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated3, "getDialogBetcoinsFormated(...)");
                        int i132 = 458752 & (i4 << 3);
                        int i142 = i132 | 27648;
                        BattleStakeCell(stringResource3, dialogBetcoinsFormated3, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), false, true, battleResultPalette3, 0.0f, false, startRestartGroup, i142, 192);
                        String stringResource22 = StringResources_androidKt.stringResource(R.string.battle_pot_label, startRestartGroup, 6);
                        String dialogBetcoinsFormated22 = FormatHelper.getDialogBetcoinsFormated(j2);
                        Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated22, "getDialogBetcoinsFormated(...)");
                        BattleStakeCell(stringResource22, dialogBetcoinsFormated22, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), true, true, battleResultPalette3, rememberGlowPulse2, z3, startRestartGroup, i142 | ((i4 << 6) & 29360128), 0);
                        boolean z52 = z3;
                        composer2 = startRestartGroup;
                        BattleStakeCell(StringResources_androidKt.stringResource(R.string.battle_your_odds, startRestartGroup, 6), yourOdds, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), false, false, battleResultPalette3, 0.0f, false, startRestartGroup, ((i4 >> 3) & 112) | 27648 | i132, 192);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i9 = i122;
                        z4 = z52;
                        modifier3 = modifier42;
                        battleResultPalette4 = battleResultPalette3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        battleResultPalette4 = battleResultPalette2;
                        z4 = z2;
                        i9 = i7;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleStakesStrip$lambda$24;
                                BattleStakesStrip$lambda$24 = BattleResultComponentsKt.BattleStakesStrip$lambda$24(j, j2, yourOdds, modifier3, battleResultPalette4, z4, i9, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleStakesStrip$lambda$24;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                if ((i4 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                modifier2 = companion;
                if (i6 != 0) {
                }
                battleResultPalette3 = battleResultPalette2;
                z3 = z2;
                i8 = i7;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float rememberGlowPulse22 = BattleResultAnimationsKt.rememberGlowPulse(z3, 1600, startRestartGroup, ((i4 >> 15) & 14) | 48, 0);
                Modifier battleRevealRise22 = BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i8, 3, z3);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise22);
                int i1222 = i8;
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier422 = modifier2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
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
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                String stringResource32 = StringResources_androidKt.stringResource(R.string.buy_in, startRestartGroup, 6);
                String dialogBetcoinsFormated32 = FormatHelper.getDialogBetcoinsFormated(j);
                Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated32, "getDialogBetcoinsFormated(...)");
                int i1322 = 458752 & (i4 << 3);
                int i1422 = i1322 | 27648;
                BattleStakeCell(stringResource32, dialogBetcoinsFormated32, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), false, true, battleResultPalette3, 0.0f, false, startRestartGroup, i1422, 192);
                String stringResource222 = StringResources_androidKt.stringResource(R.string.battle_pot_label, startRestartGroup, 6);
                String dialogBetcoinsFormated222 = FormatHelper.getDialogBetcoinsFormated(j2);
                Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated222, "getDialogBetcoinsFormated(...)");
                BattleStakeCell(stringResource222, dialogBetcoinsFormated222, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), true, true, battleResultPalette3, rememberGlowPulse22, z3, startRestartGroup, i1422 | ((i4 << 6) & 29360128), 0);
                boolean z522 = z3;
                composer2 = startRestartGroup;
                BattleStakeCell(StringResources_androidKt.stringResource(R.string.battle_your_odds, startRestartGroup, 6), yourOdds, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), false, false, battleResultPalette3, 0.0f, false, startRestartGroup, ((i4 >> 3) & 112) | 27648 | i1322, 192);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                i9 = i1222;
                z4 = z522;
                modifier3 = modifier422;
                battleResultPalette4 = battleResultPalette3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i;
            if ((i4 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            modifier2 = companion;
            if (i6 != 0) {
            }
            battleResultPalette3 = battleResultPalette2;
            z3 = z2;
            i8 = i7;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            float rememberGlowPulse222 = BattleResultAnimationsKt.rememberGlowPulse(z3, 1600, startRestartGroup, ((i4 >> 15) & 14) | 48, 0);
            Modifier battleRevealRise222 = BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i8, 3, z3);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise222);
            int i12222 = i8;
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier4222 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            String stringResource322 = StringResources_androidKt.stringResource(R.string.buy_in, startRestartGroup, 6);
            String dialogBetcoinsFormated322 = FormatHelper.getDialogBetcoinsFormated(j);
            Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated322, "getDialogBetcoinsFormated(...)");
            int i13222 = 458752 & (i4 << 3);
            int i14222 = i13222 | 27648;
            BattleStakeCell(stringResource322, dialogBetcoinsFormated322, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), false, true, battleResultPalette3, 0.0f, false, startRestartGroup, i14222, 192);
            String stringResource2222 = StringResources_androidKt.stringResource(R.string.battle_pot_label, startRestartGroup, 6);
            String dialogBetcoinsFormated2222 = FormatHelper.getDialogBetcoinsFormated(j2);
            Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated2222, "getDialogBetcoinsFormated(...)");
            BattleStakeCell(stringResource2222, dialogBetcoinsFormated2222, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), true, true, battleResultPalette3, rememberGlowPulse222, z3, startRestartGroup, i14222 | ((i4 << 6) & 29360128), 0);
            boolean z5222 = z3;
            composer2 = startRestartGroup;
            BattleStakeCell(StringResources_androidKt.stringResource(R.string.battle_your_odds, startRestartGroup, 6), yourOdds, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), false, false, battleResultPalette3, 0.0f, false, startRestartGroup, ((i4 >> 3) & 112) | 27648 | i13222, 192);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            i9 = i12222;
            z4 = z5222;
            modifier3 = modifier4222;
            battleResultPalette4 = battleResultPalette3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i;
        if ((i4 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        modifier2 = companion;
        if (i6 != 0) {
        }
        battleResultPalette3 = battleResultPalette2;
        z3 = z2;
        i8 = i7;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float rememberGlowPulse2222 = BattleResultAnimationsKt.rememberGlowPulse(z3, 1600, startRestartGroup, ((i4 >> 15) & 14) | 48, 0);
        Modifier battleRevealRise2222 = BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i8, 3, z3);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, battleRevealRise2222);
        int i122222 = i8;
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier42222 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        String stringResource3222 = StringResources_androidKt.stringResource(R.string.buy_in, startRestartGroup, 6);
        String dialogBetcoinsFormated3222 = FormatHelper.getDialogBetcoinsFormated(j);
        Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated3222, "getDialogBetcoinsFormated(...)");
        int i132222 = 458752 & (i4 << 3);
        int i142222 = i132222 | 27648;
        BattleStakeCell(stringResource3222, dialogBetcoinsFormated3222, RowScope.weight$default(rowScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null), false, true, battleResultPalette3, 0.0f, false, startRestartGroup, i142222, 192);
        String stringResource22222 = StringResources_androidKt.stringResource(R.string.battle_pot_label, startRestartGroup, 6);
        String dialogBetcoinsFormated22222 = FormatHelper.getDialogBetcoinsFormated(j2);
        Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated22222, "getDialogBetcoinsFormated(...)");
        BattleStakeCell(stringResource22222, dialogBetcoinsFormated22222, RowScope.weight$default(rowScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null), true, true, battleResultPalette3, rememberGlowPulse2222, z3, startRestartGroup, i142222 | ((i4 << 6) & 29360128), 0);
        boolean z52222 = z3;
        composer2 = startRestartGroup;
        BattleStakeCell(StringResources_androidKt.stringResource(R.string.battle_your_odds, startRestartGroup, 6), yourOdds, RowScope.weight$default(rowScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null), false, false, battleResultPalette3, 0.0f, false, startRestartGroup, ((i4 >> 3) & 112) | 27648 | i132222, 192);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        i9 = i122222;
        z4 = z52222;
        modifier3 = modifier42222;
        battleResultPalette4 = battleResultPalette3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x042b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BattleStakeCell(final String str, final String str2, Modifier modifier, final boolean z, final boolean z2, final BattleResultPalette battleResultPalette, float f, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        final boolean z4;
        Brush m5125verticalGradient8A3gB4$default;
        long m5167copywmQWz5c$default;
        boolean z5;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        long j;
        final Modifier modifier3;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1580715681);
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
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changed(battleResultPalette) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
                z4 = z3;
            } else {
                z4 = z3;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion2 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                final float f3 = i4 == 0 ? 1.0f : f;
                if (i5 != 0) {
                    z4 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1580715681, i3, -1, "org.betup.ui.dialogs.compose.BattleStakeCell (BattleResultComponents.kt:724)");
                }
                float f4 = 8;
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4));
                if (!z) {
                    m5125verticalGradient8A3gB4$default = Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13246getPotFillTop0d7_KjU(), Color.m5170getAlphaimpl(battleResultPalette.m13246getPotFillTop0d7_KjU()) * RangesKt.coerceIn(f3, 0.75f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(battleResultPalette.m13245getPotFillBottom0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                } else {
                    m5125verticalGradient8A3gB4$default = Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null);
                }
                Brush brush = m5125verticalGradient8A3gB4$default;
                if (!z) {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(battleResultPalette.m13244getPotBorder0d7_KjU(), RangesKt.coerceAtMost(Color.m5170getAlphaimpl(battleResultPalette.m13244getPotBorder0d7_KjU()) * f3, 0.95f), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j2 = m5167copywmQWz5c$default;
                startRestartGroup.startReplaceGroup(1350689934);
                if (!z && z4) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z5 = z4;
                    boolean z6 = ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BattleStakeCell$lambda$26$lambda$25;
                                BattleStakeCell$lambda$26$lambda$25 = BattleResultComponentsKt.BattleStakeCell$lambda$26$lambda$25(BattleResultPalette.this, f3, (DrawScope) obj);
                                return BattleStakeCell$lambda$26$lambda$25;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    companion = DrawModifierKt.drawBehind(companion3, (Function1) rememberedValue);
                } else {
                    z5 = z4;
                    companion = Modifier.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1036borderxT4_qwU(companion2.then(companion), Dp.m7774constructorimpl(1), j2, roundedCornerShape), brush, roundedCornerShape, 0.0f, 4, null), Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(7));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
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
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                float f5 = f3;
                TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(9), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.4d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744280, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55294);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(3)), startRestartGroup, 6);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
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
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                long sp = TextUnitKt.getSp(14);
                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight bold = FontWeight.INSTANCE.getBold();
                if (!z) {
                    j = battleResultPalette.m13235getAccent0d7_KjU();
                } else {
                    j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                }
                TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp, bold, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 3) & 14, 3072, 57342);
                startRestartGroup.startReplaceGroup(-114940269);
                if (z2) {
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(11)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
                modifier3 = companion2;
                f2 = f5;
            } else {
                startRestartGroup.skipToGroupEnd();
                f2 = f;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattleStakeCell$lambda$29;
                        BattleStakeCell$lambda$29 = BattleResultComponentsKt.BattleStakeCell$lambda$29(str, str2, modifier3, z, z2, battleResultPalette, f2, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BattleStakeCell$lambda$29;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f42 = 8;
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f42));
        if (!z) {
        }
        Brush brush2 = m5125verticalGradient8A3gB4$default;
        if (!z) {
        }
        long j22 = m5167copywmQWz5c$default;
        startRestartGroup.startReplaceGroup(1350689934);
        if (!z) {
        }
        z5 = z4;
        companion = Modifier.INSTANCE;
        startRestartGroup.endReplaceGroup();
        RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1036borderxT4_qwU(companion2.then(companion), Dp.m7774constructorimpl(1), j22, roundedCornerShape2), brush2, roundedCornerShape2, 0.0f, 4, null), Dp.m7774constructorimpl(f42), Dp.m7774constructorimpl(7));
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        float f52 = f3;
        TextKt.m2642Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(9), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.4d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744280, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55294);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(3)), startRestartGroup, 6);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion42 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion42);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        long sp2 = TextUnitKt.getSp(14);
        FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight bold2 = FontWeight.INSTANCE.getBold();
        if (!z) {
        }
        TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp2, bold2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 3) & 14, 3072, 57342);
        startRestartGroup.startReplaceGroup(-114940269);
        if (z2) {
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
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z5;
        modifier3 = companion2;
        f2 = f52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleStakeCell$lambda$26$lambda$25(BattleResultPalette battleResultPalette, float f, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), f * 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        float f2 = drawBehind.mo1167toPx0680j_4(Dp.m7774constructorimpl(12));
        DrawScope.m5726drawRoundRectuAw5IA$default(drawBehind, m5167copywmQWz5c$default, 0L, drawBehind.mo5730getSizeNHjbRc(), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), null, 0.0f, null, 0, 242, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePickChip$lambda$31$lambda$30(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattlePickChip(final String groupName, final String betName, final String str, final String coefficient, final BattleBetHighlightStyle highlight, final Boolean bool, Modifier modifier, boolean z, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function1<? super Boolean, Unit> function12;
        Object rememberedValue;
        final MutableState mutableState;
        String str2;
        boolean z3;
        BattleResultComponentsKt$BattlePickChip$2$1 rememberedValue2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Object rememberedValue3;
        Object rememberedValue4;
        Composer composer2;
        final boolean z4;
        final Modifier modifier3;
        final Function1<? super Boolean, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(coefficient, "coefficient");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        Composer startRestartGroup = composer.startRestartGroup(160884791);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(groupName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(betName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(coefficient) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(highlight.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(bool) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
            }
            i5 = i2 & 256;
            if (i5 == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
            }
            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z5 = i4 == 0 ? false : z2;
                if (i5 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BattlePickChip$lambda$31$lambda$30;
                                BattlePickChip$lambda$31$lambda$30 = BattleResultComponentsKt.BattlePickChip$lambda$31$lambda$30(((Boolean) obj).booleanValue());
                                return BattlePickChip$lambda$31$lambda$30;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    function12 = (Function1) rememberedValue5;
                } else {
                    function12 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(160884791, i3, -1, "org.betup.ui.dialogs.compose.BattlePickChip (BattleResultComponents.kt:819)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                String buildPeriodTag = buildPeriodTag(str, groupName);
                startRestartGroup.startReplaceGroup(-8524029);
                str2 = betName;
                if (StringsKt.isBlank(str2)) {
                    str2 = StringResources_androidKt.stringResource(R.string.not_set, startRestartGroup, 6);
                }
                String str3 = str2;
                startRestartGroup.endReplaceGroup();
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8));
                TweenSpec tween$default = AnimationSpecKt.tween$default(220, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                TweenSpec tween$default2 = AnimationSpecKt.tween$default(180, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                Boolean valueOf = Boolean.valueOf(BattlePickChip$lambda$33(mutableState));
                startRestartGroup.startReplaceGroup(-1633490746);
                z3 = (234881024 & i3) != 67108864;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new BattleResultComponentsKt$BattlePickChip$2$1(function12, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier4 = companion;
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
                Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !BattlePickChip$lambda$33(mutableState) ? 0.0f : 1.0f);
                boolean z6 = !BattlePickChip$lambda$33(mutableState);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BattlePickChip$lambda$40$lambda$39$lambda$38;
                            BattlePickChip$lambda$40$lambda$39$lambda$38 = BattleResultComponentsKt.BattlePickChip$lambda$40$lambda$39$lambda$38(MutableState.this);
                            return BattlePickChip$lambda$40$lambda$39$lambda$38;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1057clickableO2vRcR0$default = ClickableKt.m1057clickableO2vRcR0$default(alpha, mutableInteractionSource, null, z6, null, null, (Function0) rememberedValue4, 24, null);
                int i7 = i3 >> 3;
                Function1<? super Boolean, Unit> function14 = function12;
                BattlePickChipBody(buildPeriodTag, str3, coefficient, highlight, bool, z5, false, m1057clickableO2vRcR0$default, startRestartGroup, (i7 & 57344) | (i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 1572864 | (i7 & 7168) | ((i3 >> 6) & 458752), 0);
                boolean BattlePickChip$lambda$33 = BattlePickChip$lambda$33(mutableState);
                Modifier zIndex = ZIndexModifierKt.zIndex(boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopStart()), 12.0f);
                TweenSpec tweenSpec = tween$default;
                TweenSpec tweenSpec2 = tween$default2;
                composer2 = startRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(BattlePickChip$lambda$33, zIndex, EnterExitTransitionKt.expandVertically$default(tweenSpec, Alignment.INSTANCE.getTop(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(tweenSpec2, 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(tweenSpec, Alignment.INSTANCE.getTop(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(tweenSpec2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1218613479, true, new BattleResultComponentsKt$BattlePickChip$3$3(buildPeriodTag, str3, coefficient, highlight, bool, z5, m1810RoundedCornerShape0680j_4, mutableState), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
                modifier3 = modifier4;
                function13 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
                function13 = function1;
                composer2 = startRestartGroup;
                Modifier modifier5 = modifier2;
                z4 = z2;
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattlePickChip$lambda$41;
                        BattlePickChip$lambda$41 = BattleResultComponentsKt.BattlePickChip$lambda$41(groupName, betName, str, coefficient, highlight, bool, modifier3, z4, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BattlePickChip$lambda$41;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i5 = i2 & 256;
        if (i5 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        String buildPeriodTag2 = buildPeriodTag(str, groupName);
        startRestartGroup.startReplaceGroup(-8524029);
        str2 = betName;
        if (StringsKt.isBlank(str2)) {
        }
        String str32 = str2;
        startRestartGroup.endReplaceGroup();
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8));
        TweenSpec tween$default3 = AnimationSpecKt.tween$default(220, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        TweenSpec tween$default22 = AnimationSpecKt.tween$default(180, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        Boolean valueOf2 = Boolean.valueOf(BattlePickChip$lambda$33(mutableState));
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((234881024 & i3) != 67108864) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = new BattleResultComponentsKt$BattlePickChip$2$1(function12, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier42 = companion;
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
        Modifier alpha2 = AlphaKt.alpha(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !BattlePickChip$lambda$33(mutableState) ? 0.0f : 1.0f);
        boolean z62 = !BattlePickChip$lambda$33(mutableState);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1057clickableO2vRcR0$default2 = ClickableKt.m1057clickableO2vRcR0$default(alpha2, mutableInteractionSource2, null, z62, null, null, (Function0) rememberedValue4, 24, null);
        int i72 = i3 >> 3;
        Function1<? super Boolean, Unit> function142 = function12;
        BattlePickChipBody(buildPeriodTag2, str32, coefficient, highlight, bool, z5, false, m1057clickableO2vRcR0$default2, startRestartGroup, (i72 & 57344) | (i72 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 1572864 | (i72 & 7168) | ((i3 >> 6) & 458752), 0);
        boolean BattlePickChip$lambda$332 = BattlePickChip$lambda$33(mutableState);
        Modifier zIndex2 = ZIndexModifierKt.zIndex(boxScopeInstance2.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopStart()), 12.0f);
        TweenSpec tweenSpec3 = tween$default3;
        TweenSpec tweenSpec22 = tween$default22;
        composer2 = startRestartGroup;
        AnimatedVisibilityKt.AnimatedVisibility(BattlePickChip$lambda$332, zIndex2, EnterExitTransitionKt.expandVertically$default(tweenSpec3, Alignment.INSTANCE.getTop(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(tweenSpec22, 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(tweenSpec3, Alignment.INSTANCE.getTop(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(tweenSpec22, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1218613479, true, new BattleResultComponentsKt$BattlePickChip$3$3(buildPeriodTag2, str32, coefficient, highlight, bool, z5, m1810RoundedCornerShape0680j_42, mutableState), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z5;
        modifier3 = modifier42;
        function13 = function142;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattlePickChip$lambda$33(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BattlePickChip$lambda$34(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePickChip$lambda$40$lambda$39$lambda$38(MutableState mutableState) {
        BattlePickChip$lambda$34(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattlePickChipBody(final String str, final String str2, final String str3, final BattleBetHighlightStyle battleBetHighlightStyle, final Boolean bool, final boolean z, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j;
        int i5;
        long m5167copywmQWz5c$default;
        Brush m5125verticalGradient8A3gB4$default;
        int i6;
        float m7774constructorimpl;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        Composer composer3;
        final Modifier modifier4;
        float m7774constructorimpl2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(791020261);
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
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(battleBetHighlightStyle.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(bool) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        int i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(791020261, i3, -1, "org.betup.ui.dialogs.compose.BattlePickChipBody (BattleResultComponents.kt:913)");
                }
                float f = 8;
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f));
                i4 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                if (i4 != 1) {
                    j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                } else if (i4 == 2) {
                    j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (i4 == 3) {
                    j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j2 = j;
                i5 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                if (i5 != 1) {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (i5 == 2) {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (!z2) {
                    m5125verticalGradient8A3gB4$default = Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.98f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.BattleCardSurfaceBottom.INSTANCE.getColor(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null);
                } else {
                    m5125verticalGradient8A3gB4$default = Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(m5167copywmQWz5c$default), Color.m5158boximpl(m5167copywmQWz5c$default)}), 0.0f, 0.0f, 0, 14, (Object) null);
                }
                if (!z2) {
                    i6 = i3;
                    m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                } else {
                    i6 = i3;
                    m7774constructorimpl = Dp.m7774constructorimpl(1);
                }
                RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1036borderxT4_qwU(modifier5, m7774constructorimpl, Color.m5167copywmQWz5c$default(j2, !z2 ? 0.95f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShape), m5125verticalGradient8A3gB4$default, roundedCornerShape, 0.0f, 4, null), !z ? Dp.m7774constructorimpl(6) : Dp.m7774constructorimpl(f), !z ? Dp.m7774constructorimpl(4) : Dp.m7774constructorimpl(6));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
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
                startRestartGroup.startReplaceGroup(-704869611);
                if (StringsKt.isBlank(str)) {
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), z2 ? 0.9f : 0.75f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m7774constructorimpl(6), z ? Dp.m7774constructorimpl(1) : Dp.m7774constructorimpl(2));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    i7 = i6;
                    modifier3 = modifier5;
                    TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, z2 ? Integer.MAX_VALUE : 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(z ? 7 : 8), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744280, (DefaultConstructorMarker) null), startRestartGroup, i6 & 14, 48, 55294);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (z) {
                        i8 = 2;
                        m7774constructorimpl2 = Dp.m7774constructorimpl(2);
                        i9 = 3;
                    } else {
                        i8 = 2;
                        i9 = 3;
                        m7774constructorimpl2 = Dp.m7774constructorimpl(3);
                    }
                    composer2 = startRestartGroup;
                    z3 = false;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl2), composer2, 0);
                } else {
                    modifier3 = modifier5;
                    composer2 = startRestartGroup;
                    i7 = i6;
                    i8 = 2;
                    i9 = 3;
                    z3 = false;
                }
                composer2.endReplaceGroup();
                TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z ? 11 : 12), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, !z ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null);
                if (z2) {
                    i8 = Integer.MAX_VALUE;
                }
                composer3 = composer2;
                int i11 = i9;
                TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, i8, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer3, (i7 >> 3) & 14, 48, 55294);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (!z) {
                    i11 = 4;
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion2, Dp.m7774constructorimpl(i11)), composer3, 0);
                BattlePickChipOddsRow(str3, battleBetHighlightStyle, bool, composer3, (i7 >> 6) & 1022);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer3 = startRestartGroup;
                modifier4 = modifier2;
            }
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattlePickChipBody$lambda$44;
                        BattlePickChipBody$lambda$44 = BattleResultComponentsKt.BattlePickChipBody$lambda$44(str, str2, str3, battleBetHighlightStyle, bool, z, z2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BattlePickChipBody$lambda$44;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 4793491) == 4793490) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f2 = 8;
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2));
        i4 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i4 != 1) {
        }
        long j22 = j;
        i5 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i5 != 1) {
        }
        if (!z2) {
        }
        if (!z2) {
        }
        RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
        Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1036borderxT4_qwU(modifier5, m7774constructorimpl, Color.m5167copywmQWz5c$default(j22, !z2 ? 0.95f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShape2), m5125verticalGradient8A3gB4$default, roundedCornerShape2, 0.0f, 4, null), !z ? Dp.m7774constructorimpl(6) : Dp.m7774constructorimpl(f2), !z ? Dp.m7774constructorimpl(4) : Dp.m7774constructorimpl(6));
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN43);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-704869611);
        if (StringsKt.isBlank(str)) {
        }
        composer2.endReplaceGroup();
        TextStyle textStyle2 = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z ? 11 : 12), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, !z ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null);
        if (z2) {
        }
        composer3 = composer2;
        int i112 = i9;
        TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, i8, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer3, (i7 >> 3) & 14, 48, 55294);
        Modifier.Companion companion22 = Modifier.INSTANCE;
        if (!z) {
        }
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion22, Dp.m7774constructorimpl(i112)), composer3, 0);
        BattlePickChipOddsRow(str3, battleBetHighlightStyle, bool, composer3, (i7 >> 6) & 1022);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void BattlePickChipOddsRow(final String str, final BattleBetHighlightStyle battleBetHighlightStyle, final Boolean bool, Composer composer, final int i) {
        int i2;
        Composer composer2;
        long m5167copywmQWz5c$default;
        long j;
        Composer startRestartGroup = composer.startRestartGroup(129589546);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(battleBetHighlightStyle.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(bool) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129589546, i2, -1, "org.betup.ui.dialogs.compose.BattlePickChipOddsRow (BattleResultComponents.kt:998)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            startRestartGroup.startReplaceGroup(1705557402);
            if (bool != null) {
                Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16));
                if (bool.booleanValue()) {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(m1563size3ABfNKs, m5167copywmQWz5c$default, RoundedCornerShapeKt.getCircleShape());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
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
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String str2 = bool.booleanValue() ? "✓" : "✗";
                long sp = TextUnitKt.getSp(9);
                FontWeight bold = FontWeight.INSTANCE.getBold();
                if (bool.booleanValue()) {
                    j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                } else {
                    j = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
                }
                TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp, bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(5)), startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            int i3 = (i2 >> 3) & 14;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(Modifier.INSTANCE, BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle, startRestartGroup, i3), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), Dp.m7774constructorimpl(10), Dp.m7774constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle, startRestartGroup, i3), TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, i2 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattlePickChipOddsRow$lambda$48;
                    BattlePickChipOddsRow$lambda$48 = BattleResultComponentsKt.BattlePickChipOddsRow$lambda$48(str, battleBetHighlightStyle, bool, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BattlePickChipOddsRow$lambda$48;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x039e, code lost:
    
        if (r8 == null) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleDuelSection(final OrderedBattleParticipants ordered, final OddType oddType, final boolean z, final boolean z2, final String betHiddenText, Modifier modifier, BattleResultPalette battleResultPalette, boolean z3, int i, boolean z4, final Function1<? super Long, Unit> onUserClick, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        BattleResultPalette battleResultPalette2;
        boolean z5;
        Modifier modifier2;
        BattleResultPalette battleResultPalette3;
        boolean z6;
        int i10;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        String name;
        NewChallengeBetDetailsModel bet;
        NewChallengeBetTypeGroupModel betTypeGroup;
        String str;
        NewChallengeBetDetailsModel bet2;
        NewChallengeBetModel leftBet;
        NewChallengeBetDetailsModel bet3;
        String str2;
        NewChallengeBetDetailsModel bet4;
        NewChallengeBetTypeGroupModel betTypeGroup2;
        String str3;
        NewChallengeBetDetailsModel bet5;
        NewChallengeBetModel rightBet;
        NewChallengeBetDetailsModel bet6;
        NewChallengeBetModel rightBet2;
        OddType oddType2;
        Double d;
        NewChallengeBetModel rightBet3;
        Composer composer2;
        final int i11;
        final BattleResultPalette battleResultPalette4;
        final boolean z7;
        final boolean z8;
        final Modifier modifier3;
        NewChallengeBetDetailsModel bet7;
        NewChallengeBetDetailsModel bet8;
        NewChallengeBetDetailsModel bet9;
        NewChallengeBetDetailsModel bet10;
        ScopeUpdateScope endRestartGroup;
        int i12;
        Intrinsics.checkNotNullParameter(ordered, "ordered");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(betHiddenText, "betHiddenText");
        Intrinsics.checkNotNullParameter(onUserClick, "onUserClick");
        Composer startRestartGroup = composer.startRestartGroup(1701849413);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(ordered) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(oddType.ordinal()) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(betHiddenText) ? 16384 : 8192;
        }
        int i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
            if ((1572864 & i2) == 0) {
                if ((i4 & 64) == 0 && startRestartGroup.changed(battleResultPalette)) {
                    i12 = 1048576;
                    i5 |= i12;
                }
                i12 = 524288;
                i5 |= i12;
            }
            i6 = i4 & 128;
            if (i6 == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
            }
            i7 = i4 & 256;
            if (i7 == 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i5 |= startRestartGroup.changed(i) ? 67108864 : 33554432;
            }
            i8 = i4 & 512;
            if (i8 == 0) {
                i5 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i5 |= startRestartGroup.changed(z4) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            if ((i4 & 1024) == 0) {
                i9 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i9 = i3 | (startRestartGroup.changedInstance(onUserClick) ? 4 : 2);
            } else {
                i9 = i3;
            }
            if ((i5 & 306783379) == 306783378 || (i9 & 3) != 2 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i13 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i4 & 64) == 0) {
                        battleResultPalette2 = BattleResultPalette.INSTANCE.from(BattleResultTone.NEUTRAL);
                        i5 &= -3670017;
                    } else {
                        battleResultPalette2 = battleResultPalette;
                    }
                    boolean z9 = i6 == 0 ? false : z3;
                    int i14 = i7 == 0 ? 8 : i;
                    if (i8 == 0) {
                        modifier2 = companion;
                        battleResultPalette3 = battleResultPalette2;
                        z5 = false;
                    } else {
                        z5 = z4;
                        modifier2 = companion;
                        battleResultPalette3 = battleResultPalette2;
                    }
                    int i15 = i14;
                    z6 = z9;
                    i10 = i15;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    modifier2 = modifier;
                    battleResultPalette3 = battleResultPalette;
                    z6 = z3;
                    i10 = i;
                    z5 = z4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1701849413, i5, i9, "org.betup.ui.dialogs.compose.BattleDuelSection (BattleResultComponents.kt:1066)");
                }
                float rememberGlowPulse = BattleResultAnimationsKt.rememberGlowPulse(z6, 0, startRestartGroup, (i5 >> 21) & 14, 2);
                boolean z10 = !z6 && i10 >= 6;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Modifier modifier4 = modifier2;
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
                float f = 2;
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.Min), Dp.m7774constructorimpl(f), 0.0f, 2, null);
                Alignment.Vertical top = Alignment.INSTANCE.getTop();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                NewChallengeParticipantModel leftUser = ordered.getLeftUser();
                if (!z) {
                    NewChallengeBetModel leftBet2 = ordered.getLeftBet();
                    name = (leftBet2 == null || (bet = leftBet2.getBet()) == null || (betTypeGroup = bet.getBetTypeGroup()) == null) ? null : betTypeGroup.getName();
                }
                name = "";
                if (z) {
                    NewChallengeBetModel leftBet3 = ordered.getLeftBet();
                    String betName = (leftBet3 == null || (bet2 = leftBet3.getBet()) == null) ? null : bet2.getBetName();
                    str = betName == null ? "" : betName;
                } else {
                    str = betHiddenText;
                }
                String betsGameType = (z || (leftBet = ordered.getLeftBet()) == null || (bet3 = leftBet.getBet()) == null) ? null : bet3.getBetsGameType();
                NewChallengeBetModel leftBet4 = ordered.getLeftBet();
                String formatBattleCoef = formatBattleCoef((leftBet4 != null || (bet10 = leftBet4.getBet()) == null) ? null : bet10.getPlacedCoefficient(), oddType, z);
                NewChallengeBetModel leftBet5 = ordered.getLeftBet();
                Double placedCoefficient = (leftBet5 != null || (bet9 = leftBet5.getBet()) == null) ? null : bet9.getPlacedCoefficient();
                BattleBetHighlightStyle leftHighlight = ordered.getLeftHighlight();
                Boolean betWonFromHighlight = betWonFromHighlight(ordered.getLeftHighlight());
                Modifier battleRevealSlide = BattleResultAnimationsKt.battleRevealSlide(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), i10, 5, z6, true);
                int i16 = ((i5 << 15) & 3670016) | 805306368;
                int i17 = (i5 >> 18) & 14;
                int i18 = i5 >> 15;
                int i19 = (i18 & 57344) | i17 | (i18 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i9 << 18) & 3670016);
                Double d2 = null;
                String str4 = name;
                int i20 = i10;
                String str5 = str;
                boolean z11 = z6;
                BattleDuelColumn(leftUser, str4, str5, betsGameType, formatBattleCoef, placedCoefficient, oddType, leftHighlight, betWonFromHighlight, true, battleResultPalette3, rememberGlowPulse, z11, z10, z5, battleRevealSlide, onUserClick, startRestartGroup, i16, i19, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), (String) null, BattleResultAnimationsKt.battleRevealPop(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(z5 ? 18 : 22), Dp.m7774constructorimpl(f), 0.0f, 8, null), Dp.m7774constructorimpl(z5 ? 30 : 36)), Dp.m7774constructorimpl(z5 ? 26 : 30)), i20, 5, z11), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                NewChallengeParticipantModel rightUser = ordered.getRightUser();
                if (!z2) {
                    NewChallengeBetModel rightBet4 = ordered.getRightBet();
                    String name2 = (rightBet4 == null || (bet4 = rightBet4.getBet()) == null || (betTypeGroup2 = bet4.getBetTypeGroup()) == null) ? null : betTypeGroup2.getName();
                    if (name2 != null) {
                        str2 = name2;
                        if (z2) {
                            NewChallengeBetModel rightBet5 = ordered.getRightBet();
                            String betName2 = (rightBet5 == null || (bet5 = rightBet5.getBet()) == null) ? null : bet5.getBetName();
                            str3 = betName2 == null ? "" : betName2;
                        } else {
                            str3 = betHiddenText;
                        }
                        String betsGameType2 = (z2 || (rightBet = ordered.getRightBet()) == null || (bet6 = rightBet.getBet()) == null) ? null : bet6.getBetsGameType();
                        rightBet2 = ordered.getRightBet();
                        if (rightBet2 != null || (bet8 = rightBet2.getBet()) == null) {
                            oddType2 = oddType;
                            d = null;
                        } else {
                            d = bet8.getPlacedCoefficient();
                            oddType2 = oddType;
                        }
                        String formatBattleCoef2 = formatBattleCoef(d, oddType2, z2);
                        rightBet3 = ordered.getRightBet();
                        if (rightBet3 != null && (bet7 = rightBet3.getBet()) != null) {
                            d2 = bet7.getPlacedCoefficient();
                        }
                        composer2 = startRestartGroup;
                        BattleDuelColumn(rightUser, str2, str3, betsGameType2, formatBattleCoef2, d2, oddType, ordered.getRightHighlight(), betWonFromHighlight(ordered.getRightHighlight()), false, battleResultPalette3, rememberGlowPulse, z11, z10, z5, BattleResultAnimationsKt.battleRevealSlide(AlphaKt.alpha(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), ordered.getRightHighlight() == BattleBetHighlightStyle.WINNER_MUTED ? 0.6f : 1.0f), i20, 5, z11, false), onUserClick, composer2, i16, i19, 0);
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
                        i11 = i20;
                        battleResultPalette4 = battleResultPalette3;
                        z7 = z5;
                        z8 = z11;
                        modifier3 = modifier4;
                    }
                }
                str2 = "";
                if (z2) {
                }
                if (z2) {
                    rightBet2 = ordered.getRightBet();
                    if (rightBet2 != null) {
                    }
                    oddType2 = oddType;
                    d = null;
                    String formatBattleCoef22 = formatBattleCoef(d, oddType2, z2);
                    rightBet3 = ordered.getRightBet();
                    if (rightBet3 != null) {
                        d2 = bet7.getPlacedCoefficient();
                    }
                    composer2 = startRestartGroup;
                    BattleDuelColumn(rightUser, str2, str3, betsGameType2, formatBattleCoef22, d2, oddType, ordered.getRightHighlight(), betWonFromHighlight(ordered.getRightHighlight()), false, battleResultPalette3, rememberGlowPulse, z11, z10, z5, BattleResultAnimationsKt.battleRevealSlide(AlphaKt.alpha(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), ordered.getRightHighlight() == BattleBetHighlightStyle.WINNER_MUTED ? 0.6f : 1.0f), i20, 5, z11, false), onUserClick, composer2, i16, i19, 0);
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
                    i11 = i20;
                    battleResultPalette4 = battleResultPalette3;
                    z7 = z5;
                    z8 = z11;
                    modifier3 = modifier4;
                }
                rightBet2 = ordered.getRightBet();
                if (rightBet2 != null) {
                }
                oddType2 = oddType;
                d = null;
                String formatBattleCoef222 = formatBattleCoef(d, oddType2, z2);
                rightBet3 = ordered.getRightBet();
                if (rightBet3 != null) {
                }
                composer2 = startRestartGroup;
                BattleDuelColumn(rightUser, str2, str3, betsGameType2, formatBattleCoef222, d2, oddType, ordered.getRightHighlight(), betWonFromHighlight(ordered.getRightHighlight()), false, battleResultPalette3, rememberGlowPulse, z11, z10, z5, BattleResultAnimationsKt.battleRevealSlide(AlphaKt.alpha(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), ordered.getRightHighlight() == BattleBetHighlightStyle.WINNER_MUTED ? 0.6f : 1.0f), i20, 5, z11, false), onUserClick, composer2, i16, i19, 0);
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
                i11 = i20;
                battleResultPalette4 = battleResultPalette3;
                z7 = z5;
                z8 = z11;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                battleResultPalette4 = battleResultPalette;
                z8 = z3;
                i11 = i;
                z7 = z4;
                composer2 = startRestartGroup;
                modifier3 = modifier;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattleDuelSection$lambda$51;
                        BattleDuelSection$lambda$51 = BattleResultComponentsKt.BattleDuelSection$lambda$51(OrderedBattleParticipants.this, oddType, z, z2, betHiddenText, modifier3, battleResultPalette4, z8, i11, z7, onUserClick, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return BattleDuelSection$lambda$51;
                    }
                });
                return;
            }
            return;
        }
        if ((1572864 & i2) == 0) {
        }
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        i7 = i4 & 256;
        if (i7 == 0) {
        }
        i8 = i4 & 512;
        if (i8 == 0) {
        }
        if ((i4 & 1024) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        int i152 = i14;
        z6 = z9;
        i10 = i152;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float rememberGlowPulse2 = BattleResultAnimationsKt.rememberGlowPulse(z6, 0, startRestartGroup, (i5 >> 21) & 14, 2);
        if (z6) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Modifier modifier42 = modifier2;
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        float f2 = 2;
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.Min), Dp.m7774constructorimpl(f2), 0.0f, 2, null);
        Alignment.Vertical top2 = Alignment.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        NewChallengeParticipantModel leftUser2 = ordered.getLeftUser();
        if (!z) {
        }
        name = "";
        if (z) {
        }
        if (z) {
            NewChallengeBetModel leftBet42 = ordered.getLeftBet();
            String formatBattleCoef3 = formatBattleCoef((leftBet42 != null || (bet10 = leftBet42.getBet()) == null) ? null : bet10.getPlacedCoefficient(), oddType, z);
            NewChallengeBetModel leftBet52 = ordered.getLeftBet();
            if (leftBet52 != null) {
            }
            BattleBetHighlightStyle leftHighlight2 = ordered.getLeftHighlight();
            Boolean betWonFromHighlight2 = betWonFromHighlight(ordered.getLeftHighlight());
            Modifier battleRevealSlide2 = BattleResultAnimationsKt.battleRevealSlide(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), i10, 5, z6, true);
            int i162 = ((i5 << 15) & 3670016) | 805306368;
            int i172 = (i5 >> 18) & 14;
            int i182 = i5 >> 15;
            int i192 = (i182 & 57344) | i172 | (i182 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i9 << 18) & 3670016);
            Double d22 = null;
            String str42 = name;
            int i202 = i10;
            String str52 = str;
            boolean z112 = z6;
            BattleDuelColumn(leftUser2, str42, str52, betsGameType, formatBattleCoef3, placedCoefficient, oddType, leftHighlight2, betWonFromHighlight2, true, battleResultPalette3, rememberGlowPulse2, z112, z10, z5, battleRevealSlide2, onUserClick, startRestartGroup, i162, i192, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), (String) null, BattleResultAnimationsKt.battleRevealPop(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(z5 ? 18 : 22), Dp.m7774constructorimpl(f2), 0.0f, 8, null), Dp.m7774constructorimpl(z5 ? 30 : 36)), Dp.m7774constructorimpl(z5 ? 26 : 30)), i202, 5, z112), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            NewChallengeParticipantModel rightUser2 = ordered.getRightUser();
            if (!z2) {
            }
            str2 = "";
            if (z2) {
            }
            if (z2) {
            }
            rightBet2 = ordered.getRightBet();
            if (rightBet2 != null) {
            }
            oddType2 = oddType;
            d = null;
            String formatBattleCoef2222 = formatBattleCoef(d, oddType2, z2);
            rightBet3 = ordered.getRightBet();
            if (rightBet3 != null) {
            }
            composer2 = startRestartGroup;
            BattleDuelColumn(rightUser2, str2, str3, betsGameType2, formatBattleCoef2222, d22, oddType, ordered.getRightHighlight(), betWonFromHighlight(ordered.getRightHighlight()), false, battleResultPalette3, rememberGlowPulse2, z112, z10, z5, BattleResultAnimationsKt.battleRevealSlide(AlphaKt.alpha(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), ordered.getRightHighlight() == BattleBetHighlightStyle.WINNER_MUTED ? 0.6f : 1.0f), i202, 5, z112, false), onUserClick, composer2, i162, i192, 0);
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
            i11 = i202;
            battleResultPalette4 = battleResultPalette3;
            z7 = z5;
            z8 = z112;
            modifier3 = modifier42;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        NewChallengeBetModel leftBet422 = ordered.getLeftBet();
        String formatBattleCoef32 = formatBattleCoef((leftBet422 != null || (bet10 = leftBet422.getBet()) == null) ? null : bet10.getPlacedCoefficient(), oddType, z);
        NewChallengeBetModel leftBet522 = ordered.getLeftBet();
        if (leftBet522 != null) {
        }
        BattleBetHighlightStyle leftHighlight22 = ordered.getLeftHighlight();
        Boolean betWonFromHighlight22 = betWonFromHighlight(ordered.getLeftHighlight());
        Modifier battleRevealSlide22 = BattleResultAnimationsKt.battleRevealSlide(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), i10, 5, z6, true);
        int i1622 = ((i5 << 15) & 3670016) | 805306368;
        int i1722 = (i5 >> 18) & 14;
        int i1822 = i5 >> 15;
        int i1922 = (i1822 & 57344) | i1722 | (i1822 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i9 << 18) & 3670016);
        Double d222 = null;
        String str422 = name;
        int i2022 = i10;
        String str522 = str;
        boolean z1122 = z6;
        BattleDuelColumn(leftUser2, str422, str522, betsGameType, formatBattleCoef32, placedCoefficient, oddType, leftHighlight22, betWonFromHighlight22, true, battleResultPalette3, rememberGlowPulse2, z1122, z10, z5, battleRevealSlide22, onUserClick, startRestartGroup, i1622, i1922, 0);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), (String) null, BattleResultAnimationsKt.battleRevealPop(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(z5 ? 18 : 22), Dp.m7774constructorimpl(f2), 0.0f, 8, null), Dp.m7774constructorimpl(z5 ? 30 : 36)), Dp.m7774constructorimpl(z5 ? 26 : 30)), i2022, 5, z1122), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
        NewChallengeParticipantModel rightUser22 = ordered.getRightUser();
        if (!z2) {
        }
        str2 = "";
        if (z2) {
        }
        if (z2) {
        }
        rightBet2 = ordered.getRightBet();
        if (rightBet2 != null) {
        }
        oddType2 = oddType;
        d = null;
        String formatBattleCoef22222 = formatBattleCoef(d, oddType2, z2);
        rightBet3 = ordered.getRightBet();
        if (rightBet3 != null) {
        }
        composer2 = startRestartGroup;
        BattleDuelColumn(rightUser22, str2, str3, betsGameType2, formatBattleCoef22222, d222, oddType, ordered.getRightHighlight(), betWonFromHighlight(ordered.getRightHighlight()), false, battleResultPalette3, rememberGlowPulse2, z1122, z10, z5, BattleResultAnimationsKt.battleRevealSlide(AlphaKt.alpha(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), ordered.getRightHighlight() == BattleBetHighlightStyle.WINNER_MUTED ? 0.6f : 1.0f), i2022, 5, z1122, false), onUserClick, composer2, i1622, i1922, 0);
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
        i11 = i2022;
        battleResultPalette4 = battleResultPalette3;
        z7 = z5;
        z8 = z1122;
        modifier3 = modifier42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x042c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BattleDuelColumn(final NewChallengeParticipantModel newChallengeParticipantModel, final String str, final String str2, final String str3, final String str4, final Double d, final OddType oddType, final BattleBetHighlightStyle battleBetHighlightStyle, final Boolean bool, final boolean z, final BattleResultPalette battleResultPalette, final float f, final boolean z2, boolean z3, boolean z4, Modifier modifier, final Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        boolean z5;
        boolean z6;
        int i10;
        String stringResource;
        String str5;
        String name;
        int i11;
        long m13241getCardBorderWin0d7_KjU;
        boolean z7;
        int i12;
        boolean z8;
        Object rememberedValue;
        int i13;
        MutableState mutableState;
        boolean z9;
        Object rememberedValue2;
        MutableState mutableState2;
        Boolean valueOf;
        boolean changed;
        BattleResultComponentsKt$BattleDuelColumn$1$1 rememberedValue3;
        int i14;
        MutableState mutableState3;
        int i15;
        String str6;
        Boolean bool2;
        int i16;
        ?? r3;
        int i17;
        Composer composer2;
        int i18;
        float f2;
        Object rememberedValue4;
        Alignment.Vertical vertical;
        Object rememberedValue5;
        Composer composer3;
        MutableState mutableState4;
        long j;
        boolean z10;
        String str7;
        int i19;
        float m7774constructorimpl;
        int i20;
        long m5167copywmQWz5c$default;
        int i21;
        float m7774constructorimpl2;
        Composer composer4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Object rememberedValue6;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        float m7774constructorimpl3;
        int i22;
        long j2;
        boolean z11;
        Object rememberedValue7;
        int i23;
        Integer level;
        String str8;
        Object rememberedValue8;
        final boolean z12;
        final boolean z13;
        final Modifier modifier3;
        long m5167copywmQWz5c$default2;
        long j3;
        long j4;
        ScopeUpdateScope endRestartGroup;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(-345927645);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(newChallengeParticipantModel) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(d) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(oddType.ordinal()) ? 1048576 : 524288;
                }
                if ((i3 & 128) == 0) {
                    i25 = (12582912 & i) == 0 ? startRestartGroup.changed(battleBetHighlightStyle.ordinal()) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((100663296 & i) == 0) {
                        i4 |= startRestartGroup.changed(bool) ? 67108864 : 33554432;
                        if ((i3 & 512) == 0) {
                            i24 = (805306368 & i) == 0 ? startRestartGroup.changed(z) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                            i5 = i4;
                            if ((i3 & 1024) == 0) {
                                i6 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i6 = i2 | (startRestartGroup.changed(battleResultPalette) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i6 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i6 |= startRestartGroup.changed(f) ? 32 : 16;
                            }
                            int i26 = i6;
                            if ((i3 & 4096) == 0) {
                                i26 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i26 |= startRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i7 = i3 & 8192;
                            if (i7 == 0) {
                                i26 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i26 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                i8 = i3 & 16384;
                                if (i8 != 0) {
                                    i26 |= 24576;
                                } else if ((i2 & 24576) == 0) {
                                    i26 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                                    i9 = i3 & 32768;
                                    if (i9 == 0) {
                                        i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        modifier2 = modifier;
                                    } else {
                                        modifier2 = modifier;
                                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i26 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                                        }
                                    }
                                    if ((i3 & 65536) == 0) {
                                        i26 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i26 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                    }
                                    if ((i5 & 306783379) == 306783378 || (599187 & i26) != 599186 || !startRestartGroup.getSkipping()) {
                                        z5 = i7 == 0 ? false : z3;
                                        z6 = i8 == 0 ? false : z4;
                                        if (i9 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-345927645, i5, i26, "org.betup.ui.dialogs.compose.BattleDuelColumn (BattleResultComponents.kt:1177)");
                                        }
                                        i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                        if (i10 != 1) {
                                            startRestartGroup.startReplaceGroup(-1723964663);
                                            stringResource = StringResources_androidKt.stringResource(R.string.battle_winner, startRestartGroup, 6);
                                            startRestartGroup.endReplaceGroup();
                                        } else if (i10 == 2) {
                                            startRestartGroup.startReplaceGroup(-1723962101);
                                            stringResource = StringResources_androidKt.stringResource(R.string.battle_defeated, startRestartGroup, 6);
                                            startRestartGroup.endReplaceGroup();
                                        } else if (i10 == 3) {
                                            startRestartGroup.startReplaceGroup(-1723959251);
                                            stringResource = StringResources_androidKt.stringResource(R.string.battle_lower_odds, startRestartGroup, 6);
                                            startRestartGroup.endReplaceGroup();
                                        } else {
                                            startRestartGroup.startReplaceGroup(-1903071878);
                                            startRestartGroup.endReplaceGroup();
                                            str5 = null;
                                            startRestartGroup.startReplaceGroup(-1723956236);
                                            if (z) {
                                                name = StringResources_androidKt.stringResource(R.string.player, startRestartGroup, 6);
                                            } else {
                                                name = newChallengeParticipantModel.getName();
                                                if (name == null) {
                                                    name = "";
                                                }
                                            }
                                            String str9 = name;
                                            startRestartGroup.endReplaceGroup();
                                            i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                            if (i11 == 1) {
                                                m13241getCardBorderWin0d7_KjU = battleResultPalette.m13241getCardBorderWin0d7_KjU();
                                            } else if (i11 == 2) {
                                                m13241getCardBorderWin0d7_KjU = battleResultPalette.m13240getCardBorderLose0d7_KjU();
                                            } else if (i11 == 3) {
                                                m13241getCardBorderWin0d7_KjU = Color.m5167copywmQWz5c$default(battleResultPalette.m13241getCardBorderWin0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                m13241getCardBorderWin0d7_KjU = Color.INSTANCE.m5203getTransparent0d7_KjU();
                                            }
                                            long j5 = m13241getCardBorderWin0d7_KjU;
                                            z7 = battleBetHighlightStyle == BattleBetHighlightStyle.WINNER;
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            int i27 = 458752 & i5;
                                            int i28 = i5 & 57344;
                                            int i29 = i26 & 7168;
                                            i12 = i26;
                                            z8 = (i28 == 16384) | (i27 == 131072) | (i29 == 2048);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                i13 = i5;
                                                MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                                                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                                rememberedValue = mutableStateOf$default;
                                            } else {
                                                i13 = i5;
                                            }
                                            mutableState = (MutableState) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            z9 = (i27 == 131072) | (i28 == 16384);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!z9 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                                                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                                                rememberedValue2 = mutableStateOf$default2;
                                            }
                                            mutableState2 = (MutableState) rememberedValue2;
                                            startRestartGroup.endReplaceGroup();
                                            valueOf = Boolean.valueOf(z5);
                                            startRestartGroup.startReplaceGroup(-1224400529);
                                            changed = (i27 == 131072) | (i29 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                i14 = i12;
                                                mutableState3 = mutableState2;
                                                i15 = i13;
                                                str6 = str5;
                                                bool2 = valueOf;
                                                i16 = 6;
                                                r3 = 0;
                                                i17 = 1;
                                                rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                                                composer2 = startRestartGroup;
                                                composer2.updateRememberedValue(rememberedValue3);
                                            } else {
                                                str6 = str5;
                                                i14 = i12;
                                                i15 = i13;
                                                i16 = 6;
                                                r3 = 0;
                                                i17 = 1;
                                                bool2 = valueOf;
                                                mutableState3 = mutableState2;
                                                composer2 = startRestartGroup;
                                            }
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                                            if (z5 || d == null || BattleDuelColumn$lambda$53(mutableState) || (r0 = OddHelper.format(oddType, BattleDuelColumn$lambda$56(mutableState3))) == null) {
                                                String str10 = str4;
                                            }
                                            composer2.startReplaceGroup(-1723906936);
                                            if (z7 || !z2) {
                                                i18 = 2;
                                                f2 = 0.0f;
                                            } else {
                                                i18 = 2;
                                                f2 = BattleDuelColumn$lambda$59(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("crownBob", composer2, i16, r3), 0.0f, -4.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(900, r3, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "crownBobValue", composer2, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0));
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(1849434622);
                                            rememberedValue4 = composer2.rememberedValue();
                                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                vertical = null;
                                                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((boolean) r3), null, i18, null);
                                                composer2.updateRememberedValue(rememberedValue4);
                                            } else {
                                                vertical = null;
                                            }
                                            MutableState mutableState5 = (MutableState) rememberedValue4;
                                            composer2.endReplaceGroup();
                                            Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState5) ? 50.0f : 0.0f);
                                            composer2.startReplaceGroup(1849434622);
                                            rememberedValue5 = composer2.rememberedValue();
                                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda13
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit BattleDuelColumn$lambda$64$lambda$63;
                                                        BattleDuelColumn$lambda$64$lambda$63 = BattleResultComponentsKt.BattleDuelColumn$lambda$64$lambda$63((GraphicsLayerScope) obj);
                                                        return BattleDuelColumn$lambda$64$lambda$63;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue5);
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(zIndex, (Function1) rememberedValue5);
                                            if (z2) {
                                                composer3 = composer2;
                                                mutableState4 = mutableState5;
                                                j = j5;
                                                if (!Color.m5169equalsimpl0(j, Color.INSTANCE.m5203getTransparent0d7_KjU())) {
                                                    z10 = i17;
                                                    str7 = str6;
                                                    i19 = i17;
                                                    Modifier modifier4 = modifier2;
                                                    Modifier m13203battleColumnGlowM0xzIa8$default = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer, j, f, z10, 0.0f, 8, null);
                                                    if (!z7 || battleBetHighlightStyle == BattleBetHighlightStyle.LOSER) {
                                                        m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                                                    } else {
                                                        m7774constructorimpl = Dp.m7774constructorimpl(i19);
                                                    }
                                                    float f3 = 10;
                                                    Modifier m1036borderxT4_qwU = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                                    i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                                    if (i20 != i19) {
                                                        m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    } else if (i20 == i18) {
                                                        m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    } else if (i20 == 3) {
                                                        m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    } else {
                                                        m5167copywmQWz5c$default = Color.INSTANCE.m5203getTransparent0d7_KjU();
                                                    }
                                                    Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                                    if (z6) {
                                                        i21 = 3;
                                                        m7774constructorimpl2 = Dp.m7774constructorimpl(4);
                                                    } else {
                                                        i21 = 3;
                                                        m7774constructorimpl2 = Dp.m7774constructorimpl(3);
                                                    }
                                                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                    composer4 = composer3;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN4);
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (!composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    float m7774constructorimpl4 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                                                    float m7774constructorimpl5 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    composer4.startReplaceGroup(1849434622);
                                                    rememberedValue6 = composer4.rememberedValue();
                                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue6 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda14
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                Unit BattleDuelColumn$lambda$78$lambda$66$lambda$65;
                                                                BattleDuelColumn$lambda$78$lambda$66$lambda$65 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$66$lambda$65((GraphicsLayerScope) obj);
                                                                return BattleDuelColumn$lambda$78$lambda$66$lambda$65;
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(rememberedValue6);
                                                    }
                                                    composer4.endReplaceGroup();
                                                    Modifier zIndex2 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue6), 8.0f);
                                                    Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, zIndex2);
                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (!composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                                                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    String photoUrl = newChallengeParticipantModel.getPhotoUrl();
                                                    Modifier clip = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl4, 0.0f, 0.0f, 13, null), m7774constructorimpl5), RoundedCornerShapeKt.getCircleShape());
                                                    if (!z7) {
                                                        m7774constructorimpl3 = Dp.m7774constructorimpl(2);
                                                    } else {
                                                        m7774constructorimpl3 = Dp.m7774constructorimpl((float) 1.5d);
                                                    }
                                                    i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                                    if (i22 != 1) {
                                                        j2 = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                                                    } else if (i22 == 2) {
                                                        j2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    } else {
                                                        j2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    }
                                                    Modifier m1036borderxT4_qwU2 = BorderKt.m1036borderxT4_qwU(clip, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                                                    composer4.startReplaceGroup(-1633490746);
                                                    z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                                                    rememberedValue7 = composer4.rememberedValue();
                                                    if (!z11 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        i23 = 6;
                                                        rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                                                BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                                                                return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(rememberedValue7);
                                                    } else {
                                                        i23 = 6;
                                                    }
                                                    composer4.endReplaceGroup();
                                                    int i30 = i23;
                                                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU2, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                                                    composer4.startReplaceGroup(1051319994);
                                                    if (z7) {
                                                        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.image_98, composer4, i30);
                                                        Modifier zIndex3 = ZIndexModifierKt.zIndex(OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 44 : 52)), Dp.m7774constructorimpl(z6 ? 28 : 34)), Alignment.INSTANCE.getTopCenter()), Dp.m7774constructorimpl(z6 ? -10 : -12), Dp.m7774constructorimpl(f2 + 2.0f)), 12.0f);
                                                        composer4.startReplaceGroup(1849434622);
                                                        Object rememberedValue9 = composer4.rememberedValue();
                                                        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue9 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda16
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    Unit BattleDuelColumn$lambda$78$lambda$71$lambda$70$lambda$69;
                                                                    BattleDuelColumn$lambda$78$lambda$71$lambda$70$lambda$69 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$70$lambda$69((GraphicsLayerScope) obj);
                                                                    return BattleDuelColumn$lambda$78$lambda$71$lambda$70$lambda$69;
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(rememberedValue9);
                                                        }
                                                        composer4.endReplaceGroup();
                                                        ImageKt.Image(painterResource, (String) null, AlphaKt.alpha(ShadowKt.m4803shadows4CzXII$default(GraphicsLayerModifierKt.graphicsLayer(zIndex3, (Function1) rememberedValue9), Dp.m7774constructorimpl(i30), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 28, null), 0.98f), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer4, 24624, 104);
                                                    }
                                                    composer4.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    composer4.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                                                    TextKt.m2642Text4IGK_g(str9, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i30), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                                                    level = newChallengeParticipantModel.getLevel();
                                                    composer4.startReplaceGroup(1882151488);
                                                    if (level != null) {
                                                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_level_format, new Object[]{Integer.valueOf(level.intValue())}, composer4, i30), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(z6 ? 8 : 9), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i30), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                        Unit unit = Unit.INSTANCE;
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceGroup();
                                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                                                    composer4.startReplaceGroup(1882169849);
                                                    str8 = str2;
                                                    if (StringsKt.isBlank(str8)) {
                                                        str8 = StringResources_androidKt.stringResource(R.string.not_set, composer4, i30);
                                                    }
                                                    String str11 = str8;
                                                    composer4.endReplaceGroup();
                                                    composer4.startReplaceGroup(5004770);
                                                    rememberedValue8 = composer4.rememberedValue();
                                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                        final MutableState mutableState6 = mutableState4;
                                                        rememberedValue8 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda17
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                Unit BattleDuelColumn$lambda$78$lambda$75$lambda$74;
                                                                BattleDuelColumn$lambda$78$lambda$75$lambda$74 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$75$lambda$74(MutableState.this, ((Boolean) obj).booleanValue());
                                                                return BattleDuelColumn$lambda$78$lambda$75$lambda$74;
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(rememberedValue8);
                                                    }
                                                    Function1 function12 = (Function1) rememberedValue8;
                                                    composer4.endReplaceGroup();
                                                    int i31 = i15 >> 3;
                                                    int i32 = i15 >> 9;
                                                    BattlePickChip(str, str11, str3, str10, battleBetHighlightStyle, bool, null, z6, function12, composer4, (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 14) | 100663296 | (i32 & 57344) | (i32 & 458752) | ((i14 << 9) & 29360128), 64);
                                                    composer4.startReplaceGroup(1882182468);
                                                    if (str7 != null) {
                                                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 3 : 5)), composer4, 0);
                                                        float f4 = 100;
                                                        Modifier clip2 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
                                                        int i33 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                                        if (i33 == 1) {
                                                            m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        } else if (i33 == 2) {
                                                            m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        } else if (i33 == 3) {
                                                            m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        } else {
                                                            m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        }
                                                        Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(clip2, m5167copywmQWz5c$default2, null, 2, null);
                                                        float m7774constructorimpl6 = Dp.m7774constructorimpl(1);
                                                        int i34 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                                        if (i34 == 1) {
                                                            j3 = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                                                        } else if (i34 == 2) {
                                                            j3 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        } else if (i34 == 3) {
                                                            j3 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        } else {
                                                            j3 = Color.INSTANCE.m5203getTransparent0d7_KjU();
                                                        }
                                                        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1036borderxT4_qwU(m1025backgroundbw27NRU$default, m7774constructorimpl6, j3, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4))), z6 ? Dp.m7774constructorimpl(8) : Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(z6 ? 3 : 4));
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN42);
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor3);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer4);
                                                        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        String upperCase = str7.toUpperCase(Locale.ROOT);
                                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                                        long sp = TextUnitKt.getSp(z6 ? 9 : 10);
                                                        FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(composer4, i30);
                                                        FontWeight black = FontWeight.INSTANCE.getBlack();
                                                        int i35 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                                        if (i35 == 1) {
                                                            j4 = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                                                        } else if (i35 == 2) {
                                                            j4 = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
                                                        } else if (i35 == 3) {
                                                            j4 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        } else {
                                                            j4 = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                                                        }
                                                        TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, sp, black, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, TextUnitKt.getSp(0.7d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        composer4.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Unit unit3 = Unit.INSTANCE;
                                                        Unit unit4 = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    composer4.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    z12 = z5;
                                                    z13 = z6;
                                                    modifier3 = modifier4;
                                                }
                                            } else {
                                                composer3 = composer2;
                                                mutableState4 = mutableState5;
                                                j = j5;
                                            }
                                            z10 = 0;
                                            str7 = str6;
                                            i19 = i17;
                                            Modifier modifier42 = modifier2;
                                            Modifier m13203battleColumnGlowM0xzIa8$default2 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer, j, f, z10, 0.0f, 8, null);
                                            if (!z7) {
                                            }
                                            m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                                            float f32 = 10;
                                            Modifier m1036borderxT4_qwU3 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default2, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32)));
                                            i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                            if (i20 != i19) {
                                            }
                                            Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU3, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32)));
                                            if (z6) {
                                            }
                                            Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU2, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                            composer4 = composer3;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer4, 48);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN43);
                                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                            }
                                            composer4.startReusableNode();
                                            if (!composer4.getInserting()) {
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting()) {
                                            }
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            float m7774constructorimpl42 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                                            float m7774constructorimpl52 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            composer4.startReplaceGroup(1849434622);
                                            rememberedValue6 = composer4.rememberedValue();
                                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier zIndex22 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue6), 8.0f);
                                            Alignment topCenter2 = Alignment.INSTANCE.getTopCenter();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2, false);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer4, zIndex22);
                                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                            }
                                            composer4.startReusableNode();
                                            if (!composer4.getInserting()) {
                                            }
                                            m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl2.getInserting()) {
                                            }
                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                            String photoUrl2 = newChallengeParticipantModel.getPhotoUrl();
                                            Modifier clip3 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl42, 0.0f, 0.0f, 13, null), m7774constructorimpl52), RoundedCornerShapeKt.getCircleShape());
                                            if (!z7) {
                                            }
                                            i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                            if (i22 != 1) {
                                            }
                                            Modifier m1036borderxT4_qwU22 = BorderKt.m1036borderxT4_qwU(clip3, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                                            composer4.startReplaceGroup(-1633490746);
                                            z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                                            rememberedValue7 = composer4.rememberedValue();
                                            if (z11) {
                                            }
                                            i23 = 6;
                                            rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                                    BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                                                    return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue7);
                                            composer4.endReplaceGroup();
                                            int i302 = i23;
                                            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl2, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU22, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                                            composer4.startReplaceGroup(1051319994);
                                            if (z7) {
                                            }
                                            composer4.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                                            TextKt.m2642Text4IGK_g(str9, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i302), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                                            level = newChallengeParticipantModel.getLevel();
                                            composer4.startReplaceGroup(1882151488);
                                            if (level != null) {
                                            }
                                            composer4.endReplaceGroup();
                                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                                            composer4.startReplaceGroup(1882169849);
                                            str8 = str2;
                                            if (StringsKt.isBlank(str8)) {
                                            }
                                            String str112 = str8;
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(5004770);
                                            rememberedValue8 = composer4.rememberedValue();
                                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            Function1 function122 = (Function1) rememberedValue8;
                                            composer4.endReplaceGroup();
                                            int i312 = i15 >> 3;
                                            int i322 = i15 >> 9;
                                            BattlePickChip(str, str112, str3, str10, battleBetHighlightStyle, bool, null, z6, function122, composer4, (i312 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i312 & 14) | 100663296 | (i322 & 57344) | (i322 & 458752) | ((i14 << 9) & 29360128), 64);
                                            composer4.startReplaceGroup(1882182468);
                                            if (str7 != null) {
                                            }
                                            composer4.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z12 = z5;
                                            z13 = z6;
                                            modifier3 = modifier42;
                                        }
                                        str5 = stringResource;
                                        startRestartGroup.startReplaceGroup(-1723956236);
                                        if (z) {
                                        }
                                        String str92 = name;
                                        startRestartGroup.endReplaceGroup();
                                        i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                        if (i11 == 1) {
                                        }
                                        long j52 = m13241getCardBorderWin0d7_KjU;
                                        if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
                                        }
                                        startRestartGroup.startReplaceGroup(-1746271574);
                                        int i272 = 458752 & i5;
                                        int i282 = i5 & 57344;
                                        int i292 = i26 & 7168;
                                        i12 = i26;
                                        z8 = (i282 == 16384) | (i272 == 131072) | (i292 == 2048);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (z8) {
                                        }
                                        i13 = i5;
                                        MutableState mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                                        startRestartGroup.updateRememberedValue(mutableStateOf$default3);
                                        rememberedValue = mutableStateOf$default3;
                                        mutableState = (MutableState) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(-1633490746);
                                        z9 = (i272 == 131072) | (i282 == 16384);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!z9) {
                                        }
                                        MutableState mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                                        startRestartGroup.updateRememberedValue(mutableStateOf$default22);
                                        rememberedValue2 = mutableStateOf$default22;
                                        mutableState2 = (MutableState) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        valueOf = Boolean.valueOf(z5);
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        changed = (i272 == 131072) | (i292 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (changed) {
                                        }
                                        i14 = i12;
                                        mutableState3 = mutableState2;
                                        i15 = i13;
                                        str6 = str5;
                                        bool2 = valueOf;
                                        i16 = 6;
                                        r3 = 0;
                                        i17 = 1;
                                        rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                                        composer2 = startRestartGroup;
                                        composer2.updateRememberedValue(rememberedValue3);
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                                        if (z5) {
                                        }
                                        String str102 = str4;
                                        composer2.startReplaceGroup(-1723906936);
                                        if (z7) {
                                        }
                                        i18 = 2;
                                        f2 = 0.0f;
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(1849434622);
                                        rememberedValue4 = composer2.rememberedValue();
                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableState mutableState52 = (MutableState) rememberedValue4;
                                        composer2.endReplaceGroup();
                                        Modifier zIndex4 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState52) ? 50.0f : 0.0f);
                                        composer2.startReplaceGroup(1849434622);
                                        rememberedValue5 = composer2.rememberedValue();
                                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        composer2.endReplaceGroup();
                                        Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(zIndex4, (Function1) rememberedValue5);
                                        if (z2) {
                                        }
                                        z10 = 0;
                                        str7 = str6;
                                        i19 = i17;
                                        Modifier modifier422 = modifier2;
                                        Modifier m13203battleColumnGlowM0xzIa8$default22 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer2, j, f, z10, 0.0f, 8, null);
                                        if (!z7) {
                                        }
                                        m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                                        float f322 = 10;
                                        Modifier m1036borderxT4_qwU32 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default22, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322)));
                                        i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                        if (i20 != i19) {
                                        }
                                        Modifier m1024backgroundbw27NRU22 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU32, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322)));
                                        if (z6) {
                                        }
                                        Modifier m1517paddingVpY3zN432 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU22, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                                        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                                        composer4 = composer3;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, composer4, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN432);
                                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                        }
                                        composer4.startReusableNode();
                                        if (!composer4.getInserting()) {
                                        }
                                        m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl.getInserting()) {
                                        }
                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                                        float m7774constructorimpl422 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                                        float m7774constructorimpl522 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                                        Modifier.Companion companion22 = Modifier.INSTANCE;
                                        composer4.startReplaceGroup(1849434622);
                                        rememberedValue6 = composer4.rememberedValue();
                                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier zIndex222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion22, (Function1) rememberedValue6), 8.0f);
                                        Alignment topCenter22 = Alignment.INSTANCE.getTopCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter22, false);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap222 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer4, zIndex222);
                                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                        }
                                        composer4.startReusableNode();
                                        if (!composer4.getInserting()) {
                                        }
                                        m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl2.getInserting()) {
                                        }
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                                        String photoUrl22 = newChallengeParticipantModel.getPhotoUrl();
                                        Modifier clip32 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl422, 0.0f, 0.0f, 13, null), m7774constructorimpl522), RoundedCornerShapeKt.getCircleShape());
                                        if (!z7) {
                                        }
                                        i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                        if (i22 != 1) {
                                        }
                                        Modifier m1036borderxT4_qwU222 = BorderKt.m1036borderxT4_qwU(clip32, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                                        composer4.startReplaceGroup(-1633490746);
                                        z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                                        rememberedValue7 = composer4.rememberedValue();
                                        if (z11) {
                                        }
                                        i23 = 6;
                                        rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                                BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                                                return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                            }
                                        };
                                        composer4.updateRememberedValue(rememberedValue7);
                                        composer4.endReplaceGroup();
                                        int i3022 = i23;
                                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl22, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                                        composer4.startReplaceGroup(1051319994);
                                        if (z7) {
                                        }
                                        composer4.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                                        TextKt.m2642Text4IGK_g(str92, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i3022), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                                        level = newChallengeParticipantModel.getLevel();
                                        composer4.startReplaceGroup(1882151488);
                                        if (level != null) {
                                        }
                                        composer4.endReplaceGroup();
                                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                                        composer4.startReplaceGroup(1882169849);
                                        str8 = str2;
                                        if (StringsKt.isBlank(str8)) {
                                        }
                                        String str1122 = str8;
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(5004770);
                                        rememberedValue8 = composer4.rememberedValue();
                                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        Function1 function1222 = (Function1) rememberedValue8;
                                        composer4.endReplaceGroup();
                                        int i3122 = i15 >> 3;
                                        int i3222 = i15 >> 9;
                                        BattlePickChip(str, str1122, str3, str102, battleBetHighlightStyle, bool, null, z6, function1222, composer4, (i3122 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3122 & 14) | 100663296 | (i3222 & 57344) | (i3222 & 458752) | ((i14 << 9) & 29360128), 64);
                                        composer4.startReplaceGroup(1882182468);
                                        if (str7 != null) {
                                        }
                                        composer4.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        z12 = z5;
                                        z13 = z6;
                                        modifier3 = modifier422;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        composer4 = startRestartGroup;
                                        modifier3 = modifier2;
                                        z12 = z3;
                                        z13 = z4;
                                    }
                                    endRestartGroup = composer4.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda18
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit BattleDuelColumn$lambda$79;
                                                BattleDuelColumn$lambda$79 = BattleResultComponentsKt.BattleDuelColumn$lambda$79(NewChallengeParticipantModel.this, str, str2, str3, str4, d, oddType, battleBetHighlightStyle, bool, z, battleResultPalette, f, z2, z12, z13, modifier3, function1, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                return BattleDuelColumn$lambda$79;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i9 = i3 & 32768;
                                if (i9 == 0) {
                                }
                                if ((i3 & 65536) == 0) {
                                }
                                if ((i5 & 306783379) == 306783378) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                if (i10 != 1) {
                                }
                                str5 = stringResource;
                                startRestartGroup.startReplaceGroup(-1723956236);
                                if (z) {
                                }
                                String str922 = name;
                                startRestartGroup.endReplaceGroup();
                                i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                if (i11 == 1) {
                                }
                                long j522 = m13241getCardBorderWin0d7_KjU;
                                if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
                                }
                                startRestartGroup.startReplaceGroup(-1746271574);
                                int i2722 = 458752 & i5;
                                int i2822 = i5 & 57344;
                                int i2922 = i26 & 7168;
                                i12 = i26;
                                z8 = (i2822 == 16384) | (i2722 == 131072) | (i2922 == 2048);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (z8) {
                                }
                                i13 = i5;
                                MutableState mutableStateOf$default32 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default32);
                                rememberedValue = mutableStateOf$default32;
                                mutableState = (MutableState) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1633490746);
                                z9 = (i2722 == 131072) | (i2822 == 16384);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z9) {
                                }
                                MutableState mutableStateOf$default222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default222);
                                rememberedValue2 = mutableStateOf$default222;
                                mutableState2 = (MutableState) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                valueOf = Boolean.valueOf(z5);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changed = (i2722 == 131072) | (i2922 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                i14 = i12;
                                mutableState3 = mutableState2;
                                i15 = i13;
                                str6 = str5;
                                bool2 = valueOf;
                                i16 = 6;
                                r3 = 0;
                                i17 = 1;
                                rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                                composer2 = startRestartGroup;
                                composer2.updateRememberedValue(rememberedValue3);
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                                if (z5) {
                                }
                                String str1022 = str4;
                                composer2.startReplaceGroup(-1723906936);
                                if (z7) {
                                }
                                i18 = 2;
                                f2 = 0.0f;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                rememberedValue4 = composer2.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState522 = (MutableState) rememberedValue4;
                                composer2.endReplaceGroup();
                                Modifier zIndex42 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState522) ? 50.0f : 0.0f);
                                composer2.startReplaceGroup(1849434622);
                                rememberedValue5 = composer2.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                Modifier graphicsLayer22 = GraphicsLayerModifierKt.graphicsLayer(zIndex42, (Function1) rememberedValue5);
                                if (z2) {
                                }
                                z10 = 0;
                                str7 = str6;
                                i19 = i17;
                                Modifier modifier4222 = modifier2;
                                Modifier m13203battleColumnGlowM0xzIa8$default222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer22, j, f, z10, 0.0f, 8, null);
                                if (!z7) {
                                }
                                m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                                float f3222 = 10;
                                Modifier m1036borderxT4_qwU322 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222)));
                                i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                if (i20 != i19) {
                                }
                                Modifier m1024backgroundbw27NRU222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU322, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222)));
                                if (z6) {
                                }
                                Modifier m1517paddingVpY3zN4322 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                                composer4 = composer3;
                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, composer4, 48);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap422 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN4322);
                                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                }
                                composer4.startReusableNode();
                                if (!composer4.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                                float m7774constructorimpl4222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                                float m7774constructorimpl5222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                                Modifier.Companion companion222 = Modifier.INSTANCE;
                                composer4.startReplaceGroup(1849434622);
                                rememberedValue6 = composer4.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer4.endReplaceGroup();
                                Modifier zIndex2222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion222, (Function1) rememberedValue6), 8.0f);
                                Alignment topCenter222 = Alignment.INSTANCE.getTopCenter();
                                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter222, false);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2222 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer4, zIndex2222);
                                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                }
                                composer4.startReusableNode();
                                if (!composer4.getInserting()) {
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting()) {
                                }
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                                String photoUrl222 = newChallengeParticipantModel.getPhotoUrl();
                                Modifier clip322 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl4222, 0.0f, 0.0f, 13, null), m7774constructorimpl5222), RoundedCornerShapeKt.getCircleShape());
                                if (!z7) {
                                }
                                i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                                if (i22 != 1) {
                                }
                                Modifier m1036borderxT4_qwU2222 = BorderKt.m1036borderxT4_qwU(clip322, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                                composer4.startReplaceGroup(-1633490746);
                                z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                                rememberedValue7 = composer4.rememberedValue();
                                if (z11) {
                                }
                                i23 = 6;
                                rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                        BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                                        return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue7);
                                composer4.endReplaceGroup();
                                int i30222 = i23;
                                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU2222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                                composer4.startReplaceGroup(1051319994);
                                if (z7) {
                                }
                                composer4.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                                TextKt.m2642Text4IGK_g(str922, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i30222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                                level = newChallengeParticipantModel.getLevel();
                                composer4.startReplaceGroup(1882151488);
                                if (level != null) {
                                }
                                composer4.endReplaceGroup();
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                                composer4.startReplaceGroup(1882169849);
                                str8 = str2;
                                if (StringsKt.isBlank(str8)) {
                                }
                                String str11222 = str8;
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(5004770);
                                rememberedValue8 = composer4.rememberedValue();
                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                }
                                Function1 function12222 = (Function1) rememberedValue8;
                                composer4.endReplaceGroup();
                                int i31222 = i15 >> 3;
                                int i32222 = i15 >> 9;
                                BattlePickChip(str, str11222, str3, str1022, battleBetHighlightStyle, bool, null, z6, function12222, composer4, (i31222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31222 & 14) | 100663296 | (i32222 & 57344) | (i32222 & 458752) | ((i14 << 9) & 29360128), 64);
                                composer4.startReplaceGroup(1882182468);
                                if (str7 != null) {
                                }
                                composer4.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z12 = z5;
                                z13 = z6;
                                modifier3 = modifier4222;
                                endRestartGroup = composer4.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i8 = i3 & 16384;
                            if (i8 != 0) {
                            }
                            i9 = i3 & 32768;
                            if (i9 == 0) {
                            }
                            if ((i3 & 65536) == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                            if (i10 != 1) {
                            }
                            str5 = stringResource;
                            startRestartGroup.startReplaceGroup(-1723956236);
                            if (z) {
                            }
                            String str9222 = name;
                            startRestartGroup.endReplaceGroup();
                            i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                            if (i11 == 1) {
                            }
                            long j5222 = m13241getCardBorderWin0d7_KjU;
                            if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
                            }
                            startRestartGroup.startReplaceGroup(-1746271574);
                            int i27222 = 458752 & i5;
                            int i28222 = i5 & 57344;
                            int i29222 = i26 & 7168;
                            i12 = i26;
                            z8 = (i28222 == 16384) | (i27222 == 131072) | (i29222 == 2048);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (z8) {
                            }
                            i13 = i5;
                            MutableState mutableStateOf$default322 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default322);
                            rememberedValue = mutableStateOf$default322;
                            mutableState = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            z9 = (i27222 == 131072) | (i28222 == 16384);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z9) {
                            }
                            MutableState mutableStateOf$default2222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default2222);
                            rememberedValue2 = mutableStateOf$default2222;
                            mutableState2 = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            valueOf = Boolean.valueOf(z5);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changed = (i27222 == 131072) | (i29222 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            i14 = i12;
                            mutableState3 = mutableState2;
                            i15 = i13;
                            str6 = str5;
                            bool2 = valueOf;
                            i16 = 6;
                            r3 = 0;
                            i17 = 1;
                            rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                            composer2 = startRestartGroup;
                            composer2.updateRememberedValue(rememberedValue3);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                            if (z5) {
                            }
                            String str10222 = str4;
                            composer2.startReplaceGroup(-1723906936);
                            if (z7) {
                            }
                            i18 = 2;
                            f2 = 0.0f;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1849434622);
                            rememberedValue4 = composer2.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState5222 = (MutableState) rememberedValue4;
                            composer2.endReplaceGroup();
                            Modifier zIndex422 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState5222) ? 50.0f : 0.0f);
                            composer2.startReplaceGroup(1849434622);
                            rememberedValue5 = composer2.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            }
                            composer2.endReplaceGroup();
                            Modifier graphicsLayer222 = GraphicsLayerModifierKt.graphicsLayer(zIndex422, (Function1) rememberedValue5);
                            if (z2) {
                            }
                            z10 = 0;
                            str7 = str6;
                            i19 = i17;
                            Modifier modifier42222 = modifier2;
                            Modifier m13203battleColumnGlowM0xzIa8$default2222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer222, j, f, z10, 0.0f, 8, null);
                            if (!z7) {
                            }
                            m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                            float f32222 = 10;
                            Modifier m1036borderxT4_qwU3222 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default2222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222)));
                            i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                            if (i20 != i19) {
                            }
                            Modifier m1024backgroundbw27NRU2222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU3222, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222)));
                            if (z6) {
                            }
                            Modifier m1517paddingVpY3zN43222 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU2222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                            Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
                            composer4 = composer3;
                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, composer4, 48);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap4222 = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN43222);
                            Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer4.getApplier() instanceof Applier)) {
                            }
                            composer4.startReusableNode();
                            if (!composer4.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                            float m7774constructorimpl42222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                            float m7774constructorimpl52222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                            Modifier.Companion companion2222 = Modifier.INSTANCE;
                            composer4.startReplaceGroup(1849434622);
                            rememberedValue6 = composer4.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            }
                            composer4.endReplaceGroup();
                            Modifier zIndex22222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion2222, (Function1) rememberedValue6), 8.0f);
                            Alignment topCenter2222 = Alignment.INSTANCE.getTopCenter();
                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2222, false);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap22222 = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer4, zIndex22222);
                            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer4.getApplier() instanceof Applier)) {
                            }
                            composer4.startReusableNode();
                            if (!composer4.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                            String photoUrl2222 = newChallengeParticipantModel.getPhotoUrl();
                            Modifier clip3222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl42222, 0.0f, 0.0f, 13, null), m7774constructorimpl52222), RoundedCornerShapeKt.getCircleShape());
                            if (!z7) {
                            }
                            i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                            if (i22 != 1) {
                            }
                            Modifier m1036borderxT4_qwU22222 = BorderKt.m1036borderxT4_qwU(clip3222, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                            composer4.startReplaceGroup(-1633490746);
                            z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                            rememberedValue7 = composer4.rememberedValue();
                            if (z11) {
                            }
                            i23 = 6;
                            rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                    BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                                    return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                }
                            };
                            composer4.updateRememberedValue(rememberedValue7);
                            composer4.endReplaceGroup();
                            int i302222 = i23;
                            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl2222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU22222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                            composer4.startReplaceGroup(1051319994);
                            if (z7) {
                            }
                            composer4.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                            TextKt.m2642Text4IGK_g(str9222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i302222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                            level = newChallengeParticipantModel.getLevel();
                            composer4.startReplaceGroup(1882151488);
                            if (level != null) {
                            }
                            composer4.endReplaceGroup();
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                            composer4.startReplaceGroup(1882169849);
                            str8 = str2;
                            if (StringsKt.isBlank(str8)) {
                            }
                            String str112222 = str8;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(5004770);
                            rememberedValue8 = composer4.rememberedValue();
                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            }
                            Function1 function122222 = (Function1) rememberedValue8;
                            composer4.endReplaceGroup();
                            int i312222 = i15 >> 3;
                            int i322222 = i15 >> 9;
                            BattlePickChip(str, str112222, str3, str10222, battleBetHighlightStyle, bool, null, z6, function122222, composer4, (i312222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i312222 & 14) | 100663296 | (i322222 & 57344) | (i322222 & 458752) | ((i14 << 9) & 29360128), 64);
                            composer4.startReplaceGroup(1882182468);
                            if (str7 != null) {
                            }
                            composer4.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z12 = z5;
                            z13 = z6;
                            modifier3 = modifier42222;
                            endRestartGroup = composer4.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i4 |= i24;
                        i5 = i4;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i262 = i6;
                        if ((i3 & 4096) == 0) {
                        }
                        i7 = i3 & 8192;
                        if (i7 == 0) {
                        }
                        i8 = i3 & 16384;
                        if (i8 != 0) {
                        }
                        i9 = i3 & 32768;
                        if (i9 == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                        if (i10 != 1) {
                        }
                        str5 = stringResource;
                        startRestartGroup.startReplaceGroup(-1723956236);
                        if (z) {
                        }
                        String str92222 = name;
                        startRestartGroup.endReplaceGroup();
                        i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                        if (i11 == 1) {
                        }
                        long j52222 = m13241getCardBorderWin0d7_KjU;
                        if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
                        }
                        startRestartGroup.startReplaceGroup(-1746271574);
                        int i272222 = 458752 & i5;
                        int i282222 = i5 & 57344;
                        int i292222 = i262 & 7168;
                        i12 = i262;
                        z8 = (i282222 == 16384) | (i272222 == 131072) | (i292222 == 2048);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (z8) {
                        }
                        i13 = i5;
                        MutableState mutableStateOf$default3222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                        startRestartGroup.updateRememberedValue(mutableStateOf$default3222);
                        rememberedValue = mutableStateOf$default3222;
                        mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        z9 = (i272222 == 131072) | (i282222 == 16384);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z9) {
                        }
                        MutableState mutableStateOf$default22222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                        startRestartGroup.updateRememberedValue(mutableStateOf$default22222);
                        rememberedValue2 = mutableStateOf$default22222;
                        mutableState2 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        valueOf = Boolean.valueOf(z5);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed = (i272222 == 131072) | (i292222 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        i14 = i12;
                        mutableState3 = mutableState2;
                        i15 = i13;
                        str6 = str5;
                        bool2 = valueOf;
                        i16 = 6;
                        r3 = 0;
                        i17 = 1;
                        rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                        composer2 = startRestartGroup;
                        composer2.updateRememberedValue(rememberedValue3);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                        if (z5) {
                        }
                        String str102222 = str4;
                        composer2.startReplaceGroup(-1723906936);
                        if (z7) {
                        }
                        i18 = 2;
                        f2 = 0.0f;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue4 = composer2.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState52222 = (MutableState) rememberedValue4;
                        composer2.endReplaceGroup();
                        Modifier zIndex4222 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState52222) ? 50.0f : 0.0f);
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue5 = composer2.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer2.endReplaceGroup();
                        Modifier graphicsLayer2222 = GraphicsLayerModifierKt.graphicsLayer(zIndex4222, (Function1) rememberedValue5);
                        if (z2) {
                        }
                        z10 = 0;
                        str7 = str6;
                        i19 = i17;
                        Modifier modifier422222 = modifier2;
                        Modifier m13203battleColumnGlowM0xzIa8$default22222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer2222, j, f, z10, 0.0f, 8, null);
                        if (!z7) {
                        }
                        m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                        float f322222 = 10;
                        Modifier m1036borderxT4_qwU32222 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default22222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322222)));
                        i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                        if (i20 != i19) {
                        }
                        Modifier m1024backgroundbw27NRU22222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU32222, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322222)));
                        if (z6) {
                        }
                        Modifier m1517paddingVpY3zN432222 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU22222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                        Alignment.Horizontal centerHorizontally22222 = Alignment.INSTANCE.getCenterHorizontally();
                        composer4 = composer3;
                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222, composer4, 48);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap42222 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN432222);
                        Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                        }
                        composer4.startReusableNode();
                        if (!composer4.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                        float m7774constructorimpl422222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                        float m7774constructorimpl522222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                        Modifier.Companion companion22222 = Modifier.INSTANCE;
                        composer4.startReplaceGroup(1849434622);
                        rememberedValue6 = composer4.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer4.endReplaceGroup();
                        Modifier zIndex222222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion22222, (Function1) rememberedValue6), 8.0f);
                        Alignment topCenter22222 = Alignment.INSTANCE.getTopCenter();
                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter22222, false);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap222222 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(composer4, zIndex222222);
                        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                        }
                        composer4.startReusableNode();
                        if (!composer4.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
                        String photoUrl22222 = newChallengeParticipantModel.getPhotoUrl();
                        Modifier clip32222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl422222, 0.0f, 0.0f, 13, null), m7774constructorimpl522222), RoundedCornerShapeKt.getCircleShape());
                        if (!z7) {
                        }
                        i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                        if (i22 != 1) {
                        }
                        Modifier m1036borderxT4_qwU222222 = BorderKt.m1036borderxT4_qwU(clip32222, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                        composer4.startReplaceGroup(-1633490746);
                        z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                        rememberedValue7 = composer4.rememberedValue();
                        if (z11) {
                        }
                        i23 = 6;
                        rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                                BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                                return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue7);
                        composer4.endReplaceGroup();
                        int i3022222 = i23;
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl22222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU222222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                        composer4.startReplaceGroup(1051319994);
                        if (z7) {
                        }
                        composer4.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                        TextKt.m2642Text4IGK_g(str92222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i3022222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                        level = newChallengeParticipantModel.getLevel();
                        composer4.startReplaceGroup(1882151488);
                        if (level != null) {
                        }
                        composer4.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                        composer4.startReplaceGroup(1882169849);
                        str8 = str2;
                        if (StringsKt.isBlank(str8)) {
                        }
                        String str1122222 = str8;
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(5004770);
                        rememberedValue8 = composer4.rememberedValue();
                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        }
                        Function1 function1222222 = (Function1) rememberedValue8;
                        composer4.endReplaceGroup();
                        int i3122222 = i15 >> 3;
                        int i3222222 = i15 >> 9;
                        BattlePickChip(str, str1122222, str3, str102222, battleBetHighlightStyle, bool, null, z6, function1222222, composer4, (i3122222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3122222 & 14) | 100663296 | (i3222222 & 57344) | (i3222222 & 458752) | ((i14 << 9) & 29360128), 64);
                        composer4.startReplaceGroup(1882182468);
                        if (str7 != null) {
                        }
                        composer4.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z12 = z5;
                        z13 = z6;
                        modifier3 = modifier422222;
                        endRestartGroup = composer4.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i24;
                    i5 = i4;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i2622 = i6;
                    if ((i3 & 4096) == 0) {
                    }
                    i7 = i3 & 8192;
                    if (i7 == 0) {
                    }
                    i8 = i3 & 16384;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 32768;
                    if (i9 == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                    if (i10 != 1) {
                    }
                    str5 = stringResource;
                    startRestartGroup.startReplaceGroup(-1723956236);
                    if (z) {
                    }
                    String str922222 = name;
                    startRestartGroup.endReplaceGroup();
                    i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                    if (i11 == 1) {
                    }
                    long j522222 = m13241getCardBorderWin0d7_KjU;
                    if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
                    }
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i2722222 = 458752 & i5;
                    int i2822222 = i5 & 57344;
                    int i2922222 = i2622 & 7168;
                    i12 = i2622;
                    z8 = (i2822222 == 16384) | (i2722222 == 131072) | (i2922222 == 2048);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (z8) {
                    }
                    i13 = i5;
                    MutableState mutableStateOf$default32222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default32222);
                    rememberedValue = mutableStateOf$default32222;
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z9 = (i2722222 == 131072) | (i2822222 == 16384);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z9) {
                    }
                    MutableState mutableStateOf$default222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default222222);
                    rememberedValue2 = mutableStateOf$default222222;
                    mutableState2 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    valueOf = Boolean.valueOf(z5);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed = (i2722222 == 131072) | (i2922222 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    i14 = i12;
                    mutableState3 = mutableState2;
                    i15 = i13;
                    str6 = str5;
                    bool2 = valueOf;
                    i16 = 6;
                    r3 = 0;
                    i17 = 1;
                    rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                    composer2 = startRestartGroup;
                    composer2.updateRememberedValue(rememberedValue3);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                    if (z5) {
                    }
                    String str1022222 = str4;
                    composer2.startReplaceGroup(-1723906936);
                    if (z7) {
                    }
                    i18 = 2;
                    f2 = 0.0f;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState522222 = (MutableState) rememberedValue4;
                    composer2.endReplaceGroup();
                    Modifier zIndex42222 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState522222) ? 50.0f : 0.0f);
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer2.endReplaceGroup();
                    Modifier graphicsLayer22222 = GraphicsLayerModifierKt.graphicsLayer(zIndex42222, (Function1) rememberedValue5);
                    if (z2) {
                    }
                    z10 = 0;
                    str7 = str6;
                    i19 = i17;
                    Modifier modifier4222222 = modifier2;
                    Modifier m13203battleColumnGlowM0xzIa8$default222222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer22222, j, f, z10, 0.0f, 8, null);
                    if (!z7) {
                    }
                    m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                    float f3222222 = 10;
                    Modifier m1036borderxT4_qwU322222 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default222222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222222)));
                    i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                    if (i20 != i19) {
                    }
                    Modifier m1024backgroundbw27NRU222222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU322222, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222222)));
                    if (z6) {
                    }
                    Modifier m1517paddingVpY3zN4322222 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU222222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                    Alignment.Horizontal centerHorizontally222222 = Alignment.INSTANCE.getCenterHorizontally();
                    composer4 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222222, composer4, 48);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap422222 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN4322222);
                    Function0<ComposeUiNode> constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer4.getApplier() instanceof Applier)) {
                    }
                    composer4.startReusableNode();
                    if (!composer4.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                    float m7774constructorimpl4222222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                    float m7774constructorimpl5222222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                    Modifier.Companion companion222222 = Modifier.INSTANCE;
                    composer4.startReplaceGroup(1849434622);
                    rememberedValue6 = composer4.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer4.endReplaceGroup();
                    Modifier zIndex2222222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion222222, (Function1) rememberedValue6), 8.0f);
                    Alignment topCenter222222 = Alignment.INSTANCE.getTopCenter();
                    ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy322222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter222222, false);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap2222222 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(composer4, zIndex2222222);
                    Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer4.getApplier() instanceof Applier)) {
                    }
                    composer4.startReusableNode();
                    if (!composer4.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
                    String photoUrl222222 = newChallengeParticipantModel.getPhotoUrl();
                    Modifier clip322222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl4222222, 0.0f, 0.0f, 13, null), m7774constructorimpl5222222), RoundedCornerShapeKt.getCircleShape());
                    if (!z7) {
                    }
                    i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                    if (i22 != 1) {
                    }
                    Modifier m1036borderxT4_qwU2222222 = BorderKt.m1036borderxT4_qwU(clip322222, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                    composer4.startReplaceGroup(-1633490746);
                    z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                    rememberedValue7 = composer4.rememberedValue();
                    if (z11) {
                    }
                    i23 = 6;
                    rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                            BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                            return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue7);
                    composer4.endReplaceGroup();
                    int i30222222 = i23;
                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl222222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU2222222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    composer4.startReplaceGroup(1051319994);
                    if (z7) {
                    }
                    composer4.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                    TextKt.m2642Text4IGK_g(str922222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i30222222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                    level = newChallengeParticipantModel.getLevel();
                    composer4.startReplaceGroup(1882151488);
                    if (level != null) {
                    }
                    composer4.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                    composer4.startReplaceGroup(1882169849);
                    str8 = str2;
                    if (StringsKt.isBlank(str8)) {
                    }
                    String str11222222 = str8;
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(5004770);
                    rememberedValue8 = composer4.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function1 function12222222 = (Function1) rememberedValue8;
                    composer4.endReplaceGroup();
                    int i31222222 = i15 >> 3;
                    int i32222222 = i15 >> 9;
                    BattlePickChip(str, str11222222, str3, str1022222, battleBetHighlightStyle, bool, null, z6, function12222222, composer4, (i31222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31222222 & 14) | 100663296 | (i32222222 & 57344) | (i32222222 & 458752) | ((i14 << 9) & 29360128), 64);
                    composer4.startReplaceGroup(1882182468);
                    if (str7 != null) {
                    }
                    composer4.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z12 = z5;
                    z13 = z6;
                    modifier3 = modifier4222222;
                    endRestartGroup = composer4.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 |= i25;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i4 |= i24;
                i5 = i4;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i26222 = i6;
                if ((i3 & 4096) == 0) {
                }
                i7 = i3 & 8192;
                if (i7 == 0) {
                }
                i8 = i3 & 16384;
                if (i8 != 0) {
                }
                i9 = i3 & 32768;
                if (i9 == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                if (i10 != 1) {
                }
                str5 = stringResource;
                startRestartGroup.startReplaceGroup(-1723956236);
                if (z) {
                }
                String str9222222 = name;
                startRestartGroup.endReplaceGroup();
                i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                if (i11 == 1) {
                }
                long j5222222 = m13241getCardBorderWin0d7_KjU;
                if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
                }
                startRestartGroup.startReplaceGroup(-1746271574);
                int i27222222 = 458752 & i5;
                int i28222222 = i5 & 57344;
                int i29222222 = i26222 & 7168;
                i12 = i26222;
                z8 = (i28222222 == 16384) | (i27222222 == 131072) | (i29222222 == 2048);
                rememberedValue = startRestartGroup.rememberedValue();
                if (z8) {
                }
                i13 = i5;
                MutableState mutableStateOf$default322222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default322222);
                rememberedValue = mutableStateOf$default322222;
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                z9 = (i27222222 == 131072) | (i28222222 == 16384);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z9) {
                }
                MutableState mutableStateOf$default2222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2222222);
                rememberedValue2 = mutableStateOf$default2222222;
                mutableState2 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                valueOf = Boolean.valueOf(z5);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed = (i27222222 == 131072) | (i29222222 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                i14 = i12;
                mutableState3 = mutableState2;
                i15 = i13;
                str6 = str5;
                bool2 = valueOf;
                i16 = 6;
                r3 = 0;
                i17 = 1;
                rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue3);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
                if (z5) {
                }
                String str10222222 = str4;
                composer2.startReplaceGroup(-1723906936);
                if (z7) {
                }
                i18 = 2;
                f2 = 0.0f;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                rememberedValue4 = composer2.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState5222222 = (MutableState) rememberedValue4;
                composer2.endReplaceGroup();
                Modifier zIndex422222 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState5222222) ? 50.0f : 0.0f);
                composer2.startReplaceGroup(1849434622);
                rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                composer2.endReplaceGroup();
                Modifier graphicsLayer222222 = GraphicsLayerModifierKt.graphicsLayer(zIndex422222, (Function1) rememberedValue5);
                if (z2) {
                }
                z10 = 0;
                str7 = str6;
                i19 = i17;
                Modifier modifier42222222 = modifier2;
                Modifier m13203battleColumnGlowM0xzIa8$default2222222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer222222, j, f, z10, 0.0f, 8, null);
                if (!z7) {
                }
                m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
                float f32222222 = 10;
                Modifier m1036borderxT4_qwU3222222 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default2222222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222222)));
                i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                if (i20 != i19) {
                }
                Modifier m1024backgroundbw27NRU2222222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU3222222, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222222)));
                if (z6) {
                }
                Modifier m1517paddingVpY3zN43222222 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU2222222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
                Alignment.Horizontal centerHorizontally2222222 = Alignment.INSTANCE.getCenterHorizontally();
                composer4 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222222, composer4, 48);
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap4222222 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222222 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN43222222);
                Function0<ComposeUiNode> constructor4222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer4.getApplier() instanceof Applier)) {
                }
                composer4.startReusableNode();
                if (!composer4.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer4);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
                float m7774constructorimpl42222222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
                float m7774constructorimpl52222222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
                Modifier.Companion companion2222222 = Modifier.INSTANCE;
                composer4.startReplaceGroup(1849434622);
                rememberedValue6 = composer4.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                composer4.endReplaceGroup();
                Modifier zIndex22222222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion2222222, (Function1) rememberedValue6), 8.0f);
                Alignment topCenter2222222 = Alignment.INSTANCE.getTopCenter();
                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2222222, false);
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap22222222 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(composer4, zIndex22222222);
                Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer4.getApplier() instanceof Applier)) {
                }
                composer4.startReusableNode();
                if (!composer4.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3222222 = BoxScopeInstance.INSTANCE;
                String photoUrl2222222 = newChallengeParticipantModel.getPhotoUrl();
                Modifier clip3222222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl42222222, 0.0f, 0.0f, 13, null), m7774constructorimpl52222222), RoundedCornerShapeKt.getCircleShape());
                if (!z7) {
                }
                i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
                if (i22 != 1) {
                }
                Modifier m1036borderxT4_qwU22222222 = BorderKt.m1036borderxT4_qwU(clip3222222, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
                composer4.startReplaceGroup(-1633490746);
                z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
                rememberedValue7 = composer4.rememberedValue();
                if (z11) {
                }
                i23 = 6;
                rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                        BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                        return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                    }
                };
                composer4.updateRememberedValue(rememberedValue7);
                composer4.endReplaceGroup();
                int i302222222 = i23;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl2222222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU22222222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                composer4.startReplaceGroup(1051319994);
                if (z7) {
                }
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
                TextKt.m2642Text4IGK_g(str9222222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i302222222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                level = newChallengeParticipantModel.getLevel();
                composer4.startReplaceGroup(1882151488);
                if (level != null) {
                }
                composer4.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
                composer4.startReplaceGroup(1882169849);
                str8 = str2;
                if (StringsKt.isBlank(str8)) {
                }
                String str112222222 = str8;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(5004770);
                rememberedValue8 = composer4.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                Function1 function122222222 = (Function1) rememberedValue8;
                composer4.endReplaceGroup();
                int i312222222 = i15 >> 3;
                int i322222222 = i15 >> 9;
                BattlePickChip(str, str112222222, str3, str10222222, battleBetHighlightStyle, bool, null, z6, function122222222, composer4, (i312222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i312222222 & 14) | 100663296 | (i322222222 & 57344) | (i322222222 & 458752) | ((i14 << 9) & 29360128), 64);
                composer4.startReplaceGroup(1882182468);
                if (str7 != null) {
                }
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                if (ComposerKt.isTraceInProgress()) {
                }
                z12 = z5;
                z13 = z6;
                modifier3 = modifier42222222;
                endRestartGroup = composer4.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) == 0) {
            }
            i4 |= i25;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i24;
            i5 = i4;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i262222 = i6;
            if ((i3 & 4096) == 0) {
            }
            i7 = i3 & 8192;
            if (i7 == 0) {
            }
            i8 = i3 & 16384;
            if (i8 != 0) {
            }
            i9 = i3 & 32768;
            if (i9 == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
            if (i10 != 1) {
            }
            str5 = stringResource;
            startRestartGroup.startReplaceGroup(-1723956236);
            if (z) {
            }
            String str92222222 = name;
            startRestartGroup.endReplaceGroup();
            i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
            if (i11 == 1) {
            }
            long j52222222 = m13241getCardBorderWin0d7_KjU;
            if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
            }
            startRestartGroup.startReplaceGroup(-1746271574);
            int i272222222 = 458752 & i5;
            int i282222222 = i5 & 57344;
            int i292222222 = i262222 & 7168;
            i12 = i262222;
            z8 = (i282222222 == 16384) | (i272222222 == 131072) | (i292222222 == 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (z8) {
            }
            i13 = i5;
            MutableState mutableStateOf$default3222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default3222222);
            rememberedValue = mutableStateOf$default3222222;
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            z9 = (i272222222 == 131072) | (i282222222 == 16384);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z9) {
            }
            MutableState mutableStateOf$default22222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default22222222);
            rememberedValue2 = mutableStateOf$default22222222;
            mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            valueOf = Boolean.valueOf(z5);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = (i272222222 == 131072) | (i292222222 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            i14 = i12;
            mutableState3 = mutableState2;
            i15 = i13;
            str6 = str5;
            bool2 = valueOf;
            i16 = 6;
            r3 = 0;
            i17 = 1;
            rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
            composer2 = startRestartGroup;
            composer2.updateRememberedValue(rememberedValue3);
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
            if (z5) {
            }
            String str102222222 = str4;
            composer2.startReplaceGroup(-1723906936);
            if (z7) {
            }
            i18 = 2;
            f2 = 0.0f;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            rememberedValue4 = composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState52222222 = (MutableState) rememberedValue4;
            composer2.endReplaceGroup();
            Modifier zIndex4222222 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState52222222) ? 50.0f : 0.0f);
            composer2.startReplaceGroup(1849434622);
            rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            composer2.endReplaceGroup();
            Modifier graphicsLayer2222222 = GraphicsLayerModifierKt.graphicsLayer(zIndex4222222, (Function1) rememberedValue5);
            if (z2) {
            }
            z10 = 0;
            str7 = str6;
            i19 = i17;
            Modifier modifier422222222 = modifier2;
            Modifier m13203battleColumnGlowM0xzIa8$default22222222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer2222222, j, f, z10, 0.0f, 8, null);
            if (!z7) {
            }
            m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
            float f322222222 = 10;
            Modifier m1036borderxT4_qwU32222222 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default22222222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322222222)));
            i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
            if (i20 != i19) {
            }
            Modifier m1024backgroundbw27NRU22222222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU32222222, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322222222)));
            if (z6) {
            }
            Modifier m1517paddingVpY3zN432222222 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU22222222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
            Alignment.Horizontal centerHorizontally22222222 = Alignment.INSTANCE.getCenterHorizontally();
            composer4 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222222, composer4, 48);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap42222222 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier42222222 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN432222222);
            Function0<ComposeUiNode> constructor42222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (!composer4.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(composer4);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
            float m7774constructorimpl422222222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
            float m7774constructorimpl522222222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
            Modifier.Companion companion22222222 = Modifier.INSTANCE;
            composer4.startReplaceGroup(1849434622);
            rememberedValue6 = composer4.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            composer4.endReplaceGroup();
            Modifier zIndex222222222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion22222222, (Function1) rememberedValue6), 8.0f);
            Alignment topCenter22222222 = Alignment.INSTANCE.getTopCenter();
            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter22222222, false);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap222222222 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222222 = ComposedModifierKt.materializeModifier(composer4, zIndex222222222);
            Function0<ComposeUiNode> constructor222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (!composer4.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy32222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32222222 = BoxScopeInstance.INSTANCE;
            String photoUrl22222222 = newChallengeParticipantModel.getPhotoUrl();
            Modifier clip32222222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl422222222, 0.0f, 0.0f, 13, null), m7774constructorimpl522222222), RoundedCornerShapeKt.getCircleShape());
            if (!z7) {
            }
            i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
            if (i22 != 1) {
            }
            Modifier m1036borderxT4_qwU222222222 = BorderKt.m1036borderxT4_qwU(clip32222222, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
            composer4.startReplaceGroup(-1633490746);
            z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
            rememberedValue7 = composer4.rememberedValue();
            if (z11) {
            }
            i23 = 6;
            rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                    BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                    return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                }
            };
            composer4.updateRememberedValue(rememberedValue7);
            composer4.endReplaceGroup();
            int i3022222222 = i23;
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl22222222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU222222222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            composer4.startReplaceGroup(1051319994);
            if (z7) {
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
            TextKt.m2642Text4IGK_g(str92222222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i3022222222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
            level = newChallengeParticipantModel.getLevel();
            composer4.startReplaceGroup(1882151488);
            if (level != null) {
            }
            composer4.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
            composer4.startReplaceGroup(1882169849);
            str8 = str2;
            if (StringsKt.isBlank(str8)) {
            }
            String str1122222222 = str8;
            composer4.endReplaceGroup();
            composer4.startReplaceGroup(5004770);
            rememberedValue8 = composer4.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            Function1 function1222222222 = (Function1) rememberedValue8;
            composer4.endReplaceGroup();
            int i3122222222 = i15 >> 3;
            int i3222222222 = i15 >> 9;
            BattlePickChip(str, str1122222222, str3, str102222222, battleBetHighlightStyle, bool, null, z6, function1222222222, composer4, (i3122222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3122222222 & 14) | 100663296 | (i3222222222 & 57344) | (i3222222222 & 458752) | ((i14 << 9) & 29360128), 64);
            composer4.startReplaceGroup(1882182468);
            if (str7 != null) {
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (ComposerKt.isTraceInProgress()) {
            }
            z12 = z5;
            z13 = z6;
            modifier3 = modifier422222222;
            endRestartGroup = composer4.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i4 |= i25;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i24;
        i5 = i4;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i2622222 = i6;
        if ((i3 & 4096) == 0) {
        }
        i7 = i3 & 8192;
        if (i7 == 0) {
        }
        i8 = i3 & 16384;
        if (i8 != 0) {
        }
        i9 = i3 & 32768;
        if (i9 == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        i10 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i10 != 1) {
        }
        str5 = stringResource;
        startRestartGroup.startReplaceGroup(-1723956236);
        if (z) {
        }
        String str922222222 = name;
        startRestartGroup.endReplaceGroup();
        i11 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i11 == 1) {
        }
        long j522222222 = m13241getCardBorderWin0d7_KjU;
        if (battleBetHighlightStyle == BattleBetHighlightStyle.WINNER) {
        }
        startRestartGroup.startReplaceGroup(-1746271574);
        int i2722222222 = 458752 & i5;
        int i2822222222 = i5 & 57344;
        int i2922222222 = i2622222 & 7168;
        i12 = i2622222;
        z8 = (i2822222222 == 16384) | (i2722222222 == 131072) | (i2922222222 == 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (z8) {
        }
        i13 = i5;
        MutableState mutableStateOf$default32222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5 || d == null), null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default32222222);
        rememberedValue = mutableStateOf$default32222222;
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        z9 = (i2722222222 == 131072) | (i2822222222 == 16384);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z9) {
        }
        MutableState mutableStateOf$default222222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default222222222);
        rememberedValue2 = mutableStateOf$default222222222;
        mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        valueOf = Boolean.valueOf(z5);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = (i2722222222 == 131072) | (i2922222222 == 2048) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        i14 = i12;
        mutableState3 = mutableState2;
        i15 = i13;
        str6 = str5;
        bool2 = valueOf;
        i16 = 6;
        r3 = 0;
        i17 = 1;
        rememberedValue3 = new BattleResultComponentsKt$BattleDuelColumn$1$1(z5, d, mutableState, mutableState3, null);
        composer2 = startRestartGroup;
        composer2.updateRememberedValue(rememberedValue3);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(bool2, d, (Function2) rememberedValue3, composer2, ((i14 >> 9) & 14) | ((i15 >> 12) & 112));
        if (z5) {
        }
        String str1022222222 = str4;
        composer2.startReplaceGroup(-1723906936);
        if (z7) {
        }
        i18 = 2;
        f2 = 0.0f;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1849434622);
        rememberedValue4 = composer2.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState522222222 = (MutableState) rememberedValue4;
        composer2.endReplaceGroup();
        Modifier zIndex42222222 = ZIndexModifierKt.zIndex(SizeKt.wrapContentHeight$default(modifier2, vertical, r3, 3, vertical), BattleDuelColumn$lambda$61(mutableState522222222) ? 50.0f : 0.0f);
        composer2.startReplaceGroup(1849434622);
        rememberedValue5 = composer2.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        composer2.endReplaceGroup();
        Modifier graphicsLayer22222222 = GraphicsLayerModifierKt.graphicsLayer(zIndex42222222, (Function1) rememberedValue5);
        if (z2) {
        }
        z10 = 0;
        str7 = str6;
        i19 = i17;
        Modifier modifier4222222222 = modifier2;
        Modifier m13203battleColumnGlowM0xzIa8$default222222222 = BattleResultAnimationsKt.m13203battleColumnGlowM0xzIa8$default(graphicsLayer22222222, j, f, z10, 0.0f, 8, null);
        if (!z7) {
        }
        m7774constructorimpl = Dp.m7774constructorimpl((float) 1.5d);
        float f3222222222 = 10;
        Modifier m1036borderxT4_qwU322222222 = BorderKt.m1036borderxT4_qwU(m13203battleColumnGlowM0xzIa8$default222222222, m7774constructorimpl, Color.m5167copywmQWz5c$default(j, !z2 ? (0.35f * f) + 0.45f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222222222)));
        i20 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i20 != i19) {
        }
        Modifier m1024backgroundbw27NRU222222222 = BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU322222222, m5167copywmQWz5c$default, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222222222)));
        if (z6) {
        }
        Modifier m1517paddingVpY3zN4322222222 = PaddingKt.m1517paddingVpY3zN4(m1024backgroundbw27NRU222222222, m7774constructorimpl2, !z6 ? Dp.m7774constructorimpl(i21) : Dp.m7774constructorimpl(5));
        Alignment.Horizontal centerHorizontally222222222 = Alignment.INSTANCE.getCenterHorizontally();
        composer4 = composer3;
        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222222222, composer4, 48);
        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
        CompositionLocalMap currentCompositionLocalMap422222222 = composer4.getCurrentCompositionLocalMap();
        Modifier materializeModifier422222222 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN4322222222);
        Function0<ComposeUiNode> constructor422222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer4.getApplier() instanceof Applier)) {
        }
        composer4.startReusableNode();
        if (!composer4.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer4);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222222222 = ColumnScopeInstance.INSTANCE;
        float m7774constructorimpl4222222222 = Dp.m7774constructorimpl(!z6 ? i16 : 8);
        float m7774constructorimpl5222222222 = Dp.m7774constructorimpl(!z6 ? 34 : 40);
        Modifier.Companion companion222222222 = Modifier.INSTANCE;
        composer4.startReplaceGroup(1849434622);
        rememberedValue6 = composer4.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        composer4.endReplaceGroup();
        Modifier zIndex2222222222 = ZIndexModifierKt.zIndex(GraphicsLayerModifierKt.graphicsLayer(companion222222222, (Function1) rememberedValue6), 8.0f);
        Alignment topCenter222222222 = Alignment.INSTANCE.getTopCenter();
        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter222222222, false);
        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
        CompositionLocalMap currentCompositionLocalMap2222222222 = composer4.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222222 = ComposedModifierKt.materializeModifier(composer4, zIndex2222222222);
        Function0<ComposeUiNode> constructor2222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer4.getApplier() instanceof Applier)) {
        }
        composer4.startReusableNode();
        if (!composer4.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy322222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322222222 = BoxScopeInstance.INSTANCE;
        String photoUrl222222222 = newChallengeParticipantModel.getPhotoUrl();
        Modifier clip322222222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl4222222222, 0.0f, 0.0f, 13, null), m7774constructorimpl5222222222), RoundedCornerShapeKt.getCircleShape());
        if (!z7) {
        }
        i22 = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i22 != 1) {
        }
        Modifier m1036borderxT4_qwU2222222222 = BorderKt.m1036borderxT4_qwU(clip322222222, m7774constructorimpl3, j2, RoundedCornerShapeKt.getCircleShape());
        composer4.startReplaceGroup(-1633490746);
        z11 = ((i14 & 3670016) != 1048576) | ((i15 & 14) != 4);
        rememberedValue7 = composer4.rememberedValue();
        if (z11) {
        }
        i23 = 6;
        rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
                BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67 = BattleResultComponentsKt.BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel.this, function1);
                return BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67;
            }
        };
        composer4.updateRememberedValue(rememberedValue7);
        composer4.endReplaceGroup();
        int i30222222222 = i23;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl222222222, null, ClickableKt.m1059clickableXHw0xAI$default(m1036borderxT4_qwU2222222222, false, null, null, (Function0) rememberedValue7, 7, null), null, null, null, null, 0.0f, null, 0, false, composer4, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        composer4.startReplaceGroup(1051319994);
        if (z7) {
        }
        composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 2 : 3)), composer4, 0);
        TextKt.m2642Text4IGK_g(str922222222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(!z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, i30222222222), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
        level = newChallengeParticipantModel.getLevel();
        composer4.startReplaceGroup(1882151488);
        if (level != null) {
        }
        composer4.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 5)), composer4, 0);
        composer4.startReplaceGroup(1882169849);
        str8 = str2;
        if (StringsKt.isBlank(str8)) {
        }
        String str11222222222 = str8;
        composer4.endReplaceGroup();
        composer4.startReplaceGroup(5004770);
        rememberedValue8 = composer4.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        Function1 function12222222222 = (Function1) rememberedValue8;
        composer4.endReplaceGroup();
        int i31222222222 = i15 >> 3;
        int i32222222222 = i15 >> 9;
        BattlePickChip(str, str11222222222, str3, str1022222222, battleBetHighlightStyle, bool, null, z6, function12222222222, composer4, (i31222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31222222222 & 14) | 100663296 | (i32222222222 & 57344) | (i32222222222 & 458752) | ((i14 << 9) & 29360128), 64);
        composer4.startReplaceGroup(1882182468);
        if (str7 != null) {
        }
        composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        if (ComposerKt.isTraceInProgress()) {
        }
        z12 = z5;
        z13 = z6;
        modifier3 = modifier4222222222;
        endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean BattleDuelColumn$lambda$53(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BattleDuelColumn$lambda$54(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float BattleDuelColumn$lambda$56(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BattleDuelColumn$lambda$57(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final boolean BattleDuelColumn$lambda$61(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BattleDuelColumn$lambda$62(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelColumn$lambda$64$lambda$63(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelColumn$lambda$78$lambda$66$lambda$65(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelColumn$lambda$78$lambda$71$lambda$68$lambda$67(NewChallengeParticipantModel newChallengeParticipantModel, Function1 function1) {
        function1.invoke(Long.valueOf(newChallengeParticipantModel.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelColumn$lambda$78$lambda$71$lambda$70$lambda$69(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(-10.0f);
        graphicsLayer.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleDuelColumn$lambda$78$lambda$75$lambda$74(MutableState mutableState, boolean z) {
        BattleDuelColumn$lambda$62(mutableState, z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleOutcomeCaption(final BattleOutcomeMessage message, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        BattleResultPalette battleResultPalette2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Modifier.Companion companion;
        int i8;
        final BattleResultPalette battleResultPalette3;
        boolean z3;
        String stringResource;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer startRestartGroup = composer.startRestartGroup(754010309);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(message) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    battleResultPalette2 = battleResultPalette;
                    if (startRestartGroup.changed(battleResultPalette2)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    battleResultPalette2 = battleResultPalette;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                battleResultPalette2 = battleResultPalette;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 16384 : 8192;
                    if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                battleResultPalette2 = BattleResultPalette.INSTANCE.from(BattleResultTone.NEUTRAL);
                            }
                            if (i5 != 0) {
                                z2 = false;
                            }
                            i8 = i4;
                            battleResultPalette3 = battleResultPalette2;
                            z3 = z2;
                            if (i6 != 0) {
                                i7 = 8;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            companion = modifier2;
                            z3 = z2;
                            i8 = i4;
                            battleResultPalette3 = battleResultPalette2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(754010309, i8, -1, "org.betup.ui.dialogs.compose.BattleOutcomeCaption (BattleResultComponents.kt:1422)");
                        }
                        if (message.getFormatArgs().length != 0) {
                            startRestartGroup.startReplaceGroup(42490281);
                            stringResource = StringResources_androidKt.stringResource(message.getMessageResId(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(42548468);
                            int messageResId = message.getMessageResId();
                            Object[] formatArgs = message.getFormatArgs();
                            stringResource = StringResources_androidKt.stringResource(messageResId, Arrays.copyOf(formatArgs, formatArgs.length), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        int i11 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette3.getTone().ordinal()];
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), i7, 8, z3), battleResultPalette3, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
                        Alignment.Vertical top = Alignment.INSTANCE.getTop();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, startRestartGroup, 48);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i12 = i7;
                        z4 = z3;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_coin_battle_preview, startRestartGroup, 0), (String) null, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), 0.0f, Dp.m7774constructorimpl(1), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
                        TextKt.m2642Text4IGK_g(stringResource, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i7 = i12;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        battleResultPalette3 = battleResultPalette2;
                        z4 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final int i13 = i7;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleOutcomeCaption$lambda$81;
                                BattleOutcomeCaption$lambda$81 = BattleResultComponentsKt.BattleOutcomeCaption$lambda$81(BattleOutcomeMessage.this, modifier3, battleResultPalette3, z4, i13, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleOutcomeCaption$lambda$81;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                if ((i4 & 9363) == 9362) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                i8 = i4;
                battleResultPalette3 = battleResultPalette2;
                z3 = z2;
                if (i6 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (message.getFormatArgs().length != 0) {
                }
                int i112 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette3.getTone().ordinal()];
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), i7, 8, z3), battleResultPalette3, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
                Alignment.Vertical top2 = Alignment.INSTANCE.getTop();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top2, startRestartGroup, 48);
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
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i122 = i7;
                z4 = z3;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_coin_battle_preview, startRestartGroup, 0), (String) null, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), 0.0f, Dp.m7774constructorimpl(1), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
                TextKt.m2642Text4IGK_g(stringResource, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                i7 = i122;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i;
            if ((i4 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            i8 = i4;
            battleResultPalette3 = battleResultPalette2;
            z3 = z2;
            if (i6 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (message.getFormatArgs().length != 0) {
            }
            int i1122 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette3.getTone().ordinal()];
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), i7, 8, z3), battleResultPalette3, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
            Alignment.Vertical top22 = Alignment.INSTANCE.getTop();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top22, startRestartGroup, 48);
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
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i1222 = i7;
            z4 = z3;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_coin_battle_preview, startRestartGroup, 0), (String) null, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), 0.0f, Dp.m7774constructorimpl(1), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(stringResource, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = i1222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i;
        if ((i4 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        i8 = i4;
        battleResultPalette3 = battleResultPalette2;
        z3 = z2;
        if (i6 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (message.getFormatArgs().length != 0) {
        }
        int i11222 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette3.getTone().ordinal()];
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), i7, 8, z3), battleResultPalette3, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
        Alignment.Vertical top222 = Alignment.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top222, startRestartGroup, 48);
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
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        int i12222 = i7;
        z4 = z3;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.battle_coin_battle_preview, startRestartGroup, 0), (String) null, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), 0.0f, Dp.m7774constructorimpl(1), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
        TextKt.m2642Text4IGK_g(stringResource, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        i7 = i12222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Modifier battleInfoSurface(Modifier modifier, BattleResultPalette battleResultPalette, RoundedCornerShape roundedCornerShape) {
        RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
        return BorderKt.m1036borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(modifier, roundedCornerShape2), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.BattleChipSurface.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.BattleCardSurfaceBottom.INSTANCE.getColor(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(battleResultPalette.m13236getAccentBright0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShape2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleHowDecidedLink(final Function0<Unit> onClick, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        BattleResultPalette battleResultPalette2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        boolean z4;
        BattleResultPalette battleResultPalette3;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        BattleResultPalette battleResultPalette4;
        int i9;
        long m13236getAccentBright0d7_KjU;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean z7;
        Composer composer2;
        final Modifier modifier4;
        final boolean z8;
        final int i10;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-181497750);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    battleResultPalette2 = battleResultPalette;
                    if (startRestartGroup.changed(battleResultPalette2)) {
                        i11 = 256;
                        i4 |= i11;
                    }
                } else {
                    battleResultPalette2 = battleResultPalette;
                }
                i11 = 128;
                i4 |= i11;
            } else {
                battleResultPalette2 = battleResultPalette;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i2) == 0) {
                        z4 = z2;
                        i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                        if ((74899 & i4) == 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i3 & 4) != 0) {
                                    battleResultPalette3 = BattleResultPalette.INSTANCE.from(BattleResultTone.NEUTRAL);
                                    i4 &= -897;
                                } else {
                                    battleResultPalette3 = battleResultPalette2;
                                }
                                if (i5 != 0) {
                                    z3 = false;
                                }
                                if (i6 != 0) {
                                    i7 = 8;
                                }
                                modifier3 = companion;
                                if (i8 != 0) {
                                    battleResultPalette4 = battleResultPalette3;
                                    z5 = z3;
                                    z6 = false;
                                } else {
                                    z5 = z3;
                                    z6 = z4;
                                    battleResultPalette4 = battleResultPalette3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                modifier3 = modifier2;
                                z5 = z3;
                                z6 = z4;
                                battleResultPalette4 = battleResultPalette2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-181497750, i4, -1, "org.betup.ui.dialogs.compose.BattleHowDecidedLink (BattleResultComponents.kt:1494)");
                            }
                            i9 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette4.getTone().ordinal()];
                            if (i9 == 5) {
                                m13236getAccentBright0d7_KjU = battleResultPalette4.m13236getAccentBright0d7_KjU();
                            } else if (i9 == 8) {
                                m13236getAccentBright0d7_KjU = battleResultPalette4.m13236getAccentBright0d7_KjU();
                            } else {
                                m13236getAccentBright0d7_KjU = ComposeUtils.AppColorPalette.BattleLinkText.INSTANCE.getColor();
                            }
                            long j = m13236getAccentBright0d7_KjU;
                            float f = 8;
                            Modifier battleInfoSurface = battleInfoSurface(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), i7, 8, z5), battleResultPalette4, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i13 = i7;
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1057clickableO2vRcR0$default(battleInfoSurface, (MutableInteractionSource) rememberedValue, null, false, null, null, onClick, 28, null), Dp.m7774constructorimpl(z6 ? 10 : 12), z6 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(f));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
                            if (startRestartGroup.getInserting()) {
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
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            z7 = z5;
                            BattleResultPalette battleResultPalette5 = battleResultPalette4;
                            Modifier modifier5 = modifier3;
                            composer2 = startRestartGroup;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 13 : 15)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, j, 0, 2, null), composer2, 48, 56);
                            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer2, 6);
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.battle_how_decided, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, TextUnitKt.getSp(0.15d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, z6 ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613208, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            battleResultPalette2 = battleResultPalette5;
                            modifier4 = modifier5;
                            z8 = z6;
                            i10 = i13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z7 = z3;
                            i10 = i7;
                            z8 = z4;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final BattleResultPalette battleResultPalette6 = battleResultPalette2;
                            final boolean z9 = z7;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BattleHowDecidedLink$lambda$84;
                                    BattleHowDecidedLink$lambda$84 = BattleResultComponentsKt.BattleHowDecidedLink$lambda$84(Function0.this, modifier4, battleResultPalette6, z9, i10, z8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BattleHowDecidedLink$lambda$84;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    if ((74899 & i4) == 74898) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    modifier3 = companion;
                    if (i8 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i9 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette4.getTone().ordinal()];
                    if (i9 == 5) {
                    }
                    long j2 = m13236getAccentBright0d7_KjU;
                    float f2 = 8;
                    Modifier battleInfoSurface2 = battleInfoSurface(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), i7, 8, z5), battleResultPalette4, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2)));
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    int i132 = i7;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1057clickableO2vRcR0$default(battleInfoSurface2, (MutableInteractionSource) rememberedValue, null, false, null, null, onClick, 28, null), Dp.m7774constructorimpl(z6 ? 10 : 12), z6 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(f2));
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
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
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    z7 = z5;
                    BattleResultPalette battleResultPalette52 = battleResultPalette4;
                    Modifier modifier52 = modifier3;
                    composer2 = startRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 13 : 15)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, j2, 0, 2, null), composer2, 48, 56);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer2, 6);
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.battle_how_decided, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, TextUnitKt.getSp(0.15d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, z6 ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613208, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    battleResultPalette2 = battleResultPalette52;
                    modifier4 = modifier52;
                    z8 = z6;
                    i10 = i132;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                z4 = z2;
                if ((74899 & i4) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                modifier3 = companion;
                if (i8 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i9 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette4.getTone().ordinal()];
                if (i9 == 5) {
                }
                long j22 = m13236getAccentBright0d7_KjU;
                float f22 = 8;
                Modifier battleInfoSurface22 = battleInfoSurface(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), i7, 8, z5), battleResultPalette4, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22)));
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                int i1322 = i7;
                Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1057clickableO2vRcR0$default(battleInfoSurface22, (MutableInteractionSource) rememberedValue, null, false, null, null, onClick, 28, null), Dp.m7774constructorimpl(z6 ? 10 : 12), z6 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(f22));
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
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
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                z7 = z5;
                BattleResultPalette battleResultPalette522 = battleResultPalette4;
                Modifier modifier522 = modifier3;
                composer2 = startRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 13 : 15)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, j22, 0, 2, null), composer2, 48, 56);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer2, 6);
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.battle_how_decided, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j22, TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, TextUnitKt.getSp(0.15d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, z6 ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613208, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                battleResultPalette2 = battleResultPalette522;
                modifier4 = modifier522;
                z8 = z6;
                i10 = i1322;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            z4 = z2;
            if ((74899 & i4) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            modifier3 = companion;
            if (i8 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            i9 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette4.getTone().ordinal()];
            if (i9 == 5) {
            }
            long j222 = m13236getAccentBright0d7_KjU;
            float f222 = 8;
            Modifier battleInfoSurface222 = battleInfoSurface(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), i7, 8, z5), battleResultPalette4, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f222)));
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            int i13222 = i7;
            Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1057clickableO2vRcR0$default(battleInfoSurface222, (MutableInteractionSource) rememberedValue, null, false, null, null, onClick, 28, null), Dp.m7774constructorimpl(z6 ? 10 : 12), z6 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(f222));
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            z7 = z5;
            BattleResultPalette battleResultPalette5222 = battleResultPalette4;
            Modifier modifier5222 = modifier3;
            composer2 = startRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 13 : 15)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, j222, 0, 2, null), composer2, 48, 56);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer2, 6);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.battle_how_decided, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j222, TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, TextUnitKt.getSp(0.15d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, z6 ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613208, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            battleResultPalette2 = battleResultPalette5222;
            modifier4 = modifier5222;
            z8 = z6;
            i10 = i13222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        z4 = z2;
        if ((74899 & i4) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        modifier3 = companion;
        if (i8 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        i9 = WhenMappings.$EnumSwitchMapping$0[battleResultPalette4.getTone().ordinal()];
        if (i9 == 5) {
        }
        long j2222 = m13236getAccentBright0d7_KjU;
        float f2222 = 8;
        Modifier battleInfoSurface2222 = battleInfoSurface(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), i7, 8, z5), battleResultPalette4, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2222)));
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        int i132222 = i7;
        Modifier m1517paddingVpY3zN42222 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1057clickableO2vRcR0$default(battleInfoSurface2222, (MutableInteractionSource) rememberedValue, null, false, null, null, onClick, 28, null), Dp.m7774constructorimpl(z6 ? 10 : 12), z6 ? Dp.m7774constructorimpl(5) : Dp.m7774constructorimpl(f2222));
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center2222 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(center2222, centerVertically2222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        z7 = z5;
        BattleResultPalette battleResultPalette52222 = battleResultPalette4;
        Modifier modifier52222 = modifier3;
        composer2 = startRestartGroup;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 13 : 15)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, j2222, 0, 2, null), composer2, 48, 56);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer2, 6);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.battle_how_decided, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2222, TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, TextUnitKt.getSp(0.15d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, z6 ? TextUnitKt.getSp(13) : TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613208, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        battleResultPalette2 = battleResultPalette52222;
        modifier4 = modifier52222;
        z8 = z6;
        i10 = i132222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleResultActions(final Function0<Unit> onShare, final Function0<Unit> onRematch, final Function0<Unit> onHowBattlesDecided, Modifier modifier, BattleResultPalette battleResultPalette, boolean z, int i, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        final BattleResultPalette battleResultPalette2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        BattleResultPalette battleResultPalette3;
        boolean z5;
        int i10;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        final int i11;
        ScopeUpdateScope endRestartGroup;
        int i12;
        Intrinsics.checkNotNullParameter(onShare, "onShare");
        Intrinsics.checkNotNullParameter(onRematch, "onRematch");
        Intrinsics.checkNotNullParameter(onHowBattlesDecided, "onHowBattlesDecided");
        Composer startRestartGroup = composer.startRestartGroup(-578677200);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(onShare) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onRematch) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onHowBattlesDecided) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    battleResultPalette2 = battleResultPalette;
                    if (startRestartGroup.changed(battleResultPalette2)) {
                        i12 = 16384;
                        i4 |= i12;
                    }
                } else {
                    battleResultPalette2 = battleResultPalette;
                }
                i12 = 8192;
                i4 |= i12;
            } else {
                battleResultPalette2 = battleResultPalette;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 1048576 : 524288;
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i4 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i13 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                battleResultPalette2 = BattleResultPalette.INSTANCE.from(BattleResultTone.NEUTRAL);
                            }
                            if (i5 != 0) {
                                z3 = false;
                            }
                            if (i6 != 0) {
                                i7 = 8;
                            }
                            if (i8 == 0) {
                                i9 = i4;
                                z4 = false;
                            } else {
                                z4 = z2;
                                i9 = i4;
                            }
                            battleResultPalette3 = battleResultPalette2;
                            z5 = z3;
                            i10 = i7;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            z4 = z2;
                            i9 = i4;
                            battleResultPalette3 = battleResultPalette2;
                            z5 = z3;
                            i10 = i7;
                            modifier2 = modifier;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-578677200, i9, -1, "org.betup.ui.dialogs.compose.BattleResultActions (BattleResultComponents.kt:1553)");
                        }
                        float rememberShimmerProgress = BattleResultAnimationsKt.rememberShimmerProgress(z5, 0, startRestartGroup, (i9 >> 15) & 14, 2);
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i10, 8, z5), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        int i14 = i10;
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 6 : 10));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 8 : 10));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i15 = i9;
                        BattleOutlineActionButton(StringResources_androidKt.stringResource(R.string.battle_share, startRestartGroup, 6), R.drawable.share_ic_new, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), onShare, z4, startRestartGroup, ((i9 << 9) & 7168) | 48 | ((i9 >> 9) & 57344), 0);
                        String stringResource = StringResources_androidKt.stringResource(R.string.battle_rematch, startRestartGroup, 6);
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        int i16 = i15 >> 6;
                        int i17 = i16 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                        int i18 = i15 >> 3;
                        boolean z8 = z5;
                        Modifier modifier4 = modifier2;
                        composer2 = startRestartGroup;
                        BattleResultPalette battleResultPalette4 = battleResultPalette3;
                        BattleRematchButton(stringResource, weight$default, battleResultPalette4, rememberShimmerProgress, z8, onRematch, z4, composer2, (57344 & i18) | i17 | ((i15 << 12) & 458752) | (i18 & 3670016), 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        BattleHowDecidedLink(onHowBattlesDecided, null, battleResultPalette4, false, 8, z4, composer2, i17 | (i16 & 14) | 27648 | (i16 & 458752), 2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z6 = z8;
                        battleResultPalette2 = battleResultPalette3;
                        z7 = z4;
                        i11 = i14;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z7 = z2;
                        z6 = z3;
                        i11 = i7;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleResultActions$lambda$87;
                                BattleResultActions$lambda$87 = BattleResultComponentsKt.BattleResultActions$lambda$87(Function0.this, onRematch, onHowBattlesDecided, modifier3, battleResultPalette2, z6, i11, z7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleResultActions$lambda$87;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 == 0) {
                }
                battleResultPalette3 = battleResultPalette2;
                z5 = z3;
                i10 = i7;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float rememberShimmerProgress2 = BattleResultAnimationsKt.rememberShimmerProgress(z5, 0, startRestartGroup, (i9 >> 15) & 14, 2);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i10, 8, z5), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                int i142 = i10;
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 6 : 10));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_43, centerHorizontally2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 8 : 10));
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i152 = i9;
                BattleOutlineActionButton(StringResources_androidKt.stringResource(R.string.battle_share, startRestartGroup, 6), R.drawable.share_ic_new, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), onShare, z4, startRestartGroup, ((i9 << 9) & 7168) | 48 | ((i9 >> 9) & 57344), 0);
                String stringResource2 = StringResources_androidKt.stringResource(R.string.battle_rematch, startRestartGroup, 6);
                Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                int i162 = i152 >> 6;
                int i172 = i162 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                int i182 = i152 >> 3;
                boolean z82 = z5;
                Modifier modifier42 = modifier2;
                composer2 = startRestartGroup;
                BattleResultPalette battleResultPalette42 = battleResultPalette3;
                BattleRematchButton(stringResource2, weight$default2, battleResultPalette42, rememberShimmerProgress2, z82, onRematch, z4, composer2, (57344 & i182) | i172 | ((i152 << 12) & 458752) | (i182 & 3670016), 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                BattleHowDecidedLink(onHowBattlesDecided, null, battleResultPalette42, false, 8, z4, composer2, i172 | (i162 & 14) | 27648 | (i162 & 458752), 2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                z6 = z82;
                battleResultPalette2 = battleResultPalette3;
                z7 = z4;
                i11 = i142;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            battleResultPalette3 = battleResultPalette2;
            z5 = z3;
            i10 = i7;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            float rememberShimmerProgress22 = BattleResultAnimationsKt.rememberShimmerProgress(z5, 0, startRestartGroup, (i9 >> 15) & 14, 2);
            Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i10, 8, z5), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
            Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
            int i1422 = i10;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_432 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 6 : 10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_432, centerHorizontally22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 8 : 10));
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4222, centerVertically22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i1522 = i9;
            BattleOutlineActionButton(StringResources_androidKt.stringResource(R.string.battle_share, startRestartGroup, 6), R.drawable.share_ic_new, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), onShare, z4, startRestartGroup, ((i9 << 9) & 7168) | 48 | ((i9 >> 9) & 57344), 0);
            String stringResource22 = StringResources_androidKt.stringResource(R.string.battle_rematch, startRestartGroup, 6);
            Modifier weight$default22 = RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
            int i1622 = i1522 >> 6;
            int i1722 = i1622 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
            int i1822 = i1522 >> 3;
            boolean z822 = z5;
            Modifier modifier422 = modifier2;
            composer2 = startRestartGroup;
            BattleResultPalette battleResultPalette422 = battleResultPalette3;
            BattleRematchButton(stringResource22, weight$default22, battleResultPalette422, rememberShimmerProgress22, z822, onRematch, z4, composer2, (57344 & i1822) | i1722 | ((i1522 << 12) & 458752) | (i1822 & 3670016), 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            BattleHowDecidedLink(onHowBattlesDecided, null, battleResultPalette422, false, 8, z4, composer2, i1722 | (i1622 & 14) | 27648 | (i1622 & 458752), 2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            z6 = z822;
            battleResultPalette2 = battleResultPalette3;
            z7 = z4;
            i11 = i1422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
        battleResultPalette3 = battleResultPalette2;
        z5 = z3;
        i10 = i7;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float rememberShimmerProgress222 = BattleResultAnimationsKt.rememberShimmerProgress(z5, 0, startRestartGroup, (i9 >> 15) & 14, 2);
        Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), i10, 8, z5), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
        Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
        int i14222 = i10;
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4322 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 6 : 10));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4322, centerHorizontally222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(!z4 ? 8 : 10));
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42222, centerVertically222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        int i15222 = i9;
        BattleOutlineActionButton(StringResources_androidKt.stringResource(R.string.battle_share, startRestartGroup, 6), R.drawable.share_ic_new, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), onShare, z4, startRestartGroup, ((i9 << 9) & 7168) | 48 | ((i9 >> 9) & 57344), 0);
        String stringResource222 = StringResources_androidKt.stringResource(R.string.battle_rematch, startRestartGroup, 6);
        Modifier weight$default222 = RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null);
        int i16222 = i15222 >> 6;
        int i17222 = i16222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
        int i18222 = i15222 >> 3;
        boolean z8222 = z5;
        Modifier modifier4222 = modifier2;
        composer2 = startRestartGroup;
        BattleResultPalette battleResultPalette4222 = battleResultPalette3;
        BattleRematchButton(stringResource222, weight$default222, battleResultPalette4222, rememberShimmerProgress222, z8222, onRematch, z4, composer2, (57344 & i18222) | i17222 | ((i15222 << 12) & 458752) | (i18222 & 3670016), 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        BattleHowDecidedLink(onHowBattlesDecided, null, battleResultPalette4222, false, 8, z4, composer2, i17222 | (i16222 & 14) | 27648 | (i16222 & 458752), 2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        z6 = z8222;
        battleResultPalette2 = battleResultPalette3;
        z7 = z4;
        i11 = i14222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BattleRematchButton(final String str, Modifier modifier, final BattleResultPalette battleResultPalette, final float f, final boolean z, final Function0<Unit> function0, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Modifier.Companion companion;
        boolean z4;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final boolean z5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2031698736);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(battleResultPalette) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    boolean z6 = i4 != 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031698736, i3, -1, "org.betup.ui.dialogs.compose.BattleRematchButton (BattleResultComponents.kt:1608)");
                    }
                    RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                    float f2 = 6;
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(companion, Dp.m7774constructorimpl(z6 ? 34 : 40)), m1810RoundedCornerShape0680j_4), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), null, 0.0f, 6, null), Dp.m7774constructorimpl(f2), m1810RoundedCornerShape0680j_4, false, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), battleResultPalette.m13242getEmblemShadow0d7_KjU(), 4, null), false, null, null, function0, 7, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z4 = ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BattleRematchButton$lambda$89$lambda$88;
                                BattleRematchButton$lambda$89$lambda$88 = BattleResultComponentsKt.BattleRematchButton$lambda$89$lambda$88(z, f, (DrawScope) obj);
                                return BattleRematchButton$lambda$89$lambda$88;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier drawBehind = DrawModifierKt.drawBehind(m1059clickableXHw0xAI$default, (Function1) rememberedValue);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
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
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.8d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
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
                    z5 = z6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    z5 = z3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BattleRematchButton$lambda$92;
                            BattleRematchButton$lambda$92 = BattleResultComponentsKt.BattleRematchButton$lambda$92(str, modifier3, battleResultPalette, f, z, function0, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BattleRematchButton$lambda$92;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if ((599187 & i3) == 599186) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            float f22 = 6;
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(companion, Dp.m7774constructorimpl(z6 ? 34 : 40)), m1810RoundedCornerShape0680j_42), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), null, 0.0f, 6, null), Dp.m7774constructorimpl(f22), m1810RoundedCornerShape0680j_42, false, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), battleResultPalette.m13242getEmblemShadow0d7_KjU(), 4, null), false, null, null, function0, 7, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            z4 = ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BattleRematchButton$lambda$89$lambda$88;
                    BattleRematchButton$lambda$89$lambda$88 = BattleResultComponentsKt.BattleRematchButton$lambda$89$lambda$88(z, f, (DrawScope) obj);
                    return BattleRematchButton$lambda$89$lambda$88;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier drawBehind2 = DrawModifierKt.drawBehind(m1059clickableXHw0xAI$default2, (Function1) rememberedValue);
            Alignment center3 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center22, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
            String upperCase2 = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            TextKt.m2642Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.8d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
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
            z5 = z6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((599187 & i3) == 599186) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        float f222 = 6;
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(companion, Dp.m7774constructorimpl(z6 ? 34 : 40)), m1810RoundedCornerShape0680j_422), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), null, 0.0f, 6, null), Dp.m7774constructorimpl(f222), m1810RoundedCornerShape0680j_422, false, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), battleResultPalette.m13242getEmblemShadow0d7_KjU(), 4, null), false, null, null, function0, 7, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        z4 = ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BattleRematchButton$lambda$89$lambda$88;
                BattleRematchButton$lambda$89$lambda$88 = BattleResultComponentsKt.BattleRematchButton$lambda$89$lambda$88(z, f, (DrawScope) obj);
                return BattleRematchButton$lambda$89$lambda$88;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier drawBehind22 = DrawModifierKt.drawBehind(m1059clickableXHw0xAI$default22, (Function1) rememberedValue);
        Alignment center32 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center32, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center222, centerVertically22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z6 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222)), startRestartGroup, 6);
        String upperCase22 = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase22, "toUpperCase(...)");
        TextKt.m2642Text4IGK_g(upperCase22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(z6 ? 10 : 11), FontWeight.INSTANCE.getBlack(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.8d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
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
        z5 = z6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleRematchButton$lambda$89$lambda$88(boolean z, float f, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (z) {
            float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) * 0.35f;
            float intBitsToFloat2 = ((Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) + intBitsToFloat) * f) - intBitsToFloat;
            DrawScope.m5723drawRectAsUm42w$default(drawBehind, Brush.Companion.m5117horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), intBitsToFloat2, intBitsToFloat2 + intBitsToFloat, 0, 8, (Object) null), 0L, drawBehind.mo5730getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BattleOutlineActionButton(final String str, final int i, Modifier modifier, final Function0<Unit> function0, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        Modifier.Companion companion;
        boolean z3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-648099437);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
                i5 = i3 & 16;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    z2 = z;
                    i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-648099437, i4, -1, "org.betup.ui.dialogs.compose.BattleOutlineActionButton (BattleResultComponents.kt:1675)");
                        }
                        RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1036borderxT4_qwU(ClipKt.clip(companion, m1810RoundedCornerShape0680j_4), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_4), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, function0, 7, null), Dp.m7774constructorimpl(!z3 ? 10 : 12), Dp.m7774constructorimpl(!z3 ? 7 : 9));
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Painter painterResource = PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14);
                        int i7 = 10;
                        ImageKt.Image(painterResource, (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z3 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (!z3) {
                            i7 = 11;
                        }
                        TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i7), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final boolean z4 = z2;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleOutlineActionButton$lambda$94;
                                BattleOutlineActionButton$lambda$94 = BattleResultComponentsKt.BattleOutlineActionButton$lambda$94(str, i, modifier3, function0, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleOutlineActionButton$lambda$94;
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i4 & 9363) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1036borderxT4_qwU(ClipKt.clip(companion, m1810RoundedCornerShape0680j_42), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_42), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, function0, 7, null), Dp.m7774constructorimpl(!z3 ? 10 : 12), Dp.m7774constructorimpl(!z3 ? 7 : 9));
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
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
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Painter painterResource2 = PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14);
                int i72 = 10;
                ImageKt.Image(painterResource2, (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z3 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                String upperCase2 = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (!z3) {
                }
                TextKt.m2642Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i72), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i4 & 9363) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1036borderxT4_qwU(ClipKt.clip(companion, m1810RoundedCornerShape0680j_422), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_422), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, function0, 7, null), Dp.m7774constructorimpl(!z3 ? 10 : 12), Dp.m7774constructorimpl(!z3 ? 7 : 9));
            Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
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
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            Painter painterResource22 = PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14);
            int i722 = 10;
            ImageKt.Image(painterResource22, (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z3 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
            String upperCase22 = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase22, "toUpperCase(...)");
            if (!z3) {
            }
            TextKt.m2642Text4IGK_g(upperCase22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i722), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z2 = z3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i4 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1036borderxT4_qwU(ClipKt.clip(companion, m1810RoundedCornerShape0680j_4222), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_4222), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, function0, 7, null), Dp.m7774constructorimpl(!z3 ? 10 : 12), Dp.m7774constructorimpl(!z3 ? 7 : 9));
        Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
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
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        Painter painterResource222 = PainterResources_androidKt.painterResource(i, startRestartGroup, (i4 >> 3) & 14);
        int i7222 = 10;
        ImageKt.Image(painterResource222, (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z3 ? 12 : 14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
        String upperCase222 = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase222, "toUpperCase(...)");
        if (!z3) {
        }
        TextKt.m2642Text4IGK_g(upperCase222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i7222), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), startRestartGroup, 0, 3072, 57342);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleDetailsStatusBanner(final String message, final BattleResultPalette palette, Modifier modifier, boolean z, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final int i9;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(-1788708291);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(message) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 16384 : 8192;
                    i8 = i4;
                    if ((i8 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i5 == 0 ? false : z2;
                        if (i6 != 0) {
                            i7 = 8;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1788708291, i8, -1, "org.betup.ui.dialogs.compose.BattleDetailsStatusBanner (BattleResultComponents.kt:1717)");
                        }
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), i7, 8, z4), palette, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i11 = i7;
                        boolean z5 = z4;
                        Modifier modifier5 = modifier4;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
                        composer2 = startRestartGroup;
                        TextKt.m2642Text4IGK_g(message, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(15), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer2, i8 & 14, 0, 65532);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i9 = i11;
                        z3 = z5;
                        modifier3 = modifier5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        i9 = i7;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleDetailsStatusBanner$lambda$96;
                                BattleDetailsStatusBanner$lambda$96 = BattleResultComponentsKt.BattleDetailsStatusBanner$lambda$96(message, palette, modifier3, z3, i9, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleDetailsStatusBanner$lambda$96;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                i8 = i4;
                if ((i8 & 9363) == 9362) {
                }
                if (i10 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), i7, 8, z4), palette, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
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
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i112 = i7;
                boolean z52 = z4;
                Modifier modifier52 = modifier4;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
                composer2 = startRestartGroup;
                TextKt.m2642Text4IGK_g(message, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(15), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer2, i8 & 14, 0, 65532);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                i9 = i112;
                z3 = z52;
                modifier3 = modifier52;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i4;
            if ((i8 & 9363) == 9362) {
            }
            if (i10 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), i7, 8, z4), palette, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
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
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i1122 = i7;
            boolean z522 = z4;
            Modifier modifier522 = modifier4;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(message, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(15), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer2, i8 & 14, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            i9 = i1122;
            z3 = z522;
            modifier3 = modifier522;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i4;
        if ((i8 & 9363) == 9362) {
        }
        if (i10 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(battleInfoSurface$default(BattleResultAnimationsKt.battleRevealRise(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), i7, 8, z4), palette, null, 2, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8));
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
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
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        int i11222 = i7;
        boolean z5222 = z4;
        Modifier modifier5222 = modifier4;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_battle, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), startRestartGroup, 6);
        composer2 = startRestartGroup;
        TextKt.m2642Text4IGK_g(message, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(15), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer2, i8 & 14, 0, 65532);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        i9 = i11222;
        z3 = z5222;
        modifier3 = modifier5222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleDetailsOkButton(final String text, final BattleResultPalette palette, final Function0<Unit> onClick, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(palette, "palette");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1198236508);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 != 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1198236508, i3, -1, "org.betup.ui.dialogs.compose.BattleDetailsOkButton (BattleResultComponents.kt:1757)");
                    }
                    RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1036borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(modifier4, Dp.m7774constructorimpl(z4 ? 34 : 40)), 0.0f, 1, null), m1810RoundedCornerShape0680j_4), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_4), palette.m13237getAccentSoft0d7_KjU(), m1810RoundedCornerShape0680j_4), Dp.m7774constructorimpl(4), m1810RoundedCornerShape0680j_4, false, Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), palette.m13242getEmblemShadow0d7_KjU(), 4, null), false, null, null, onClick, 7, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
                    String upperCase = text.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(z4 ? 11 : 12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.6d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z3 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BattleDetailsOkButton$lambda$98;
                            BattleDetailsOkButton$lambda$98 = BattleResultComponentsKt.BattleDetailsOkButton$lambda$98(text, palette, onClick, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BattleDetailsOkButton$lambda$98;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i3 & 9363) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1036borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(modifier4, Dp.m7774constructorimpl(z4 ? 34 : 40)), 0.0f, 1, null), m1810RoundedCornerShape0680j_42), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_42), palette.m13237getAccentSoft0d7_KjU(), m1810RoundedCornerShape0680j_42), Dp.m7774constructorimpl(4), m1810RoundedCornerShape0680j_42, false, Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), palette.m13242getEmblemShadow0d7_KjU(), 4, null), false, null, null, onClick, 7, null);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            String upperCase2 = text.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            Modifier modifier52 = modifier4;
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(z4 ? 11 : 12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.6d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            z3 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i3 & 9363) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1036borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(modifier4, Dp.m7774constructorimpl(z4 ? 34 : 40)), 0.0f, 1, null), m1810RoundedCornerShape0680j_422), Dp.m7774constructorimpl(1), Color.m5167copywmQWz5c$default(palette.m13235getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), m1810RoundedCornerShape0680j_422), palette.m13237getAccentSoft0d7_KjU(), m1810RoundedCornerShape0680j_422), Dp.m7774constructorimpl(4), m1810RoundedCornerShape0680j_422, false, Color.m5167copywmQWz5c$default(palette.m13243getGlow0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), palette.m13242getEmblemShadow0d7_KjU(), 4, null), false, null, null, onClick, 7, null);
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        String upperCase22 = text.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase22, "toUpperCase(...)");
        Modifier modifier522 = modifier4;
        composer2 = startRestartGroup;
        TextKt.m2642Text4IGK_g(upperCase22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(z4 ? 11 : 12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, TextUnitKt.getSp(0.6d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777048, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        z3 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final String buildPeriodTag(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String str3 = str;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        if (str3 != null && !StringsKt.isBlank(str3) && !StringsKt.isBlank(str2)) {
            sb.append(" • ");
        }
        if (!StringsKt.isBlank(str2)) {
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            sb.append(upperCase2);
        }
        return sb.toString();
    }

    private static final String formatBattleCoef(Double d, OddType oddType, boolean z) {
        String format;
        if (z || d == null || d.doubleValue() <= 0.0d || (format = OddHelper.format(oddType, d.doubleValue())) == null) {
            return "-";
        }
        if (StringsKt.isBlank(format) || Intrinsics.areEqual(format, AbstractJsonLexerKt.NULL) || Intrinsics.areEqual(format, "0") || Intrinsics.areEqual(format, IdManager.DEFAULT_VERSION_NAME)) {
            format = null;
        }
        return format == null ? "-" : format;
    }

    private static final Boolean betWonFromHighlight(BattleBetHighlightStyle battleBetHighlightStyle) {
        int i = WhenMappings.$EnumSwitchMapping$1[battleBetHighlightStyle.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i == 4 || i == 5) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    static /* synthetic */ Modifier battleInfoSurface$default(Modifier modifier, BattleResultPalette battleResultPalette, RoundedCornerShape roundedCornerShape, int i, Object obj) {
        if ((i & 2) != 0) {
            roundedCornerShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(10));
        }
        return battleInfoSurface(modifier, battleResultPalette, roundedCornerShape);
    }

    private static final float BattleDuelColumn$lambda$59(State<Float> state) {
        return state.getValue().floatValue();
    }
}
