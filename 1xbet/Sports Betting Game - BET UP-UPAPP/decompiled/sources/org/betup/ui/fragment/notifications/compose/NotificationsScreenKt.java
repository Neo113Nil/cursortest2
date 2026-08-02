package org.betup.ui.fragment.notifications.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import io.bidmachine.unified.UnifiedMediationParams;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.Event;
import org.betup.model.local.entity.NotificationType;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.notifications.controller.NotificationsController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: NotificationsScreen.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000f\u001a&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0015H\u0002\u001a$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0015H\u0003\u001a\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\u0010\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020 X\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002"}, d2 = {"NotificationsScreen", "", "controller", "Lorg/betup/ui/fragment/notifications/controller/NotificationsController;", "onBackClick", "Lkotlin/Function0;", "onNotificationClick", "Lkotlin/Function1;", "Lorg/betup/model/local/entity/Event;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/notifications/controller/NotificationsController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NotificationItem", "event", "onClick", "(Lorg/betup/model/local/entity/Event;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getNotificationImage", "", "type", "Lorg/betup/model/local/entity/NotificationType;", "params", "", "getNotificationIconRes", "", "formatTimestamp", "timestamp", "", "(JLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "app_release", "notifications", "", "isLoading", "", "isLoadingMore", "hasMore", "isRefreshing", "error"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationsScreenKt {

    /* compiled from: NotificationsScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.ACHIEVEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.BET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationType.COMPETITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationType.CHALLENGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationType.CHALLENGE_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NotificationType.CHALLENGE_ACCEPT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NotificationType.CHALLENGE_PRIVATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NotificationType.MATCH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NotificationType.MATCH_SCORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NotificationType.MATCH_FINISHED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NotificationType.PROMO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NotificationType.OFFER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BetState.values().length];
            try {
                iArr2[BetState.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BetState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BetState.RETURNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[BetState.WON.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[BetState.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationItem$lambda$19(Event event, Function0 function0, int i, Composer composer, int i2) {
        NotificationItem(event, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationsScreen$lambda$16(NotificationsController notificationsController, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NotificationsScreen(notificationsController, function0, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationsScreen$lambda$1$lambda$0(Event it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationsScreen(final NotificationsController controller, final Function0<Unit> onBackClick, Function1<? super Event, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Function1<? super Event, Unit> function12;
        int i4;
        Modifier modifier2;
        int i5;
        Function1<? super Event, Unit> function13;
        State collectAsState;
        State collectAsState2;
        State collectAsState3;
        LazyListState rememberLazyListStateWithoutSavedState;
        Object[] objArr;
        boolean changed;
        Object rememberedValue;
        LazyListState lazyListState;
        State state;
        State state2;
        State state3;
        Object[] objArr2;
        int i6;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean z;
        Object rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        Composer composer2;
        boolean changedInstance2;
        Object rememberedValue4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(715753430);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                i5 = i3;
                if ((i5 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NotificationsScreen$lambda$1$lambda$0;
                                    NotificationsScreen$lambda$1$lambda$0 = NotificationsScreenKt.NotificationsScreen$lambda$1$lambda$0((Event) obj);
                                    return NotificationsScreen$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        startRestartGroup.endReplaceGroup();
                        function13 = (Function1) rememberedValue5;
                    } else {
                        function13 = function12;
                    }
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(715753430, i5, -1, "org.betup.ui.fragment.notifications.compose.NotificationsScreen (NotificationsScreen.kt:66)");
                    }
                    collectAsState = SnapshotStateKt.collectAsState(controller.getNotifications(), null, startRestartGroup, 0, 1);
                    State collectAsState4 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                    collectAsState2 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
                    collectAsState3 = SnapshotStateKt.collectAsState(controller.getHasMore(), null, startRestartGroup, 0, 1);
                    State collectAsState5 = SnapshotStateKt.collectAsState(controller.isRefreshing(), null, startRestartGroup, 0, 1);
                    State collectAsState6 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
                    rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                    objArr = new Object[]{rememberLazyListStateWithoutSavedState, Boolean.valueOf(NotificationsScreen$lambda$5(collectAsState3)), Boolean.valueOf(NotificationsScreen$lambda$4(collectAsState2)), Integer.valueOf(NotificationsScreen$lambda$2(collectAsState).size())};
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed = startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changedInstance(controller);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        lazyListState = rememberLazyListStateWithoutSavedState;
                        state = collectAsState3;
                        state2 = collectAsState2;
                        state3 = collectAsState;
                        objArr2 = objArr;
                        i6 = 0;
                        rememberedValue = (Function2) new NotificationsScreenKt$NotificationsScreen$2$1(rememberLazyListStateWithoutSavedState, controller, collectAsState, state2, state, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        lazyListState = rememberLazyListStateWithoutSavedState;
                        state = collectAsState3;
                        state2 = collectAsState2;
                        state3 = collectAsState;
                        objArr2 = objArr;
                        i6 = 0;
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i6);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, i6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i6);
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
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                    String stringResource = StringResources_androidKt.stringResource(R.string.back, startRestartGroup, 6);
                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36));
                    startRestartGroup.startReplaceGroup(5004770);
                    z = (i5 & 112) == 32;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9;
                                NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9 = NotificationsScreenKt.NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9(Function0.this);
                                return NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue2, 7, null);
                    Modifier modifier5 = modifier4;
                    ImageKt.Image(painterResource, stringResource, m1059clickableXHw0xAI$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean NotificationsScreen$lambda$6 = NotificationsScreen$lambda$6(collectAsState5);
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(controller);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit NotificationsScreen$lambda$14$lambda$13$lambda$12;
                                NotificationsScreen$lambda$14$lambda$13$lambda$12 = NotificationsScreenKt.NotificationsScreen$lambda$14$lambda$13$lambda$12(NotificationsController.this);
                                return NotificationsScreen$lambda$14$lambda$13$lambda$12;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    SwipeRefreshContainerKt.SwipeRefreshContainer(fillMaxSize$default2, NotificationsScreen$lambda$6, (Function0) rememberedValue3, false, ComposableLambdaKt.rememberComposableLambda(48744093, true, new NotificationsScreenKt$NotificationsScreen$3$3(lazyListState, state3, controller, function13, state2, state, collectAsState4, collectAsState6), startRestartGroup, 54), startRestartGroup, 24582, 8);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Unit unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    composer2 = startRestartGroup;
                    changedInstance2 = composer2.changedInstance(controller);
                    rememberedValue4 = composer2.rememberedValue();
                    if (!changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function2) new NotificationsScreenKt$NotificationsScreen$4$1(controller, null);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function12 = function13;
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit NotificationsScreen$lambda$16;
                            NotificationsScreen$lambda$16 = NotificationsScreenKt.NotificationsScreen$lambda$16(NotificationsController.this, onBackClick, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return NotificationsScreen$lambda$16;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 1171) == 1170) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            collectAsState = SnapshotStateKt.collectAsState(controller.getNotifications(), null, startRestartGroup, 0, 1);
            State collectAsState42 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
            collectAsState2 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
            collectAsState3 = SnapshotStateKt.collectAsState(controller.getHasMore(), null, startRestartGroup, 0, 1);
            State collectAsState52 = SnapshotStateKt.collectAsState(controller.isRefreshing(), null, startRestartGroup, 0, 1);
            State collectAsState62 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
            rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            objArr = new Object[]{rememberLazyListStateWithoutSavedState, Boolean.valueOf(NotificationsScreen$lambda$5(collectAsState3)), Boolean.valueOf(NotificationsScreen$lambda$4(collectAsState2)), Integer.valueOf(NotificationsScreen$lambda$2(collectAsState).size())};
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changedInstance(controller);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changed) {
            }
            lazyListState = rememberLazyListStateWithoutSavedState;
            state = collectAsState3;
            state2 = collectAsState2;
            state3 = collectAsState;
            objArr2 = objArr;
            i6 = 0;
            rememberedValue = (Function2) new NotificationsScreenKt$NotificationsScreen$2$1(rememberLazyListStateWithoutSavedState, controller, collectAsState, state2, state, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i6);
            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, i6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i6);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.back, startRestartGroup, 6);
            Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36));
            startRestartGroup.startReplaceGroup(5004770);
            if ((i5 & 112) == 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9;
                    NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9 = NotificationsScreenKt.NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9(Function0.this);
                    return NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs2, false, null, null, (Function0) rememberedValue2, 7, null);
            Modifier modifier52 = modifier4;
            ImageKt.Image(painterResource2, stringResource2, m1059clickableXHw0xAI$default2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean NotificationsScreen$lambda$62 = NotificationsScreen$lambda$6(collectAsState52);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(controller);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit NotificationsScreen$lambda$14$lambda$13$lambda$12;
                    NotificationsScreen$lambda$14$lambda$13$lambda$12 = NotificationsScreenKt.NotificationsScreen$lambda$14$lambda$13$lambda$12(NotificationsController.this);
                    return NotificationsScreen$lambda$14$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            SwipeRefreshContainerKt.SwipeRefreshContainer(fillMaxSize$default22, NotificationsScreen$lambda$62, (Function0) rememberedValue3, false, ComposableLambdaKt.rememberComposableLambda(48744093, true, new NotificationsScreenKt$NotificationsScreen$3$3(lazyListState, state3, controller, function13, state2, state, collectAsState42, collectAsState62), startRestartGroup, 54), startRestartGroup, 24582, 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            composer2 = startRestartGroup;
            changedInstance2 = composer2.changedInstance(controller);
            rememberedValue4 = composer2.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue4 = (Function2) new NotificationsScreenKt$NotificationsScreen$4$1(controller, null);
            composer2.updateRememberedValue(rememberedValue4);
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            function12 = function13;
            modifier3 = modifier52;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        collectAsState = SnapshotStateKt.collectAsState(controller.getNotifications(), null, startRestartGroup, 0, 1);
        State collectAsState422 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
        collectAsState2 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
        collectAsState3 = SnapshotStateKt.collectAsState(controller.getHasMore(), null, startRestartGroup, 0, 1);
        State collectAsState522 = SnapshotStateKt.collectAsState(controller.isRefreshing(), null, startRestartGroup, 0, 1);
        State collectAsState622 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
        rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
        objArr = new Object[]{rememberLazyListStateWithoutSavedState, Boolean.valueOf(NotificationsScreen$lambda$5(collectAsState3)), Boolean.valueOf(NotificationsScreen$lambda$4(collectAsState2)), Integer.valueOf(NotificationsScreen$lambda$2(collectAsState).size())};
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changedInstance(controller);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changed) {
        }
        lazyListState = rememberLazyListStateWithoutSavedState;
        state = collectAsState3;
        state2 = collectAsState2;
        state3 = collectAsState;
        objArr2 = objArr;
        i6 = 0;
        rememberedValue = (Function2) new NotificationsScreenKt$NotificationsScreen$2$1(rememberLazyListStateWithoutSavedState, controller, collectAsState, state2, state, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i6);
        Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, i6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i6);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
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
        Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
        Arrangement.Horizontal start22 = Arrangement.INSTANCE.getStart();
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(start22, centerVertically22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
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
        Painter painterResource22 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
        String stringResource22 = StringResources_androidKt.stringResource(R.string.back, startRestartGroup, 6);
        Modifier m1563size3ABfNKs22 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36));
        startRestartGroup.startReplaceGroup(5004770);
        if ((i5 & 112) == 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9;
                NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9 = NotificationsScreenKt.NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9(Function0.this);
                return NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs22, false, null, null, (Function0) rememberedValue2, 7, null);
        Modifier modifier522 = modifier4;
        ImageKt.Image(painterResource22, stringResource22, m1059clickableXHw0xAI$default22, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        boolean NotificationsScreen$lambda$622 = NotificationsScreen$lambda$6(collectAsState522);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(controller);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit NotificationsScreen$lambda$14$lambda$13$lambda$12;
                NotificationsScreen$lambda$14$lambda$13$lambda$12 = NotificationsScreenKt.NotificationsScreen$lambda$14$lambda$13$lambda$12(NotificationsController.this);
                return NotificationsScreen$lambda$14$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        SwipeRefreshContainerKt.SwipeRefreshContainer(fillMaxSize$default222, NotificationsScreen$lambda$622, (Function0) rememberedValue3, false, ComposableLambdaKt.rememberComposableLambda(48744093, true, new NotificationsScreenKt$NotificationsScreen$3$3(lazyListState, state3, controller, function13, state2, state, collectAsState422, collectAsState622), startRestartGroup, 54), startRestartGroup, 24582, 8);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        composer2 = startRestartGroup;
        changedInstance2 = composer2.changedInstance(controller);
        rememberedValue4 = composer2.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue4 = (Function2) new NotificationsScreenKt$NotificationsScreen$4$1(controller, null);
        composer2.updateRememberedValue(rememberedValue4);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function13;
        modifier3 = modifier522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationsScreen$lambda$14$lambda$11$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationsScreen$lambda$14$lambda$13$lambda$12(NotificationsController notificationsController) {
        notificationsController.refresh();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NotificationItem(final Event event, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1424148364);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(event) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1424148364, i2, -1, "org.betup.ui.fragment.notifications.compose.NotificationItem (NotificationsScreen.kt:231)");
            }
            Map<String, String> paramsAsMap = event.getParamsAsMap();
            NotificationType type = event.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Intrinsics.checkNotNull(paramsAsMap);
            final String notificationImage = getNotificationImage(type, paramsAsMap);
            NotificationType type2 = event.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            final int notificationIconRes = getNotificationIconRes(type2, paramsAsMap);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit NotificationItem$lambda$18$lambda$17;
                        NotificationItem$lambda$18$lambda$17 = NotificationsScreenKt.NotificationItem$lambda$18$lambda$17(Function0.this);
                        return NotificationItem$lambda$18$lambda$17;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            CardKt.Card(ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8)), CardDefaults.INSTANCE.m2757cardColorsro_MJ88(ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2758cardElevationaqJV_2Y(Dp.m7774constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(783994086, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationItem$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer3, int i3) {
                    String str;
                    String str2;
                    Event event2;
                    float f;
                    int i4;
                    int i5;
                    Composer composer4;
                    int i6;
                    String formatTimestamp;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(783994086, i3, -1, "org.betup.ui.fragment.notifications.compose.NotificationItem.<anonymous> (NotificationsScreen.kt:246)");
                    }
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16));
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Event event3 = Event.this;
                    String str3 = notificationImage;
                    int i7 = notificationIconRes;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, composer3, 54);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1516padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f2 = 8;
                    Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(56)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1025backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (str3 != null) {
                        composer3.startReplaceGroup(-464724143);
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        event2 = event3;
                        i5 = 12;
                        f = f2;
                        i4 = 16;
                        SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(ImageRequests_androidKt.allowHardware(new ImageRequest.Builder((Context) consume).data(str3), false).build(), event3.getTitle(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), PainterResources_androidKt.painterResource(i7, composer3, 0), PainterResources_androidKt.painterResource(i7, composer3, 0), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 6, 31712);
                        composer3.endReplaceGroup();
                        composer4 = composer3;
                        i6 = 0;
                    } else {
                        str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        event2 = event3;
                        f = f2;
                        i4 = 16;
                        i5 = 12;
                        composer4 = composer3;
                        composer4.startReplaceGroup(-464125068);
                        i6 = 0;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i7, composer4, 0), event2.getTitle(), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                        composer3.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, i6);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i6);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, weight$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String title = event2.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    TextKt.m3621Text4IGK_g(title, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(i4), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    float f3 = 4;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                    String body = event2.getBody();
                    if (body == null) {
                        body = "";
                    }
                    TextKt.m3621Text4IGK_g(body, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 3072, 57342);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                    formatTimestamp = NotificationsScreenKt.formatTimestamp(event2.getGotTimestamp(), composer3, 0);
                    TextKt.m3621Text4IGK_g(formatTimestamp, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(i5), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.startReplaceGroup(-1599327068);
                    if (event2.isNew()) {
                        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null, 2, null), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NotificationItem$lambda$19;
                    NotificationItem$lambda$19 = NotificationsScreenKt.NotificationItem$lambda$19(Event.this, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NotificationItem$lambda$19;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationItem$lambda$18$lambda$17(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final String getNotificationImage(NotificationType notificationType, Map<String, String> map) {
        switch (WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()]) {
            case 1:
                String str = map.get(UnifiedMediationParams.KEY_ICON_URL);
                if (str != null) {
                    return str;
                }
                String str2 = map.get("photoUrl");
                return str2 == null ? map.get("img") : str2;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                String str3 = map.get("img");
                if (str3 != null) {
                    return str3;
                }
                String str4 = map.get("photoUrl");
                return str4 == null ? map.get(UnifiedMediationParams.KEY_ICON_URL) : str4;
            case 8:
            case 9:
            case 10:
                String str5 = map.get("img");
                return str5 == null ? map.get("photoUrl") : str5;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r6.equals("LOST") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        r3 = org.betup.R.drawable.lost_gold;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r6.equals("WON") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        if (r6.equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        if (r6.equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c1, code lost:
    
        if (r6 != null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int getNotificationIconRes(NotificationType notificationType, Map<String, String> map) {
        BetState fromString;
        int i = WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()];
        int i2 = R.drawable.ic_gift;
        int i3 = R.drawable.won_gold;
        switch (i) {
            case 1:
                return R.drawable.cup_gold;
            case 2:
                String str = map.get("betState");
                if (str == null) {
                    str = map.get("state");
                }
                if (str != null) {
                    try {
                        fromString = BetState.fromInt(Integer.parseInt(str));
                        break;
                    } catch (Exception unused) {
                        fromString = BetState.fromString(str);
                        break;
                    }
                }
                fromString = BetState.ALL;
                int i4 = WhenMappings.$EnumSwitchMapping$1[fromString.ordinal()];
                i2 = R.drawable.bets_all;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            return R.drawable.return_gold;
                        }
                        if (i4 != 4) {
                            if (i4 == 5) {
                                return R.drawable.in_play_gold;
                            }
                        }
                        return i3;
                    }
                    return R.drawable.lost_gold;
                }
                return i2;
            case 3:
                String str2 = map.get("state");
                if (str2 != null) {
                    try {
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt != 4) {
                            if (parseInt != 8) {
                                if (parseInt == 32) {
                                    return R.drawable.return_gold;
                                }
                            }
                            return R.drawable.lost_gold;
                        }
                    } catch (Exception unused2) {
                        int hashCode = str2.hashCode();
                        if (hashCode == 50) {
                            break;
                        } else if (hashCode == 51) {
                            break;
                        } else if (hashCode == 86134) {
                            break;
                        } else if (hashCode == 2342692) {
                            break;
                        }
                        i3 = R.drawable.ic_clock;
                    }
                    return i3;
                }
                return R.drawable.ic_clock;
            case 4:
            case 5:
            case 6:
            case 7:
                String str3 = map.get("state");
                ChallengeState challengeState = null;
                if (str3 != null) {
                    try {
                        challengeState = ChallengeState.INSTANCE.fromInt(Integer.parseInt(str3));
                    } catch (Exception unused3) {
                    }
                }
                return challengeState != null ? UiExtensionsKt.getIcon(challengeState) : R.drawable.battles_icon_new_selected;
            case 8:
            case 9:
            case 10:
                return R.drawable.ic_sport;
            case 11:
            case 12:
                return i2;
            default:
                return R.drawable.notification_new_icon;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatTimestamp(long j, Composer composer, int i) {
        String format;
        composer.startReplaceGroup(2134076664);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2134076664, i, -1, "org.betup.ui.fragment.notifications.compose.formatTimestamp (NotificationsScreen.kt:440)");
        }
        Date date = new Date(j);
        long time = new Date().getTime() - date.getTime();
        if (time < 60000) {
            composer.startReplaceGroup(-2146686882);
            format = StringResources_androidKt.stringResource(R.string.time_just_now, composer, 6);
            composer.endReplaceGroup();
        } else if (time < 3600000) {
            composer.startReplaceGroup(-2146684775);
            format = StringResources_androidKt.stringResource(R.string.time_minutes_ago, new Object[]{Integer.valueOf((int) (time / 60000))}, composer, 6);
            composer.endReplaceGroup();
        } else if (time < CalendarModelKt.MillisecondsIn24Hours) {
            composer.startReplaceGroup(-2146681799);
            format = StringResources_androidKt.stringResource(R.string.time_hours_ago, new Object[]{Integer.valueOf((int) (time / 3600000))}, composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2146677308);
            composer.endReplaceGroup();
            format = new SimpleDateFormat("dd MMM yyyy, HH:mm", Locale.getDefault()).format(date);
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Event> NotificationsScreen$lambda$2(State<? extends List<? extends Event>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NotificationsScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NotificationsScreen$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NotificationsScreen$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean NotificationsScreen$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String NotificationsScreen$lambda$7(State<String> state) {
        return state.getValue();
    }
}
