package org.betup.ui.fragment.support.compose;

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
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.MessagingComponentsKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: SupportTicketDetailScreen.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"SupportTicketDetailContent", "", "state", "Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;", "onRefresh", "Lkotlin/Function1;", "", "onLoadMore", "onSendMessage", "Lkotlin/Function2;", "onCloseTicket", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportTicketDetailScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$0(SupportTicketDetailState supportTicketDetailState, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SupportTicketDetailContent(supportTicketDetailState, function1, function12, function2, function13, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$21(SupportTicketDetailState supportTicketDetailState, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SupportTicketDetailContent(supportTicketDetailState, function1, function12, function2, function13, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SupportTicketDetailContent(final SupportTicketDetailState state, final Function1<? super String, Unit> onRefresh, final Function1<? super String, Unit> onLoadMore, final Function2<? super String, ? super String, Unit> onSendMessage, final Function1<? super String, Unit> onCloseTicket, final Function0<Unit> onBack, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Modifier modifier2;
        final String chatId;
        String stringResource;
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        Intrinsics.checkNotNullParameter(onCloseTicket, "onCloseTicket");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer startRestartGroup = composer.startRestartGroup(-737458607);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onRefresh) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onLoadMore) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onSendMessage) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onCloseTicket) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i) == 0) {
                i4 = startRestartGroup.changedInstance(onBack) ? 131072 : 65536;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
                if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-737458607, i3, -1, "org.betup.ui.fragment.support.compose.SupportTicketDetailContent (SupportTicketDetailScreen.kt:53)");
                    }
                    chatId = state.getChatId();
                    if (chatId == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier4;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SupportTicketDetailContent$lambda$0;
                                    SupportTicketDetailContent$lambda$0 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$0(SupportTicketDetailState.this, onRefresh, onLoadMore, onSendMessage, onCloseTicket, onBack, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return SupportTicketDetailContent$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context = (Context) consume;
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i6 = i3 & 112;
                    boolean changed = ((i3 & 14) == 4) | (i6 == 32) | startRestartGroup.changed(chatId);
                    SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1(state, onRefresh, chatId, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(chatId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    Modifier modifier6 = modifier4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    float f = 16;
                    float f2 = 12;
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundMessageInputBar.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = (458752 & i3) == 131072;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit SupportTicketDetailContent$lambda$20$lambda$4$lambda$3$lambda$2;
                                SupportTicketDetailContent$lambda$20$lambda$4$lambda$3$lambda$2 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$20$lambda$4$lambda$3$lambda$2(Function0.this);
                                return SupportTicketDetailContent$lambda$20$lambda$4$lambda$3$lambda$2;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    ImageKt.Image(painterResource, (String) null, PaddingKt.m1520paddingqDBjuR0$default(ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue2, 7, null), 0.0f, 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                    float f3 = 8;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.support_new_img_inside, startRestartGroup, 6), (String) null, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), 0.0f, 0.0f, Dp.m7774constructorimpl(f3), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                    TextKt.m3621Text4IGK_g(state.getTicketTitle(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131024);
                    if (state.isActive()) {
                        startRestartGroup.startReplaceGroup(1873526237);
                        stringResource = StringResources_androidKt.stringResource(R.string.ticket_status_active, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1873621469);
                        stringResource = StringResources_androidKt.stringResource(R.string.ticket_status_closed, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (state.isActive()) {
                        j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                    } else {
                        j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                    }
                    TextKt.m3621Text4IGK_g(stringResource, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), j, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 131024);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(-1263348659);
                    if (state.isActive()) {
                        SpacerKt.Spacer(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(2)), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null, 2, null), startRestartGroup, 0);
                        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.BackgroundMessageInputBar.INSTANCE.getColor(), null, 2, null), 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        String stringResource2 = StringResources_androidKt.stringResource(R.string.close_ticket, startRestartGroup, 6);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        boolean changed2 = ((57344 & i3) == 16384) | startRestartGroup.changed(chatId);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit SupportTicketDetailContent$lambda$20$lambda$7$lambda$6$lambda$5;
                                    SupportTicketDetailContent$lambda$20$lambda$7$lambda$6$lambda$5 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$20$lambda$7$lambda$6$lambda$5(Function1.this, chatId);
                                    return SupportTicketDetailContent$lambda$20$lambda$7$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        TextKt.m3621Text4IGK_g(stringResource2, ClickableKt.m1059clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue3, 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(16), new FontWeight(450), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    } else {
                        str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    String str6 = str;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str6);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN43);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    String str7 = str2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str7);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (state.isLoading() && state.getMessages().isEmpty()) {
                        startRestartGroup.startReplaceGroup(108812391);
                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str6);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str7);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor5);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        str3 = str7;
                        ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        str4 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        str5 = str6;
                    } else {
                        str3 = str7;
                        if (state.getErrorMessage() != null && state.getMessages().isEmpty() && !state.isLoading()) {
                            startRestartGroup.startReplaceGroup(109170751);
                            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str6);
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor6);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str6);
                            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor7);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                            }
                            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            String errorMessage = state.getErrorMessage();
                            if (errorMessage == null) {
                                errorMessage = context.getString(R.string.error);
                                Intrinsics.checkNotNullExpressionValue(errorMessage, "getString(...)");
                            }
                            str4 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                            TextKt.m3621Text4IGK_g(errorMessage, (Modifier) null, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 0, 130546);
                            String stringResource3 = StringResources_androidKt.stringResource(R.string.retry, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changed3 = (i6 == 32) | startRestartGroup.changed(chatId);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit SupportTicketDetailContent$lambda$20$lambda$16$lambda$12$lambda$11$lambda$10$lambda$9;
                                        SupportTicketDetailContent$lambda$20$lambda$16$lambda$12$lambda$11$lambda$10$lambda$9 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$20$lambda$16$lambda$12$lambda$11$lambda$10$lambda$9(Function1.this, chatId);
                                        return SupportTicketDetailContent$lambda$20$lambda$16$lambda$12$lambda$11$lambda$10$lambda$9;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceGroup();
                            CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource3, true, false, false, (Function0) rememberedValue4, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 3120, 0, 0, 2097073);
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
                            startRestartGroup.endReplaceGroup();
                            str5 = str6;
                        } else {
                            str4 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                            if (state.getMessages().isEmpty() && !state.isLoading()) {
                                startRestartGroup.startReplaceGroup(110315457);
                                Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment center3 = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str6);
                                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default4);
                                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor8);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                    m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                    m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                }
                                Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                str5 = str6;
                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_messages_yet, startRestartGroup, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 0, 131058);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                str5 = str6;
                                startRestartGroup.startReplaceGroup(110771746);
                                boolean isLoading = state.isLoading();
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changed4 = (i6 == 32) | startRestartGroup.changed(chatId);
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit SupportTicketDetailContent$lambda$20$lambda$16$lambda$15$lambda$14;
                                            SupportTicketDetailContent$lambda$20$lambda$16$lambda$15$lambda$14 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$20$lambda$16$lambda$15$lambda$14(Function1.this, chatId);
                                            return SupportTicketDetailContent$lambda$20$lambda$16$lambda$15$lambda$14;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                startRestartGroup.endReplaceGroup();
                                z = true;
                                SwipeRefreshContainerKt.SwipeRefreshContainer(null, isLoading, (Function0) rememberedValue5, false, ComposableLambdaKt.rememberComposableLambda(306482911, true, new SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5(state, onLoadMore, chatId), startRestartGroup, 54), startRestartGroup, 24576, 9);
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.startReplaceGroup(-1263194549);
                                if (state.isActive()) {
                                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, startRestartGroup, 6)), WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, startRestartGroup, 6));
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, str4);
                                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str5);
                                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
                                    Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor9);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m4610constructorimpl9 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl9, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                        m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                        m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    boolean changed5 = startRestartGroup.changed(chatId) | ((i3 & 7168) == 2048 ? z : false);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (changed5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit SupportTicketDetailContent$lambda$20$lambda$19$lambda$18$lambda$17;
                                                SupportTicketDetailContent$lambda$20$lambda$19$lambda$18$lambda$17 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$20$lambda$19$lambda$18$lambda$17(Function2.this, chatId, (String) obj);
                                                return SupportTicketDetailContent$lambda$20$lambda$19$lambda$18$lambda$17;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    MessagingComponentsKt.MessageInputBar(null, (Function1) rememberedValue6, !state.isSending(), null, startRestartGroup, 0, 9);
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
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier6;
                            }
                        }
                    }
                    z = true;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(-1263194549);
                    if (state.isActive()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SupportTicketDetailContent$lambda$21;
                            SupportTicketDetailContent$lambda$21 = SupportTicketDetailScreenKt.SupportTicketDetailContent$lambda$21(SupportTicketDetailState.this, onRefresh, onLoadMore, onSendMessage, onCloseTicket, onBack, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SupportTicketDetailContent$lambda$21;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            chatId = state.getChatId();
            if (chatId == null) {
            }
        }
        i3 |= i4;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        chatId = state.getChatId();
        if (chatId == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$20$lambda$4$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$20$lambda$7$lambda$6$lambda$5(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$20$lambda$16$lambda$12$lambda$11$lambda$10$lambda$9(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$20$lambda$16$lambda$15$lambda$14(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTicketDetailContent$lambda$20$lambda$19$lambda$18$lambda$17(Function2 function2, String str, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        function2.invoke(str, message);
        return Unit.INSTANCE;
    }
}
